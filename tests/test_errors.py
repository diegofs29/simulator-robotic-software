import unittest
from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import *
from simulator.compiler.ast_builder_visitor import ASTBuilderVisitor
from simulator.compiler.error_listener import CompilerErrorListener
from simulator.compiler.semantical_errors import SemanticAnalyzer


class TestBaseErrors(unittest.TestCase):

    def setUp(self):
        input = FileStream(fileName=self.file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        error_listener = CompilerErrorListener(True)
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
        if len(self.syntax_errors) < 1:
            self.ast = visitor.visit(tree)
            semantic.visit_program(self.ast, None)
        self.semantic_errors = semantic.errors

    def tearDown(self):
        return super().tearDown()


class TestSyntaxErrors(TestBaseErrors):

    file = "tests/error-tests/lex-syn.txt"

    def test_number_of_errors(self):
        self.assertEqual(len(self.syntax_errors), 5)

    def test_type_of_errors(self):
        self.assertEqual(self.syntax_errors[0].error_type, "Sintaxis")
        self.assertEqual(self.syntax_errors[1].error_type, "Sintaxis")
        self.assertEqual(self.syntax_errors[2].error_type, "Léxico")
        self.assertEqual(self.syntax_errors[3].error_type, "Sintaxis")
        self.assertEqual(self.syntax_errors[4].error_type, "Sintaxis")

    def test_error_messages(self):
        self.assertEqual(self.syntax_errors[0].message, 
            "El valor introducido en esta posición no es válido: int")
        self.assertEqual(self.syntax_errors[1].message, 
            "Falta(n) caracter(es): ';'")
        self.assertEqual(self.syntax_errors[2].message, 
            "Caracter(es) inválido(s)")
        self.assertEqual(self.syntax_errors[3].message, 
            "El valor introducido en esta posición no es válido: \"panda;")
        self.assertEqual(self.syntax_errors[4].message, 
            "Código no válido")


class TestSetupLoopErrors(TestBaseErrors):

    file = "tests/error-tests/setup-loop.txt"

    def test_number_of_errors(self):
        self.assertEqual(len(self.semantic_errors), 2)