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
        pass

    def attach(self):
        pass

    def write(self):
        pass

    def write_microseconds(self):
        pass

    def read(self):
        pass

    def attached(self):
        pass

    def detach(self):
        pass


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
