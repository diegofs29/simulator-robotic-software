from .ArduinoListener import ArduinoListener
from antlr4 import *

if __name__ is not None and "." in __name__:
    from .ArduinoParser import ArduinoParser
else:
    from ArduinoParser import ArduinoParser

# This class defines a complete listener for a parse tree produced by ArduinoParser.
class ArduinoListenerTests(ArduinoListener):

    def __init__(self):
        self.tokens = []


    def add_token(self, text, value=None):
        if value == None:
            self.tokens.append(text)
        else:
            self.tokens.append(str(text) + ", " + str(value))


    # Enter a parse tree produced by ArduinoParser#start.
    def enterStart(self, ctx:ArduinoParser.StartContext):
        self.add_token("Start")

    # Exit a parse tree produced by ArduinoParser#start.
    def exitStart(self, ctx:ArduinoParser.StartContext):
        pass


    # Enter a parse tree produced by ArduinoParser#program.
    def enterProgram(self, ctx:ArduinoParser.ProgramContext):
        self.add_token("Program")

    # Exit a parse tree produced by ArduinoParser#program.
    def exitProgram(self, ctx:ArduinoParser.ProgramContext):
        pass


    # Enter a parse tree produced by ArduinoParser#program_code.
    def enterProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        self.add_token("Program_code")

    # Exit a parse tree produced by ArduinoParser#program_code.
    def exitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        pass


    # Enter a parse tree produced by ArduinoParser#include.
    def enterInclude(self, ctx:ArduinoParser.IncludeContext):
        if ctx.STRING_CONST() != None:
            self.add_token("Include", ctx.STRING_CONST())
        else:
            self.add_token("Include", str(ctx.ID(0)) + "." + str(ctx.ID(1)))

    # Exit a parse tree produced by ArduinoParser#include.
    def exitInclude(self, ctx:ArduinoParser.IncludeContext):
        pass


    # Enter a parse tree produced by ArduinoParser#declaration.
    def enterDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        self.add_token("Declaration")

    # Exit a parse tree produced by ArduinoParser#declaration.
    def exitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        pass


    # Enter a parse tree produced by ArduinoParser#simple_declaration.
    def enterSimple_declaration(self, ctx:ArduinoParser.Simple_declarationContext):
        self.add_token("Simple_declaration", str(ctx.ID()))

    # Exit a parse tree produced by ArduinoParser#simple_declaration.
    def exitSimple_declaration(self, ctx:ArduinoParser.Simple_declarationContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_declaration.
    def enterArray_declaration(self, ctx:ArduinoParser.Array_declarationContext):
        self.add_token("Array_declaration", str(ctx.ID()))

    # Exit a parse tree produced by ArduinoParser#array_declaration.
    def exitArray_declaration(self, ctx:ArduinoParser.Array_declarationContext):
        pass


    # Enter a parse tree produced by ArduinoParser#define_declaration.
    def enterDefine_macro(self, ctx:ArduinoParser.Define_macroContext):
        self.add_token("Define_macro", str(ctx.ID()))

    # Exit a parse tree produced by ArduinoParser#define_declaration.
    def exitDefine_macro(self, ctx:ArduinoParser.Define_macroContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_index.
    def enterArray_index(self, ctx:ArduinoParser.Array_indexContext):
        if ctx.sizes != []:
            self.add_token("Array_index", " ".join(map(str, map(lambda size: size.text, ctx.sizes))))
        else:
            self.add_token("Array_index")

    # Exit a parse tree produced by ArduinoParser#array_index.
    def exitArray_index(self, ctx:ArduinoParser.Array_indexContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_elements.
    def enterArray_elements(self, ctx:ArduinoParser.Array_elementsContext):
        self.add_token("Array_elements")

    # Exit a parse tree produced by ArduinoParser#array_elements.
    def exitArray_elements(self, ctx:ArduinoParser.Array_elementsContext):
        pass


    # Enter a parse tree produced by ArduinoParser#var_type.
    def enterVar_type(self, ctx:ArduinoParser.Var_typeContext):
        self.add_token("Var_type", str(ctx.getText()))

    # Exit a parse tree produced by ArduinoParser#var_type.
    def exitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function.
    def enterFunction(self, ctx:ArduinoParser.FunctionContext):
        self.add_token("Function", ctx.ID())

    # Exit a parse tree produced by ArduinoParser#function.
    def exitFunction(self, ctx:ArduinoParser.FunctionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function_args.
    def enterFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        self.add_token("Function_args")

    # Exit a parse tree produced by ArduinoParser#function_args.
    def exitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        pass


    # Enter a parse tree produced by ArduinoParser#iteration_sentence.
    def enterIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        self.add_token("Iteration_sentence", ctx.it_type.text)

    # Exit a parse tree produced by ArduinoParser#iteration_sentence.
    def exitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#conditional_sentence.
    def enterConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        self.add_token("Conditional_sentence", ctx.cond_type.text)

    # Exit a parse tree produced by ArduinoParser#conditional_sentence.
    def exitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#code_block.
    def enterCode_block(self, ctx:ArduinoParser.Code_blockContext):
        self.add_token("Code_block")

    # Exit a parse tree produced by ArduinoParser#code_block.
    def exitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        pass


    # Enter a parse tree produced by ArduinoParser#sentence.
    def enterSentence(self, ctx:ArduinoParser.SentenceContext):
        if(ctx.s_type != None):
            self.add_token("Sentence", ctx.s_type.text)
        else:
            self.add_token("Sentence")


    # Exit a parse tree produced by ArduinoParser#sentence.
    def exitSentence(self, ctx:ArduinoParser.SentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#assignment.
    def enterAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.add_token("Assignment")

    # Exit a parse tree produced by ArduinoParser#assignment.
    def exitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ArduinoParser#case_sentence.
    def enterCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        self.add_token("Case_sentence")

    # Exit a parse tree produced by ArduinoParser#case_sentence.
    def exitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#expression.
    def enterExpression(self, ctx:ArduinoParser.ExpressionContext):
        if ctx.operator != None:
            self.add_token("Expression", ctx.operator.text)
        else:
            self.add_token("Expression", ctx.getText())

    # Exit a parse tree produced by ArduinoParser#expression.
    def exitExpression(self, ctx:ArduinoParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#parameter.
    def enterParameter(self, ctx:ArduinoParser.ParameterContext):
        self.add_token("Parameter")

    # Exit a parse tree produced by ArduinoParser#parameter.
    def exitParameter(self, ctx:ArduinoParser.ParameterContext):
        pass

