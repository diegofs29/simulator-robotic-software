from email.policy import default
import re
from .ast import *
from .ast_visitor import ASTVisitor
from ..console.console import Error


class Semantic:

    def execute(self, ast):
        decl = DeclarationAnalyzer()
        decl.visit_program(ast, None)
        self.errors = decl.errors
        semt = SemanticAnalyzer(
            decl.globals, decl.locals, decl.functions)
        semt.visit_program(ast, None)
        self.errors.extend(semt.errors)


class DeclarationAnalyzer(ASTVisitor):

    def __init__(self):
        self.errors = []
        self.globals = {}
        self.locals = {}
        self.functions = {}

    def visit_program(self, program: ProgramNode, param):
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        if not "setup" in self.functions:
            self.add_error("Declaración", program, "No hay función setup")
        if not "loop" in self.functions:
            self.add_error("Declaración", program, "No hay función loop")
        return None

    def visit_function(self, function: FunctionNode, param):
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        if function.sentences != None:
            for sent in function.sentences:
                sent.set_function(function)
                sent.accept(self, param)
        if not function.name in self.functions:
            self.functions[function.name] = function
        else:
            self.add_error("Declaración", function,
                           "La función ya ha sido declarada")
        return None

    def visit_declaration(self, declaration: DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.accept(self, param)
        dec = self.__lookfor_var(declaration.var_name, declaration.function)
        if dec != None:
            self.add_error("Declaración", declaration,
                           "La variable ya ha sido declarada")
        else:
            self.add_declaration(declaration.function,
                                 declaration.var_name, declaration)
        return None

    def visit_array_declaration(self, array_declaration: ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        dec = self.__lookfor_var(
            array_declaration.var_name, array_declaration.function)
        if dec != None:
            self.add_error("Declaración", array_declaration,
                           "El array ya ha sido declarado")
        elif len(array_declaration.size) < 1:
            self.add_error("Tamaños", array_declaration,
                           "No se ha introducido el tamaño del array")
        else:
            self.add_declaration(array_declaration.function,
                                 array_declaration.var_name, array_declaration)
        return None

    def visit_define_macro(self, define_macro: DefineMacroNode, param):
        if define_macro.expr != None:
            define_macro.expr.accept(self, param)
        dec = self.__lookfor_var(
            define_macro.macro_name, define_macro.function)
        if dec != None:
            self.add_error("Declaración", define_macro,
                           "La macro ya ha sido declarada")
        else:
            self.add_declaration(define_macro.function,
                                 define_macro.macro_name, define_macro)
        return None

    def add_error(self, e_type, element, message):
        self.errors.append(
            Error(e_type, element.line, element.position, message))

    def add_declaration(self, function, name, decl):
        if function != None:
            if function.name in self.locals:
                self.locals[function.name][name] = decl
            else:
                self.locals[function.name] = {name: decl}
        else:
            self.globals[name] = decl

    def __lookfor_var(self, name, function):
        if function != None:
            if function.name in self.locals:
                if name in self.locals[function.name]:
                    return self.locals[function.name][name]
        else:
            if name in self.globals:
                return self.globals[name]
        return None


class SemanticAnalyzer(ASTVisitor):

    def __init__(self, globals, locals, functions):
        self.errors = []
        self.globals = globals
        self.locals = locals
        self.functions = functions
        self.numerical_types = [IntTypeNode, FloatTypeNode,
                                DoubleTypeNode, ByteTypeNode,
                                ShortTypeNode, LongTypeNode,
                                CharTypeNode, BooleanTypeNode,
                                Size_tTypeNode, WordTypeNode]
        self.integer_types = [IntTypeNode, ByteTypeNode,
                              ShortTypeNode, LongTypeNode,
                              CharTypeNode, BooleanTypeNode,
                              Size_tTypeNode, WordTypeNode]

    def visit_program(self, program: ProgramNode, param):
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        if "setup" in self.functions:
            setup = self.functions["setup"]
            if self.check_type(setup.type, VoidTypeNode):
                self.add_error("Tipo de función setup", program,
                               "La función setup debe ser de tipo void")
        if "loop" in self.functions:
            setup = self.functions["loop"]
            if self.check_type(setup.type, VoidTypeNode):
                self.add_error("Tipo de función loop", program,
                               "La función loop debe ser de tipo void")
        return None

    def visit_int(self, int_node: IntNode, param):
        int_node.set_type(IntTypeNode())
        int_node.set_modifiable(False)
        return None

    def visit_float(self, float_node: FloatNode, param):
        float_node.set_type(FloatTypeNode())
        float_node.set_modifiable(False)
        return None

    def visit_hex(self, hex_node: HexNode, param):
        hex_node.set_type(IntTypeNode())
        hex_node.set_modifiable(False)
        return None

    def visit_octal(self, oct_node: OctalNode, param):
        oct_node.set_type(IntTypeNode())
        oct_node.set_modifiable(False)
        return None

    def visit_binary(self, binary_node: BinaryNode, param):
        binary_node.set_type(IntTypeNode())
        binary_node.set_modifiable(False)
        return None

    def visit_char(self, char_node: CharNode, param):
        char_node.set_type(CharTypeNode())
        char_node.set_modifiable(False)
        return None

    def visit_string(self, string_node: StringNode, param):
        string_node.set_type(StringTypeNode())
        string_node.set_modifiable(False)
        return None

    def visit_boolean(self, boolean_node: BooleanNode, param):
        boolean_node.set_type(BooleanTypeNode())
        boolean_node.set_modifiable(False)
        return None

    def visit_id(self, id_node: IDNode, param):
        definition = self.__get_declaration(id_node)
        id_node.set_definition(definition)
        if definition != None:
            id_node.set_type(id_node.definition.type)
        else:
            self.add_error("Declaración", id_node,
                           "La variable no está declarada")
            id_node.set_type(None)
        id_node.set_modifiable(True)
        return None

    def visit_function(self, function: FunctionNode, param):
        has_returned = False
        if function.type != None:
            function.type.accept(self, param)
        if function.args != None:
            for arg in function.args:
                arg.accept(self, param)
        if function.sentences != None:
            for sent in function.sentences:
                if has_returned:
                    self.add_error("Mal uso de identificador", sent,
                                   "La sentencia return debe de estar al final de la función")
                sent.set_function(function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe ser usado dentro de un bucle")
                if isinstance(sent, BreakNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe ser usado dentro de un bucle o en case switch")
                if isinstance(sent, ReturnNode):
                    has_returned = True
        if not function.name in self.functions:
            self.functions[function.name] = function
        return None

    def visit_declaration(self, declaration: DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.set_function(declaration.function)
            declaration.expr.accept(self, param)
            if self.check_type(declaration.type, type(declaration.expr.type)):
                self.manage_types(declaration.type,
                                  declaration.expr.type, declaration, "El tipo de la variable")
        # Modifiability not checked, it should be always modifiable
        return None

    def visit_array_declaration(self, array_declaration: ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        if array_declaration.elements != None and array_declaration.elements != []:
            if self.check_type(array_declaration.type, array_declaration.elements):
                self.manage_types(array_declaration.type,
                                  array_declaration.elements, array_declaration, "El tipo del array")
        # Modifiablity not checked, it should always be modifiable
        return None

    def visit_while(self, while_p: WhileNode, param):
        if while_p.expression != None:
            while_p.expression.set_function(while_p.function)
            while_p.expression.accept(self, param)
        if while_p.sentences != None:
            for sent in while_p.sentences:
                sent.set_is_loop_sent(True)
                sent.set_function(while_p.function)
                sent.accept(self, param)
        if self.check_in_types(while_p.expression.type, self.integer_types):
            self.add_error(
                "Tipos", while_p, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_do_while(self, do_while: DoWhileNode, param):
        if do_while.expression != None:
            do_while.expression.set_function(do_while.function)
            do_while.expression.accept(self, param)
        for sent in do_while.sentences:
            sent.set_is_loop_sent(True)
            sent.set_function(do_while.function)
            sent.accept(self, param)
        if self.check_in_types(do_while.expression.type, self.integer_types):
            self.add_error(
                "Tipos", do_while, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_for(self, for_p: ForNode, param):
        if for_p.assignment != None:
            for_p.assignment.set_function(for_p.function)
            for_p.assignment.accept(self, param)
        if for_p.condition != None:
            for_p.condition.set_function(for_p.function)
            for_p.condition.accept(self, param)
        if for_p.expression != None:
            for_p.expression.set_function(for_p.function)
            for_p.expression.accept(self, param)
        if for_p.sentences != None:
            for sent in for_p.sentences:
                sent.set_is_loop_sent(True)
                sent.set_function(for_p.function)
                sent.accept(self, param)
        if self.check_in_types(for_p.assignment.type, self.integer_types):
            self.add_error(
                "Tipos", for_p, "La variable del for debe ser int (en Arduino realmente no)")
        if self.check_in_types(for_p.condition.type, self.integer_types):
            self.add_error(
                "Tipos", for_p, "El resultado de la condición debe ser int o boolean")
        if self.check_in_types(for_p.expression.type, self.integer_types):
            self.add_error(
                "Tipos", for_p, "El incremento del for debe ser int")
        return None

    def visit_conditional_sentence(self, conditional_sentence: ConditionalSentenceNode, param):
        if conditional_sentence.condition != None:
            conditional_sentence.condition.set_function(
                conditional_sentence.function)
            conditional_sentence.condition.accept(self, param)
        if conditional_sentence.if_expr != None:
            for sent in conditional_sentence.if_expr:
                sent.set_function(conditional_sentence.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode) and not conditional_sentence.is_loop_sent:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe usarse en bucles")
                if isinstance(sent, BreakNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe usarse en bucles o en case switch")
        if conditional_sentence.else_expr != None:
            for sent in conditional_sentence.else_expr:
                sent.set_function(conditional_sentence.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode) and not conditional_sentence.is_loop_sent:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe usarse en bucles")
                if isinstance(sent, BreakNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe usarse en bucles o en case switch")
        if self.check_in_types(conditional_sentence.condition.type, self.integer_types):
            self.add_error(
                "Tipos", conditional_sentence, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_switch_sentence(self, switch_sentence: SwitchSentenceNode, param):
        if switch_sentence.expression != None:
            switch_sentence.expression.set_function(switch_sentence.function)
            switch_sentence.expression.accept(self, param)
        if switch_sentence.cases != None:
            for case_block in switch_sentence.cases:
                case_block.set_function(switch_sentence.function)
                case_block.accept(self, param)
                for sent in case_block.sentences:
                    if isinstance(sent, ContinueNode) and not switch_sentence.is_loop_sent:
                        self.add_error("Mal uso de identificador", sent,
                                       "Continue debe usarse en bucles")
                if case_block.type != "default":
                    definition = self.__get_declaration(
                        switch_sentence.expression)
                    if self.check_type(definition.type, type(case_block.expression.type)):
                        self.add_error(
                            "Tipos", case_block, "La sentencia case debe de tener una expresión del tipo marcado en switch")
        return None

    def visit_assignment(self, assignment: AssignmentNode, param):
        if assignment.var != None:
            assignment.var.set_function(assignment.function)
            assignment.var.accept(self, param)
        if assignment.expr != None:
            assignment.expr.set_function(assignment.function)
            assignment.expr.accept(self, param)
        if self.variable_defined(assignment.var.value, assignment.function):
            if self.check_modifiable(assignment.var):
                self.add_error("No modificable", assignment,
                                "La variable no se puede modificar. Puede que sea una constante")
            elif self.check_type(assignment.var.type, type(assignment.expr.type)):
                self.manage_types(assignment.var.type,
                                    assignment.expr.type, assignment, "El tipo de la variable")
        return None

    def visit_return(self, return_p: ReturnNode, param):
        if return_p.expression != None:
            return_p.expression.set_function(return_p.function)
            return_p.expression.accept(self, param)
        if return_p.expression != None and isinstance(return_p.function.type, VoidTypeNode):
            self.add_error("Tipos", return_p,
                           "Las funciones de tipo void no deben retornar valor")
        elif return_p.expression == None and not isinstance(return_p.function.type, VoidTypeNode):
            self.add_error("Tipos", return_p,
                           "Las funciones de tipo no void deben retornar valor")
        elif self.check_type(return_p.function.type, type(return_p.expression.type)):
            self.manage_types(
                return_p.function.type, return_p.expression.type, return_p, "El tipo de retorno")
        return None

    def visit_function_call(self, function_call: FunctionCallNode, param):
        definition = None
        if function_call.name.value in self.functions:
            definition = self.functions[function_call.name.value]
        else:
            self.add_error("Declaración", function_call,
                           "La función no se ha declarado")
        if definition != None:
            if function_call.parameters != None:
                if len(function_call.parameters) == len(definition.args):
                    for i in range(0, len(function_call.parameters)):
                        function_call.parameters[i].accept(self, param)
                        if self.check_type(function_call.parameters[i].type, type(definition.args[i].type)):
                            self.manage_types(
                                function_call.parameters[i].type, definition.args[i].type, function_call, "El tipo del parámetro")
            else:
                self.add_error("Parámetros", function_call,
                               "El número de parámetros no coincide con los de la definición")
        return None

    def visit_inc_dec_expression(self, inc_dec_expression: IncDecExpressionNode, param):
        if inc_dec_expression.var != None:
            inc_dec_expression.var.set_function(inc_dec_expression.function)
            inc_dec_expression.var.accept(self, param)
        inc_dec_expression.set_type(inc_dec_expression.var.type)
        if self.variable_defined(inc_dec_expression.var.value, inc_dec_expression.function):
            if self.check_in_types(inc_dec_expression.var.type, self.numerical_types):
                self.add_error("Tipos", inc_dec_expression,
                            "La expresión no es de tipo numérico")
        return None

    def visit_array_access(self, array_access: ArrayAccessNode, param):
        if array_access.indexes != None:
            for i in array_access.indexes:
                i.accept(self, param)
        definition = None
        array_access.set_modifiable(True)
        if not isinstance(array_access.value, ArrayAccessNode):
            if array_access.value in self.globals:
                definition = self.globals[array_access.value]
            elif array_access.function.name in self.locals:
                if array_access.value in self.locals[array_access.function.name]:
                    definition = self.locals[array_access.function.name][array_access.value]
        if definition != None:
            array_access.set_type(definition.type)
            if len(definition.size) == len(array_access.indexes):
                for i in range(0, len(array_access.indexes)):
                    if self.check_in_types(array_access.indexes[i].type, self.integer_types) and self.check_type(array_access.indexes[i].type, IDTypeNode):
                        self.add_error("Índice", array_access.indexes[i], "El tipo del índice debe ser int (o cualquiera que sea compatible)")
                    elif array_access.indexes[i].value >= definition.size[i]:
                        self.add_error("Tamaños", array_access.indexes[i], "El índice sobrepasa el tamaño del array")
        else:
            self.add_error("Declaración", array_access, "El array no está declarado")
        return None

    def visit_not_expression(self, not_expression: NotExpressionNode, param):
        if not_expression.expression != None:
            not_expression.expression.set_function(not_expression.function)
            not_expression.expression.accept(self, param)
        not_expression.set_type(BooleanTypeNode())
        if self.check_type(not_expression.expression.type, BooleanTypeNode) or self.check_in_types(not_expression.expression.type, self.numerical_types):
            self.add_error("Tipos", not_expression,
                           "La expresión debe ser tipo int o boolean")
        not_expression.set_type(not_expression.expression.type)
        return None

    def visit_bit_not_expression(self, bit_not_expression: BitNotExpressionNode, param):
        if bit_not_expression.expression != None:
            bit_not_expression.expression.set_function(bit_not_expression.function)
            bit_not_expression.expression.accept(self, param)
        bit_not_expression.set_type(IntTypeNode())
        if self.check_in_types(bit_not_expression.expression.type, self.integer_types):
            self.add_error("Tipos", bit_not_expression,
                           "La expresión debe ser tipo int")
        bit_not_expression.set_type(bit_not_expression.expression.type)
        return None

    def visit_arithmetic_expression(self, arithmetic_expression: ArithmeticExpressionNode, param):
        if arithmetic_expression.left != None:
            arithmetic_expression.left.set_function(arithmetic_expression.function)
            arithmetic_expression.left.accept(self, param)
        if arithmetic_expression.right != None:
            arithmetic_expression.right.set_function(arithmetic_expression.function)
            arithmetic_expression.right.accept(self, param)
        if self.check_in_types(arithmetic_expression.left.type, self.numerical_types) and self.check_in_types(arithmetic_expression.right.type, self.numerical_types):
            self.add_error("Tipos", arithmetic_expression,
                           "Las operaciones artiméticas deben ser entre números")
        arithmetic_expression.set_type(arithmetic_expression.left.type)
        return None

    def visit_comparision_expression(self, comparison_expression: ComparisonExpressionNode, param):
        if comparison_expression.left != None:
            comparison_expression.left.set_function(comparison_expression.function)
            comparison_expression.left.accept(self, param)
        if comparison_expression.right != None:
            comparison_expression.right.set_function(comparison_expression.function)
            comparison_expression.right.accept(self, param)
        if self.check_type(comparison_expression.left.type, type(comparison_expression.right.type)):
            if self.check_in_types(comparison_expression.left.type, self.numerical_types) and self.check_in_types(comparison_expression.right.type, self.numerical_types):
                self.add_error("Tipos", comparison_expression,
                               "Los tipos de ambas expresiones deben coincidir o ser interoperables")
        comparison_expression.set_type(BooleanTypeNode())
        return None

    def visit_boolean_expression(self, boolean_expression: BooleanExpressionNode, param):
        if boolean_expression.left != None:
            boolean_expression.left.set_function(boolean_expression.function)
            boolean_expression.left.accept(self, param)
        if boolean_expression.right != None:
            boolean_expression.right.set_function(boolean_expression.function)
            boolean_expression.right.accept(self, param)
        if self.check_in_types(boolean_expression.left.type, self.integer_types):
            self.add_error("Tipos", boolean_expression,
                           "La expresión izquierda debe ser int o boolean")
        if self.check_in_types(boolean_expression.right.type, self.integer_types):
            self.add_error("Tipos", boolean_expression,
                           "La expresión derecha debe ser int o boolean")
        boolean_expression.set_type(BooleanTypeNode())
        return None

    def visit_bitwise_expression(self, bitwise_expression: BitwiseExpressionNode, param):
        if bitwise_expression.left != None:
            bitwise_expression.left.set_function(bitwise_expression.function)
            bitwise_expression.left.accept(self, param)
        if bitwise_expression.right != None:
            bitwise_expression.right.set_function(bitwise_expression.function)
            bitwise_expression.right.accept(self, param)
        if self.check_in_types(bitwise_expression.left.type, self.integer_types):
            self.add_error("Tipos", bitwise_expression,
                           "El tipo de la izquierda debe ser numérico")
        if self.check_in_types(bitwise_expression.right.type, self.integer_types):
            self.add_error("Tipos", bitwise_expression,
                           "El tipo de la derecha debe ser numérico")
        bitwise_expression.set_type(bitwise_expression.left.type)
        return None

    def visit_compound_assigment(self, compound_asigment: CompoundAssignmentNode, param):
        if compound_asigment.left != None:
            compound_asigment.left.set_function(compound_asigment.function)
            compound_asigment.left.accept(self, param)
        if compound_asigment.right != None:
            compound_asigment.right.set_function(compound_asigment.function)
            compound_asigment.right.accept(self, param)
        compound_asigment.set_type(compound_asigment.left.type)
        if self.variable_defined(compound_asigment.left.value, compound_asigment.function):
            if self.check_type(compound_asigment.left.type, type(compound_asigment.right.type)):
                self.manage_types(compound_asigment.left.type, compound_asigment.right.type,
                                compound_asigment, "El tipo de la variable")
        return None

    def manage_types(self, type_1, type_2, node, encabezado):
        if type(type_1) is CharTypeNode:
            if self.check_in_types(type_2, self.integer_types):
                self.add_error(
                    "Tipos", node, encabezado + " es char, pero su valor no es char o int")
        elif type(type_1) in self.numerical_types:
            if self.check_in_types(type_2, self.numerical_types):
                self.add_error(
                    "Tipos", node, encabezado + " es numérico, pero su valor no")
        else:
            self.add_error("Tipos", node,
                           encabezado + " y del valor no coincide")

    def check_type(self, type_to_check, type_class_to_compare):
        list_types = self.__look_for_elements(type_to_check)
        if list_types != None:
            return self.__check_elements(type_class_to_compare, list_types)
        list_types = self.__look_for_elements(type_class_to_compare)
        if list_types != None:
            return self.__check_elements(type_to_check, list_types)
        if type(type_to_check) in self.numerical_types:
            return not type_class_to_compare in self.numerical_types
        return not type(type_to_check) is type_class_to_compare

    def check_in_types(self, var, types):
        if isinstance(var, list):
            return self.__check_elements_in_types(var, types)
        return not type(var) in types

    def check_modifiable(self, element):
        return not element.modifiable

    def add_error(self, e_type, element, message):
        self.errors.append(
            Error(e_type, element.line, element.position, message))

    def is_global(self, elem):
        try:
            return elem.function != None
        except AttributeError:
            return True

    def variable_defined(self, name, function):
        if name in self.globals:
            return True
        if function != None:
            if function.name in self.locals:
                return name in self.locals[function.name]

    def __get_declaration(self, node):
        definition = None
        try:
            if node.value in self.globals:
                definition = self.globals[node.value]
            elif node.function.name in self.locals:
                if node.value in self.locals[node.function.name]:
                    definition = self.locals[node.function.name][node.value]
        finally:
            return definition

    def __check_elements(self, type_to_compare, types):
        if len(types) > 1:
            return True
        if type(type_to_compare) in self.numerical_types:
            return not types[0] in self.numerical_types
        return not type(type_to_compare) is types[0]

    def __look_for_elements(self, types):
        if isinstance(types, list):
            list_types = self.__list_types(types)
            return list_types
        return None

    def __list_types(self, elems):
        types = []
        for elem in elems:
            if isinstance(elem, list):
                obtained_types = self.__list_types(elem)
                for obt in obtained_types:
                    if not obt in types:
                        types.append(obt)
            else:
                elem_type = type(elem.type)
                if not elem_type in types:
                    types.append(elem_type)
        return types

    def __check_elements_in_types(self, var, types):
        list_types = self.__list_types(var)
        for ty in list_types:
            if not ty in types:
                return True
        return False
