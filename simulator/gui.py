import tkinter as tk


class App(tk.Tk):

    def __init__(self):
        tk.Tk.__init__(self)
        menu_bar = MenuBar(self)
        console_window = ConsoleWindow(self)
        button_bar = ButtonBar(self)

        self.title("Simulador Software para Robots")
        self.geometry("800x600")
        self.config(menu=menu_bar)
        button_bar.pack(fill=tk.X, side="top", padx=5)   
        console_window.pack(fill="both", expand=True, padx=5, pady=5)


class ConsoleWindow(tk.PanedWindow):

    def __init__(self, parent):
        tk.PanedWindow.__init__(self, parent, orient="vertical", sashpad=4, sashrelief="groove")
        console = tk.Text(parent, bd=1, relief=tk.SOLID)
        console.insert(tk.END, "Esto sería la consola")
        console.config(state=tk.DISABLED)

        editor_window = EditorWindow(self)

        self.add(editor_window, stretch="first", minsize=400)
        self.add(console, stretch="never")

        
class EditorWindow(tk.PanedWindow):

    def __init__(self, parent):
        tk.PanedWindow.__init__(self, parent, orient="horizontal", sashpad=5, sashrelief="groove")

        drawing = tk.Canvas(parent, bg="white", bd=1, relief=tk.SOLID, highlightthickness=0)
        
        editor = tk.Frame(self)
        editor_frame = Editor(editor)
        editor_frame.grid(columnspan=2, rowspan=2, sticky="nsew")
        editor.rowconfigure(0, weight=1)
        editor.columnconfigure(0, weight=1)

        self.add(drawing, stretch="first", minsize=300)
        self.add(editor, stretch="always", minsize=300)


class Editor(tk.Frame):

    def __init__(self, parent):
        tk.Frame.__init__(self, parent)

        text = tk.Text(parent, bd=1, relief=tk.SOLID, wrap="none")
        text.insert(tk.END, "La zona del código")

        sb_x = tk.Scrollbar(parent, orient=tk.VERTICAL, command=text.yview)
        sb_y = tk.Scrollbar(parent, orient=tk.HORIZONTAL, command=text.xview)
        text.config(yscrollcommand=sb_x.set, xscrollcommand=sb_y.set)

        text.grid(row=0, column=0, sticky="nsew")
        sb_x.grid(row=0, column=1, sticky="nse")
        sb_y.grid(row=1, sticky="sew")
        self.grid(rowspan=2, columnspan=2, sticky="nsew")


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