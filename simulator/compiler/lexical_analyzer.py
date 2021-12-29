import ply.lex as lex


class LexicalAnalyzer:

    tokens = [
        'ID',       # ids
        'FCONST',   # numero float
        'ICONST',   # numero int
        'SCONST',   # string
        'CCONST',   # char

        # --COMPUESTOS--
        'COPLUS',   # +=
        'INC',      # ++
        'COMINUS',  # -=
        'DEC',      # --
        'COMULT',   # *=
        'CODIV',    # /=
        'COREM',    # %=
        'COBITXOR', # ^=
        'COBITOR',  # |=
        'COBITAND', # &=

        # --COMPARACION--
        'NE',       # !=
        'EQ',       # ==
        'LT',       # <
        'LE',       # <=
        'GT',       # >
        'GE',       # >=

        # --BOOLEANOS--
        'NOT',      # !
        'AND',      # &&
        'OR',       # ||

        # --OPERADORES CON BITS--
        'BITAND',   # &         Cuidado con posibles conflictos con el & de puntero
        'BITLEFT',  # <<
        'BITRIGHT', # >>
        'BITXOR',   # ^
        'BITOR',    # |
        'BITNOT',   # ~

        # --ARITMETICOS--
        'ASSIGN',   # =
        'PLUS',     # +
        'MINUS',    # -
        'MULT',     # *
        'DIV',      # /
        'REM',      # %

        # --OTROS--
        'LPAREN',   # (
        'RPAREN',   # )
        'LBRACK',   # [
        'RBRACK',   # ]
        'LBRACE',   # {
        'RBRACE',   # }
        'COMMA',    # ,
        'PERIOD',   # .
        'SCOLON',   # ;
        'COLON',    # :
    ]

    reserved = {
        # --CONTROL --
        'while' : 'WHILE',
        'do' : 'DO',
        'break' : 'BREAK',
        'continue' : 'CONTINUE',
        'else' : 'ELSE',
        'for' : 'FOR',
        'goto' : 'GOTO',
        'if' : 'IF',
        'return' : 'RETURN',
        'switch' : 'SWITCH',
        'case' : 'CASE',
        
        # --DATA TYPES--
        'array' : 'ARRAY',
        'bool' : 'BOOL',
        'boolean' : 'BOOLEAN',
        'byte' : 'BYTE',
        'char' : 'CHAR',
        'double' : 'DOUBLE',
        'float' : 'FLOAT',
        'int' : 'INT',
        'long' : 'LONG',
        'short' : 'SHORT',
        'size_t' : 'SIZE_T',
        'string' : 'STRING',
        'unsigned' : 'UNSIGNED',
        'void' : 'VOID',
        'word' : 'WORD',

        # --QUALIFIERS--
        'const' : 'CONST',
        'scope' : 'SCOPE',
        'static' : 'STATIC',
        'volatile' : 'VOLATILE',

        # --CONSTANTS--
        'HIGH' : 'HIGH',
        'LOW' : 'LOW',
        'INPUT' : 'INPUT',
        'OUTPUT' : 'OUTPUT',
        'INPUT_PULLUP' : 'INPUT_PULLUP',
        'LED_BUILTIN' : 'LED_BUILTIN',
        'true' : 'TRUE',
        'false' : 'FALSE'
    }

    tokens += reserved.values()

    t_ignore = ' \t\x0c'

    def t_line_comment(self, t):
        r'//(.)*\n'

    def t_NEWLINE(self, t):
        r'\n+'
        t.lexer.lineno += t.value.count("\n")

    t_COPLUS = r'\+='
    t_INC = r'\+\+'
    t_COMINUS = r'-='
    t_DEC = r'--'
    t_COMULT = r'\*='
    t_CODIV = r'/='
    t_COREM = r'%='
    t_COBITXOR = r'\^='
    t_COBITOR = r'\|='
    t_COBITAND = r'&='

    t_NE = r'!='
    t_EQ = r'=='
    t_LT = r'<'
    t_LE = r'<='
    t_GT = r'>'
    t_GE = r'>='

    t_NOT = r'!'
    t_AND = r'&&'
    t_OR = r'\|\|'

    t_BITAND = r'&'
    t_BITLEFT = r'<<'
    t_BITRIGHT = r'>>'
    t_BITXOR = r'\^'
    t_BITOR = r'\|'
    t_BITNOT = r'~'

    t_ASSIGN = r'='
    t_PLUS = r'\+'
    t_MINUS = r'-'
    t_MULT = r'\*'
    t_DIV = r'/'
    t_REM = r'%'

    t_LPAREN = r'\('
    t_RPAREN = r'\)'
    t_LBRACK = r'\['
    t_RBRACK = r'\]'
    t_LBRACE = r'\{'
    t_RBRACE = r'\}'
    t_COMMA = r','
    t_PERIOD = r'\.'
    t_SCOLON = r';'
    t_COLON = r':'


    def t_ID(self, t):
        r'[A-Za-z_][\w_]*'
        t.type = self.reserved.get(t.value, "ID")
        return t

    # Integer literal
    t_ICONST = r'\d+([uU]|[lL]|[uU][lL]|[lL][uU])?'

    # Floating literal
    t_FCONST = r'((\d+)(\.\d+)(e(\+|-)?(\d+))? | (\d+)e(\+|-)?(\d+))([lL]|[fF])?'

    # String literal
    t_SCONST = r'\"([^\\\n]|(\\.))*?\"'

    # Character constant 'c' or L'c'
    t_CCONST = r'(L)?\'([^\\\n]|(\\.))*?\''


    def t_comment(self, t):
        r'/\*(.|\n)*?\*/'
        t.lexer.lineno += t.value.count('\n')


    def t_preprocessor(self, t):
        r'\#(.)*?\n'
        t.lexer.lineno += 1


    def t_error(self, t):
        print("Illegal character %s" % repr(t.value[0]))
        t.lexer.skip(1)



    def __init__(self):
        # Lista de nombres de tokens
        self.lexer = lex.lex(module=self)


def getAST():
    lexer = LexicalAnalyzer().lexer
    file = 'ejemplos\ejemploArduino.txt'
    stream = open(file)
    contents = stream.read()
    lex.runmain(lexer, contents)

if __name__ == "__main__":
    getAST()
