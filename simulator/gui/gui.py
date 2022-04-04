from time import sleep
import tkinter as tk
from robots import MobileRobot, LinearActuator, Drawing


class MainApplication(tk.Tk):

    def __init__(self, *args, **kwargs):
        tk.Tk.__init__(self, *args, **kwargs)
        self.title("Simulador Software para Robots")
        self.geometry("1280x720")

        self.drawing = Drawing()
        self.robot = MobileRobot(self.drawing)

        self.vertical_pane = tk.PanedWindow(
            orient=tk.VERTICAL, sashpad=5, sashrelief=tk.GROOVE, bg="#006468")
        self.horizontal_pane = tk.PanedWindow(
            self.vertical_pane, orient=tk.HORIZONTAL, sashpad=5, sashrelief=tk.GROOVE, bg="#17a1a5")
        self.drawing_frame = DrawingFrame(
            self.horizontal_pane, self.drawing, bg="#17a1a5")
        self.editor_frame = EditorFrame(self.horizontal_pane, bg="#17a1a5")
        self.console_frame = ConsoleFrame(self.vertical_pane)
        self.menu_bar = MenuBar(self)
        self.button_bar = ButtonBar(self, self.robot, bg="#006468")

        self.config(menu=self.menu_bar)
        self.button_bar.pack(fill=tk.X, side="top")
        self.vertical_pane.pack(fill="both", expand=True)

        self.horizontal_pane.add(
            self.drawing_frame, stretch="first", width=500)
        self.horizontal_pane.add(self.editor_frame)
        self.vertical_pane.add(self.horizontal_pane, stretch="first")
        self.vertical_pane.add(self.console_frame, stretch="never", height=200)


class MenuBar(tk.Menu):

    def __init__(self, parent, *args, **kwargs):
        tk.Menu.__init__(self, parent, *args, **kwargs)

        self.add_cascade(label="Archivo")
        self.add_cascade(label="Editar")
        self.add_cascade(label="Ver")
        self.add_cascade(label="Ayuda")


class DrawingFrame(tk.Frame):

    def __init__(self, parent, drawing: Drawing, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.drawing = drawing

        self.canvas = tk.Canvas(self, bg="white", bd=1,
                                relief=tk.SOLID, highlightthickness=0)
        self.drawing.set_canvas(self.canvas)

        self.canvas.configure(scrollregion=(0, 0, 1000, 1000))
        self.canvas.bind("<ButtonPress-1>", self.scroll_start)
        self.canvas.bind("<B1-Motion>", self.scroll_move)
        self.canvas.bind("<MouseWheel>", self.zoom)

        self.canvas.pack(fill=tk.BOTH, expand=True)

    def scroll_start(self, event):
        self.canvas.scan_mark(event.x, event.y)

    def scroll_move(self, event):
        self.canvas.scan_dragto(event.x, event.y, gain=1)

    def zoom(self, event):
        if event.delta == -120:
            pass  # zoomout
        elif event.delta == 120:
            pass  # zoomin


class EditorFrame(tk.Frame):

    def __init__(self, parent, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.text = self.TextEditor(self, bd=1, relief=tk.SOLID, wrap="none", font=("consolas", 12))
        self.line_bar = self.LineNumberBar(self, width=30, bg="#17a1a5", bd=0, highlightthickness=0)
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

    def __init__(self, parent, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)

        self.console = tk.Text(self, bd=1, relief=tk.SOLID, font=("consolas", 12), bg="black", fg="white")
        self.console.insert(tk.END, "Esto sería la consola")
        self.console.config(state=tk.DISABLED)

        self.console.pack(fill=tk.BOTH, expand=True)


class ButtonBar(tk.Frame):

    def __init__(self, parent, robot, *args, **kwargs):
        tk.Frame.__init__(self, parent, *args, **kwargs)
        self.robot = robot

        self.exec_frame = tk.Frame(self, bg=kwargs["bg"])
        self.hist_frame = tk.Frame(self, bg=kwargs["bg"])
        self.utils_frame = tk.Frame(self, bg=kwargs["bg"])
        self.button_hover = tk.Label(self, bg=kwargs["bg"], font=("consolas", 12), fg="white")

        self.__load_images()

        self.execute_button = ImageButton(
            self.exec_frame, 
            self.button_hover,
            "Ejecutar",
            images = 
            {
                "blue": self.exec_img, 
                "white": self.exec_whi_img,
                "yellow": self.exec_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )
        self.stop_button = ImageButton(
            self.exec_frame,
            self.button_hover,
            "Detener",
            images = 
            {
                "blue": self.stop_img, 
                "white": self.stop_whi_img,
                "yellow": self.stop_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )
        self.undo_button = ImageButton(
            self.hist_frame,
            self.button_hover,
            "Deshacer",
            images = 
            {
                "blue": self.undo_img, 
                "white": self.undo_whi_img,
                "yellow": self.undo_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )
        self.redo_button = ImageButton(
            self.hist_frame, 
            self.button_hover,
            "Rehacer",
            images = 
            {
                "blue": self.redo_img, 
                "white": self.redo_whi_img,
                "yellow": self.redo_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )
        self.save_button = ImageButton(
            self.utils_frame,
            self.button_hover,
            "Guardar",
            images = 
            {
                "blue": self.save_img, 
                "white": self.save_whi_img,
                "yellow": self.save_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )
        self.import_button = ImageButton(
            self.utils_frame, 
            self.button_hover,
            "Importar",
            images = 
            {
                "blue": self.import_img, 
                "white": self.import_whi_img,
                "yellow": self.import_yel_img
            }, 
            bg=kwargs["bg"], 
            bd=0
        )

        self.execute_button.configure(command=self.execute)

        self.exec_frame.grid(row=0, column=0)
        self.hist_frame.grid(row=0, column=1)
        self.utils_frame.grid(row=0, column=2)
        self.button_hover.grid(row=0, column=3)

        self.execute_button.grid(row=0, column=1, padx=5, pady=5)
        self.stop_button.grid(row=0, column=2, padx=5, pady=5)
        self.undo_button.grid(row=0, column=1, padx=5, pady=5)
        self.redo_button.grid(row=0, column=2, padx=5, pady=5)
        self.save_button.grid(row=0, column=1, padx=5, pady=5)
        self.import_button.grid(row=0, column=2, padx=5, pady=5)

    def execute(self):
        self.robot.reboot()
        self.robot.draw()

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

    def __init__(self, parent, label: tk.Label, display_text, images, *args, **kwargs):
        tk.Button.__init__(self, parent, *args, **kwargs, image=images["blue"])
        self.images = images
        self.label = label
        self.display_text = display_text

        self.bind("<Enter>", self.on_enter)
        self.bind("<Leave>", self.on_leave)

    def on_enter(self, event):
        event.widget['image'] = self.images["white"]
        self.label.configure(text=self.display_text)

    def on_leave(self, event):
        event.widget['image'] = self.images["blue"]
        self.label.configure(text="")

    def on_click(self): # A futuro si se quiere
        self.configure(image=self.images["yellow"])


def main():
    app = MainApplication()
    app.mainloop()


if __name__ == "__main__":
    main()
