import importlib
import simulator.compiler.transpiler as transpiler
import simulator.libraries.standard as standard
import simulator.libraries.serial as serial
import simulator.console.console as console


class Command:

    def __init__(self, model):
        self.model = model
        self.ready = False
        
    def execute(self):
        """
        Executes a command object
        """
        pass

    def reboot(self):
        self.ready = False

    def prepare_exec(self):
        standard.board = self.model.robot_layer.robot.board
        serial.cons = self.model.console
        self.ready = True


class Compile(Command):

    def __init__(self, model):
        super().__init__(model)

    def execute(self):
        errors = transpiler.transpile(self.model.get_code(), self.model.robot_layer.robot)
        if len(errors) > 0:
            self.print_errors(errors)
            return False
        return True

    def print_errors(self, errors):
        for error in errors:
            self.model.console.write_error(error)


class Setup(Command):

    def __init__(self, model):
        super().__init__(model)
        

    def execute(self):
        self.__import_module()
        if not self.ready:
            self.prepare_exec()
            importlib.reload(self.module)
        self.module.setup()
        return True

    def __import_module(self):
        self.module = importlib.import_module('simulator.temp.script_arduino')


class Loop(Command):

    def __init__(self, model):
        super().__init__(model)

    def execute(self):
        self.__import_module()
        if not self.ready:
            self.prepare_exec()
        self.module.loop()

    def __import_module(self):
        self.module = importlib.import_module('simulator.temp.script_arduino')