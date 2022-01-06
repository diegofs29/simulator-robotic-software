import unittest
from simulator.compiler.ArduinoListenerImpl import ArduinoListenerImpl

class TestBase(unittest.TestCase):

    def setUp(self):
        a = ArduinoListenerImpl()
        a.print_exit()