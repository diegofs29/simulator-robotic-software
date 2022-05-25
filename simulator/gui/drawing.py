import tkinter as tk
from PIL import ImageTk, Image


class Drawing:

    def __init__(self):
        """
        Constructor for the drawing
        """
        self.canvas = None
        self.images = {}
        self.canvas_images = {}
        self.scale = 0.2
        self.hud_w = 0
        self.hud_h = 0

    def set_canvas(self, canvas: tk.Canvas):
        """
        Sets the canvas in which the drawing is going to be done
        Arguments:
            canvas: the canvas
        """
        self.canvas = canvas

    def empty_drawing(self):
        """
        Deletes all elements from the drawing
        """
        self.canvas.delete('all')
        self.canvas_images = {}

    def delete_zoomables(self):
        """
        Deletes all the elements that have to be zoomed
        """
        self.canvas.delete('actuator', 'button_left', 'button_right', 'block')
        self.canvas.delete('robot', 'circuit', 'obstacle', 'light_1', 'light_2', 'light_3', 'light_4')
        self.canvas.delete('prueba')

    def draw_image(self, element, group):
        """
        Draws an image
        Arguments:
            element: a dict whose content is the x and y
            coordinates and the image (as Image instance)
            group: the tag where the image is going to 
            be added to
        """
        image = self.__open_image(element["image"], group)
        self.__add_to_canvas(element["x"], element["y"], image, group)

    def redraw_image(self, element, group):
        """
        Redraws an already existing image
        Arguments:
            element: a dict whose content is the x and y
            coordinates and the image (as Image instance)
            group: the tag where the image is going to 
            be added to
        """
        self.canvas.delete(group)
        del self.canvas_images[group]
        image = self.__open_image(element["image"], group)
        self.__add_to_canvas(element["x"], element["y"], image, group)

    def move_image(self, group, x, y):
        """
        Moves a image (or group of) of the drawing
        Arguments:
            group: the tag of the image(s)
            x: the x differential
            y: the y differential
        """
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
        """
        Rotates a image by an angle
        Arguments:
            element: a dict whose elements are the x and
            y coordinates and the image (as str path)
            angle: the differential of the angle
            group: the group of the image(s)
        """
        self.canvas.delete(group)
        image = self.__open_image(element["image"], group)
        rotated_img = self.images[element["image"]] = image.rotate(angle, expand=True)
        self.__add_to_canvas(element["x"], element["y"], rotated_img, group)

    def draw_rectangle(self, form: dict):
        """
        Draws a rectangle given some measurements
        Arguments:
            form: a dictionary whose elements are the x and
            y coordinates, the width and height of the
            rectangle and the color and group (tag of tkinter)
        """
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale) + self.hud_h
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        color = form["color"]
        group = form["group"]
        self.canvas.create_rectangle(x, y, x + width, y + height, fill=color, tags=group)

    def draw_arc(self, form: dict):
        """
        Draws an arc given some measurements
        Arguments:
            form: a dictionary whose elements are the x and y
            coordinates, the width and height of the bounding of
            the arc, the width of the arc, the angle of the arc 
            and the group (tag of tkinter)
        """
        x = int(form["x"] * self.scale)
        y = int(form["y"] * self.scale) + self.hud_h
        width = int(form["width"] * self.scale)
        height = int(form["height"] * self.scale)
        track_width = int(form["track_width"]* self.scale)
        starting_angle = form["starting_angle"]
        angle = form["angle"]
        group = form["group"]
        self.canvas.create_arc(x, y, x + width, y + height, width=track_width, style="arc", start=starting_angle, extent=angle, tags=group)

    def zoom_in(self):
        """
        Zooms in the scale and updates the drawing
        """
        if self.scale < 1:
            self.scale += 0.1
        self.scale = round(self.scale, 1)
        self.__update_size()

    def zoom_out(self):
        """
        Zooms out the scale and updates the drawing
        """
        if self.scale > 0.1:
            self.scale -= 0.1
        self.scale = round(self.scale, 1)
        self.__update_size()

    def zoom_percentage(self):
        """
        Returns the zoom percentage
        """
        return self.scale * 100

    def set_size(self, width, height):
        """
        Sets the size limits of the canvas
        Arguments:
            width: the width of the canvas
            height: the height of the canvas
        """
        self.width = width
        self.height = height
        self.__update_size()
    
    def __update_size(self):
        """
        Updates the size of the canvas according
        with the scale and the size of it
        """
        w = self.width * self.scale
        h = self.height * self.scale
        self.canvas.configure(scrollregion=(0, 0, w, h))

    def __add_to_canvas(self, x, y, image: Image, group):
        """
        Adds a image to the canvas
        Arguments:
            x: the x coordinate of the image
            y: the y coordinate of the image
            image_path: the image to add (as Image instance)
            group: the group (tag of tkinter)
        """
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

    def __open_image(self, image_path, group):
        image = None
        if not group in self.images:
            image = self.__get_image(image_path, group)
        elif not self.images[group]["path"] == image_path:
            image = self.__get_image(image_path, group)
        else:
            image = self.images[group]["image"]
        return image

    def __get_image(self, image_path, group):
        image = Image.open(image_path)
        self.images[group] = {
            "image": image,
            "path": image_path
        }
        return image