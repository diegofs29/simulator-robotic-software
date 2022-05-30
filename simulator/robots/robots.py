"""
This module defines the components used for both robots.
Those being: Servos, board, sensors and inputs (button and
joystick)
"""

import robots.boards as boards
import robots.elements as elements


class Robot:

    def __init__(self, board):
        self.board = board

    def get_data(self):
        pass

    def assign_pins(self):
        pass

    def parse_pin(self, pin):
        if str(pin[0]).lower() == 'a':
            return int(pin[1]) + 14
        return int(pin)


class MobileRobot(Robot):

    def __init__(self, n_ligth_sens, pins):
        """
        Constructor for mobile robot
        Arguments:
            n_light_sens: the number of light sensors
            of the robot
            pins: the used pins of the board
        """
        super().__init__(boards.BQzumBT328())

        self.servo_left = elements.Servo()
        self.servo_right = elements.Servo()

        self.light_sensors = []
        i = 0
        while i < n_ligth_sens:
            self.light_sensors.append(elements.LightSensor())
            i += 1

        self.sound = elements.UltrasoundSensor()

        self.assign_pins(pins)

    def get_data(self):
        data = None
        if len(self.light_sensors) == 2:
            data = {
                "servo_left": self.servo_left.pin,
                "servo_right": self.servo_right.pin,
                "light_left": self.light_sensors[0].pin,
                "light_right": self.light_sensors[1].pin,
                "sound_trig": self.sound.pin_trig,
                "sound_echo": self.sound.pin_echo
            }
        else:
            data = {
                "servo_left": self.servo_left.pin,
                "servo_right": self.servo_right.pin,
                "light_mleft": self.light_sensors[0].pin,
                "light_left": self.light_sensors[1].pin,
                "light_right": self.light_sensors[2].pin,
                "light_mright": self.light_sensors[3].pin,
                "sound_trig": self.sound.pin_trig,
                "sound_echo": self.sound.pin_echo
            }
        return data

    def assign_pins(self, pins):
        """
        Assigns the pins to the corresponding element
        Arguments:
            pins: a list of tuples with the name of the element
            and the corresponding pin
        """
        for pin in pins:
            name = pin[0]
            pin = self.parse_pin(pin[1])
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


class LinearActuator(Robot):

    def __init__(self, pins):
        """
        Constructor for Linear Actuator
        Arguments:
            pins: the used pins of the board
        """
        super().__init__(boards.ArduinoUno())

        self.button_left = elements.Button()
        self.button_right = elements.Button()

        self.servo = elements.Servo()

        self.joystick = elements.Joystick()

        self.assign_pins(pins)

    def get_data(self):
        return {
            "button_left": self.button_left.pin,
            "button_right": self.button_right.pin,
            "servo": self.servo.pin,
            "button_joystick": self.joystick.pinb,
            "joystick_x": self.joystick.pinx,
            "joystick_y": self.joystick.piny
        }

    def assign_pins(self, pins):
        """
        Assigns the pins to the corresponding element
        Arguments:
            pins: a list of tuples with the name of the element
            and the corresponding pin
        """
        for pin in pins:
            name = pin[0]
            pin = self.parse_pin(pin[1])
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

    def detach_joystick_y(self):
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