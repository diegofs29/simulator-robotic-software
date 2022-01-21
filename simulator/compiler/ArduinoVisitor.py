# Generated from E:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\Arduino.g4 by ANTLR 4.9.3
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ArduinoParser import ArduinoParser
else:
    from ArduinoParser import ArduinoParser

# This class defines a complete generic visitor for a parse tree produced by ArduinoParser.

class ArduinoVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ArduinoParser#start.
    def visitStart(self, ctx:ArduinoParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#program.
    def visitProgram(self, ctx:ArduinoParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#program_code.
    def visitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#declaration.
    def visitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#h_file.
    def visitH_file(self, ctx:ArduinoParser.H_fileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#definition.
    def visitDefinition(self, ctx:ArduinoParser.DefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#simple_definition.
    def visitSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#assignment_definition.
    def visitAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#assignment.
    def visitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#array_definition.
    def visitArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#array_index.
    def visitArray_index(self, ctx:ArduinoParser.Array_indexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#constant.
    def visitConstant(self, ctx:ArduinoParser.ConstantContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#var_type.
    def visitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#function.
    def visitFunction(self, ctx:ArduinoParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#function_args.
    def visitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#iteration_sentence.
    def visitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#conditional_sentence.
    def visitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#code_block.
    def visitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#sentence.
    def visitSentence(self, ctx:ArduinoParser.SentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#case_sentence.
    def visitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#expression.
    def visitExpression(self, ctx:ArduinoParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#incdec_expression.
    def visitIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#function_call.
    def visitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#parameter.
    def visitParameter(self, ctx:ArduinoParser.ParameterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#static_variable.
    def visitStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        return self.visitChildren(ctx)



del ArduinoParser