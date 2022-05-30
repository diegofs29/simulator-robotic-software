"""
This module includes all needed Arduino libraries for
the programming of a Linear Actuator and a Mobile Robot.
Those libraries are:
    - The standard ones of Arduino
    - Serial
    - Servo
"""
import simulator.libraries.standard as std
import libraries.serial as serial
import libraries.servo as servo
import libraries.string as string


class LibraryManager:
    
    OK = 0
    ERROR = -1
    NOT_IMPL_WARNING = -2

    def __init__(self):
        """
        Constructor for library manager
        """
        self.library_methods = {
            std.get_name(): std.get_methods(),
            serial.get_name(): serial.get_methods(),
            string.get_name(): string.get_methods()
        }
        self.libraries = {
            std.get_name(): std,
            serial.get_name(): serial,
            string.get_name(): string.get_methods(),
            servo.get_name(): servo.get_methods()
        }
    
    def get_libraries(self):
        """
        Returns a list with the name of the libraries
        """
        list_libs = []
        for key in self.libraries:
            list_libs.append(key)
        return list_libs

    def find(self, library, method):
        """
        Finds a method within a library
        Arguments:
            library: the library in which to search
            method: the method to search
        Returns:
            The method if it exists or None if else
        """
        if library in self.library_methods:
            if method in self.library_methods[library]:
                return self.library_methods[library][method]
        return None

    def add_library(self, library):
        """
        Adds a library to the library_methods dict, so its methods
        can be found
        Arguments:
            library: the library to add
        """
        lib: str = library[0:-2]
        if lib in self.libraries:
            self.library_methods[lib] = self.libraries[lib]
        else:
            return self.ERROR
        return self.OK