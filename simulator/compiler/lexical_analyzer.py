import ply.lex as lex


class LexicalAnalyzer:

    def __init__(self):
        pass

    # Lista de nombres de tokens
    tokens = [
        'NUMBER',   # numeros
        'ID',       # ids

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
        'SCOLON',   # ;
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
        'case' : 'CASE'
    }