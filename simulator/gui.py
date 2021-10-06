from tkinter import *


class App(Tk):

    def __init__(self):
        Tk.__init__(self)
        menu_bar = MenuBar(self)
        console_window = ConsoleWindow(self)
        button_bar = ButtonBar(self)

        self.title("Simulador Software para Robots")
        self.geometry("800x600")
        self.config(menu=menu_bar)
        button_bar.pack(fill=X, side="top", padx=5)   
        console_window.pack(fill="both", expand=True, padx=5, pady=5)


class ConsoleWindow(PanedWindow):

    def __init__(self, parent):
        PanedWindow.__init__(self, parent, orient="vertical")
        console = Text(parent, bd=1, relief=SOLID)
        console.insert(END, "Esto sería la consola")
        console.config(state=DISABLED)

        editor_window = EditorWindow(self)

        self.add(editor_window)
        self.add(console)
        
        
class EditorWindow(PanedWindow):

    def __init__(self, parent):
        PanedWindow.__init__(self, parent, orient="horizontal")

        editor = Text(parent, bd=1, relief=SOLID)
        editor.insert(END, "La zona del código")
        drawing = Canvas(parent, bg="white", bd=1, relief=SOLID)

        self.add(drawing)
        self.add(editor)


class MenuBar(Menu):
    
    def __init__(self, parent):
        Menu.__init__(self, parent)

        self.add_cascade(label="Archivo")
        self.add_cascade(label="Editar")
        self.add_cascade(label="Ver")
        self.add_cascade(label="Ayuda")


class ButtonBar(Frame):

    def __init__(self, parent):
        Frame.__init__(self, parent)

        exec_frame = ExecutionFrame(self)
        hist_frame = HistoryFrame(self)
        utils_frame = UtilitiesFrame(self)

        exec_frame.grid(row=0, column=0)
        hist_frame.grid(row=0, column=1)
        utils_frame.grid(row=0, column=2)

        
class ExecutionFrame(Frame):

    def __init__(self, parent):
        Frame.__init__(self, parent)

        execute_button = Button(self)
        stop_button = Button(self)

        execute_button.grid(row=0, column=1, padx=5, pady=5)
        stop_button.grid(row=0, column=2, padx=5, pady=5)


class HistoryFrame(Frame):

    def __init__(self, parent):
        Frame.__init__(self, parent)

        undo_button = Button(self)
        redo_button = Button(self)
        undo_button.grid(row=0, column=1, padx=5, pady=5)
        redo_button.grid(row=0, column=2, padx=5, pady=5)


class UtilitiesFrame(Frame):

    def __init__(self, parent):
        Frame.__init__(self, parent)

        save_button = Button(self)
        note_button = Button(self)
        hide_notes_button = Button(self)
        save_button.grid(row=0, column=1, padx=5, pady=5)
        note_button.grid(row=0, column=2, padx=5, pady=5)
        hide_notes_button.grid(row=0, column=3, padx=5, pady=5)
        

def main():
    app = App()
    app.mainloop()
    

if __name__ == "__main__":
    main()