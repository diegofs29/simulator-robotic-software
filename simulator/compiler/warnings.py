import compiler.ast as ast
import compiler.ast_visitor as ast_visitor
import console.console as console
import libraries.serial as serial
import libraries.servo as servo
import libraries.standard as standard
import libraries.string as string


class WarningAnalyzer(ast_visitor.ASTVisitor):

    def __init__(self) -> None:
        self.warnings = []

    def visit_while(self, while_p: ast.WhileNode, param):
        self.warnings.append(console.Warning("Uso", while_p.line, while_p.position, "No es recomendable el uso de bucles (while), aunque sea correcto"))
        if while_p.expression != None:
            while_p.expression.accept(self, param)
        self.visit_children(while_p.sentences, param)
        return None

    def visit_do_while(self, do_while: ast.DoWhileNode, param):
        self.warnings.append(console.Warning("Uso", do_while.line, do_while.position, "No es recomendable el uso de bucles (do while), aunque sea correcto"))
        if do_while.expression != None:
            do_while.expression.accept(self, param)
        self.visit_children(do_while.sentences, param)
        return None

    def visit_for(self, for_p: ast.ForNode, param):
        self.warnings.append(console.Warning("Uso", for_p.line, for_p.position, "No es recomendable el uso de bucles (for), aunque sea correcto"))
        if for_p.assignment != None:
            for_p.assignment.accept(self, param)
        if for_p.condition != None:
            for_p.condition.accept(self, param)
        if for_p.expression != None:
            for_p.expression.accept(self, param)
        self.visit_children(for_p.sentences, param)
        return None

    def visit_function_call(self, function_call: ast.FunctionCallNode, param):
        if function_call.name != None:
            function_call.name.accept(self, param)
        self.visit_children(function_call.parameters, param)
        f_name = ""
        if isinstance(function_call.name, ast.MemberAccessNode):
            f_name = function_call.name.member.value
        else:
            f_name = function_call.name.value
        message = ""
        if f_name in serial.get_not_implemented():
            message = f"La función {f_name} de Serial no está implementada, con lo que no cumplirá con su funcionalidad"
        elif f_name in servo.get_not_implemented():
            message = f"La función {f_name} de Servo no está implementada, con lo que no cumplirá con su funcionalidad"
        elif f_name in string.get_not_implemented():
            message = f"La función {f_name} de String no está implementada, con lo que no cumplirá con su funcionalidad"
        elif f_name in standard.get_not_implemented():
            message = f"La función {f_name} de la librería standard no está implementada, con lo que no cumplirá con su funcionalidad"
        if message != "":
            self.warnings.append(console.Warning("No implementado", function_call.line, function_call.position, message))
        return None