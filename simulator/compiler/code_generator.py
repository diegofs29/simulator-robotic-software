from .ast import *
from .ast_visitor import ASTVisitor


class CodeGenerator(ASTVisitor):

    def __init__(self):
        self.library_methods = {}

    def visit_include(self, program: IncludeNode, param):
        return None