class Console:

    def __init__(self):
        pass

    def write_error(self, message):
        pass

    def write_output(self, message):
        pass


class Logger:

    def __init__(self):
        pass

    def write_log(self, message):
        pass

    def close_log(self):
        pass


class Error:

    def __init__(self, error_type, line, column, message):
        self.error_type = error_type
        self.line = line
        self.column = column
        self.message = message

    def to_string(self):
        return "Error (" + self.error_type + "): [l=" + self.line + ", col=" + self.column + "] -> " + self.message
