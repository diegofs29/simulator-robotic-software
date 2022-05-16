import simulator.robots.elements as elems


class Servo:
    """
    Servo class, represents the movement of a real servo
    """

    def __init__(self):
        """
        Constructor for Servo class
        """
        self.pin = -1
        self.min = 544
        self.max = 2400
        self.speed = 90

    def get_name(self):
        return "Servo"

    def get_methods(self):
        """
        Returns the methods of the library as a dict, whose
        key is the naming in Arduino and whose value is the
        corresponding method.
        Returns:
            A dict with the methods
        """
        methods = {}
        methods["attach"] = ("void", self.attach, ['int', '(int)', '(int)'])
        methods["write"] = ("void", self.write, ['int'])
        methods["writeMicroseconds"] = ("void", self.write_microseconds, ['int'])
        methods["read"] = ("int", self.read, [])
        methods["attached"] = ("bool", self.attached, [])
        methods["detach"] = ("void", self.detach, [])
        return methods

    def attach(self, servo: elems.Servo, pin, min=544, max=2400):
        """
        Attaches the servo to a pin
        Arguments:
            servo: the servo to attach
            pin: the number of the pin to be attached to
            min: pulse width corresponging with the minimun angle on
            the servo (default = 544)
            max: pulse width corresponging with the max angel on the 
            the servo (default = 2400)
        """
        servo.pin = pin
        servo.min = min
        servo.max = max
        
    def write(self, servo: elems.Servo, angle):
        """
        Writes speed to servo.
        Our Servos, being rotation ones, will have their speed set by this
        method. If the angle is 0, the speed is full in one direction, if
        it is 180, is full speed in the oposite direction; with 90 being no
        movement done by the servo
        Arguments:
            servo: the servo to write to
            angle: the value to write [0-180]
        """
        servo.value = angle

    def write_microseconds(self, servo: elems.Servo, us):
        """
        Writes speed to servo in microseconds.
        This method will work exactly the same way as write does (because our
        servos are rotation ones)
        Arguments:
            servo: the servo to write to
            us: the value of the parameter in microseconds (int)
        """
        servo.value = us

    def read(self, servo: elems.Servo):
        """
        Reads the angle of the servo (being the last value passed to write)
        Arguments:
            The servo to read from
        Returns:
            The angle of the servo from 0 to 180 degrees
        """
        return servo.value

    def attached(self, servo: elems.Servo):
        """
        Checks wether the Servo variable is attached or not
        Arguments:
            servo: the servo to check
        Returns:
            True if attached to pin, False if else
        """
        return servo.pin != -1

    def detach(self, servo: elems.Servo):
        """
        Detach the Servo variable from its pin
        Arguments:
            servo: the servo to detach
        """
        servo.pin = -1