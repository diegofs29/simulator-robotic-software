grammar Arduino;

import ArduinoLexicon;

start
       : program EOF
       ;

program 
       : declarations+=declaration* code+=program_code* setup loop code+=program_code*
       ;

program_code
       : definition
       | setup
       | loop
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
       | const_type='#define' ID expression ('\n' | EOF)
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

setup 
       : 'void' 'setup' '(' ')' code_block 
       ;

loop 
       : 'void' 'loop' '(' ')' code_block
       ;

function 
       : var_type ID '(' function_args? ')' '{' sentences+=sentence* '}'
       ;

function_args
       : f_args+=simple_definition (',' f_args+=simple_definition)*
       ;

iteration_sentence 
       : it_type='while' '(' expression ')' code_block
       | it_type='do' code_block 'while' '(' expression ')'
       | it_type='for' '(' assignment_definition ';' expression ';' expression ')' code_block
       ;

conditional_sentence 
       : cond_type='if' '(' expression ')' code_block
       | cond_type='if' '(' expression ')' code_block 'else' conditional_sentence
       | cond_type='if' '(' expression ')' code_block 'else' code_block
       | cond_type='switch' '(' expression ')' '{' case_sentence* '}'
       ;

code_block
       : '{' sentences+=sentence* '}'
       | sentences+=sentence
       ;

sentence 
       : simple_definition
       | assignment_definition
       | static_variable
       | assignment ';'
       | function_call ';'
       | iteration_sentence
       | conditional_sentence
       | s_type='return' expression? ';'
       | s_type='goto' ID ';'
       | s_type='break' ';'
       | s_type='continue' ';'
       | ID ':'
       ;

case_sentence
       : 'case' expression ':' sentences+=sentence* 'break' ';'
       | 'default' ':' sentences+=sentence* 'break' ';'
       ;

expression 
       : function_call
       | expression operator=('*'|'/') expression
       | expression operator=('+'|'-') expression
       | expression operator=('%='|'&='|'*='|'+='|'-='|'/='|'^='|'|=') expression
       | expression operator=('!=' | '==' | '>' | '>=' | '<=' | '<') expression
       | expression operator=('&&'|'||') expression
       | '!' expression
       | '(' expression ')'
       | incdec_expression
       | assignment
       | 'true'
       | 'false'
       | ID
       | INT_CONST
       | FLOAT_CONST
       | CHAR_CONST
       | STRING_CONST
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