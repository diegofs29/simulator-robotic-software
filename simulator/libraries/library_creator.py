import simulator.console.console as console
import simulator.robots.robots as robots
import simulator.libraries.standard as std
import simulator.libraries.serial as serial
import simulator.libraries.servo as servo


class LibraryCreator:

    def __init__(self, console: console.Console):
        self.console = console

    def create_standard(self):
        if self.robot != None:
            return std.Standard(self.robot.board)
        return None

    def create_serial(self):
        return serial.Serial(self.robot.board, self.console)

    def create_servo(self):
        return servo.Servo(self.robot.board)

    def set_robot(self, robot: robots.Robot):
        self.robot = robot