grammar Arduino;

import ArduinoLexicon;

start
       : program EOF
       ;

program 
       : declarations+=declaration* code+=program_code*
       ;

program_code
       : var_def=definition
       | func_def=function
       ;

declaration 
       : '#include' STRING_CONST
       | '#include' '<' h_file '>'
       ;

h_file 
       : ID '.' ID
       ;

definition 
       : s_def=simple_definition ';'
       | a_def=array_definition ';'
       | assign_def=assignment_definition ';'
       | cte_def=constant
       ;

simple_definition 
       : v_type=var_type ID
       ;

assignment_definition 
       : v_type=var_type assign=assignment
       ;

assignment 
       : ID '=' expr=expression
       | ID '[' INT_CONST ']' '=' expr=expression
       ;

array_definition
       : v_type=var_type ID '[' INT_CONST ']'
       | v_type=var_type ID '[' INT_CONST? ']' '=' '{' elements+=expression (',' elements+=expression)* '}'
       | v_type=var_type ID '[' INT_CONST ']' '=' expr=expression
       ;

constant 
       : const_type='const' v_type=var_type assign=assignment ';'
       | const_type='#define' ID expr=expression
       ;

var_type 
       : 'bool'
       | 'boolean'
       | 'byte'
       | 'char'
       | 'double'
       | 'float'
       | 'int'
       | 'long'
       | 'short'
       | 'size_t'
       | 'string'
       | 'unsigned int'
       | 'unsigned char'
       | 'unsigned long'
       | 'void'
       | 'word'
       | ID
       ;

function 
       : v_type=var_type ID '(' f_args=function_args? ')' '{' sentences+=sentence* '}'
       ;

function_args
       : f_args+=simple_definition (',' f_args+=simple_definition)*
       ;

iteration_sentence 
       : it_type='while' '(' expr=expression ')' code=code_block
       | it_type='do' code=code_block 'while' '(' expr=expression ')' ';'
       | it_type='for' '(' assign_def=assignment_definition ';' condition=expression ';' expr=expression ')' code=code_block
       ;

conditional_sentence 
       : cond_type='if' '(' expr=expression ')' if_code=code_block
       | cond_type='if' '(' expr=expression ')' if_code=code_block 'else' else_code=code_block
       | cond_type='switch' '(' expr=expression ')' '{' sentences+=case_sentence* '}'
       ;

code_block
       : '{' sentences+=sentence* '}'
       | sentences+=sentence
       ;

sentence 
       : a_def=assignment_definition ';'
       | s_def=simple_definition ';'
       | arr_def=array_definition ';'
       | s_var=static_variable
       | it_sent=iteration_sentence
       | cond_sent=conditional_sentence
       | expr=expression ';'
       | s_type='return' expr=expression? ';'
       | s_type='break' ';'
       | s_type='continue' ';'
       ;

case_sentence
       : sent_type='case' expr=expression ':' sentences+=sentence* 'break' ';'
       | sent_type='default' ':' sentences+=sentence* 'break' ';'
       ;

expression 
       : '(' r_expr=expression ')'
       | f_call=function_call
       | i_d_expr=incdec_expression
       | array_name=expression '[' index=expression ']'
       | operator=('!'|'~') expr=expression
       | left=expression operator=('*'|'/'|'%') right=expression
       | left=expression operator=('+'|'-') right=expression
       | left=expression operator=(BIT_SHIFT_R|BIT_SHIFT_L) right=expression
       | left=expression operator=('>' | '>=' | '<=' | '<') right=expression
       | left=expression operator=('=='|'!=') right=expression
       | left=expression operator='&' right=expression
       | left=expression operator='^' right=expression
       | left=expression operator='|' right=expression
       | left=expression operator='&&' right=expression
       | left=expression operator='||' right=expression
       | left=expression operator=('%='|'&='|'*='|'+='|'-='|'/='|'^='|'|=') right=expression
       | assign=assignment
       | 'true'
       | 'false'
       | INT_CONST
       | FLOAT_CONST
       | CHAR_CONST
       | STRING_CONST
       | ID
       ;

incdec_expression 
       : operator='++' ID
       | ID operator='++'
       | operator='--' ID
       | ID operator='--'
       ;

function_call 
       : ID '(' args=parameter? ')'
       ;

parameter 
       : parameters+=expression (',' parameters+=expression)*
       ;

static_variable 
       : 'static' v_type=var_type ID ';'
       | 'static' v_type=var_type assign=assignment ';'
       ;