from cmath import exp
from .ast import BooleanTypeNode, CharTypeNode, FloatTypeNode, IntTypeNode, StringTypeNode, VoidTypeNode
from .ast_visitor import ASTVisitor
from console.console import Error


class SyntacticAnalyzer(ASTVisitor):

    def __init__(self):
        self.errors = []

    def visit_int(self, int_node, param):
        int_node.set_type(IntTypeNode)
        int_node.set_modifiable(False)
        return None

    def visit_float(self, float_node, param):
        float_node.set_type(FloatTypeNode)
        float_node.set_modifiable(False)
        return None

    def visit_hex(self, hex_node, param):
        hex_node.set_type(IntTypeNode)
        hex_node.set_modifiable(False)
        return None

    def visit_octal(self, oct_node, param):
        oct_node.set_type(IntTypeNode)
        oct_node.set_modifiable(False)
        return None

    def visit_binary(self, binary_node, param):
        binary_node.set_type(IntTypeNode)
        binary_node.set_modifiable(False)
        return None

    def visit_char(self, char_node, param):
        char_node.set_type(CharTypeNode)
        char_node.set_modifiable(False)
        return None

    def visit_string(self, string_node, param):
        string_node.set_type(StringTypeNode)
        string_node.set_modifiable(False)
        return None

    def visit_boolean(self, boolean_node, param):
        boolean_node.set_type(BooleanTypeNode)
        boolean_node.set_modifiable(False)
        return None

    def visit_id(self, id_node, param):
        id_node.set_type(id_node.definition.get_type())
        id_node.set_modifiable(True)
        return None

    def visit_declaration(self, declaration, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.value != None:
            declaration.value.accept(self, param)
        if self.check_type(declaration.type, declaration.expr):
            self.add_error("Tipos", declaration,
                           "El tipo de la variable y de la expresión no coincide")
        # Modifiability not checked, it should be always modifiable
        return None

    def visit_array_declaration(self, array_declaration, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements)
        if self.check_type(array_declaration.type, array_declaration.elements):
            self.add_error("Tipos", array_declaration,
                           "El tipo del array y de al menos uno de sus elementos no coincide")
        if self.check_modifiable(array_declaration):
            self.add_error("No modificable", array_declaration,
                           "El array no es modificable. Puede que sea una constante")
        return None

    def visit_assignment(self, assignment, param):
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
        return None

    def visit_return(self, return_p, param):
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

    def check_type(self, var_type, value_type):
        return not type(var_type) is type(value_type)

    def check_modifiable(self, element):
        return not element.modifiable

    def add_error(self, e_type, element, message):
        self.errors.append(
            Error(e_type, element.line, element.column, message))
