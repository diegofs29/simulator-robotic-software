class ASTVisitor:

    def visit_program(self, program, param):
        self.visit_children(program.includes)
        self.visit_children(program.code)
        return None

    def visit_include(self, program, param):
        return None

    def visit_program_code(self, program_code, param):
        if program_code.declaration != None:
            program_code.declaration.accept(self, param)
        if program_code.function != None:
            program_code.function.accept(self, param)
        return None

    def visit_declaration(self, declaration, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.value != None:
            declaration.value.accept(self, param)
        return None

    def visit_array_declaration(self, array_declaration, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        return None

    def visit_define_declaration(self, define_declaration, param): #implementar
        pass


    def visit_boolean_type(self, boolean_type, param):
        return None

    def visit_byte_type(self, byte_type, param):
        return None

    def visit_char_type(self, char_type, param):
        return None

    def visit_double_type(self, double_type, param):
        return None

    def visit_float_type(self, float_type, param):
        return None

    def visit_int_type(self, int_type, param):
        return None

    def visit_long_type(self, long_type, param):
        return None

    def visit_short_type(self, short_type, param):
        return None

    def visit_size_t_type(self, size_t_type, param):
        return None

    def visit_string_type(self, string, param):
        return None

    def visit_u_int_type(self, u_int_type, param):
        return None

    def visit_u_char_type(self, u_char_type, param):
        return None

    def visit_u_long_type(self, u_long_type, param):
        return None

    def visit_void_type(self, void_type, param):
        return None

    def visit_word_type(self, word_type, param):
        return None

    def visit_id_type(self, id_type, param):
        return None

    def visit_function(self, function, param):
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        self.visit_children(function.sentences, param)
        return None

    def visit_while(self, while_p, param):
        if while_p.expression != None:
            while_p.expression.accept(self, param)
        self.visit_children(while_p.sentences, param)
        return None

    def visit_do_while(self, do_while, param):
        if do_while.expression != None:
            do_while.expression.accept(self, param)
        self.visit_children(do_while.sentences, param)
        return None

    def visit_for(self, for_p, param):
        if for_p.assignment != None:
            for_p.assignment.accept(self, param)
        if for_p.conditon != None:
            for_p.conditon.accept(self, param)
        if for_p.expression != None:
            for_p.expression.accept(self, param)
        self.visit_children(for_p.sentences)
        return None

    def visit_conditional_sentence(self, conditional_sentence, param):
        if conditional_sentence.condition != None:
            conditional_sentence.condition.accept(self, param)
        self.visit_children(conditional_sentence.if_expr)
        self.visit_children(conditional_sentence.else_expr)
        return None

    def visit_switch_sentence(self, switch_sentence, param):
        if switch_sentence.expression != None:
            switch_sentence.expression.accept(self, param)
        self.visit_children(switch_sentence.cases)
        return None
    
    def visit_assignment(self, assignment, param):
        if assignment.var != None:
            assignment.var.accept(self, param)
        if assignment.expr != None:
            assignment.expr.accept(self, param)
        return None

    def visit_case(self, case, param):
        if case.expression != None:
            case.expression.accept(self, param)
        self.visit_children(case.sentences, param)
        return None

    def visit_array_access(self, array_access, param):
        return None

    def visit_arithmetic_expression(self, arithmetic_expression, param):
        if arithmetic_expression.left != None:
            arithmetic_expression.left.visit(self, param)
        if arithmetic_expression.right != None:
            arithmetic_expression.right.visit(self, param)
        return None

    def visit_comparision_expression(self, comparison_expression, param):
        if comparison_expression.left != None:
            comparison_expression.left.accept(self, param)
        if comparison_expression.right != None:
            comparison_expression.right.accept(self, param)
        return None

    def visit_boolean_expresssion(self, boolean_expression, param):
        if boolean_expression.left != None:
            boolean_expression.left.accept(self, param)
        if boolean_expression.right != None:
            boolean_expression.right.accept(self, param)
        return None

    def visit_bitwise_expression(self, bitwise_expression, param):
        if bitwise_expression.left != None:
            bitwise_expression.left.accept(self, param)
        if bitwise_expression.right != None:
            bitwise_expression.right.accept(self, param)
        return None

    def visit_compound_assigment(self, compound_asigment, param):
        if compound_asigment.left != None:
            compound_asigment.left.accept(self, param)
        if compound_asigment.right != None:
            compound_asigment.right.accept(self, param)
        return None

    def visit_inc_dec_expression(self, inc_dec_expression, param):
        return None

    def visit_not_expression(self, not_expression, param):
        if not_expression.expression != None:
            not_expression.expression.accept(self, param)
        return None

    def visit_bit_not_expression(self, bit_not_expression, param):
        if bit_not_expression.expression != None:
            bit_not_expression.expression.accept(self, param)

    def visit_int(self, int, param):
        return None

    def visit_float(self, float, param):
        return None

    def visit_hex(self, hex, param):
        return None

    def visit_octal(self, oct, param):
        return None

    def visit_binary(self, binary, param):
        return None

    def visit_char(self, char, param):
        return None

    def visit_string(self, string, param):
        return None

    def visit_boolean(self, boolean, param):
        return None

    def visit_id(self, id, param):
        return None

    def visit_function_call(self, function_call, param):
        self.visit_children(function_call.parameters)
        return None

    def visit_return(self, return_p, param):
        if return_p.expression != None:
            return_p.expression.accept(self, param)

    def visit_break(self, break_p, param):
        return None

    def visit_continue(self, continue_p, param):
        return None

    def visit_children(self, children, param):
        if children != None:
            for child in children:
                children.accept(self, param)