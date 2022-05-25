import simulator.robots.robots as robots
import simulator.libraries.servo as servo


class LibraryCreator:

    def __init__(self):
        pass

    def create_servo(self):
        return servo.Servo()

    def set_robot(self, robot: robots.Robot):
        self.robot = robot