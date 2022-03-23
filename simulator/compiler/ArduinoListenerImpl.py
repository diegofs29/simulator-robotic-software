from .ArduinoListener import ArduinoListener
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
            print(end=" . ")

    def print_enter(self, text, ending=True):
        self.print_indent()
        if not ending:
            print(text, end=" -> ")
        else:
            print(text)
        self.new_line()
        self.indent += 1

    def print_exit(self):
        if self.indent > 0:
            self.indent -= 1

    # Enter a parse tree produced by ArduinoParser#start.
    def enterStart(self, ctx:ArduinoParser.StartContext):
        self.print_enter("Start")

    # Exit a parse tree produced by ArduinoParser#start.
    def exitStart(self, ctx:ArduinoParser.StartContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#program.
    def enterProgram(self, ctx:ArduinoParser.ProgramContext):
        self.print_enter("Program")

    # Exit a parse tree produced by ArduinoParser#program.
    def exitProgram(self, ctx:ArduinoParser.ProgramContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#include.
    def enterInclude(self, ctx:ArduinoParser.IncludeContext):
        self.print_enter("Include")

    # Exit a parse tree produced by ArduinoParser#include.
    def exitInclude(self, ctx:ArduinoParser.IncludeContext):
        self.print_exit()

    # Enter a parse tree produced by ArduinoParser#program_code.
    def enterProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        self.print_enter("Program_code")

    # Exit a parse tree produced by ArduinoParser#program_code.
    def exitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#declaration.
    def enterDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        self.print_enter("Declaration")

    # Exit a parse tree produced by ArduinoParser#declaration.
    def exitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#simple_declaration.
    def enterSimple_declaration(self, ctx:ArduinoParser.Simple_declarationContext):
        self.print_enter("Simple_declaration", False)
        print("Variable:", str(ctx.ID()))

    # Exit a parse tree produced by ArduinoParser#simple_declaration.
    def exitSimple_declaration(self, ctx:ArduinoParser.Simple_declarationContext):
        self.print_exit()


        # Enter a parse tree produced by ArduinoParser#array_declaration.
    def enterArray_declaration(self, ctx:ArduinoParser.Array_declarationContext):
        self.print_enter("Array_declaration")

    # Exit a parse tree produced by ArduinoParser#array_declaration.
    def exitArray_declaration(self, ctx:ArduinoParser.Array_declarationContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#define_declaration.
    def enterDefine_macro(self, ctx:ArduinoParser.Define_macroContext):
        self.print_enter("Define_macro")

    # Exit a parse tree produced by ArduinoParser#define_declaration.
    def exitDefine_macro(self, ctx:ArduinoParser.Define_macroContext):
        self.print_exit()

    
    # Enter a parse tree produced by ArduinoParser#array_index.
    def enterArray_index(self, ctx:ArduinoParser.Array_indexContext):
        finishes = ctx.sizes == []
        self.print_enter("Array_index", finishes)
        if not finishes:
            for i_const in ctx.sizes:
                print(i_const.text, end=" ")
            print()

    # Exit a parse tree produced by ArduinoParser#array_index.
    def exitArray_index(self, ctx:ArduinoParser.Array_indexContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#array_elements.
    def enterArray_elements(self, ctx:ArduinoParser.Array_elementsContext):
        finishes = ctx.elements == []
        self.print_enter("Array_elements", finishes)
        if not finishes:
            for elem in ctx.elements:
                print(elem.getText(), end=" ")
            print()

    # Exit a parse tree produced by ArduinoParser#array_elements.
    def exitArray_elements(self, ctx:ArduinoParser.Array_elementsContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#var_type.
    def enterVar_type(self, ctx:ArduinoParser.Var_typeContext):
        self.print_enter("Var_type", False)
        print(ctx.getText())

    # Exit a parse tree produced by ArduinoParser#var_type.
    def exitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#function.
    def enterFunction(self, ctx:ArduinoParser.FunctionContext):
        self.print_enter("Function", False)
        print(ctx.ID())

    # Exit a parse tree produced by ArduinoParser#function.
    def exitFunction(self, ctx:ArduinoParser.FunctionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#function_args.
    def enterFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        self.print_enter("Function_args")

    # Exit a parse tree produced by ArduinoParser#function_args.
    def exitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#iteration_sentence.
    def enterIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        self.print_enter("Iteration_sentence", False)
        print(ctx.it_type.text)

    # Exit a parse tree produced by ArduinoParser#iteration_sentence.
    def exitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#conditional_sentence.
    def enterConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        self.print_enter("Conditional_sentence", False)
        print(ctx.cond_type.text)

    # Exit a parse tree produced by ArduinoParser#conditional_sentence.
    def exitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#code_block.
    def enterCode_block(self, ctx:ArduinoParser.Code_blockContext):
        self.print_enter("Code_block")

    # Exit a parse tree produced by ArduinoParser#code_block.
    def exitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#sentence.
    def enterSentence(self, ctx:ArduinoParser.SentenceContext):
        self.print_enter("Sentence")

    # Exit a parse tree produced by ArduinoParser#sentence.
    def exitSentence(self, ctx:ArduinoParser.SentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#assignment.
    def enterAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.print_enter("Assignment")

    # Exit a parse tree produced by ArduinoParser#assignment.
    def exitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#case_sentence.
    def enterCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        self.print_enter("Case_sentence")

    # Exit a parse tree produced by ArduinoParser#case_sentence.
    def exitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#expression.
    def enterExpression(self, ctx:ArduinoParser.ExpressionContext):
        self.print_enter("Expression", False)
        if(ctx.operator != None):
            print(ctx.operator.text)
        else:
            print(ctx.getText())

    # Exit a parse tree produced by ArduinoParser#expression.
    def exitExpression(self, ctx:ArduinoParser.ExpressionContext):
        self.print_exit()


    # Enter a parse tree produced by ArduinoParser#parameter.
    def enterParameter(self, ctx:ArduinoParser.ParameterContext):
        self.print_enter("Parameter")

    # Exit a parse tree produced by ArduinoParser#parameter.
    def exitParameter(self, ctx:ArduinoParser.ParameterContext):
        self.print_exit()