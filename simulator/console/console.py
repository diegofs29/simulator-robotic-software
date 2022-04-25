from datetime import datetime


class Console:

    def __init__(self):
        """
        Constructor for console
        """
        pass

    def write_error(self, message):
        """
        Writes a message indicating an error
        Arguments:
            message: the error message to write
        """
        pass

    def write_output(self, message):
        """
        Writes a normal message, usually intended by
        the user
        Arguments:
            message: the message to write
        """
        pass


class Logger:

    def __init__(self):
        """
        Constructor for logger
        """
        date = datetime.now().strftime("%Y_%m_%d")
        file_name = "log_{}.log".format(date)
        self.f = open(file_name, "w")

    def write_log(self, m_type, extra_info, message):
        """
        Writes message to a log file
        Arguments:
            message: the message to log
        """
        current_date = datetime.now()
        line = "{} - {} - {}".format(m_type, extra_info, message)
        self.f.write(line)

    def close_log(self):
        """
        Closes the log file
        """
        self.f.write("====FIN SESION====")
        self.f.write("")
        self.f.close()


class ConsoleReportMessage:

    def __init__(self, r_type, line, column, message):
        """
        Constructor for console report message
        Arguments:
            r_type: the type of the report to do
            line: the line where the report is
            column: the column where the report is
            message: the message to report
        """
        self.r_type = r_type
        self.line = line
        self.column = column
        self.message = message


class Error(ConsoleReportMessage):

    def __init__(self, error_type, line, column, message):
        """
        Constructor for Error
        Arguments:
            error_type: the type of the error that has been done
            line: the line at which the error has been done
            column: the column at which the error has been done
            message: the message describing the error
        """
        super().__init__(error_type, line, column, message)

    def to_string(self):
        """
        Transforms the error into a human readable message
        """
        return "Error ({}): [l={}, col={}] -> {}".format(self.r_type, self.line, self.column, self.message)


class Warning(ConsoleReportMessage):

    def __init__(self, warning_type, line, column, message):
        """
        Constructor for Warning
        Arguments:
            warning_type: the type of the warning that has been done
            line: the line at which the warning has been done
            column: the column at which the warning has been done
            message: the message describing the warning
        """
        super().__init__(warning_type, line, column, message)

    def to_string(self):
        """
        Transforms the warning to a human readable message
        """
        return "Advertencia ({}) [l={}, col={}] -> {}".format(self.r_type, self.line, self.column, self.message)