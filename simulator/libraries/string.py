"""
String library from arduino. More details at:
https://www.arduino.cc/reference/en/language/variables/data-types/stringobject/
"""


OK = 0
ERROR = -1
NOT_IMPL_WARNING = -2

def charAt(string, n):
    """
    Access a particular character of the string
    Arguments:
        string: the string to access
        n: the index to access
    """
    return string[n]


def compareTo(string1, string2):
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


def endsWith(string1, string2):
    """
    Tests wether or not string1 ends with the characters of
    string2
    Arguments:
        string1: the full string
        string2: the end characters to check
    """
    len_str2 = len(string2)
    return string1[-len_str2:]


def equals(string1, string2):
    """
    Compares string1 with string2 for equality
    Arguments:
        string1: a string
        string2: a string
    """
    return string1 == string2


def equalsIgnoreCase(string1, string2):
    """
    Compares string1 with string2 for equality ignoring case
    sentitivity
    Arguments:
        string1: a string
        string2: a string
    """
    return str(string1).lower() == str(string2).lower()


def getBytes():
    """
    Not needed, not implemented
    """
    return NOT_IMPL_WARNING


def indexOf(string, val, from_c=0):
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


def lastIndexOf(string, val, from_c=-1):
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


def remove(string, index, count=1):
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


def setCharAt(string, index, c):
    """
    Sets a character of the String.
    Arguments:
        string: a string
        index: the index to set the char at
        c: the char to set
    """
    return string[index:] + c + string[index+1:]


def startsWith(string1, string2):
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


def toCharArray():
    """
    Not needed. Not implemented
    """
    return NOT_IMPL_WARNING


def toDouble():
    """
    Not needed. Not implemented
    """
    return NOT_IMPL_WARNING


def toInt():
    """
    Not needed. Not implemented
    """
    return NOT_IMPL_WARNING


def toFloat():
    """
    Not needed. Not implemented
    """
    return NOT_IMPL_WARNING


def toLowerCase(string):
    """
    Converts string to lower case
    """
    return str(string).lower()


def toUpperCase(string):
    """
    Converts string to upper case
    """
    return str(string).upper()


def trim(string):
    """
    Deletes leading and trailing whitespaces from string
    """
    return str(string).strip()
