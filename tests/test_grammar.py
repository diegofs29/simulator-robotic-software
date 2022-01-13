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


class TestWhile(TestBase):

    file = "examples/ejemploWhile.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputWhile.txt")
        self.assertEqual(self.tokens, self.lines)
        
        
class TestDoWhile(TestBase):

    file = "examples/ejemploDoWhile.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputDoWhile.txt")
        self.assertEqual(self.tokens, self.lines)


class TestIf(TestBase):

    file = "examples/ejemploIf.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputIf.txt")
        self.assertEqual(self.tokens, self.lines)
        
        
class TestElse(TestBase):

    file = "examples/ejemploElse.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputElse.txt")
        self.assertEqual(self.tokens, self.lines)
        
        
class TestSwitchCase(TestBase):

    file = "examples/ejemploSwitchCase.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputSwitchCase.txt")
        self.assertEqual(self.tokens, self.lines)
        
        
class TestBreakContinue(TestBase):

    file = "examples/ejemploBreakContinue.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputBreakContinue.txt")
        self.assertEqual(self.tokens, self.lines)
        
        
class TestReturn(TestBase):

    file = "examples/ejemploReturn.txt"

    def test_parsed(self):
        self.read_results("tests/outputs/outputReturn.txt")
        self.assertEqual(self.tokens, self.lines)