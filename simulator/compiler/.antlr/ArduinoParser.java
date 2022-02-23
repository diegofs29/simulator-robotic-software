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
		enterRule(_localctx, 16, RULE_array_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__9);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_CONST) {
				{
				setState(111);
				match(INT_CONST);
				}
			}

			setState(114);
			match(T__10);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(115);
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
		enterRule(_localctx, 18, RULE_array_elements);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__11);
				setState(119);
				array_elements();
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					match(T__12);
					setState(121);
					array_elements();
					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__12 );
				setState(126);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__11);
				setState(129);
				((Array_elementsContext)_localctx).expression = expression(0);
				((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(130);
					match(T__12);
					setState(131);
					((Array_elementsContext)_localctx).expression = expression(0);
					((Array_elementsContext)_localctx).elements.add(((Array_elementsContext)_localctx).expression);
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
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
			setState(141);
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
			setState(143);
			((FunctionContext)_localctx).v_type = var_type();
			setState(144);
			match(ID);
			setState(145);
			match(T__30);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
				{
				setState(146);
				((FunctionContext)_localctx).f_args = function_args();
				}
			}

			setState(149);
			match(T__31);
			setState(150);
			match(T__11);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (BINARY_CONST - 69)) | (1L << (OCTAL_CONST - 69)) | (1L << (HEX_CONST - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
				{
				{
				setState(151);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
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
			setState(159);
			((Function_argsContext)_localctx).simple_declaration = simple_declaration();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_declaration);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(160);
				match(T__12);
				setState(161);
				((Function_argsContext)_localctx).simple_declaration = simple_declaration();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_declaration);
				}
				}
				setState(166);
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
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(168);
				match(T__30);
				setState(169);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(170);
				match(T__31);
				setState(171);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(174);
				((Iteration_sentenceContext)_localctx).code = code_block();
				setState(175);
				match(T__32);
				setState(176);
				match(T__30);
				setState(177);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(178);
				match(T__31);
				setState(179);
				match(T__4);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				((Iteration_sentenceContext)_localctx).it_type = match(T__34);
				setState(182);
				match(T__30);
				setState(183);
				((Iteration_sentenceContext)_localctx).assign_def = simple_declaration();
				setState(184);
				match(T__4);
				setState(185);
				((Iteration_sentenceContext)_localctx).condition = expression(0);
				setState(186);
				match(T__4);
				setState(187);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(188);
				match(T__31);
				setState(189);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(194);
				match(T__30);
				setState(195);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(196);
				match(T__31);
				setState(197);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__35);
				setState(200);
				match(T__30);
				setState(201);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(202);
				match(T__31);
				setState(203);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				setState(204);
				match(T__36);
				setState(205);
				((Conditional_sentenceContext)_localctx).else_code = code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(208);
				match(T__30);
				setState(209);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(210);
				match(T__31);
				setState(211);
				match(T__11);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__43) {
					{
					{
					setState(212);
					((Conditional_sentenceContext)_localctx).case_sentence = case_sentence();
					((Conditional_sentenceContext)_localctx).sentences.add(((Conditional_sentenceContext)_localctx).case_sentence);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(218);
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
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__11);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__44) | (1L << T__45))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (BINARY_CONST - 69)) | (1L << (OCTAL_CONST - 69)) | (1L << (HEX_CONST - 69)) | (1L << (INT_CONST - 69)) | (1L << (FLOAT_CONST - 69)) | (1L << (CHAR_CONST - 69)) | (1L << (STRING_CONST - 69)) | (1L << (ID - 69)))) != 0)) {
					{
					{
					setState(223);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
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
				setState(230);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((SentenceContext)_localctx).dec = declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((SentenceContext)_localctx).it_sent = iteration_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				((SentenceContext)_localctx).cond_sent = conditional_sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				((SentenceContext)_localctx).assign = assignment();
				setState(237);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				((SentenceContext)_localctx).expr = expression(0);
				setState(240);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (BINARY_CONST - 31)) | (1L << (OCTAL_CONST - 31)) | (1L << (HEX_CONST - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(243);
					((SentenceContext)_localctx).expr = expression(0);
					}
				}

				setState(246);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(248);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				((SentenceContext)_localctx).s_type = match(T__40);
				setState(250);
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
			setState(253);
			((AssignmentContext)_localctx).assign = expression(0);
			setState(254);
			match(T__7);
			setState(255);
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
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((Case_sentenceContext)_localctx).sent_type = match(T__41);
				setState(258);
				((Case_sentenceContext)_localctx).expr = expression(0);
				setState(259);
				match(T__42);
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(265);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(266);
				match(T__39);
				setState(267);
				match(T__4);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				((Case_sentenceContext)_localctx).sent_type = match(T__43);
				setState(270);
				match(T__42);
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(271);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(277);
				match(T__39);
				setState(278);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(282);
				match(T__30);
				setState(283);
				((ExpressionContext)_localctx).r_expr = expression(0);
				setState(284);
				match(T__31);
				}
				break;
			case 2:
				{
				setState(286);
				((ExpressionContext)_localctx).f_call = function_call();
				}
				break;
			case 3:
				{
				setState(287);
				((ExpressionContext)_localctx).i_d_expr = incdec_expression();
				}
				break;
			case 4:
				{
				setState(288);
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
				setState(289);
				((ExpressionContext)_localctx).expr = expression(22);
				}
				break;
			case 5:
				{
				setState(290);
				match(T__68);
				}
				break;
			case 6:
				{
				setState(291);
				match(T__69);
				}
				break;
			case 7:
				{
				setState(292);
				match(HEX_CONST);
				}
				break;
			case 8:
				{
				setState(293);
				match(OCTAL_CONST);
				}
				break;
			case 9:
				{
				setState(294);
				match(BINARY_CONST);
				}
				break;
			case 10:
				{
				setState(295);
				match(INT_CONST);
				}
				break;
			case 11:
				{
				setState(296);
				match(FLOAT_CONST);
				}
				break;
			case 12:
				{
				setState(297);
				match(CHAR_CONST);
				}
				break;
			case 13:
				{
				setState(298);
				match(STRING_CONST);
				}
				break;
			case 14:
				{
				setState(299);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(303);
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
						setState(304);
						((ExpressionContext)_localctx).right = expression(22);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(306);
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
						setState(307);
						((ExpressionContext)_localctx).right = expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(309);
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
						setState(310);
						((ExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(312);
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
						setState(313);
						((ExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(315);
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
						setState(316);
						((ExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(318);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(319);
						((ExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(321);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(322);
						((ExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(324);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(325);
						((ExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(327);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(328);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(330);
						((ExpressionContext)_localctx).operator = match(T__59);
						setState(331);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(333);
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
						setState(334);
						((ExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array_name = _prevctx;
						_localctx.array_name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(336);
						match(T__9);
						setState(337);
						((ExpressionContext)_localctx).index = expression(0);
						setState(338);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(344);
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
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(346);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(ID);
				setState(348);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				((Incdec_expressionContext)_localctx).operator = match(T__71);
				setState(350);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(ID);
				setState(352);
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
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((Function_callContext)_localctx).obj = match(ID);
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						match(T__2);
						setState(357);
						((Function_callContext)_localctx).ID = match(ID);
						((Function_callContext)_localctx).elems.add(((Function_callContext)_localctx).ID);
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(363);
				match(T__2);
				setState(364);
				((Function_callContext)_localctx).f_call = function_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				((Function_callContext)_localctx).f_name = match(ID);
				setState(366);
				match(T__30);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__68 - 31)) | (1L << (T__69 - 31)) | (1L << (T__70 - 31)) | (1L << (T__71 - 31)) | (1L << (BINARY_CONST - 31)) | (1L << (OCTAL_CONST - 31)) | (1L << (HEX_CONST - 31)) | (1L << (INT_CONST - 31)) | (1L << (FLOAT_CONST - 31)) | (1L << (CHAR_CONST - 31)) | (1L << (STRING_CONST - 31)) | (1L << (ID - 31)))) != 0)) {
					{
					setState(367);
					((Function_callContext)_localctx).args = parameter();
					}
				}

				setState(370);
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
			setState(373);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(374);
				match(T__12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6W\n\6\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\be\n\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\5\ns\n\n"+
		"\3\n\3\n\5\nw\n\n\3\13\3\13\3\13\3\13\6\13}\n\13\r\13\16\13~\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u0087\n\13\f\13\16\13\u008a\13\13\3\13\3\13"+
		"\5\13\u008e\n\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\r\3\r\3\r\7\r"+
		"\u009b\n\r\f\r\16\r\u009e\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u00a5\n\16"+
		"\f\16\16\16\u00a8\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u00c2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d8\n\20\f\20"+
		"\16\20\u00db\13\20\3\20\3\20\5\20\u00df\n\20\3\21\3\21\7\21\u00e3\n\21"+
		"\f\21\16\21\u00e6\13\21\3\21\3\21\5\21\u00ea\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00fe\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0108"+
		"\n\24\f\24\16\24\u010b\13\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0113"+
		"\n\24\f\24\16\24\u0116\13\24\3\24\3\24\5\24\u011a\n\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u012f\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0157\n\25\f\25\16\25\u015a\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0164\n\26\3\27\3\27\3\27\7\27\u0169\n\27\f\27\16"+
		"\27\u016c\13\27\3\27\3\27\3\27\3\27\3\27\5\27\u0173\n\27\3\27\5\27\u0176"+
		"\n\27\3\30\3\30\3\30\7\30\u017b\n\30\f\30\16\30\u017e\13\30\3\30\2\3("+
		"\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\13\3\2\b\t\4\2\21"+
		" VV\3\2/\60\3\2\61\63\3\2\64\65\3\2KL\5\2\4\4\6\6\66\67\3\289\3\2?F\2"+
		"\u01ad\2\60\3\2\2\2\4\66\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\nV\3\2\2\2\fX\3"+
		"\2\2\2\16^\3\2\2\2\20n\3\2\2\2\22p\3\2\2\2\24\u008d\3\2\2\2\26\u008f\3"+
		"\2\2\2\30\u0091\3\2\2\2\32\u00a1\3\2\2\2\34\u00c1\3\2\2\2\36\u00de\3\2"+
		"\2\2 \u00e9\3\2\2\2\"\u00fd\3\2\2\2$\u00ff\3\2\2\2&\u0119\3\2\2\2(\u012e"+
		"\3\2\2\2*\u0163\3\2\2\2,\u0175\3\2\2\2.\u0177\3\2\2\2\60\61\5\4\3\2\61"+
		"\62\7\2\2\3\62\3\3\2\2\2\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5\b\5\2:9\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\5\3\2\2\2><\3\2\2\2?@\7\3\2\2@H\7T\2\2AB\7"+
		"\3\2\2BC\7\4\2\2CD\7V\2\2DE\7\5\2\2EF\7V\2\2FH\7\6\2\2G?\3\2\2\2GA\3\2"+
		"\2\2H\7\3\2\2\2IL\5\n\6\2JL\5\30\r\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MN"+
		"\5\f\7\2NO\7\7\2\2OW\3\2\2\2PQ\5\16\b\2QR\7\7\2\2RW\3\2\2\2SW\5\20\t\2"+
		"TU\t\2\2\2UW\5\n\6\2VM\3\2\2\2VP\3\2\2\2VS\3\2\2\2VT\3\2\2\2W\13\3\2\2"+
		"\2XY\5\26\f\2Y\\\7V\2\2Z[\7\n\2\2[]\5(\25\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3"+
		"\2\2\2^_\5\26\f\2_`\7V\2\2`f\5\22\n\2ad\7\n\2\2be\5(\25\2ce\5\24\13\2"+
		"db\3\2\2\2dc\3\2\2\2eg\3\2\2\2fa\3\2\2\2fg\3\2\2\2g\17\3\2\2\2hi\7\13"+
		"\2\2ij\7V\2\2jo\5(\25\2kl\7\13\2\2lm\7V\2\2mo\5\24\13\2nh\3\2\2\2nk\3"+
		"\2\2\2o\21\3\2\2\2pr\7\f\2\2qs\7P\2\2rq\3\2\2\2rs\3\2\2\2st\3\2\2\2tv"+
		"\7\r\2\2uw\5\22\n\2vu\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xy\7\16\2\2y|\5\24"+
		"\13\2z{\7\17\2\2{}\5\24\13\2|z\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\7\20\2\2\u0081\u008e\3\2\2\2\u0082\u0083"+
		"\7\16\2\2\u0083\u0088\5(\25\2\u0084\u0085\7\17\2\2\u0085\u0087\5(\25\2"+
		"\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\20\2\2"+
		"\u008c\u008e\3\2\2\2\u008dx\3\2\2\2\u008d\u0082\3\2\2\2\u008e\25\3\2\2"+
		"\2\u008f\u0090\t\3\2\2\u0090\27\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093"+
		"\7V\2\2\u0093\u0095\7!\2\2\u0094\u0096\5\32\16\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\"\2\2\u0098\u009c\7\16"+
		"\2\2\u0099\u009b\5\"\22\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7\20\2\2\u00a0\31\3\2\2\2\u00a1\u00a6\5\f\7\2\u00a2\u00a3"+
		"\7\17\2\2\u00a3\u00a5\5\f\7\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7!\2\2\u00ab\u00ac\5(\25\2\u00ac"+
		"\u00ad\7\"\2\2\u00ad\u00ae\5 \21\2\u00ae\u00c2\3\2\2\2\u00af\u00b0\7$"+
		"\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7#\2\2\u00b2\u00b3\7!\2\2\u00b3\u00b4"+
		"\5(\25\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7\7\2\2\u00b6\u00c2\3\2\2\2\u00b7"+
		"\u00b8\7%\2\2\u00b8\u00b9\7!\2\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\7\7\2"+
		"\2\u00bb\u00bc\5(\25\2\u00bc\u00bd\7\7\2\2\u00bd\u00be\5(\25\2\u00be\u00bf"+
		"\7\"\2\2\u00bf\u00c0\5 \21\2\u00c0\u00c2\3\2\2\2\u00c1\u00a9\3\2\2\2\u00c1"+
		"\u00af\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\7&\2\2"+
		"\u00c4\u00c5\7!\2\2\u00c5\u00c6\5(\25\2\u00c6\u00c7\7\"\2\2\u00c7\u00c8"+
		"\5 \21\2\u00c8\u00df\3\2\2\2\u00c9\u00ca\7&\2\2\u00ca\u00cb\7!\2\2\u00cb"+
		"\u00cc\5(\25\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7\'"+
		"\2\2\u00cf\u00d0\5 \21\2\u00d0\u00df\3\2\2\2\u00d1\u00d2\7(\2\2\u00d2"+
		"\u00d3\7!\2\2\u00d3\u00d4\5(\25\2\u00d4\u00d5\7\"\2\2\u00d5\u00d9\7\16"+
		"\2\2\u00d6\u00d8\5&\24\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00dd\7\20\2\2\u00dd\u00df\3\2\2\2\u00de\u00c3\3\2\2\2\u00de"+
		"\u00c9\3\2\2\2\u00de\u00d1\3\2\2\2\u00df\37\3\2\2\2\u00e0\u00e4\7\16\2"+
		"\2\u00e1\u00e3\5\"\22\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e7\u00ea\7\20\2\2\u00e8\u00ea\5\"\22\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00fe\5\n\6\2\u00ec\u00fe\5\34\17"+
		"\2\u00ed\u00fe\5\36\20\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7\7\2\2\u00f0"+
		"\u00fe\3\2\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\7\2\2\u00f3\u00fe\3\2"+
		"\2\2\u00f4\u00f6\7)\2\2\u00f5\u00f7\5(\25\2\u00f6\u00f5\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fe\7\7\2\2\u00f9\u00fa\7*"+
		"\2\2\u00fa\u00fe\7\7\2\2\u00fb\u00fc\7+\2\2\u00fc\u00fe\7\7\2\2\u00fd"+
		"\u00eb\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fd\u00ee\3\2"+
		"\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe#\3\2\2\2\u00ff\u0100\5(\25\2\u0100\u0101\7\n\2\2"+
		"\u0101\u0102\5(\25\2\u0102%\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\5("+
		"\25\2\u0105\u0109\7-\2\2\u0106\u0108\5\"\22\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7*\2\2\u010d\u010e\7\7\2\2\u010e"+
		"\u011a\3\2\2\2\u010f\u0110\7.\2\2\u0110\u0114\7-\2\2\u0111\u0113\5\"\22"+
		"\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7*\2\2\u0118"+
		"\u011a\7\7\2\2\u0119\u0103\3\2\2\2\u0119\u010f\3\2\2\2\u011a\'\3\2\2\2"+
		"\u011b\u011c\b\25\1\2\u011c\u011d\7!\2\2\u011d\u011e\5(\25\2\u011e\u011f"+
		"\7\"\2\2\u011f\u012f\3\2\2\2\u0120\u012f\5,\27\2\u0121\u012f\5*\26\2\u0122"+
		"\u0123\t\4\2\2\u0123\u012f\5(\25\30\u0124\u012f\7G\2\2\u0125\u012f\7H"+
		"\2\2\u0126\u012f\7O\2\2\u0127\u012f\7N\2\2\u0128\u012f\7M\2\2\u0129\u012f"+
		"\7P\2\2\u012a\u012f\7Q\2\2\u012b\u012f\7R\2\2\u012c\u012f\7T\2\2\u012d"+
		"\u012f\7V\2\2\u012e\u011b\3\2\2\2\u012e\u0120\3\2\2\2\u012e\u0121\3\2"+
		"\2\2\u012e\u0122\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0125\3\2\2\2\u012e"+
		"\u0126\3\2\2\2\u012e\u0127\3\2\2\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0158\3\2\2\2\u0130\u0131\f\27\2\2\u0131\u0132\t"+
		"\5\2\2\u0132\u0157\5(\25\30\u0133\u0134\f\26\2\2\u0134\u0135\t\6\2\2\u0135"+
		"\u0157\5(\25\27\u0136\u0137\f\25\2\2\u0137\u0138\t\7\2\2\u0138\u0157\5"+
		"(\25\26\u0139\u013a\f\24\2\2\u013a\u013b\t\b\2\2\u013b\u0157\5(\25\25"+
		"\u013c\u013d\f\23\2\2\u013d\u013e\t\t\2\2\u013e\u0157\5(\25\24\u013f\u0140"+
		"\f\22\2\2\u0140\u0141\7:\2\2\u0141\u0157\5(\25\23\u0142\u0143\f\21\2\2"+
		"\u0143\u0144\7;\2\2\u0144\u0157\5(\25\22\u0145\u0146\f\20\2\2\u0146\u0147"+
		"\7<\2\2\u0147\u0157\5(\25\21\u0148\u0149\f\17\2\2\u0149\u014a\7=\2\2\u014a"+
		"\u0157\5(\25\20\u014b\u014c\f\16\2\2\u014c\u014d\7>\2\2\u014d\u0157\5"+
		"(\25\17\u014e\u014f\f\r\2\2\u014f\u0150\t\n\2\2\u0150\u0157\5(\25\16\u0151"+
		"\u0152\f\31\2\2\u0152\u0153\7\f\2\2\u0153\u0154\5(\25\2\u0154\u0155\7"+
		"\r\2\2\u0155\u0157\3\2\2\2\u0156\u0130\3\2\2\2\u0156\u0133\3\2\2\2\u0156"+
		"\u0136\3\2\2\2\u0156\u0139\3\2\2\2\u0156\u013c\3\2\2\2\u0156\u013f\3\2"+
		"\2\2\u0156\u0142\3\2\2\2\u0156\u0145\3\2\2\2\u0156\u0148\3\2\2\2\u0156"+
		"\u014b\3\2\2\2\u0156\u014e\3\2\2\2\u0156\u0151\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159)\3\2\2\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015c\7I\2\2\u015c\u0164\7V\2\2\u015d\u015e\7V\2\2\u015e"+
		"\u0164\7I\2\2\u015f\u0160\7J\2\2\u0160\u0164\7V\2\2\u0161\u0162\7V\2\2"+
		"\u0162\u0164\7J\2\2\u0163\u015b\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015f"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0164+\3\2\2\2\u0165\u016a\7V\2\2\u0166\u0167"+
		"\7\5\2\2\u0167\u0169\7V\2\2\u0168\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u016e\7\5\2\2\u016e\u0176\5,\27\2\u016f\u0170\7V\2\2\u0170"+
		"\u0172\7!\2\2\u0171\u0173\5.\30\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0176\7\"\2\2\u0175\u0165\3\2\2\2\u0175"+
		"\u016f\3\2\2\2\u0176-\3\2\2\2\u0177\u017c\5(\25\2\u0178\u0179\7\17\2\2"+
		"\u0179\u017b\5(\25\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d/\3\2\2\2\u017e\u017c\3\2\2\2%\66<G"+
		"KV\\dfnrv~\u0088\u008d\u0095\u009c\u00a6\u00c1\u00d9\u00de\u00e4\u00e9"+
		"\u00f6\u00fd\u0109\u0114\u0119\u012e\u0156\u0158\u0163\u016a\u0172\u0175"+
		"\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}