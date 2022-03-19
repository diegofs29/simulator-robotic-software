import unittest
from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import *
from simulator.compiler.ast_builder_visitor import ASTBuilderVisitor
from simulator.compiler.error_listener import CompilerErrorListener
from simulator.compiler.semantical_errors import SemanticAnalyzer


class TestBaseAST(unittest.TestCase):

    def setUp(self):
        input = FileStream(fileName=self.file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        error_listener = CompilerErrorListener()
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener)
        visitor = ASTBuilderVisitor()
        semantic = SemanticAnalyzer()
        tree = parser.program()
        self.syntax_errors = error_listener.errors
        if len(self.syntax_errors)<1:
            self.ast = visitor.visit(tree)
            semantic.visit_program(self.ast, None)
        self.semantic_errors = semantic.errors

    def tearDown(self):
        return super().tearDown()


class TestOtherErrors(TestBaseAST):

    file = "tests/error-tests/lex-syn.txt"

    def test_syntax_errors(self):
        self.assertEqual(len(self.syntax_errors), 3)