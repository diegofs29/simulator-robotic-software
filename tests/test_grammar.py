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

    def read_results(self, file_name):
        file = open(file_name, "r")
        self.lines = []
        for line in file:
            self.lines.append(line.rstrip('\n'))
        file.close()


class TestGoto(TestBase):

    file = "examples/ejemploGoto.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputGoto.txt")
        self.assertEqual(self.tokens, self.lines)


class TestArray(TestBase):

    file = "examples/ejemploArrays.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputArrays.txt")
        self.assertEqual(self.tokens, self.lines)

class TestFor(TestBase):

    file = "examples/ejemploFor.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputFor.txt")
        self.assertEqual(self.tokens, self.lines)