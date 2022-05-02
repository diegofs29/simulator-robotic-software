from antlr4.error.ErrorListener import ErrorListener
from antlr4.error.Errors import *
from ..gui.console import Error


class CompilerErrorListener(ErrorListener):

    def __init__(self, log_errors=False):
        super().__init__()
        self.errors = []
        self.log_errors = log_errors

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        expected = self.__get_expected(recognizer)
        error_type, message = self.__handle_error(e, expected, offendingSymbol)
        error = Error(error_type, line, column, message)
        if self.log_errors:
            print(error.to_string())
        self.errors.append(error)

    def __handle_error(self, e, expected, offending):
        error_type = message = ""
        if e == None:
            error_type = "Sintaxis"
            message = "Falta(n) caracter(es)"
            if expected != None and expected[0] != '{':
                message += ": {}".format(expected)
        elif type(e) == LexerNoViableAltException:
            error_type = "Léxico"
            message = "Caracter(es) inválido(s)"
        elif type(e) == NoViableAltException:
            error_type = "Sintaxis"
            message = "Código no válido"
        elif type(e) == InputMismatchException:
            offending_text = offending.text.rstrip()
            error_type = "Sintaxis"
            message = "El valor introducido en esta posición no es válido: {}".format(
                offending_text)
        # It would be strange for the following ones to appear, so they're not tested
        # Although they're not discarded
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

    def __get_expected(self, recognizer):
        try:
            expected = recognizer.getExpectedTokens().toString(
                recognizer.literalNames, recognizer.symbolicNames)
            return expected.rstrip()
        except AttributeError:
            return None
