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

    def check_type(self, pin, type):
        """
        Checks if a pin is of the requested type
        Arguments: 
            pin: the pin to check
            type: the requested type
        Returns:
            True if it is of the type, False if else
        """
        if type == "digital":
            return self.is_digital(pin)
        elif type == "analog":
            return self.is_analog(pin)
        elif type == "txrx":
            return self.is_txrx(pin)
        return False

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
        ) and not pin in self.used_pins:
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

    def get_value(self, pin=-1):
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
    
    def get_pin_type(self):
        """
        Returns connection type needed for the pin
        """
        return "digital"


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

    def get_pin_type(self):
        """
        Returns connection type needed for the pin
        """
        return "digital"


class Joystick(Element):

    def __init__(self):
        """
        Constructor for joystick
        """
        self.pinx = -1
        self.piny = -1
        self.pinb = -1
        self.dx = 0
        self.dy = 0
        self.value = 0

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
        elif pin == self.pinb:
            return self.value
        else:
            return None

    def set_value(self, pin, value):
        if 0 <= value <= 1023:
            if pin == self.pinx:
                self.dx = value
            elif pin == self.piny:
                self.dy = value
            elif pin == self.pinb:
                self.value = value
            else:
                return False
            return True
        return False

    def get_button_pin_type(self):
        """
        Returns connection type needed for the button pin
        """
        return "digital"

    def get_x_pin_type(self):
        """
        Returns connection type needed for the x pin
        """
        return "analog"
    
    def get_y_pin_type(self):
        """
        Returns connection type needed for the y pin
        """
        return "analog"


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

    def get_pin_type(self):
        """
        Returns connection type needed for the pin
        """
        return "digital"


class UltrasoundSensor(Element):

    def __init__(self):
        """
        Constructor for Ultrasound sensor
        """
        self.pin_trig = -1
        self.pin_echo = -1
        self.value = 0
        self.dist = -1

    def set_value(self, pin, value):
        if pin == self.pin_trig:
            if value == 1 or value == 0:
                super().set_value(pin, value)
                return True
        return False

    def get_pulse(self, pin, value):
        if pin == self.pin_echo:
            return self.dist
        return None

    def get_echo_pin_type(self):
        """
        Returns the type of the connection needed for the echo
        pin
        """
        return "digital"

    def get_trig_pin_type(self):
        """
        Returns the type of the connection needed for the trig
        pin
        """
        return "digital"


class MobileRobot:

    def __init__(self, n_ligth_sens, pins):
        """
        Constructor for mobile robot
        Arguments:
            n_light_sens: the number of light sensors
            of the robot
            pins: the used pins of the board
        """
        self.board = BQzumBT328()

        self.servo_left = Servo()
        self.servo_right = Servo()

        self.light_sensors = []
        i = 0
        while i < n_ligth_sens:
            self.light_sensors.append(LightSensor())
            i += 1

        self.sound = UltrasoundSensor()

        self.assign_pins(pins)

    def assign_pins(self, pins):
        """
        Assigns the pins to the corresponding element
        Arguments:
            pins: a list of tuples with the name of the element
            and the corresponding pin
        """
        for pin in pins:
            name = pin[0]
            pin = pin[1]
            if name == "servo left":
                self.set_servo_left(pin)
            elif name == "servo right":
                self.set_servo_right(pin)
            elif name == "light 1":
                self.set_light_mleft(pin)
            elif name == "light 2":
                self.set_light_left(pin)
            elif name == "light 3":
                self.set_light_right(pin)
            elif name == "light 4":
                self.set_light_mright(pin)
            elif name == "trig":
                self.set_sound_trig(pin)
            elif name == "echo":
                self.set_sound_echo(pin)

    def set_light_sens_value(self, values):
        """
        Sets the light sensor values
        Arguments:
            values: the values to write into the sensors
        """
        for i in range(0, len(self.light_sensors)):
            self.light_sensors[i].value = values[i]

    def set_servo_left(self, pin):
        """
        Sets servo left attached to a pin and marks
        the pin as used at the board
        """
        if self.board.check_type(pin, self.servo_left.get_pin_type()):
            if self.board.attach_pin(pin, self.servo_left):
                self.servo_left.pin = pin

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
        if self.board.check_type(pin, self.servo_right.get_pin_type()):
            if self.board.attach_pin(pin, self.servo_right):
                self.servo_right.pin = pin

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
        light = self.light_sensors[0]
        if self.board.check_type(pin, light.get_pin_type()):
            if self.board.attach_pin(pin, light):
                light.pin = pin

    def detach_light_mleft(self):
        """
        Detaches the most left light sensor from board
        """
        light = self.light_sensors[0]
        self.board.detach_pin(light.pin)
        light.pin = -1

    def set_light_left(self, pin):
        """
        Sets left light sensor attached to a pin
        and marks the pin as used at the board
        """
        light = self.light_sensors[0] if len(self.light_sensors) == 2 else self.light_sensors[1]
        if self.board.check_type(pin, light.get_pin_type()):
            if self.board.attach_pin(pin, light):
                light.pin = pin

    def detach_light_left(self):
        """
        Detaches left light sensor from board
        """
        light = self.light_sensors[0] if len(self.light_sensors) == 2 else self.light_sensors[1]
        self.board.detach_pin(light.pin)
        light.pin = -1

    def set_light_right(self, pin):
        """
        Sets right light sensor attached to a pin
        and marks the pin as used at the board
        """
        light = self.light_sensors[1] if len(self.light_sensors) == 2 else self.light_sensors[2]
        if self.board.check_type(pin, light.get_pin_type()):
            if self.board.attach_pin(pin, light):
                light.pin = pin

    def detach_light_right(self):
        """
        Detaches right light sensor from board
        """
        light = self.light_sensors[1] if len(self.light_sensors) == 2 else self.light_sensors[2]
        self.board.detach_pin(light.pin)
        light.pin = -1

    def set_light_mright(self, pin):
        """
        Sets the most right light sensor attached to a pin
        and marks the pin as used at the board
        """
        light = self.light_sensors[3]
        if self.board.check_type(pin, light.get_pin_type()):
            if self.board.attach_pin(pin, light):
                light.pin = pin

    def detach_light_mright(self):
        """
        Detaches the most right light sensor from board
        """
        light = self.light_sensors[3]
        self.board.detach_pin(light.pin)
        light.pin = -1

    def set_sound_trig(self, pin):
        """
        Sets sound sensor attached to a pin (trig) and marks it
        as used at the board
        """
        if self.board.check_type(pin, self.sound.get_trig_pin_type()):
            if self.board.attach_pin(pin, self.sound):
                self.sound.pin_trig = pin

    def detach_sound_trig(self):
        """
        Detaches ultrasound sensor (trig) from board
        """
        self.board.detach_pin(self.sound.pin_trig)
        self.sound.pin_trig = -1

    def set_sound_echo(self, pin):
        """
        Sets sound sensor attached to a pin (echo) and marks it
        as used at the board
        """
        if self.board.check_type(pin, self.sound.get_echo_pin_type()):
            if self.board.attach_pin(pin, self.sound):
                self.sound.pin_echo = pin

    def detach_sound_echo(self):
        """
        Detaches ultrasound sensor (echo) from board
        """
        self.board.detach_pin(self.sound.pin_echo)
        self.sound.pin_echo = -1


class LinearActuator:

    def __init__(self, pins):
        """
        Constructor for Linear Actuator
        Arguments:
            pins: the used pins of the board
        """
        self.board = ArduinoUno()

        self.button_left = Button()
        self.button_right = Button()

        self.servo = Servo()

        self.joystick = Joystick()

        self.assign_pins(pins)

    def assign_pins(self, pins):
        """
        Assigns the pins to the corresponding element
        Arguments:
            pins: a list of tuples with the name of the element
            and the corresponding pin
        """
        for pin in pins:
            name = pin[0]
            pin = pin[1]
            if name == "servo":
                self.set_servo(pin)
            elif name == "button joystick":
                self.set_joystick_button(pin)
            elif name == "x joystick":
                self.set_joystick_x(pin)
            elif name == "y joystick":
                self.set_joystick_y(pin)
            elif name == "button left":
                self.set_button_left(pin)
            elif name == "button right":
                self.set_button_right(pin)

    def set_button_left(self, pin):
        """
        Attaches left button to board pin
        Arguments:
            pin: the pin of the board
        """
        if self.board.check_type(pin, self.button_left.get_pin_type()):
            if self.board.attach_pin(pin, self.button_left):
                self.button_left.pin = pin

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
        if self.board.check_type(pin, self.button_right.get_pin_type()):
            if self.board.attach_pin(pin, self.button_right):
                self.button_right.pin = pin

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
        if self.board.check_type(pin, self.servo.get_pin_type()):
            if self.board.attach_pin(pin, self.servo):
                self.servo.pin = pin

    def detach_servo(self):
        """
        Detaches servo from board
        """
        self.board.detach_pin(self.servo.pin)
        self.servo.pin = -1

    def set_joystick_x(self, pin):
        """
        Attaches joystick (x) to board pin
        Arguments:
            pin: the pin of the board
        """
        if self.board.check_type(pin, self.joystick.get_x_pin_type()):
            if self.board.attach_pin(pin, self.joystick):
                self.joystick.pinx = pin

    def detach_joystick_x(self):
        """
        Detaches joystick (x) from board
        """
        self.board.detach_pin(self.joystick.pinx)
        self.joystick.pinx = -1

    def set_joystick_y(self, pin):
        """
        Attaches joystick (y) to board pin
        Arguments:
            pin: the pin of the board
        """
        if self.board.check_type(pin, self.joystick.get_y_pin_type()):
            if self.board.attach_pin(pin, self.joystick):
                self.joystick.piny = pin

    def detach_joystick_x(self):
        """
        Detaches joystick (y) from board
        """
        self.board.detach_pin(self.joystick.piny)
        self.joystick.piny = -1

    def set_joystick_button(self, pin):
        """
        Attaches joystick (x) to board pin
        Arguments:
            pin: the pin of the board
        """
        if self.board.check_type(pin, self.joystick.get_button_pin_type()):
            if self.board.attach_pin(pin, self.joystick):
                self.joystick.pinb = pin

    def detach_joystick_button(self):
        """
        Detaches joystick (x) from board
        """
        self.board.detach_pin(self.joystick.pinb)
        self.joystick.pinb = -1