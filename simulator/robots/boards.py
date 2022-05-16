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

    def get_pin_element(self, pin):
        """
        Gets the element attached to a pin
        Arguments:
            pin: the pin from which we want to get the element
        Returns:
            The element attached to the pin or None if there is none
            attached
        """
        if pin in self.used_pins:
            return self.used_pins[pin]["element"]
        return None

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