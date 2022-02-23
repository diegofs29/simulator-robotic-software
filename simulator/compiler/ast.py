class ASTNode():

    def accept(self, visitor, param):
        pass


class ProgramNode(ASTNode):

    def __init__(self, includes=None, code=None):
        self.includes = includes
        self.code = code

    def accept(self, visitor, param):
        return visitor.visit_program(self, param)


class IncludeNode(ASTNode):

    def __init__(self, file_name):
        self.file_name = file_name

    def accept(self, visitor, param):
        return visitor.visit_include(self, param)


class ProgramCodeNode(ASTNode):

    def __init__(self, declaration=None, function=None):
        self.declaration = declaration
        self.function = function

    def accept(self, visitor, param):
        return visitor.visit_program_code(self, param)


class DeclarationNode(ASTNode):

    def __init__(self, type, var_name=None, expr=None, is_const=False, is_static=False):
        self.type = type
        self.var_name = var_name
        self.expr = expr
        self.is_const = is_const
        self.is_static = is_static

    def accept(self, visitor, param):
        return visitor.visit_definition(self, param)


class ArrayDeclarationNode(ASTNode):

    def __init__(self, type, var_name, size=None, elements=None, is_const=False, is_static=False):
        self.type = type
        self.var_name = var_name
        self.size = size
        if self.size == []:
            self.size = self.__recursive_len(elements, [])
        self.elements = elements
        self.is_const = is_const
        self.is_static = is_static

    def accept(self, visitor, param):
        return visitor.visit_array_definition(self, param)

    def __recursive_len(self, elems, final_sizes):
        sizes = final_sizes
        sub_sizes = []
        for e in elems:
            if isinstance(e, list):
                sub_sizes.append(self.__recursive_len(e, sizes))
            else:
                sub_sizes.append(1)
        sizes.append(len(sub_sizes))
        max_sub = max(sub_sizes)
        if max_sub > 1:
            sizes.append(max_sub)
        sizes.reverse()
        return sizes


class DefineDeclarationNode(ASTNode):

    def __init__(self, macro_name, expr=None, elements=[]):
        self.macro_name = macro_name
        self.expr = expr
        self.elements = elements
        self.size = []
        if elements != []:
            self.size = self.__recursive_len(elements, [])

    def accept(self, visitor, param):
        return visitor.visit_define(self, param)

    def __recursive_len(self, elems, final_sizes):
        sizes = final_sizes
        sub_sizes = []
        for e in elems:
            if isinstance(e, list):
                sub_sizes.append(self.__recursive_len(e, sizes))
            else:
                sub_sizes.append(1)
        sizes.append(len(sub_sizes))
        max_sub = max(sub_sizes)
        if max_sub > 1:
            sizes.append(max_sub)
        sizes.reverse()
        return sizes


class AssignmentNode(ASTNode):

    def __init__(self, var, expr, index=None):
        self.var = var
        self.expr = expr
        self.index = index

    def accept(self, visitor, param):
        return visitor.visit_assignment(self, param)


class BooleanTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_boolean_type(self, param)
    
    
class ByteTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_byte_type(self, param)


class CharTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_char_type(self, param)


class DoubleTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_double_type(self, param)


class FloatTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_float_type(self, param)


class IntTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_int_type(self, param)


class LongTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_long_type(self, param)


class ShortTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_short_type(self, param)


class Size_tTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_size_t_type(self, param)


class StringTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_string_type(self, param)


class UIntTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_u_int_type(self, param)


class UCharTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_u_char_type(self, param)
    
    
class ULongTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_u_long_type(self, param)


class VoidTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_void_type(self, param)


class WordTypeNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_word_type(self, param)


class IDTypeNode(ASTNode):

    def __init__(self, type_name):
        self.type_name = type_name

    def accept(self, visitor, param):
        return visitor.visit_id_type(self, param)


class FunctionNode(ASTNode):

    def __init__(self, type, name, args=None, sentences=None):
        self.type = type
        self.name = name
        self.args = args
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_function(self, param)


class WhileNode(ASTNode):

    def __init__(self, expression, sentences=None):
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_while(self, param)


class DoWhileNode(ASTNode):

    def __init__(self, expression, sentences=None):
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_do_while(self, param)


class ForNode(ASTNode):

    def __init__(self, assignment, condition, expression, sentences=None):
        self.assignment = assignment
        self.condition = condition
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_for(self, param)


class ConditionalSentenceNode(ASTNode):

    def __init__(self, condition, if_expr=None, else_expr=None):
        self.condition = condition
        self.if_expr = if_expr
        self.else_expr = else_expr

    def accept(self, visitor, param):
        return visitor.visit_conditional_sentence(self, param)


class SwitchSentenceNode(ASTNode):

    def __init__(self, expression, cases=None):
        self.expression = expression
        self.cases = cases

    def accept(self, visitor, param):
        return visitor.visit_switch_sentence(self, param)


class CaseNode(ASTNode):

    def __init__(self, type="case", expression=None, sentences=None):
        self.type = type
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_case(self, param)


class Expression(ASTNode):

    def set_type(self, type):
        self.type = type

    def set_modifiable(self, modifiable):
        self.modifiable = modifiable


class ArrayAccessNode(Expression):

    def __init__(self, var, index):
        self.var = var
        self.index = index

    def accept(self, visitor, param):
        return visitor.visit_array_access(self, param)


class ArithmeticExpressionNode(Expression):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_arithmetic_expression(self, param)


class ComparisonExpressionNode(Expression):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_comparision_expression(self, param)
        
        
class BooleanExpressionNode(Expression):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_boolean_expression(self, param)


class BitwiseExpressionNode(Expression):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_bitwise_expression(self, param)


class CompoundAssignmentNode(Expression):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_compound_assigment(self, param)

    
class IncDecExpressionNode(Expression):

    def __init__(self, var, op):
        self.var = var
        self.op = op

    def accept(self, visitor, param):
        return visitor.visit_inc_dec_expression(self, param)


class NotExpressionNode(Expression):

    def __init__(self, expression):
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_not_expression(self, param)


class BitNotExpressionNode(Expression):

    def __init__(self, expression):
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_bit_not_expression(self, param)


class IntNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_int(self, param)


class FloatNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_float(self, param)


class HexNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_hex(self, param)


class OctalNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_octal(self, param)


class BinaryNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_binary(self, param)


class CharNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_char(self, param)


class StringNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_string(self, param)


class BooleanNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_boolean(self, param)


class IDNode(Expression):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_id(self, param)


class FunctionCallNode(Expression):

    def __init__(self, name, parameters=None, clase=None, elems=None):
        self.name = name
        self.parameters = parameters
        self.clase = clase
        self.elems = elems

    def accept(self, visitor, param):
        return visitor.visit_function_call(self, param)


class ReturnNode(ASTNode):

    def __init__(self, expression=None):
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_return(self, param)


class BreakNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_break(self, param)


class ContinueNode(ASTNode):

    def __init__(self):
        pass

    def accept(self, visitor, param):
        return visitor.visit_continue(self, param)