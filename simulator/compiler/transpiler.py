from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
import simulator.compiler.ast_builder_visitor as ast_builder_visitor
import simulator.compiler.error_listener as error_listener
import simulator.compiler.semantical_errors as semantical_analysis
import simulator.compiler.code_generator as code_generator
import simulator.libraries.libraries as libraries
import simulator.libraries.library_creator as library_creator
import simulator.console.console as console


class Transpiler:

    def __init__(self, cons):
        self.cons: console.Console = cons

    def transpile(self, code, robot):
        input = InputStream(code, encoding="utf-8")
        lexer = ArduinoLexer(input)
        listener = error_listener.CompilerErrorListener(False)
        lexer.removeErrorListeners()
        lexer.addErrorListener(listener)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        parser.removeErrorListeners()
        parser.addErrorListener(listener)
        visitor = ast_builder_visitor.ASTBuilderVisitor()
        lib_creator = library_creator.LibraryCreator(self.cons)
        lib_creator.set_robot(robot)
        lib_manager = libraries.LibraryManager(
            [
                lib_creator.create_servo()
            ]
        )
        sem_analysis = semantical_analysis.Semantic(lib_manager)
        code_gen = code_generator.CodeGenerator(lib_manager)
        tree = parser.program()
        self.syntax_errors = listener.errors
        if len(self.syntax_errors) < 1:
            self.ast = visitor.visit(tree)
            sem_analysis.execute(self.ast)
        else:
            self.print_errors(self.syntax_errors)
        try:
            self.semantic_errors = sem_analysis.errors
        except AttributeError:
            pass
        else:
            if len(self.semantic_errors) < 1:
                code_gen.visit_program(self.ast, None)
            else:
                self.print_errors(self.semantic_errors)
                
    def print_errors(self, errors):
        for error in errors:
            self.cons.write_error(error.to_string())