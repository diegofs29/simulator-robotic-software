import unittest

from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import BooleanTypeNode, BreakNode, CharTypeNode, DefinitionNode, DoubleTypeNode, FunctionCallNode, IntTypeNode, ReturnNode, StringTypeNode, VoidTypeNode
from simulator.compiler.ast_builder_visitor import ASTBuilderVisitor


class TestBaseAST(unittest.TestCase):

    def setUp(self):
        input = FileStream(fileName=self.file, encoding="utf-8")
        lexer = ArduinoLexer(input)
        stream = CommonTokenStream(lexer)
        parser = ArduinoParser(stream)
        visitor = ASTBuilderVisitor()
        tree = parser.program()
        self.ast = visitor.visit(tree)

    def tearDown(self):
        return super().tearDown()


class TestInclude(TestBaseAST):

    file = "tests/file-tests/include.txt"

    def test_file_name(self):
        declarations = self.ast.declarations
        self.assertEqual(declarations[0].file_name, "LibreriaDelIDE.h")
        self.assertEqual(declarations[1].file_name, "ArchivoRandom.h")
        self.assertEqual(declarations[2].file_name, "EstoEsUnaLibreria.h")
        self.assertEqual(declarations[3].file_name, "iostream.h")


class TestGlobalDefinition(TestBaseAST):

    file = "tests/file-tests/g-def.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_type(self):
        self.assertTrue(
            isinstance(self.code[0].definition.type, IntTypeNode)
            , "No es del tipo int"
        )
        self.assertTrue(
            isinstance(self.code[1].definition.type, StringTypeNode)
            , "No es del tipo string"
        )
        self.assertTrue(
            isinstance(self.code[2].definition.type, DoubleTypeNode)
            , "No es del tipo double"
        )
        self.assertTrue(
            isinstance(self.code[3].definition.type, BooleanTypeNode)
            , "No es del tipo Boolean"
        )
        self.assertTrue(
            isinstance(self.code[4].definition.type, CharTypeNode)
            , "No es del tipo char"
        )
        self.assertTrue(
            isinstance(self.code[5].definition.type, CharTypeNode)
            , "No es del tipo char"
        )
        #define no prueba el tipo porque no tiene
        self.assertTrue(
            isinstance(self.code[7].definition.type, DoubleTypeNode)
            , "No es del tipo double"
        )
        #define no prueba el tipo porque no tiene
        self.assertTrue(
            isinstance(self.code[9].definition.type, StringTypeNode)
            , "No es del tipo string"
        )

    def test_var_name(self):
        self.assertEqual(self.code[0].definition.var_name, "num")
        self.assertEqual(self.code[1].definition.var_name, "saludo")
        self.assertEqual(self.code[2].definition.var_name, "notas")
        self.assertEqual(self.code[3].definition.var_name, "interruptores")
        self.assertEqual(self.code[4].definition.var_name, "iniciales")
        self.assertEqual(self.code[5].definition.var_name, "mensaje")
        self.assertEqual(self.code[6].definition.var_name, "ledPin")
        self.assertEqual(self.code[7].definition.var_name, "gravity")
        self.assertEqual(self.code[8].definition.var_name, "arrayPins")
        self.assertEqual(self.code[9].definition.var_name, "nombres")


    def test_is_constant(self):
        self.assertEqual(self.code[0].definition.is_constant, False)
        self.assertEqual(self.code[1].definition.is_constant, False)
        self.assertEqual(self.code[2].definition.is_constant, False)
        self.assertEqual(self.code[3].definition.is_constant, False)
        self.assertEqual(self.code[4].definition.is_constant, False)
        self.assertEqual(self.code[5].definition.is_constant, False)
        self.assertEqual(self.code[6].definition.is_constant, True)
        self.assertEqual(self.code[7].definition.is_constant, True)
        self.assertEqual(self.code[8].definition.is_constant, True)
        self.assertEqual(self.code[9].definition.is_constant, True)

    def test_value(self):
        self.assertEqual(self.code[0].definition.value, None)
        self.assertEqual(self.code[1].definition.value.value, "hola")
        self.assertEqual(self.code[6].definition.value.value, 4)
        self.assertEqual(self.code[7].definition.value.value, 9.8)

    def test_array_index(self):
        self.assertEqual(self.code[2].definition.size[0], 25)
        self.assertEqual(self.code[3].definition.size, [])
        self.assertEqual(self.code[4].definition.size[0], 5)
        self.assertEqual(self.code[5].definition.size[0], 10)
        self.assertEqual(self.code[8].definition.size, [])
        self.assertEqual(self.code[9].definition.size[0], 3)

    def test_array_expression(self):
        self.assertEqual(self.code[2].definition.elements, [])
        self.assertEqual(
            self.code[5].definition.elements, 
            ['T', 'r', 'a', 'e', ' ', 's', 'o', 'p', 'a']
        )

    def test_array_elements(self):
        self.assertEqual(
            list(
                map(
                    lambda elem: elem.value,
                    self.code[3].definition.elements)
                )
            , [True, False, False, True, False]
        )
        self.assertEqual(
            list(
                map(
                    lambda elem: elem.value,
                    self.code[4].definition.elements)
                )
            , ['E', 'A', 'M', 'A', 'P']
        )
        self.assertEqual(
            list(
                map(
                    lambda elem: elem.value,
                    self.code[8].definition.elements)
                )
            , [1, 3, 7, 10]
        )


class TestFunctionDefinition(TestBaseAST):
    
    file = "tests/file-tests/f-def.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_type(self):
        self.assertTrue(
            isinstance(self.code[0].function.type, VoidTypeNode),
            "El tipo no es void"
        )
        self.assertTrue(
            isinstance(self.code[1].function.type, VoidTypeNode),
            "El tipo no es void"
        )
        self.assertTrue(
            isinstance(self.code[2].function.type, IntTypeNode),
            "El tipo no es int"
        )
        self.assertTrue(
            isinstance(self.code[3].function.type, StringTypeNode),
            "El tipo no es string"
        )

    def test_name(self):
        self.assertEqual(self.code[0].function.name, "setup")
        self.assertEqual(self.code[1].function.name, "loop")
        self.assertEqual(self.code[2].function.name, "factorial")
        self.assertEqual(self.code[3].function.name, "outputPrint")

    def test_args(self):
        self.assertEqual(len(self.code[0].function.args), 0)
        self.assertEqual(
            list(
                map(
                    lambda arg: arg.var_name,
                    self.code[0].function.args
                )
            ), []
        )
        self.assertEqual(len(self.code[1].function.args), 0)
        self.assertEqual(
            list(
                map(
                    lambda arg: arg.var_name,
                    self.code[1].function.args
                )
            ), []
        )
        self.assertEqual(len(self.code[2].function.args), 1)
        self.assertEqual(
            list(
                map(
                    lambda arg: arg.var_name,
                    self.code[2].function.args
                )
            ), ["n"]
        )
        self.assertEqual(len(self.code[3].function.args), 2)
        self.assertEqual(
            list(
                map(
                    lambda arg: arg.var_name,
                    self.code[3].function.args
                )
            ), ["message", "b"]
        )

    def test_sentences(self):
        self.assertEqual(len(self.code[0].function.sentences), 0)
        self.assertEqual(len(self.code[1].function.sentences), 0)
        self.assertEqual(len(self.code[2].function.sentences), 0)
        self.assertEqual(len(self.code[3].function.sentences), 3)
        self.assertTrue(
            isinstance(
                self.code[3].function.sentences[0], DefinitionNode
            ), "No es una definicion"
        )
        self.assertTrue(
            isinstance(
                self.code[3].function.sentences[1], FunctionCallNode
            ), "No es una llamada"
        )
        self.assertTrue(
            isinstance(
                self.code[3].function.sentences[2], ReturnNode
            ), "No es un return"
        )


class TestTerminals(TestBaseAST):

    file = "tests/file-tests/terminals.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_values(self):
        self.assertEqual(self.code[0].definition.value.value, True)
        self.assertEqual(self.code[1].definition.value.value, False)
        self.assertEqual(self.code[2].definition.value.value, 10)
        self.assertEqual(self.code[3].definition.value.value, 29.29)
        self.assertEqual(self.code[4].definition.value.value, 'D')
        self.assertEqual(self.code[5].definition.value.value, "Diego")
        self.assertEqual(self.code[6].definition.value.value, "c")


class TestFunctionCall(TestBaseAST):

    file = "tests/file-tests/f-calls.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_name(self):
        self.assertEqual(self.code[0].function.sentences[0].name, "f")
        self.assertEqual(self.code[0].function.sentences[1].name, "print")
        self.assertEqual(self.code[0].function.sentences[2].name, "toUpperCase")
        self.assertEqual(self.code[0].function.sentences[3].name, "toLowerCase")
        self.assertEqual(self.code[0].function.sentences[4].name, "params")

    def test_parameters(self):
        self.assertEqual(
            len(
                self.code[0].function.sentences[0].parameters
            ), 0
        )
        self.assertEqual(
            len(
                self.code[0].function.sentences[1].parameters
            ), 1
        )
        self.assertEqual(self.code[0].function.sentences[1].parameters[0].value, "hola")
        self.assertEqual(
            len(
                self.code[0].function.sentences[2].parameters
            ), 0
        )
        self.assertEqual(
            len(
                self.code[0].function.sentences[3].parameters
            ), 0
        )
        self.assertEqual(
            len(
                self.code[0].function.sentences[4].parameters
            ), 3
        )
        self.assertEqual(
            list(
                map(
                    lambda param: param.value,
                    self.code[0].function.sentences[4].parameters
                )
            ), [1, "hola", True]
        )

    def test_clase(self):
        self.assertEqual(self.code[0].function.sentences[0].clase, None)
        self.assertEqual(self.code[0].function.sentences[1].clase, None)
        self.assertEqual(self.code[0].function.sentences[2].clase, "mensaje")
        self.assertEqual(self.code[0].function.sentences[3].clase, "persona")
        self.assertEqual(self.code[0].function.sentences[4].clase, None)

    def test_elems(self):
        self.assertEqual(self.code[0].function.sentences[0].elems, None)
        self.assertEqual(self.code[0].function.sentences[1].elems, None)
        self.assertEqual(self.code[0].function.sentences[2].elems, None)
        self.assertEqual(self.code[0].function.sentences[3].elems[0], "nombre")
        self.assertEqual(self.code[0].function.sentences[4].elems, None)


class TestConditionals(TestBaseAST):

    file = "tests/file-tests/conditionals.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_condition(self):
        condition = self.code[0].function.sentences[0].condition
        self.assertEqual(
            str(condition.left.value) 
            + condition.op 
            + str(condition.right.value)
            , "i>2"
        )
        condition = self.code[0].function.sentences[1].condition
        self.assertEqual(
            str(condition.left.value) 
            + condition.op 
            + str(condition.right.value)
            , "d<29.69"
        )
        condition = self.code[0].function.sentences[2].condition
        self.assertEqual(condition.value, True)
        self.assertEqual(
            self.code[0].function.sentences[2].else_expr[0].condition.value
            , False
        )
        self.assertEqual(
            self.code[0].function.sentences[3].expression.value
            , "var"
        )

    def test_if_expr(self):
        self.assertEqual(
            self.code[0].function.sentences[0].if_expr[0].name
            , "doThis"
        )
        self.assertEqual(
            self.code[0].function.sentences[1].if_expr[0].name
            , "doThat"
        )
        self.assertEqual(
            self.code[0].function.sentences[2].if_expr[0].name
            , "doAlgo"
        )
        self.assertEqual(
            self.code[0].function.sentences[2].else_expr[0].if_expr[0].name
            , "print"
        )

    def test_else_expr(self):
        self.assertEqual(
            self.code[0].function.sentences[1].else_expr[0].name
            , "print"
        )
        self.assertEqual(
            self.code[0].function.sentences[2].else_expr[0].if_expr[0] != None
            , True
        )
        self.assertEqual(
            self.code[0].function.sentences[2].else_expr[0].else_expr[0].name
            , "prueba"
        )

    def test_cases(self):
        cases = self.code[0].function.sentences[3].cases
        self.assertEqual(cases[0].type, "case")
        self.assertEqual(cases[0].expression.value, 1)
        self.assertEqual(cases[0].sentences[0].name, "print")
        self.assertEqual(cases[1].type, "case")
        self.assertEqual(cases[1].expression.value, 2)
        self.assertEqual(cases[1].sentences[0].name, "println")
        self.assertEqual(cases[2].type, "default")
        self.assertEqual(cases[2].expression, None)
        self.assertEqual(cases[2].sentences[0].name, "exit")


class TestBucles(TestBaseAST):

    file = "tests/file-tests/loops.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_while(self):
        condition = self.code[0].function.sentences[0].expression
        self.assertEqual(
            str(condition.left.value) 
            + condition.op 
            + str(condition.right.value)
            , "i<f"
        )
        self.assertEqual(
            list(
                map(
                    lambda sent: sent.name,
                    self.code[0].function.sentences[0].sentences
                )
            ), ["yada", "heeh"]
        )
         
    def test_do_while(self):
        condition = self.code[0].function.sentences[1].expression
        self.assertEqual(
            str(condition.left.value) 
            + condition.op 
            + str(condition.right.value)
            , "b||c"
        )
        self.assertEqual(
            list(
                map(
                    lambda sent: sent.name,
                    self.code[0].function.sentences[1].sentences
                )
            ), ["print"]
        )

    def test_for(self):
        self.assertEqual(self.code[0].function.sentences[2].assignment.var_name, "i")
        condition = self.code[0].function.sentences[2].condition
        self.assertEqual(
            str(condition.left.value) 
            + condition.op 
            + str(condition.right.value)
            , "i<100"
        )
        expression = self.code[0].function.sentences[2].expression
        self.assertEqual(
            str(expression.left.value) 
            + expression.op 
            + str(expression.right.value)
            , "i*=2"
        )
        self.assertEqual(
            list(
                map(
                    lambda sent: sent.name,
                    self.code[0].function.sentences[2].sentences
                )
            ), ["println"]
        )


class TestAsignations(TestBaseAST):

    file = "tests/file-tests/assignments.txt"

    def setUp(self):
        super().setUp()
        self.code = self.ast.code

    def test_var_name(self):
        self.assertEqual(self.code[0].function.sentences[0].var_name, "i")
        self.assertEqual(self.code[0].function.sentences[1].var_name, "i")
        self.assertEqual(self.code[0].function.sentences[2].var_name, "x")
        self.assertEqual(self.code[0].function.sentences[3].var_name, "x")

    def test_expression(self):
        self.assertEqual(self.code[0].function.sentences[1].expression.name, "analogRead")
        self.assertEqual(self.code[0].function.sentences[3].expression.value, 2000)


    def test_left(self):
        for i in range(4, len(self.code[0].function.sentences)):
            self.assertEqual(self.code[0].function.sentences[i].left.value, "x")

    def test_op(self):
        self.assertEqual(self.code[0].function.sentences[4].op, "%=")
        self.assertEqual(self.code[0].function.sentences[5].op, "&=")
        self.assertEqual(self.code[0].function.sentences[6].op, "*=")
        self.assertEqual(self.code[0].function.sentences[7].op, "+=")
        self.assertEqual(self.code[0].function.sentences[8].op, "-=")
        self.assertEqual(self.code[0].function.sentences[9].op, "/=")
        self.assertEqual(self.code[0].function.sentences[10].op, "^=")
        self.assertEqual(self.code[0].function.sentences[11].op, "|=")

    def test_right(self):
        self.assertEqual(self.code[0].function.sentences[4].right.value, 10)
        self.assertEqual(bin(self.code[0].function.sentences[5].right.value), "0b1100")
        self.assertEqual(self.code[0].function.sentences[6].right.value, 5)
        self.assertEqual(self.code[0].function.sentences[7].right.value, 200)
        self.assertEqual(self.code[0].function.sentences[8].right.value, 100)
        self.assertEqual(self.code[0].function.sentences[9].right.value, 25)
        self.assertEqual(bin(self.code[0].function.sentences[10].right.value), "0b1010")
        self.assertEqual(bin(self.code[0].function.sentences[11].right.value), "0b1001")


