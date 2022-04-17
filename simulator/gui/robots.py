from argparse import ArgumentError
from cmath import cos, sin
import tkinter as tk
from PIL import ImageTk, Image


class Layer:

    def __init__(self):
        """
        Constructor for superclass layer
        """
        self.drawing = Drawing()
        self.robot: Robot = None
        self._zoom_percentage()
        self.is_drawing = False

    def execute(self):
        """
        Executes the code, showing what the robot will do on the canvas
        """
        self._drawing_config()
        self.robot.draw()
        self.is_drawing = True
        
    def stop(self):
        """
        Stops all the executing code and clears the canvas
        """
        self.drawing.empty_drawing()
        self.is_drawing = False

    def zoom_in(self):
        """
        Broadens the drawing
        """
        self.drawing.zoom_in()
        self._zoom_config()

    def zoom_out(self):
        """
        Unbroads the drawing
        """
        self.drawing.zoom_out()
        self._zoom_config()

    def move(self, movement):
        self.robot.move(movement)

    def set_canvas(self, canvas: tk.Canvas):
        """
        Sets the canvas that the drawing will use
        """
        self.drawing.set_canvas(canvas)
        self.drawing.set_size(self.robot.drawing_width, self.robot.drawing_height)

    def _zoom_config(self):
        """
        Configures the zoom in case when it changes
        """
        self._zoom_percentage()
        if self.is_drawing:
            self._zoom_redraw()

    def _zoom_redraw(self):
        """
        Once the zoom changes, use this method for redrawing everything
        up to scale
        """
        self.drawing.delete_zoomables()
        self._draw_before_robot()
        self.robot.draw_robot()

    def _draw_before_robot(self):
        pass

    def _zoom_percentage(self):
        """
        Updates the percentage of zoom that is being used currently
        """
        self.zoom_percent = self.drawing.zoom_percentage()

    def _drawing_config(self):
        """
        Method used to configure the drawing before executing
        """
        self.drawing.empty_drawing()


class MoblileRobotLayer(Layer):

    def __init__(self):
        """
        Constructor for MobileRobotLayer
        """
        super().__init__()
        self.robot = MobileRobot(self.drawing)
        self.circuit = Circuit(self.drawing)
        self.obstacle = Obstacle(500, 3000, 600, 450, self.drawing)

    def _drawing_config(self):
        super()._drawing_config()
        self.__create_circuit()
        self.__create_obstacle()

    def _draw_before_robot(self):
        self.__create_circuit()
        self.__create_obstacle()

    def __create_circuit(self):
        self.circuit.create_circuit()

    def __create_obstacle(self):
        self.obstacle.draw()


class LinearActuatorLayer(Layer):

    def __init__(self):
        super().__init__()
        self.robot = LinearActuator(self.drawing)


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
        self.scale = 0.2
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
        self.canvas.delete('robot', 'circuit', 'obstacle')

    def draw_image(self, element, group):
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def redraw_image(self, element, group):
        self.canvas.delete(group)
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def move_image(self, group, dx, dy):
        vx = int(dx * self.scale)
        vy = int(dy * self.scale)
        self.canvas.move(group, vx, vy)

    def draw_rectangle(self, form: dict):
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale) + self.hud_h
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        color = form["color"]
        group = form["group"]
        self.canvas.create_rectangle(x, y, x + width, y + height, fill=color, tags=group)

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
        self.drawing_width = 0
        self.drawing_height = 0
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
        self.width = self.img_mobrob.width - 68
        self.height = self.img_mobrob.height

    def move(self, movement):
        vx = 0
        vy = 0
        threshold_ytop = self.y > self.height / 2
        threshold_ybot = self.y < self.drawing_height - self.height / 2
        threshold_xleft = self.x > self.width / 2
        threshold_xright = self.x < self.drawing_width - self.width / 2
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
            18: {"y": 750},
            19: {"x": -750}, #horquilla 1
            20: {"y": -1500}, #ultima curva
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
            self.drawing.draw_rectangle(
                {
                    "x": part.x,
                    "y": part.y,
                    "width": part.width,
                    "height": part.height,
                    "color": "black",
                    "group": "circuit"
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


class Obstacle:

    def __init__(self, x, y, width, height, drawing: Drawing):
        """
        Constructor for Obstacle
        Arguments:
            x: the initial x coordinate for the obstacle
            y: the initial y coordinate for the obstacle
            width: the width of the obstacle
            height: the height of the obstacle
            drawing: the drawing in which the obstacle will
            be drawn
        """
        self.x = x
        self.y = y
        self.width = width
        self.height = height
        self.drawing = drawing

    def draw(self):
        """
        Draws the obstacle in the corresponding drawing
        """
        self.drawing.draw_rectangle(
            {
                "x": self.x,
                "y": self.y,
                "width": self.width,
                "height": self.height,
                "color": "orange",
                "group": "obstacle"
            }
        )

    def check_closeness(self, px, py, angle):
        """
        Calculates the distance between the robot and the
        obstacle
        Arguments:
            px: the x coordinate of the point from which the sound
            ray starts
            py: the y coordinate of the point from which the sound
            ray starts
            angle: the angle in degrees with which the ray was thrown
        Returns:
            The distance between the sensor and the obstacle
        """
        distance = -1
        points = {
            "x1": self.x,
            "x2": self.x + self.width,
            "y1": self.y,
            "y2": self.y + self.width
        }
        vx = cos(angle)
        vy = sin(angle)
        res = {}
        index = 1
        for key in points:
            dist = -1
            v1 = v2 = None
            if key[0] == "x":
                dist = self.__calculate_distance(points[key], px, vx)
                v1 = (points[key], points["y1"])
                v2 = (points[key], points["y2"])
            elif key[0] == "y":
                dist = self.__calculate_distance(points[key], py, vy)
                v1 = (points["x1"], points[key])
                v2 = (points["x2"], points[key])
            if dist != -1:
                p_intersect = self.__calculate_intersection(px, py, vx, vy, dist)
                intersects = self.__check_intersection(v1, v2, p_intersect)
                res[index] = {
                    "intersects": intersects,
                    "dist": dist
                }
                index += 1
        distance = self.__check_distance(res)
        return distance

    def __calculate_distance(self, p1, p2, v):
        """
        Calculates the distance between p1 and p2 given v.
        Arguments:
            p1: the coordinate of the wall
            p2: the coordinate of the starting point
            v: the velocity
        Returns:
            The distance between p1 and p2
        """
        return abs((p1 - p2) / v)

    def __check_distance(self, dists):
        """
        Obtains the minimum of the distances that intersects with the
        obstacle.
        Arguments:
            dists: a dictionary with the following keys:
                intersects: True if intersects, false if not
                dist: the distance to the obstacle
        Returns:
            The minimum distance or -1 if the ray does not intersect
        """
        dist = -1
        if dists["intersects"]:
            if dists["dist"] < dist or dist == -1:
                dist = dists["dist"]
        return dist

    def __calculate_intersection(self, px, py, vx, vy, dist):
        """
        Calculates the point of intersection between the ray and
        the obstacle.
        Arguments:
            px: the x coord from which the ray starts
            py: the y coord from which the ray starts
            vx: the velocity on the x axis
            vy: the velocity on the y axis
            dist: the distance to the wall of the obstacle
        Returns:
            The point of intersection between the ray and the obstacle
        """
        x = px + dist * vx
        y = py + dist * vy
        return (x, y)

    def __check_intersection(self, p1, p2, op):
        """
        Checks for intersection of the ray line and the obstacle, done
        by calculating if op is between p1 and p2.
        Arguments:
            p1: start point of the straight (tuple)
            p2: end point of the straight (tuple)
            op: the point to check
        Returns:
            True: if the ray and the obstacle intersect
            False: if else
        """
        intersect_x = p1[0] <= op[0] <= p2[0] # 0 is the x coord
        intersect_y = p1[1] <= op[1] <= p2[1] # 1 is the y coord
        return intersect_x and intersect_y