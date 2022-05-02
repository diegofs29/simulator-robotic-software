import tkinter as tk
import tkinter.ttk as ttk
import layers
import simulator.console.console as console

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
        self.robot_selector = ttk.Combobox(self.tools_frame, values=["Robot móvil", "Actuador lineal"],
                                           state="readonly")
        self.robot_selector.current(0)
        self.vertical_pane = tk.PanedWindow(
            orient=tk.VERTICAL, sashpad=5, sashrelief="solid", bg=DARK_BLUE)
        self.horizontal_pane = tk.PanedWindow(
            self.vertical_pane, orient=tk.HORIZONTAL, sashpad=5, sashrelief="solid", bg=BLUE)
        self.drawing_frame = DrawingFrame(
            self.horizontal_pane, self, bg=BLUE)
        self.editor_frame = EditorFrame(self.horizontal_pane, bg=BLUE)
        self.console_frame = ConsoleFrame(self.vertical_pane, self, bg=DARK_BLUE)

        self.robot_layer: layers.Layer = self.select_robot()
        self.configure_layer()
        self.console = console.Console(self.console_frame.console)

        self.config(menu=self.menu_bar)
        self.button_bar.pack(fill=tk.X, side="left")
        self.robot_selector.pack(side="right", padx=15)
        self.movement = {
            "w": False,
            "a": False,
            "s": False,
            "d": False
        }
        self.identifier = None

        self.tools_frame.pack(fill=tk.X)
        self.vertical_pane.pack(fill="both", expand=True)

        self.horizontal_pane.add(
            self.drawing_frame, stretch="first", width=500, minsize=100)
        self.horizontal_pane.add(self.editor_frame, minsize=100)
        self.vertical_pane.add(self.horizontal_pane, stretch="first", minsize=100)
        self.vertical_pane.add(self.console_frame, stretch="never", height=200, minsize=100)

        self.robot_selector.bind("<<ComboboxSelected>>", self.change_robot)
        self.bind("<KeyPress>", self.key_press)
        self.bind("<KeyRelease>", self.key_release)

    def open_pin_configuration(self):
        """
        Top level window to configure pins connected to the
        Arduino board
        """
        conf_win = PinConfigurationWindow(self)

    def configure_layer(self):
        self.robot_layer.set_canvas(self.drawing_frame.canvas, self.drawing_frame.hud_canvas)
        self.drawing_frame.change_zoom_label()

    def change_robot(self, event):
        self.stop_move()
        self.robot_layer = self.select_robot()
        self.configure_layer()

    def select_robot(self):
        robot = self.robot_selector.current()
        if robot == 0:
            return layers.MoblileRobotLayer()
        elif robot == 1:
            return layers.LinearActuatorLayer()
        return None

    def key_press(self, event):
        pressed_key = event.char
        if pressed_key in self.movement:
            self.movement[pressed_key] = True

    def key_release(self, event):
        pressed_key = event.char
        if pressed_key in self.movement:
            self.movement[pressed_key] = False

    def move(self):
        self.robot_layer.move(self.movement)
        self.identifier = self.after(10, self.move)

    def stop_move(self):
        self.robot_layer.stop()
        self.abort_after()

    def abort_after(self):
        if self.identifier is not None:
            self.after_cancel(self.identifier)

    def console_filter(self):
        msg_filters = []
        if self.console_frame.output.get() == 1:
            msg_filters.append('info')
        if self.console_frame.warning.get() == 1:
            msg_filters.append('warning')
        if self.console_frame.error.get() == 1:
            msg_filters.append('error')
        self.console.filter_messages(*msg_filters)


class PinConfigurationWindow(tk.Toplevel):

    def __init__(self, parent, application: MainApplication = None, *args, **kwargs):
        tk.Toplevel.__init__(self, parent, *args, **kwargs)
        
        frame_actuator = tk.Frame(self)
        lb_actuator = tk.Label(frame_actuator, text="Actuador lineal")
        lb_pin_bt1 = tk.Label(frame_actuator, text="Pin botón izquierdo:")
        self.entry_pin_bt1 = tk.Entry(frame_actuator)
        lb_pin_bt2 = tk.Label(frame_actuator, text="Pin botón derecho:")
        self.entry_pin_bt2 = tk.Entry(frame_actuator)
        lb_pin_joystick = tk.Label(frame_actuator, text="Pin Joystick:")
        self.entry_pin_joystick = tk.Entry(frame_actuator)

        lb_actuator.grid(row=0, column=0, sticky="w")
        lb_pin_bt1.grid(row=1, column=0, sticky="w")
        self.entry_pin_bt1.grid(row=1, column=1, sticky="w", padx=5)
        lb_pin_bt2.grid(row=1, column=2, sticky="w")
        self.entry_pin_bt2.grid(row=1, column=3, sticky="w", padx=5)
        lb_pin_joystick.grid(row=2, column=0, sticky="w")
        self.entry_pin_joystick.grid(row=2, column=1, sticky="w", padx=5)

        frame_mobile = tk.Frame(self)
        lb_mobile = tk.Label(frame_mobile, text="Robot móvil")
        lb_pin_servo1 = tk.Label(frame_mobile, text="Pin servo izquierdo")
        self.entry_pin_se1 = tk.Entry(frame_mobile)
        lb_pin_servo2 = tk.Label(frame_mobile, text="Pin servo derecho")
        self.entry_pin_se2 = tk.Entry(frame_mobile)
        lb_pin_light1 = tk.Label(frame_mobile, text="Pin luz mas izquierda")
        self.entry_pin_l1 = tk.Entry(frame_mobile)
        lb_pin_light2 = tk.Label(frame_mobile, text="Pin luz izquierda")
        self.entry_pin_l2 = tk.Entry(frame_mobile)
        lb_pin_light3 = tk.Label(frame_mobile, text="Pin luz derecha")
        self.entry_pin_l3 = tk.Entry(frame_mobile)
        lb_pin_light4 = tk.Label(frame_mobile, text="Pin luz mas derecha")
        self.entry_pin_l4 = tk.Entry(frame_mobile)
        lb_pin_sound1 = tk.Label(frame_actuator, text="Pin ultrasonidos izquierdo")
        self.entry_pin_so1 = tk.Entry(frame_actuator)
        lb_pin_sound2 = tk.Label(frame_actuator, text="Pin ultrasonidos derecho")
        self.entry_pin_so2 = tk.Entry(frame_actuator)

        self.entry_pin_l1.config(state=tk.DISABLED)
        self.entry_pin_l4.config(state=tk.DISABLED)
        
        lb_mobile.grid(row=0, column=0, sticky="w")
        lb_pin_servo1.grid(row=1, column=0, sticky="w")
        self.entry_pin_se1.grid(row=1, column=1, sticky="w", padx=5)
        lb_pin_servo2.grid(row=1, column=2, sticky="w")
        self.entry_pin_se2.grid(row=1, column=3, sticky="w", padx=5)
        lb_pin_light2.grid(row=2, column=0, sticky="w")
        self.entry_pin_l2.grid(row=2, column=1, sticky="w", padx=5)
        lb_pin_light3.grid(row=2, column=2, sticky="w")
        self.entry_pin_l3.grid(row=2, column=3, sticky="w", padx=5)
        lb_pin_light1.grid(row=3, column=0, sticky="w")
        self.entry_pin_l1.grid(row=3, column=1, sticky="w", padx=5)
        lb_pin_light4.grid(row=3, column=2, sticky="w")
        self.entry_pin_l4.grid(row=3, column=3, sticky="w", padx=5)
        lb_pin_sound1.grid(row=4, column=0, sticky="w")
        self.entry_pin_so1.grid(row=4, column=1, sticky="w", padx=5)
        lb_pin_sound2.grid(row=4, column=2, sticky="w")
        self.entry_pin_so2.grid(row=4, column=3, sticky="w", padx=5)

        frame_mobile.pack(anchor="nw", padx=5, pady=5)
        frame_actuator.pack(anchor="sw", padx=5, pady=5)

        x = (parent.winfo_x() + (parent.winfo_width() / 2)) - (self.winfo_reqwidth() / 2)
        y = (parent.winfo_y() + (parent.winfo_height() / 2)) - (self.winfo_reqheight() / 2)
        self.geometry("+%d+%d" %(x, y))
        self.resizable(False, False)


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

        self.canvas = tk.Canvas(self, bg="white", bd=1,
                                relief=tk.SOLID, highlightthickness=0)
        self.hud_canvas = tk.Canvas(self, height=100, bg=DARK_BLUE, highlightthickness=1, highlightbackground="black")

        self.zoom_frame = tk.Frame(self, bg=BLUE)
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
        self.zoom_label = tk.Label(self.zoom_frame, bg=BLUE, fg="white", font=("Consolas", 12))

        self.canvas.bind("<ButtonPress-1>", self.scroll_start)
        self.canvas.bind("<B1-Motion>", self.scroll_move)
        self.canvas.bind("<MouseWheel>", self.zoom)
        self.zoom_in_button.configure(command=self.zoom_in)
        self.zoom_out_button.configure(command=self.zoom_out)

        self.zoom_in_button.grid(row=0, column=0, padx=5, pady=5)
        self.zoom_label.grid(row=0, column=1, padx=5, pady=5)
        self.zoom_out_button.grid(row=0, column=2, padx=5, pady=5)

        self.hud_canvas.pack(fill=tk.X, expand=False)
        self.canvas.pack(fill=tk.BOTH, expand=True)
        self.zoom_frame.pack(anchor="e")

    def scroll_start(self, event):
        self.canvas.scan_mark(event.x, event.y)

    def scroll_move(self, event):
        self.canvas.scan_dragto(event.x, event.y, gain=1)

    def zoom(self, event):
        if event.delta == -120:
            self.zoom_out()
        elif event.delta == 120:
            self.zoom_in()

    def zoom_in(self):
        self.application.robot_layer.zoom_in()
        self.change_zoom_label()

    def zoom_out(self):
        self.application.robot_layer.zoom_out()
        self.change_zoom_label()

    def change_zoom_label(self):
        self.zoom_label.configure(text="{}%".format(self.application.robot_layer.zoom_percent))

    def __load_images(self):
        self.zoom_img = tk.PhotoImage(file="simulator/gui/buttons/zoom.png")
        self.zoom_whi_img = tk.PhotoImage(file="simulator/gui/buttons/zoom_w.png")
        self.zoom_yel_img = tk.PhotoImage(file="simulator/gui/buttons/zoom_y.png")
        self.dezoom_img = tk.PhotoImage(file="simulator/gui/buttons/dezoom.png")
        self.dezoom_whi_img = tk.PhotoImage(file="simulator/gui/buttons/dezoom_w.png")
        self.dezoom_yel_img = tk.PhotoImage(file="simulator/gui/buttons/dezoom_y.png")


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
        self.input_button = tk.Button(self.input_frame, bd=0, bg=BLUE, text="Enviar", font=("Consolas", 12), command=self.__send_input)

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
        self.input_frame.pack(fill=tk.X, side=tk.BOTTOM, expand=True, pady=(5, 0))
        self.console_frame.pack(fill=tk.BOTH, expand=True)
    
    def __send_input(self):
        self.application.console.input(self.input_entry.get())


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
        self.application.abort_after()
        self.application.robot_layer.execute()
        self.application.move()

    def stop(self):
        self.application.robot_layer.stop()
        self.application.stop_move()

    def __load_images(self):
        self.exec_img = tk.PhotoImage(file="simulator/gui/buttons/exec.png")
        self.exec_whi_img = tk.PhotoImage(file="simulator/gui/buttons/exec_w.png")
        self.exec_yel_img = tk.PhotoImage(file="simulator/gui/buttons/exec_y.png")
        self.import_img = tk.PhotoImage(file="simulator/gui/buttons/import.png")
        self.import_whi_img = tk.PhotoImage(file="simulator/gui/buttons/import_w.png")
        self.import_yel_img = tk.PhotoImage(file="simulator/gui/buttons/import_y.png")
        self.redo_img = tk.PhotoImage(file="simulator/gui/buttons/redo.png")
        self.redo_whi_img = tk.PhotoImage(file="simulator/gui/buttons/redo_w.png")
        self.redo_yel_img = tk.PhotoImage(file="simulator/gui/buttons/redo_y.png")
        self.save_img = tk.PhotoImage(file="simulator/gui/buttons/save.png")
        self.save_whi_img = tk.PhotoImage(file="simulator/gui/buttons/save_w.png")
        self.save_yel_img = tk.PhotoImage(file="simulator/gui/buttons/save_y.png")
        self.stop_img = tk.PhotoImage(file="simulator/gui/buttons/stop.png")
        self.stop_whi_img = tk.PhotoImage(file="simulator/gui/buttons/stop_w.png")
        self.stop_yel_img = tk.PhotoImage(file="simulator/gui/buttons/stop_y.png")
        self.undo_img = tk.PhotoImage(file="simulator/gui/buttons/undo.png")
        self.undo_whi_img = tk.PhotoImage(file="simulator/gui/buttons/undo_w.png")
        self.undo_yel_img = tk.PhotoImage(file="simulator/gui/buttons/undo_y.png")


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


def main():
    app = MainApplication()
    app.mainloop()


if __name__ == "__main__":
    main()
