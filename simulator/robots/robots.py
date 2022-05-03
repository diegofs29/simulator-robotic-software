"""
This module defines the components used for both robots.
Those being: Servos, board, sensors and inputs (button and
joystick)
"""


class Board:

    INPUT = "input"
    OUTPUT = "output"
    INPUT_PULLUP = "input_pullup"

    def __init__(self):
        """
        Constructor for Arduino board
        """
        self.pins = {}
        self.used_pins = {}

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

    def is_txrx(self, pin):
        """
        Checks if the pin is tx/rx or not.
        Arguments:
            pin: the pin to check if is tx/rx
        Returns:
            True if is tx/rx, False if else
        """
        return pin in self.pins["txrx"]

    def attach_pin(self, pin, elem):
        """
        Attaches a element to a pin
        Arguments:
            pin: the used pin
            elem: the elem to attach
        Returns:
            True if attached, False if else
        """
        if (
            pin in self.pins["analog"] or
            pin in self.pins["digital"] or
            pin in self.pins["txrx"]
        ):
            self.used_pins[pin] = {
                "element": elem,
                "mode": self.INPUT
            }
            return True
        return False

    def detach_pin(self, pin):
        """
        Detaches a element from a pin
        Arguments:
            pin: the pin to detach
        Returns:
            True if detached, False if else
        """
        if pin in self.used_pins:
            del self.used_pins[pin]
            return True
        return False

    def read(self, pin):
        """
        Reads the value of the elements
        Arguments:
            pin: the pin to read
        Returns:
            The value of the output or None if pin not input
        """
        if self.__is_used_pin(pin):
            if self.used_pins[pin]["mode"] == self.INPUT:
                return self.used_pins[pin]["element"].get_value(pin)
        return None

    def read_pulse(self, pin, value):
        """
        Reads a pulse from a pin
        Arguments:
            pin: the pin to read the pulse from
            value: the value (0 or 1) to read
        Returns:
            The value or None if no value
        """
        if self.__is_used_pin(pin):
            if self.used_pins[pin]["mode"] == self.INPUT:
                return self.used_pins[pin]["element"].get_pulse(pin)
        return None

    def write_value(self, pin, value):
        """
        Writes value to element
        Arguments:
            pin: the pin of the element to write
            value: the value to write
        Returns:
            True if operation done, False if else
        """
        if self.__is_used_pin(pin):
            if self.used_pins[pin]["mode"] == self.OUTPUT:
                self.used_pins[pin]["element"].set_value(value)
                return True
        return False

    def set_pin_mode(self, pin, mode):
        """
        Changes pin's mode
        Arguments:
            pin: the pin whose mode will be changed
            mode: the mode to use
        Returns:
            True if operation done, False if else
        """
        if self.__is_used_pin(pin):
            self.used_pins[pin]["mode"] = mode
            return True
        return False

    def __is_used_pin(self, pin):
        """
        Checks if a pin is being used
        Arguments:
            pin: the pin to check
        Returns:
            True if used, False if else
        """
        return pin in self.used_pins


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


class Element:

    def __init__(self):
        """
        Constructor for Element
        """
        self.value = 0

    def get_value(self, pin):
        """
        Gets the value (digital or analog) of the element
        Arguments:
            pin: the pin to read (only needed in case the 
            element uses 2 or more pins)
        Returns:
            The value of the element
        """
        return self.value

    def set_value(self, pin, value):
        """
        Writes a value into an element
        Arguments:
            pin: the pin to write (only needed in case the
            element uses 2 or more pins)
            value: the value to write
        """
        self.value = value

    def get_pulse(self, pin, value):
        """
        Reads a pulse value from a pin
        Arguments:
            pin: the pin to read from
            value: the value to read
        Returns:
            The read value or None if none read
        """
        return None


class Servo(Element):

    def __init__(self):
        """
        Constructor for servo class.
        The servo will be rotational.
        """
        self.pin = -1
        self.min = 544 #default arduino value
        self.max = 2400 #default arduino value
        self.value = 90 #stopped (180 and 0 full speed)

    def set_value(self, pin, value):
        """
        Writes speed to servo.
        Arguments:
            angle: the value to write [0-180]
        Returns:
            True if updated, False if else
        """
        if 0 <= value <= 180:
            super().set_value(pin, value)
            return True
        return False


class Button(Element):

    def __init__(self):
        """
        Constructor for button
        """
        self.pin = -1
        self.value = 0

    def set_value(self, pin, value):
        if value == 1 or value == 0:
            super().set_value(pin, value)
            return True
        return False


class Joystick(Element):

    def __init__(self):
        """
        Constructor for joystick
        """
        self.pinx = -1
        self.piny = -1
        self.dx = 0
        self.dy = 0

    def get_value(self, pin):
        """
        Gets the analog value of the selected pin
        Arguments:
            pin: the pin to read
        Returns:
            The value of the pin
        """
        if pin == self.pinx:
            return self.dx
        elif pin == self.piny:
            return self.dy
        else:
            return None

    def set_value(self, pin, value):
        if 0 <= value <= 1023:
            if pin == self.pinx:
                self.dx = value
            elif pin == self.piny:
                self.dy = value
            else:
                return False
            return True
        return False


class LightSensor(Element):

    def __init__(self):
        """
        Constructor for Light sensor
        """
        self.pin = -1
        self.value = 0

    def set_value(self, pin, value):
        if value == 1 or value == 0:
            super().set_value(pin, value)
            return True
        return False


class UltrasoundSensor(Element):

    def __init__(self):
        """
        Constructor for Ultrasound sensor
        """
        self.pin_trig = -1
        self.pin_echo = -1
        self.value = -1

    def set_value(self, pin, value):
        if pin == self.pin_trig:
            if value == 1 or value == 0:
                super().set_value(pin, value)
                return True
        return False

    def get_pulse(self, pin, value):
        if pin == self.pin_echo:
            if value == 1:
                return self.value
        return None


class MobileRobot:

    def __init__(self):
        """
        Constructor for mobile robot
        """
        self.board = BQzumBT328()

        self.servo_left = Servo()
        self.servo_right = Servo()

        self.light_mleft = LightSensor()
        self.light_left = LightSensor()
        self.light_right = LightSensor()
        self.light_mright = LightSensor()

        self.sound = UltrasoundSensor()

    def set_servo_left(self, pin):
        """
        Sets servo left attached to a pin and marks
        the pin as used at the board
        """
        self.servo_left.pin = pin
        self.board.attach_pin(pin, self.servo_left)

    def detach_servo_left(self):
        """
        Detaches left sensor from board
        """
        self.board.detach_pin(self.servo_left.pin)
        self.servo_left.pin = -1

    def set_servo_right(self, pin):
        """
        Sets servo right attached to a pin and marks
        the pin as used at the board
        """
        self.servo_right.pin = pin
        self.board.attach_pin(pin, self.servo_right)

    def detach_servo_right(self):
        """
        Detaches right sensor from board
        """
        self.board.detach_pin(self.servo_right.pin)
        self.servo_right.pin = -1

    def set_light_mleft(self, pin):
        """
        Sets the most left light sensor attached to a pin
        and marks the pin as used at the board
        """
        self.light_mleft.pin = pin
        self.board.attach_pin(pin, self.light_mleft)

    def detach_light_mleft(self):
        """
        Detaches the most left light sensor from board
        """
        self.board.detach_pin(self.light_mleft.pin)
        self.light_mleft.pin = -1

    def set_light_left(self, pin):
        """
        Sets left light sensor attached to a pin
        and marks the pin as used at the board
        """
        self.light_left.pin = pin
        self.board.attach_pin(pin, self.light_left)

    def detach_light_left(self):
        """
        Detaches left light sensor from board
        """
        self.board.detach_pin(self.light_left.pin)
        self.light_left.pin = -1

    def set_light_right(self, pin):
        """
        Sets right light sensor attached to a pin
        and marks the pin as used at the board
        """
        self.light_right.pin = pin
        self.board.attach_pin(pin, self.light_right)

    def detach_light_right(self):
        """
        Detaches right light sensor from board
        """
        self.board.detach_pin(self.light_right.pin)
        self.light_right.pin = -1

    def set_light_mright(self, pin):
        """
        Sets the most right light sensor attached to a pin
        and marks the pin as used at the board
        """
        self.light_mright.pin = pin
        self.board.attach_pin(pin, self.light_mright)

    def detach_light_mright(self):
        """
        Detaches the most right light sensor from board
        """
        self.board.detach_pin(self.light_mright.pin)
        self.light_mright.pin = -1

    def set_sound(self, pin):
        """
        Sets sound sensor attached to a pin and marks it
        as used at the board
        """
        self.sound.pin = pin
        self.board.attach_pin(pin, self.sound)

    def detach_sound(self):
        """
        Detaches ultrasound sensor from board
        """
        self.board.detach_pin(self.sound.pin)
        self.sound.pin = -1


class LinearActuator:

    def __init__(self):
        """
        Constructor for Linear Actuator
        """
        self.board = ArduinoUno()

        self.button_left = Button()
        self.button_right = Button()

        self.servo = Servo()

        self.joystick = Joystick()

    def set_button_left(self, pin):
        """
        Attaches left button to board pin
        Arguments:
            pin: the pin of the board
        """
        self.button_left.pin = pin
        self.board.attach_pin(pin, self.button_left)

    def detach_button_left(self):
        """
        Detaches left button from board
        """
        self.board.detach_pin(self.button_left.pin)
        self.button_left.pin = -1

    def set_button_right(self, pin):
        """
        Attaches right button to board pin
        Arguments:
            pin: the pin of the board
        """
        self.button_right.pin = pin
        self.board.attach_pin(pin, self.button_right)

    def detach_button_right(self):
        """
        Detaches right button from board
        """
        self.board.detach_pin(self.button_right.pin)
        self.button_right.pin = -1

    def set_servo(self, pin):
        """
        Attaches servo to board pin
        Arguments:
            pin: the pin of the board
        """
        self.servo.pin = pin
        self.board.attach_pin(pin, self.servo)

    def detach_servo(self):
        """
        Detaches servo from board
        """
        self.board.detach_pin(self.servo.pin)
        self.servo.pin = -1

    def set_joystick(self, pin):
        """
        Attaches joystick to board pin
        Arguments:
            pin: the pin of the board
        """
        self.joystick.pin = pin
        self.board.attach_pin(pin, self.joystick)

    def detach_joystick(self):
        """
        Detaches joystick from board
        """
        self.board.detach_pin(self.joystick.pin)
        self.joystick.pin = -1