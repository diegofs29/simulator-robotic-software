import simulator.compiler.transpiler as transpiler


class Command:

    def execute(self):
        """
        Executes a command object
        """
        pass


class ExecuteCode(Command):

    def __init__(self, console):
        self.transpiler = transpiler.Transpiler(console)

    def execute(self):
        return super().execute()

    def transpile(self):
        """
        Transpiles the programmed code
        """
        if self.robot != None:
            self.transpiler.transpile()

    def set_robot(self, robot):
        """
        Sets the robot to compile for
        Arguments:
            robot: the robot to set
        """
        self.robot = robot