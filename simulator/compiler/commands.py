import importlib
import time
import output.console as console
import compiler.transpiler as transpiler
import libraries.standard as standard
import libraries.serial as serial
import robot_components.robot_state as state


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
        warns, errors = transpiler.transpile(self.controller.get_code())
        if len(errors) > 0:
            self.print_errors(errors)
            return False
        elif len(warns) > 0:
            self.print_warnings(warns)
            return True
        return True

    def print_warnings(self, warnings):
        for warning in warnings:
            self.controller.console.write_warning(warning)

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
            try:
                self.module.setup()
            except:
                self.controller.console.write_error(console.Error("Error de ejecución", 0, 0, "El sketch no se ha podido ejecutar correctamente"))
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
            not standard.state.exited and self.controller.executing
        ):
            try:
                self.module.loop()
            except:
                self.controller.console.write_error(console.Error("Error de ejecución", 0, 0, "El sketch no se ha podido ejecutar correctamente"))
                self.controller.executing = False

    def __import_module(self):
        self.module = importlib.import_module('temp.script_arduino')