"""
'Translates' Arduino code into Python code that is readable
from the simulator's point of view. This makes the compiler
into a transpiler
"""


from .ast import *
from .ast_visitor import ASTVisitor
import simulator.compiler.libraries as libraries


class CodeGenerator(ASTVisitor):

    def __init__(self, console):
        """
        Constructor for code generator.
        Uses the ASTVisitor implementation. The pattern used
        is visitor.
        """
        self.script_tabs = 0
        self.library_manager = libraries.LibraryManager(console)
    
    def visit_program(self, program: ProgramNode, param):
        self.script = open("script_arduino.py", 'w')
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        self.script.close()
        return None

    def visit_include(self, program: IncludeNode, param):
        library = program.file_name[:-2]
        self.library_manager.add_library(library)
        self.write_to_script("import {}".format(library))

    def write_to_script(self, sentence):
        """
        Writes a sentence into a python script, which will be
        the transpiled Arduino code.
        Arguments:
            sentence: the sentence to write
        """
        i = 0
        tabs = ""
        while i < self.script_tabs:
            tabs.join('\t')
        self.script.write(str(tabs + sentence))
    
    def increase_tab(self):
        """
        Increases the indentation
        """
        self.script_tabs += 1

    def decrease_tab(self):
        """
        Decreases the intentation
        """
        self.script_tabs -= 1