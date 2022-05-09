import simulator.compiler.transpiler as transpiler
import simulator.console.console as console
import tkinter as tk


def main():
    con = console.Console(tk.Text(None))
    tra = transpiler.Compiler(con)
    tra.transpile("examples/mobile_robot.txt")

if __name__ == '__main__':
    main()