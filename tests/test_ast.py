import unittest

from antlr4 import *
from simulator.compiler.ArduinoLexer import ArduinoLexer
from simulator.compiler.ArduinoParser import ArduinoParser
from simulator.compiler.ast import BooleanTypeNode, CharTypeNode, DoubleTypeNode, IntTypeNode, StringTypeNode
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