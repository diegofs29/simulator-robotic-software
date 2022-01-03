grammar Grammar

import lexicon

program 
       : declaration* definition* setup loop function*
       ;

declaration 
       : '#include(' h_file ')'
       ;

h_file 
       : ID '.' ID
       ;

definition ::= simple_definition SCOLON
             | assignment_definition SCOLON
             | constant

simple_definition ::= type ID

assignment_definition ::= type assignment

assignment ::= ID assignment_operator value
             | ID assignment_operator expression

constant ::= CONST type assignment SCOLON
           | HASHTAG DEFINE ID value

type ::= BOOL
       | BOOLEAN
       | BYTE
       | CHAR
       | DOUBLE
       | FLOAT
       | INT
       | LONG
       | SHORT
       | SIZE_T
       | STRING
       | UNSIGNED INT
       | UNSIGNED CHAR
       | UNSIGNED LONG
       | VOID
       | WORD
       | ID

setup ::= VOID SETUP LPAREN RPAREN LBRACE sentence* RBRACE 

loop ::= VOID LOOP LPAREN RPAREN LBRACE sentence* RBRACE

function ::= type ID LPAREN RPAREN LBRACE sentence* RBRACE

sentence ::= simple_definition
           | assignment_definition
           | static_variable
           | assignment SCOLON
           | function_call
           | iteration_sentence
           | conditional_sentence
           | GOTO ID SCOLON
           | BREAK SCOLON
           | CONTINUE SCOLON

iteration_sentence ::= WHILE LPAREN expression RPAREN LBRACE sentence* RBRACE
                   | DO LBRACE sentence* RBRACE WHILE LPAREN expression RPAREN
                   | FOR LPAREN assignment_definition SCOLON boolean_expression SCOLON expression RPAREN LBRACE sentence* RBRACE

conditional_sentence ::= IF LPAREN expression RPAREN LBRACE sentence* RBRACE
                     | IF LPAREN expression RPAREN LBRACE sentence* RBRACE ELSE LBRACE sentence* RBRACE
                     | SWITCH LPAREN expression RPAREN LBRACE case* RBRACE

case ::= CASE expression COLON sentence* BREAK SCOLON
       | DEFAULT COLON sentence* BREAK SCOLON

expression ::= expression operator expression
             | comparison_expression
             | NOT expression
             | LPAREN expression RPAREN
             | boolean_expression
             | incdec_expression
             | value
             | assignment

incdec_expression ::= INC ID
                  | ID INC
                  | DEC ID
                  | ID DEC

boolean_expression ::= expression boolean_operator expression
                   | comparison_expression

comparison_expression ::= expression comparison_operator expression

operator ::= PLUS
           | MINUS
           | MULT
           | DIV
           | REM
           | BITAND
           | BITLEFT
           | BITRIGHT
           | BITXOR
           | BITOR
           | BITNOT

assignment_operator ::= COPLUS
                      | COMINUS
                      | COMULT
                      | CODIV
                      | COREM
                      | COBITXOR
                      | COBITOR
                      | COBITAND
                      | ASSIGN

comparison_operator ::= NE
                      | EQ
                      | LT
                      | LE
                      | GT
                      | GE

boolean_operator ::= AND
                   | OR

function_call ::= ID LPAREN parameter* RPAREN SCOLON

parameter ::= expression (COMMA expression)*

static_variable ::= STATIC type ID SCOLON
                  | STATIC type assignment SCOLON

value ::= FLOAT_CONST
        | INT_CONST
        | STRING_CONST
        | CHAR_CONST
        | ID
        | TRUE
        | FALSE