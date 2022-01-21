class ProgramNode():

    def __init__(self, declarations=None, code=None):
        self.declarations = declarations
        self.code = code


class DeclarationNode():

    def __init__(self, file_name):
        self.file_name = file_name


class ProgramCodeNode():

    def __init__(self, definition=None, function=None):
        self.definition = definition
        self.function = function


class DefinitionNode():

    def __init__(self, type, var_name=None, value=None, is_constant=False):
        self.type = type
        self.var_name = var_name
        self.is_constant = is_constant
        self.value = value


class ArrayDefinitionNode():

    def __init__(self, type, var_name, sizes=None, elements=None, expression=None):
        self.type = type
        self.var_name = var_name
        self.size = sizes
        self.elements = elements
        self.expression = expression


class AssignmentNode():

    def __init__(self, var_name, expression, index=None):
        self.var_name = var_name
        self.expression = expression
        self.index = index


class BooleanTypeNode():

    def __init__(self):
        pass
    
    
class ByteTypeNode():

    def __init__(self):
        pass


class CharTypeNode():

    def __init__(self):
        pass


class DoubleTypeNode():

    def __init__(self):
        pass


class FloatTypeNode():

    def __init__(self):
        pass


class IntTypeNode():

    def __init__(self):
        pass


class LongTypeNode():

    def __init__(self):
        pass


class ShortTypeNode():

    def __init__(self):
        pass


class Size_tTypeNode():

    def __init__(self):
        pass


class StringTypeNode():

    def __init__(self):
        pass


class UIntTypeNode():

    def __init__(self):
        pass


class UCharTypeNode():

    def __init__(self):
        pass
    
    
class ULongTypeNode():

    def __init__(self):
        pass


class VoidTypeNode():

    def __init__(self):
        pass


class WordTypeNode():

    def __init__(self):
        pass


class IDTypeNode():

    def __init__(self, type_name):
        self.type_name = type_name


class DoubleTypeNode():

    def __init__(self):
        pass


class FunctionNode():

    def __init__(self, type, name, args=None, sentences=None):
        self.type = type
        self.name = name
        self.args = args
        self.sentences = sentences


class WhileNode():

    def __init__(self, expression, sentences=None):
        self.expression = expression
        self.sentences = sentences


class DoWhileNode():

    def __init__(self, expression, sentences=None):
        self.expression = expression
        self.sentences = sentences


class ForNode():

    def __init__(self, assignment, condition, expression, sentences=None):
        self.assignment = assignment
        self.condition = condition
        self.expression = expression
        self.sentences = sentences


class ConditionalSentenceNode():

    def __init__(self, condition, if_expr=None, else_expr=None):
        self.condition = condition
        self.if_expr = if_expr
        self.else_expr = else_expr


class SwitchSentenceNode():

    def __init__(self, expression, cases=None):
        self.expression = expression
        self.cases = cases


class CaseNode():

    def __init__(self, type="case", expression=None, sentence=None):
        self.type = type
        self.expression = expression
        self.sentence = sentence


class StaticVarDefinitionNode():

    def __init__(self, type, var_name, val=None):
        self.type = type
        self.var_name = var_name
        self.val = val


class ArrayAccessNode():

    def __init__(self, var, index):
        self.var = var
        self.index = index


class ArithmeticExpressionNode():

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right


class ComparisonExpressionNode():

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right
        
        
class BooleanExpressionNode():

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right


class BitwiseExpressionNode():

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right


class CompoundAssignmentNode():

    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right

    
class IncDecExpressionNode():

    def __init__(self, var, op):
        self.var = var
        self.op = op


class NotExpressionNode():

    def __init__(self, expression):
        self.expression = expression


class BitNotExpressionNode():

    def __init__(self, expression):
        self.expression = expression


class IntNode():

    def __init__(self, value):
        self.value = value


class FloatNode():

    def __init__(self, value):
        self.value = value


class CharNode():

    def __init__(self, value):
        self.value = value


class StringNode():

    def __init__(self, value):
        self.value = value


class BooleanNode():

    def __init__(self, value):
        self.value = value


class IDNode():

    def __init__(self, value):
        self.value = value


class FunctionCallNode():

    def __init__(self, name, parameters=None):
        self.name = name
        self.parameters = parameters


class ReturnNode():

    def __init__(self, expression=None):
        self.expression = expression


class BreakNode():

    def __init__(self):
        pass


class ContinueNode():

    def __init__(self):
        pass