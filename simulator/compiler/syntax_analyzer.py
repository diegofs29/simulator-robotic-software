from ply import yacc
from lexical_analyzer import tokens

class SyntaxAnalyzer:

    
    

    def __init__(self):
        self.yacc = yacc.yacc(module=self)