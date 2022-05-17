import importlib
import simulator.compiler.transpiler as transpiler
import simulator.console.console as console


class Command:

    def execute(self):
        """
        Executes a command object
        """
        pass


class Compile(Command):

    def __init__(self, cons):
        self.cons: console.Console = cons

    def execute(self):
        errors = transpiler.transpile()
        if len(errors) > 1:
            self.print_errors(errors)

    def print_errors(self, errors):
        for error in errors:
            self.cons.write_error(error.to_string())


class Setup(Command):

    def __init__(self):
        self.module = importlib.import_module('script_arduino', 'simulator.temp')

    def execute(self):
        self.module.setup()


class Loop(Command):

    def __init__(self):
        self.module = importlib.import_module('script_arduino', 'simulator.temp')

    def execute(self):
        self.module.loop()