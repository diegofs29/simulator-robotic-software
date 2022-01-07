from antlr4 import *
import antlr4
from .ArduinoLexer import ArduinoLexer
from .ArduinoParser import ArduinoParser
from .ArduinoListenerTests import ArduinoListenerTests

def parse_grammar(file):
    input = FileStream(fileName=file, encoding="utf-8")
    lexer = ArduinoLexer(input)
    stream = CommonTokenStream(lexer)
    parser = ArduinoParser(stream)
    listener = ArduinoListenerTests()
    walker = ParseTreeWalker()
    tree = parser.program()
    walker.walk(listener, tree)
    for i in range(0, listener.tokens.__len__()):
        print(listener.tokens[i])