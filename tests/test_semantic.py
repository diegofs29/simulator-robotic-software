import unittest
from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import *
from simulator.compiler.ast_builder_visitor import ASTBuilderVisitor
from simulator.compiler.semantical_errors import SemanticAnalyzer


class TestBaseAST(unittest.TestCase):

    def setUp(self):
        input = FileStream(fileName=self.file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        visitor = ASTBuilderVisitor()
        semantic = SemanticAnalyzer()
        tree = parser.program()
        self.ast = visitor.visit(tree)
        semantic.visit_program(self.ast, None)
        self.semantic_errors = semantic.errors

    def tearDown(self):
        return super().tearDown()


class TestFunction(TestBaseAST):

    file = "tests/file-tests/g-def.txt"

    def test_definition(self):
        self.assertTrue(True)