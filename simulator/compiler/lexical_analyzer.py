import ply.lex as lex


class LexicalAnalyzer:

    def __init__(self):
        pass

    # Lista de nombres de tokens
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