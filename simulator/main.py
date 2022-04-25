from compiler import parse_grammar


def main():
    parse_grammar.parse_grammar("tests/grammar-tests/ejemploBreakContinue.txt")

if __name__ == '__main__':
    main()