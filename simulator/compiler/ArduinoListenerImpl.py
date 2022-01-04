from ArduinoListener import ArduinoListener
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ArduinoParser import ArduinoParser
else:
    from ArduinoParser import ArduinoParser

class ArduinoListenerImpl(ArduinoListener):

    def __init__(self):
        self.indent = 0

    def new_line(self):
        pass

    def print_indent(self):
        for i in range (0, self.indent):
            print(end="  ")

    def print_exit(self):
        if self.indent > 0:
            self.indent -= 1
        self.print_indent()
        print(")")

    # Enter a parse tree produced by ArduinoParser#start.
    def enterStart(self, ctx:ArduinoParser.StartContext):
        self.print_indent()
        print("Start (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#start.
    def exitStart(self, ctx:ArduinoParser.StartContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#program.
    def enterProgram(self, ctx:ArduinoParser.ProgramContext):
        self.print_indent()
        print("Program (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#program.
    def exitProgram(self, ctx:ArduinoParser.ProgramContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#program_code.
    def enterProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        self.print_indent()
        print("Program_code (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#program_code.
    def exitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#declaration.
    def enterDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        self.print_indent()
        print("Declaration (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#declaration.
    def exitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#h_file.
    def enterH_file(self, ctx:ArduinoParser.H_fileContext):
        self.print_indent()
        print("H_file (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#h_file.
    def exitH_file(self, ctx:ArduinoParser.H_fileContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#definition.
    def enterDefinition(self, ctx:ArduinoParser.DefinitionContext):
        self.print_indent()
        print("Definition (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#definition.
    def exitDefinition(self, ctx:ArduinoParser.DefinitionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#simple_definition.
    def enterSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        self.print_indent()
        print("Simple_definition (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#simple_definition.
    def exitSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#assignment_definition.
    def enterAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        self.print_indent()
        print("Assignment_definition (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#assignment_definition.
    def exitAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#assignment.
    def enterAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.print_indent()
        print("Assignment (")
        self.new_line()
        self.indent += 1
    # Exit a parse tree produced by ArduinoParser#assignment.
    def exitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#constant.
    def enterConstant(self, ctx:ArduinoParser.ConstantContext):
        self.print_indent()
        print("Constant (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#constant.
    def exitConstant(self, ctx:ArduinoParser.ConstantContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#var_type.
    def enterVar_type(self, ctx:ArduinoParser.Var_typeContext):
        self.print_indent()
        print("Var_type (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#var_type.
    def exitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#setup.
    def enterSetup(self, ctx:ArduinoParser.SetupContext):
        self.print_indent()
        print("Setup (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#setup.
    def exitSetup(self, ctx:ArduinoParser.SetupContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#loop.
    def enterLoop(self, ctx:ArduinoParser.LoopContext):
        self.print_indent()
        print("Loop (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#loop.
    def exitLoop(self, ctx:ArduinoParser.LoopContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#function.
    def enterFunction(self, ctx:ArduinoParser.FunctionContext):
        self.print_indent()
        print("Function (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#function.
    def exitFunction(self, ctx:ArduinoParser.FunctionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#function_args.
    def enterFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        self.print_indent()
        print("Function_args (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#function_args.
    def exitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#iteration_sentence.
    def enterIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        self.print_indent()
        print("Iteration_sentence (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#iteration_sentence.
    def exitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#conditional_sentence.
    def enterConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        self.print_indent()
        print("Conditional_sentence (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#conditional_sentence.
    def exitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#code_block.
    def enterCode_block(self, ctx:ArduinoParser.Code_blockContext):
        self.print_indent()
        print("Code_block (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#code_block.
    def exitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#sentence.
    def enterSentence(self, ctx:ArduinoParser.SentenceContext):
        self.print_indent()
        print("Sentence (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#sentence.
    def exitSentence(self, ctx:ArduinoParser.SentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#case_sentence.
    def enterCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        self.print_indent()
        print("Case_sentence (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#case_sentence.
    def exitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#expression.
    def enterExpression(self, ctx:ArduinoParser.ExpressionContext):
        self.print_indent()
        print("Expression (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#expression.
    def exitExpression(self, ctx:ArduinoParser.ExpressionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#incdec_expression.
    def enterIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        self.print_indent()
        print("Incdec_expression (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#incdec_expression.
    def exitIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#function_call.
    def enterFunction_call(self, ctx:ArduinoParser.Function_callContext):
        self.print_indent()
        print("Function_call (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#function_call.
    def exitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#parameter.
    def enterParameter(self, ctx:ArduinoParser.ParameterContext):
        self.print_indent()
        print("Parameter (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#parameter.
    def exitParameter(self, ctx:ArduinoParser.ParameterContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#static_variable.
    def enterStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        self.print_indent()
        print("Static_variable (")
        self.new_line()
        self.indent += 1

    # Exit a parse tree produced by ArduinoParser#static_variable.
    def exitStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        self.print_exit()