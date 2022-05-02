"""
This module defines the components used for both robots.
Those being: Servos, board, sensors and inputs (button and
joystick)
"""


class Board:

    def __init__(self):
        """
        Constructor for Arduino board
        """
        self.pins = {}

    def get_digital_pins(self):
        """
        Returns:
            The list of digital pins of the board
        """
        return self.pins["digital"]

    def get_analog_pins(self):
        """
        Returns:
            The list of analog pins of the board
        """
        return self.pins["analog"]

    def get_txrx_pins(self):
        """
        Returns:
            The list of txrx pins of the board
        """
        return self.pins["txrx"]

    def is_digital(self, pin):
        """
        Checks if the pin is digital or not. The tx rx pins
        are considered as digital. However, the compiler
        must check if serial is being used, if not it would
        be executing wrong code.
        Arguments:
            pin: the pin to check if is digital
        Returns:
            True if is digital, False if else
        """
        return pin in self.pins["digital"] or pin in self.pins["txrx"]

    def is_analog(self, pin):
        """
        Checks if the pin is analog or not.
        Arguments:
            pin: the pin to check if is analog
        Returns:
            True if is analog, False if else
        """
        return pin in self.pins["analog"]


class ArduinoUno(Board):

    def __init__(self):
        """
        Constructor for Arduino Uno board.
        Includes the following pins as stated at: 
        https://docs.arduino.cc/tutorials/uno-rev3/intro-to-board
        - Pins 2-13 are digital
        - Pins A0-A5 are analog
        - Pins 0 and 1 are tx/rx (no digital i/o if also using serial
        communication)
        """
        super().__init__()
        self.pins["digital"] = list(map(lambda x: str(x), range(2, 14)))
        self.pins["analog"] = list(map(lambda x: "A{}".format(x), range(0, 6)))
        self.pins["txrx"] = ["0", "1"]


class BQzumBT328(Board):

    def __init__(self):
        """
        Constructor for Arduino Uno board.
        Includes the following pins as stated at: 
        https://aiglesias.com/?p=7314 (Spanish)
        - Pins 2-13 are digital
        - Pins A0-A5 are analog
        - Pins 0 and 1 are tx/rx (no digital i/o if also using serial
        communication)
        """
        super().__init__()
        self.pins["digital"] = list(map(lambda x: str(x), range(2, 14)))
        self.pins["analog"] = list(map(lambda x: "A{}".format(x), range(0, 6)))
        self.pins["txrx"] = ["0", "1"]


class Servo:

    def __init__(self):
        """
        Constructor for servo class.
        The servo will be rotational.
        """
        self.pin = -1
        self.min = 544 #default arduino value
        self.max = 2400 #default arduino value
        self.speed = 90 #stopped (180 and 0 full speed)

    def write(self, angle):
        """
        Writes speed to servo.
        Arguments:
            angle: the value to write [0-180]
        Returns:
            True if updated, False if else
        """
        if 0 <= angle <= 180:
            self.speed = angle
            return True
        return False


class Button:

    def __init__(self):
        self.pin = -1
        self.pressed = False


class Joystick:

    def __init__(self):
        self.pin = -1
        self.dx = 0
        self.dy = 0


class LightSensor:

    def __init__(self):
        self.pin = -1
        self.dark = False


class UltrasoundSensor:

    def __init__(self):
        self.pin = -1
        self.detecting = False