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
		RULE_start = 0, RULE_program = 1, RULE_include = 2, RULE_program_code = 3, 
		RULE_declaration = 4, RULE_simple_declaration = 5, RULE_array_declaration = 6, 
		RULE_define_declaration = 7, RULE_array_index = 8, RULE_array_elements = 9, 
		RULE_var_type = 10, RULE_function = 11, RULE_function_args = 12, RULE_iteration_sentence = 13, 
		RULE_conditional_sentence = 14, RULE_code_block = 15, RULE_sentence = 16, 
		RULE_assignment = 17, RULE_case_sentence = 18, RULE_expression = 19, RULE_incdec_expression = 20, 
		RULE_function_call = 21, RULE_parameter = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "include", "program_code", "declaration", "simple_declaration", 
			"array_declaration", "define_declaration", "array_index", "array_elements", 
			"var_type", "function", "function_args", "iteration_sentence", "conditional_sentence", 
			"code_block", "sentence", "assignment", "case_sentence", "expression", 
			"incdec_expression", "function_call", "parameter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'.'", "'>'", "';'", "'const'", "'static'", 
			"'='", "'#define'", "'['", "']'", "'{'", "','", "'}'", "'bool'", "'boolean'", 
			"'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", 
			"'size_t'", "'string'", "'unsigned int'", "'unsigned char'", "'unsigned long'", 
			"'void'", "'word'", "'('", "')'", "'while'", "'do'", "'for'", "'if'", 
			"'else'", "'switch'", "'return'", "'break'", "'continue'", "'case'", 
			"':'", "'default'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", "'-'", 
			"'>='", "'<='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'%='", "'&='", "'*='", "'+='", "'-='", "'/='", "'^='", "'|='", "'true'", 
			"'false'", "'++'", "'--'"
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
			setState(46);
			program();
			setState(47);
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
		public IncludeContext include;
		public List<IncludeContext> include_directives = new ArrayList<IncludeContext>();
		public Program_codeContext program_code;
		public List<Program_codeContext> code = new ArrayList<Program_codeContext>();
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(49);
				((ProgramContext)_localctx).include = include();
				((ProgramContext)_localctx).include_directives.add(((ProgramContext)_localctx).include);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
				{
				{
				setState(55);
				((ProgramContext)_localctx).program_code = program_code();
				((ProgramContext)_localctx).code.add(((ProgramContext)_localctx).program_code);
				}
				}
				setState(60);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(ArduinoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoParser.ID, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_include);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				match(T__0);
				setState(62);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__0);
				setState(64);
				match(T__1);
				setState(65);
				match(ID);
				setState(66);
				match(T__2);
				setState(67);
				match(ID);
				setState(68);
				match(T__3);
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

	public static class Program_codeContext extends ParserRuleContext {
		public DeclarationContext var_dec;
		public FunctionContext func_def;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		enterRule(_localctx, 6, RULE_program_code);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((Program_codeContext)_localctx).var_dec = declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
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
		public Simple_declarationContext s_def;
		public Array_declarationContext a_def;
		public Define_declarationContext def_dec;
		public Token qual;
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public Define_declarationContext define_declaration() {
			return getRuleContext(Define_declarationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((DeclarationContext)_localctx).s_def = simple_declaration();
				setState(76);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((DeclarationContext)_localctx).a_def = array_declaration();
				setState(79);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((DeclarationContext)_localctx).def_dec = define_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				((DeclarationContext)_localctx).qual = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__6) ) {
					((DeclarationContext)_localctx).qual = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				declaration();
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

	public static class Simple_declarationContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public ExpressionContext val;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Simple_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_declaration; }
	}

	public final Simple_declarationContext simple_declaration() throws RecognitionException {
		Simple_declarationContext _localctx = new Simple_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((Simple_declarationContext)_localctx).v_type = var_type();
			setState(87);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(88);
				match(T__7);
				setState(89);
				((Simple_declarationContext)_localctx).val = expression(0);
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

	public static class Array_declarationContext extends ParserRuleContext {
		public Var_typeContext v_type;
		public Array_indexContext a_index;
		public ExpressionContext expr;
		public Array_elementsContext elems;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((Array_declarationContext)_localctx).v_type = var_type();
			setState(93);
			match(ID);
			setState(94);
			((Array_declarationContext)_localctx).a_index = array_index();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(95);
				match(T__7);
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
				case T__44:
				case T__45:
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
					{
					setState(96);
					((Array_declarationContext)_localctx).expr = expression(0);
					}
					break;
				case T__11:
					{
					setState(97);
					((Array_declarationContext)_localctx).elems = array_elements();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Define_declarationContext extends ParserRuleContext {
		public ExpressionContext val;
		public Array_elementsContext elems;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Define_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_declaration; }
	}

	public final Define_declarationContext define_declaration() throws RecognitionException {
		Define_declarationContext _localctx = new Define_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_declaration);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__8);
				setState(103);
				match(ID);
				setState(104);
				((Define_declarationContext)_localctx).val = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__8);
				setState(106);
				match(ID);
				setState(107);
				((Define_declarationContext)_localctx).elems = array_elements();
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
		public Token s10;
		public List<Token> dimensions = new ArrayList<Token>();
		public Token INT_CONST;
		public List<Token> sizes = new ArrayList<Token>();
		public List<TerminalNode> INT_CONST() { return getTokens(ArduinoParser.INT_CONST); }
		public TerminalNode INT_CONST(int i) {
			return getToken(ArduinoParser.INT_CONST, i);
		}
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((Array_indexContext)_localctx).s10 = match(T__9);
			((Array_indexContext)_localctx).dimensions.add(((Array_indexContext)_localctx).s10);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_CONST) {
				{
				setState(111);
				((Array_indexContext)_localctx).INT_CONST = match(INT_CONST);
				((Array_indexContext)_localctx).sizes.add(((Array_indexContext)_localctx).INT_CONST);
				}
			}

			setState(114);
			match(T__10);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(115);
				((Array_indexContext)_localctx).s10 = match(T__9);
				((Array_indexContext)_localctx).dimensions.add(((Array_indexContext)_localctx).s10);
				setState(116);
				((Array_indexContext)_localctx).INT_CONST = match(INT_CONST);
				((Array_indexContext)_localctx).sizes.add(((Array_indexContext)_localctx).INT_CONST);
				setState(117);
				match(T__10);
				}
				}
				setState(122);
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
		enterRule(_localctx, 18, RULE_array_elements);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__11);
				setState(124);
				array_elements();
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					match(T__12);
					setState(126);
					array_elements();
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 );
				setState(131);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__11);
				setState(134);
				((Array_elementsContext)_localctx).expression = expression(0);
				((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(135);
					match(T__12);
					setState(136);
					((Array_elementsContext)_localctx).expression = expression(0);
					((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__13);
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

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((FunctionContext)_localctx).v_type = var_type();
			setState(149);
			match(ID);
			setState(150);
			match(T__30);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
				{
				setState(151);
				((FunctionContext)_localctx).f_args = function_args();
				}
			}

			setState(154);
			match(T__31);
			setState(155);
			match(T__11);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (BINARY_CONST - 69)) | (1L << (OCTAL_CONST - 69)) | (1L << (HEX_CONST - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
				{
				{
				setState(156);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(T__13);
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
		public Simple_declarationContext simple_declaration;
		public List<Simple_declarationContext> f_args = new ArrayList<Simple_declarationContext>();
		public List<Simple_declarationContext> simple_declaration() {
			return getRuleContexts(Simple_declarationContext.class);
		}
		public Simple_declarationContext simple_declaration(int i) {
			return getRuleContext(Simple_declarationContext.class,i);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((Function_argsContext)_localctx).simple_declaration = simple_declaration();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_declaration);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(165);
				match(T__12);
				setState(166);
				((Function_argsContext)_localctx).simple_declaration = simple_declaration();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_declaration);
				}
				}
				setState(171);
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
		public Simple_declarationContext assign_def;
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
		public Simple_declarationContext simple_declaration() {
			return getRuleContext(Simple_declarationContext.class,0);
		}
		public Iteration_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_sentence; }
	}

	public final Iteration_sentenceContext iteration_sentence() throws RecognitionException {
		Iteration_sentenceContext _localctx = new Iteration_sentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iteration_sentence);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(173);
				match(T__30);
				setState(174);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(175);
				match(T__31);
				setState(176);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(179);
				((Iteration_sentenceContext)_localctx).code = code_block();
				setState(180);
				match(T__32);
				setState(181);
				match(T__30);
				setState(182);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(183);
				match(T__31);
				setState(184);
				match(T__4);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				((Iteration_sentenceContext)_localctx).it_type = match(T__34);
				setState(187);
				match(T__30);
				setState(188);
				((Iteration_sentenceContext)_localctx).assign_def = simple_declaration();
				setState(189);
				match(T__4);
				setState(190);
				((Iteration_sentenceContext)_localctx).condition = expression(0);
				setState(191);
				match(T__4);
				setState(192);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(193);
				match(T__31);
				setState(194);
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
		enterRule(_localctx, 28, RULE_conditional_sentence);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(199);
				match(T__30);
				setState(200);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(201);
				match(T__31);
				setState(202);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(205);
				match(T__30);
				setState(206);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(207);
				match(T__31);
				setState(208);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				setState(209);
				match(T__36);
				setState(210);
				((Conditional_sentenceContext)_localctx).else_code = code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(213);
				match(T__30);
				setState(214);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(215);
				match(T__31);
				setState(216);
				match(T__11);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__43) {
					{
					{
					setState(217);
					((Conditional_sentenceContext)_localctx).case_sentence = case_sentence();
					((Conditional_sentenceContext)_localctx).sentences.add(((Conditional_sentenceContext)_localctx).case_sentence);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(T__13);
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
		enterRule(_localctx, 30, RULE_code_block);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__11);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (BINARY_CONST - 69)) | (1L << (OCTAL_CONST - 69)) | (1L << (HEX_CONST - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					{
					setState(228);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(T__13);
				}
				break;
			case T__5:
			case T__6:
			case T__8:
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
				setState(235);
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
		public DeclarationContext dec;
		public Iteration_sentenceContext it_sent;
		public Conditional_sentenceContext cond_sent;
		public AssignmentContext assign;
		public ExpressionContext expr;
		public Token s_type;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Iteration_sentenceContext iteration_sentence() {
			return getRuleContext(Iteration_sentenceContext.class,0);
		}
		public Conditional_sentenceContext conditional_sentence() {
			return getRuleContext(Conditional_sentenceContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		enterRule(_localctx, 32, RULE_sentence);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((SentenceContext)_localctx).dec = declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((SentenceContext)_localctx).it_sent = iteration_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				((SentenceContext)_localctx).cond_sent = conditional_sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				((SentenceContext)_localctx).assign = assignment();
				setState(242);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				((SentenceContext)_localctx).expr = expression(0);
				setState(245);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (BINARY_CONST - 31)) | (1L << (OCTAL_CONST - 31)) | (1L << (HEX_CONST - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(248);
					((SentenceContext)_localctx).expr = expression(0);
					}
				}

				setState(251);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(252);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(253);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(254);
				((SentenceContext)_localctx).s_type = match(T__40);
				setState(255);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext assign;
		public ExpressionContext value;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((AssignmentContext)_localctx).assign = expression(0);
			setState(259);
			match(T__7);
			setState(260);
			((AssignmentContext)_localctx).value = expression(0);
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
		enterRule(_localctx, 36, RULE_case_sentence);
		try {
			int _alt;
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				((Case_sentenceContext)_localctx).sent_type = match(T__41);
				setState(263);
				((Case_sentenceContext)_localctx).expr = expression(0);
				setState(264);
				match(T__42);
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(270);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(271);
				match(T__39);
				setState(272);
				match(T__4);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				((Case_sentenceContext)_localctx).sent_type = match(T__43);
				setState(275);
				match(T__42);
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(281);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(282);
				match(T__39);
				setState(283);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(287);
				match(T__30);
				setState(288);
				((ExpressionContext)_localctx).r_expr = expression(0);
				setState(289);
				match(T__31);
				}
				break;
			case 2:
				{
				setState(291);
				((ExpressionContext)_localctx).f_call = function_call();
				}
				break;
			case 3:
				{
				setState(292);
				((ExpressionContext)_localctx).i_d_expr = incdec_expression();
				}
				break;
			case 4:
				{
				setState(293);
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
				setState(294);
				((ExpressionContext)_localctx).expr = expression(22);
				}
				break;
			case 5:
				{
				setState(295);
				match(T__68);
				}
				break;
			case 6:
				{
				setState(296);
				match(T__69);
				}
				break;
			case 7:
				{
				setState(297);
				match(HEX_CONST);
				}
				break;
			case 8:
				{
				setState(298);
				match(OCTAL_CONST);
				}
				break;
			case 9:
				{
				setState(299);
				match(BINARY_CONST);
				}
				break;
			case 10:
				{
				setState(300);
				match(INT_CONST);
				}
				break;
			case 11:
				{
				setState(301);
				match(FLOAT_CONST);
				}
				break;
			case 12:
				{
				setState(302);
				match(CHAR_CONST);
				}
				break;
			case 13:
				{
				setState(303);
				match(STRING_CONST);
				}
				break;
			case 14:
				{
				setState(304);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(308);
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
						setState(309);
						((ExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(311);
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
						setState(312);
						((ExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(314);
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
						setState(315);
						((ExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(317);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__51) | (1L << T__52))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						((ExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(320);
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
						setState(321);
						((ExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(323);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(324);
						((ExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(326);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(327);
						((ExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(328);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(329);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(330);
						((ExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(332);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(333);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(335);
						((ExpressionContext)_localctx).operator = match(T__59);
						setState(336);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(337);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(338);
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
						setState(339);
						((ExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array_name = _prevctx;
						_localctx.array_name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(341);
						match(T__9);
						setState(342);
						((ExpressionContext)_localctx).index = expression(0);
						setState(343);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(351);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(ID);
				setState(353);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				((Incdec_expressionContext)_localctx).operator = match(T__71);
				setState(355);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(356);
				match(ID);
				setState(357);
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
		enterRule(_localctx, 42, RULE_function_call);
		int _la;
		try {
			int _alt;
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				((Function_callContext)_localctx).obj = match(ID);
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(361);
						match(T__2);
						setState(362);
						((Function_callContext)_localctx).ID = match(ID);
						((Function_callContext)_localctx).elems.add(((Function_callContext)_localctx).ID);
						}
						} 
					}
					setState(367);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(368);
				match(T__2);
				setState(369);
				((Function_callContext)_localctx).f_call = function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				((Function_callContext)_localctx).f_name = match(ID);
				setState(371);
				match(T__30);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (BINARY_CONST - 31)) | (1L << (OCTAL_CONST - 31)) | (1L << (HEX_CONST - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(372);
					((Function_callContext)_localctx).args = parameter();
					}
				}

				setState(375);
				match(T__31);
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
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(379);
				match(T__12);
				setState(380);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(385);
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
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\be\n\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\5\ns\n\n"+
		"\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13\6\13\u0082"+
		"\n\13\r\13\16\13\u0083\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008c\n\13\f"+
		"\13\16\13\u008f\13\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\r\u009b\n\r\3\r\3\r\3\r\7\r\u00a0\n\r\f\r\16\r\u00a3\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u00aa\n\16\f\16\16\16\u00ad\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c7\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\20\3\20\5\20\u00e4"+
		"\n\20\3\21\3\21\7\21\u00e8\n\21\f\21\16\21\u00eb\13\21\3\21\3\21\5\21"+
		"\u00ef\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00fc\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u0103\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\7\24\u010d\n\24\f\24\16\24\u0110\13\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u0118\n\24\f\24\16\24\u011b\13\24\3\24\3"+
		"\24\5\24\u011f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0134\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u015c\n\25\f\25\16\25\u015f"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0169\n\26\3\27\3"+
		"\27\3\27\7\27\u016e\n\27\f\27\16\27\u0171\13\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0178\n\27\3\27\5\27\u017b\n\27\3\30\3\30\3\30\7\30\u0180\n\30"+
		"\f\30\16\30\u0183\13\30\3\30\2\3(\31\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\2\13\3\2\b\t\4\2\21 VV\3\2/\60\3\2\61\63\3\2\64\65\3\2"+
		"KL\5\2\4\4\6\6\66\67\3\289\3\2?F\2\u01b2\2\60\3\2\2\2\4\66\3\2\2\2\6G"+
		"\3\2\2\2\bK\3\2\2\2\nV\3\2\2\2\fX\3\2\2\2\16^\3\2\2\2\20n\3\2\2\2\22p"+
		"\3\2\2\2\24\u0092\3\2\2\2\26\u0094\3\2\2\2\30\u0096\3\2\2\2\32\u00a6\3"+
		"\2\2\2\34\u00c6\3\2\2\2\36\u00e3\3\2\2\2 \u00ee\3\2\2\2\"\u0102\3\2\2"+
		"\2$\u0104\3\2\2\2&\u011e\3\2\2\2(\u0133\3\2\2\2*\u0168\3\2\2\2,\u017a"+
		"\3\2\2\2.\u017c\3\2\2\2\60\61\5\4\3\2\61\62\7\2\2\3\62\3\3\2\2\2\63\65"+
		"\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2"+
		"\2\28\66\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\5"+
		"\3\2\2\2><\3\2\2\2?@\7\3\2\2@H\7T\2\2AB\7\3\2\2BC\7\4\2\2CD\7V\2\2DE\7"+
		"\5\2\2EF\7V\2\2FH\7\6\2\2G?\3\2\2\2GA\3\2\2\2H\7\3\2\2\2IL\5\n\6\2JL\5"+
		"\30\r\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN\5\f\7\2NO\7\7\2\2OW\3\2\2\2P"+
		"Q\5\16\b\2QR\7\7\2\2RW\3\2\2\2SW\5\20\t\2TU\t\2\2\2UW\5\n\6\2VM\3\2\2"+
		"\2VP\3\2\2\2VS\3\2\2\2VT\3\2\2\2W\13\3\2\2\2XY\5\26\f\2Y\\\7V\2\2Z[\7"+
		"\n\2\2[]\5(\25\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^_\5\26\f\2_`\7V\2\2"+
		"`f\5\22\n\2ad\7\n\2\2be\5(\25\2ce\5\24\13\2db\3\2\2\2dc\3\2\2\2eg\3\2"+
		"\2\2fa\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hi\7\13\2\2ij\7V\2\2jo\5(\25\2kl\7"+
		"\13\2\2lm\7V\2\2mo\5\24\13\2nh\3\2\2\2nk\3\2\2\2o\21\3\2\2\2pr\7\f\2\2"+
		"qs\7P\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tz\7\r\2\2uv\7\f\2\2vw\7P\2\2w"+
		"y\7\r\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\23\3\2\2\2|z\3\2\2"+
		"\2}~\7\16\2\2~\u0081\5\24\13\2\177\u0080\7\17\2\2\u0080\u0082\5\24\13"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\20\2\2\u0086\u0093\3\2\2\2"+
		"\u0087\u0088\7\16\2\2\u0088\u008d\5(\25\2\u0089\u008a\7\17\2\2\u008a\u008c"+
		"\5(\25\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\20"+
		"\2\2\u0091\u0093\3\2\2\2\u0092}\3\2\2\2\u0092\u0087\3\2\2\2\u0093\25\3"+
		"\2\2\2\u0094\u0095\t\3\2\2\u0095\27\3\2\2\2\u0096\u0097\5\26\f\2\u0097"+
		"\u0098\7V\2\2\u0098\u009a\7!\2\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\"\2\2\u009d"+
		"\u00a1\7\16\2\2\u009e\u00a0\5\"\22\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5\31\3\2\2\2\u00a6\u00ab\5\f\7"+
		"\2\u00a7\u00a8\7\17\2\2\u00a8\u00aa\5\f\7\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\33\3\2\2"+
		"\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7#\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1"+
		"\5(\25\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3\5 \21\2\u00b3\u00c7\3\2\2\2\u00b4"+
		"\u00b5\7$\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\7#\2\2\u00b7\u00b8\7!\2"+
		"\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00c7"+
		"\3\2\2\2\u00bc\u00bd\7%\2\2\u00bd\u00be\7!\2\2\u00be\u00bf\5\f\7\2\u00bf"+
		"\u00c0\7\7\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\5("+
		"\25\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00ae\3\2\2\2\u00c6\u00b4\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c7\35\3\2\2"+
		"\2\u00c8\u00c9\7&\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc\u00cd\5 \21\2\u00cd\u00e4\3\2\2\2\u00ce\u00cf\7&\2\2\u00cf"+
		"\u00d0\7!\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3\5 \21"+
		"\2\u00d3\u00d4\7\'\2\2\u00d4\u00d5\5 \21\2\u00d5\u00e4\3\2\2\2\u00d6\u00d7"+
		"\7(\2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\5(\25\2\u00d9\u00da\7\"\2\2\u00da"+
		"\u00de\7\16\2\2\u00db\u00dd\5&\24\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00c8\3"+
		"\2\2\2\u00e3\u00ce\3\2\2\2\u00e3\u00d6\3\2\2\2\u00e4\37\3\2\2\2\u00e5"+
		"\u00e9\7\16\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ef\7\20\2\2\u00ed\u00ef\5\"\22\2\u00ee\u00e5\3"+
		"\2\2\2\u00ee\u00ed\3\2\2\2\u00ef!\3\2\2\2\u00f0\u0103\5\n\6\2\u00f1\u0103"+
		"\5\34\17\2\u00f2\u0103\5\36\20\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\7\7\2"+
		"\2\u00f5\u0103\3\2\2\2\u00f6\u00f7\5(\25\2\u00f7\u00f8\7\7\2\2\u00f8\u0103"+
		"\3\2\2\2\u00f9\u00fb\7)\2\2\u00fa\u00fc\5(\25\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0103\7\7\2\2\u00fe\u00ff\7*"+
		"\2\2\u00ff\u0103\7\7\2\2\u0100\u0101\7+\2\2\u0101\u0103\7\7\2\2\u0102"+
		"\u00f0\3\2\2\2\u0102\u00f1\3\2\2\2\u0102\u00f2\3\2\2\2\u0102\u00f3\3\2"+
		"\2\2\u0102\u00f6\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fe\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103#\3\2\2\2\u0104\u0105\5(\25\2\u0105\u0106\7\n\2\2"+
		"\u0106\u0107\5(\25\2\u0107%\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\5("+
		"\25\2\u010a\u010e\7-\2\2\u010b\u010d\5\"\22\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0113\7\7\2\2\u0113"+
		"\u011f\3\2\2\2\u0114\u0115\7.\2\2\u0115\u0119\7-\2\2\u0116\u0118\5\"\22"+
		"\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7*\2\2\u011d"+
		"\u011f\7\7\2\2\u011e\u0108\3\2\2\2\u011e\u0114\3\2\2\2\u011f\'\3\2\2\2"+
		"\u0120\u0121\b\25\1\2\u0121\u0122\7!\2\2\u0122\u0123\5(\25\2\u0123\u0124"+
		"\7\"\2\2\u0124\u0134\3\2\2\2\u0125\u0134\5,\27\2\u0126\u0134\5*\26\2\u0127"+
		"\u0128\t\4\2\2\u0128\u0134\5(\25\30\u0129\u0134\7G\2\2\u012a\u0134\7H"+
		"\2\2\u012b\u0134\7O\2\2\u012c\u0134\7N\2\2\u012d\u0134\7M\2\2\u012e\u0134"+
		"\7P\2\2\u012f\u0134\7Q\2\2\u0130\u0134\7R\2\2\u0131\u0134\7T\2\2\u0132"+
		"\u0134\7V\2\2\u0133\u0120\3\2\2\2\u0133\u0125\3\2\2\2\u0133\u0126\3\2"+
		"\2\2\u0133\u0127\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u012a\3\2\2\2\u0133"+
		"\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2"+
		"\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0132\3\2\2\2\u0134\u015d\3\2\2\2\u0135\u0136\f\27\2\2\u0136\u0137\t"+
		"\5\2\2\u0137\u015c\5(\25\30\u0138\u0139\f\26\2\2\u0139\u013a\t\6\2\2\u013a"+
		"\u015c\5(\25\27\u013b\u013c\f\25\2\2\u013c\u013d\t\7\2\2\u013d\u015c\5"+
		"(\25\26\u013e\u013f\f\24\2\2\u013f\u0140\t\b\2\2\u0140\u015c\5(\25\25"+
		"\u0141\u0142\f\23\2\2\u0142\u0143\t\t\2\2\u0143\u015c\5(\25\24\u0144\u0145"+
		"\f\22\2\2\u0145\u0146\7:\2\2\u0146\u015c\5(\25\23\u0147\u0148\f\21\2\2"+
		"\u0148\u0149\7;\2\2\u0149\u015c\5(\25\22\u014a\u014b\f\20\2\2\u014b\u014c"+
		"\7<\2\2\u014c\u015c\5(\25\21\u014d\u014e\f\17\2\2\u014e\u014f\7=\2\2\u014f"+
		"\u015c\5(\25\20\u0150\u0151\f\16\2\2\u0151\u0152\7>\2\2\u0152\u015c\5"+
		"(\25\17\u0153\u0154\f\r\2\2\u0154\u0155\t\n\2\2\u0155\u015c\5(\25\16\u0156"+
		"\u0157\f\31\2\2\u0157\u0158\7\f\2\2\u0158\u0159\5(\25\2\u0159\u015a\7"+
		"\r\2\2\u015a\u015c\3\2\2\2\u015b\u0135\3\2\2\2\u015b\u0138\3\2\2\2\u015b"+
		"\u013b\3\2\2\2\u015b\u013e\3\2\2\2\u015b\u0141\3\2\2\2\u015b\u0144\3\2"+
		"\2\2\u015b\u0147\3\2\2\2\u015b\u014a\3\2\2\2\u015b\u014d\3\2\2\2\u015b"+
		"\u0150\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0156\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e)\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0161\7I\2\2\u0161\u0169\7V\2\2\u0162\u0163\7V\2\2\u0163"+
		"\u0169\7I\2\2\u0164\u0165\7J\2\2\u0165\u0169\7V\2\2\u0166\u0167\7V\2\2"+
		"\u0167\u0169\7J\2\2\u0168\u0160\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169+\3\2\2\2\u016a\u016f\7V\2\2\u016b\u016c"+
		"\7\5\2\2\u016c\u016e\7V\2\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0172\u0173\7\5\2\2\u0173\u017b\5,\27\2\u0174\u0175\7V\2\2\u0175"+
		"\u0177\7!\2\2\u0176\u0178\5.\30\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7\"\2\2\u017a\u016a\3\2\2\2\u017a"+
		"\u0174\3\2\2\2\u017b-\3\2\2\2\u017c\u0181\5(\25\2\u017d\u017e\7\17\2\2"+
		"\u017e\u0180\5(\25\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182/\3\2\2\2\u0183\u0181\3\2\2\2%\66<G"+
		"KV\\dfnrz\u0083\u008d\u0092\u009a\u00a1\u00ab\u00c6\u00de\u00e3\u00e9"+
		"\u00ee\u00fb\u0102\u010e\u0119\u011e\u0133\u015b\u015d\u0168\u016f\u0177"+
		"\u017a\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}