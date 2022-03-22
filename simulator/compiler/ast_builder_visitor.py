from ast import operator
from cmath import exp
from functools import reduce
from operator import le
from typing import List
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
        if ctx.include_directives != None:
            for include_s in ctx.include_directives:
                decs.append(self.visit(include_s))
        code = []
        if ctx.code != None:
            for sent in ctx.code:
                code.append(self.visit(sent))
        node = ProgramNode(decs, code)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#include.
    def visitInclude(self, ctx:ArduinoParser.IncludeContext):
        file = None
        if ctx.ID(0) != None and ctx.ID(1) != None:
            file = ctx.ID(0).getText() + "." + ctx.ID(1).getText()
        if ctx.STRING_CONST() != None:
            file = ctx.STRING_CONST().getText()
            file = file.replace('"', '')
        node = IncludeNode(file)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#program_code.
    def visitProgram_code(self, ctx:ArduinoParser.Program_codeContext):
        declaration = function = macro = None
        if ctx.var_dec != None:
            declaration = self.visit(ctx.var_dec)
        if ctx.func_def != None:
            function = self.visit(ctx.func_def)
        if ctx.def_mac != None:
            macro = self.visit(ctx.def_mac)
        node = ProgramCodeNode(declaration, function, macro)
        self.__add_line_info(node, ctx)
        return node
    

    # Visit a parse tree produced by ArduinoParser#declaration.
    def visitDeclaration(self, ctx:ArduinoParser.DeclarationContext):
        node = None
        if ctx.declaration() != None:
            node = self.visit(ctx.declaration())
        if ctx.s_def != None:
            node = self.visit(ctx.s_def)
        if ctx.a_def != None:
            node = self.visit(ctx.a_def)
        if ctx.qual != None:
            if ctx.qual.text == "const":
                node.is_const = True
            if ctx.qual.text == "static":
                node.is_static = True
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#simple_declaration.
    def visitSimple_declaration(self, ctx:ArduinoParser.Simple_declarationContext):
        v_type = var_name = expr = None
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.val != None:
            expr = self.visit(ctx.val)
        node = DeclarationNode(v_type, var_name, expr)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#array_declaration.
    def visitArray_declaration(self, ctx:ArduinoParser.Array_declarationContext):
        elements = sizes = []
        v_type = var_name = dimensions = None
        is_constant = False
        if ctx.v_type != None:
            v_type = self.visit(ctx.v_type)
        if ctx.ID() != None:
            var_name = ctx.ID().getText()
        if ctx.elems != None:
            elements = self.visit(ctx.elems)
        if ctx.a_index != None:
            arr_tuple = self.visit(ctx.a_index)
            sizes = arr_tuple[0]
            dimensions = arr_tuple[1]
        if ctx.expr != None:
            expr = ctx.expr.getText().replace('"','')
            for character in expr:
                elements.append(CharNode(character))
        if ctx.expr == None and ctx.elems == None:
            elements = None
        node = ArrayDeclarationNode(v_type, var_name, dimensions, sizes, elements, is_constant)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#define_declaration.
    def visitDefine_macro(self, ctx:ArduinoParser.Define_macroContext):
        name = value = None
        elems = []
        if ctx.ID() != None:
            name = ctx.ID().getText()
        if ctx.val != None:
            value = self.visit(ctx.val)
        if ctx.elems != None:
            elems = self.visit(ctx.elems)
        node = DefineMacroNode(name, value, elems)
        self.__add_line_info(node, ctx)
        return node

    
    # Visit a parse tree produced by ArduinoParser#array_index.
    def visitArray_index(self, ctx:ArduinoParser.Array_indexContext):
        sizes = []
        dimension = 1
        if ctx.sizes != None:
            for size in ctx.sizes:
                sizes.append(int(size.text))
        if ctx.dimensions != None:
            dimension = len(ctx.dimensions)
        return sizes, dimension


    # Visit a parse tree produced by ArduinoParser#array_elements.
    def visitArray_elements(self, ctx:ArduinoParser.Array_elementsContext):
        elements = []
        if ctx.array_elements() != None:
            for elem in ctx.array_elements():
                elements.append(self.visit(elem))
        if ctx.elements != None:
            for elem in ctx.elements:
                elements.append(self.visit(elem))
        return elements


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
        if ctx.getText() == "String":
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
        self.__add_line_info(node, ctx)
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
        node = FunctionNode(v_type, f_name, args, sentences)
        self.__add_line_info(node, ctx)
        return node


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
        it_type = ctx.it_type.text
        sents = []
        if ctx.code != None:
            sents = self.visit(ctx.code)
        if ctx.expr != None:
            expr = self.visit(ctx.expr)
        if it_type == "while":
            node = WhileNode(expr, sents)
        if it_type == "do":
            node = DoWhileNode(expr, sents)
        if it_type == "for":
            if ctx.assign_def != None:
                a_def = self.visit(ctx.assign_def)
            if ctx.condition != None:
                cond = self.visit(ctx.condition)
            node = ForNode(a_def, cond, expr, sents)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#conditional_sentence.
    def visitConditional_sentence(self, ctx:ArduinoParser.Conditional_sentenceContext):
        node = cond = None
        if ctx.expr != None:
            cond = self.visit(ctx.expr)
        if ctx.cond_type.text == "if":
            if_sents = []
            else_sents = []
            if ctx.if_code != None:
                if_sents = self.visit(ctx.if_code)
            if ctx.else_code != None:
                else_sents = self.visit(ctx.else_code)
            node = ConditionalSentenceNode(cond, if_sents, else_sents)
        if ctx.cond_type.text == "switch":
            cases = []
            if ctx.sentences != None:
                for sent in ctx.sentences:
                    cases.append(self.visit(sent))
            node = SwitchSentenceNode(cond, cases)
        self.__add_line_info(node, ctx)
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
        if ctx.dec != None:
            node = self.visit(ctx.dec)
        if ctx.it_sent != None:
            node = self.visit(ctx.it_sent)
        if ctx.cond_sent != None:
            node = self.visit(ctx.cond_sent)
        if ctx.assign != None:
            node = self.visit(ctx.assign)
        if ctx.expr != None:
            node = self.visit(ctx.expr)
        if ctx.def_mac != None:
            node = self.visit(ctx.def_mac)
        if ctx.s_type != None:
            if ctx.s_type.text == "return":
                expr = None
                if ctx.expr != None:
                    expr = self.visit(ctx.expr)
                node = ReturnNode(expr)
            if ctx.s_type.text == "break":
                node = BreakNode()
            if ctx.s_type.text == "continue":
                node = ContinueNode()
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#assignment.
    def visitAssignment(self, ctx:ArduinoParser.AssignmentContext):
        assign = value = None
        if ctx.assign != None:
            assign = self.visit(ctx.assign)
        if ctx.value != None:
            value = self.visit(ctx.value)
        node = AssignmentNode(assign, value)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#case_sentence.
    def visitCase_sentence(self, ctx:ArduinoParser.Case_sentenceContext):
        expr = s_type = None
        sents = []
        if ctx.sent_type != None:
            s_type = ctx.sent_type.text
        if ctx.expr != None:
            expr = self.visit(ctx.expr)
        if ctx.sentences != None:
            for sent in ctx.sentences:
                sents.append(self.visit(sent))
        node = CaseNode(s_type, expr, sents)
        self.__add_line_info(node, ctx)
        return node


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
        if ctx.array_name != None:
            name = ctx.array_name.text
            indexes = []
            if ctx.indexes != None:
                for i in ctx.indexes:
                    indexes.append(int(i.text))
            node = ArrayAccessNode(name, indexes)
        if ctx.operator != None:
            left = right = expr = None
            op = ctx.operator
            if ctx.left != None:
                left = self.visit(ctx.left)
            if ctx.right != None:
                right = self.visit(ctx.right)
            if ctx.expr != None:
                expr = self.visit(ctx.expr)
            if op != None:
                operator = op.text
                if operator == '++' or operator == '--':
                    node = IncDecExpressionNode(expr, operator)
                if operator in arit_ops:
                    node = ArithmeticExpressionNode(left, operator, right)
                if operator in bitwise_ops:
                    node = BitwiseExpressionNode(left, operator, right)
                if operator in bool_ops:
                    node = BooleanExpressionNode(left, operator, right)
                if operator in comp_ops:
                    node = ComparisonExpressionNode(left, operator, right)
                if operator in comp_assign_ops:
                    node = CompoundAssignmentNode(left, operator, right)
                if operator == '!':
                    node = NotExpressionNode(expr)
                if operator == '~':
                    node = BitNotExpressionNode(expr)
        if ctx.getText() == "true":
            node = BooleanNode(True)
        elif ctx.getText() == "false":
            node = BooleanNode(False)
        if ctx.HEX_CONST() != None:
            node = HexNode(int(ctx.HEX_CONST().getText(), 16))
        if ctx.OCTAL_CONST() != None:
            node = OctalNode(int(ctx.OCTAL_CONST().getText(), 8))
        if ctx.BINARY_CONST() != None:
            node = BinaryNode(int(ctx.BINARY_CONST().getText(), 2))
        if ctx.INT_CONST() != [] and ctx.array_name == None:
            node = IntNode(int(ctx.INT_CONST(0).getText()))
        if ctx.FLOAT_CONST() != None:
            node = FloatNode(float(ctx.FLOAT_CONST().getText()))
        if ctx.CHAR_CONST() != None:
            char_const = ctx.CHAR_CONST().getText()
            char_const = char_const.replace('\'', '')
            node = CharNode(char_const)
        if ctx.STRING_CONST() != None:
            string_const = ctx.STRING_CONST().getText()
            string_const = string_const.replace('"', '')
            node = StringNode(string_const)
        if ctx.ID() != None and ctx.array_name == None:
            node = IDNode(ctx.ID().getText())
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#function_call.
    def visitFunction_call(self, ctx:ArduinoParser.Function_callContext):
        params = []
        name = None
        if ctx.function_call() != None:
            node = self.visit(ctx.f_call)
            node.clase = ctx.obj.text
            if len(ctx.elems) > 0:
                node.elems = []
                for elem in ctx.elems:
                    node.elems.append(elem.text)
            return node
        else:
            name = ctx.f_name.text
        if ctx.args != None:
            params = self.visit(ctx.args)
        node = FunctionCallNode(name, params)
        self.__add_line_info(node, ctx)
        return node


    # Visit a parse tree produced by ArduinoParser#parameter.
    def visitParameter(self, ctx:ArduinoParser.ParameterContext):
        params = []
        if ctx.parameters != None:
            for param in ctx.parameters:
                params.append(self.visit(param))
        return params


    def __add_line_info(self, node, ctx):
        node.set_line(ctx.start.line)
        node.set_position(ctx.start.column)


del ArduinoParser