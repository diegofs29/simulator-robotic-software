from antlr4 import *
import antlr4
from ArduinoLexer import ArduinoLexer
from ArduinoParser import ArduinoParser
from ArduinoListenerImpl import ArduinoListenerImpl

def main():
    file = "ejemplos\ejemploGoto.txt"
    input = FileStream(fileName=file, encoding="utf-8")
    lexer = ArduinoLexer(input)
    stream = CommonTokenStream(lexer)
    parser = ArduinoParser(stream)
    listener = ArduinoListenerImpl()
    walker = ParseTreeWalker()
    tree = parser.program()
    walker.walk(listener, tree)

if __name__ == '__main__':
    main()