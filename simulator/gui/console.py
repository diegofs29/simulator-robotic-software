import logging
from datetime import datetime
import tkinter as tk


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

    def to_string(self):
        pass


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


class Console:

    def __init__(self, text_widget: tk.Text):
        """
        Constructor for console
        """
        self.text_widget = text_widget
        self.logger = Logger()
        self.messages = []

        self.text_widget.tag_config('info', foreground='white')
        self.text_widget.tag_config('warning', foreground='yellow')
        self.text_widget.tag_config('error', foreground='red')

        err = Error("prueba error", 1, 10, "error errorado")
        war = Warning("prueba advertencia", 2, 15, "advertencia advertida")
        self.write_output("informacion informada\n")
        self.write_error(err)
        self.write_warning(war)
        self.write_output("informacion informada\n")
        self.write_error(err)
        self.write_warning(war)
        self.write_output("informacion informada\n")
        self.write_error(err)
        self.write_warning(war)
        self.write_output("informacion informada\n")
        self.write_error(err)
        self.write_warning(war)
        self.write_output("informacion informada\n")
        self.write_error(err)
        self.write_warning(war)

    def write_output(self, message):
        """
        Writes a normal message, usually intended by
        the user
        Arguments:
            message: the message to write
        """
        m_type = 'info'
        self.text_widget.config(state=tk.NORMAL)
        self.text_widget.insert(tk.END, message, 'info')
        self.text_widget.config(state=tk.DISABLED)
        self.logger.write_log(m_type, message)
        self.messages.append((m_type, message))

    def write_error(self, error_msg: Error):
        """
        Writes a message indicating an error
        Arguments:
            error_msg: the error to write
        """
        message = error_msg.to_string()
        m_type = 'error'
        self.__insert_text(message, m_type)
        self.logger.write_log(m_type, message)
        self.messages.append((m_type, error_msg.to_string()))

        
    def write_warning(self, warning_msg: Warning):
        """
        Writes a message indicating a warning
        Arguments:
            warning_msg: the error to write
        """
        message = warning_msg.to_string()
        m_type = 'warning'
        self.__insert_text(message, m_type)
        self.logger.write_log(m_type, message)
        self.messages.append((m_type, warning_msg.to_string()))

    def filter_messages(self, *msg_types):
        """
        Filters messages by type(s)
        Arguments:
            msg_types: the type(s) of the message(s) to be
            displayed
        """
        self.text_widget.config(state=tk.NORMAL)
        self.text_widget.delete('1.0', tk.END)
        for m in self.messages:
            if m[0] in msg_types:
                self.__insert_text(m[1], m[0])
        self.text_widget.config(state=tk.DISABLED)
            

    def __insert_text(self, message, tag='info'):
        """
        Inserts some text into the text_widget
        Arguments:
            message: the message to insert into the widget
            tag: the tag for the color of the text
        """
        self.text_widget.config(state=tk.NORMAL)
        self.text_widget.insert(tk.END, message + "\n", tag)
        self.text_widget.config(state=tk.DISABLED)


class Logger:

    def __init__(self):
        """
        Constructor for logger
        """
        date = datetime.now().strftime("%d-%m-%Y")
        file_name = 'logs/log_{}.log'.format(date)
        logging.basicConfig(filename=file_name, encoding='utf-8', level=logging.DEBUG, format='%(asctime)s - %(levelname)s: %(message)s')
        logging.info("Started simulator session")

    def write_log(self, m_type, message):
        """
        Writes message to a log file
        Arguments:
            m_type: the type of logging message (debug, info, warning,
            error or critical)
            message: the message to log
        """
        if m_type == "debug":
            logging.debug(message)
        elif m_type == "info":
            logging.info(message)
        elif m_type == "warning":
            logging.warning(message)
        elif m_type == "error":
            logging.error(message)
        elif m_type == "critical":
            logging.critical(message)

    def close_log(self):
        """
        Closes the log file
        """
        logging.info("Closed simulator session")