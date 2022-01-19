grammar Arduino;

import ArduinoLexicon;

start
       : program EOF
       ;

program 
       : declarations+=declaration* code+=program_code*
       ;

program_code
       : definition
       | function
       ;

declaration 
       : '#include' STRING_CONST
       | '#include' '<' h_file '>'
       ;

h_file 
       : ID '.' ID
       ;

definition 
       : simple_definition ';'
       | array_definition ';'
       | assignment_definition ';'
       | constant
       ;

simple_definition 
       : var_type ID
       ;

assignment_definition 
       : var_type assignment
       ;

assignment 
       : ID '=' expression
       | ID '[' INT_CONST ']' '=' expression
       ;

array_definition
       : var_type ID '[' INT_CONST ']'
       | var_type ID '[' INT_CONST? ']' '=' '{' INT_CONST (',' INT_CONST)* '}'
       | var_type ID '[' INT_CONST ']' '=' expression
       ;

constant 
       : const_type='const' var_type assignment ';'
       | const_type='#define' ID expression
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
       : var_type ID '(' function_args? ')' '{' sentences+=sentence* '}'
       ;

function_args
       : f_args+=simple_definition (',' f_args+=simple_definition)*
       ;

iteration_sentence 
       : it_type='while' '(' expression ')' code_block
       | it_type='do' code_block 'while' '(' expression ')' ';'
       | it_type='for' '(' assignment_definition ';' expression ';' expression ')' code_block
       ;

conditional_sentence 
       : cond_type='if' '(' expression ')' code_block
       | cond_type='if' '(' expression ')' code_block 'else' code_block
       | cond_type='switch' '(' expression ')' '{' case_sentence* '}'
       ;

code_block
       : '{' sentences+=sentence* '}'
       | sentences+=sentence
       ;

sentence 
       : assignment_definition ';'
       | simple_definition ';'
       | array_definition ';'
       | static_variable
       | iteration_sentence
       | conditional_sentence
       | expression ';'
       | s_type='return' expression? ';'
       | s_type='break' ';'
       | s_type='continue' ';'
       ;

case_sentence
       : 'case' expression ':' sentences+=sentence* 'break' ';'
       | 'default' ':' sentences+=sentence* 'break' ';'
       ;

expression 
       : '(' expression ')'
       | function_call
       | incdec_expression
       | operator=('!'|'~') expression
       | expression operator=('*'|'/'|'%') expression
       | expression operator=('+'|'-') expression
       | expression operator=(BIT_SHIFT_R|BIT_SHIFT_L) expression
       | expression operator=('>' | '>=' | '<=' | '<') expression
       | expression operator=('=='|'!=') expression
       | expression operator='&' expression
       | expression operator='^' expression
       | expression operator='|' expression
       | expression operator='&&' expression
       | expression operator='||' expression
       | expression operator=('%='|'&='|'*='|'+='|'-='|'/='|'^='|'|=') expression
       | assignment
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
       : ID '(' parameter? ')'
       ;

parameter 
       : parameters+=expression (',' parameters+=expression)*
       ;

static_variable 
       : 'static' var_type ID ';'
       | 'static' var_type assignment ';'
       ;