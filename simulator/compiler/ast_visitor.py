from simulator.compiler.ast import ArithmeticExpressionNode, ArrayAccessNode, ArrayDeclarationNode, AssignmentNode, BinaryNode, BitNotExpressionNode, BitwiseExpressionNode, BooleanExpressionNode, BooleanNode, BooleanTypeNode, BreakNode, ByteTypeNode, CaseNode, CharNode, CharTypeNode, ComparisonExpressionNode, CompoundAssignmentNode, ConditionalSentenceNode, ContinueNode, DeclarationNode, DefineMacroNode, DoWhileNode, DoubleTypeNode, FloatNode, FloatTypeNode, ForNode, FunctionCallNode, FunctionNode, HexNode, IDNode, IDTypeNode, IncDecExpressionNode, IncludeNode, IntNode, IntTypeNode, LongTypeNode, MemberAccessNode, NotExpressionNode, OctalNode, ProgramCodeNode, ProgramNode, ReturnNode, ShortTypeNode, Size_tTypeNode, StringNode, StringTypeNode, SwitchSentenceNode, UCharTypeNode, UIntTypeNode, ULongTypeNode, VoidTypeNode, WhileNode, WordTypeNode


class ASTVisitor:

    def visit_program(self, program: ProgramNode, param):
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        return None

    def visit_include(self, program: IncludeNode, param):
        return None

    def visit_program_code(self, program_code: ProgramCodeNode, param):
        if program_code.declaration != None:
            program_code.declaration.accept(self, param)
        if program_code.function != None:
            program_code.function.accept(self, param)
        if program_code.macro != None:
            program_code.macro.accept(self, param)
        return None

    def visit_declaration(self, declaration: DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.accept(self, param)
        return None

    def visit_array_declaration(self, array_declaration: ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        return None

    def visit_define_macro(self, define_macro: DefineMacroNode, param):
        if define_macro.expr != None:
            define_macro.expr.accept(self, param)
        return None

    def visit_boolean_type(self, boolean_type: BooleanTypeNode, param):
        return None

    def visit_byte_type(self, byte_type: ByteTypeNode, param):
        return None

    def visit_char_type(self, char_type: CharTypeNode, param):
        return None

    def visit_double_type(self, double_type: DoubleTypeNode, param):
        return None

    def visit_float_type(self, float_type: FloatTypeNode, param):
        return None

    def visit_int_type(self, int_type: IntTypeNode, param):
        return None

    def visit_long_type(self, long_type: LongTypeNode, param):
        return None

    def visit_short_type(self, short_type: ShortTypeNode, param):
        return None

    def visit_size_t_type(self, size_t_type: Size_tTypeNode, param):
        return None

    def visit_string_type(self, string: StringTypeNode, param):
        return None

    def visit_u_int_type(self, u_int_type: UIntTypeNode, param):
        return None

    def visit_u_char_type(self, u_char_type: UCharTypeNode, param):
        return None

    def visit_u_long_type(self, u_long_type: ULongTypeNode, param):
        return None

    def visit_void_type(self, void_type: VoidTypeNode, param):
        return None

    def visit_word_type(self, word_type: WordTypeNode, param):
        return None

    def visit_id_type(self, id_type: IDTypeNode, param):
        return None

    def visit_function(self, function: FunctionNode, param):
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        self.visit_children(function.sentences, param)
        return None

    def visit_while(self, while_p: WhileNode, param):
        if while_p.expression != None:
            while_p.expression.accept(self, param)
        self.visit_children(while_p.sentences, param)
        return None

    def visit_do_while(self, do_while: DoWhileNode, param):
        if do_while.expression != None:
            do_while.expression.accept(self, param)
        self.visit_children(do_while.sentences, param)
        return None

    def visit_for(self, for_p: ForNode, param):
        if for_p.assignment != None:
            for_p.assignment.accept(self, param)
        if for_p.condition != None:
            for_p.condition.accept(self, param)
        if for_p.expression != None:
            for_p.expression.accept(self, param)
        self.visit_children(for_p.sentences, param)
        return None

    def visit_conditional_sentence(self, conditional_sentence: ConditionalSentenceNode, param):
        if conditional_sentence.condition != None:
            conditional_sentence.condition.accept(self, param)
        self.visit_children(conditional_sentence.if_expr, param)
        self.visit_children(conditional_sentence.else_expr, param)
        return None

    def visit_switch_sentence(self, switch_sentence: SwitchSentenceNode, param):
        if switch_sentence.expression != None:
            switch_sentence.expression.accept(self, param)
        self.visit_children(switch_sentence.cases, param)
        return None

    def visit_assignment(self, assignment: AssignmentNode, param):
        if assignment.var != None:
            assignment.var.accept(self, param)
        if assignment.expr != None:
            assignment.expr.accept(self, param)
        return None

    def visit_case(self, case: CaseNode, param):
        if case.expression != None:
            case.expression.accept(self, param)
        self.visit_children(case.sentences, param)
        return None

    def visit_array_access(self, array_access: ArrayAccessNode, param):
        self.visit_children(array_access.indexes, param)
        return None

    def visit_arithmetic_expression(self, arithmetic_expression: ArithmeticExpressionNode, param):
        if arithmetic_expression.left != None:
            arithmetic_expression.left.accept(self, param)
        if arithmetic_expression.right != None:
            arithmetic_expression.right.accept(self, param)
        return None

    def visit_comparision_expression(self, comparison_expression: ComparisonExpressionNode, param):
        if comparison_expression.left != None:
            comparison_expression.left.accept(self, param)
        if comparison_expression.right != None:
            comparison_expression.right.accept(self, param)
        return None

    def visit_boolean_expression(self, boolean_expression: BooleanExpressionNode, param):
        if boolean_expression.left != None:
            boolean_expression.left.accept(self, param)
        if boolean_expression.right != None:
            boolean_expression.right.accept(self, param)
        return None

    def visit_bitwise_expression(self, bitwise_expression: BitwiseExpressionNode, param):
        if bitwise_expression.left != None:
            bitwise_expression.left.accept(self, param)
        if bitwise_expression.right != None:
            bitwise_expression.right.accept(self, param)
        return None

    def visit_compound_assigment(self, compound_asigment: CompoundAssignmentNode, param):
        if compound_asigment.left != None:
            compound_asigment.left.accept(self, param)
        if compound_asigment.right != None:
            compound_asigment.right.accept(self, param)
        return None

    def visit_inc_dec_expression(self, inc_dec_expression: IncDecExpressionNode, param):
        if inc_dec_expression.var != None:
            inc_dec_expression.var.accept(self, param)
        return None

    def visit_not_expression(self, not_expression: NotExpressionNode, param):
        if not_expression.expression != None:
            not_expression.expression.accept(self, param)
        return None

    def visit_bit_not_expression(self, bit_not_expression: BitNotExpressionNode, param):
        if bit_not_expression.expression != None:
            bit_not_expression.expression.accept(self, param)
        return None

    def visit_int(self, int_node: IntNode, param):
        return None

    def visit_float(self, float_node: FloatNode, param):
        return None

    def visit_hex(self, hex_node: HexNode, param):
        return None

    def visit_octal(self, oct_node: OctalNode, param):
        return None

    def visit_binary(self, binary_node: BinaryNode, param):
        return None

    def visit_char(self, char_node: CharNode, param):
        return None

    def visit_string(self, string_node: StringNode, param):
        return None

    def visit_boolean(self, boolean_node: BooleanNode, param):
        return None

    def visit_id(self, id_node: IDNode, param):
        return None

    def visit_function_call(self, function_call: FunctionCallNode, param):
        self.visit_children(function_call.parameters, param)
        return None

    def visit_member_access(self, member_access: MemberAccessNode, param):
        if member_access.element != None:
            member_access.element.accept(self, param)

    def visit_return(self, return_p: ReturnNode, param):
        if return_p.expression != None:
            return_p.expression.accept(self, param)

    def visit_break(self, break_p: BreakNode, param):
        return None

    def visit_continue(self, continue_p: ContinueNode, param):
        return None

    def visit_children(self, children, param):
        if children != None:
            for child in children:
                child.accept(self, param)

    def visit_array_elements(self, elements, param):
        if elements != None:
            for elem in elements:
                if isinstance(elem, list):
                    self.visit_array_elements(elem, param)
                else:
                    elem.accept(self, param)
        return None
