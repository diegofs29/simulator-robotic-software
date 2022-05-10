lexer grammar ArduinoLexicon;

BIT_SHIFT_L
    : '<''<'
    ;
    
BIT_SHIFT_R
    : '>''>'
    ;

LOW
    : 'LOW'
    ;

HIGH
    : 'HIGH'
    ;

ANALOG_PIN
    : 'A' [0-5]
    ;

BINARY_CONST
    : '0' 'b' [0-1]+
    ;

OCTAL_CONST
    : '0' [0-7]+
    ;

HEX_CONST
    : '0' 'x' [0-9A-Fa-f]+
    ;

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