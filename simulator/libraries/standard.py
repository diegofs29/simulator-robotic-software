import string
import time
import random
from math import cos, sin, sqrt, tan
import simulator.robots.robots as robots


class Standard:
    """
    Standard Arduino library. Includes the methods pressent
    at: https://www.arduino.cc/reference/en/
    """

    HIGH = 1
    LOW = 0

    INPUT = "INPUT"
    OUTPUT = "OUTPUT"
    INPUT_PULLUP = "INPUT_PULLUP"

    OK = 0
    ERROR = -1
    NOT_IMPL_WARNING = -2

    def __init__(self, board: robots.Board):
        """
        Constructor for Standard class
        """
        self.start = time.time()
        self.board = board

    def get_name():
        return "Standard"

    def get_methods(self):
        """
        Returns the methods of the library as a dict, whose
        key is the naming in Arduino and whose value is the
        corresponding method.
        Returns:
            A dict with the methods
        """
        methods = {}
        #Digital I/O
        methods["digitalRead"] = ("int", self.digital_read, ["int"])
        methods["digitalWrite"] = ("void", self.digital_write, ["int", "int"])
        methods["pinMode"] = ("void", self.pin_mode, ["int", "int"])

        #Analog I/O
        methods["analogRead"] = ("int", self.analog_read, ["int"])
        methods["analogReference"] = ("void", self.analog_reference, []) #Not implemented
        methods["analogWrite"] = ("void", self.analog_write, ["int", "int"])

        #Zero, Due & MKR Family
        methods["analogReadResolution"] = ("void", self.analog_read_resolution, []) #Not implemented
        methods["analogWriteResolution"] = ("void", self.analog_write_resolution, []) #Not implemented

        #Advanced I/O
        methods["noTone"] = ("void", self.no_tone, []) #Not implemented
        methods["pulseIn"] = ("long", self.pulse_in, ["int", "int"])
        methods["pulseInLong"] = ("long", self.pulse_in_long, []) #Not implemented
        methods["shiftIn"] = ("byte", self.shift_in, []) #Not implemented
        methods["shiftOut"] = ("void", self.shift_out, []) #Not implemented
        methods["tone"] = ("void", self.tone, []) #Not implemented

        #Time
        methods["delay"] = ("void", self.delay, ["long"])
        methods["delayMicroseconds"] = ("void", self.delay_microseconds, ["uint"])
        methods["micros"] = ("ulong", self.micros, [])
        methods["millis"] = ("ulong", self.millis, [])

        #Math
        methods["abs"] = ("double", self.abs, ["int"])
        methods["constrain"] = ("double", self.constrain, ["double", "double", "double"])
        methods["map"] = ("int", self.map, ["int", "int", "int", "int", "int"])
        methods["max"] = ("double", self.max, ["double", "double"])
        methods["min"] = ("double", self.min, ["double", "double"])
        methods["pow"] = ("double", self.pow, ["float", "float"])
        methods["sq"] = ("double", self.sq, ["double"])
        methods["sqrt"] = ("double", self.sqrt, ["double"])

        #Trigonometry
        methods["cos"] = ("double", self.cos, ["float"])
        methods["sin"] = ("double", self.sin, ["float"])
        methods["tan"] = ("double", self.tan, ["float"])

        #Characters
        methods["isAlpha"] = ("bool", self.is_alpha, ["char"])
        methods["isAlphaNumeric"] = ("bool", self.is_alpha_numeric, ["char"])
        methods["isAscii"] = ("bool", self.is_ascii, ["char"])
        methods["isControl"] = ("bool", self.is_control, ["char"])
        methods["isDigit"] = ("bool", self.is_digit, ["char"])
        methods["isGraph"] = ("bool", self.is_graph, ["char"])
        methods["isHexadecimalDigit"] = ("bool", self.is_hexadecimal_digit, ["char"])
        methods["isLowerCase"] = ("bool", self.is_lower_case, ["char"])
        methods["isPrintable"] = ("bool", self.is_printable, ["char"])
        methods["isPunct"] = ("bool", self.is_punct, ["char"])
        methods["isSpace"] = ("bool", self.is_space, ["char"])
        methods["isUpperCase"] = ("bool", self.is_upper_case, ["char"])
        methods["isWhiteSpace"] = ("bool", self.is_whitespace, ["char"])
        
        #Random Numbers
        methods["random"] = ("long", self.random, ["int, int"]) #Caution, inverse order for two params
        methods["randomSeed"] = ("void", self.random_seed, []) #Not implemented

        #Bits and bytes
        methods["bit"] = ("int", self.bit, ["int"])
        methods["bitClear"] = ("int", self.bit_clear, ["int", "int"])
        methods["bitRead"] = ("int", self.bit_read, ["int", "int"])
        methods["bitSet"] = ("void", self.bit_set, ["int", "int"])
        methods["bitWrite"] = ("void", self.bit_write, ["int", "int", "int"])
        methods["highByte"] = ("byte", self.high_byte, ["double"])
        methods["lowByte"] = ("byte", self.low_byte, ["double"])

        #External Interrupts
        methods["attachInterrupt"] = ("void", self.attach_interrupt, []) #Not implemented
        methods["detachInterrupt"] = ("void", self.detach_interrupt, []) #Not implemented

        #Interrupts
        methods["interrupts"] = ("void", self.interrupts, []) #Not implemented
        methods["noInterrupts"] = ("void", self.no_interrupts, []) #Not implemented
        return methods

    # Digital I/O
    def digital_read(self, pin):
        """
        Reads the value from a specified digital pin
        Arguments:
            pin: the pin to read
        Returns:
            HIGH if reads 1, LOW if reads 0, None if else
        """
        if self.board.is_digital(pin):
            return self.board.read(pin)
        return None

    def digital_write(self, pin, value):
        """
        Writes a HIGH or a LOW value to a digital pin
        Arguments:
            pin: the pin which will be written
            value: the value to write (HIGH or LOW)
        Returns:
            -1 if error, 0 if else
        """
        if self.board.is_digital(pin):
            if self.board.write_value(pin, value):
                return self.OK
        return self.ERROR

    def pin_mode(self, pin, mode):
        """
        Configures the pin to behave as INPUT, OUTPUT or INPUT_PULLUP
        Arguments:
            pin: the pin whose mode will be configured
            mode: the mode to use
        Returns:
            -1 if error, 0 if else
        """
        if self.board.is_digital(pin):
            self.board.set_pin_mode(pin, mode)
            return self.OK
        return self.ERROR

    # Analog I/O
    def analog_read(self, pin):
        """
        Reads the value from the specified analog pin.
        Its value can be in the range [0-1023]
        Arguments:
            pin: the pin to read
        Returns:
            the value that is read or None if error
        """
        if self.board.is_analog(pin):
            return self.board.read(pin)
        return None

    def analog_reference(self):
        """
        Should configure the reference voltage. As it is not
        necessary for the purpose of the simulator, it is not
        implemented
        Returns:
            -2, as a warning of not implemented
        """
        return self.NOT_IMPL_WARNING

    def analog_write(self, pin, value):
        """
        Writes an analog value to a pin.
        Arguments:
            pin: the pin to write (int)
            value: the duty cycle [0-255] (int)
        Returns:
            0 if correct, -1 if error
        """
        if self.board.is_analog(pin):
            if self.board.write_value(pin, value * 4):
                return self.OK
        return self.ERROR

    # Zero, Due & MKR Family
    def analog_read_resolution(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def analog_write_resolution(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    # Advanced I/O
    def no_tone(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def pulse_in(self, pin, value):
        """
        Reads a pulse (either HIGH or LOW) on a pin
        Arguments:
            pin: the pin to read
            value: the value (HIGH or LOW to read)
        Returns:
            The read value
        """
        return self.board.read_pulse(pin, value)

    def pulse_in_long(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def shift_in(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def shift_out(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def tone(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    # Time
    def delay(self, ms):
        """
        Pauses the program for the amount of time (in milliseconds) specified
        Arguments:
            ms: the number of milliseconds to pause
        """
        time.sleep(ms / 1000) # sleep works in seconds

    def delay_microseconds(self, us):
        """
        Pauses the program for the amount of time (in microseconds) specified
        Arguments:
            us: the number of microseconds to pause
        """
        time.sleep(us / 1000000) # sleep works in seconds

    def micros(self):
        """
        Returns the number of microseconds since the Arduino board 
        began running the current program
        """
        now = time.time()
        diff = now - self.start
        return int(diff * 1000000)

    def millis(self):
        """
        Returns the number of milliseconds since the Arduino board 
        began running the current program
        """
        now = time.time()
        diff = now - self.start
        return int(diff * 1000)

    # Math
    def abs(self, x):
        """
        Calculates the absolute value of a number
        Arguments:
            x: the mentioned number
        Returns:
            the absolute value
        """
        return abs(x)

    def constrain(self, x, a, b):
        """
        Constrains a number to be within a range
        Arguments:
            x: the number to constrain
            a: the lower end
            b: the upper end
        Returns:
            x if between a and b, a if x < a or b if x > b
        """
        if a < x < b:
            return x
        elif x < a:
            return a
        else:
            return b

    def map(self, value, from_low, from_high, to_low, to_high):
        """
        Re-maps a number from one range to another.
        That is, the upper bound gets mapped to the new upper bound,
        the lower bound gets mappedt to the new lower bound and so on
        Arguments:
            value: the number to map
            from_low: the lower bound of the value’s current range
            from_high: the upper bound of the value’s current range
            to_low: the lower bound of the value’s target range
            to_high: the upper bound of the value’s target range
        Returns:
            The value re-mapped
        """
        from_range = from_high - from_low
        to_range = to_high - to_low
        if from_range == 0:
            return to_low
        else:
            return (((value - from_low) * to_range) / from_range) + to_low

    def max(self, x, y):
        """
        Calculates the maximum between two numbers
        Arguments:
            x: the first number
            y: the second number
        Returns:
            The largest of the parameters
        """
        return x if x > y else y

    def min(self, x, y):
        """
        Calculates the minimum between two numbers
        Arguments:
            x: the first number
            y: the second number
        Returns:
            The lowest of the parameters
        """
        return x if x < y else y

    def pow(self, base, exponent):
        """
        Calculates the value of a number raised to a power. pow().
        Can be used to raise a number to a fractional power
        Arguments:
            base: the number
            exponent: the power to which the base is raised
        Returns:
            The result of the pow
        """
        return base ** exponent

    def sq(self, x):
        """
        Calculates the square of a number: the number multiplied by itself
        Arguments:
            x: the number to be squared
        Returns:
            The square of the number
        """
        return x * x

    def sqrt(self, x):
        """
        Calculates the square root of a number
        Arguments:
            x: the number
        Returns:
            The square root of the number
        """
        return sqrt(x)

    # Trigonometry
    def cos(self, rad):
        """
        Calculates the cosine of an angle (in radians)
        Arguments:
            rad: the angle in radians
        Returns:
            The cos of the angle [-1, 1]
        """
        return cos(rad)

    def sin(self, rad):
        """
        Calculates the sine of an angle (in radians)
        Arguments:
            rad: the angle in radians
        Returns:
            The sin of the angle [-1, 1]
        """
        return sin(rad)

    def tan(self, rad):
        """
        Calculates the tangent of an angle (in radians)
        Arguments:
            rad: the angle in radians
        Returns:
            The tan of the angle [-1, 1]
        """
        return tan(rad)

    # Characters
    def is_alpha(self, this_char: str):
        """
        Analyse if a char is alpha (that is a letter)
        Arguments:
            this_char: the char to analyse
        Returns:
            True if is a letter, False if else
        """
        return this_char.isalpha()

    def is_alpha_numeric(self, this_char: str):
        """
        Analyse if a char is alphanumeric (that is a letter 
        or a number)
        Arguments:
            this_char: the char to analyse
        Returns:
            True if alphanumeric, False if else
        """
        return this_char.isalnum()

    def is_ascii(self, this_char: str):
        """
        Analyses if a char is Ascii
        Arguments:
            this_char: the char to analyse
        Returns:
            True if Ascii, False if else
        """
        return this_char.isascii()

    def is_control(self, this_char: str):
        """
        Analyses if a char is a control character
        Arguments:
            this_char: the char to analyse
        Returns:
            True if control, False if else
        """
        return this_char.isprintable()

    def is_digit(self, this_char: str):
        """
        Analyses if a char is a digit (number)
        Arguments:
            this_char: the char to analyse
        Returns:
            True if digit, False if else
        """
        return this_char.isdigit()

    def is_graph(self, this_char: str):
        """
        Analyse if a char is printable with some content (space is
        printable but has no content)
        Arguments:
            this_char: the char to analyse
        Returns:
            True if printable with some content, False if else
        """
        if this_char == ' ' or this_char == '\t':
            return False
        return this_char.isprintable()

    def is_hexadecimal_digit(self, this_char: str):
        """
        Analyse if a char is an hexadecimal digit (A-F, 0-9)
        Arguments:
            this_char: the char to analyse
        Returns:
            True if hexadecimal, False if else
        """
        return (
            '0' <= this_char <= '9' or
            'a' <= this_char <= 'f' or
            'A' <= this_char <= 'F'
        )

    def is_lower_case(self, this_char: str):
        """
        Analyse if a char is in lower case
        Arguments
            this_char: the char to analyse
        Returns:
            True if lower case, False if else
        """
        return this_char.islower()

    def is_printable(self, this_char: str):
        """
        Analyse if a char is printable
        Arguments:
            this_char: the char to analyse
        Returns:
            True if is printable, False if else
        """
        return this_char.isprintable()

    def is_punct(self, this_char: str):
        """
        Analyse if a char is punctuation
        Arguments:
            this_char: the char to analyse
        Returns:
            True if is punctuation, False if else
        """
        return this_char in string.punctuation

    def is_space(self, this_char: str):
        """
        Analyse if a char is a white space character, including
        form feed, newling, carriage return, horizontal tab or vertical
        tab
        Arguments:
            this_char: the char to analyse
        Returns:
            True if white space, False if else
        """
        return (
            this_char == '\f' or
            this_char == '\n' or
            this_char == '\r' or
            this_char == '\t' or
            this_char == '\v' or
            this_char == ' '
        )

    def is_upper_case(self, this_char: str):
        """
        Analyse if a char is upper case
        Arguments:
            this_char: the char to analyse
        Returns:
            True if upper case, False if else
        """
        return this_char.isupper()

    def is_whitespace(self, this_char: str):
        """
        Analyse if a char is a white space character
        Arguments:
            this_char: the char to analyse
        Returns:
            True if white space, False if else
        """
        return this_char.isspace()

    # Random Numbers
    def random(self, max, min=0):
        """
        Generates a random number
        Arguments:
            max: the max of the number (exclusive)
            min: the min of the number (inclusive, optional, default 0)
        Returns:
            The random number
        """
        return random.randint(min, max - 1)

    def random_seed(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    # Bits and Bytes
    def bit(self, n):
        """
        Computes the value of the specified bit
        Arguments:
            n: the bit to compute
        Returns:
            The value of the bit
        """
        return 1 << n

    def bit_clear(self, x, n):
        """
        Clears a bit of a numeric value
        Arguments:
            x: the numeric variable whose bit to clear
            n: which bit to clear (starting from right)
        Returns:
            The value after the position n is cleared
        """
        return x & ~(1 << n)

    def bit_read(self, x, n):
        """
        Reads a bit of a number
        Arguments:
            x: the number
            n: the bit to read (starting from right)
        Returns:
            The value of the bit (1 or 0)
        """
        return x & (1 << n)

    def bit_set(self, x, n):
        """
        Writes to 1 a bit of a number
        Arguments:
            x: the number
            n: the bit to set
        Returns:
            The number with the bit set
        """
        mask = 1 << n
        return (x & ~mask) | (1 << n)

    def bit_write(self, x, n, b):
        """
        Writes a bit into the position specified
        Arguments:
            x: the number
            n: the bit position (starting right)
            b: the bit to write (0 or 1)
        Returns:
            The number with changed bit
        """
        mask = 1 << n
        return (x & ~mask) | ((b << n) & mask)

    def high_byte(self, x):
        """
        Extracts the leftmost byte
        Arguments:
            x: the value
        Returns:
            The leftmost byte
        """
        return x & 0xff

    def low_byte(self, x):
        """
        Extracts the rightmost byte
        Arguments:
            x: the value
        Returns:
            The rightmost byte
        """
        return (x & 0xff00) >> 8

    # External Interrupts
    def attach_interrupt(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def detach_interrupt(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    # Interrupts
    def interrupts(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def no_interrupts(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING