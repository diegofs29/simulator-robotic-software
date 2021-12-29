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
        'NEQ',      # !=
        'EQUALS',   # ==
        'LTHAN',    # <
        'LEQTHAN',  # <=
        'GTHAN',    # >
        'GEQTHAN',  # >=

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