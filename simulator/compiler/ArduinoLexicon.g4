lexer grammar ArduinoLexicon;

INT_CONST
    : '-'? [0-9]+
    ;

FLOAT_CONST
    : '-'? [0-9]+ '.' [0-9]+
    ;

CHAR_CONST
    : UNTERMINATED_CHAR '\''
    ;

UNTERMINATED_CHAR
    : '\'' ~[\n'\\]
    ;

STRING_CONST
    : UNTERMINATED_STRING '"'
    ;

UNTERMINATED_STRING
    : '"' (~["\\\n])*
    ;

ID
    :  [A-Za-z_][A-Za-z0-9_]*
    ;

LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;