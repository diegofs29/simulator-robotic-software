grammar Arduino;

import ArduinoLexicon;

start
       : program EOF
       ;

program 
       : declaration* program_code
       ;

program_code
       : definition program_code?
       | setup program_code?
       | loop program_code?
       | function program_code?
       ;

declaration 
       : '#include' '<' h_file '>'
       | '#include' '"' h_file '"'
       ;

h_file 
       : ID '.' ID
       ;

definition 
       : simple_definition ';'
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
       ;

constant 
       : 'const' var_type assignment ';'
       | '#define' ID expression ('\n' | EOF)
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
       : var_type ID '(' function_args? ')' code_block
       ;

function_args
       : simple_definition (',' simple_definition)*
       ;

iteration_sentence 
       : 'while' '(' expression ')' code_block
       | 'do' code_block 'while' '(' expression ')'
       | 'for' '(' assignment_definition ';' expression ';' expression ')' code_block
       ;

conditional_sentence 
       : 'if' '(' expression ')' code_block
       | 'if' '(' expression ')' code_block 'else' conditional_sentence
       | 'if' '(' expression ')' code_block 'else' code_block
       | 'switch' '(' expression ')' '{' case_sentence* '}'
       ;

code_block
       : '{' sentence* '}'
       | sentence
       ;

sentence 
       : simple_definition
       | assignment_definition
       | static_variable
       | assignment ';'
       | function_call ';'
       | iteration_sentence
       | conditional_sentence
       | 'goto' ID ';'
       | 'break' ';'
       | 'continue' ';'
       ;

case_sentence
       : 'case' expression ':' sentence* 'break' ';'
       | 'default' ':' sentence* 'break' ';'
       ;

expression 
       : function_call
       | expression ('*'|'/') expression
       | expression ('+'|'-') expression
       | expression ('!=' | '==' | '>' | '>=' | '<=' | '<') expression
       | expression ('%='|'&='|'*='|'+='|'-='|'/='|'^='|'|=') expression
       | expression ('&&'|'||') expression
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
       : '++' ID
       | ID '++'
       | '--' ID
       | ID '--'
       ;

function_call 
       : ID '(' parameter* ')'
       ;

parameter 
       : expression (',' expression)*
       ;

static_variable 
       : 'static' var_type ID ';'
       | 'static' var_type assignment ';'
       ;