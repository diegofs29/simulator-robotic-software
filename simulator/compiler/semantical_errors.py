from .ast import *
from .ast_visitor import ASTVisitor
from ..console.console import Error


class SemanticAnalyzer(ASTVisitor):

    def __init__(self):
        self.errors = []
        self.globals = {}
        self.locals = {}
        self.global_macros = {}
        self.local_macros = {}
        self.functions = {}
        self.numerical_types = [IntTypeNode, FloatTypeNode,
                                DoubleTypeNode, ByteTypeNode, ShortTypeNode, LongTypeNode]

    def visit_program(self, program: ProgramNode, param):
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        if not "setup" in self.functions:
            self.add_error("Declaración", program, "No hay función setup")
        else:
            setup = self.functions["setup"]
            if self.check_type(setup.type, VoidTypeNode):
                self.add_error("Tipo de función setup", program,
                               "La función setup debe ser de tipo void")
        if not "loop" in self.functions:
            self.add_error("Declaración", program, "No hay función loop")
        else:
            setup = self.functions["loop"]
            if self.check_type(setup.type, VoidTypeNode):
                self.add_error("Tipo de función loop", program,
                               "La función loop debe ser de tipo void")
        return None

    def visit_int(self, int_node: IntNode, param):
        int_node.set_type(IntTypeNode)
        int_node.set_modifiable(False)
        return None

    def visit_float(self, float_node: FloatNode, param):
        float_node.set_type(FloatTypeNode)
        float_node.set_modifiable(False)
        return None

    def visit_hex(self, hex_node: HexNode, param):
        hex_node.set_type(IntTypeNode)
        hex_node.set_modifiable(False)
        return None

    def visit_octal(self, oct_node: OctalNode, param):
        oct_node.set_type(IntTypeNode)
        oct_node.set_modifiable(False)
        return None

    def visit_binary(self, binary_node: BinaryNode, param):
        binary_node.set_type(IntTypeNode)
        binary_node.set_modifiable(False)
        return None

    def visit_char(self, char_node: CharNode, param):
        char_node.set_type(CharTypeNode)
        char_node.set_modifiable(False)
        return None

    def visit_string(self, string_node: StringNode, param):
        string_node.set_type(StringTypeNode)
        string_node.set_modifiable(False)
        return None

    def visit_boolean(self, boolean_node: BooleanNode, param):
        boolean_node.set_type(BooleanTypeNode)
        boolean_node.set_modifiable(False)
        return None

    def visit_id(self, id_node: IDNode, param):
        id_node.set_type(id_node.definition.get_type())
        id_node.set_modifiable(True)
        return None

    def visit_function(self, function: FunctionNode, param):
        has_returned = False
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        if function.sentences != None:
            for sent in function.sentences:
                if has_returned:
                    self.add_error("Mal uso de identificador", sent,
                                   "La sentencia return debe de estar al final de la función")
                sent.set_function(function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe ser usado dentro de un iterador (for, while o do while) o en una expresión condicional (if o switch)")
                if isinstance(sent, BreakNode):
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe ser usado dentro de un iterador (for, while o do while) o en una expresión condicional (if o switch)")
                if isinstance(sent, ReturnNode):
                    has_returned = True
        self.visit_children(function.sentences, param)
        if not function.name in self.functions:
            self.functions[function.name] = function
        return None

    def visit_declaration(self, declaration: DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.accept(self, param)
            if self.check_type(declaration.type, declaration.expr.type):
                self.add_error("Tipos", declaration,
                               "El tipo de la variable y de la expresión no coincide")
        # Modifiability not checked, it should be always modifiable
        if self.is_global(declaration):
            if not declaration.var_name in self.globals:
                self.globals[declaration.var_name] = declaration
            else:
                self.add_error("Declaración", declaration,
                               "La variable ya está declarada globalmente")
        else:
            if not declaration.var_name in self.local_macros[declaration.function]:
                self.locals[declaration.function][declaration.var_name] = declaration
            else:
                self.add_error("Declaración", declaration,
                               "La variable ya está declarada localmente")
        return None

    def visit_array_declaration(self, array_declaration: ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        if array_declaration.elements != None and array_declaration.elements != []:
            if self.check_type(array_declaration.type, array_declaration.elements):
                self.add_error("Tipos", array_declaration,
                               "El tipo del array y de al menos uno de sus elementos no coincide")
        # Modifiablity not checked, it should always be modifiable
        if self.is_global(array_declaration):
            self.globals[array_declaration.var_name] = array_declaration
        else:
            self.locals[array_declaration.function][array_declaration.var_name] = array_declaration
        return None

    def visit_define_macro(self, define_macro: DefineMacroNode, param):
        if define_macro.expr != None:
            define_macro.expr.accept(self, param)
        if self.is_global(define_macro):
            self.global_macros[define_macro.macro_name] = define_macro
        else:
            self.local_macros[define_macro.function][define_macro.macro_name] = define_macro
        return None

    def visit_while(self, while_p: WhileNode, param):
        has_continued = False
        has_broken = False
        if while_p.expression != None:
            while_p.expression.accept(self, param)
        if while_p.sentences != None:
            for sent in while_p.sentences:
                if has_continued:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe de estar al final del while")
                if has_broken:
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe de estar al final del while")
                sent.set_function(while_p.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    has_continued = True
                if isinstance(sent, BreakNode):
                    has_broken = True
        if self.check_type(while_p.expression.type, IntTypeNode) or self.check_type(while_p.expression.type, BooleanTypeNode):
            self.add_error(
                "Tipos", while_p, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_do_while(self, do_while: DoWhileNode, param):
        has_continued = False
        has_broken = False
        if do_while.expression != None:
            do_while.expression.accept(self, param)
        for sent in do_while.sentences:
            if has_continued:
                self.add_error("Mal uso de identificador", sent,
                               "Continue debe de estar al final del while")
            if has_broken:
                self.add_error("Mal uso de identificador", sent,
                               "Break debe de estar al final del while")
            sent.set_function(do_while.function)
            sent.accept(self, param)
            if isinstance(sent, ContinueNode):
                has_continued = True
            if isinstance(sent, BreakNode):
                has_broken = True
        if self.check_type(do_while.expression.type, IntTypeNode) or self.check_type(do_while.expression.type, BooleanTypeNode):
            self.add_error(
                "Tipos", do_while, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_for(self, for_p: ForNode, param):
        has_continued = False
        has_broken = False
        if for_p.assignment != None:
            for_p.assignment.accept(self, param)
        if for_p.condition != None:
            for_p.condition.accept(self, param)
        if for_p.expression != None:
            for_p.expression.accept(self, param)
        if for_p.sentences != None:
            for sent in for_p.sentences:
                if has_continued:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe de estar al final del while")
                if has_broken:
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe de estar al final del while")
                sent.set_function(for_p.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    has_continued = True
                if isinstance(sent, BreakNode):
                    has_broken = True
        if self.check_type(for_p.assignment.type, IntTypeNode):
            self.add_error(
                "Tipos", for_p, "La variable del for debe ser int")
        if self.check_type(for_p.condition.type, IntTypeNode) or self.check_type(for_p.condition.type, BooleanTypeNode):
            self.add_error(
                "Tipos", for_p, "El resultado de la condición debe ser int o boolean")
        if self.check_type(for_p.expression, IntTypeNode):
            self.add_error(
                "Tipos", for_p, "El incremento del for debe ser int")
        return None

    def visit_conditional_sentence(self, conditional_sentence: ConditionalSentenceNode, param):
        has_continued = False
        has_broken = False
        if conditional_sentence.condition != None:
            conditional_sentence.condition.accept(self, param)
        if conditional_sentence.if_expr != None:
            for sent in conditional_sentence.if_expr:
                if has_continued:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe de estar al final del while")
                if has_broken:
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe de estar al final del while")
                sent.set_function(conditional_sentence.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    has_continued = True
                if isinstance(sent, BreakNode):
                    has_broken = True
        if conditional_sentence.else_expr != None:
            has_continued = False
            has_broken = False
            for sent in conditional_sentence.else_expr:
                if has_continued:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe de estar al final del while")
                if has_broken:
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe de estar al final del while")
                sent.set_function(conditional_sentence.function)
                sent.accept(self, param)
                if isinstance(sent, ContinueNode):
                    has_continued = True
                if isinstance(sent, BreakNode):
                    has_broken = True
        if self.check_type(conditional_sentence.condition.type, IntTypeNode) or self.check_type(conditional_sentence.condition.type, BooleanTypeNode):
            self.add_error(
                "Tipos", conditional_sentence, "El resultado de la condición debe ser int o boolean")
        return None

    def visit_switch_sentence(self, switch_sentence: SwitchSentenceNode, param):
        has_continued = False
        has_broken = False
        if switch_sentence.expression != None:
            switch_sentence.expression.accept(self, param)
        if switch_sentence.cases != None:
            for sent in switch_sentence.cases:
                if has_continued:
                    self.add_error("Mal uso de identificador", sent,
                                   "Continue debe de estar al final del while")
                if has_broken:
                    self.add_error("Mal uso de identificador", sent,
                                   "Break debe de estar al final del while")
                sent.set_function(switch_sentence.function)
                sent.accept(self, param)
                if sent.type != "default":
                    if self.check_type(switch_sentence.expression, sent.expression):
                        self.add_error(
                            "Tipos", sent, "La sentencia case debe de tener una expresion del tipo marcado en switch")
                if isinstance(sent, ContinueNode):
                    has_continued = True
                if isinstance(sent, BreakNode):
                    has_broken = True
        return None

    def visit_assignment(self, assignment: AssignmentNode, param):
        if assignment.var != None:
            assignment.var.accept(self, param)
        if assignment.expr != None:
            assignment.expr.accept(self, param)
        if self.check_type(assignment.var.type, assignment.expr.type):
            self.add_error("Tipos", assignment,
                           "El tipo de la variable y de la expresión no coincide")
        if self.check_modifiable(assignment):
            self.add_error("No modificable", assignment,
                           "La variable no se puede modificar. Puede que sea una constante")
        if self.variable_defined(assignment.var.value):
            self.add_error("Variable no definida", assignment.var,
                           "La variable no está definida")
        return None

    def visit_return(self, return_p: ReturnNode, param):
        if return_p.expression != None:
            return_p.expression.accept(self, param)
        if return_p.expression != None and isinstance(return_p.function.type, VoidTypeNode):
            self.add_error("Tipos", return_p,
                           "Las funciones de tipo void no deben retornar valor")
        elif return_p.expression == None and not isinstance(return_p.function.type, VoidTypeNode):
            self.add_error("Tipos", return_p,
                           "Las funciones de tipo no void deben retornar valor")
        elif self.check_type(return_p.function.type, return_p.expression.type):
            self.add_error("Tipos", return_p,
                           "El tipo de la función y de la expresión de retorno no coincide")

    def visit_function_call(self, function_call: FunctionCallNode, param):
        definition = None
        if function_call.name in self.functions:
            definition = self.functions[function_call.name]
        else:
            self.add_error("Declaración", function_call,
                           "La función no se ha declarado")
        if function_call.parameters != None:
            if len(function_call.parameters) == len(definition.args):
                for i in range(0, len(function_call.parameters)):
                    if definition != None:
                        if self.check_type(function_call.parameters[i].type, definition.args[i].type):
                            self.add_error(
                                "Tipos", function_call.parameters[i], "El tipo del parametro no coincide")
            else:
                self.add_error("Parámetros", function_call,
                               "El número de parámetros no coincide con los de la definición")
        return None

    def visit_inc_dec_expression(self, inc_dec_expression: IncDecExpressionNode, param):
        if inc_dec_expression.var != None:
            inc_dec_expression.var.accept(self, param)
        if self.check_in_types(inc_dec_expression.var.type, self.numerical_types):
            self.add_error("Tipos", inc_dec_expression,
                           "La expresión no es de tipo numérico")
        if self.variable_defined(inc_dec_expression.var.value):
            self.add_error("Declaración", inc_dec_expression,
                           "La variable no está declarada")
        return None

    def visit_array_access(self, array_access: ArrayAccessNode, param):
        definition = None
        if array_access.var != None:
            array_access.var.accept(self, param)
        if array_access.index != None:
            array_access.index.accept(self.param)
        if array_access.var.value in self.globals:
            definition = self.globals[array_access.var.value]
        if array_access.var.value in self.locals:
            definition = self.globals[array_access.function][array_access.var.value]
        else:
            self.add_error("Declaración", array_access,
                           "El array no está declarado")
        if self.check_type(array_access.index.type, IntTypeNode):
            self.add_error("Tipos", array_access, "El índice debe ser int")
        n = 0
        elem = array_access.var
        while isinstance(elem, ArrayAccessNode):
            n += 1
            elem = elem.var
        if array_access.index.value >= definition.size[n]:
            self.add_error("Tamaños", array_access,
                           "El indice es mayor al tamaño del array")
        return None

    def visit_not_expression(self, not_expression: NotExpressionNode, param):
        if not_expression.expression != None:
            not_expression.expression.accept(self, param)
        if self.check_type(not_expression.expression.type, BooleanTypeNode) or self.check_in_types(not_expression.expression.type, self.numerical_types):
            self.add_error("Tipos", not_expression,
                           "La expresion debe ser tipo int o boolean")
        return None

    def visit_bit_not_expression(self, bit_not_expression: BitNotExpressionNode, param):
        if bit_not_expression.expression != None:
            bit_not_expression.expression.accept(self, param)
        if self.check_in_types(bit_not_expression.expression.type, self.numerical_types):
            self.add_error("Tipos", bit_not_expression,
                           "La expresion debe ser tipo int")
        return None

    def visit_arithmetic_expression(self, arithmetic_expression: ArithmeticExpressionNode, param):
        if arithmetic_expression.left != None:
            arithmetic_expression.left.visit(self, param)
        if arithmetic_expression.right != None:
            arithmetic_expression.right.visit(self, param)
        if self.check_in_types(arithmetic_expression.left.type, self.numerical_types):
            self.add_error("Tipos", arithmetic_expression,
                           "Las operaciones artiméticas deben ser entre números")
        if self.check_in_types(arithmetic_expression.right.type, self.numerical_types):
            self.add_error("Tipos", arithmetic_expression,
                           "Las operaciones artiméticas deben ser entre números")
        return None

    def visit_comparision_expression(self, comparison_expression: ComparisonExpressionNode, param):
        if comparison_expression.left != None:
            comparison_expression.left.accept(self, param)
        if comparison_expression.right != None:
            comparison_expression.right.accept(self, param)
        if self.check_type(comparison_expression.left.type, comparison_expression.right.type):
            self.add_error("Tipos", comparison_expression,
                           "Los tipos de ambas expresiones deben coincidir")
        return None

    def visit_boolean_expresssion(self, boolean_expression: BooleanExpressionNode, param):
        if boolean_expression.left != None:
            boolean_expression.left.accept(self, param)
        if boolean_expression.right != None:
            boolean_expression.right.accept(self, param)
        if self.check_type(boolean_expression.left.type, boolean_expression.right.type):
            self.add_error("Tipos", boolean_expression,
                           "Los tipos de ambas expresiones deben coincidir")
        if self.check_type(boolean_expression.left.type, IntTypeNode) or self.check_type(boolean_expression.left.type, BooleanTypeNode):
            self.add_error("Tipos", boolean_expression,
                           "La expresión izquierda debe ser int o boolean")
        if self.check_type(boolean_expression.right.type, IntTypeNode) or self.check_type(boolean_expression.right.type, BooleanTypeNode):
            self.add_error("Tipos", boolean_expression,
                           "La expresión derecha debe ser int o boolean")
        return None

    def visit_bitwise_expression(self, bitwise_expression: BitwiseExpressionNode, param):
        if bitwise_expression.left != None:
            bitwise_expression.left.accept(self, param)
        if bitwise_expression.right != None:
            bitwise_expression.right.accept(self, param)
        if self.check_type(bitwise_expression.left.type, bitwise_expression.right.type):
            self.add_error("Tipos", bitwise_expression,
                           "Los tipos de ambas expresiones deben coincidir")
        if self.check_in_types(bitwise_expression.left.type, self.numerical_types) or self.check_in_types(bitwise_expression.right.type, self.numerical_types):
            self.add_error("Tipos", bitwise_expression,
                           "El tipo de las expresiones debe ser numérico")
        return None

    def visit_compound_assigment(self, compound_asigment: CompoundAssignmentNode, param):
        if compound_asigment.left != None:
            compound_asigment.left.accept(self, param)
        if compound_asigment.right != None:
            compound_asigment.right.accept(self, param)
        if self.check_type(compound_asigment.left.type, compound_asigment.right.type):
            self.add_error("Tipos", compound_asigment,
                           "Los tipos de ambas expresiones deben coincidir")
        if self.variable_defined(compound_asigment.left.value):
            self.add_error("Declaración", compound_asigment,
                           "La variable no está declarada")
        return None

    def check_type(self, var_type, value_type):
        if isinstance(value_type, list):
            list_types = self.__list_types(value_type)
            if len(list_types) > 1:
                return False
            if type(var_type) in self.numerical_types:
                return not list_types[0] in self.numerical_types
            return not type(var_type) is list_types[0]
        if type(var_type) in self.numerical_types:
            return not value_type in self.numerical_types
        return not type(var_type) is value_type

    def check_in_types(self, var, types):
        return not var in types

    def __list_types(self, elems):
        types = []
        for elem in elems:
            elem_type = elem.type
            if not elem_type in types:
                types.append(elem_type)
        return types

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

    def variable_defined(self, elem):
        return not elem in globals or elem in locals
