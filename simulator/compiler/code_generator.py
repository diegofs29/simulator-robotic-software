from .ast import *
from .ast_visitor import ASTVisitor
import libraries


class CodeGenerator(ASTVisitor):

    def __init__(self, console):
        self.library_manager = libraries.LibraryManager(console)

    def visit_include(self, program: IncludeNode, param):
        return None