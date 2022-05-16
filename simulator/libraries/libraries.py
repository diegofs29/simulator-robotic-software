"""
This module includes all needed Arduino libraries for
the programming of a Linear Actuator and a Mobile Robot.
Those libraries are:
    - The standard ones of Arduino
    - Serial
    - Servo
"""
import simulator.console.console as console
import simulator.robots.robots as robots


class LibraryManager:
    
    OK = 0
    ERROR = -1
    NOT_IMPL_WARNING = -2

    def __init__(self, *libs):
        """
        Constructor for library manager
        """
        self.library_methods = {
            libs[0].get_name(): libs[0].get_methods(),
            libs[1].get_name(): libs[1].get_methods()
        }
        self.libraries = {
            libs[0].get_name(): libs[0],
            libs[1].get_name(): libs[1],
            libs[2].get_name(): libs[2]
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
            self.library_methods[lib] = self.libraries[lib].get_methods()
        else:
            return self.ERROR
        return self.OK