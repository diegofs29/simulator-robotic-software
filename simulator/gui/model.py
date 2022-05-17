import simulator.gui.gui as gui
import simulator.gui.layers as layers
import simulator.console.console as console


class RobotsModel:

    def __init__(self, view):
        self.view = view
        self.console: console.Console = None
        self.robot_layer: layers.Layer = None

    def execute(self):
        self.view.abort_after()
        self.robot_layer.execute()
        self.view.identifier = self.view.after(10, self.app_loop)

    def stop(self):
        self.robot_layer.stop()
        self.view.abort_after()

    def zoom_in(self):
        self.robot_layer.zoom_in()
        self.view.change_zoom_label(self.robot_layer.drawing.zoom_percentage())

    def zoom_out(self):
        self.robot_layer.zoom_out()
        self.view.change_zoom_label(self.robot_layer.drawing.zoom_percentage())

    def app_loop(self):
        self.robot_layer.move(self.view.keys_used, self.view.move_WASD)
        self.view.identifier = self.view.after(10, self.app_loop)

    def configure_layer(self, drawing_canvas, hud_canvas):
        self.robot_layer.set_canvas(drawing_canvas, hud_canvas)
        self.view.change_zoom_label(self.robot_layer.drawing.zoom_percentage())

    def configure_console(self, text_component):
        self.console = console.Console(text_component)

    def change_robot(self, option):
        if self.robot_layer != None:
            self.stop()
        if option == 0:
            self.view.show_circuit_selector(True)
            self.view.show_joystick(False)
            self.robot_layer = layers.MoblileRobotLayer(2)
        elif option == 1:
            self.view.show_circuit_selector(True)
            self.view.show_joystick(False)
            self.robot_layer = layers.MoblileRobotLayer(4)
        elif option == 2:
            self.view.show_circuit_selector(False)
            self.view.show_joystick(True)
            self.robot_layer = layers.LinearActuatorLayer()

    def change_circuit(self, option):
        if self.robot_layer != None:
            self.stop()
        if isinstance(self.robot_layer, layers.MoblileRobotLayer):
            self.robot_layer.set_circuit(option)

    def send_input(self, text):
        self.console.input(text)

    def update_joystick(self, elem, value):
        if elem == "dx":
            self.robot_layer.robot.joystick.dx = value
        elif elem == "dy":
            self.robot_layer.robot.joystick.dy = value
        elif elem == "button":
            self.robot_layer.robot.joystick.value = value

    def filter_console(self, options):
        messages = []
        if options['info']:
            messages.append('info')
        if options['warning']:
            messages.append('warning')
        if options['error']:
            messages.append('error')
        self.console.filter_messages(messages)

    def get_pin_data(self):
        return self.robot_layer.robot.get_data()

    def save_pin_data(self, pin_data):
        robot = self.robot_layer.robot
        if 'servo_left' in pin_data:
            robot.set_servo_left(pin_data['servo_left'])
        if 'servo_right' in pin_data:
            robot.set_servo_right(pin_data['servo_right'])
        if 'light_mleft' in pin_data:
            robot.set_light_mleft(pin_data['light_mleft'])
        if 'light_left' in pin_data:
            robot.set_light_left(pin_data['light_left'])
        if 'light_right' in pin_data:
            robot.set_light_right(pin_data['light_right'])
        if 'light_mright' in pin_data:
            robot.set_light_mright(pin_data['light_mright'])
        if 'sound_trig' in pin_data:
            robot.set_sound_trig(pin_data['sound_trig'])
        if 'sound_echo' in pin_data:
            robot.set_sound_echo(pin_data['sound_echo'])
        if 'button_left' in pin_data:
            robot.set_button_left(pin_data['button_left'])
        if 'button_right' in pin_data:
            robot.set_button_right(pin_data['button_right'])
        if 'servo' in pin_data:
            robot.set_servo(pin_data['servo'])
        if 'button_joystick' in pin_data:
            robot.set_joystick_button(pin_data['button_joystick'])
        if 'joystick_x' in pin_data:
            robot.set_joystick_x(pin_data['joystick_x'])
        if 'joystick_y' in pin_data:
            robot.set_joystick_y(pin_data['joystick_y'])