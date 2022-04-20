from argparse import ArgumentError
from math import cos, pi, sin, sqrt, tan
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
        """
        Moves the robot that is being used
        """
        pass

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
        self.obstacle = Obstacle(700, 3000, 600, 450, self.drawing)

        self.is_rotating = False
        self.is_moving = False

    def move(self, movement):
        v = 0 #Velocity
        da = 0 #Angle

        #Process keys
        if not self.is_rotating:
            if movement["w"] == True:
                v = -10
            if movement["s"] == True:
                v = 10
            self.is_moving = True
        future_p = self.robot.predict_movement(v)
        if (
            v == 0 or
            future_p[0] <= self.robot.width / 2 or
            future_p[0] >= self.robot.drawing_width - self.robot.width / 2 or
            future_p[1] <= self.robot.height / 2 or
            future_p[1] >= self.robot.drawing_height - self.robot.height / 2 or
            self.__check_obstacle_collision(future_p[0], future_p[1])
        ):
            v = 0
            self.is_moving = False
        if not self.is_moving:
            if movement["a"] == True:
                da = 5
            if movement["d"] == True:
                da = -5
            self.is_rotating = True
        if da == 0:
            da = 0
            self.is_rotating = False

        #Move or rotate
        if not self.is_rotating:
            self.robot.move(v)
        if not self.is_moving:
            self.robot.change_angle(da)

        #Overlapping check
        self.__check_circuit_overlap()  
        self.__detect_obstacle()      

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

    def __check_circuit_overlap(self):
        """
        Checks if the robot is inside or outside of the circuit
        """
        for key in self.robot.sensors:
            if key[0:5] == "light":
                x = self.robot.sensors[key].x
                y = self.robot.sensors[key].y
                if self.circuit.is_overlapping(x, y):
                    self.robot.sensors[key].dark()
                else:
                    self.robot.sensors[key].light()
            self.robot.repaint_light_sensors()

    def __check_obstacle_collision(self, x, y):
        """
        Checks if the robot collides with the obstacle
        Arguments:
            x: the expected x position
            y: the expected y position
        Returns:
            True if collides, False if else
        """
        return (
            x + self.robot.width / 2 >= self.obstacle.x and
            y + self.robot.height / 2 >= self.obstacle.y and
            x <= self.obstacle.x + (self.obstacle.width + self.robot.width / 2) and
            y <= self.obstacle.y + (self.obstacle.height + self.robot.height / 2) 
        )

    def __detect_obstacle(self):
        self.drawing.canvas.delete("pointUp")
        for key in self.robot.sensors:
            if key[0:5] == "sound":
                self.drawing.canvas.delete("lineas")
                dist = self.obstacle.calculate_distance(self.robot.sensors[key].x, self.robot.sensors[key].y, self.robot.angle)
                print("Distance = {}".format(dist))

class LinearActuatorLayer(Layer):

    def __init__(self):
        """
        Constuctor for LinearActuatorLayer
        """
        super().__init__()
        self.robot = LinearActuator(self.drawing)

    def move(self, movement):
        v = 0
        self.robot.hit = False
        if movement["a"] == True:
            if self.robot.block.x > 508:
                v -= 10
                self.robot.hit = False
            else:
                self.robot.hit = True
        elif movement["d"] == True:
            if self.robot.block.x < 1912:
                v += 10
                self.robot.hit = False
            else:
                self.robot.hit = True
        self.robot.move(v)

class HUD:

    def __init__(self):
        self.canvas = None

    def set_canvas(self, canvas):
        self.canvas = canvas


class Drawing:

    def __init__(self):
        self.canvas = None
        self.canvas_images = {}
        self.scale = 0.2
        self.hud_w = 0
        self.hud_h = 0

    def set_canvas(self, canvas: tk.Canvas):
        self.canvas = canvas

    def empty_drawing(self):
        self.canvas.delete('all')
        self.canvas_images = {}

    def delete_zoomables(self):
        self.canvas.delete('actuator', 'button_left', 'button_right', 'block')
        self.canvas.delete('robot', 'circuit', 'obstacle', 'light_1', 'light_2', 'light_3', 'light_4')
        self.canvas.delete('prueba')

    def draw_image(self, element, group):
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def redraw_image(self, element, group):
        self.canvas.delete(group)
        del self.canvas_images[group]
        self.__add_to_canvas(element["x"], element["y"], element["image"], group)

    def move_image(self, group, x, y):
        current_x = self.canvas_images[group]["x"]
        current_y = self.canvas_images[group]["y"]
        scale_x = int(x * self.scale)
        scale_y = int(y * self.scale)
        dx = scale_x - current_x
        dy = scale_y - current_y
        self.canvas_images[group]["x"] = scale_x
        self.canvas_images[group]["y"] = scale_y
        self.canvas.move(group, dx, dy)

    def rotate_image(self, element, angle, group):
        self.canvas.delete(group)
        rotated_img = element["image"].rotate(angle, expand=True)
        self.__add_to_canvas(element["x"], element["y"], rotated_img, group)

    def draw_rectangle(self, form: dict):
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale) + self.hud_h
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        color = form["color"]
        group = form["group"]
        self.canvas.create_rectangle(x, y, x + width, y + height, fill=color, tags=group)

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
        scale_x = x * self.scale
        scale_y = y * self.scale + self.hud_h
        self.canvas_images[group] = {
            "x": scale_x,
            "y": scale_y,
            "image": ImageTk.PhotoImage(res_img)
        }
        self.canvas.create_image(scale_x, scale_y, image=self.canvas_images[group]["image"], tags=group)


class Robot:

    def __init__(self, drawing: Drawing):
        self.x = 0
        self.y = 0
        self.width = 0
        self.height = 0
        self.drawing_width = 0
        self.drawing_height = 0
        self.drawing = drawing

    def move(self, vel):
        pass

    def draw(self):
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
        self.x = int(self.drawing_width / 2)
        self.y = int(self.drawing_height / 2)
        self.width = self.img_act.width
        self.height = self.img_act.height
        self.hit = False
        self.direction = "stop"
        
        self.create_robot()

    def move(self, vel):
        if (not self.hit) and vel != 0:
            if self.but_right.pressed:
                self.but_right.stop_press()
            if self.but_left.pressed:
                self.but_left.stop_press()
            self.__redraw_buttons()
        if vel < 0:
            self.direction = "left"
        elif vel > 0:
            self.direction = "right"
        if vel == 0 and self.hit and not self.direction == "stop":
            if not self.but_left.pressed and self.direction == "left":
                self.but_left.press()
            if not self.but_right.pressed and self.direction == "right":
                self.but_right.press()
            self.__redraw_buttons()
            self.direction = "stop"
        else:
            self.block.x += vel
            self.drawing.move_image("block", self.block.x, self.block.y)

    def __redraw_buttons(self):
        self.drawing.redraw_image(self.but_left.get_image(), "button_left")
        self.drawing.redraw_image(self.but_right.get_image(), "button_right")

    def create_robot(self):
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
        self.real_x = self.x
        self.real_y = self.y
        self.width = self.img_mobrob.width
        self.height = self.img_mobrob.height
        self.angle = 90
        self.sensors = {}

        self.create_robot()

    def create_robot(self):
        self.robot = {
            "x": self.x,
            "y": self.y,
            "image": self.img_mobrob
        }
        self.sensors["light_1"] = self.LightSensor(
            self.x - 30,
            self.y - 110
        )
        self.sensors["light_2"] = self.LightSensor(
            self.x + 30,
            self.y - 110
        )
        self.sensors["sound_1"] = self.UltrasoundSensor(
            self.x - 30,
            self.y - 285,
            7630
        )
        self.sensors["sound_2"] = self.UltrasoundSensor(
            self.x + 30,
            self.y - 285,
            7630,
        )

    def draw_robot(self):
        self.drawing.draw_image(self.robot, "robot")
        self.drawing.rotate_image(
                {
                    "x": self.x,
                    "y": self.y,
                    "image": self.img_mobrob
                },
                self.angle - 90,
                "robot"
            )
        for key in self.sensors:
            if self.sensors[key].get_image() != None:
                self.drawing.draw_image(self.sensors[key].get_image(), key)
            else:
                self.drawing.draw_rectangle(
                    {
                        "x": self.sensors[key].x,
                        "y": self.sensors[key].y,
                        "width": 20,
                        "height": 20,
                        "color": "blue",
                        "group": "prueba"
                    }
                )

    def predict_movement(self, vel):
        """
        Predicts the future position of the robot. Used to
        check if a collision with an object will happen
        Arguments:
            vel: the velocity of the robot (with no axis)
        Returns:
            The predicted coordinates of the robot (tuple)
        """
        angle = self.angle * pi / 180
        vx = -vel * cos(angle)
        vy = vel * sin(angle)
        real_x = self.real_x + vx
        real_y = self.real_y + vy
        x = self.x
        y = self.y
        if real_x != x or real_y != y:
            x = int(real_x)
            y = int(real_y)
        return (x, y)

    def move(self, vel):
        """
        Moves the robot
        Arguments:
            vel: the velocity that the robot is going at,
            from it the velocity in each axis is calculated
            by using sin and cos with the angle
        """
        angle = self.angle * pi / 180
        vx = -vel * cos(angle)
        vy = vel * sin(angle)
        if self.__update_coords(vx, vy):
            self.drawing.canvas.delete('prueba')
            self.drawing.move_image("robot", self.x, self.y)
            for key in self.sensors:
                if self.sensors[key].get_image() != None:
                    self.drawing.move_image(key, self.sensors[key].x, self.sensors[key].y)
                else:
                    self.drawing.draw_rectangle(
                        {
                            "x": self.sensors[key].x,
                            "y": self.sensors[key].y,
                            "width": 20,
                            "height": 20,
                            "color": "blue",
                            "group": "prueba"
                        }
                    )

    def change_angle(self, d_angle):
        """
        Changes robot's angle when turning
        Arguments:
            d_angle: the number of degrees that the robot 
            is going to rotate. Can be + or -
        """
        if self.angle + d_angle >= 0 and self.angle + d_angle <= 360:
            self.angle += d_angle
        else:
            if self.angle + d_angle < 0:
                self.angle = 360 + (self.angle + d_angle)
            else:
                self.angle = (self.angle + d_angle) - 360
        if d_angle != 0:
            self.drawing.rotate_image(
                {
                    "x": self.x,
                    "y": self.y,
                    "image": self.img_mobrob
                },
                self.angle - 90,
                "robot"
            )
            self.__rotate_sensors(d_angle)

    def repaint_light_sensors(self):
        """
        Repaints the light sensors
        """
        for key in self.sensors:
            if key[0:5] == "light":
                self.drawing.redraw_image(self.sensors[key].get_image(), key)

    def configure_distance(self, dist_sens):
        """
        Configures the distance of detection of the ultrasounds
        Arguments:
            dist_sens: the distance at which the sensor returns True
        """
        for key in self.sensors:
            if key[0:5] == "sound":
                self.sensors[key].dist = dist_sens

    def __update_coords(self, dx, dy):
        """
        Updates the coordinates of the different components
        of the robot. It does so by updating the real position
        and when it changes compared to the coordinates, this are
        updated.
        Arguments:
            dx: the change on x coordinates
            dy: the change on y coordinates
        """
        self.real_x += dx
        self.real_y += dy
        for key in self.sensors:
            dx_sens = self.sensors[key].real_x + dx
            dy_sens = self.sensors[key].real_y + dy
            self.sensors[key].change_coords(dx_sens, dy_sens)
        if self.__check_change_coords():
            self.x = int(self.real_x)
            self.y = int(self.real_y)
            self.robot["x"] = self.x
            self.robot["y"] = self.y
            return True
        return False

    def __check_change_coords(self):
        """
        Checks if the real coords (real_x and real_y)
        are different when they are truncated, compared
        to the int ones (x and y)
        """
        x = int(self.real_x)
        y = int(self.real_y)
        return self.x != x or self.y != y

    def __rotate_sensors(self, da):
        self.drawing.canvas.delete('prueba')
        for key in self.sensors:
            x, y = self.__rotate_center(
                (self.sensors[key].real_x, self.sensors[key].real_y),
                (self.x, self.y),
                da
            )
            self.sensors[key].change_coords(self.x + x, self.y + y)
            img = self.sensors[key].get_image()
            if img != None:
                self.drawing.redraw_image(img, key)
            else:
                self.drawing.draw_rectangle(
                    {
                        "x": self.sensors[key].x,
                        "y": self.sensors[key].y,
                        "width": 20,
                        "height": 20,
                        "color": "blue",
                        "group": "prueba"
                    }
                )

    def __rotate_center(self, tp, c, da):
        """
        Rotates a component relative to a center
        Arguments:
            tp: point to be translated. Tuple = (x, y)
            c: center point. Tuple = (x, y)
            da: number of degrees to rotate (sixagesimal)
        """
        abs_px = tp[0] - c[0]
        abs_py = tp[1] - c[1]
        rads = da * (pi / 180) #degrees to radians

        # Rotate
        cos_r = cos(rads)
        sin_r = sin(rads)
        x = (abs_px * cos_r) + (abs_py * sin_r)
        y = (-abs_px * sin_r) + (abs_py * cos_r)

        #print(math.sqrt((pow(tp[0] - c[0], 2)) + (pow(tp[1] - c[1], 2))))
        return (x, y)


    class Sensor:

        def __init__(self, x, y):
            """
            Constructor for sensor
            Arguments:
                x: the x position of the sensor
                y: the y position of the sensor
            """
            self.x = x
            self.y = y
            self.real_x = self.x
            self.real_y = self.y
            self.img_shown = None

        def change_coords(self, x, y):
            """
            Moves the real coordinates of the sensor (double cooords)
            Arguments:
                x: the new real x coordinate
                y: the new real y coordinate
            """
            self.real_x = x
            self.real_y = y
            self.x = int(self.real_x)
            self.y = int(self.real_y)

        def get_image(self):
            """
            Converts the image to a dictionary so the drawing
            can parse it:
            Returns:
                A dictionary with the following keys:
                    x: the x coordinate
                    y: the y coordinate
                    image: the image to represent
            """
            if self.img_shown != None:
                return {
                    "x": self.x,
                    "y": self.y,
                    "image": self.img_shown
                }
            return None


    class LightSensor(Sensor):

        def __init__(self, x, y):
            """
            Constructor for light sensor
            Arguments:
                x: the x position of the sensor
                y: the y position of the sensor
            """
            super().__init__(x, y)
            self.img_light = Image.open("simulator/gui/assets/light-bright.png")
            self.img_dark = Image.open("simulator/gui/assets/light-dark.png")
            self.img_shown = self.img_light

        def light(self):
            """
            Changes the sensor to light
            """
            self.img_shown = self.img_light
            
        def dark(self):
            """
            Changes the sensor to dark
            """
            self.img_shown = self.img_dark


    class UltrasoundSensor(Sensor):

        def __init__(self, x, y, dist):
            """
            Constructor for ultrasound sensor
            Arguments:
                x: the x position of the sensor
                y: the y position of the sensor
                dist: the distance to check
            """
            super().__init__(x, y)
            self.dist = dist
            self.is_detecting = False

        def detect(self, dist):
            if dist <= self.dist:
                self.is_detecting = True
            else:
                self.is_detecting = False


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
        """
        Checks if the coordinates are overlapping with the circuit
        Arguments:
            x: the x coordinate to check
            y: the y coordinate to check
        Returns:
            True if is overlapping, False if else
        """
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

    def calculate_distance(self, sx, sy, angle):
        """
        Checks if is detected by the ultrasound sensor.
        Arguments:
            sx: the x coordinate of the sensor
            sy: the y coordinate of the sensor
            angle: the angle of the line (from ox)
        Returns: 
            True if is detected, False if else
        """
        # Abs coords of obstacle
        x1 = self.x - sx
        x2 = self.x + self.width - sx
        y1 = self.y - sy
        y2 = self.y + self.height - sy
        rads = angle * (pi / 180)

        # Distance
        if angle % 90 != 0 or angle % 180 == 0:
            dist_x1 = int(abs(x1 / cos(rads)))
            dist_x2 = int(abs(x2 / cos(rads)))
        else:
            dist_x1 = "inf"
            dist_x2 = "inf"
        if angle % 180 != 0:
            dist_y1 = int(abs(y1 / sin(rads)))
            dist_y2 = int(abs(y2 / sin(rads)))
        else:
            dist_y1 = "inf"
            dist_y2 = "inf"

        #print("Dist x1: {}, dist x2: {}, dist y1: {}, dist y2: {}".format(dist_x1, dist_x2, dist_y1, dist_y2))
        
        # Point distance
        dy = lambda d, r: int(-sin(r) * d)
        dx = lambda d, r: int(cos(r) * d)
        
        dist = -1

        # 10 coords in each point to ensure the fixed coord is inside
        if dist_x1 != "inf":
            px1 = (dx(dist_x1, rads), dy(dist_x1, rads))
            if self.__check_inbounds(px1[0] + sx + 10, px1[1] + sy):
                if dist == -1 or dist_x1 < dist:
                    dist = dist_x1
        if dist_x2 != "inf":
            px2 = (dx(dist_x2, rads), dy(dist_x2, rads))
            if self.__check_inbounds(px2[0] + sx - 10, px2[1] + sy):
                if dist == -1 or dist_x2 < dist:
                    dist = dist_x2
        if dist_y1 != "inf":
            py1 = (dx(dist_y1, rads), dy(dist_y1, rads))
            if self.__check_inbounds(py1[0] + sx, py1[1] + sy + 10):
                if dist == -1 or dist_y1 < dist:
                    dist = dist_y1
        if dist_y2 != "inf":
            py2 = (dx(dist_y2, rads), dy(dist_y2, rads))
            if self.__check_inbounds(py2[0] + sx, py2[1] + sy - 10):
                if dist == -1 or dist_y2 < dist:
                    dist = dist_y2
        
        return dist

    def __check_inbounds(self, x, y):
        """
        Checks if a point is inbounds of the obstacle (caution with
        absolute coordinates)
        Arguments:
            x: the x coordinate of the point
            y: the y coordinate of the point
        Returns:
            True if inbounds, False if else
        """
        return (
            self.x <= x <= (self.x + self.width) and
            self.y <= y <= (self.y + self.height)
        )