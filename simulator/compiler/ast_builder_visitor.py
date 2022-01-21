from ast import operator
from cmath import exp
from operator import le
from antlr4 import *
from .ArduinoVisitor import ArduinoVisitor

from .ast import *
if __name__ is not None and "." in __name__:
    from .ArduinoParser import ArduinoParser
else:
    from ArduinoParser import ArduinoParser

# This class defines a complete generic visitor for a parse tree produced by ArduinoParser.

class ASTBuilderVisitor(ArduinoVisitor):

    # Visit a parse tree produced by ArduinoParser#start.
    def visitStart(self, ctx:ArduinoParser.StartContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#program.
    def visitProgram(self, ctx:ArduinoParser.ProgramContext):
        decs = []
        if ctx.declarations != None:
            for declaration in ctx.declarations:
                decs.append(self.visit(declaration))
        code = []
        if ctx.code != None:
            for sent in ctx.code:
                code.append(self.visit(sent))
        return ProgramNode(decs, code)


    # Visit a parse tree produced by ArduinoParser#program_code.
    def visitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        definition = function = None
        if ctx.var_def != None:
            definition = self.visit(ctx.var_def)
        if ctx.func_def != None:
            function = self.visit(ctx.func_def)
        return ProgramCodeNode(definition, function)


    # Visit a parse tree produced by ArduinoParser#declaration.
    def visitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        file = None
        if ctx.h_file() != None:
            file = ctx.h_file().getText()
        if ctx.STRING_CONST() != None:
            file = ctx.STRING_CONST().getText()
            file = file.replace('"', '')
        return DeclarationNode(file)


    # Visit a parse tree produced by ArduinoParser#h_file.
    def visitH_file(self, ctx:ArduinoParser.H_fileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ArduinoParser#definition.
    def visitDefinition(self, ctx:ArduinoParser.DefinitionContext):
        node = None
        if ctx.s_def != None:
            node = self.visit(ctx.s_def)
        if ctx.a_def != None:
            node = self.visit(ctx.a_def)
        if ctx.assign_def != None:
            node = self.visit(ctx.assign_def)
        if ctx.cte_def != None:
            node = self.visit(ctx.cte_def)
        return node


    # Visit a parse tree produced by ArduinoParser#simple_definition.
    def visitSimple_definition(self, ctx:ArduinoParser.Simple_definitionContext):
        v_type = var_name = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        return DefinitionNode(v_type, var_name)


    # Visit a parse tree produced by ArduinoParser#assignment_definition.
    def visitAssignment_definition(self, ctx:ArduinoParser.Assignment_definitionContext):
        v_type = assignment = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.assign != None:
            assignment = self.visit(ctx.assign)
        return DefinitionNode(v_type, assignment)


    # Visit a parse tree produced by ArduinoParser#assignment.
    def visitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        var_name = expression = index = None
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.expr != None:
            expression = self.visit(ctx.expr)
        if ctx.INT_CONST() != None:
            index = int(ctx.INT_CONST.getText())
        return AssignmentNode(var_name, expression, index)


    # Visit a parse tree produced by ArduinoParser#array_definition.
    def visitArray_definition(self, ctx:ArduinoParser.Array_definitionContext):
        elements = []
        v_type = var_name = size = expression = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.elements != None:
            for elem in ctx.elements:
                elements.append(self.visit(elem))
        if ctx.INT_CONST() != None:
            size = ctx.INT_CONST
        else:
            size = len(elements)
        if ctx.expr != None:
            expression = ctx.expr
        return ArrayDefinitionNode(v_type, var_name, size, elements, expression)


    # Visit a parse tree produced by ArduinoParser#constant.
    def visitConstant(self, ctx:ArduinoParser.ConstantContext):
        v_type = var_name = assignment = value = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.assign != None:
            assignment = self.visit(ctx.assign)
        if ctx.expr != None:
            value = self.visit(ctx.expr)
        return DefinitionNode(v_type, var_name, assignment, True, value)


    # Visit a parse tree produced by ArduinoParser#var_type.
    def visitVar_type(self, ctx:ArduinoParser.Var_typeContext):
        node = None
        if ctx.ID() != None:
            node = IDTypeNode(ctx.ID().getText())
        if ctx.getText() == "bool" or ctx.getText() == "boolean":
            node = BooleanTypeNode()
        if ctx.getText() == "byte":
            node = ByteTypeNode()
        if ctx.getText() == "char":
            node = CharTypeNode()
        if ctx.getText() == "double":
            node = DoubleTypeNode()
        if ctx.getText() == "float":
            node = FloatTypeNode()
        if ctx.getText() == "int":
            node = IntTypeNode()
        if ctx.getText() == "long":
            node = LongTypeNode()
        if ctx.getText() == "short":
            node = ShortTypeNode()
        if ctx.getText() == "size_t":
            node = Size_tTypeNode()
        if ctx.getText() == "string":
            node = StringTypeNode()
        if ctx.getText() == "unsigned int":
            node = UIntTypeNode()
        if ctx.getText() == "unsigned char":
            node = UCharTypeNode()
        if ctx.getText() == "unsigned long":
            node = ULongTypeNode()
        if ctx.getText() == "void":
            node = VoidTypeNode()
        if ctx.getText() == "word":
            node = WordTypeNode()
        return node


    # Visit a parse tree produced by ArduinoParser#function.
    def visitFunction(self, ctx:ArduinoParser.FunctionContext):
        v_type = f_name = None
        args = []
        sentences = []
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            f_name = ctx.ID().getText()
        if ctx.f_args != None:
            args = self.visit(ctx.f_args)
        if ctx.sentences != None:
            for sent in ctx.sentences:
                sentences.append(self.visit(sent))
        return FunctionNode(v_type, f_name, args, sentences)


    # Visit a parse tree produced by ArduinoParser#function_args.
    def visitFunction_args(self, ctx:ArduinoParser.Function_argsContext):
        args = []
        if ctx.f_args != None:
            for arg in ctx.f_args:
                args.append(self.visit(arg))
        return args


    # Visit a parse tree produced by ArduinoParser#iteration_sentence.
    def visitIteration_sentence(self, ctx:ArduinoParser.Iteration_sentenceContext):
        node = expr = a_def = cond = None
        it_type = ctx.it_type
        sents = []
        if ctx.code != None:
            sents = self.visit(ctx.code)
        if ctx.expr != None:
            expr = self.visit(expr)
        if it_type == "while":
            node = WhileNode(expr, sents)
        if it_type == "do":
            node = DoWhileNode(expr, sents)
        if it_type == "for":
            if ctx.assign_def != None:
                a_def = self.visit(ctx.assign_def)
            if ctx.condition != None:
                cond = self.visit(ctx.condition)
            node = ForNode(a_def, cond, ctx.expr, sents)
        return node


    # Visit a parse tree produced by ArduinoParser#conditional_sentence.
    def visitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        node = cond = None
        cond_type = ctx.cond_type
        if ctx.expr != None:
            cond = self.visit(ctx.expr)
        if cond_type == "if":
            if_sents = []
            else_sents = []
            if ctx.if_code != None:
                if_sents = self.visit(ctx.if_code)
            if ctx.else_code != None:
                else_sents = self.visit(ctx.else_code)
            node = ConditionalSentenceNode(cond, if_sents, else_sents)
        if cond_type == "switch":
            cases = []
            if ctx.sentences != None:
                for sent in ctx.sentences:
                    cases.append(self.visit(sent))
            node = SwitchSentenceNode(cond, cases)
        return node


    # Visit a parse tree produced by ArduinoParser#code_block.
    def visitCode_block(self, ctx:ArduinoParser.Code_blockContext):
        sents = []
        if ctx.sentences != None:
            for sent in ctx.sentences:
                sents.append(self.visit(sent))
        return sents


    # Visit a parse tree produced by ArduinoParser#sentence.
    def visitSentence(self, ctx:ArduinoParser.SentenceContext):
        node = None
        if ctx.a_def != None:
            node = self.visit(ctx.a_def)
        if ctx.s_def != None:
            node = self.visit(ctx.s_def)
        if ctx.arr_def != None:
            node = self.visit(ctx.arr_def)
        if ctx.s_var != None:
            node = self.visit(ctx.s_var)
        if ctx.it_sent != None:
            node = self.visit(ctx.it_sent)
        if ctx.cond_sent != None:
            node = self.visit(ctx.cond_sent)
        if ctx.expr != None:
            node = self.visit(ctx.expr)
        if ctx.s_type == "return":
            node = ReturnNode(ctx.expr)
        if ctx.s_type == "break":
            node = BreakNode()
        if ctx.s_type == "continue":
            node = ContinueNode()
        return node


    # Visit a parse tree produced by ArduinoParser#case_sentence.
    def visitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        expr = s_type = None
        sents = []
        if ctx.sent_type != None:
            s_type = ctx.sent_type
        if ctx.expr != None:
            expr = self.visit(ctx.expr)
        if ctx.sentences != None:
            for sent in ctx.sentences:
                sents.append(self.visit(sent))
        return CaseNode(s_type, expr, sents)


    # Visit a parse tree produced by ArduinoParser#expression.
    def visitExpression(self, ctx:ArduinoParser.ExpressionContext):
        node = None
        arit_ops = {'*', '/', '%', '+', '-'}
        bitwise_ops = {'<<', '>>', '&', '^', '|'}
        bool_ops = {'&&', '||'}
        comp_ops = {'==', '!=', '>', '>=', '<', '<='}
        comp_assign_ops = {'%=', '&=', '*=', '+=', '-=', '/=', '^=', '|='}
        if ctx.r_expr != None:
            node = self.visit(ctx.r_expr)
        if ctx.f_call != None:
            node = self.visit(ctx.f_call)
        if ctx.i_d_expr != None:
            node = self.visit(ctx.i_d_expr)
        if ctx.array_name != None:
            expr = self.visit(ctx.array_name)
            index = None
            if ctx.index != None:
                index = self.visit(ctx.index)
            node = ArrayAccessNode(expr, index)
        if ctx.assign != None:
            node = self.visit(ctx.assign)
        if ctx.operator != None:
            left = right = expr = None
            op = ctx.operator
            if ctx.left != None:
                left = self.visit(ctx.left)
            if ctx.right != None:
                right = self.visit(ctx.right)
            if ctx.expr != None:
                expr = self.visit(ctx.expr)
            if op in arit_ops:
                node = ArithmeticExpressionNode(left, op, right)
            if op in bitwise_ops:
                node = BitwiseExpressionNode(left, op, right)
            if op in bool_ops:
                node = BooleanExpressionNode(left, op, right)
            if op in comp_ops:
                node = ComparisonExpressionNode(left, op, right)
            if op in comp_assign_ops:
                node = CompoundAssignmentNode(left, op, right)
            if op == '!':
                node = NotExpressionNode(expr)
            if op == '~':
                node = BitNotExpressionNode(expr)
        if ctx.getText() == 'true' or ctx.getText() == 'false':
            node = BooleanNode(ctx.getText())
        if ctx.INT_CONST() != None:
            node = IntNode(ctx.INT_CONST().getText())
        if ctx.FLOAT_CONST() != None:
            node = FloatNode(ctx.FLOAT_CONST().getText())
        if ctx.CHAR_CONST() != None:
            node = CharNode(ctx.CHAR_CONST().getText())
        if ctx.STRING_CONST() != None:
            node = StringNode(ctx.STRING_CONST().getText())
        if ctx.ID() != None:
            node = IDNode(ctx.ID().getText())
        return node


    # Visit a parse tree produced by ArduinoParser#incdec_expression.
    def visitIncdec_expression(self, ctx:ArduinoParser.Incdec_expressionContext):
        return IncDecExpressionNode(ctx.ID().getText(), ctx.operator)


    # Visit a parse tree produced by ArduinoParser#function_call.
    def visitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        params = []
        if ctx.args != None:
            params = self.visit(ctx.args)
        return FunctionCallNode(ctx.ID().getText(), params)


    # Visit a parse tree produced by ArduinoParser#parameter.
    def visitParameter(self, ctx:ArduinoParser.ParameterContext):
        params = []
        if ctx.parameters != None:
            for param in ctx.parameters:
                params.append(self.visit(param))
        return params


    # Visit a parse tree produced by ArduinoParser#static_variable.
    def visitStatic_variable(self, ctx:ArduinoParser.Static_variableContext):
        v_type = var_name = assign = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.assign != None:
            assign = self.visit(ctx.assign)
        return StaticVarDefinitionNode(v_type, var_name, assign)


del ArduinoParser