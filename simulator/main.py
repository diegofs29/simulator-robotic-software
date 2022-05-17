import simulator.gui.gui as gui
import simulator.compiler.transpiler as transpiler
import simulator.console.console as console
import simulator.robots.robots as robots
import simulator.files.files_reader as filesr

def main():
    app = gui.MainApplication()
    app.mainloop()
    """
    tra = transpiler.Compiler(con)
    rdr = filesr.RobotDataReader()
    robot_data = rdr.parse_robot(0)
    tra.transpile("examples/mobile_robot.txt", robots.MobileRobot(2, robot_data))
    """

if __name__ == '__main__':
    main()