// Generated from e:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\Arduino.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, BIT_SHIFT_L=73, 
		BIT_SHIFT_R=74, BINARY_CONST=75, OCTAL_CONST=76, HEX_CONST=77, INT_CONST=78, 
		FLOAT_CONST=79, CHAR_CONST=80, UNTERMINATED_CHAR=81, STRING_CONST=82, 
		UNTERMINATED_STRING=83, ID=84, LINE_COMMENT=85, MULTILINE_COMMENT=86, 
		WHITESPACE=87;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_assignment = 8, RULE_array_definition = 9, RULE_array_index = 10, 
		RULE_array_elements = 11, RULE_constant = 12, RULE_var_type = 13, RULE_function = 14, 
		RULE_function_args = 15, RULE_iteration_sentence = 16, RULE_conditional_sentence = 17, 
		RULE_code_block = 18, RULE_sentence = 19, RULE_case_sentence = 20, RULE_expression = 21, 
		RULE_incdec_expression = 22, RULE_function_call = 23, RULE_parameter = 24, 
		RULE_static_variable = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "assignment", "array_definition", 
			"array_index", "array_elements", "constant", "var_type", "function", 
			"function_args", "iteration_sentence", "conditional_sentence", "code_block", 
			"sentence", "case_sentence", "expression", "incdec_expression", "function_call", 
			"parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'.'", "';'", "'='", "'['", "']'", 
			"'const'", "'#define'", "'{'", "','", "'}'", "'bool'", "'boolean'", "'byte'", 
			"'char'", "'double'", "'float'", "'int'", "'long'", "'short'", "'size_t'", 
			"'string'", "'unsigned int'", "'unsigned char'", "'unsigned long'", "'void'", 
			"'word'", "'('", "')'", "'while'", "'do'", "'for'", "'if'", "'else'", 
			"'switch'", "'return'", "'break'", "'continue'", "'case'", "':'", "'default'", 
			"'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>='", "'<='", "'=='", 
			"'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'%='", "'&='", "'*='", 
			"'+='", "'-='", "'/='", "'^='", "'|='", "'true'", "'false'", "'++'", 
			"'--'", "'static'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "BINARY_CONST", "OCTAL_CONST", "HEX_CONST", 
			"INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", "STRING_CONST", 
			"UNTERMINATED_STRING", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Arduino.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArduinoParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program();
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> declarations = new ArrayList<DeclarationContext>();
		public Program_codeContext program_code;
		public List<Program_codeContext> code = new ArrayList<Program_codeContext>();
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<Program_codeContext> program_code() {
			return getRuleContexts(Program_codeContext.class);
		}
		public Program_codeContext program_code(int i) {
			return getRuleContext(Program_codeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(55);
				((ProgramContext)_localctx).declaration = declaration();
				((ProgramContext)_localctx).declarations.add(((ProgramContext)_localctx).declaration);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				{
				setState(61);
				((ProgramContext)_localctx).program_code = program_code();
				((ProgramContext)_localctx).code.add(((ProgramContext)_localctx).program_code);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Program_codeContext extends ParserRuleContext {
		public DefinitionContext var_def;
		public FunctionContext func_def;
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Program_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_code; }
	}

	public final Program_codeContext program_code() throws RecognitionException {
		Program_codeContext _localctx = new Program_codeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program_code);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((Program_codeContext)_localctx).var_def = definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((Program_codeContext)_localctx).func_def = function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
		public H_fileContext h_file() {
			return getRuleContext(H_fileContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__0);
				setState(74);
				match(T__1);
				setState(75);
				h_file();
				setState(76);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H_fileContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ArduinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoParser.ID, i);
		}
		public H_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h_file; }
	}

	public final H_fileContext h_file() throws RecognitionException {
		H_fileContext _localctx = new H_fileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_h_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(T__3);
			setState(82);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public Simple_definitionContext s_def;
		public Array_definitionContext a_def;
		public Assignment_definitionContext assign_def;
		public ConstantContext cte_def;
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((DefinitionContext)_localctx).s_def = simple_definition();
				setState(85);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((DefinitionContext)_localctx).a_def = array_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				((DefinitionContext)_localctx).assign_def = assignment_definition();
				setState(89);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				((DefinitionContext)_localctx).cte_def = constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_definitionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Simple_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_definition; }
	}

	public final Simple_definitionContext simple_definition() throws RecognitionException {
		Simple_definitionContext _localctx = new Simple_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simple_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((Simple_definitionContext)_localctx).v_type = var_type();
			setState(95);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_definitionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assignment_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_definition; }
	}

	public final Assignment_definitionContext assignment_definition() throws RecognitionException {
		Assignment_definitionContext _localctx = new Assignment_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((Assignment_definitionContext)_localctx).v_type = var_type();
			setState(98);
			match(ID);
			setState(99);
			match(T__5);
			setState(100);
			((Assignment_definitionContext)_localctx).val = expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);
				setState(103);
				match(T__5);
				setState(104);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
				setState(106);
				match(T__6);
				setState(107);
				match(INT_CONST);
				setState(108);
				match(T__7);
				setState(109);
				match(T__5);
				setState(110);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_definitionContext extends ParserRuleContext {
		public Token const_type;
		public Array_definitionContext c_array;
		public Array_elementsContext elems;
		public Var_typeContext v_type;
		public Array_indexContext a_index;
		public ExpressionContext expr;
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_definition; }
	}

	public final Array_definitionContext array_definition() throws RecognitionException {
		Array_definitionContext _localctx = new Array_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_array_definition);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((Array_definitionContext)_localctx).const_type = match(T__8);
				setState(114);
				((Array_definitionContext)_localctx).c_array = array_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((Array_definitionContext)_localctx).const_type = match(T__9);
				setState(116);
				match(ID);
				setState(117);
				((Array_definitionContext)_localctx).elems = array_elements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(119);
				match(ID);
				setState(120);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(121);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(124);
				match(ID);
				setState(125);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(126);
				match(T__5);
				setState(127);
				((Array_definitionContext)_localctx).elems = array_elements();
				setState(128);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(131);
				match(ID);
				setState(132);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(133);
				match(T__5);
				setState(134);
				((Array_definitionContext)_localctx).expr = expression(0);
				setState(135);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_indexContext extends ParserRuleContext {
		public Array_indexContext a_index;
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__6);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_CONST) {
				{
				setState(140);
				match(INT_CONST);
				}
			}

			setState(143);
			match(T__7);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(144);
				((Array_indexContext)_localctx).a_index = array_index();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_elementsContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> elements = new ArrayList<ExpressionContext>();
		public List<Array_elementsContext> array_elements() {
			return getRuleContexts(Array_elementsContext.class);
		}
		public Array_elementsContext array_elements(int i) {
			return getRuleContext(Array_elementsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Array_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elements; }
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_elements);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__10);
				setState(148);
				array_elements();
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					match(T__11);
					setState(150);
					array_elements();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__11 );
				setState(155);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__10);
				setState(158);
				((Array_elementsContext)_localctx).expression = expression(0);
				((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(159);
					match(T__11);
					setState(160);
					((Array_elementsContext)_localctx).expression = expression(0);
					((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token const_type;
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				((ConstantContext)_localctx).const_type = match(T__8);
				setState(171);
				((ConstantContext)_localctx).v_type = var_type();
				setState(172);
				match(ID);
				setState(173);
				match(T__5);
				setState(174);
				((ConstantContext)_localctx).val = expression(0);
				setState(175);
				match(T__4);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				((ConstantContext)_localctx).const_type = match(T__9);
				setState(178);
				match(ID);
				setState(179);
				((ConstantContext)_localctx).val = expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public Function_argsContext f_args;
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((FunctionContext)_localctx).v_type = var_type();
			setState(185);
			match(ID);
			setState(186);
			match(T__29);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				setState(187);
				((FunctionContext)_localctx).f_args = function_args();
				}
			}

			setState(190);
			match(T__30);
			setState(191);
			match(T__10);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (BINARY_CONST - 68)) | (1L << (OCTAL_CONST - 68)) | (1L << (HEX_CONST - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
				{
				{
				setState(192);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_argsContext extends ParserRuleContext {
		public Simple_definitionContext simple_definition;
		public List<Simple_definitionContext> f_args = new ArrayList<Simple_definitionContext>();
		public List<Simple_definitionContext> simple_definition() {
			return getRuleContexts(Simple_definitionContext.class);
		}
		public Simple_definitionContext simple_definition(int i) {
			return getRuleContext(Simple_definitionContext.class,i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((Function_argsContext)_localctx).simple_definition = simple_definition();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(201);
				match(T__11);
				setState(202);
				((Function_argsContext)_localctx).simple_definition = simple_definition();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_sentenceContext extends ParserRuleContext {
		public Token it_type;
		public ExpressionContext expr;
		public Code_blockContext code;
		public Assignment_definitionContext assign_def;
		public ExpressionContext condition;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public Iteration_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_sentence; }
	}

	public final Iteration_sentenceContext iteration_sentence() throws RecognitionException {
		Iteration_sentenceContext _localctx = new Iteration_sentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_iteration_sentence);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((Iteration_sentenceContext)_localctx).it_type = match(T__31);
				setState(209);
				match(T__29);
				setState(210);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(211);
				match(T__30);
				setState(212);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(215);
				((Iteration_sentenceContext)_localctx).code = code_block();
				setState(216);
				match(T__31);
				setState(217);
				match(T__29);
				setState(218);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(219);
				match(T__30);
				setState(220);
				match(T__4);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(223);
				match(T__29);
				setState(224);
				((Iteration_sentenceContext)_localctx).assign_def = assignment_definition();
				setState(225);
				match(T__4);
				setState(226);
				((Iteration_sentenceContext)_localctx).condition = expression(0);
				setState(227);
				match(T__4);
				setState(228);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(229);
				match(T__30);
				setState(230);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_sentenceContext extends ParserRuleContext {
		public Token cond_type;
		public ExpressionContext expr;
		public Code_blockContext if_code;
		public Code_blockContext else_code;
		public Case_sentenceContext case_sentence;
		public List<Case_sentenceContext> sentences = new ArrayList<Case_sentenceContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public List<Case_sentenceContext> case_sentence() {
			return getRuleContexts(Case_sentenceContext.class);
		}
		public Case_sentenceContext case_sentence(int i) {
			return getRuleContext(Case_sentenceContext.class,i);
		}
		public Conditional_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_sentence; }
	}

	public final Conditional_sentenceContext conditional_sentence() throws RecognitionException {
		Conditional_sentenceContext _localctx = new Conditional_sentenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditional_sentence);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(235);
				match(T__29);
				setState(236);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(237);
				match(T__30);
				setState(238);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(241);
				match(T__29);
				setState(242);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(243);
				match(T__30);
				setState(244);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				setState(245);
				match(T__35);
				setState(246);
				((Conditional_sentenceContext)_localctx).else_code = code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__36);
				setState(249);
				match(T__29);
				setState(250);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(251);
				match(T__30);
				setState(252);
				match(T__10);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40 || _la==T__42) {
					{
					{
					setState(253);
					((Conditional_sentenceContext)_localctx).case_sentence = case_sentence();
					((Conditional_sentenceContext)_localctx).sentences.add(((Conditional_sentenceContext)_localctx).case_sentence);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_blockContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_code_block);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__10);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (BINARY_CONST - 68)) | (1L << (OCTAL_CONST - 68)) | (1L << (HEX_CONST - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					{
					setState(264);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__12);
				}
				break;
			case T__8:
			case T__9:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__43:
			case T__44:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case BINARY_CONST:
			case OCTAL_CONST:
			case HEX_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case STRING_CONST:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				((Code_blockContext)_localctx).sentence = sentence();
				((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public Assignment_definitionContext a_def;
		public Simple_definitionContext s_def;
		public Array_definitionContext arr_def;
		public ConstantContext const_def;
		public Static_variableContext s_var;
		public Iteration_sentenceContext it_sent;
		public Conditional_sentenceContext cond_sent;
		public ExpressionContext expr;
		public Token s_type;
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
		}
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
		}
		public Array_definitionContext array_definition() {
			return getRuleContext(Array_definitionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Static_variableContext static_variable() {
			return getRuleContext(Static_variableContext.class,0);
		}
		public Iteration_sentenceContext iteration_sentence() {
			return getRuleContext(Iteration_sentenceContext.class,0);
		}
		public Conditional_sentenceContext conditional_sentence() {
			return getRuleContext(Conditional_sentenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sentence);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				((SentenceContext)_localctx).a_def = assignment_definition();
				setState(275);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((SentenceContext)_localctx).s_def = simple_definition();
				setState(278);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				((SentenceContext)_localctx).arr_def = array_definition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				((SentenceContext)_localctx).const_def = constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				((SentenceContext)_localctx).s_var = static_variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				((SentenceContext)_localctx).it_sent = iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				((SentenceContext)_localctx).cond_sent = conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				((SentenceContext)_localctx).expr = expression(0);
				setState(286);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(288);
				((SentenceContext)_localctx).s_type = match(T__37);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (BINARY_CONST - 30)) | (1L << (OCTAL_CONST - 30)) | (1L << (HEX_CONST - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					setState(289);
					((SentenceContext)_localctx).expr = expression(0);
					}
				}

				setState(292);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(294);
				match(T__4);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(295);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(296);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_sentenceContext extends ParserRuleContext {
		public Token sent_type;
		public ExpressionContext expr;
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Case_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_sentence; }
	}

	public final Case_sentenceContext case_sentence() throws RecognitionException {
		Case_sentenceContext _localctx = new Case_sentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_case_sentence);
		try {
			int _alt;
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((Case_sentenceContext)_localctx).sent_type = match(T__40);
				setState(300);
				((Case_sentenceContext)_localctx).expr = expression(0);
				setState(301);
				match(T__41);
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(302);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(308);
				match(T__38);
				setState(309);
				match(T__4);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				((Case_sentenceContext)_localctx).sent_type = match(T__42);
				setState(312);
				match(T__41);
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(319);
				match(T__38);
				setState(320);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext array_name;
		public ExpressionContext left;
		public ExpressionContext r_expr;
		public Function_callContext f_call;
		public Incdec_expressionContext i_d_expr;
		public Token operator;
		public ExpressionContext expr;
		public AssignmentContext assign;
		public ExpressionContext right;
		public ExpressionContext index;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Incdec_expressionContext incdec_expression() {
			return getRuleContext(Incdec_expressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode HEX_CONST() { return getToken(ArduinoParser.HEX_CONST, 0); }
		public TerminalNode OCTAL_CONST() { return getToken(ArduinoParser.OCTAL_CONST, 0); }
		public TerminalNode BINARY_CONST() { return getToken(ArduinoParser.BINARY_CONST, 0); }
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(ArduinoParser.FLOAT_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(ArduinoParser.CHAR_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public TerminalNode BIT_SHIFT_R() { return getToken(ArduinoParser.BIT_SHIFT_R, 0); }
		public TerminalNode BIT_SHIFT_L() { return getToken(ArduinoParser.BIT_SHIFT_L, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(324);
				match(T__29);
				setState(325);
				((ExpressionContext)_localctx).r_expr = expression(0);
				setState(326);
				match(T__30);
				}
				break;
			case 2:
				{
				setState(328);
				((ExpressionContext)_localctx).f_call = function_call();
				}
				break;
			case 3:
				{
				setState(329);
				((ExpressionContext)_localctx).i_d_expr = incdec_expression();
				}
				break;
			case 4:
				{
				setState(330);
				((ExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__44) ) {
					((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				((ExpressionContext)_localctx).expr = expression(23);
				}
				break;
			case 5:
				{
				setState(332);
				((ExpressionContext)_localctx).assign = assignment();
				}
				break;
			case 6:
				{
				setState(333);
				match(T__67);
				}
				break;
			case 7:
				{
				setState(334);
				match(T__68);
				}
				break;
			case 8:
				{
				setState(335);
				match(HEX_CONST);
				}
				break;
			case 9:
				{
				setState(336);
				match(OCTAL_CONST);
				}
				break;
			case 10:
				{
				setState(337);
				match(BINARY_CONST);
				}
				break;
			case 11:
				{
				setState(338);
				match(INT_CONST);
				}
				break;
			case 12:
				{
				setState(339);
				match(FLOAT_CONST);
				}
				break;
			case 13:
				{
				setState(340);
				match(CHAR_CONST);
				}
				break;
			case 14:
				{
				setState(341);
				match(STRING_CONST);
				}
				break;
			case 15:
				{
				setState(342);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(383);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(346);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(347);
						((ExpressionContext)_localctx).right = expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(349);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__49) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						((ExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(352);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==BIT_SHIFT_L || _la==BIT_SHIFT_R) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(353);
						((ExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(355);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__50) | (1L << T__51))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(356);
						((ExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(358);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						((ExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(361);
						((ExpressionContext)_localctx).operator = match(T__54);
						setState(362);
						((ExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(364);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(365);
						((ExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(367);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(368);
						((ExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(370);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(371);
						((ExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(372);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(373);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(374);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(375);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(376);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__60 - 60)) | (1L << (T__61 - 60)) | (1L << (T__62 - 60)) | (1L << (T__63 - 60)) | (1L << (T__64 - 60)) | (1L << (T__65 - 60)) | (1L << (T__66 - 60)))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(377);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array_name = _prevctx;
						_localctx.array_name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(378);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(379);
						match(T__6);
						setState(380);
						((ExpressionContext)_localctx).index = expression(0);
						setState(381);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Incdec_expressionContext extends ParserRuleContext {
		public Token operator;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Incdec_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec_expression; }
	}

	public final Incdec_expressionContext incdec_expression() throws RecognitionException {
		Incdec_expressionContext _localctx = new Incdec_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_incdec_expression);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				setState(389);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(ID);
				setState(391);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(393);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(394);
				match(ID);
				setState(395);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Token obj;
		public Token ID;
		public List<Token> elems = new ArrayList<Token>();
		public Function_callContext f_call;
		public Token f_name;
		public ParameterContext args;
		public List<TerminalNode> ID() { return getTokens(ArduinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoParser.ID, i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			int _alt;
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				((Function_callContext)_localctx).obj = match(ID);
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						match(T__3);
						setState(400);
						((Function_callContext)_localctx).ID = match(ID);
						((Function_callContext)_localctx).elems.add(((Function_callContext)_localctx).ID);
						}
						} 
					}
					setState(405);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(406);
				match(T__3);
				setState(407);
				((Function_callContext)_localctx).f_call = function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				((Function_callContext)_localctx).f_name = match(ID);
				setState(409);
				match(T__29);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (BINARY_CONST - 30)) | (1L << (OCTAL_CONST - 30)) | (1L << (HEX_CONST - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					setState(410);
					((Function_callContext)_localctx).args = parameter();
					}
				}

				setState(413);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(417);
				match(T__11);
				setState(418);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_variableContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Static_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_variable; }
	}

	public final Static_variableContext static_variable() throws RecognitionException {
		Static_variableContext _localctx = new Static_variableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_static_variable);
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(T__71);
				setState(425);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(426);
				match(ID);
				setState(427);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(T__71);
				setState(430);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(431);
				match(ID);
				setState(432);
				match(T__5);
				setState(433);
				((Static_variableContext)_localctx).val = expression(0);
				setState(434);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u01b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f"+
		"\3\f\5\f\u0090\n\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\6\r\u009a\n\r"+
		"\r\r\16\r\u009b\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13"+
		"\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00b7\n\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00bf\n\20\3"+
		"\20\3\20\3\20\7\20\u00c4\n\20\f\20\16\20\u00c7\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00eb\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0101\n\23\f\23\16\23\u0104\13\23\3\23\3\23\5\23\u0108\n\23"+
		"\3\24\3\24\7\24\u010c\n\24\f\24\16\24\u010f\13\24\3\24\3\24\5\24\u0113"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0125\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u012c\n"+
		"\25\3\26\3\26\3\26\3\26\7\26\u0132\n\26\f\26\16\26\u0135\13\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u013d\n\26\f\26\16\26\u0140\13\26\3\26\3"+
		"\26\5\26\u0144\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015a\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0182\n\27\f\27\16"+
		"\27\u0185\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u018f\n\30"+
		"\3\31\3\31\3\31\7\31\u0194\n\31\f\31\16\31\u0197\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u019e\n\31\3\31\5\31\u01a1\n\31\3\32\3\32\3\32\7\32\u01a6"+
		"\n\32\f\32\16\32\u01a9\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u01b7\n\33\3\33\2\3,\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\n\4\2\20\37VV\3\2./\3\2\60\62\3\2"+
		"\63\64\3\2KL\4\2\4\5\65\66\3\2\678\3\2>E\2\u01ea\2\66\3\2\2\2\4<\3\2\2"+
		"\2\6G\3\2\2\2\bP\3\2\2\2\nR\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20c\3\2\2\2"+
		"\22q\3\2\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u00aa\3\2\2\2\32\u00b6"+
		"\3\2\2\2\34\u00b8\3\2\2\2\36\u00ba\3\2\2\2 \u00ca\3\2\2\2\"\u00ea\3\2"+
		"\2\2$\u0107\3\2\2\2&\u0112\3\2\2\2(\u012b\3\2\2\2*\u0143\3\2\2\2,\u0159"+
		"\3\2\2\2.\u018e\3\2\2\2\60\u01a0\3\2\2\2\62\u01a2\3\2\2\2\64\u01b6\3\2"+
		"\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EH\5\f\7\2FH\5\36\20\2GE\3"+
		"\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\7\3\2\2JQ\7T\2\2KL\7\3\2\2LM\7\4\2\2MN\5"+
		"\n\6\2NO\7\5\2\2OQ\3\2\2\2PI\3\2\2\2PK\3\2\2\2Q\t\3\2\2\2RS\7V\2\2ST\7"+
		"\6\2\2TU\7V\2\2U\13\3\2\2\2VW\5\16\b\2WX\7\7\2\2X_\3\2\2\2Y_\5\24\13\2"+
		"Z[\5\20\t\2[\\\7\7\2\2\\_\3\2\2\2]_\5\32\16\2^V\3\2\2\2^Y\3\2\2\2^Z\3"+
		"\2\2\2^]\3\2\2\2_\r\3\2\2\2`a\5\34\17\2ab\7V\2\2b\17\3\2\2\2cd\5\34\17"+
		"\2de\7V\2\2ef\7\b\2\2fg\5,\27\2g\21\3\2\2\2hi\7V\2\2ij\7\b\2\2jr\5,\27"+
		"\2kl\7V\2\2lm\7\t\2\2mn\7P\2\2no\7\n\2\2op\7\b\2\2pr\5,\27\2qh\3\2\2\2"+
		"qk\3\2\2\2r\23\3\2\2\2st\7\13\2\2t\u008c\5\24\13\2uv\7\f\2\2vw\7V\2\2"+
		"w\u008c\5\30\r\2xy\5\34\17\2yz\7V\2\2z{\5\26\f\2{|\7\7\2\2|\u008c\3\2"+
		"\2\2}~\5\34\17\2~\177\7V\2\2\177\u0080\5\26\f\2\u0080\u0081\7\b\2\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0083\7\7\2\2\u0083\u008c\3\2\2\2\u0084\u0085\5"+
		"\34\17\2\u0085\u0086\7V\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\b\2\2\u0088"+
		"\u0089\5,\27\2\u0089\u008a\7\7\2\2\u008a\u008c\3\2\2\2\u008bs\3\2\2\2"+
		"\u008bu\3\2\2\2\u008bx\3\2\2\2\u008b}\3\2\2\2\u008b\u0084\3\2\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008f\7\t\2\2\u008e\u0090\7P\2\2\u008f\u008e\3\2\2\2"+
		"\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\n\2\2\u0092\u0094"+
		"\5\26\f\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095"+
		"\u0096\7\r\2\2\u0096\u0099\5\30\r\2\u0097\u0098\7\16\2\2\u0098\u009a\5"+
		"\30\r\2\u0099\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u00ab\3"+
		"\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a5\5,\27\2\u00a1\u00a2\7\16\2\2\u00a2"+
		"\u00a4\5,\27\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\17\2\2\u00a9\u00ab\3\2\2\2\u00aa\u0095\3\2\2\2\u00aa\u009f\3"+
		"\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\34\17\2\u00ae"+
		"\u00af\7V\2\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\5,\27\2\u00b1\u00b2\7\7"+
		"\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7V\2\2\u00b5"+
		"\u00b7\5,\27\2\u00b6\u00ac\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7\33\3\2\2"+
		"\2\u00b8\u00b9\t\2\2\2\u00b9\35\3\2\2\2\u00ba\u00bb\5\34\17\2\u00bb\u00bc"+
		"\7V\2\2\u00bc\u00be\7 \2\2\u00bd\u00bf\5 \21\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c5\7\r"+
		"\2\2\u00c2\u00c4\5(\25\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\7\17\2\2\u00c9\37\3\2\2\2\u00ca\u00cf\5\16\b\2\u00cb"+
		"\u00cc\7\16\2\2\u00cc\u00ce\5\16\b\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\5,\27\2\u00d5"+
		"\u00d6\7!\2\2\u00d6\u00d7\5&\24\2\u00d7\u00eb\3\2\2\2\u00d8\u00d9\7#\2"+
		"\2\u00d9\u00da\5&\24\2\u00da\u00db\7\"\2\2\u00db\u00dc\7 \2\2\u00dc\u00dd"+
		"\5,\27\2\u00dd\u00de\7!\2\2\u00de\u00df\7\7\2\2\u00df\u00eb\3\2\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\7\7"+
		"\2\2\u00e4\u00e5\5,\27\2\u00e5\u00e6\7\7\2\2\u00e6\u00e7\5,\27\2\u00e7"+
		"\u00e8\7!\2\2\u00e8\u00e9\5&\24\2\u00e9\u00eb\3\2\2\2\u00ea\u00d2\3\2"+
		"\2\2\u00ea\u00d8\3\2\2\2\u00ea\u00e0\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed"+
		"\7%\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5,\27\2\u00ef\u00f0\7!\2\2\u00f0"+
		"\u00f1\5&\24\2\u00f1\u0108\3\2\2\2\u00f2\u00f3\7%\2\2\u00f3\u00f4\7 \2"+
		"\2\u00f4\u00f5\5,\27\2\u00f5\u00f6\7!\2\2\u00f6\u00f7\5&\24\2\u00f7\u00f8"+
		"\7&\2\2\u00f8\u00f9\5&\24\2\u00f9\u0108\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fb"+
		"\u00fc\7 \2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7!\2\2\u00fe\u0102\7\r\2"+
		"\2\u00ff\u0101\5*\26\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7\17\2\2\u0106\u0108\3\2\2\2\u0107\u00ec\3\2\2\2\u0107\u00f2\3"+
		"\2\2\2\u0107\u00fa\3\2\2\2\u0108%\3\2\2\2\u0109\u010d\7\r\2\2\u010a\u010c"+
		"\5(\25\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0113\7\17"+
		"\2\2\u0111\u0113\5(\25\2\u0112\u0109\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\'\3\2\2\2\u0114\u0115\5\20\t\2\u0115\u0116\7\7\2\2\u0116\u012c\3\2\2"+
		"\2\u0117\u0118\5\16\b\2\u0118\u0119\7\7\2\2\u0119\u012c\3\2\2\2\u011a"+
		"\u012c\5\24\13\2\u011b\u012c\5\32\16\2\u011c\u012c\5\64\33\2\u011d\u012c"+
		"\5\"\22\2\u011e\u012c\5$\23\2\u011f\u0120\5,\27\2\u0120\u0121\7\7\2\2"+
		"\u0121\u012c\3\2\2\2\u0122\u0124\7(\2\2\u0123\u0125\5,\27\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012c\7\7\2\2\u0127"+
		"\u0128\7)\2\2\u0128\u012c\7\7\2\2\u0129\u012a\7*\2\2\u012a\u012c\7\7\2"+
		"\2\u012b\u0114\3\2\2\2\u012b\u0117\3\2\2\2\u012b\u011a\3\2\2\2\u012b\u011b"+
		"\3\2\2\2\u012b\u011c\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u011e\3\2\2\2\u012b"+
		"\u011f\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c)\3\2\2\2\u012d\u012e\7+\2\2\u012e\u012f\5,\27\2\u012f\u0133"+
		"\7,\2\2\u0130\u0132\5(\25\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0137\7)\2\2\u0137\u0138\7\7\2\2\u0138\u0144\3\2\2\2\u0139"+
		"\u013a\7-\2\2\u013a\u013e\7,\2\2\u013b\u013d\5(\25\2\u013c\u013b\3\2\2"+
		"\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0144\7\7\2\2\u0143"+
		"\u012d\3\2\2\2\u0143\u0139\3\2\2\2\u0144+\3\2\2\2\u0145\u0146\b\27\1\2"+
		"\u0146\u0147\7 \2\2\u0147\u0148\5,\27\2\u0148\u0149\7!\2\2\u0149\u015a"+
		"\3\2\2\2\u014a\u015a\5\60\31\2\u014b\u015a\5.\30\2\u014c\u014d\t\3\2\2"+
		"\u014d\u015a\5,\27\31\u014e\u015a\5\22\n\2\u014f\u015a\7F\2\2\u0150\u015a"+
		"\7G\2\2\u0151\u015a\7O\2\2\u0152\u015a\7N\2\2\u0153\u015a\7M\2\2\u0154"+
		"\u015a\7P\2\2\u0155\u015a\7Q\2\2\u0156\u015a\7R\2\2\u0157\u015a\7T\2\2"+
		"\u0158\u015a\7V\2\2\u0159\u0145\3\2\2\2\u0159\u014a\3\2\2\2\u0159\u014b"+
		"\3\2\2\2\u0159\u014c\3\2\2\2\u0159\u014e\3\2\2\2\u0159\u014f\3\2\2\2\u0159"+
		"\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2"+
		"\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u0183\3\2\2\2\u015b\u015c\f\30"+
		"\2\2\u015c\u015d\t\4\2\2\u015d\u0182\5,\27\31\u015e\u015f\f\27\2\2\u015f"+
		"\u0160\t\5\2\2\u0160\u0182\5,\27\30\u0161\u0162\f\26\2\2\u0162\u0163\t"+
		"\6\2\2\u0163\u0182\5,\27\27\u0164\u0165\f\25\2\2\u0165\u0166\t\7\2\2\u0166"+
		"\u0182\5,\27\26\u0167\u0168\f\24\2\2\u0168\u0169\t\b\2\2\u0169\u0182\5"+
		",\27\25\u016a\u016b\f\23\2\2\u016b\u016c\79\2\2\u016c\u0182\5,\27\24\u016d"+
		"\u016e\f\22\2\2\u016e\u016f\7:\2\2\u016f\u0182\5,\27\23\u0170\u0171\f"+
		"\21\2\2\u0171\u0172\7;\2\2\u0172\u0182\5,\27\22\u0173\u0174\f\20\2\2\u0174"+
		"\u0175\7<\2\2\u0175\u0182\5,\27\21\u0176\u0177\f\17\2\2\u0177\u0178\7"+
		"=\2\2\u0178\u0182\5,\27\20\u0179\u017a\f\16\2\2\u017a\u017b\t\t\2\2\u017b"+
		"\u0182\5,\27\17\u017c\u017d\f\32\2\2\u017d\u017e\7\t\2\2\u017e\u017f\5"+
		",\27\2\u017f\u0180\7\n\2\2\u0180\u0182\3\2\2\2\u0181\u015b\3\2\2\2\u0181"+
		"\u015e\3\2\2\2\u0181\u0161\3\2\2\2\u0181\u0164\3\2\2\2\u0181\u0167\3\2"+
		"\2\2\u0181\u016a\3\2\2\2\u0181\u016d\3\2\2\2\u0181\u0170\3\2\2\2\u0181"+
		"\u0173\3\2\2\2\u0181\u0176\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017c\3\2"+
		"\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"-\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7H\2\2\u0187\u018f\7V\2\2\u0188"+
		"\u0189\7V\2\2\u0189\u018f\7H\2\2\u018a\u018b\7I\2\2\u018b\u018f\7V\2\2"+
		"\u018c\u018d\7V\2\2\u018d\u018f\7I\2\2\u018e\u0186\3\2\2\2\u018e\u0188"+
		"\3\2\2\2\u018e\u018a\3\2\2\2\u018e\u018c\3\2\2\2\u018f/\3\2\2\2\u0190"+
		"\u0195\7V\2\2\u0191\u0192\7\6\2\2\u0192\u0194\7V\2\2\u0193\u0191\3\2\2"+
		"\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\6\2\2\u0199\u01a1\5\60\31\2"+
		"\u019a\u019b\7V\2\2\u019b\u019d\7 \2\2\u019c\u019e\5\62\32\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7!\2\2\u01a0"+
		"\u0190\3\2\2\2\u01a0\u019a\3\2\2\2\u01a1\61\3\2\2\2\u01a2\u01a7\5,\27"+
		"\2\u01a3\u01a4\7\16\2\2\u01a4\u01a6\5,\27\2\u01a5\u01a3\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\63\3\2\2"+
		"\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7J\2\2\u01ab\u01ac\5\34\17\2\u01ac"+
		"\u01ad\7V\2\2\u01ad\u01ae\7\7\2\2\u01ae\u01b7\3\2\2\2\u01af\u01b0\7J\2"+
		"\2\u01b0\u01b1\5\34\17\2\u01b1\u01b2\7V\2\2\u01b2\u01b3\7\b\2\2\u01b3"+
		"\u01b4\5,\27\2\u01b4\u01b5\7\7\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01aa\3\2"+
		"\2\2\u01b6\u01af\3\2\2\2\u01b7\65\3\2\2\2%<BGP^q\u008b\u008f\u0093\u009b"+
		"\u00a5\u00aa\u00b6\u00be\u00c5\u00cf\u00ea\u0102\u0107\u010d\u0112\u0124"+
		"\u012b\u0133\u013e\u0143\u0159\u0181\u0183\u018e\u0195\u019d\u01a0\u01a7"+
		"\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}