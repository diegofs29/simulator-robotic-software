import tkinter as tk
from PIL import Image, ImageTk


class HUD:

    def __init__(self):
        """
        Constructor for HUD superclass
        """
        self.canvas: tk.Canvas = None

    def set_canvas(self, canvas: tk.Canvas):
        """
        Sets the canvas where the data is going to be drawn at
        Arguments:
            canvas: the canvas
        """
        self.canvas = canvas
        self.canvas.delete('all')
        self.set_text()

    def reboot(self):
        self.canvas.delete('all')
        self.set_text()

    def set_text(self):
        """
        Shows the text of the data that the HUD is going to
        show
        """
        pass


class MobileHUD(HUD):

    def __init__(self):
        """
        Constructor for mobile robot's HUD
        """
        super().__init__()
        self.img_ff = Image.open('assets/full-speed.png')
        self.img_mf = Image.open('assets/mid-speed.png')
        self.img_sf = Image.open('assets/slow-speed.png')

    def set_text(self):
        """
        Sets the corresponding texts for the mobile robot
        """
        self.canvas.create_text(5, 25, text="Rueda izquierda:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(5, 50, text="Rueda derecha:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(5, 75, text="En pista:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(250, 25, text="Detecta obstáculo:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(250, 50, text="└Distancia:", font=(
            "Consolas", 13), anchor="w", fill="white")

    def set_wheel(self, vels):
        """
        Method that gets all the velocitys and calls display_wheels
        for each velocity, so it can represent the wheel's direction
        and velocity
        """
        self.canvas.delete('arr_img')
        i = 0
        self.imgs = []
        for vel in vels:
            self.__display_wheels(i, vel)
            i += 1

    def __display_wheels(self, i, vel):
        """
        Displays arrows in the direction that the wheels are moving
        and with a color that represents their velocity (blue fast,
        yellow medium, red slow).
        Arguments:
            i: the index of the wheel
            vel: the velocity of the wheel
        """
        w = int(self.img_ff.width * 0.5)
        h = int(self.img_ff.height * 0.5)
        self.ff = self.img_ff.resize((w, h), Image.ANTIALIAS)
        self.mf = self.img_mf.resize((w, h), Image.ANTIALIAS)
        self.sf = self.img_sf.resize((w, h), Image.ANTIALIAS)
        if abs(vel) < 100:
            if vel < 0:
                self.sf = self.sf.rotate(180, expand=True)
            self.imgs.append(ImageTk.PhotoImage(self.sf))
        elif abs(vel) > 200:
            if vel < 0:
                self.ff = self.ff.rotate(180, expand=True)
            self.imgs.append(ImageTk.PhotoImage(self.ff))
        else:
            if vel < 0:
                self.mf = self.mf.rotate(180, expand=True)
            self.imgs.append(ImageTk.PhotoImage(self.mf))
        y = 25 + (25 * i)
        self.canvas.create_image(200, y, image=self.imgs[i], tags="arr_img")

    def set_circuit(self, measurements):
        """
        Displays if the robot is on the circuit or outside it
        Arguments:
            measurements: a list with the measurements of the
            light sensors. True if on track, False if else
        """
        self.canvas.delete("cir")
        text = ""
        for i in range(0, len(measurements)):
            if i > 0:
                text += " | "
            if measurements[i]:
                text += "Si"
            else:
                text += "No"
        self.canvas.create_text(100, 75, text=text, font=(
            "Consolas", 13), anchor="w", fill="white", tags="cir")

    def set_detect_obstacle(self, dists):
        """
        Displays if the robot is detecting a obstacle, and the distance
        to it.
        Arguments:
            dists: a list with the distances
        """
        self.canvas.delete("obs")
        text = ""
        for i in range(0, len(dists)):
            dist_text = "-"
            if i > 0:
                text += " | "
            if dists[i] != -1:
                text += "Si"
                dist_text = str(dists[i] - 1)
            else:
                text += "No"
            self.canvas.create_text(360, 50 + (25 * i), text=dist_text, font=("Consolas", 13), anchor="w", tags="obs",
                                    fill="white")
        self.canvas.create_text(425, 25, text=text, font=(
            "Consolas", 13), anchor="w", tags="obs", fill="white")


class ActuatorHUD(HUD):

    def __init__(self):
        """
        Constructor for linear actuator's HUD
        """
        super().__init__()
        self.img_ff = Image.open('assets/full-speed.png')
        self.img_mf = Image.open('assets/mid-speed.png')
        self.img_sf = Image.open('assets/slow-speed.png')

    def set_text(self):
        """
        Sets the corresponding texts for the linear actuator
        """
        self.canvas.create_text(5, 25, text="Dirección de movimiento:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(5, 50, text="Botón izquierdo:", font=(
            "Consolas", 13), anchor="w", fill="white")
        self.canvas.create_text(5, 75, text="Botón derecho:", font=(
            "Consolas", 13), anchor="w", fill="white")

    def set_pressed(self, but_states):
        """
        Parses the button sates to data to show on the HUD
        """
        self.canvas.delete('but_text')
        for i in range(0, len(but_states)):
            text = "No pulsado"
            if but_states[i]:
                text = "Pulsado"
            self.canvas.create_text(150 + 20 * ((i + 1) % 2), 50 + 25 * i, text=text, font=("Consolas", 13), anchor="w",
                                    fill="white", tags="but_text")

    def set_direction(self, vel):
        """
        Draws the direction arrows with the information
        of the velocity
        """
        self.canvas.delete('arr_img')
        w = int(self.img_ff.width * 0.5)
        h = int(self.img_ff.height * 0.5)
        self.ff = self.img_ff.resize((w, h), Image.ANTIALIAS)
        self.mf = self.img_mf.resize((w, h), Image.ANTIALIAS)
        self.sf = self.img_sf.resize((w, h), Image.ANTIALIAS)
        if abs(vel) < 100:
            if vel < 0:
                self.sf = self.sf.rotate(90, expand=True)
            else:
                self.sf = self.sf.rotate(-90, expand=True)
            self.img = ImageTk.PhotoImage(self.sf)
        elif abs(vel) > 200:
            if vel < 0:
                self.ff = self.ff.rotate(90, expand=True)
            else:
                self.ff = self.ff.rotate(-90, expand=True)
            self.img = ImageTk.PhotoImage(self.ff)
        else:
            if vel < 0:
                self.mf = self.mf.rotate(90, expand=True)
            else:
                self.mf = self.mf.rotate(-90, expand=True)
            self.img = ImageTk.PhotoImage(self.mf)
        self.canvas.create_image(250, 25, image=self.img, tags="arr_img")
