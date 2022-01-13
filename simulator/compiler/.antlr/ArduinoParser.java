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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		BIT_SHIFT_L=74, BIT_SHIFT_R=75, INT_CONST=76, FLOAT_CONST=77, CHAR_CONST=78, 
		UNTERMINATED_CHAR=79, STRING_CONST=80, UNTERMINATED_STRING=81, ID=82, 
		LINE_COMMENT=83, MULTILINE_COMMENT=84, WHITESPACE=85;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_assignment = 8, RULE_array_definition = 9, RULE_constant = 10, RULE_var_type = 11, 
		RULE_function = 12, RULE_function_args = 13, RULE_iteration_sentence = 14, 
		RULE_conditional_sentence = 15, RULE_code_block = 16, RULE_sentence = 17, 
		RULE_case_sentence = 18, RULE_expression = 19, RULE_incdec_expression = 20, 
		RULE_function_call = 21, RULE_parameter = 22, RULE_static_variable = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "assignment", "array_definition", 
			"constant", "var_type", "function", "function_args", "iteration_sentence", 
			"conditional_sentence", "code_block", "sentence", "case_sentence", "expression", 
			"incdec_expression", "function_call", "parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'.'", "';'", "'='", "'['", "']'", 
			"'{'", "','", "'}'", "'const'", "'#define'", "'\n'", "'bool'", "'boolean'", 
			"'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", 
			"'size_t'", "'string'", "'unsigned int'", "'unsigned char'", "'unsigned long'", 
			"'void'", "'word'", "'('", "')'", "'while'", "'do'", "'for'", "'if'", 
			"'else'", "'switch'", "'return'", "'break'", "'continue'", "'case'", 
			"':'", "'default'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'>='", "'<='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'%='", "'&='", "'*='", "'+='", "'-='", "'/='", "'^='", "'|='", "'true'", 
			"'false'", "'++'", "'--'", "'static'"
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
			null, null, "BIT_SHIFT_L", "BIT_SHIFT_R", "INT_CONST", "FLOAT_CONST", 
			"CHAR_CONST", "UNTERMINATED_CHAR", "STRING_CONST", "UNTERMINATED_STRING", 
			"ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
			setState(48);
			program();
			setState(49);
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
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				((ProgramContext)_localctx).declaration = declaration();
				((ProgramContext)_localctx).declarations.add(((ProgramContext)_localctx).declaration);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
				{
				{
				setState(57);
				((ProgramContext)_localctx).program_code = program_code();
				((ProgramContext)_localctx).code.add(((ProgramContext)_localctx).program_code);
				}
				}
				setState(62);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				function();
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__0);
				setState(68);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(T__1);
				setState(71);
				h_file();
				setState(72);
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
			setState(76);
			match(ID);
			setState(77);
			match(T__3);
			setState(78);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				simple_definition();
				setState(81);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				array_definition();
				setState(84);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				assignment_definition();
				setState(87);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				constant();
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
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
			setState(92);
			var_type();
			setState(93);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
			setState(95);
			var_type();
			setState(96);
			assignment();
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ID);
				setState(99);
				match(T__5);
				setState(100);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(ID);
				setState(102);
				match(T__6);
				setState(103);
				match(INT_CONST);
				setState(104);
				match(T__7);
				setState(105);
				match(T__5);
				setState(106);
				expression(0);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public List<TerminalNode> INT_CONST() { return getTokens(ArduinoParser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(ArduinoParser.INT_CONST, i);
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
		int _la;
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				var_type();
				setState(110);
				match(ID);
				setState(111);
				match(T__6);
				setState(112);
				match(INT_CONST);
				setState(113);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				var_type();
				setState(116);
				match(ID);
				setState(117);
				match(T__6);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_CONST) {
					{
					setState(118);
					match(INT_CONST);
					}
				}

				setState(121);
				match(T__7);
				setState(122);
				match(T__5);
				setState(123);
				match(T__8);
				setState(124);
				match(INT_CONST);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(125);
					match(T__9);
					setState(126);
					match(INT_CONST);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				var_type();
				setState(135);
				match(ID);
				setState(136);
				match(T__6);
				setState(137);
				match(INT_CONST);
				setState(138);
				match(T__7);
				setState(139);
				match(T__5);
				setState(140);
				expression(0);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArduinoParser.EOF, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((ConstantContext)_localctx).const_type = match(T__11);
				setState(145);
				var_type();
				setState(146);
				assignment();
				setState(147);
				match(T__4);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((ConstantContext)_localctx).const_type = match(T__12);
				setState(150);
				match(ID);
				setState(151);
				expression(0);
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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
		enterRule(_localctx, 22, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) ) {
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
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
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
		enterRule(_localctx, 24, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			var_type();
			setState(159);
			match(ID);
			setState(160);
			match(T__30);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
				{
				setState(161);
				function_args();
				}
			}

			setState(164);
			match(T__31);
			setState(165);
			match(T__8);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
				{
				{
				setState(166);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			match(T__10);
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
		enterRule(_localctx, 26, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Function_argsContext)_localctx).simple_definition = simple_definition();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(175);
				match(T__9);
				setState(176);
				((Function_argsContext)_localctx).simple_definition = simple_definition();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
				}
				}
				setState(181);
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
		enterRule(_localctx, 28, RULE_iteration_sentence);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(183);
				match(T__30);
				setState(184);
				expression(0);
				setState(185);
				match(T__31);
				setState(186);
				code_block();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(189);
				code_block();
				setState(190);
				match(T__32);
				setState(191);
				match(T__30);
				setState(192);
				expression(0);
				setState(193);
				match(T__31);
				setState(194);
				match(T__4);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((Iteration_sentenceContext)_localctx).it_type = match(T__34);
				setState(197);
				match(T__30);
				setState(198);
				assignment_definition();
				setState(199);
				match(T__4);
				setState(200);
				expression(0);
				setState(201);
				match(T__4);
				setState(202);
				expression(0);
				setState(203);
				match(T__31);
				setState(204);
				code_block();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public Conditional_sentenceContext conditional_sentence() {
			return getRuleContext(Conditional_sentenceContext.class,0);
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
		enterRule(_localctx, 30, RULE_conditional_sentence);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(209);
				match(T__30);
				setState(210);
				expression(0);
				setState(211);
				match(T__31);
				setState(212);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(215);
				match(T__30);
				setState(216);
				expression(0);
				setState(217);
				match(T__31);
				setState(218);
				code_block();
				setState(219);
				match(T__36);
				setState(220);
				conditional_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(223);
				match(T__30);
				setState(224);
				expression(0);
				setState(225);
				match(T__31);
				setState(226);
				code_block();
				setState(227);
				match(T__36);
				setState(228);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(231);
				match(T__30);
				setState(232);
				expression(0);
				setState(233);
				match(T__31);
				setState(234);
				match(T__8);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__43) {
					{
					{
					setState(235);
					case_sentence();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__10);
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
		enterRule(_localctx, 32, RULE_code_block);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__8);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					{
					setState(246);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__10);
				}
				break;
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
			case T__30:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__44:
			case T__45:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case INT_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case STRING_CONST:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
		public Token s_type;
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
		}
		public Assignment_definitionContext assignment_definition() {
			return getRuleContext(Assignment_definitionContext.class,0);
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
		enterRule(_localctx, 34, RULE_sentence);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				simple_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				assignment_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				static_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				iteration_sentence();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				conditional_sentence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				expression(0);
				setState(262);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(265);
					expression(0);
					}
				}

				setState(268);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(270);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				((SentenceContext)_localctx).s_type = match(T__40);
				setState(272);
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
		enterRule(_localctx, 36, RULE_case_sentence);
		try {
			int _alt;
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__41);
				setState(276);
				expression(0);
				setState(277);
				match(T__42);
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(283);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(284);
				match(T__39);
				setState(285);
				match(T__4);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(T__43);
				setState(288);
				match(T__42);
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(289);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(295);
				match(T__39);
				setState(296);
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
		public Token operator;
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(300);
				match(T__30);
				setState(301);
				expression(0);
				setState(302);
				match(T__31);
				}
				break;
			case 2:
				{
				setState(304);
				function_call();
				}
				break;
			case 3:
				{
				setState(305);
				incdec_expression();
				}
				break;
			case 4:
				{
				setState(306);
				((ExpressionContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__44 || _la==T__45) ) {
					((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				expression(20);
				}
				break;
			case 5:
				{
				setState(308);
				assignment();
				}
				break;
			case 6:
				{
				setState(309);
				match(T__68);
				}
				break;
			case 7:
				{
				setState(310);
				match(T__69);
				}
				break;
			case 8:
				{
				setState(311);
				match(INT_CONST);
				}
				break;
			case 9:
				{
				setState(312);
				match(FLOAT_CONST);
				}
				break;
			case 10:
				{
				setState(313);
				match(CHAR_CONST);
				}
				break;
			case 11:
				{
				setState(314);
				match(STRING_CONST);
				}
				break;
			case 12:
				{
				setState(315);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(319);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(322);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__50) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(325);
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
						setState(326);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(327);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(328);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__51) | (1L << T__52))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(329);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(331);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__54) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(333);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(334);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(335);
						expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(337);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(338);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(340);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(341);
						expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(343);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(344);
						expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(346);
						((ExpressionContext)_localctx).operator = match(T__59);
						setState(347);
						expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(349);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (T__60 - 61)) | (1L << (T__61 - 61)) | (1L << (T__62 - 61)) | (1L << (T__63 - 61)) | (1L << (T__64 - 61)) | (1L << (T__65 - 61)) | (1L << (T__66 - 61)) | (1L << (T__67 - 61)))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(350);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 40, RULE_incdec_expression);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(357);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(ID);
				setState(359);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				((Incdec_expressionContext)_localctx).operator = match(T__71);
				setState(361);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(ID);
				setState(363);
				((Incdec_expressionContext)_localctx).operator = match(T__71);
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
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ID);
			setState(367);
			match(T__30);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
				{
				setState(368);
				parameter();
				}
			}

			setState(371);
			match(T__31);
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
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(374);
				match(T__9);
				setState(375);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(380);
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Static_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_variable; }
	}

	public final Static_variableContext static_variable() throws RecognitionException {
		Static_variableContext _localctx = new Static_variableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_static_variable);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(T__72);
				setState(382);
				var_type();
				setState(383);
				match(ID);
				setState(384);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(T__72);
				setState(387);
				var_type();
				setState(388);
				assignment();
				setState(389);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\4\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13\u0082\n\13\f\13\16\13\u0085\13\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u009d\n\f\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00a5\n\16\3\16"+
		"\3\16\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\7\17\u00b4\n\17\f\17\16\17\u00b7\13\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00ef\n\21\f\21\16\21\u00f2"+
		"\13\21\3\21\3\21\5\21\u00f6\n\21\3\22\3\22\7\22\u00fa\n\22\f\22\16\22"+
		"\u00fd\13\22\3\22\3\22\5\22\u0101\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u010d\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0114"+
		"\n\23\3\24\3\24\3\24\3\24\7\24\u011a\n\24\f\24\16\24\u011d\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16\24\u0128\13\24\3\24"+
		"\3\24\5\24\u012c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013f\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0162\n\25\f\25\16\25\u0165\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u016f\n\26\3\27\3\27\3\27\5\27\u0174\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\7\30\u017b\n\30\f\30\16\30\u017e\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018a\n\31\3\31\2\3(\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\13\3\3\20\20\4\2\21"+
		" TT\3\2/\60\3\2\61\63\3\2\64\65\3\2LM\4\2\4\5\66\67\3\289\3\2?F\2\u01b3"+
		"\2\62\3\2\2\2\48\3\2\2\2\6C\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\f\\\3\2\2\2"+
		"\16^\3\2\2\2\20a\3\2\2\2\22m\3\2\2\2\24\u0090\3\2\2\2\26\u009c\3\2\2\2"+
		"\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00b0\3\2\2\2\36\u00d0\3\2\2\2 "+
		"\u00f5\3\2\2\2\"\u0100\3\2\2\2$\u0113\3\2\2\2&\u012b\3\2\2\2(\u013e\3"+
		"\2\2\2*\u016e\3\2\2\2,\u0170\3\2\2\2.\u0177\3\2\2\2\60\u0189\3\2\2\2\62"+
		"\63\5\4\3\2\63\64\7\2\2\3\64\3\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\6\4\2<;\3\2\2"+
		"\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\5\3\2\2\2@>\3\2\2\2AD\5\f\7\2BD\5\32"+
		"\16\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7\3\2\2FM\7R\2\2GH\7\3\2\2HI\7"+
		"\4\2\2IJ\5\n\6\2JK\7\5\2\2KM\3\2\2\2LE\3\2\2\2LG\3\2\2\2M\t\3\2\2\2NO"+
		"\7T\2\2OP\7\6\2\2PQ\7T\2\2Q\13\3\2\2\2RS\5\16\b\2ST\7\7\2\2T]\3\2\2\2"+
		"UV\5\24\13\2VW\7\7\2\2W]\3\2\2\2XY\5\20\t\2YZ\7\7\2\2Z]\3\2\2\2[]\5\26"+
		"\f\2\\R\3\2\2\2\\U\3\2\2\2\\X\3\2\2\2\\[\3\2\2\2]\r\3\2\2\2^_\5\30\r\2"+
		"_`\7T\2\2`\17\3\2\2\2ab\5\30\r\2bc\5\22\n\2c\21\3\2\2\2de\7T\2\2ef\7\b"+
		"\2\2fn\5(\25\2gh\7T\2\2hi\7\t\2\2ij\7N\2\2jk\7\n\2\2kl\7\b\2\2ln\5(\25"+
		"\2md\3\2\2\2mg\3\2\2\2n\23\3\2\2\2op\5\30\r\2pq\7T\2\2qr\7\t\2\2rs\7N"+
		"\2\2st\7\n\2\2t\u0091\3\2\2\2uv\5\30\r\2vw\7T\2\2wy\7\t\2\2xz\7N\2\2y"+
		"x\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\n\2\2|}\7\b\2\2}~\7\13\2\2~\u0083\7"+
		"N\2\2\177\u0080\7\f\2\2\u0080\u0082\7N\2\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0091\3\2\2\2\u0088\u0089\5\30"+
		"\r\2\u0089\u008a\7T\2\2\u008a\u008b\7\t\2\2\u008b\u008c\7N\2\2\u008c\u008d"+
		"\7\n\2\2\u008d\u008e\7\b\2\2\u008e\u008f\5(\25\2\u008f\u0091\3\2\2\2\u0090"+
		"o\3\2\2\2\u0090u\3\2\2\2\u0090\u0088\3\2\2\2\u0091\25\3\2\2\2\u0092\u0093"+
		"\7\16\2\2\u0093\u0094\5\30\r\2\u0094\u0095\5\22\n\2\u0095\u0096\7\7\2"+
		"\2\u0096\u009d\3\2\2\2\u0097\u0098\7\17\2\2\u0098\u0099\7T\2\2\u0099\u009a"+
		"\5(\25\2\u009a\u009b\t\2\2\2\u009b\u009d\3\2\2\2\u009c\u0092\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\t\3\2\2\u009f\31\3\2\2\2\u00a0"+
		"\u00a1\5\30\r\2\u00a1\u00a2\7T\2\2\u00a2\u00a4\7!\2\2\u00a3\u00a5\5\34"+
		"\17\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7\"\2\2\u00a7\u00ab\7\13\2\2\u00a8\u00aa\5$\23\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\33\3\2\2"+
		"\2\u00b0\u00b5\5\16\b\2\u00b1\u00b2\7\f\2\2\u00b2\u00b4\5\16\b\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\35\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba"+
		"\7!\2\2\u00ba\u00bb\5(\25\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\5\"\22\2\u00bd"+
		"\u00d1\3\2\2\2\u00be\u00bf\7$\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c1\7#"+
		"\2\2\u00c1\u00c2\7!\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\"\2\2\u00c4"+
		"\u00c5\7\7\2\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\7!\2"+
		"\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\5(\25\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc\u00cd\5(\25\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\5\""+
		"\22\2\u00cf\u00d1\3\2\2\2\u00d0\u00b8\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0"+
		"\u00c6\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3\u00d4\7!\2\2"+
		"\u00d4\u00d5\5(\25\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\5\"\22\2\u00d7\u00f6"+
		"\3\2\2\2\u00d8\u00d9\7&\2\2\u00d9\u00da\7!\2\2\u00da\u00db\5(\25\2\u00db"+
		"\u00dc\7\"\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\'\2\2\u00de\u00df\5"+
		" \21\2\u00df\u00f6\3\2\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\7!\2\2\u00e2"+
		"\u00e3\5(\25\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5\5\"\22\2\u00e5\u00e6\7"+
		"\'\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00f6\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9"+
		"\u00ea\7!\2\2\u00ea\u00eb\5(\25\2\u00eb\u00ec\7\"\2\2\u00ec\u00f0\7\13"+
		"\2\2\u00ed\u00ef\5&\24\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\7\r\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00d2\3\2\2\2\u00f5"+
		"\u00d8\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f6!\3\2\2\2"+
		"\u00f7\u00fb\7\13\2\2\u00f8\u00fa\5$\23\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0101\7\r\2\2\u00ff\u0101\5$\23\2\u0100\u00f7\3\2"+
		"\2\2\u0100\u00ff\3\2\2\2\u0101#\3\2\2\2\u0102\u0114\5\16\b\2\u0103\u0114"+
		"\5\20\t\2\u0104\u0114\5\60\31\2\u0105\u0114\5\36\20\2\u0106\u0114\5 \21"+
		"\2\u0107\u0108\5(\25\2\u0108\u0109\7\7\2\2\u0109\u0114\3\2\2\2\u010a\u010c"+
		"\7)\2\2\u010b\u010d\5(\25\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0114\7\7\2\2\u010f\u0110\7*\2\2\u0110\u0114\7\7"+
		"\2\2\u0111\u0112\7+\2\2\u0112\u0114\7\7\2\2\u0113\u0102\3\2\2\2\u0113"+
		"\u0103\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u0106\3\2"+
		"\2\2\u0113\u0107\3\2\2\2\u0113\u010a\3\2\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\5(\25\2\u0117"+
		"\u011b\7-\2\2\u0118\u011a\5$\23\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\7*\2\2\u011f\u0120\7\7\2\2\u0120\u012c\3\2"+
		"\2\2\u0121\u0122\7.\2\2\u0122\u0126\7-\2\2\u0123\u0125\5$\23\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7*\2\2\u012a\u012c\7\7"+
		"\2\2\u012b\u0115\3\2\2\2\u012b\u0121\3\2\2\2\u012c\'\3\2\2\2\u012d\u012e"+
		"\b\25\1\2\u012e\u012f\7!\2\2\u012f\u0130\5(\25\2\u0130\u0131\7\"\2\2\u0131"+
		"\u013f\3\2\2\2\u0132\u013f\5,\27\2\u0133\u013f\5*\26\2\u0134\u0135\t\4"+
		"\2\2\u0135\u013f\5(\25\26\u0136\u013f\5\22\n\2\u0137\u013f\7G\2\2\u0138"+
		"\u013f\7H\2\2\u0139\u013f\7N\2\2\u013a\u013f\7O\2\2\u013b\u013f\7P\2\2"+
		"\u013c\u013f\7R\2\2\u013d\u013f\7T\2\2\u013e\u012d\3\2\2\2\u013e\u0132"+
		"\3\2\2\2\u013e\u0133\3\2\2\2\u013e\u0134\3\2\2\2\u013e\u0136\3\2\2\2\u013e"+
		"\u0137\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013e\u013b\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0163\3\2\2\2\u0140\u0141\f\25\2\2\u0141\u0142\t\5\2\2\u0142\u0162\5"+
		"(\25\26\u0143\u0144\f\24\2\2\u0144\u0145\t\6\2\2\u0145\u0162\5(\25\25"+
		"\u0146\u0147\f\23\2\2\u0147\u0148\t\7\2\2\u0148\u0162\5(\25\24\u0149\u014a"+
		"\f\22\2\2\u014a\u014b\t\b\2\2\u014b\u0162\5(\25\23\u014c\u014d\f\21\2"+
		"\2\u014d\u014e\t\t\2\2\u014e\u0162\5(\25\22\u014f\u0150\f\20\2\2\u0150"+
		"\u0151\7:\2\2\u0151\u0162\5(\25\21\u0152\u0153\f\17\2\2\u0153\u0154\7"+
		";\2\2\u0154\u0162\5(\25\20\u0155\u0156\f\16\2\2\u0156\u0157\7<\2\2\u0157"+
		"\u0162\5(\25\17\u0158\u0159\f\r\2\2\u0159\u015a\7=\2\2\u015a\u0162\5("+
		"\25\16\u015b\u015c\f\f\2\2\u015c\u015d\7>\2\2\u015d\u0162\5(\25\r\u015e"+
		"\u015f\f\13\2\2\u015f\u0160\t\n\2\2\u0160\u0162\5(\25\f\u0161\u0140\3"+
		"\2\2\2\u0161\u0143\3\2\2\2\u0161\u0146\3\2\2\2\u0161\u0149\3\2\2\2\u0161"+
		"\u014c\3\2\2\2\u0161\u014f\3\2\2\2\u0161\u0152\3\2\2\2\u0161\u0155\3\2"+
		"\2\2\u0161\u0158\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015e\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164)\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0167\7I\2\2\u0167\u016f\7T\2\2\u0168\u0169"+
		"\7T\2\2\u0169\u016f\7I\2\2\u016a\u016b\7J\2\2\u016b\u016f\7T\2\2\u016c"+
		"\u016d\7T\2\2\u016d\u016f\7J\2\2\u016e\u0166\3\2\2\2\u016e\u0168\3\2\2"+
		"\2\u016e\u016a\3\2\2\2\u016e\u016c\3\2\2\2\u016f+\3\2\2\2\u0170\u0171"+
		"\7T\2\2\u0171\u0173\7!\2\2\u0172\u0174\5.\30\2\u0173\u0172\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\"\2\2\u0176-\3\2\2\2"+
		"\u0177\u017c\5(\25\2\u0178\u0179\7\f\2\2\u0179\u017b\5(\25\2\u017a\u0178"+
		"\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"/\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7K\2\2\u0180\u0181\5\30\r\2"+
		"\u0181\u0182\7T\2\2\u0182\u0183\7\7\2\2\u0183\u018a\3\2\2\2\u0184\u0185"+
		"\7K\2\2\u0185\u0186\5\30\r\2\u0186\u0187\5\22\n\2\u0187\u0188\7\7\2\2"+
		"\u0188\u018a\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0184\3\2\2\2\u018a\61"+
		"\3\2\2\2 8>CL\\my\u0083\u0090\u009c\u00a4\u00ab\u00b5\u00d0\u00f0\u00f5"+
		"\u00fb\u0100\u010c\u0113\u011b\u0126\u012b\u013e\u0161\u0163\u016e\u0173"+
		"\u017c\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}