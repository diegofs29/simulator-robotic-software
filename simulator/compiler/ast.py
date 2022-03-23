from functools import reduce


class ASTNode():

    def accept(self, visitor, param):
        pass

    def set_position(self, position):
        self.position = position

    def set_line(self, line):
        self.line = line


class TypeNode(ASTNode):

    def default_array_value(self):
        pass


class Sentence(ASTNode):

    def __init__(self):
        super().__init__()
        self.function = None
        self.is_loop_sent = False

    def set_function(self, function):
        self.function = function

    def set_is_loop_sent(self, is_loop_sent):
        self.is_loop_sent = is_loop_sent


class Expression(Sentence):

    def __init__(self):
        super().__init__()
        self.type = None
        self.modifiable = False

    def set_type(self, type):
        self.type = type

    def set_modifiable(self, modifiable):
        self.modifiable = modifiable


class ProgramNode(ASTNode):

    def __init__(self, includes=None, code=None):
        super().__init__()
        self.includes = includes
        self.code = code

    def accept(self, visitor, param):
        return visitor.visit_program(self, param)


class IncludeNode(ASTNode):

    def __init__(self, file_name):
        super().__init__()
        self.file_name = file_name

    def accept(self, visitor, param):
        return visitor.visit_include(self, param)


class ProgramCodeNode(ASTNode):

    def __init__(self, declaration, function, macro):
        super().__init__()
        self.declaration = declaration
        self.function = function
        self.macro = macro

    def accept(self, visitor, param):
        return visitor.visit_program_code(self, param)


class DeclarationNode(Sentence):

    def __init__(self, type, var_name=None, expr=None, is_const=False, is_static=False):
        super().__init__()
        self.type = type
        self.var_name = var_name
        self.expr = expr
        self.is_const = is_const
        self.is_static = is_static

    def accept(self, visitor, param):
        return visitor.visit_declaration(self, param)


class ArrayDeclarationNode(Sentence):

    def __init__(self, type, var_name, dimensions, size=[], elements=[], is_const=False, is_static=False):
        super().__init__()
        self.type = type
        self.var_name = var_name
        self.dimensions = dimensions
        self.size = size
        self.elements = elements
        self.is_const = is_const
        self.is_static = is_static
        if not (len(self.size) < 1 and (self.elements == [] or self.elements == None)):
            self.__fix_array()

    def accept(self, visitor, param):
        return visitor.visit_array_declaration(self, param)

    def __fix_array(self):
        if len(self.size) < self.dimensions:
            self.__fix_size()
        if self.elements != None:
            self.elements = self.__organize_array_elements(self.elements)

    def __fix_size(self):
        n = len(self.elements)
        if len(self.size) > 0:
            n = self.size[0]
        for i in range(1, len(self.size)):
            n *= self.size[i]
        if self.elements != []:
            n_elements = self.__total_elements(self.elements)
        size_of_rows = n
        if n < n_elements:
            size_of_rows = int(n_elements / n)
            if n_elements % n != 0:
                size_of_rows += 1
        self.size.insert(0, size_of_rows)

    def __total_elements(self, elements):
        count = 0
        for elem in elements:
            if isinstance(elem, list):
                count += self.__total_elements(elem)
            else:
                count += 1
        return count

    def __organize_array_elements(self, current_elems, array_level=0):
        elems = []
        for i in range(0, self.size[array_level]):
            if array_level < self.dimensions-1:
                sub_elems = current_elems[i]
                # implies its 2d but declared as 1d
                if not isinstance(current_elems[i], list):
                    total = reduce(lambda n, e: n*e, self.size[array_level+1:])
                    sub_elems = current_elems[i*total:(i+1)*total]
                elems.append(self.__organize_array_elements(
                    sub_elems, array_level+1))
            else:
                if i < len(current_elems):
                    elems.append(current_elems[i])
                else:
                    elems.append(self.type.default_array_value())
        return elems


class DefineMacroNode(Sentence):

    def __init__(self, macro_name, expr=None, elements=[]):
        super().__init__()
        self.macro_name = macro_name
        self.expr = expr
        self.elements = elements

    def accept(self, visitor, param):
        return visitor.visit_define_macro(self, param)


class AssignmentNode(Sentence):

    def __init__(self, var, expr, index=None):
        super().__init__()
        self.var = var
        self.expr = expr

    def accept(self, visitor, param):
        return visitor.visit_assignment(self, param)


class BooleanTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_boolean_type(self, param)

    def default_array_value(self):
        return BooleanNode(False)


class ByteTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_byte_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class CharTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_char_type(self, param)

    def default_array_value(self):
        return CharNode('\0')


class DoubleTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_double_type(self, param)

    def default_array_value(self):
        return FloatNode(0.0)


class FloatTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_float_type(self, param)

    def default_array_value(self):
        return FloatNode(0.0)


class IntTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_int_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class LongTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_long_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class ShortTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return IntNode(0)

    def default_array_value(self):
        return IntNode(0)


class Size_tTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_size_t_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class StringTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_string_type(self, param)

    def default_array_value(self):
        return StringNode("")


class UIntTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_u_int_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class UCharTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_u_char_type(self, param)

    def default_array_value(self):
        return CharNode('\0')


class ULongTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_u_long_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class VoidTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_void_type(self, param)

    def default_array_value(self):
        return None


class WordTypeNode(TypeNode):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_word_type(self, param)

    def default_array_value(self):
        return IntNode(0)


class IDTypeNode(TypeNode):

    def __init__(self, type_name):
        super().__init__()
        self.type_name = type_name

    def accept(self, visitor, param):
        return visitor.visit_id_type(self, param)

    def default_array_value(self):
        return None


class FunctionNode(ASTNode):

    def __init__(self, type, name, args=None, sentences=None):
        super().__init__()
        self.type = type
        self.name = name
        self.args = args
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_function(self, param)


class WhileNode(Sentence):

    def __init__(self, expression, sentences=None):
        super().__init__()
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_while(self, param)


class DoWhileNode(Sentence):

    def __init__(self, expression, sentences=None):
        super().__init__()
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_do_while(self, param)


class ForNode(Sentence):

    def __init__(self, assignment, condition, expression, sentences=None):
        super().__init__()
        self.assignment = assignment
        self.condition = condition
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_for(self, param)


class ConditionalSentenceNode(Sentence):

    def __init__(self, condition, if_expr=None, else_expr=None):
        super().__init__()
        self.condition = condition
        self.if_expr = if_expr
        self.else_expr = else_expr

    def accept(self, visitor, param):
        return visitor.visit_conditional_sentence(self, param)


class SwitchSentenceNode(Sentence):

    def __init__(self, expression, cases=None):
        super().__init__()
        self.expression = expression
        self.cases = cases

    def accept(self, visitor, param):
        return visitor.visit_switch_sentence(self, param)


class CaseNode(Sentence):

    def __init__(self, type="case", expression=None, sentences=None):
        super().__init__()
        self.type = type
        self.expression = expression
        self.sentences = sentences

    def accept(self, visitor, param):
        return visitor.visit_case(self, param)


class ArrayAccessNode(Expression):

    def __init__(self, value, indexes):
        super().__init__()
        self.value = value
        self.indexes = indexes

    def accept(self, visitor, param):
        return visitor.visit_array_access(self, param)


class ArithmeticExpressionNode(Expression):

    def __init__(self, left, op, right):
        super().__init__()
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_arithmetic_expression(self, param)


class ComparisonExpressionNode(Expression):

    def __init__(self, left, op, right):
        super().__init__()
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_comparision_expression(self, param)


class BooleanExpressionNode(Expression):

    def __init__(self, left, op, right):
        super().__init__()
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_boolean_expression(self, param)


class BitwiseExpressionNode(Expression):

    def __init__(self, left, op, right):
        super().__init__()
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_bitwise_expression(self, param)


class CompoundAssignmentNode(Expression):

    def __init__(self, left, op, right):
        super().__init__()
        self.left = left
        self.op = op
        self.right = right

    def accept(self, visitor, param):
        return visitor.visit_compound_assigment(self, param)


class IncDecExpressionNode(Expression):

    def __init__(self, var, op):
        super().__init__()
        self.var = var
        self.op = op

    def accept(self, visitor, param):
        return visitor.visit_inc_dec_expression(self, param)


class NotExpressionNode(Expression):

    def __init__(self, expression):
        super().__init__()
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_not_expression(self, param)


class BitNotExpressionNode(Expression):

    def __init__(self, expression):
        super().__init__()
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_bit_not_expression(self, param)


class IntNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_int(self, param)


class FloatNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_float(self, param)


class HexNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_hex(self, param)


class OctalNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_octal(self, param)


class BinaryNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_binary(self, param)


class CharNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_char(self, param)


class StringNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_string(self, param)


class BooleanNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_boolean(self, param)


class IDNode(Expression):

    def __init__(self, value):
        super().__init__()
        self.value = value

    def accept(self, visitor, param):
        return visitor.visit_id(self, param)

    def set_definition(self, definition):
        self.definition = definition


class MemberAccessNode(Expression):

    def __init__(self, element, member):
        super().__init__()
        self.element = element
        self.member = member

    def accept(self, visitor, param):
        return visitor.visit_member_access(self, param)


class FunctionCallNode(Expression):

    def __init__(self, name, parameters=None):
        super().__init__()
        self.name = name
        self.parameters = parameters

    def accept(self, visitor, param):
        return visitor.visit_function_call(self, param)


class ReturnNode(Sentence):

    def __init__(self, expression=None):
        super().__init__()
        self.expression = expression

    def accept(self, visitor, param):
        return visitor.visit_return(self, param)


class BreakNode(Sentence):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_break(self, param)


class ContinueNode(Sentence):

    def __init__(self):
        super().__init__()

    def accept(self, visitor, param):
        return visitor.visit_continue(self, param)
