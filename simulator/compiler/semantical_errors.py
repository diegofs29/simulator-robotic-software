from tabnanny import check
from simulator.compiler.ast import BooleanTypeNode, CharTypeNode, FloatTypeNode, IntTypeNode, StringTypeNode
from .ast_visitor import ASTVisitor


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

    def visit_assignment(self, assignment, param):
        if self.check_type(assignment.var.type, assignment.expr.type):
            self.errors.append("Assignación: ")

    def check_type(self, var_type, value_type):
        return type(var_type) is type(value_type)
