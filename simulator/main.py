from compiler import parse_grammar


def main():
    parse_grammar.parse_grammar("tests/file-tests/aritmetics.txt")

if __name__ == '__main__':
    main()