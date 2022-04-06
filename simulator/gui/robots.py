from argparse import ArgumentError
import tkinter as tk
from turtle import width
from PIL import ImageTk, Image


class DrawingTool:

    def __init__(self, robot_type: str):
        self.drawing = Drawing()
        self.choose_robot(robot_type)
        self.__zoom_percentage()
        self.calculate_size()
        self.drawing.set_size(self.width, self.height)
        if isinstance(self.robot, MobileRobot):
            self.circuit = Circuit(self.drawing)

    def calculate_size(self):
        self.width = self.robot.drawing_width * self.drawing.scale
        self.height = self.robot.drawing_height * self.drawing.scale

    def execute(self):
        self.stop_execute()
        self.calculate_size()
        self.change_canvas_dimensions()
        if isinstance(self.robot, MobileRobot):
            self.circuit.create_circuit()
        self.robot.draw()

    def stop_execute(self):
        self.drawing.empty_drawing()

    def zoom_in(self):
        self.drawing.zoom_in()
        self.__zoom_percentage()
        self.calculate_size()
        self.execute()

    def zoom_out(self):
        self.drawing.zoom_out()
        self.__zoom_percentage()
        self.calculate_size()
        self.execute()

    def __zoom_percentage(self):
        self.zoom_percent = self.drawing.zoom_percentage()

    def set_canvas(self, canvas: tk.Canvas):
        self.drawing.set_canvas(canvas)

    def choose_robot(self, robot_type: str):
        if robot_type == "Robot móvil":
            self.robot = MobileRobot(self.drawing)
        elif robot_type == "Actuador lineal":
            self.robot = LinearActuator(self.drawing)
        else:
            raise ArgumentError(message="No existe ese robot")

    def change_canvas_dimensions(self):
        self.drawing.canvas.configure(scrollregion=(0, 0, self.width, self.height))


class Drawing:

    def __init__(self):
        self.images = {}
        self.canvas_images = []
        self.scale = 0.5
        self.set_size(0, 0)

    def set_canvas(self, canvas: tk.Canvas):
        self.canvas = canvas

    def empty_drawing(self):
        self.canvas.delete('all')
        self.images = []
        self.canvas_images = []

    def draw_image(self, element):
        self.__add_to_canvas(element["x"], element["y"], element["image"])

    def move_image(self, dx, dy):
        pass

    def draw_figure(self, form: dict):
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale)
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        self.canvas.create_rectangle(x, y, x + width, y + height, fill="black")


    def zoom_in(self):
        if self.scale < 1:
            self.scale += 0.1
        self.scale = round(self.scale, 1)

    def zoom_out(self):
        if self.scale > 0.1:
            self.scale -= 0.1
        self.scale = round(self.scale, 1)

    def zoom_percentage(self):
        return self.scale * 100

    def set_size(self, width, height):
        self.width = width
        self.height = height

    def __add_to_canvas(self, x, y, image: Image):
        width = int(image.width * self.scale)
        height = int(image.height * self.scale)
        res_img = image.resize((width, height), Image.ANTIALIAS)
        self.canvas_images.append(ImageTk.PhotoImage(res_img))
        self.canvas.create_image(x * self.scale, y * self.scale, image=self.canvas_images[-1])


class Robot:

    def __init__(self, drawing: Drawing):
        self.x = 0
        self.y = 0
        self.drawing = drawing

    def move(self, vx, vy, angle):
        pass

    def draw(self):
        pass

    def reboot(self):
        self.drawing.empty_drawing()


class LinearActuator(Robot):

    def __init__(self, drawing: Drawing):
        super().__init__(drawing)
        self.img_act = Image.open("simulator/gui/assets/actuator.png")
        self.drawing_width = 2500
        self.drawing_height = 400

    def move(self, vx, vy, angle):
        return super().move(vx, vy, angle)

    def draw(self):
        self.x = int(self.drawing_width / 2)
        self.y = int(self.drawing_height / 2)
        self.image = {
            "x": self.x,
            "y": self.y,
            "image": self.img_act
        }
        self.but_left = self.ActuatorButton(
            "simulator/gui/assets/button-hit.png", 
            "simulator/gui/assets/button-no-hit.png",
            self.x - 960, self.y + 70, True
        )
        self.but_right = self.ActuatorButton(
            "simulator/gui/assets/button-hit.png", 
            "simulator/gui/assets/button-no-hit.png",
            self.x + 880, self.y - 185, False
        )
        self.block = self.Block(
            "simulator/gui/assets/mobile-part.png",
            self.x, self.y - 50
        )
        self.drawing.draw_image(self.image)
        self.drawing.draw_image(self.but_left.get_image())
        self.drawing.draw_image(self.but_right.get_image())
        self.drawing.draw_image(self.block.get_image())


    class ActuatorElement:

        def __init__(self):
            self.x = 0
            self.y = 0
            self.img_shown = None

        def get_image(self):
            return {
                "x": self.x,
                "y": self.y,
                "image": self.img_shown
            }


    class Block(ActuatorElement):

        def __init__(self, img_path, x, y):
            self.img_shown = Image.open(img_path)
            self.x = x
            self.y = y


    class ActuatorButton(ActuatorElement):

        def __init__(self, img_path_hit, img_path_no_hit, x, y, rotate):
            self.img_hit = Image.open(img_path_hit)
            self.img_no_hit = Image.open(img_path_no_hit)
            self.rotate(rotate)
            self.img_shown = self.img_no_hit
            self.x = x
            self.y = y
            self.pressed = False

        def press(self):
            self.pressed = True
            self.img_shown = self.img_hit

        def stop_press(self):
            self.pressed = False
            self.img_shown = self.img_no_hit

        def rotate(self, rotate):
            if rotate:
                self.img_hit = self.img_hit.rotate(180)
                self.img_no_hit = self.img_no_hit.rotate(180)


class MobileRobot(Robot):

    def __init__(self, drawing: Drawing):
        super().__init__(drawing)
        self.img_mobrob = Image.open("simulator/gui/assets/mobile-robot.png")
        self.drawing_width = 10000
        self.drawing_height = 7500

    def move(self, vx, vy, angle):
        return super().move(vx, vy, angle)

    def draw(self):
        self.x = 500
        self.y = 500
        self.image = {
            "x": self.x,
            "y": self.y,
            "image": self.img_mobrob
        }
        self.arrow_left = self.DirectionArrow(
            "simulator/gui/assets/slow-speed.png",
            "simulator/gui/assets/mid-speed.png",
            "simulator/gui/assets/full-speed.png",
            self.x - (self.img_mobrob.width / 2 + 50),
            self.y
        )
        self.arrow_right = self.DirectionArrow(
            "simulator/gui/assets/slow-speed.png",
            "simulator/gui/assets/mid-speed.png",
            "simulator/gui/assets/full-speed.png",
            self.x + (self.img_mobrob.width / 2 + 50), 
            self.y
        )
        self.sound_left = self.UltrasoundSensor(
            "simulator/gui/assets/sound-hit.png",
            "simulator/gui/assets/sound-no-hit.png",
            self.x - 30,
            self.y - 320
        )
        self.sound_right = self.UltrasoundSensor(
            "simulator/gui/assets/sound-hit.png",
            "simulator/gui/assets/sound-no-hit.png",
            self.x + 30,
            self.y - 320
        )
        self.light_left = self.LightSensor(
            "simulator/gui/assets/light-bright.png",
            "simulator/gui/assets/light-dark.png",
            self.x - 40,
            self.y - 100
        )
        self.light_right = self.LightSensor(
            "simulator/gui/assets/light-bright.png",
            "simulator/gui/assets/light-dark.png",
            self.x + 40,
            self.y - 100
        )
        self.arrow_right.rotate()
        self.drawing.draw_image(self.image)
        self.drawing.draw_image(self.arrow_left.get_image())
        self.drawing.draw_image(self.arrow_right.get_image())
        self.drawing.draw_image(self.sound_left.get_image())
        self.drawing.draw_image(self.sound_right.get_image())
        self.drawing.draw_image(self.light_left.get_image())
        self.drawing.draw_image(self.light_right.get_image())


    class MobileElement:

        def __init__(self):
            self.x = 0
            self.y = 0
            self.img_path = None

        def get_image(self):
            return {
                "x": self.x,
                "y": self.y,
                "image": self.img_path
            }


    class LightSensor(MobileElement):

        def __init__(self, img_light_bright, img_light_dark , x, y):
            super().__init__()
            self.img_light_bright = Image.open(img_light_bright)
            self.img_light_dark = Image.open(img_light_dark)
            self.img_path = self.img_light_bright
            self.x = x
            self.y = y


    class UltrasoundSensor(MobileElement):

        def __init__(self, img_sound_hit, img_sound_no_hit, x, y):
            super().__init__()
            self.img_sound_hit = Image.open(img_sound_hit)
            self.img_sound_no_hit = Image.open(img_sound_no_hit)
            self.img_path = self.img_sound_no_hit
            self.x = x
            self.y = y


    class DirectionArrow(MobileElement):

        def __init__(self, img_slow, img_mid, img_fast, x, y):
            super().__init__()
            self.img_slow = Image.open(img_slow)
            self.img_mid = Image.open(img_mid)
            self.img_fast = Image.open(img_fast)
            self.img_path = self.img_slow
            self.x = x
            self.y = y

        def rotate(self):
            self.img_path = self.img_path.rotate(180)


class Circuit:

    def __init__(self, drawing: Drawing):
        self.circuit_parts = []
        self.drawing = drawing
        self.ROAD_WIDTH = 600

    def create_circuit(self):
        x = 100
        y = 100
        straight_lengths = {
            1: {"x": 9000}, #recta ppal
            2: {"y": 1000}, #chicane 1
            3: {"x": -750},
            4: {"y": 1500}, #recta 1
            5: {"x": 750}, #chicane 2
            6: {"y": 1000},
            7: {"x": -4000}, #recta 2
            8: {"y": 1000}, #horquilla 1
            9: {"x": 4000}, #recta 3
            10: {"y": 1000}, #horquilla 2
            11: {"x": -5250}, #recta 4
            12: {"y": -1000}, #chicane 3
            13: {"x": -1750},
            14: {"y": -2000}, #recta 5
            15: {"x": 1000},
            16: {"y": -1000}, #horquilla 3
            17: {"x": -2000},
            18: {"y": 2000},
            19: {"x": -1000}, #horquilla 4
            20: {"y": -3500}, #ultima curva
        }
        for key in straight_lengths:
            if "x" in straight_lengths[key]:
                self.__create_piece(x, y, straight_lengths[key]["x"], self.ROAD_WIDTH)
                x += straight_lengths[key]["x"]
            elif "y" in straight_lengths[key]:
                self.__create_piece(x, y, self.ROAD_WIDTH, straight_lengths[key]["y"])
                y += straight_lengths[key]["y"]
        for part in self.circuit_parts:
            self.drawing.draw_figure(
                {
                    "x": part.x,
                    "y": part.y,
                    "width": part.width,
                    "height": part.height
                }
            )

    def __create_piece(self, x, y, width, height):
        if width < 0:
            x += self.ROAD_WIDTH
            x += width
            width *= -1
        if height < 0:
            y += self.ROAD_WIDTH
            y += height
            height *= -1
        self.circuit_parts.append(
            self.CircuitPart(x, y, width, height)
        )

    def is_overlapping(self, x, y):
        for part in self.circuit_parts:
            if (x >= part.x and x <= part.width) and (y >= part.y and y <= part.height):
                return True
        return False

    class CircuitPart:

        def __init__(self, x, y, width, height):
            self.x = x
            self.y = y
            self.width = width
            self.height = height