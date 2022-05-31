import importlib
import time
import compiler.transpiler as transpiler
import libraries.standard as standard
import libraries.serial as serial
import robots.robot_state as state


class Command:

    def __init__(self, controller):
        self.controller = controller
        self.ready = False
        
    def execute(self):
        """
        Executes a command object
        """
        pass

    def reboot(self):
        self.ready = False

    def prepare_exec(self):
        standard.board = self.controller.robot_layer.robot.board
        standard.state = state.State()
        serial.cons = self.controller.console
        self.ready = True


class Compile(Command):

    def __init__(self, controller):
        super().__init__(controller)

    def execute(self):
        errors = transpiler.transpile(self.controller.get_code(), self.controller.robot_layer.robot)
        if len(errors) > 0:
            self.print_errors(errors)
            return False
        return True

    def print_errors(self, errors):
        for error in errors:
            self.controller.console.write_error(error)


class Setup(Command):

    def __init__(self, controller):
        super().__init__(controller)
        

    def execute(self):
        self.__import_module()
        if not self.ready:
            self.prepare_exec()
            importlib.reload(self.module)
        curr_time_ns = time.time_ns()
        if (
            not standard.state.exec_time_us > curr_time_ns / 1000 and
            not standard.state.exec_time_ms > curr_time_ns / 1000000
        ):
            self.module.setup()
        return True

    def __import_module(self):
        self.module = importlib.import_module('temp.script_arduino')


class Loop(Command):

    def __init__(self, controller):
        super().__init__(controller)

    def execute(self):
        self.__import_module()
        if not self.ready:
            self.prepare_exec()
        curr_time_ns = time.time_ns()
        if (
            not standard.state.exec_time_us > curr_time_ns / 1000 and
            not standard.state.exec_time_ms > curr_time_ns / 1000000 and
            not standard.state.exited
        ):
            self.module.loop()

    def __import_module(self):
        self.module = importlib.import_module('temp.script_arduino')