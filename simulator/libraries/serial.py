import simulator.console.console as console


class Serial:
    """
    Used for communication. Simulates the communication between
    the board and the computer (with the possibility of expansion
    into other devices not implemented)
    """

    OK = 0
    ERROR = -1
    NOT_IMPL_WARNING = -2

    def __init__(self, console: console.Console):
        """
        Constructor for Serial
        Arguments:
            console: the console to write into
        """
        self.console = console

    def get_name():
        return "Serial"

    def get_methods(self):
        """
        Returns the methods of the library as a dict, whose
        key is the naming in Arduino and whose value is the
        corresponding method.
        Returns:
            A dict with the methods
        """
        methods = {}
        methods["if(Serial)"] = ("bool", self.if_serial, []) #Not implemented
        methods["available"] = ("int", self.available, [])
        methods["availableForWrite"] = ("int", self.available_for_write, []) #Not implemented
        methods["begin"] = ("void", self.begin, ["long"])
        methods["end"] = ("void", self.end, []) #Not implemented
        methods["find"] = ("bool", self.find, []) #Not implemented
        methods["findUntil"] = ("bool", self.find_until, []) #Not implemented
        methods["flush"] = ("void", self.flush, []) #Not implemented
        methods["parseFloat"] = ("float", self.parse_float, []) #Not implemented
        methods["parseInt"] = ("long", self.parse_int, []) #Not implemented
        methods["peek"] = ("int", self.peek, []) #Not implemented
        methods["print"] = ("size_t", self.print, [])
        methods["println"] = ("size_t", self.println, [])
        methods["read"] = ("int", self.read, [])
        methods["readBytes"] = ("size_t", self.read_bytes, []) #Not implemented
        methods["readBytesUntil"] = ("size_t", self.read_bytes_until, []) #Not implemented
        methods["readString"] = ("string", self.read_string, []) #Not implemented
        methods["readStringUntil"] = ("string", self.read_string_until, []) #Not implemented
        methods["setTimeout"] = ("void", self.set_timeout, []) #Not implemented
        methods["write"] = ("size_t", self.write, []) #Not implemented
        methods["serialEvent"] = ("void", self.serial_event, []) #Not implemented
        return methods

    def if_serial(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def available(self):
        """
        Get the number of bytes (characters) available for reading from 
        the serial port
        Returns:
            The number of bytes available to read
        """
        return self.console.get_read_bytes()

    def available_for_write(self):
        """
        Not needed (not implemented)
        """
        return self.NOT_IMPL_WARNING

    def begin(self, speed):
        """
        Sets the data rate in bauds for serial data transmission.
        Config is not used because simulating its behaviour is very
        complex for our situation.
        Arguments:
            speed: the bauds (use: 50, 75, 110, 134, 150, 200, 300,
            600, 1200, 1800, 2400, 9600, 19200, 38400, 57600, 115200,
            230400, 460800, 500000, 576000, 921600, 1000000, 1152000,
            1500000, 2000000, 2500000, 3000000, 3500000, 4000000)
        """
        bauds = [50, 75, 110, 134, 150, 200, 300,
                 600, 1200, 1800, 2400, 9600, 19200, 38400, 57600, 115200,
                 230400, 460800, 500000, 576000, 921600, 1000000, 1152000,
                 1500000, 2000000, 2500000, 3000000, 3500000, 4000000]
        if speed not in bauds:
            return self.ERROR
        else:
            self.console.begin(speed)
        return self.OK

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
        Reads incoming serial data
        Returns:
            The first byte of incoming serial data or -1 if
            none available
        """
        return self.console.read()

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