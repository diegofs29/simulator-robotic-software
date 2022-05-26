"""
String library from arduino. More details at:
https://www.arduino.cc/reference/en/language/variables/data-types/stringobject/
"""


OK = 0
ERROR = -1
NOT_IMPL_WARNING = -2

def get_name():
    return "String"


def get_methods():
    """
    Returns the methods of the library as a dict, whose
    key is the naming in Arduino and whose value is the
    corresponding method.
    Returns:
        A dict with the methods
    """
    methods = {}
    methods["charAt"] = ("char", "char_at", ["int"])
    methods["compareTo"] = ("int", "compare_to", ["string"])
    methods["concat"] = ("string", "concat", ["any"])
    methods["c_str"] = ("string", "c_str", [])
    methods["endsWith"] = ("bool", "ends_with", ["string"])
    methods["equals"] = ("bool", "equals", ["string"])
    methods["equalsIgnoreCase"] = ("bool", "equals_ignore_case", ["string"])
    methods["getBytes"] = ("byte", "get_bytes", [])
    methods["indexOf"] = ("int", "index_of", ["char", "(int)"])
    methods["lastIndexOf"] = ("int", "last_index_of", ["char", "(int)"])
    methods["length"] = ("int", "length", [])
    methods["remove"] = ("string", "remove", ["int", "(int)"])
    methods["replace"] = ("string", "replace", ["string", "string"])
    methods["reserve"] = ("void", "reserve", [])
    methods["setCharAt"] = ("string", "set_char_at", ["int", "char"])
    methods["startsWith"] = ("bool", "starts_with", ["string"])
    methods["substring"] = ("string", "substring", ["int", "int"])
    methods["toCharArray"] = ("char", "to_char_array", ["char", "int"])
    methods["toDouble"] = ("double", "to_double", [])
    methods["toInt"] = ("int", "to_int", [])
    methods["toFloat"] = ("float", "to_float", [])
    methods["toLowerCase"] = ("string", "to_lower_case", [])
    methods["toUpperCase"] = ("string", "to_upper_case", [])
    methods["trim"] = ("string", "trim", [])


def char_at(string, n):
    """
    Access a particular character of the string
    Arguments:
        string: the string to access
        n: the index to access
    """
    return string[n]


def compare_to(string1, string2):
    """
    Compares two Strings, testing whether one comes 
    before or after the other, or whether they’re equal. 
    The strings are compared character by character, 
    using the ASCII values
    Arguments:

    """
    if string1 < string2:
        return -1
    elif string1 == string2:
        return 0
    else:
        return 1


def concat(string, param):
    """
    Appends the parameter to a string
    Arguments:
        string: the string to append into
        param: the value to add (allowed string, char, byte, int,
        uint, long, ulong, float and double)
    """
    return str(string) + str(param)


def c_str(string):
    """
    Converts the contents of a String as a C-style, null-terminated string
    Arguments;
        string: the string to convert
    """
    return string + '\0'


def ends_with(string1, string2):
    """
    Tests wether or not string1 ends with the characters of
    string2
    Arguments:
        string1: the full string
        string2: the end characters to check
    """
    len_str2 = len(string2)
    return string1[-len_str2:] == string2


def equals(string1, string2):
    """
    Compares string1 with string2 for equality
    Arguments:
        string1: a string
        string2: a string
    """
    return string1 == string2


def equals_ignore_case(string1, string2):
    """
    Compares string1 with string2 for equality ignoring case
    sentitivity
    Arguments:
        string1: a string
        string2: a string
    """
    return str(string1).lower() == str(string2).lower()


def get_bytes(string):
    """
    Copies the String’s characters to the supplied buffer.
    Arguments:
        string: a variable of type String.
    """
    return bytes(string, 'UTF-8')


def index_of(string, val, from_c=0):
    """
    Locates a character or String within another String. By default, 
    searches from the beginning of the String, but can also start 
    from a given index, allowing for the locating of all instances 
    of the character or String.
    Arguments:
        string: a string
        val: the value to search for (char)
        from_c: the index of start
    """
    str_temp = string[from_c:]
    return str(str_temp).find(val)


def last_index_of(string, val, from_c=-1):
    """
    Locates a character or String within another String. By default, 
    searches from the end of the String, but can also work backwards 
    from a given index, allowing for the locating of all instances 
    of the character or String.
    Arguments:
        string: a string
        val: the value to search for (char)
        from_c: the index of start (backwards from)
    """
    str_temp = string[:from_c]
    return str(str_temp)[::-1].find(val)


def length(string):
    """
    Returns the length of a given string
    Arguments:
        string: a string
    """
    return len(string)


def remove(string, index, count=-1):
    """
    Modify in place a String removing chars from the provided 
    index to the end of the String or from the provided index 
    to index plus count.
    Arguments:
        string: a string
        index: the position of start (0-indexed)
        count: number of characters to remove
    """
    str_1 = string[:index]
    str_2 = ""
    if count != -1:
        str_2 = string[count:]
    return str(str_1) + str(str_2)


def replace(string, substring1, substring2):
    """
    Replaces all instances of a given character with another character. 
    You can also use replace to replace substrings of a String 
    with a different substring.
    Arguments:
        string: a string
        substring1: a string to be replaced
        substring2: a string to replace
    """
    return str(string).replace(substring1, substring2)


def reserve():
    """
    Not needed. Not implemented
    """
    return NOT_IMPL_WARNING


def set_char_at(string, index, c):
    """
    Sets a character of the String.
    Arguments:
        string: a string
        index: the index to set the char at
        c: the char to set
    """
    return string[index:] + c + string[index+1:]


def starts_with(string1, string2):
    """
    Check wether a string starts with the characters of another
    string
    Arguments:
        string1: a string
        string2: a string
    """
    len_str2 = len(string2)
    substr = string1[:len_str2]
    return substr == string2


def substring(string, from_c, to_c=-1):
    """
    Creates a substring [from_c, to_c)
    Arguments:
        string: a string
        from_c: inclusive start index
        to_c: exclusive end index
    """
    return string[from_c: to_c] if to_c != -1 else string[from_c:]


def to_char_array(string):
    """
    Copies the String’s characters to the supplied buffer.
    """
    return list(string)


def to_double(string):
    """
    Parses string to double
    """
    try:
        return float(string)
    except ValueError:
        return 0.0


def to_int(string):
    """
    Parses string to int
    """
    try:
        return int(string)
    except ValueError:
        return 0


def to_float(string):
    """
    Parses string to float
    """
    try:
        return float(string)
    except ValueError:
        return 0.0


def to_lower_case(string):
    """
    Converts string to lower case
    """
    return str(string).lower()


def to_upper_case(string):
    """
    Converts string to upper case
    """
    return str(string).upper()


def trim(string):
    """
    Deletes leading and trailing whitespaces from string
    """
    return str(string).strip()
