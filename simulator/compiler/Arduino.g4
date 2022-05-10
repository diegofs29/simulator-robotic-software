grammar Arduino;

import ArduinoLexicon;

start
       : program EOF
       ;

program 
       : include_directives+=include* code+=program_code*
       ;

include 
       : '#include' STRING_CONST
       | '#include' '<' ID '.' ID '>'
       ;

program_code
       : var_dec=declaration ';'
       | func_def=function
       | def_mac=define_macro
       ;

declaration 
       : s_def=simple_declaration 
       | a_def=array_declaration 
       | qual=('const' | 'static') declaration
       ;

simple_declaration 
       : v_type=var_type ID ('=' val=expression)? 
       ;

array_declaration
       : v_type=var_type ID a_index=array_index ('=' (expr=expression | elems=array_elements))? 
       ;

define_macro
       : '#define' ID val=expression
       | '#define' ID elems=array_elements
       ;

array_index
       : dimensions+='[' sizes+=INT_CONST? ']' (dimensions+='[' sizes+=INT_CONST ']')*
       ;

array_elements
       : '{' array_elements (',' array_elements)+ '}'
       | '{' elements+=expression (',' elements+=expression)* '}'
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
       | 'String'
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
       : f_args+=declaration (',' f_args+=declaration)*
       ;

iteration_sentence 
       : it_type='while' '(' expr=expression ')' code=code_block
       | it_type='do' code=code_block 'while' '(' expr=expression ')' ';'
       | it_type='for' '(' assign_def=simple_declaration? ';' condition=expression? ';' expr=expression? ')' code=code_block
       ;

conditional_sentence 
       : cond_type='if' '(' expr=expression ')' if_code=code_block ('else' else_code=code_block)?
       | cond_type='switch' '(' expr=expression ')' '{' sentences+=case_sentence* '}'
       ;

case_sentence
       : sent_type='case' expr=expression ':' sentences+=sentence*
       | sent_type='default' ':' sentences+=sentence*
       ;

code_block
       : '{' sentences+=sentence* '}'
       | sentences+=sentence
       ;

sentence 
       : dec=declaration ';'
       | it_sent=iteration_sentence
       | cond_sent=conditional_sentence
       | assign=assignment ';'
       | expr=expression ';'
       | def_mac=define_macro
       | s_type='return' expr=expression? ';'
       | s_type='break' ';'
       | s_type='continue' ';'
       ;

assignment
       : assign=expression '=' value=expression
       ;

expression 
       : 'true'
       | 'false'
       | LOW
       | HIGH
       | ANALOG_PIN
       | HEX_CONST
       | OCTAL_CONST
       | BINARY_CONST
       | INT_CONST
       | FLOAT_CONST
       | CHAR_CONST
       | STRING_CONST
       | ID
       | '(' r_expr=expression ')'
       | member_acc=expression '.' id_acc=ID
       | array_name=ID ('[' indexes+=expression ']')+
       | f_call=expression '(' args=parameter? ')'
       | expr=expression operator=('++'|'--')
       | operator=('++'|'--') expr=expression
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
       ;

parameter 
       : parameters+=expression (',' parameters+=expression)*
       ;