from argparse import ArgumentError
import tkinter as tk
from PIL import ImageTk, Image


class DrawingTool:

    def __init__(self, robot_type: str):
        self.drawing = Drawing()
        self.__zoom_percentage()
        self.is_drawing = False

    def execute(self):
        self.__drawing_config()
        self.robot.draw()
        self.is_drawing = True

    def stop_execute(self):
        self.drawing.empty_drawing()
        self.is_drawing = False

    def zoom_in(self):
        self.drawing.zoom_in()
        self.__zoom_config()

    def zoom_out(self):
        self.drawing.zoom_out()
        self.__zoom_config()

    def set_canvas(self, canvas: tk.Canvas):
        self.drawing.set_canvas(canvas)

    def choose_robot(self, robot_type: str):
        if robot_type == "Robot móvil":
            self.robot = MobileRobot(self.drawing)
            if isinstance(self.robot, MobileRobot):
                self.circuit = Circuit(self.drawing)
        elif robot_type == "Actuador lineal":
            self.robot = LinearActuator(self.drawing)
        else:
            raise ArgumentError(message="No existe ese robot")
        self.drawing.set_size(self.robot.drawing_width, self.robot.drawing_height)

    def move(self, movement):
        self.robot.move(movement)
        self.__check_overlap()

    def __check_overlap(self):
        x = self.robot.light_l["x"]
        y = self.robot.light_l["y"]
        print(self.circuit.is_overlapping(x, y))

    def __zoom_config(self):
        self.__zoom_percentage()
        if self.is_drawing:
            self.__zoom_redraw()
    
    def __zoom_percentage(self):
        self.zoom_percent = self.drawing.zoom_percentage()

    def __zoom_redraw(self):
        self.drawing.delete_zoomables()
        self.__create_circuit()
        self.robot.draw_robot()

    def __drawing_config(self):
        self.drawing.empty_drawing()
        self.__create_circuit()

    def __create_circuit(self):
        if isinstance(self.robot, MobileRobot):
            self.circuit.create_circuit()


class HUD:

    def __init__(self):
        self.canvas = None

    def set_canvas(self, canvas):
        self.canvas = canvas


class Drawing:

    def __init__(self):
        self.canvas = None
        self.images = {}
        self.canvas_images = []
        self.scale = 1
        self.hud_w = 0
        self.hud_h = 0

    def set_canvas(self, canvas: tk.Canvas):
        self.canvas = canvas

    def empty_drawing(self):
        self.canvas.delete('all')
        self.images = []
        self.canvas_images = []

    def delete_zoomables(self):
        self.canvas.delete('actuator', 'button_left', 'button_right', 'block')
        self.canvas.delete('robot', 'circuit')

    def draw_image(self, element, group):
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def redraw_image(self, element, group):
        self.canvas.delete(group)
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def move_image(self, group, dx, dy):
        vx = int(dx * self.scale)
        vy = int(dy * self.scale)
        self.canvas.move(group, vx, vy)

    def draw_circuit(self, form: dict):
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale) + self.hud_h
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        self.canvas.create_rectangle(x, y, x + width, y + height, fill="black", tags="circuit")

    def draw_bg(self, form: dict, group):
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale)
        self.hud_w = int(self.width * self.scale)
        self.hud_h = form["height"]
        color = form["color"]
        self.canvas.create_rectangle(x, y, self.hud_w, self.hud_h, fill=color, tags=group)

    def zoom_in(self):
        if self.scale < 1:
            self.scale += 0.1
        self.scale = round(self.scale, 1)
        self.__update_size()

    def zoom_out(self):
        if self.scale > 0.1:
            self.scale -= 0.1
        self.scale = round(self.scale, 1)
        self.__update_size()

    def zoom_percentage(self):
        return self.scale * 100

    def set_size(self, width, height):
        self.width = width
        self.height = height
        self.__update_size()
    
    def __update_size(self):
        w = self.width * self.scale
        h = self.height * self.scale
        self.canvas.configure(scrollregion=(0, 0, w, h))

    def __add_to_canvas(self, x, y, image: Image, group):
        width = int(image.width * self.scale)
        height = int(image.height * self.scale)
        res_img = image.resize((width, height), Image.ANTIALIAS)
        self.canvas_images.append(ImageTk.PhotoImage(res_img))
        scale_x = x * self.scale
        scale_y = y * self.scale + self.hud_h
        self.canvas.create_image(scale_x, scale_y, image=self.canvas_images[-1], tags=group)


class Robot:

    def __init__(self, drawing: Drawing):
        self.x = 0
        self.y = 0
        self.drawing = drawing

    def move(self, vx, vy):
        pass

    def draw(self):
        self.create_robot()
        self.draw_robot()

    def create_robot(self):
        pass

    def draw_robot(self):
        pass

    def reboot(self):
        self.drawing.empty_drawing()


class LinearActuator(Robot):

    def __init__(self, drawing: Drawing):
        super().__init__(drawing)
        self.img_act = Image.open("simulator/gui/assets/actuator.png")
        self.drawing_width = 2500
        self.drawing_height = 600

    def move(self, movement):
        vx = 0
        if movement["a"] == True:
            if self.block.x > 508:
                vx -= 10
                if self.but_right.pressed:
                    self.but_right.stop_press()
            elif not self.but_left.pressed:
                self.but_left.press()
        if movement["d"] == True:
            if self.block.x < 1912:
                vx += 10
                if self.but_left.pressed:
                    self.but_left.stop_press()
            elif not self.but_right.pressed:
                self.but_right.press()
        self.drawing.redraw_image(self.but_left.get_image(), "button_left")
        self.drawing.redraw_image(self.but_right.get_image(), "button_right")
        self.block.x += vx
        self.drawing.move_image("block", vx, 0)

    def create_robot(self):
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

    def draw_robot(self):
        self.drawing.draw_image(self.image, "actuator")
        self.drawing.draw_image(self.but_left.get_image(), "button_left")
        self.drawing.draw_image(self.but_right.get_image(), "button_right")
        self.drawing.draw_image(self.block.get_image(), "block")


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
        self.drawing_width = 6300
        self.drawing_height = 4300
        self.x = 500
        self.y = 500

    def move(self, movement):
        vx = 0
        vy = 0
        threshold_ytop = self.y > self.img_mobrob.height / 2
        threshold_ybot = self.y < self.drawing_height - self.img_mobrob.height / 2
        threshold_xleft = self.x > self.img_mobrob.width / 2
        threshold_xright = self.x < self.drawing_width - self.img_mobrob.width / 2
        if movement["w"] == True:
            if threshold_ytop:
                vy -= 10
        if movement["s"] == True:
            if threshold_ybot:
                vy += 10
        if movement["a"] == True:
            if threshold_xleft:
                vx -= 10
        if movement["d"] == True:
            if threshold_xright:
                vx += 10
        self.__update_coords(vx, vy)
        self.drawing.move_image("robot", vx, vy)

    def create_robot(self):
        self.robot = {
            "x": self.x,
            "y": self.y,
            "image": self.img_mobrob
        }
        self.light_l = {
            "x": self.x - 30,
            "y": self.y - 110
        }
        self.light_r = {
            "x": self.x + 30,
            "y": self.y - 110
        }

    def draw_robot(self):
        self.drawing.draw_image(self.robot, "robot")

    def __update_coords(self, dx, dy):
        self.x += dx
        self.y += dy
        self.robot["x"] = self.x
        self.robot["y"] = self.y
        self.light_l["x"] += dx
        self.light_l["y"] += dy
        self.light_r["x"] += dx
        self.light_r["y"] += dy


class Circuit:

    def __init__(self, drawing: Drawing):
        self.circuit_parts = []
        self.drawing = drawing
        self.ROAD_WIDTH = 300

    def create_circuit(self):
        straight_lengths = {
            1: {"x": 5000}, #recta ppal
            2: {"y": 1000}, #chicane 1
            3: {"x": -370},
            4: {"y": 1000}, #recta 1
            5: {"x": 370}, #chicane 2
            6: {"y": 1000},
            7: {"x": -2000}, #recta 2
            8: {"y": -500}, #chicane 3
            13: {"x": -1250},
            14: {"y": -1000}, #recta 5
            15: {"x": 750},
            16: {"y": -750}, #horquilla 1
            17: {"x": -1750},
            18: {"y": 1000},
            19: {"x": -750}, #horquilla 1
            20: {"y": -1750}, #ultima curva
        }
        self.create_straights(straight_lengths)
        self.draw_circuit()

    def create_straights(self, straight_lengths):
        x = 500
        y = 500
        for key in straight_lengths:
            if "x" in straight_lengths[key]:
                self.__create_straight(x, y, straight_lengths[key]["x"], self.ROAD_WIDTH)
                x += straight_lengths[key]["x"]
            elif "y" in straight_lengths[key]:
                self.__create_straight(x, y, self.ROAD_WIDTH, straight_lengths[key]["y"])
                y += straight_lengths[key]["y"]

    def draw_circuit(self):
        for part in self.circuit_parts:
            self.drawing.draw_circuit(
                {
                    "x": part.x,
                    "y": part.y,
                    "width": part.width,
                    "height": part.height
                }
            )
    
    def __create_straight(self, x, y, width, height):
        if width < 0:
            x += self.ROAD_WIDTH
            x += width
            width *= -1
        if height < 0:
            y += self.ROAD_WIDTH
            y += height
            height *= -1
        self.circuit_parts.append(
            self.CircuitStraight(x, y, width, height)
        )

    def is_overlapping(self, x, y):
        overlap = False
        for part in self.circuit_parts:
            overlap = part.check_overlap(x, y)
            if overlap:
                break
        return overlap

    class CircuitStraight:

        def __init__(self, x, y, width, height):
            self.x = x
            self.y = y
            self.width = width
            self.height = height

        def check_overlap(self, x, y):
            return (x >= self.x and x <= self.x + self.width) and (y >= self.y and y <= self.y + self.height)