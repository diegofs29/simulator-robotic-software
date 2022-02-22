class ASTNode():

    def accept(self, visitor, param):
        pass

class ProgramNode(ASTNode):

    def __init__(self, declarations=None, code=None):
        self.declarations = declarations
        self.code = code

    def accept(self, visitor, param):
        return visitor.visit_program(self, param)


class DeclarationNode(ASTNode):

    def __init__(self, file_name):
        self.file_name = file_name

    def accept(self, visitor, param):
        return visitor.visit_declaration(self, param)


class ProgramCodeNode(ASTNode):

    def __init__(self, definition=None, function=None):
        self.definition = definition
        self.function = function

    def accept(self, visitor, param):
        return visitor.visit_program_code(self, param)


class DefinitionNode(ASTNode):

    def __init__(self, type, var_name=None, expr=None, is_constant=False):
        self.type = type
        self.var_name = var_name
        self.is_constant = is_constant
        self.expr = expr

    def accept(self, visitor, param):
        return visitor.visit_definition(self, param)


class ArrayDefinitionNode(ASTNode):

    def __init__(self, type, var_name, size=None, elements=None, is_constant=False):
        self.type = type
        self.var_name = var_name
        self.size = size
        self.elements = elements
        self.is_constant = is_constant

    def accept(self, visitor, param):
        return visitor.visit_array_definition(self, param)


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


class StaticVarDefinitionNode(ASTNode):

    def __init__(self, type, var_name, expr=None):
        self.type = type
        self.var_name = var_name
        self.expr = expr

    def accept(self, visitor, param):
        return visitor.visit_static_var_definition(self, param)


class ArrayAccessNode(ASTNode):

    def __init__(self, var, index):
        self.var = var
        self.index = index

    def accept(self, visitor, param):
        return visitor.visit_array_access(self, param)


class ArithmeticExpressionNode(ASTNode):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_arithmetic_expression(self, param)


class ComparisonExpressionNode(ASTNode):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_comparision_expression(self, param)
        
        
class BooleanExpressionNode(ASTNode):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_boolean_expression(self, param)


class BitwiseExpressionNode(ASTNode):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_bitwise_expression(self, param)


class CompoundAssignmentNode(ASTNode):

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_compound_assigment(self, param)

    
class IncDecExpressionNode(ASTNode):

    def __init__(self, var, op):
        self.var = var
        self.op = op

    def accept(self, visitor, param):
        return visitor.visit_inc_dec_expression(self, param)


class NotExpressionNode(ASTNode):

    def __init__(self, expression):
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_not_expression(self, param)


class BitNotExpressionNode(ASTNode):

    def __init__(self, expression):
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_bit_not_expression(self, param)


class IntNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_int(self, param)


class FloatNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_float(self, param)


class HexNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_hex(self, param)


class OctalNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_octal(self, param)


class BinaryNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_binary(self, param)


class CharNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_char(self, param)


class StringNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_string(self, param)


class BooleanNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_boolean(self, param)


class IDNode(ASTNode):

    def __init__(self, value):
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_id(self, param)


class FunctionCallNode(ASTNode):

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