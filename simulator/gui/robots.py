from argparse import ArgumentError
import tkinter as tk
from PIL import ImageTk, Image


class Robot:

    def __init__(self, drawing):
        self.x = 0
        self.y = 0
        self.drawing = drawing

    def move(self, vx, vy, angle):
        pass

    def draw(self):
        pass


class LinearActuator(Robot):

    def __init__(self, drawing):
        super().__init__(drawing)
        self.img_act = Image.open("simulator/gui/assets/actuator.png")
        self.img_buth = Image.open("simulator/gui/assets/button-hit.png")
        self.img_butnh = Image.open("simulator/gui/assets/button-no-hit.png")
        self.img_mob = Image.open("simulator/gui/assets/mobile-part.png")
        self.button = False

    def move(self, vx, vy, angle):
        return super().move(vx, vy, angle)

    def draw(self):
        return super().draw()

    def change_button(self):
        self.button = not self.button


class MobileRobot(Robot):

    def __init__(self, drawing):
        super().__init__(drawing)
        self.img_fspeed = Image.open("simulator/gui/assets/full-speed.png")
        self.img_mspeed = Image.open("simulator/gui/assets/mid-speed.png")
        self.img_sspeed = Image.open("simulator/gui/assets/slow-speed.png")
        self.img_ligb = Image.open("simulator/gui/assets/light-bright.png")
        self.img_ligd = Image.open("simulator/gui/assets/light-dark.png")
        self.img_souh = Image.open("simulator/gui/assets/sound-hit.png")
        self.img_sounh = Image.open("simulator/gui/assets/sound-no-hit.png")
        self.img_mobrob = Image.open("simulator/gui/assets/mobile-robot.png")

    def move(self, vx, vy, angle):
        return super().move(vx, vy, angle)

    def draw(self):
        self.x = self.img_mobrob.width
        self.y = self.img_mobrob.height / 2 + 150
        self.drawing.draw_image(self.x, self.y, self.img_mobrob)
        self.show_arrow(self.x - (self.img_mobrob.width / 2 + 50), self.y, 0)
        self.show_arrow(self.x + (self.img_mobrob.width / 2 + 50), self.y, 1)

    def show_arrow(self, x, y, img_num: int):
        if img_num == 0:
            self.drawing.draw_image(x, y, self.img_fspeed)
        elif img_num == 1:
            self.drawing.draw_image(x, y, self.img_mspeed.rotate(180))
        elif img_num == 2:
            self.drawing.draw_image(x, y, self.img_sspeed)

    def show_ultrasound(self, img_num: int):
        try:
            img_file = self.__select_img(img_num, 3, 4)
        except ArgumentError:
            pass

    def show_light(self, img_num: int):
        try:
            img_file = self.__select_img(img_num, 5, 6)
        except ArgumentError:
            pass

    def reboot(self):
        self.drawing.empty_drawing()


class Drawing:

    def __init__(self):
        self.images = {}
        self.canvas_images = []
        self.scale = 0.5

    def set_canvas(self, canvas: tk.Canvas):
        self.canvas = canvas

    def draw_image(self, x, y, image: Image):
        self.images.append({
            "x": x,
            "y": y,
            "image": image
        })
        self.__add_to_canvas(x, y, image)

    def empty_drawing(self):
        self.canvas.delete('all')
        self.images = []
        self.canvas_images = []

    def move_image(self, dx, dy):
        pass

    def zoom_in(self):
        if self.scale < 1:
            self.scale += 0.1
        self.scale = round(self.scale, 1)
        self.__redraw()

    def zoom_out(self):
        if self.scale > 0.1:
            self.scale -= 0.1
        self.scale = round(self.scale, 1)
        self.__redraw()

    def zoom_percentage(self):
        return self.scale * 100

    def __redraw(self):
        self.canvas.delete('all')
        self.canvas_images = []
        for img in self.images:
            self.__add_to_canvas(img['x'], img['y'], img['image'])

    def __add_to_canvas(self, x, y, image: Image):
        width = int(image.width * self.scale)
        height = int(image.height * self.scale)
        res_img = image.resize((width, height), Image.ANTIALIAS)
        self.canvas_images.append(ImageTk.PhotoImage(res_img))
        self.canvas.create_image(x * self.scale, y * self.scale, image=self.canvas_images[-1])


class Circuit:

    def __init__(self):
        self.coords = None

    def create_circuit(self):
        pass
