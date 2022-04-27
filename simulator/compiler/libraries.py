"""
This module includes all needed Arduino libraries for
the programming of a Linear Actuator and a Mobile Robot.
Those libraries are:
    - The standard ones of Arduino
    - Servo
"""

from math import cos, sin, sqrt, tan
import string
import time
import random
from ..gui.console import Console


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

    def attach(self, pin, min=544, max=2400):
        """
        Attaches the servo to a pin
        Arguments:
            pin: the number of the pin to be attached to
            min: pulse width corresponging with the minimun angle on
            the servo (default = 544)
            max: pulse width corresponging with the max angel on the 
            the servo (default = 2400)
        """
        self.pin = pin
        self.min = min
        self.max = max

    def write(self, angle):
        """
        Writes speed to servo.
        Our Servos, being rotation ones, will have their speed set by this
        method. If the angle is 0, the speed is full in one direction, if
        it is 180, is full speed in the oposite direction; with 90 being no
        movement done by the servo
        Arguments:
            angle: the value to write [0-180]
        """
        self.speed = angle

    def write_microseconds(self, us):
        """
        Writes speed to servo in microseconds.
        This method will work exactly the same way as write does (because our
        servos are rotation ones)
        Arguments:
            us: the value of the parameter in microseconds (int)
        """
        self.write(us)

    def read(self):
        """
        Reads the angle of the servo (being the last value passed to write)
        Returns:
            The angle of the servo from 0 to 180 degrees
        """
        return self.speed

    def attached(self):
        """
        Checks wether the Servo variable is attached or not
        Returns:
            True if attached to pin, False if else
        """
        return self.pin != -1

    def detach(self):
        """
        Detach the Servo variable from its pin
        """
        self.pin = -1


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

    def __init__(self):
        """
        Constructor for Standard class
        """
        self.start = time.time()
        self.pins = {}

    # Digital I/O
    def digital_read(self, pin):
        """
        Reads the value from a specified digital pin
        Arguments:
            pin: the pin to read
        Returns:
            HIGH if reads 1, LOW if reads 0
        """
        if pin in self.pins:
            return self.pins[pin]
        return random.randint(self.LOW, self.HIGH)

    def digital_write(self, pin, value):
        """
        Writes a HIGH or a LOW value to a digital pin
        Arguments:
            pin: the pin which will be written
            value: the value to write (HIGH or LOW)
        Returns:
            -1 if error, 0 if else
        """
        if value == self.HIGH or value == self.LOW:
            self.pins[pin]["value"] = value
        else:
            return self.ERROR
        return self.OK

    def pin_mode(self, pin, mode):
        """
        Configures the pin to behave as INPUT, OUTPUT or INPUT_PULLUP
        Arguments:
            pin: the pin whose mode will be configured
            mode: the mode to use
        Returns:
            -1 if error, 0 if else
        """
        if mode == self.INPUT or mode == self.OUTPUT or mode == self.INPUT_PULLUP:
            self.pins[pin]["mode"] = mode
        else:
            return self.ERROR
        return self.OK

    # Analog I/O
    def analog_read(self, pin):
        """
        Reads the value from the specified analog pin.
        Its value can be in the range [0-1023]
        Arguments:
            pin: the pin to read
        """
        if pin in self.pins:
            return self.pins[pin]
        return random.randint(0, 1023)

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
        """
        if isinstance(pin, int) and isinstance(value, int):
            self.pins[pin]["value"] = value * 4
        else:
            return self.ERROR
        return self.OK

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

    def pulse_in(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

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


class Serial:
    """
    Used for communication. Simulates the communication between
    the board and the computer (with the possibility of expansion
    into other devices not implemented)
    """

    OK = 0
    ERROR = -1
    NOT_IMPL_WARNING = -2

    def __init__(self, console: Console):
        """
        Constructor for Serial
        Arguments:
            console: the console to write into
        """
        self.console = console

    def if_serial(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def available(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def available_for_write(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def begin(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def end(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def find(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def find_until(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def flush(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def parse_float(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def parse_int(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def peek(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def print(self, val):
        """
        Prints a value to the console
        Arguments:
            val: the value
        """
        self.console.write_output(val)

    def println(self, val):
        """
        Prints a value to the console and finishes the line
        Arguments:
            val: the value
        """
        self.console.write_output(val + '\n')

    def read(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def read_bytes(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def read_bytes_until(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def read_string(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def read_string_until(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def set_timeout(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def write(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def serial_event(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING
