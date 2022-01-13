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


    # Enter a parse tree produced by ArduinoParser#declaration.
    def enterDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        if ctx.STRING_CONST == None:
            self.add_token("Declaration", ctx.h_file())
        else:
            self.add_token("Declaration", ctx.STRING_CONST())

    # Exit a parse tree produced by ArduinoParser#declaration.
    def exitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        pass


    # Enter a parse tree produced by ArduinoParser#h_file.
    def enterH_file(self, ctx:ArduinoParser.H_fileContext):
        pass

    # Exit a parse tree produced by ArduinoParser#h_file.
    def exitH_file(self, ctx:ArduinoParser.H_fileContext):
        pass


    # Enter a parse tree produced by ArduinoParser#definition.
    def enterDefinition(self, ctx:ArduinoParser.DefinitionContext):
        self.add_token("Definition")

    # Exit a parse tree produced by ArduinoParser#definition.
    def exitDefinition(self, ctx:ArduinoParser.DefinitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#simple_definition.
    def enterSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        self.add_token("Simple_definition", str(ctx.ID()))

    # Exit a parse tree produced by ArduinoParser#simple_definition.
    def exitSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#assignment_definition.
    def enterAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        self.add_token("Assignment_definition")

    # Exit a parse tree produced by ArduinoParser#assignment_definition.
    def exitAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#assignment.
    def enterAssignment(self, ctx:ArduinoParser.AssignmentContext):
        self.add_token("Assignment", str(ctx.ID()) + " = " + str(ctx.expression().getText()))

    # Exit a parse tree produced by ArduinoParser#assignment.
    def exitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_definition.
    def enterArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        self.add_token("Array_definition")

    # Exit a parse tree produced by ArduinoParser#array_definition.
    def exitArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#constant.
    def enterConstant(self, ctx:ArduinoParser.ConstantContext):
        if(ctx.ID() == None):
            self.add_token("Constant")
        else:
            self.add_token("Constant", ctx.ID())


    # Exit a parse tree produced by ArduinoParser#constant.
    def exitConstant(self, ctx:ArduinoParser.ConstantContext):
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


    # Enter a parse tree produced by ArduinoParser#incdec_expression.
    def enterIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        self.add_token("Incdec_expression", ctx.operator.text)

    # Exit a parse tree produced by ArduinoParser#incdec_expression.
    def exitIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function_call.
    def enterFunction_call(self, ctx:ArduinoParser.Function_callContext):
        self.add_token("Function_call", ctx.ID())

    # Exit a parse tree produced by ArduinoParser#function_call.
    def exitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        pass


    # Enter a parse tree produced by ArduinoParser#parameter.
    def enterParameter(self, ctx:ArduinoParser.ParameterContext):
        self.add_token("Parameter")

    # Exit a parse tree produced by ArduinoParser#parameter.
    def exitParameter(self, ctx:ArduinoParser.ParameterContext):
        pass


    # Enter a parse tree produced by ArduinoParser#static_variable.
    def enterStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        self.add_token("Static_variable")

    # Exit a parse tree produced by ArduinoParser#static_variable.
    def exitStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        pass

