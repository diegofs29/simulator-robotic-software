from distutils.log import error
from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import *
from ..console.console import Error


class CompilerErrorListener(ErrorListener):

    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        error_type, message = self.__handle_error(e)
        error = Error(error_type, line, column, message)
        print(error.to_string())
        self.errors.append(error)

    def __handle_error(self, e):
        error_type = message = ""
        if e == None:
            error_type = "Sintaxis"
            message = "Falta(n) caracter(es)"
        elif type(e) == LexerNoViableAltException:
            error_type = "Léxico"
            message = "Caracter(es) inválido(s)"
        elif type(e) == NoViableAltException:
            error_type = "Sintaxis"
            message = "Código no válido"
        elif type(e) == InputMismatchException:
            error_type = "Sintaxis"
            message = "El valor introducido en esta posición no es válido"
        elif type(e) == FailedPredicateException:
            error_type = "Predicado"
            message = "Fallo al analizar predicado"
        elif type(e) == ParseCancellationException:
            error_type = "Cancelado"
            message = "Se ha cancelado el análisis"
        else:
            error_type = "?"
            message = "Error desconocido"
        return error_type, message