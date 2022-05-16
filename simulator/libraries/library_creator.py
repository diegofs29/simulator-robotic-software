import simulator.console.console as console
import simulator.robots.robots as robots
import simulator.libraries.standard as std
import simulator.libraries.serial as serial
import simulator.libraries.servo as servo


class LibraryCreator:

    def __init__(self, console: console.Console):
        self.console = console

    def create_servo(self):
        return servo.Servo()

    def set_robot(self, robot: robots.Robot):
        self.robot = robot