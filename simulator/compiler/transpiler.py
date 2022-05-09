from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import *
from simulator.compiler.ast_builder_visitor import ASTBuilderVisitor
from simulator.compiler.error_listener import CompilerErrorListener
from simulator.compiler.semantical_errors import Semantic
from simulator.compiler.code_generator import CodeGenerator


class Compiler:

    def __init__(self, console):
        self.console = console

    def transpile(self, file):
        input = FileStream(fileName=file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        error_listener = CompilerErrorListener(False)
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener)
        visitor = ASTBuilderVisitor()
        semantic = Semantic()
        code_generator = CodeGenerator(self.console)
        tree = parser.program()
        self.syntax_errors = error_listener.errors
        if len(self.syntax_errors) < 1:
            self.ast = visitor.visit(tree)
            semantic.execute(self.ast)
        try:
            self.semantic_errors = semantic.errors
        except AttributeError:
            pass
        else:
            if len(self.semantic_errors) < 1:
                code_generator.visit_program(self.ast, None)