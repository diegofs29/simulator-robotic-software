"""
This module includes all needed Arduino libraries for
the programming of a Linear Actuator and a Mobile Robot.
Those libraries are:
    - The standard ones of Arduino
    - Servo
"""


class Servo:
    """
    Servo class, represents the movement of a real servo
    """

    def __init__(self):
        self.pin = -1
        self.min=544
        self.max=2400
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

    def __init__(self):
        pass

    # Digital I/O
    def digital_read(self):
        pass

    def digital_write(self):
        pass

    def pin_mode(self):
        pass

    # Analog I/O
    def analog_read(self):
        pass

    def analog_reference(self):
        pass

    def analog_write(self):
        pass

    # Zero, Due & MKR Family
    def analog_read_resolution(self):
        pass

    def analog_write_resolution(self):
        pass

    # Advanced I/O
    def no_tone(self):
        pass

    def pulse_in(self):
        pass

    def pulse_in_long(self):
        pass

    def shift_in(self):
        pass

    def shift_out(self):
        pass

    def tone(self):
        pass

    # Time
    def delay(self):
        pass

    def delay_microseconds(self):
        pass

    def micros(self):
        pass

    def millis(self):
        pass

    # Math
    def abs(self):
        pass

    def constrain(self):
        pass

    def map(self):
        pass

    def max(self):
        pass

    def min(self):
        pass

    def pow(self):
        pass

    def sq(self):
        pass

    def sqrt(self):
        pass

    # Trigonometry
    def cos(self):
        pass

    def sin(self):
        pass

    def tan(self):
        pass

    # Characters
    def is_alpha(self):
        pass

    def is_alpha_numeric(self):
        pass

    def is_ascii(self):
        pass

    def is_control(self):
        pass

    def is_digit(self):
        pass

    def is_graph(self):
        pass

    def is_hexadecimal_digit(self):
        pass

    def is_lower_case(self):
        pass

    def is_printable(self):
        pass

    def is_punct(self):
        pass

    def is_space(self):
        pass

    def is_upper_case(self):
        pass

    def is_whitespace(self):
        pass

    # Random Numbers
    def random(self):
        pass

    def random_seed(self):
        pass

    # Bits and Bytes
    def bit(self):
        pass

    def bit_clear(self):
        pass

    def bit_read(self):
        pass

    def bit_set(self):
        pass

    def bit_write(self):
        pass

    def high_byte(self):
        pass

    def low_byte(self):
        pass

    # External Interrupts
    def attach_interrupt(self):
        pass

    def detach_interrupt(self):
        pass

    # Interrupts
    def interrupts(self):
        pass

    def no_interrupts(self):
        pass


class Serial:
    """
    Used for communication. Simulates the communication between
    the board and the computer (with the possibility of expansion
    into other devices not implemented)
    """

    def __init__(self):
        pass

    def if_serial(self):
        pass

    def available(self):
        pass

    def available_for_write(self):
        pass

    def begin(self):
        pass

    def end(self):
        pass

    def find(self):
        pass

    def find_until(self):
        pass

    def flush(self):
        pass

    def parse_float(self):
        pass

    def parse_int(self):
        pass

    def peek(self):
        pass

    def print(self):
        pass

    def println(self):
        pass

    def read(self):
        pass

    def read_bytes(self):
        pass

    def read_bytes_until(self):
        pass

    def read_string(self):
        pass

    def read_string_until(self):
        pass

    def set_timeout(self):
        pass

    def write(self):
        pass

    def serial_event(self):
        pass
