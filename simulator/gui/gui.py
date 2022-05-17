import tkinter as tk
import tkinter.ttk as ttk
import simulator.gui.model as model

DARK_BLUE = "#006468"
BLUE = "#17a1a5"


class MainApplication(tk.Tk):

    def __init__(self, *args, **kwargs):
        tk.Tk.__init__(self, *args, **kwargs)
        self.title("Simulador Software para Robots")
        self.geometry("1280x720")

        self.menu_bar = MenuBar(self, self)

        self.tools_frame = tk.Frame(self, bg=DARK_BLUE)
        self.button_bar = ButtonBar(self.tools_frame, self, bg=DARK_BLUE)
        self.selector_bar = SelectorBar(self.tools_frame, self, bg=DARK_BLUE)

        self.vertical_pane = tk.PanedWindow(
            orient=tk.VERTICAL, sashpad=5, sashrelief="solid", bg=DARK_BLUE)
        self.horizontal_pane = tk.PanedWindow(
            self.vertical_pane, orient=tk.HORIZONTAL, sashpad=5, sashrelief="solid", bg=BLUE)
        self.drawing_frame = DrawingFrame(
            self.horizontal_pane, self, bg=BLUE)
        self.editor_frame = EditorFrame(self.horizontal_pane, bg=BLUE)
        self.console_frame = ConsoleFrame(self.vertical_pane, self, bg=DARK_BLUE)

        self.identifier = None
        self.model = model.RobotsModel(self)
        self.prepare_model()
        self.keys_used = True

        self.config(menu=self.menu_bar)
        self.button_bar.pack(fill=tk.X, side="left")
        self.selector_bar.pack(fill=tk.X, side="right")
        self.move_WASD = {
            "w": False,
            "a": False,
            "s": False,
            "d": False
        }

        self.tools_frame.pack(fill=tk.X)
        self.vertical_pane.pack(fill="both", expand=True)

        self.horizontal_pane.add(
            self.drawing_frame, stretch="first", width=500, minsize=100)
        self.horizontal_pane.add(self.editor_frame, minsize=100)
        self.vertical_pane.add(self.horizontal_pane, stretch="first", minsize=100)
        self.vertical_pane.add(self.console_frame, stretch="never", height=200, minsize=100)

        self.bind("<KeyPress>", self.key_press)
        self.bind("<KeyRelease>", self.key_release)

    def prepare_model(self):
        self.__update_robot()
        self.model.configure_layer(self.drawing_frame.canvas, self.drawing_frame.hud_canvas)
        self.model.configure_console(self.console_frame.console)
        self.__update_track()

    def execute(self):
        self.model.execute()

    def stop(self):
        self.model.stop()

    def open_pin_configuration(self):
        """
        Top level window to configure pins connected to the
        Arduino board
        """
        robot = self.selector_bar.robot_selector.current()
        PinConfigurationWindow(self, robot, self)

    def zoom_in(self):
        self.model.zoom_in()

    def zoom_out(self):
        self.model.zoom_out()
        
    def change_zoom_label(self, zoom_level):
        self.drawing_frame.change_zoom_label(zoom_level)

    def change_robot(self, event):
        self.__update_robot()
        self.__update_track() #Needed to set the circuit of the layer

    def __update_robot(self):
        robot = self.selector_bar.robot_selector.current()
        self.model.change_robot(robot)
        self.model.configure_layer(self.drawing_frame.canvas, self.drawing_frame.hud_canvas)

    def change_track(self, event):
        self.__update_track()

    def __update_track(self):
        circuit = self.selector_bar.track_selector.current()
        robot = self.selector_bar.robot_selector.current()
        if robot == 0 or robot == 1:
            self.model.change_circuit(circuit)
        self.model.configure_layer(self.drawing_frame.canvas, self.drawing_frame.hud_canvas)

    def show_circuit_selector(self, showing):
        if showing:
            self.selector_bar.recover_circuit_selector()
        else:
            self.selector_bar.hide_circuit_selector()
    
    def show_joystick(self, showing):
        if showing:
            self.drawing_frame.show_joystick()
        else:
            self.drawing_frame.hide_joystick()

    def key_press(self, event):
        pressed_key = event.char
        if pressed_key in self.move_WASD:
            self.move_WASD[pressed_key] = True

    def key_release(self, event):
        pressed_key = event.char
        if pressed_key in self.move_WASD:
            self.move_WASD[pressed_key] = False

    def abort_after(self):
        if self.identifier is not None:
            self.after_cancel(self.identifier)

    def console_filter(self):
        msg_filters = {}
        if self.console_frame.output.get() == 1:
            msg_filters['info'] = True
        else:
            msg_filters['info'] = False
        if self.console_frame.warning.get() == 1:
            msg_filters['warning'] = True
        else:
            msg_filters['warning'] = False
        if self.console_frame.error.get() == 1:
            msg_filters['error'] = True
        else:
            msg_filters['error'] = False
        self.model.filter_console(msg_filters)

    def toggle_keys(self):
        self.keys_used = not self.keys_used


class PinConfigurationWindow(tk.Toplevel):

    def __init__(self, parent, robot_option, application: MainApplication = None, *args, **kwargs):
        tk.Toplevel.__init__(self, parent, *args, **kwargs)
        self.application = application
        self.data = {}
        
        frame_content = tk.Frame(self)
        frame_buttons = tk.Frame(self)
        self.robot_option = robot_option

        #Actuator
        self.lb_actuator = tk.Label(frame_content, text="Actuador lineal:")
        self.lb_pin_bt1 = tk.Label(frame_content, text="Pin botón izquierdo:")
        self.entry_pin_bt1 = tk.Entry(frame_content)
        self.lb_pin_bt2 = tk.Label(frame_content, text="Pin botón derecho:")
        self.entry_pin_bt2 = tk.Entry(frame_content)
        self.lb_pin_joystick = tk.Label(frame_content, text="Pin botón Joystick:")
        self.entry_pin_joystick = tk.Entry(frame_content)
        self.lb_pin_joystick_x = tk.Label(frame_content, text="Pin Joystick (x):")
        self.entry_pin_joystick_x = tk.Entry(frame_content)
        self.lb_pin_joystick_y = tk.Label(frame_content, text="Pin Joystick (y):")
        self.entry_pin_joystick_y = tk.Entry(frame_content)
        self.lb_pin_aservo = tk.Label(frame_content, text="Pin Servo:")
        self.entry_pin_aservo = tk.Entry(frame_content)

        self.lb_mobile = tk.Label(frame_content, text="Robot móvil")
        self.lb_pin_servo1 = tk.Label(frame_content, text="Pin servo izquierdo:")
        self.entry_pin_se1 = tk.Entry(frame_content)
        self.lb_pin_servo2 = tk.Label(frame_content, text="Pin servo derecho:")
        self.entry_pin_se2 = tk.Entry(frame_content)
        self.lb_pin_light1 = tk.Label(frame_content, text="Pin luz mas izquierda:")
        self.entry_pin_l1 = tk.Entry(frame_content)
        self.lb_pin_light2 = tk.Label(frame_content, text="Pin luz izquierda:")
        self.entry_pin_l2 = tk.Entry(frame_content)
        self.lb_pin_light3 = tk.Label(frame_content, text="Pin luz derecha:")
        self.entry_pin_l3 = tk.Entry(frame_content)
        self.lb_pin_light4 = tk.Label(frame_content, text="Pin luz mas derecha:")
        self.entry_pin_l4 = tk.Entry(frame_content)
        self.lb_pin_sound1 = tk.Label(frame_content, text="Pin trigger:")
        self.entry_pin_so1 = tk.Entry(frame_content)
        self.lb_pin_sound2 = tk.Label(frame_content, text="Pin echo:")
        self.entry_pin_so2 = tk.Entry(frame_content)

        self.btn_accept = tk.Button(frame_buttons, text="Aceptar", command=self.commit_data)
        self.btn_cancel = tk.Button(frame_buttons, text="Cancelar", command=self.destroy)

        if robot_option == 0:
            self.show_for_mobile2()
        if robot_option == 1:
            self.show_for_mobile4()
        if robot_option == 2:
            self.show_for_actuator()

        self.btn_accept.grid(row=0, column=0, sticky="se", padx=(0, 10))
        self.btn_cancel.grid(row=0, column=1, sticky="se")

        frame_content.pack(padx=5, pady=5)
        frame_buttons.pack(anchor="se", padx=5, pady=5)

        x = (parent.winfo_x() + (parent.winfo_width() / 2)) - (self.winfo_reqwidth() / 2)
        y = (parent.winfo_y() + (parent.winfo_height() / 2)) - (self.winfo_reqheight() / 2)
        self.geometry("+%d+%d" %(x, y))
        self.resizable(False, False)

    def commit_data(self):
        robot = self.application.robot_layer.robot
        pin_data = {}
        if 'servo_left' in self.data:
            value = self.entry_pin_se1.get()
            if self.data['servo_left'] != value:
                pin_data['servo_left'] = value
        if 'servo_right' in self.data:
            value = self.entry_pin_se2.get()
            if self.data['servo_right'] != value:
                pin_data['servo_right'] = value
        if 'light_mleft' in self.data:
            value = self.entry_pin_l1.get()
            if self.data['light_mleft'] != value:
                pin_data['light_mleft'] = value
        if 'light_left' in self.data:
            value = self.entry_pin_l2.get()
            if self.data['light_left'] != value:
                pin_data['light_left'] = value
        if 'light_right' in self.data:
            value = self.entry_pin_l3.get()
            if self.data['light_right'] != value:
                pin_data['light_right'] = value
        if 'light_mright' in self.data:
            value = self.entry_pin_l4.get()
            if self.data['light_mright'] != value:
                pin_data['light_mright'] = value
        if 'sound_trig' in self.data:
            value = self.entry_pin_so1.get()
            if self.data['sound_trig'] != value:
                pin_data['sound_trig'] = value
        if 'sound_echo' in self.data:
            value = self.entry_pin_so2.get()
            if self.data['sound_echo'] != value:
                pin_data['sound_echo'] = value
        if 'button_left' in self.data:
            value = self.entry_pin_bt1.get()
            if self.data['button_left'] != value:
                pin_data['button_left'] = value
        if 'button_right' in self.data:
            value = self.entry_pin_bt2.get()
            if self.data['button_right'] != value:
                pin_data['button_right'] = value
        if 'servo' in self.data:
            value = self.entry_pin_aservo.get()
            if self.data['servo'] != value:
                pin_data['servo'] = value
        if 'button_joystick' in self.data:
            value = self.entry_pin_joystick.get()
            if self.data['button_joystick'] != value:
                pin_data['button_joystick'] = value
        if 'joystick_x' in self.data:
            value = self.entry_pin_joystick_x.get()
            if self.data['joystick_x'] != value:
                pin_data['joystick_x'] = value
        if 'joystick_y' in self.data:
            value = self.entry_pin_joystick_y.get()
            if self.data['joystick_y'] != value:
                pin_data['joystick_y'] = value
        self.destroy()

    def show_for_mobile2(self):
        """
        Shows the window with the components needed to
        configure the mobile robot which has 2 light sensors
        """
        robot = self.application.robot_layer.robot
        self.data = {
            "servo_left": robot.servo_left.pin,
            "servo_right": robot.servo_right.pin,
            "light_left": robot.light_sensors[0].pin,
            "light_right": robot.light_sensors[1].pin,
            "sound_trig": robot.sound.pin_trig,
            "sound_echo": robot.sound.pin_echo
        }

        self.lb_mobile.grid(row=0, column=0, sticky="w")
        self.lb_pin_servo1.grid(row=1, column=0, sticky="w")
        self.entry_pin_se1.grid(row=1, column=1, sticky="w", padx=5)
        self.lb_pin_servo2.grid(row=1, column=2, sticky="w")
        self.entry_pin_se2.grid(row=1, column=3, sticky="w", padx=5)
        self.lb_pin_light2.grid(row=2, column=0, sticky="w")
        self.entry_pin_l2.grid(row=2, column=1, sticky="w", padx=5)
        self.lb_pin_light3.grid(row=2, column=2, sticky="w")
        self.entry_pin_l3.grid(row=2, column=3, sticky="w", padx=5)
        self.lb_pin_sound1.grid(row=4, column=0, sticky="w")
        self.entry_pin_so1.grid(row=4, column=1, sticky="w", padx=5)
        self.lb_pin_sound2.grid(row=4, column=2, sticky="w")
        self.entry_pin_so2.grid(row=4, column=3, sticky="w", padx=5)
        
        self.entry_pin_se1.insert(tk.END, self.data["servo_left"])
        self.entry_pin_se2.insert(tk.END, self.data["servo_right"])
        self.entry_pin_l2.insert(tk.END, self.data["light_left"])
        self.entry_pin_l3.insert(tk.END, self.data["light_right"])
        self.entry_pin_so1.insert(tk.END, self.data["sound_trig"])
        self.entry_pin_so2.insert(tk.END, self.data["sound_echo"])

    def show_for_mobile4(self):
        """
        Shows the window with the components needed to
        configure the mobile robot which has 4 light sensors
        """
        robot = self.application.robot_layer.robot
        self.data = {
            "servo_left": robot.servo_left.pin,
            "servo_right": robot.servo_right.pin,
            "light_mleft": robot.light_sensors[0].pin,
            "light_left": robot.light_sensors[1].pin,
            "light_right": robot.light_sensors[2].pin,
            "light_mright": robot.light_sensors[3].pin,
            "sound_trig": robot.sound.pin_trig,
            "sound_echo": robot.sound.pin_echo
        }

        self.lb_mobile.grid(row=0, column=0, sticky="w")
        self.lb_pin_servo1.grid(row=1, column=0, sticky="w")
        self.entry_pin_se1.grid(row=1, column=1, sticky="w", padx=5)
        self.lb_pin_servo2.grid(row=1, column=2, sticky="w")
        self.entry_pin_se2.grid(row=1, column=3, sticky="w", padx=5)
        self.lb_pin_light2.grid(row=2, column=0, sticky="w")
        self.entry_pin_l2.grid(row=2, column=1, sticky="w", padx=5)
        self.lb_pin_light3.grid(row=2, column=2, sticky="w")
        self.entry_pin_l3.grid(row=2, column=3, sticky="w", padx=5)
        self.lb_pin_light1.grid(row=3, column=0, sticky="w")
        self.entry_pin_l1.grid(row=3, column=1, sticky="w", padx=5)
        self.lb_pin_light4.grid(row=3, column=2, sticky="w")
        self.entry_pin_l4.grid(row=3, column=3, sticky="w", padx=5)
        self.lb_pin_sound1.grid(row=4, column=0, sticky="w")
        self.entry_pin_so1.grid(row=4, column=1, sticky="w", padx=5)
        self.lb_pin_sound2.grid(row=4, column=2, sticky="w")
        self.entry_pin_so2.grid(row=4, column=3, sticky="w", padx=5)

        self.entry_pin_se1.insert(tk.END, self.data["servo_left"])
        self.entry_pin_se2.insert(tk.END, self.data["servo_right"])
        self.entry_pin_l1.insert(tk.END, self.data["light_mleft"])
        self.entry_pin_l2.insert(tk.END, self.data["light_left"])
        self.entry_pin_l3.insert(tk.END, self.data["light_right"])
        self.entry_pin_l4.insert(tk.END, self.data["light_mright"])
        self.entry_pin_so1.insert(tk.END, self.data["sound_trig"])
        self.entry_pin_so2.insert(tk.END, self.data["sound_echo"])

    def show_for_actuator(self):
        """
        Shows the window with the components needed to
        configure the actuator
        """
        robot = self.application.robot_layer.robot
        self.data = {
            "button_left": robot.button_left.pin,
            "button_right": robot.button_right.pin,
            "servo": robot.servo.pin,
            "button_joystick": robot.joystick.pinb,
            "joystick_x": robot.joystick.pinx,
            "joystick_y": robot.joystick.piny
        }

        self.lb_actuator.grid(row=0, column=0, sticky="w")
        self.lb_pin_bt1.grid(row=1, column=0, sticky="w")
        self.entry_pin_bt1.grid(row=1, column=1, sticky="w", padx=5)
        self.lb_pin_bt2.grid(row=1, column=2, sticky="w")
        self.entry_pin_bt2.grid(row=1, column=3, sticky="w", padx=5)
        self.lb_pin_joystick.grid(row=2, column=0, sticky="w")
        self.entry_pin_joystick.grid(row=2, column=1, sticky="w", padx=5)
        self.lb_pin_aservo.grid(row=2, column=2, sticky="w")
        self.entry_pin_aservo.grid(row=2, column=3, sticky="w", padx=5)
        self.lb_pin_joystick_x.grid(row=3, column=0, sticky="w")
        self.entry_pin_joystick_x.grid(row=3, column=1, sticky="w", padx=5)
        self.lb_pin_joystick_y.grid(row=3, column=2, sticky="w")
        self.entry_pin_joystick_y.grid(row=3, column=3, sticky="w", padx=5)

        self.entry_pin_bt1.insert(tk.END, self.data["button_left"])
        self.entry_pin_bt2.insert(tk.END, self.data["button_right"])
        self.entry_pin_joystick.insert(tk.END, self.data["button_joystick"])
        self.entry_pin_aservo.insert(tk.END, self.data["servo"])
        self.entry_pin_joystick_x.insert(tk.END, self.data["joystick_x"])
        self.entry_pin_joystick_y.insert(tk.END, self.data["joystick_y"])


class MenuBar(tk.Menu):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Menu.__init__(self, parent, *args, **kwargs)

        self.add_cascade(label="Archivo")

        self.add_cascade(label="Editar")

        conf_menu = tk.Menu(self, tearoff=0)
        conf_menu.add_command(label="Configurar pines", command=application.open_pin_configuration)
        self.add_cascade(label="Configurar", menu=conf_menu)

        self.add_cascade(label="Ver")

        self.add_cascade(label="Ayuda")


class DrawingFrame(tk.Frame):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.application = application
        self.__load_images()

        self.hud_canvas = tk.Canvas(self, height=100, bg=DARK_BLUE, highlightthickness=1, highlightbackground="black")

        self.canvas_frame = tk.Frame(self, bg=BLUE)
        self.canvas = tk.Canvas(self.canvas_frame, bg="white", bd=1,
                                relief=tk.SOLID, highlightthickness=0)
        self.joystick_frame = JoystickFrame(self.canvas_frame, application, bg=DARK_BLUE, highlightthickness=1, highlightbackground="black")

        self.bottom_frame = tk.Frame(self, bg=BLUE)
        self.key_movement = tk.Checkbutton(self.bottom_frame, text="Movimiento con el teclado", fg="white", font=("Consolas", 12),
                                          bg=BLUE, activebackground=BLUE, selectcolor="black", command=application.toggle_keys)       
        self.zoom_frame = tk.Frame(self.bottom_frame, bg=BLUE)
        self.zoom_in_button = ImageButton(
            self.zoom_frame,
            {
                "blue": self.zoom_img,
                "white": self.zoom_whi_img,
                "yellow": self.zoom_yel_img
            },
            bg=BLUE,
            bd=0
        )
        self.zoom_label = tk.Label(self.zoom_frame, bg=BLUE, fg="white", font=("Consolas", 12))
        self.zoom_out_button = ImageButton(
            self.zoom_frame,
            {
                "blue": self.dezoom_img,
                "white": self.dezoom_whi_img,
                "yellow": self.dezoom_yel_img
            },
            bg=BLUE,
            bd=0
        )

        self.canvas.bind("<ButtonPress-1>", self.scroll_start)
        self.canvas.bind("<B1-Motion>", self.scroll_move)
        self.canvas.bind("<MouseWheel>", self.zoom)
        self.zoom_in_button.configure(command=self.application.zoom_in)
        self.zoom_out_button.configure(command=self.application.zoom_out)
        self.key_movement.select()

        self.zoom_in_button.grid(row=0, column=0, padx=5, pady=5)
        self.zoom_label.grid(row=0, column=1, padx=5, pady=5)
        self.zoom_out_button.grid(row=0, column=2, padx=5, pady=5)

        self.canvas.pack(fill=tk.BOTH, expand=True)

        self.key_movement.pack(anchor="w", side=tk.LEFT)
        self.zoom_frame.pack(anchor="e", side=tk.RIGHT)

        self.hud_canvas.pack(fill=tk.X, expand=False)
        self.canvas_frame.pack(fill=tk.BOTH, expand=True)
        self.bottom_frame.pack(fill=tk.X)

    def scroll_start(self, event):
        self.canvas.scan_mark(event.x, event.y)

    def scroll_move(self, event):
        self.canvas.scan_dragto(event.x, event.y, gain=1)

    def zoom(self, event):
        if event.delta == -120:
            self.application.model.zoom_out()
        elif event.delta == 120:
            self.application.model.zoom_in()

    def change_zoom_label(self, zoom_level):
        self.zoom_label.configure(text="{}%".format(zoom_level))

    def show_joystick(self):
        self.joystick_frame.pack(anchor="center", fill=tk.X)

    def hide_joystick(self):
        self.joystick_frame.pack_forget()

    def __load_images(self):
        self.zoom_img = tk.PhotoImage(file="buttons/zoom.png")
        self.zoom_whi_img = tk.PhotoImage(file="buttons/zoom_w.png")
        self.zoom_yel_img = tk.PhotoImage(file="buttons/zoom_y.png")
        self.dezoom_img = tk.PhotoImage(file="buttons/dezoom.png")
        self.dezoom_whi_img = tk.PhotoImage(file="buttons/dezoom_w.png")
        self.dezoom_yel_img = tk.PhotoImage(file="buttons/dezoom_y.png")


class JoystickFrame(tk.Frame):

    def __init__(self, parent, application: MainApplication=None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)
        self.application = application

        self.lb_joystick = tk.Label(self, text="Joystick", bg=DARK_BLUE, fg="white", font=("Consolas", 13))
        self.lb_x = tk.Label(self, text="X:", bg=DARK_BLUE, fg="white", font=("Consolas", 12))
        self.x_dir = tk.Scale(self, from_=0, to=1023, orient=tk.HORIZONTAL, bg=DARK_BLUE, fg="white", sliderrelief=tk.FLAT, highlightthickness=0)
        self.lb_y = tk.Label(self, text="Y:", bg=DARK_BLUE, fg="white", font=("Consolas", 12))
        self.y_dir = tk.Scale(self, from_=0, to=1023, orient=tk.HORIZONTAL, bg=DARK_BLUE, fg="white", sliderrelief=tk.FLAT, highlightthickness=0)
        self.j_button = tk.Button(self, text="Botón", bg=BLUE, bd=0, fg=DARK_BLUE, font=("Consolas", 13))

        self.x_dir.set(500)
        self.y_dir.set(500)

        self.x_dir.bind("<ButtonRelease-1>", self.__updatex)
        self.y_dir.bind("<ButtonRelease-1>", self.__updatey)
        self.j_button.bind("<ButtonPress>", self.__pressb)
        self.j_button.bind("<ButtonRelease>", self.__releaseb)

        self.columnconfigure(0, weight=1)
        self.columnconfigure(1, weight=1)
        self.columnconfigure(2, weight=1)
        self.columnconfigure(3, weight=1)
        self.columnconfigure(4, weight=1)
        self.columnconfigure(5, weight=1)

        self.lb_joystick.grid(row=1, column=0, padx=(0, 20))
        self.lb_x.grid(row=1, column=1, padx=(0, 5))
        self.x_dir.grid(row=1, column=2, padx=(0, 20), pady=5)
        self.lb_y.grid(row=1, column=3, padx=(0, 5))
        self.y_dir.grid(row=1, column=4, padx=(0, 20), pady=5)
        self.j_button.grid(row=1, column=5, padx=10)

    def __updatex(self, event):
        self.application.model.update_joystick('dx', self.x_dir.get())

    def __updatey(self, event):
        self.application.model.update_joystick('dy', self.y_dir.get())

    def __pressb(self, event):
        self.application.model.update_joystick('button', 1)

    def __releaseb(self, event):
        self.application.model.update_joystick('button', 0)


class EditorFrame(tk.Frame):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.text = self.TextEditor(self, bd=1, relief=tk.SOLID, wrap="none", font=("consolas", 12))
        self.line_bar = self.LineNumberBar(self, width=30, bg=BLUE, bd=0, highlightthickness=0)
        self.sb_x = tk.Scrollbar(self, orient=tk.HORIZONTAL,
                                 command=self.text.xview)
        self.sb_y = tk.Scrollbar(self, orient=tk.VERTICAL,
                                 command=self.text.yview)

        self.text.insert(tk.END, "La zona del código\n")
        self.text.insert(tk.END, "La zona del código\n")
        self.text.insert(tk.END, "La zona del código")
        self.line_bar.attach(self.text)
        self.text.config(xscrollcommand=self.sb_x.set,
                         yscrollcommand=self.sb_y.set)

        self.line_bar.grid(row=0, column=0, sticky="nsw")
        self.text.grid(row=0, column=1, sticky="nsew")
        self.sb_x.grid(row=1, column=1, sticky="sew")
        self.sb_y.grid(row=0, column=2, sticky="nse")

        self.text.bind("<<Change>>", self._on_change)
        self.text.bind("<Configure>", self._on_change)

        self.rowconfigure(0, weight=1)
        self.columnconfigure(1, weight=1)

    def _on_change(self, event):
        self.line_bar.show_lines()

    class TextEditor(tk.Text):

        def __init__(self, *args, **kwargs):
            tk.Text.__init__(self, *args, **kwargs)

            self._orig = self._w + "_orig"
            self.tk.call("rename", self._w, self._orig)
            self.tk.createcommand(self._w, self._proxy)

        def _proxy(self, *args):
            result = None
            command = (self._orig,) + args
            try:
                result = self.tk.call(command)
            except Exception:
                return result

            if (args[0] in ("insert", "replace", "delete") or
                    args[0:3] == ("mark", "set", "insert") or
                    args[0:2] == ("xview", "moveto") or
                    args[0:2] == ("xview", "scroll") or
                    args[0:2] == ("yview", "moveto") or
                    args[0:2] == ("yview", "scroll")
            ):
                self.event_generate("<<Change>>", when="tail")

            return result

    class LineNumberBar(tk.Canvas):

        def __init__(self, *args, **kwargs):
            tk.Canvas.__init__(self, *args, **kwargs)
            self.editor = None

        def attach(self, editor):
            self.editor = editor

        def show_lines(self, *args):
            self.delete("all")

            i = self.editor.index("@0,0")
            while True:
                dline = self.editor.dlineinfo(i)
                if dline is None:
                    break
                line = str(i).split(".")[0]
                x = 28 - 9 * len(line)
                y = dline[1]
                self.create_text(x, y, anchor="nw", text=line, fill="white", font=('consolas', 12, 'bold'))
                i = self.editor.index("%s+1line" % i)


class ConsoleFrame(tk.Frame):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)
        self.application = application

        self.output = tk.IntVar()
        self.warning = tk.IntVar()
        self.error = tk.IntVar()

        self.console_frame = tk.Frame(self, bg=DARK_BLUE)
        self.console = tk.Text(self.console_frame, bd=1, relief=tk.SOLID, font=("consolas", 12), bg="black", fg="white")
        self.sb_y = tk.Scrollbar(self.console_frame, orient=tk.VERTICAL, command=self.console.yview)
        self.filter_frame = tk.Frame(self, bg=DARK_BLUE, padx=10)
        self.check_out = tk.Checkbutton(self.filter_frame, text="Output", fg="white", font=("Consolas", 12),
                                        bg=DARK_BLUE, activebackground=DARK_BLUE, selectcolor="black", 
                                        variable=self.output, onvalue=1, offvalue=0, 
                                        command=application.console_filter)
        self.check_warning = tk.Checkbutton(self.filter_frame, text="Warning", fg="white", font=("Consolas", 12),
                                            bg=DARK_BLUE, activebackground=DARK_BLUE, selectcolor="black",
                                            variable=self.warning, onvalue=1, offvalue=0, 
                                            command=application.console_filter)
        self.check_error = tk.Checkbutton(self.filter_frame, text="Error", fg="white", font=("Consolas", 12),
                                          bg=DARK_BLUE, activebackground=DARK_BLUE, selectcolor="black", 
                                          variable=self.error, onvalue=1, offvalue=0, 
                                          command=application.console_filter)
        self.input_frame = tk.Frame(self, bg=DARK_BLUE)
        self.input_entry = tk.Entry(self.input_frame, bd=1, relief=tk.SOLID, bg="black", insertbackground="white", fg="white", font=("Consolas", 12))
        self.input_button = tk.Button(self.input_frame, bd=0, bg=BLUE, fg=DARK_BLUE, text="Enviar", font=("Consolas", 12), command=self.__send_input)

        self.console.config(state=tk.DISABLED, yscrollcommand=self.sb_y.set)
        self.check_out.select()
        self.check_warning.select()
        self.check_error.select()

        self.check_out.grid(column=0, row=0)
        self.check_warning.grid(column=0, row=1)
        self.check_error.grid(column=0, row=2)

        self.input_button.pack(side=tk.RIGHT, padx=(5, 0))
        self.input_entry.pack(fill=tk.X, expand=True)

        self.sb_y.pack(fill=tk.Y, side=tk.RIGHT)
        self.console.pack(fill=tk.BOTH, expand=True)

        self.filter_frame.pack(side=tk.RIGHT)
        self.input_frame.pack(fill=tk.X, side=tk.BOTTOM, expand=True, pady=5)
        self.console_frame.pack(fill=tk.BOTH, expand=True)
    
    def __send_input(self):
        self.application.model.send_input(self.input_entry.get())


class ButtonBar(tk.Frame):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)
        self.application = application

        self.exec_frame = tk.Frame(self, bg=kwargs["bg"])
        self.hist_frame = tk.Frame(self, bg=kwargs["bg"])
        self.utils_frame = tk.Frame(self, bg=kwargs["bg"])
        self.tooltip_hover = tk.Label(self, bg=kwargs["bg"], font=("consolas", 12), fg="white")

        self.__load_images()

        self.execute_button = ImageButton(
            self.exec_frame,
            images=
            {
                "blue": self.exec_img,
                "white": self.exec_whi_img,
                "yellow": self.exec_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )
        self.stop_button = ImageButton(
            self.exec_frame,
            images=
            {
                "blue": self.stop_img,
                "white": self.stop_whi_img,
                "yellow": self.stop_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )
        self.undo_button = ImageButton(
            self.hist_frame,
            images=
            {
                "blue": self.undo_img,
                "white": self.undo_whi_img,
                "yellow": self.undo_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )
        self.redo_button = ImageButton(
            self.hist_frame,
            images=
            {
                "blue": self.redo_img,
                "white": self.redo_whi_img,
                "yellow": self.redo_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )
        self.save_button = ImageButton(
            self.utils_frame,
            images=
            {
                "blue": self.save_img,
                "white": self.save_whi_img,
                "yellow": self.save_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )
        self.import_button = ImageButton(
            self.utils_frame,
            images=
            {
                "blue": self.import_img,
                "white": self.import_whi_img,
                "yellow": self.import_yel_img
            },
            bg=kwargs["bg"],
            activebackground=DARK_BLUE,
            bd=0
        )

        self.execute_button.set_tooltip_text(self.tooltip_hover, "Ejecutar")
        self.stop_button.set_tooltip_text(self.tooltip_hover, "Detener")
        self.undo_button.set_tooltip_text(self.tooltip_hover, "Deshacer")
        self.redo_button.set_tooltip_text(self.tooltip_hover, "Rehacer")
        self.save_button.set_tooltip_text(self.tooltip_hover, "Guardar")
        self.import_button.set_tooltip_text(self.tooltip_hover, "Importar")

        self.execute_button.configure(command=self.execute)
        self.stop_button.configure(command=self.stop)

        self.exec_frame.grid(row=0, column=0)
        self.hist_frame.grid(row=0, column=1)
        self.utils_frame.grid(row=0, column=2)
        self.tooltip_hover.grid(row=0, column=3)

        self.execute_button.grid(row=0, column=1, padx=5, pady=5)
        self.stop_button.grid(row=0, column=2, padx=5, pady=5)
        self.undo_button.grid(row=0, column=1, padx=5, pady=5)
        self.redo_button.grid(row=0, column=2, padx=5, pady=5)
        self.save_button.grid(row=0, column=1, padx=5, pady=5)
        self.import_button.grid(row=0, column=2, padx=5, pady=5)

    def execute(self):
        self.application.execute()

    def stop(self):
        self.application.stop()

    def __load_images(self):
        self.exec_img = tk.PhotoImage(file="buttons/exec.png")
        self.exec_whi_img = tk.PhotoImage(file="buttons/exec_w.png")
        self.exec_yel_img = tk.PhotoImage(file="buttons/exec_y.png")
        self.import_img = tk.PhotoImage(file="buttons/import.png")
        self.import_whi_img = tk.PhotoImage(file="buttons/import_w.png")
        self.import_yel_img = tk.PhotoImage(file="buttons/import_y.png")
        self.redo_img = tk.PhotoImage(file="buttons/redo.png")
        self.redo_whi_img = tk.PhotoImage(file="buttons/redo_w.png")
        self.redo_yel_img = tk.PhotoImage(file="buttons/redo_y.png")
        self.save_img = tk.PhotoImage(file="buttons/save.png")
        self.save_whi_img = tk.PhotoImage(file="buttons/save_w.png")
        self.save_yel_img = tk.PhotoImage(file="buttons/save_y.png")
        self.stop_img = tk.PhotoImage(file="buttons/stop.png")
        self.stop_whi_img = tk.PhotoImage(file="buttons/stop_w.png")
        self.stop_yel_img = tk.PhotoImage(file="buttons/stop_y.png")
        self.undo_img = tk.PhotoImage(file="buttons/undo.png")
        self.undo_whi_img = tk.PhotoImage(file="buttons/undo_w.png")
        self.undo_yel_img = tk.PhotoImage(file="buttons/undo_y.png")


class ImageButton(tk.Button):

    def __init__(self, parent, images, *args, **kwargs):
        tk.Button.__init__(self, parent, *args, **kwargs, image=images["blue"])
        self.images = images

        self.bind("<Enter>", self.on_enter)
        self.bind("<Leave>", self.on_leave)

    def on_enter(self, event):
        event.widget['image'] = self.images["white"]
        try:
            self.label.configure(text=self.tooltip)
        except AttributeError:
            pass

    def on_leave(self, event):
        event.widget['image'] = self.images["blue"]
        try:
            self.label.configure(text="")
        except AttributeError:
            pass

    def on_click(self):  # A futuro si se quiere
        self.configure(image=self.images["yellow"])

    def set_tooltip_text(self, label: tk.Label, tooltip):
        self.label = label
        self.tooltip = tooltip


class SelectorBar(tk.Frame):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.lb_robot = tk.Label(self, text="Robot:", bg=DARK_BLUE, fg="white", font=("Consolas", 13))
        self.robot_selector = ttk.Combobox(self, state="readonly")
        self.lb_track = tk.Label(self, text="Circuito:", bg=DARK_BLUE, fg="white", font=("Consolas", 13))
        self.track_selector = ttk.Combobox(self, state="readonly")

        self.robot_selector['values'] = ["Robot móvil (2 infrarrojos)", "Robot móvil (4 infrarrojos)", "Actuador lineal"]
        self.robot_selector.current(0)
        self.track_selector['values'] = ["Circuito", "Laberinto", "Recta", "Obstáculo", "Recta y obstáculo"]
        self.track_selector.current(0)

        self.robot_selector.bind("<<ComboboxSelected>>", application.change_robot)
        self.track_selector.bind("<<ComboboxSelected>>", application.change_track)
        
        self.lb_robot.grid(row=0, column=0)
        self.robot_selector.grid(row=0, column=1, padx=(5, 15))
        self.lb_track.grid(row=0, column=2)
        self.track_selector.grid(row=0, column=3, padx=(5, 10))

    def hide_circuit_selector(self):
        if self.lb_track.winfo_ismapped():
            self.lb_track.grid_forget()
        if self.track_selector.winfo_ismapped():
            self.track_selector.grid_forget()

    def recover_circuit_selector(self):
        if not self.lb_track.winfo_ismapped():
            self.lb_track.grid(row=0, column=2)
        if not self.track_selector.winfo_ismapped():
            self.track_selector.grid(row=0, column=3, padx=(5, 10))