class ASTVisitor:

    def visit_program(self, program, param):
        pass

    def visit_declaration(self, program, param):
        pass

    def visit_program_code(self, program_code, param):
        pass

    def visit_definition(self, definition, param):
        pass

    def visit_array_definition(self, array_definition, param):
        pass

    def visit_assignment(self, assignment, param):
        pass

    def visit_boolean_type(self, boolean_type, param):
        pass

    def visit_byte_type(self, byte_type, param):
        pass

    def visit_char_type(self, char_type, param):
        pass

    def visit_double_type(self, double_type, param):
        pass

    def visit_float_type(self, float_type, param):
        pass

    def visit_int_type(self, int_type, param):
        pass

    def visit_long_type(self, long_type, param):
        pass

    def visit_short_type(self, short_type, param):
        pass

    def visit_size_t_type(self, size_t_type, param):
        pass

    def visit_string_type(self, string, param):
        pass

    def visit_u_int_type(self, u_int_type, param):
        pass

    def visit_u_char_type(self, u_char_type, param):
        pass

    def visit_u_long_type(self, u_long_type, param):
        pass

    def visit_void_type(self, void_type, param):
        pass

    def visit_word_type(self, word_type, param):
        pass

    def visit_id_type(self, id_type, param):
        pass

    def visit_function(self, function, param):
        pass

    def visit_while(self, while_p, param):
        pass

    def visit_do_while(self, do_while, param):
        pass

    def visit_for(self, for_p, param):
        pass

    def visit_conditional_sentence(self, conditional_sentence, param):
        pass

    def visit_switch_sentence(self, switch_sentence, param):
        pass

    def visit_case(self, case, param):
        pass

    def visit_static_var_definition(self, static_var_definition, param):
        pass

    def visit_array_access(self, array_access, param):
        pass

    def visit_arithmetic_expression(self, arithmetic_expression, param):
        pass

    def visit_comparision_expression(self, comparison_expression, param):
        pass

    def visit_boolean_expresssion(self, boolean_expression, param):
        pass

    def visit_bitwise_expression(self, bitwise_expression, param):
        pass

    def visit_compound_assigment(self, compound_asigment, param):
        pass

    def visit_inc_dec_expression(self, inc_dec_expression, param):
        pass

    def visit_not_expression(self, not_expression, param):
        pass

    def visit_bit_not_expression(self, bit_not_expression, param):
        pass

    def visit_int(self, int, param):
        pass

    def visit_float(self, float, param):
        pass

    def visit_hex(self, hex, param):
        pass

    def visit_octal(self, oct, param):
        pass

    def visit_binary(self, binary, param):
        pass

    def visit_char(self, char, param):
        pass

    def visit_string(self, string, param):
        pass

    def visit_boolean(self, boolean, param):
        pass

    def visit_id(self, id, param):
        pass

    def visit_function_call(self, function_call, param):
        pass

    def visit_return(self, return_p, param):
        pass

    def visit_break(self, break_p, param):
        pass

    def visit_continue(self, continue_p, param):
        pass