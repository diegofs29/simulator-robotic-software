# Generated from E:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\Arduino.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ArduinoParser import ArduinoParser
else:
    from ArduinoParser import ArduinoParser

# This class defines a complete listener for a parse tree produced by ArduinoParser.
class ArduinoListener(ParseTreeListener):

    # Enter a parse tree produced by ArduinoParser#start.
    def enterStart(self, ctx:ArduinoParser.StartContext):
        pass

    # Exit a parse tree produced by ArduinoParser#start.
    def exitStart(self, ctx:ArduinoParser.StartContext):
        pass


    # Enter a parse tree produced by ArduinoParser#program.
    def enterProgram(self, ctx:ArduinoParser.ProgramContext):
        pass

    # Exit a parse tree produced by ArduinoParser#program.
    def exitProgram(self, ctx:ArduinoParser.ProgramContext):
        pass


    # Enter a parse tree produced by ArduinoParser#program_code.
    def enterProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        pass

    # Exit a parse tree produced by ArduinoParser#program_code.
    def exitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        pass


    # Enter a parse tree produced by ArduinoParser#declaration.
    def enterDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        pass

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
        pass

    # Exit a parse tree produced by ArduinoParser#definition.
    def exitDefinition(self, ctx:ArduinoParser.DefinitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#simple_definition.
    def enterSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#simple_definition.
    def exitSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#assignment_definition.
    def enterAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#assignment_definition.
    def exitAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#assignment.
    def enterAssignment(self, ctx:ArduinoParser.AssignmentContext):
        pass

    # Exit a parse tree produced by ArduinoParser#assignment.
    def exitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_definition.
    def enterArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#array_definition.
    def exitArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#array_index.
    def enterArray_index(self, ctx:ArduinoParser.Array_indexContext):
        pass

    # Exit a parse tree produced by ArduinoParser#array_index.
    def exitArray_index(self, ctx:ArduinoParser.Array_indexContext):
        pass


    # Enter a parse tree produced by ArduinoParser#constant.
    def enterConstant(self, ctx:ArduinoParser.ConstantContext):
        pass

    # Exit a parse tree produced by ArduinoParser#constant.
    def exitConstant(self, ctx:ArduinoParser.ConstantContext):
        pass


    # Enter a parse tree produced by ArduinoParser#var_type.
    def enterVar_type(self, ctx:ArduinoParser.Var_typeContext):
        pass

    # Exit a parse tree produced by ArduinoParser#var_type.
    def exitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function.
    def enterFunction(self, ctx:ArduinoParser.FunctionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#function.
    def exitFunction(self, ctx:ArduinoParser.FunctionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function_args.
    def enterFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        pass

    # Exit a parse tree produced by ArduinoParser#function_args.
    def exitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        pass


    # Enter a parse tree produced by ArduinoParser#iteration_sentence.
    def enterIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        pass

    # Exit a parse tree produced by ArduinoParser#iteration_sentence.
    def exitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#conditional_sentence.
    def enterConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        pass

    # Exit a parse tree produced by ArduinoParser#conditional_sentence.
    def exitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#code_block.
    def enterCode_block(self, ctx:ArduinoParser.Code_blockContext):
        pass

    # Exit a parse tree produced by ArduinoParser#code_block.
    def exitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        pass


    # Enter a parse tree produced by ArduinoParser#sentence.
    def enterSentence(self, ctx:ArduinoParser.SentenceContext):
        pass

    # Exit a parse tree produced by ArduinoParser#sentence.
    def exitSentence(self, ctx:ArduinoParser.SentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#case_sentence.
    def enterCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        pass

    # Exit a parse tree produced by ArduinoParser#case_sentence.
    def exitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        pass


    # Enter a parse tree produced by ArduinoParser#expression.
    def enterExpression(self, ctx:ArduinoParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#expression.
    def exitExpression(self, ctx:ArduinoParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#incdec_expression.
    def enterIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        pass

    # Exit a parse tree produced by ArduinoParser#incdec_expression.
    def exitIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        pass


    # Enter a parse tree produced by ArduinoParser#function_call.
    def enterFunction_call(self, ctx:ArduinoParser.Function_callContext):
        pass

    # Exit a parse tree produced by ArduinoParser#function_call.
    def exitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        pass


    # Enter a parse tree produced by ArduinoParser#parameter.
    def enterParameter(self, ctx:ArduinoParser.ParameterContext):
        pass

    # Exit a parse tree produced by ArduinoParser#parameter.
    def exitParameter(self, ctx:ArduinoParser.ParameterContext):
        pass


    # Enter a parse tree produced by ArduinoParser#static_variable.
    def enterStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        pass

    # Exit a parse tree produced by ArduinoParser#static_variable.
    def exitStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        pass



del ArduinoParser