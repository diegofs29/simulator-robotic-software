from antlr4 import *
import antlr4
from ArduinoLexer import ArduinoLexer
from ArduinoParser import ArduinoParser

def main():
    file = "ejemplos\ejemploArduino.txt"
    input = FileStream(fileName=file, encoding="utf-8")
    lexer = ArduinoLexer(input)
    stream = CommonTokenStream(lexer)
    parser = ArduinoParser(stream)
    tree = parser.program()
    print(tree.toStringTree(None, parser))

if __name__ == '__main__':
    main()