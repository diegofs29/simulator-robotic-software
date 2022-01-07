import unittest

from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer 
from simulator.compiler.ArduinoListenerTests import ArduinoListenerTests
from simulator.compiler.ArduinoParser import ArduinoParser

class TestBase(unittest.TestCase):

    def setUp(self):
        input = FileStream(fileName=self.file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        listener = ArduinoListenerTests()
        walker = ParseTreeWalker()
        tree = parser.program()
        walker.walk(listener, tree)
        self.tokens = listener.tokens

    def tearDown(self):
        return super().tearDown()


class TestExample(TestBase):

    file = "examples/ejemploGoto.txt"

    def test_parsed(self):
        self.assertEqual(
            self.tokens,
            ["Program",
            "Declaration, \"inventado.h\"",
            "Setup",
            "Code_block",
            "Loop",
            "Code_block",
            "Sentence",
            "Iteration_sentence, for",
            "Assignment_definition",
            "Var_type, byte",
            "Assignment, r = 0",
            "Expression, 0",
            "Expression, <",
            "Expression, r",
            "Expression, 255",
            "Expression, r++",
            "Incdec_expression, ++",
            "Code_block",
            "Sentence",
            "Iteration_sentence, for",
            "Assignment_definition",
            "Var_type, byte",
            "Assignment, g = 255",
            "Expression, 255",
            "Expression, >",
            "Expression, g",
            "Expression, 0",
            "Expression, g--",
            "Incdec_expression, --",
            "Code_block",
            "Sentence",
            "Iteration_sentence, for",
            "Assignment_definition",
            "Var_type, byte",
            "Assignment, b = 0",
            "Expression, 0",
            "Expression, <",
            "Expression, b",
            "Expression, 255",
            "Expression, b++",
            "Incdec_expression, ++",
            "Code_block",
            "Sentence",
            "Conditional_sentence, if",
            "Expression, >",
            "Expression, analogRead(0)",
            "Function_call, analogRead",
            "Parameter",
            "Expression, 0",
            "Expression, 250",
            "Code_block",
            "Sentence, gotobailout",
            "Sentence, bailout"
            ]
        )