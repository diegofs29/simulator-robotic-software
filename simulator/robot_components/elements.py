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
        self.min = 544  # default arduino value
        self.max = 2400  # default arduino value
        self.value = 90  # stopped (180 and 0 full speed)

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
        self.value = 1

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
        self.dx = 500
        self.dy = 500
        self.value = 1

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
