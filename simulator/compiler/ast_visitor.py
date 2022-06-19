import compiler.ast as ast


class ASTVisitor:

    def visit_program(self, program: ast.ProgramNode, param):
        self.visit_children(program.includes, param)
        self.visit_children(program.code, param)
        return None

    def visit_include(self, program: ast.IncludeNode, param):
        return None

    def visit_program_code(self, program_code: ast.ProgramCodeNode, param):
        if program_code.declaration != None:
            program_code.declaration.accept(self, param)
        if program_code.function != None:
            program_code.function.accept(self, param)
        if program_code.macro != None:
            program_code.macro.accept(self, param)
        return None

    def visit_declaration(self, declaration: ast.DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.accept(self, param)
        return None

    def visit_array_declaration(self, array_declaration: ast.ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        return None

    def visit_define_macro(self, define_macro: ast.DefineMacroNode, param):
        if define_macro.expr != None:
            define_macro.expr.accept(self, param)
        self.visit_array_elements(define_macro.elements, param)
        return None

    def visit_boolean_type(self, boolean_type: ast.BooleanTypeNode, param):
        return None

    def visit_byte_type(self, byte_type: ast.ByteTypeNode, param):
        return None

    def visit_char_type(self, char_type: ast.CharTypeNode, param):
        return None

    def visit_double_type(self, double_type: ast.DoubleTypeNode, param):
        return None

    def visit_float_type(self, float_type: ast.FloatTypeNode, param):
        return None

    def visit_int_type(self, int_type: ast.IntTypeNode, param):
        return None

    def visit_long_type(self, long_type: ast.LongTypeNode, param):
        return None

    def visit_short_type(self, short_type: ast.ShortTypeNode, param):
        return None

    def visit_size_t_type(self, size_t_type: ast.Size_tTypeNode, param):
        return None

    def visit_string_type(self, string: ast.StringTypeNode, param):
        return None

    def visit_u_int_type(self, u_int_type: ast.UIntTypeNode, param):
        return None

    def visit_u_char_type(self, u_char_type: ast.UCharTypeNode, param):
        return None

    def visit_u_long_type(self, u_long_type: ast.ULongTypeNode, param):
        return None

    def visit_void_type(self, void_type: ast.VoidTypeNode, param):
        return None

    def visit_word_type(self, word_type: ast.WordTypeNode, param):
        return None

    def visit_id_type(self, id_type: ast.IDTypeNode, param):
        return None

    def visit_function(self, function: ast.FunctionNode, param):
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        self.visit_children(function.sentences, param)
        return None

    def visit_while(self, while_p: ast.WhileNode, param):
        if while_p.expression != None:
            while_p.expression.accept(self, param)
        self.visit_children(while_p.sentences, param)
        return None

    def visit_do_while(self, do_while: ast.DoWhileNode, param):
        if do_while.expression != None:
            do_while.expression.accept(self, param)
        self.visit_children(do_while.sentences, param)
        return None

    def visit_for(self, for_p: ast.ForNode, param):
        if for_p.assignment != None:
            for_p.assignment.accept(self, param)
        if for_p.condition != None:
            for_p.condition.accept(self, param)
        if for_p.expression != None:
            for_p.expression.accept(self, param)
        self.visit_children(for_p.sentences, param)
        return None

    def visit_conditional_sentence(self, conditional_sentence: ast.ConditionalSentenceNode, param):
        if conditional_sentence.condition != None:
            conditional_sentence.condition.accept(self, param)
        self.visit_children(conditional_sentence.if_expr, param)
        self.visit_children(conditional_sentence.else_expr, param)
        return None

    def visit_switch_sentence(self, switch_sentence: ast.SwitchSentenceNode, param):
        if switch_sentence.expression != None:
            switch_sentence.expression.accept(self, param)
        self.visit_children(switch_sentence.cases, param)
        return None

    def visit_assignment(self, assignment: ast.AssignmentNode, param):
        if assignment.var != None:
            assignment.var.accept(self, param)
        if assignment.expr != None:
            assignment.expr.accept(self, param)
        return None

    def visit_case(self, case: ast.CaseNode, param):
        if case.expression != None:
            case.expression.accept(self, param)
        self.visit_children(case.sentences, param)
        return None

    def visit_array_access(self, array_access: ast.ArrayAccessNode, param):
        self.visit_children(array_access.indexes, param)
        return None

    def visit_arithmetic_expression(self, arithmetic_expression: ast.ArithmeticExpressionNode, param):
        if arithmetic_expression.left != None:
            arithmetic_expression.left.accept(self, param)
        if arithmetic_expression.right != None:
            arithmetic_expression.right.accept(self, param)
        return None

    def visit_comparision_expression(self, comparison_expression: ast.ComparisonExpressionNode, param):
        if comparison_expression.left != None:
            comparison_expression.left.accept(self, param)
        if comparison_expression.right != None:
            comparison_expression.right.accept(self, param)
        return None

    def visit_boolean_expression(self, boolean_expression: ast.BooleanExpressionNode, param):
        if boolean_expression.left != None:
            boolean_expression.left.accept(self, param)
        if boolean_expression.right != None:
            boolean_expression.right.accept(self, param)
        return None

    def visit_bitwise_expression(self, bitwise_expression: ast.BitwiseExpressionNode, param):
        if bitwise_expression.left != None:
            bitwise_expression.left.accept(self, param)
        if bitwise_expression.right != None:
            bitwise_expression.right.accept(self, param)
        return None

    def visit_compound_assigment(self, compound_asigment: ast.CompoundAssignmentNode, param):
        if compound_asigment.left != None:
            compound_asigment.left.accept(self, param)
        if compound_asigment.right != None:
            compound_asigment.right.accept(self, param)
        return None

    def visit_inc_dec_expression(self, inc_dec_expression: ast.IncDecExpressionNode, param):
        if inc_dec_expression.var != None:
            inc_dec_expression.var.accept(self, param)
        return None

    def visit_not_expression(self, not_expression: ast.NotExpressionNode, param):
        if not_expression.expression != None:
            not_expression.expression.accept(self, param)
        return None

    def visit_bit_not_expression(self, bit_not_expression: ast.BitNotExpressionNode, param):
        if bit_not_expression.expression != None:
            bit_not_expression.expression.accept(self, param)
        return None

    def visit_int(self, int_node: ast.IntNode, param):
        return None

    def visit_float(self, float_node: ast.FloatNode, param):
        return None

    def visit_hex(self, hex_node: ast.HexNode, param):
        return None

    def visit_octal(self, oct_node: ast.OctalNode, param):
        return None

    def visit_binary(self, binary_node: ast.BinaryNode, param):
        return None

    def visit_char(self, char_node: ast.CharNode, param):
        return None

    def visit_string(self, string_node: ast.StringNode, param):
        return None

    def visit_boolean(self, boolean_node: ast.BooleanNode, param):
        return None

    def visit_id(self, id_node: ast.IDNode, param):
        return None

    def visit_function_call(self, function_call: ast.FunctionCallNode, param):
        if function_call.name != None:
            function_call.name.accept(self, param)
        self.visit_children(function_call.parameters, param)
        return None

    def visit_member_access(self, member_access: ast.MemberAccessNode, param):
        if member_access.element != None:
            member_access.element.accept(self, param)

    def visit_return(self, return_p: ast.ReturnNode, param):
        if return_p.expression != None:
            return_p.expression.accept(self, param)

    def visit_break(self, break_p: ast.BreakNode, param):
        return None

    def visit_continue(self, continue_p: ast.ContinueNode, param):
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
