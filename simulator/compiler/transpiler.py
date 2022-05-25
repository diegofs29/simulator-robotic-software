from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
import simulator.compiler.ast_builder_visitor as ast_builder_visitor
import simulator.compiler.error_listener as error_listener
import simulator.compiler.semantical_errors as semantical_analysis
import simulator.compiler.code_generator as code_generator
import simulator.libraries.libraries as libraries
import simulator.libraries.library_creator as library_creator


def transpile(code, robot):
    errors = []
    input = InputStream(code)

    lexer = ArduinoLexer(input)
    listener = error_listener.CompilerErrorListener(False)
    lexer.removeErrorListeners()
    lexer.addErrorListener(listener)

    stream = CommonTokenStream(lexer)
    parser = ArduinoParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(listener)

    visitor = ast_builder_visitor.ASTBuilderVisitor()

    lib_creator = library_creator.LibraryCreator()
    lib_creator.set_robot(robot)
    lib_manager = libraries.LibraryManager(
        [
            lib_creator.create_servo()
        ]
    )
    sem_analysis = semantical_analysis.Semantic(lib_manager)

    code_gen = code_generator.CodeGenerator(lib_manager)

    tree = parser.program()
    errors.extend(listener.errors)
    if len(errors) < 1:
        ast = visitor.visit(tree)
        sem_analysis.execute(ast)
        try:
            errors.extend(sem_analysis.errors)
        except AttributeError:
            pass
        else:
            if len(errors) < 1:
                code_gen.visit_program(ast, None)
            
    return errors