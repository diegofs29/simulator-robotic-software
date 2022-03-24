import tkinter as tk
from turtle import width


class App(tk.Tk):

    def __init__(self):
        tk.Tk.__init__(self)
        menu_bar = MenuBar(self)
        console_window = ConsoleWindow(self)
        button_bar = ButtonBar(self)

        self.title("Simulador Software para Robots")
        self.geometry("1280x720")
        self.config(menu=menu_bar)
        button_bar.pack(fill=tk.X, side="top", padx=5)
        console_window.pack(fill="both", expand=True, padx=5, pady=5)


class ConsoleWindow(tk.PanedWindow):

    def __init__(self, parent):
        tk.PanedWindow.__init__(
            self, parent, orient="vertical", sashpad=4, sashrelief="groove")
        console = tk.Text(parent, bd=1, relief=tk.SOLID)
        console.insert(tk.END, "Esto sería la consola")
        console.config(state=tk.DISABLED)

        editor_window = EditorWindow(self)

        self.add(editor_window, stretch="first", minsize=400)
        self.add(console, stretch="never")


class EditorWindow(tk.PanedWindow):

    def __init__(self, parent):
        tk.PanedWindow.__init__(
            self, parent, orient="horizontal", sashpad=5, sashrelief="groove")

        drawing = tk.Canvas(parent, bg="white", bd=1,
                            relief=tk.SOLID, highlightthickness=0)

        editor = tk.Frame(self)
        editor_frame = Editor(editor)
        editor_frame.grid(rowspan=2, columnspan=3, sticky="nsew")
        editor.rowconfigure(0, weight=1)
        editor.columnconfigure(1, weight=1)

        self.add(drawing, stretch="first", minsize=300)
        self.add(editor, stretch="always", minsize=300)


class Editor(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        self.text = TextEditor(parent, bd=1, relief=tk.SOLID, wrap="none")
        self.text.insert(tk.END, "La zona del código\n")
        self.text.insert(tk.END, "La zona del código\n")
        self.text.insert(tk.END, "La zona del código")

        self.line_bar = LineNumberBar(parent, width=30)
        self.line_bar.attach(self.text)

        self.sb_x = tk.Scrollbar(parent, orient=tk.HORIZONTAL,
                            command=self.text.xview)
        self.sb_y = tk.Scrollbar(parent, orient=tk.VERTICAL,
                            command=self.text.yview)
        self.text.config(xscrollcommand=self.sb_x.set, yscrollcommand=self.sb_y.set)

        self.line_bar.grid(row=0, column=0, sticky="nsw")
        self.text.grid(row=0, column=1, sticky="nsew")
        self.sb_x.grid(row=1, column=1, sticky="sew")
        self.sb_y.grid(row=0, column=2, sticky="nse")

        self.text.bind("<<Change>>", self._on_change)
        self.text.bind("<Configure>", self._on_change)

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
        while True :
            dline= self.editor.dlineinfo(i)
            if dline is None: break
            line = str(i).split(".")[0]
            x = 28 - 6 * len(line)
            y = dline[1]
            self.create_text(x,y,anchor="nw", text=line)
            i = self.editor.index("%s+1line" % i)


class MenuBar(tk.Menu):

    def __init__(self, parent):
        tk.Menu.__init__(self, parent)

        self.add_cascade(label="Archivo")
        self.add_cascade(label="Editar")
        self.add_cascade(label="Ver")
        self.add_cascade(label="Ayuda")


class ButtonBar(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        exec_frame = ExecutionFrame(self)
        hist_frame = HistoryFrame(self)
        utils_frame = UtilitiesFrame(self)

        exec_frame.grid(row=0, column=0)
        hist_frame.grid(row=0, column=1)
        utils_frame.grid(row=0, column=2)


class ExecutionFrame(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        execute_button = tk.Button(self, text="Ejecutar")
        stop_button = tk.Button(self, text="Parar")

        execute_button.grid(row=0, column=1, padx=5, pady=5)
        stop_button.grid(row=0, column=2, padx=5, pady=5)


class HistoryFrame(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        undo_button = tk.Button(self, text="Deshacer")
        redo_button = tk.Button(self, text="Rehacer")
        undo_button.grid(row=0, column=1, padx=5, pady=5)
        redo_button.grid(row=0, column=2, padx=5, pady=5)


class UtilitiesFrame(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        save_button = tk.Button(self, text="Guardar")
        import_button = tk.Button(self, text="Cargar")
        save_button.grid(row=0, column=1, padx=5, pady=5)
        import_button.grid(row=0, column=2, padx=5, pady=5)


def main():
    app = App()
    app.mainloop()


if __name__ == "__main__":
    main()
