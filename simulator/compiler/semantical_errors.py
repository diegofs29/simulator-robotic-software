from .ast_visitor import ASTVisitor


class SyntacticAnalyzer(ASTVisitor):

    def visit_definition(self, definition, param):
        return super().visit_definition(definition, param)