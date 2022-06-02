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
        self.locals = {}
        self.globals = {}

    def visit_declaration(self, declaration: ast.DeclarationNode, param):
        if declaration.type != None:
            declaration.type.accept(self, param)
        if declaration.expr != None:
            declaration.expr.accept(self, param)
        self.add_declaration(declaration.function, declaration.var_name, declaration)
        return None

    def visit_array_declaration(self, array_declaration: ast.ArrayDeclarationNode, param):
        if array_declaration.type != None:
            array_declaration.type.accept(self, param)
        self.visit_array_elements(array_declaration.elements, param)
        self.add_declaration(array_declaration.function, array_declaration.var_name, array_declaration)
        return None

    def visit_define_macro(self, define_macro: ast.DefineMacroNode, param):
        if define_macro.expr != None:
            define_macro.expr.accept(self, param)
        self.visit_array_elements(define_macro.elements, param)
        self.add_declaration(define_macro.function, define_macro.macro_name, define_macro)
        return None

    def visit_function(self, function: ast.FunctionNode, param):
        if function.type != None:
            function.type.accept(self, param)
        self.visit_children(function.args, param)
        if function.sentences != None:
            for sent in function.sentences:
                sent.set_function(function)
                sent.accept(self, param)
        return None

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
        lib_name = ""
        if isinstance(function_call.name, ast.MemberAccessNode):
            f_name = function_call.name.member.value
            lib_name = function_call.name.element.value
            if lib_name != 'Serial':
                lib_name = self.__lookfor_var(function_call.name.element.value, function_call.function).type.type_name
        else:
            f_name = function_call.name.value
            lib_name = "standard"
        message = ""
        if lib_name == 'Serial' and f_name in serial.get_not_implemented():
            message = f"La función {f_name} de Serial no está implementada, con lo que no cumplirá con su funcionalidad"
        elif lib_name == 'Servo' and f_name in servo.get_not_implemented():
            message = f"La función {f_name} de Servo no está implementada, con lo que no cumplirá con su funcionalidad"
        elif lib_name == 'String' and f_name in string.get_not_implemented():
            message = f"La función {f_name} de String no está implementada, con lo que no cumplirá con su funcionalidad"
        elif lib_name == 'standard' and f_name in standard.get_not_implemented():
            message = f"La función {f_name} de la librería standard no está implementada, con lo que no cumplirá con su funcionalidad"
        if message != "":
            self.warnings.append(console.Warning("No implementado", function_call.line, function_call.position, message))
        return None

    def add_declaration(self, function, name, decl):
        if function != None:
            if function.name in self.locals:
                self.locals[function.name][name] = decl
            else:
                self.locals[function.name] = {name: decl}
        else:
            self.globals[name] = decl

    def __lookfor_var(self, name, function):
        if function != None:
            if function.name in self.locals:
                if name in self.locals[function.name]:
                    return self.locals[function.name][name]
            elif name in self.globals:
                return self.globals[name]
        else:
            if name in self.globals:
                return self.globals[name]
        return None