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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, INT_CONST=72, FLOAT_CONST=73, 
		CHAR_CONST=74, UNTERMINATED_CHAR=75, STRING_CONST=76, UNTERMINATED_STRING=77, 
		ID=78, LINE_COMMENT=79, MULTILINE_COMMENT=80, WHITESPACE=81;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_assignment = 8, RULE_array_definition = 9, RULE_constant = 10, RULE_var_type = 11, 
		RULE_setup = 12, RULE_loop = 13, RULE_function = 14, RULE_function_args = 15, 
		RULE_iteration_sentence = 16, RULE_conditional_sentence = 17, RULE_code_block = 18, 
		RULE_sentence = 19, RULE_case_sentence = 20, RULE_expression = 21, RULE_incdec_expression = 22, 
		RULE_function_call = 23, RULE_parameter = 24, RULE_static_variable = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "assignment", "array_definition", 
			"constant", "var_type", "setup", "loop", "function", "function_args", 
			"iteration_sentence", "conditional_sentence", "code_block", "sentence", 
			"case_sentence", "expression", "incdec_expression", "function_call", 
			"parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'.'", "';'", "'='", "'['", "']'", 
			"'{'", "','", "'}'", "'const'", "'#define'", "'\n'", "'bool'", "'boolean'", 
			"'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", 
			"'size_t'", "'string'", "'unsigned int'", "'unsigned char'", "'unsigned long'", 
			"'void'", "'word'", "'setup'", "'('", "')'", "'loop'", "'while'", "'do'", 
			"'for'", "'if'", "'else'", "'switch'", "'return'", "'goto'", "'break'", 
			"'continue'", "':'", "'case'", "'default'", "'*'", "'/'", "'+'", "'-'", 
			"'%='", "'&='", "'*='", "'+='", "'-='", "'/='", "'^='", "'|='", "'!='", 
			"'=='", "'>='", "'<='", "'&&'", "'||'", "'!'", "'true'", "'false'", "'++'", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0) || _la==ID) {
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				setup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__0);
				setState(74);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__0);
				setState(76);
				match(T__1);
				setState(77);
				h_file();
				setState(78);
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
			setState(82);
			match(ID);
			setState(83);
			match(T__3);
			setState(84);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				simple_definition();
				setState(87);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				array_definition();
				setState(90);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				assignment_definition();
				setState(93);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
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
			setState(98);
			var_type();
			setState(99);
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
			setState(101);
			var_type();
			setState(102);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ID);
				setState(105);
				match(T__5);
				setState(106);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(ID);
				setState(108);
				match(T__6);
				setState(109);
				match(INT_CONST);
				setState(110);
				match(T__7);
				setState(111);
				match(T__5);
				setState(112);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				var_type();
				setState(116);
				match(ID);
				setState(117);
				match(T__6);
				setState(118);
				match(INT_CONST);
				setState(119);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				var_type();
				setState(122);
				match(ID);
				setState(123);
				match(T__6);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_CONST) {
					{
					setState(124);
					match(INT_CONST);
					}
				}

				setState(127);
				match(T__7);
				setState(128);
				match(T__5);
				setState(129);
				match(T__8);
				setState(130);
				match(INT_CONST);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(131);
					match(T__9);
					setState(132);
					match(INT_CONST);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				var_type();
				setState(141);
				match(ID);
				setState(142);
				match(T__6);
				setState(143);
				match(INT_CONST);
				setState(144);
				match(T__7);
				setState(145);
				match(T__5);
				setState(146);
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
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((ConstantContext)_localctx).const_type = match(T__11);
				setState(151);
				var_type();
				setState(152);
				assignment();
				setState(153);
				match(T__4);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((ConstantContext)_localctx).const_type = match(T__12);
				setState(156);
				match(ID);
				setState(157);
				expression(0);
				setState(158);
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
			setState(162);
			_la = _input.LA(1);
			if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (ID - 15)))) != 0)) ) {
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

	public static class SetupContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__28);
			setState(165);
			match(T__30);
			setState(166);
			match(T__31);
			setState(167);
			match(T__32);
			setState(168);
			match(T__8);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (T__34 - 15)) | (1L << (T__35 - 15)) | (1L << (T__36 - 15)) | (1L << (T__37 - 15)) | (1L << (T__39 - 15)) | (1L << (T__40 - 15)) | (1L << (T__41 - 15)) | (1L << (T__42 - 15)) | (1L << (T__43 - 15)) | (1L << (T__70 - 15)) | (1L << (ID - 15)))) != 0)) {
				{
				{
				setState(169);
				((SetupContext)_localctx).sentence = sentence();
				((SetupContext)_localctx).sentences.add(((SetupContext)_localctx).sentence);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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

	public static class LoopContext extends ParserRuleContext {
		public SentenceContext sentence;
		public List<SentenceContext> sentences = new ArrayList<SentenceContext>();
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__28);
			setState(178);
			match(T__33);
			setState(179);
			match(T__31);
			setState(180);
			match(T__32);
			setState(181);
			match(T__8);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (T__34 - 15)) | (1L << (T__35 - 15)) | (1L << (T__36 - 15)) | (1L << (T__37 - 15)) | (1L << (T__39 - 15)) | (1L << (T__40 - 15)) | (1L << (T__41 - 15)) | (1L << (T__42 - 15)) | (1L << (T__43 - 15)) | (1L << (T__70 - 15)) | (1L << (ID - 15)))) != 0)) {
				{
				{
				setState(182);
				((LoopContext)_localctx).sentence = sentence();
				((LoopContext)_localctx).sentences.add(((LoopContext)_localctx).sentence);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			var_type();
			setState(191);
			match(ID);
			setState(192);
			match(T__31);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (ID - 15)))) != 0)) {
				{
				setState(193);
				function_args();
				}
			}

			setState(196);
			match(T__32);
			setState(197);
			match(T__8);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (T__34 - 15)) | (1L << (T__35 - 15)) | (1L << (T__36 - 15)) | (1L << (T__37 - 15)) | (1L << (T__39 - 15)) | (1L << (T__40 - 15)) | (1L << (T__41 - 15)) | (1L << (T__42 - 15)) | (1L << (T__43 - 15)) | (1L << (T__70 - 15)) | (1L << (ID - 15)))) != 0)) {
				{
				{
				setState(198);
				((FunctionContext)_localctx).sentence = sentence();
				((FunctionContext)_localctx).sentences.add(((FunctionContext)_localctx).sentence);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		enterRule(_localctx, 30, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((Function_argsContext)_localctx).simple_definition = simple_definition();
			((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(207);
				match(T__9);
				setState(208);
				((Function_argsContext)_localctx).simple_definition = simple_definition();
				((Function_argsContext)_localctx).f_args.add(((Function_argsContext)_localctx).simple_definition);
				}
				}
				setState(213);
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
		enterRule(_localctx, 32, RULE_iteration_sentence);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((Iteration_sentenceContext)_localctx).it_type = match(T__34);
				setState(215);
				match(T__31);
				setState(216);
				expression(0);
				setState(217);
				match(T__32);
				setState(218);
				code_block();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((Iteration_sentenceContext)_localctx).it_type = match(T__35);
				setState(221);
				code_block();
				setState(222);
				match(T__34);
				setState(223);
				match(T__31);
				setState(224);
				expression(0);
				setState(225);
				match(T__32);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				((Iteration_sentenceContext)_localctx).it_type = match(T__36);
				setState(228);
				match(T__31);
				setState(229);
				assignment_definition();
				setState(230);
				match(T__4);
				setState(231);
				expression(0);
				setState(232);
				match(T__4);
				setState(233);
				expression(0);
				setState(234);
				match(T__32);
				setState(235);
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
		enterRule(_localctx, 34, RULE_conditional_sentence);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(240);
				match(T__31);
				setState(241);
				expression(0);
				setState(242);
				match(T__32);
				setState(243);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(246);
				match(T__31);
				setState(247);
				expression(0);
				setState(248);
				match(T__32);
				setState(249);
				code_block();
				setState(250);
				match(T__38);
				setState(251);
				conditional_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__37);
				setState(254);
				match(T__31);
				setState(255);
				expression(0);
				setState(256);
				match(T__32);
				setState(257);
				code_block();
				setState(258);
				match(T__38);
				setState(259);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__39);
				setState(262);
				match(T__31);
				setState(263);
				expression(0);
				setState(264);
				match(T__32);
				setState(265);
				match(T__8);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45 || _la==T__46) {
					{
					{
					setState(266);
					case_sentence();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
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
		enterRule(_localctx, 36, RULE_code_block);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(T__8);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (T__14 - 15)) | (1L << (T__15 - 15)) | (1L << (T__16 - 15)) | (1L << (T__17 - 15)) | (1L << (T__18 - 15)) | (1L << (T__19 - 15)) | (1L << (T__20 - 15)) | (1L << (T__21 - 15)) | (1L << (T__22 - 15)) | (1L << (T__23 - 15)) | (1L << (T__24 - 15)) | (1L << (T__25 - 15)) | (1L << (T__26 - 15)) | (1L << (T__27 - 15)) | (1L << (T__28 - 15)) | (1L << (T__29 - 15)) | (1L << (T__34 - 15)) | (1L << (T__35 - 15)) | (1L << (T__36 - 15)) | (1L << (T__37 - 15)) | (1L << (T__39 - 15)) | (1L << (T__40 - 15)) | (1L << (T__41 - 15)) | (1L << (T__42 - 15)) | (1L << (T__43 - 15)) | (1L << (T__70 - 15)) | (1L << (ID - 15)))) != 0)) {
					{
					{
					setState(277);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
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
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__70:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				simple_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				assignment_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				static_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				assignment();
				setState(291);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(293);
				function_call();
				setState(294);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
				((SentenceContext)_localctx).s_type = match(T__40);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (T__31 - 32)) | (1L << (T__65 - 32)) | (1L << (T__66 - 32)) | (1L << (T__67 - 32)) | (1L << (T__68 - 32)) | (1L << (T__69 - 32)) | (1L << (INT_CONST - 32)) | (1L << (FLOAT_CONST - 32)) | (1L << (CHAR_CONST - 32)) | (1L << (STRING_CONST - 32)) | (1L << (ID - 32)))) != 0)) {
					{
					setState(299);
					expression(0);
					}
				}

				setState(302);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(303);
				((SentenceContext)_localctx).s_type = match(T__41);
				setState(304);
				match(ID);
				setState(305);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
				((SentenceContext)_localctx).s_type = match(T__42);
				setState(307);
				match(T__4);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308);
				((SentenceContext)_localctx).s_type = match(T__43);
				setState(309);
				match(T__4);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(310);
				match(ID);
				setState(311);
				match(T__44);
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
		enterRule(_localctx, 40, RULE_case_sentence);
		try {
			int _alt;
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__45);
				setState(315);
				expression(0);
				setState(316);
				match(T__44);
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(322);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(323);
				match(T__42);
				setState(324);
				match(T__4);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__46);
				setState(327);
				match(T__44);
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(328);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(334);
				match(T__42);
				setState(335);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Incdec_expressionContext incdec_expression() {
			return getRuleContext(Incdec_expressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public TerminalNode INT_CONST() { return getToken(ArduinoParser.INT_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(ArduinoParser.FLOAT_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(ArduinoParser.CHAR_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(ArduinoParser.STRING_CONST, 0); }
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
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(339);
				function_call();
				}
				break;
			case 2:
				{
				setState(340);
				match(T__65);
				setState(341);
				expression(11);
				}
				break;
			case 3:
				{
				setState(342);
				match(T__31);
				setState(343);
				expression(0);
				setState(344);
				match(T__32);
				}
				break;
			case 4:
				{
				setState(346);
				incdec_expression();
				}
				break;
			case 5:
				{
				setState(347);
				assignment();
				}
				break;
			case 6:
				{
				setState(348);
				match(T__66);
				}
				break;
			case 7:
				{
				setState(349);
				match(T__67);
				}
				break;
			case 8:
				{
				setState(350);
				match(ID);
				}
				break;
			case 9:
				{
				setState(351);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(352);
				match(FLOAT_CONST);
				}
				break;
			case 11:
				{
				setState(353);
				match(CHAR_CONST);
				}
				break;
			case 12:
				{
				setState(354);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(358);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(360);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(361);
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
						setState(362);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(363);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(364);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(365);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(366);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(367);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(369);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(370);
						((ExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
							((ExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				((Incdec_expressionContext)_localctx).operator = match(T__68);
				setState(378);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(ID);
				setState(380);
				((Incdec_expressionContext)_localctx).operator = match(T__68);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				setState(382);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(ID);
				setState(384);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
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
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(ID);
			setState(388);
			match(T__31);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (T__31 - 32)) | (1L << (T__65 - 32)) | (1L << (T__66 - 32)) | (1L << (T__67 - 32)) | (1L << (T__68 - 32)) | (1L << (T__69 - 32)) | (1L << (INT_CONST - 32)) | (1L << (FLOAT_CONST - 32)) | (1L << (CHAR_CONST - 32)) | (1L << (STRING_CONST - 32)) | (1L << (ID - 32)))) != 0)) {
				{
				setState(389);
				parameter();
				}
			}

			setState(392);
			match(T__32);
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
			setState(394);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(395);
				match(T__9);
				setState(396);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(401);
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
		enterRule(_localctx, 50, RULE_static_variable);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__70);
				setState(403);
				var_type();
				setState(404);
				match(ID);
				setState(405);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(T__70);
				setState(408);
				var_type();
				setState(409);
				assignment();
				setState(410);
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
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7c\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nt\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a3\n\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00ad\n\16\f\16\16\16\u00b0\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ba\n\17\f\17\16\17\u00bd\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00c5\n\20\3\20\3\20\3\20\7\20"+
		"\u00ca\n\20\f\20\16\20\u00cd\13\20\3\20\3\20\3\21\3\21\3\21\7\21\u00d4"+
		"\n\21\f\21\16\21\u00d7\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00f0\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u010e\n\23\f\23\16\23\u0111\13\23\3\23\3\23"+
		"\5\23\u0115\n\23\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\24"+
		"\3\24\5\24\u0120\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u012f\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u013b\n\25\3\26\3\26\3\26\3\26\7\26\u0141\n\26\f\26\16"+
		"\26\u0144\13\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u014c\n\26\f\26\16"+
		"\26\u014f\13\26\3\26\3\26\5\26\u0153\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0166\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u0177\n\27\f\27\16\27\u017a\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0184\n\30\3\31\3\31\3\31\5\31\u0189\n\31\3\31\3"+
		"\31\3\32\3\32\3\32\7\32\u0190\n\32\f\32\16\32\u0193\13\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u019f\n\33\3\33\2\3,\34\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\t\3\3\20\20"+
		"\4\2\21 PP\3\2\62\63\3\2\64\65\3\2\66=\4\2\4\5>A\3\2BC\2\u01c7\2\66\3"+
		"\2\2\2\4<\3\2\2\2\6I\3\2\2\2\bR\3\2\2\2\nT\3\2\2\2\fb\3\2\2\2\16d\3\2"+
		"\2\2\20g\3\2\2\2\22s\3\2\2\2\24\u0096\3\2\2\2\26\u00a2\3\2\2\2\30\u00a4"+
		"\3\2\2\2\32\u00a6\3\2\2\2\34\u00b3\3\2\2\2\36\u00c0\3\2\2\2 \u00d0\3\2"+
		"\2\2\"\u00ef\3\2\2\2$\u0114\3\2\2\2&\u011f\3\2\2\2(\u013a\3\2\2\2*\u0152"+
		"\3\2\2\2,\u0165\3\2\2\2.\u0183\3\2\2\2\60\u0185\3\2\2\2\62\u018c\3\2\2"+
		"\2\64\u019e\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29;\5\b\5\2:9\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\6\4\2@?\3"+
		"\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2\2EJ\5\f\7\2FJ"+
		"\5\32\16\2GJ\5\34\17\2HJ\5\36\20\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2"+
		"\2\2J\7\3\2\2\2KL\7\3\2\2LS\7N\2\2MN\7\3\2\2NO\7\4\2\2OP\5\n\6\2PQ\7\5"+
		"\2\2QS\3\2\2\2RK\3\2\2\2RM\3\2\2\2S\t\3\2\2\2TU\7P\2\2UV\7\6\2\2VW\7P"+
		"\2\2W\13\3\2\2\2XY\5\16\b\2YZ\7\7\2\2Zc\3\2\2\2[\\\5\24\13\2\\]\7\7\2"+
		"\2]c\3\2\2\2^_\5\20\t\2_`\7\7\2\2`c\3\2\2\2ac\5\26\f\2bX\3\2\2\2b[\3\2"+
		"\2\2b^\3\2\2\2ba\3\2\2\2c\r\3\2\2\2de\5\30\r\2ef\7P\2\2f\17\3\2\2\2gh"+
		"\5\30\r\2hi\5\22\n\2i\21\3\2\2\2jk\7P\2\2kl\7\b\2\2lt\5,\27\2mn\7P\2\2"+
		"no\7\t\2\2op\7J\2\2pq\7\n\2\2qr\7\b\2\2rt\5,\27\2sj\3\2\2\2sm\3\2\2\2"+
		"t\23\3\2\2\2uv\5\30\r\2vw\7P\2\2wx\7\t\2\2xy\7J\2\2yz\7\n\2\2z\u0097\3"+
		"\2\2\2{|\5\30\r\2|}\7P\2\2}\177\7\t\2\2~\u0080\7J\2\2\177~\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\u0083\7\b"+
		"\2\2\u0083\u0084\7\13\2\2\u0084\u0089\7J\2\2\u0085\u0086\7\f\2\2\u0086"+
		"\u0088\7J\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7\r\2\2\u008d\u0097\3\2\2\2\u008e\u008f\5\30\r\2\u008f\u0090\7"+
		"P\2\2\u0090\u0091\7\t\2\2\u0091\u0092\7J\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0094\7\b\2\2\u0094\u0095\5,\27\2\u0095\u0097\3\2\2\2\u0096u\3\2\2\2"+
		"\u0096{\3\2\2\2\u0096\u008e\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\7\16"+
		"\2\2\u0099\u009a\5\30\r\2\u009a\u009b\5\22\n\2\u009b\u009c\7\7\2\2\u009c"+
		"\u00a3\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\7P\2\2\u009f\u00a0\5,"+
		"\27\2\u00a0\u00a1\t\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2"+
		"\u009d\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\31\3\2\2\2\u00a6"+
		"\u00a7\7\37\2\2\u00a7\u00a8\7!\2\2\u00a8\u00a9\7\"\2\2\u00a9\u00aa\7#"+
		"\2\2\u00aa\u00ae\7\13\2\2\u00ab\u00ad\5(\25\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\33\3\2\2\2\u00b3\u00b4"+
		"\7\37\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7#\2\2\u00b7"+
		"\u00bb\7\13\2\2\u00b8\u00ba\5(\25\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\r\2\2\u00bf\35\3\2\2\2\u00c0\u00c1\5\30\r"+
		"\2\u00c1\u00c2\7P\2\2\u00c2\u00c4\7\"\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c3"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7"+
		"\u00cb\7\13\2\2\u00c8\u00ca\5(\25\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\r\2\2\u00cf\37\3\2\2\2\u00d0\u00d5\5\16\b"+
		"\2\u00d1\u00d2\7\f\2\2\u00d2\u00d4\5\16\b\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6!\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9\u00da\7\"\2\2\u00da\u00db"+
		"\5,\27\2\u00db\u00dc\7#\2\2\u00dc\u00dd\5&\24\2\u00dd\u00f0\3\2\2\2\u00de"+
		"\u00df\7&\2\2\u00df\u00e0\5&\24\2\u00e0\u00e1\7%\2\2\u00e1\u00e2\7\"\2"+
		"\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\7#\2\2\u00e4\u00f0\3\2\2\2\u00e5\u00e6"+
		"\7\'\2\2\u00e6\u00e7\7\"\2\2\u00e7\u00e8\5\20\t\2\u00e8\u00e9\7\7\2\2"+
		"\u00e9\u00ea\5,\27\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec\5,\27\2\u00ec\u00ed"+
		"\7#\2\2\u00ed\u00ee\5&\24\2\u00ee\u00f0\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef"+
		"\u00de\3\2\2\2\u00ef\u00e5\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2"+
		"\u00f3\7\"\2\2\u00f3\u00f4\5,\27\2\u00f4\u00f5\7#\2\2\u00f5\u00f6\5&\24"+
		"\2\u00f6\u0115\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa"+
		"\5,\27\2\u00fa\u00fb\7#\2\2\u00fb\u00fc\5&\24\2\u00fc\u00fd\7)\2\2\u00fd"+
		"\u00fe\5$\23\2\u00fe\u0115\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7\""+
		"\2\2\u0101\u0102\5,\27\2\u0102\u0103\7#\2\2\u0103\u0104\5&\24\2\u0104"+
		"\u0105\7)\2\2\u0105\u0106\5&\24\2\u0106\u0115\3\2\2\2\u0107\u0108\7*\2"+
		"\2\u0108\u0109\7\"\2\2\u0109\u010a\5,\27\2\u010a\u010b\7#\2\2\u010b\u010f"+
		"\7\13\2\2\u010c\u010e\5*\26\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2"+
		"\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\7\r\2\2\u0113\u0115\3\2\2\2\u0114\u00f1\3\2\2\2\u0114"+
		"\u00f7\3\2\2\2\u0114\u00ff\3\2\2\2\u0114\u0107\3\2\2\2\u0115%\3\2\2\2"+
		"\u0116\u011a\7\13\2\2\u0117\u0119\5(\25\2\u0118\u0117\3\2\2\2\u0119\u011c"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\7\r\2\2\u011e\u0120\5(\25\2\u011f\u0116\3\2"+
		"\2\2\u011f\u011e\3\2\2\2\u0120\'\3\2\2\2\u0121\u013b\5\16\b\2\u0122\u013b"+
		"\5\20\t\2\u0123\u013b\5\64\33\2\u0124\u0125\5\22\n\2\u0125\u0126\7\7\2"+
		"\2\u0126\u013b\3\2\2\2\u0127\u0128\5\60\31\2\u0128\u0129\7\7\2\2\u0129"+
		"\u013b\3\2\2\2\u012a\u013b\5\"\22\2\u012b\u013b\5$\23\2\u012c\u012e\7"+
		"+\2\2\u012d\u012f\5,\27\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u013b\7\7\2\2\u0131\u0132\7,\2\2\u0132\u0133\7P\2"+
		"\2\u0133\u013b\7\7\2\2\u0134\u0135\7-\2\2\u0135\u013b\7\7\2\2\u0136\u0137"+
		"\7.\2\2\u0137\u013b\7\7\2\2\u0138\u0139\7P\2\2\u0139\u013b\7/\2\2\u013a"+
		"\u0121\3\2\2\2\u013a\u0122\3\2\2\2\u013a\u0123\3\2\2\2\u013a\u0124\3\2"+
		"\2\2\u013a\u0127\3\2\2\2\u013a\u012a\3\2\2\2\u013a\u012b\3\2\2\2\u013a"+
		"\u012c\3\2\2\2\u013a\u0131\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0136\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b)\3\2\2\2\u013c\u013d\7\60\2\2\u013d\u013e"+
		"\5,\27\2\u013e\u0142\7/\2\2\u013f\u0141\5(\25\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7-\2\2\u0146\u0147\7\7\2\2\u0147"+
		"\u0153\3\2\2\2\u0148\u0149\7\61\2\2\u0149\u014d\7/\2\2\u014a\u014c\5("+
		"\25\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7-"+
		"\2\2\u0151\u0153\7\7\2\2\u0152\u013c\3\2\2\2\u0152\u0148\3\2\2\2\u0153"+
		"+\3\2\2\2\u0154\u0155\b\27\1\2\u0155\u0166\5\60\31\2\u0156\u0157\7D\2"+
		"\2\u0157\u0166\5,\27\r\u0158\u0159\7\"\2\2\u0159\u015a\5,\27\2\u015a\u015b"+
		"\7#\2\2\u015b\u0166\3\2\2\2\u015c\u0166\5.\30\2\u015d\u0166\5\22\n\2\u015e"+
		"\u0166\7E\2\2\u015f\u0166\7F\2\2\u0160\u0166\7P\2\2\u0161\u0166\7J\2\2"+
		"\u0162\u0166\7K\2\2\u0163\u0166\7L\2\2\u0164\u0166\7N\2\2\u0165\u0154"+
		"\3\2\2\2\u0165\u0156\3\2\2\2\u0165\u0158\3\2\2\2\u0165\u015c\3\2\2\2\u0165"+
		"\u015d\3\2\2\2\u0165\u015e\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0160\3\2"+
		"\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0178\3\2\2\2\u0167\u0168\f\22\2\2\u0168\u0169\t"+
		"\4\2\2\u0169\u0177\5,\27\23\u016a\u016b\f\21\2\2\u016b\u016c\t\5\2\2\u016c"+
		"\u0177\5,\27\22\u016d\u016e\f\20\2\2\u016e\u016f\t\6\2\2\u016f\u0177\5"+
		",\27\21\u0170\u0171\f\17\2\2\u0171\u0172\t\7\2\2\u0172\u0177\5,\27\20"+
		"\u0173\u0174\f\16\2\2\u0174\u0175\t\b\2\2\u0175\u0177\5,\27\17\u0176\u0167"+
		"\3\2\2\2\u0176\u016a\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0170\3\2\2\2\u0176"+
		"\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179-\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7G\2\2\u017c\u0184"+
		"\7P\2\2\u017d\u017e\7P\2\2\u017e\u0184\7G\2\2\u017f\u0180\7H\2\2\u0180"+
		"\u0184\7P\2\2\u0181\u0182\7P\2\2\u0182\u0184\7H\2\2\u0183\u017b\3\2\2"+
		"\2\u0183\u017d\3\2\2\2\u0183\u017f\3\2\2\2\u0183\u0181\3\2\2\2\u0184/"+
		"\3\2\2\2\u0185\u0186\7P\2\2\u0186\u0188\7\"\2\2\u0187\u0189\5\62\32\2"+
		"\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\7#\2\2\u018b\61\3\2\2\2\u018c\u0191\5,\27\2\u018d\u018e\7\f\2\2\u018e"+
		"\u0190\5,\27\2\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\63\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195"+
		"\7I\2\2\u0195\u0196\5\30\r\2\u0196\u0197\7P\2\2\u0197\u0198\7\7\2\2\u0198"+
		"\u019f\3\2\2\2\u0199\u019a\7I\2\2\u019a\u019b\5\30\r\2\u019b\u019c\5\22"+
		"\n\2\u019c\u019d\7\7\2\2\u019d\u019f\3\2\2\2\u019e\u0194\3\2\2\2\u019e"+
		"\u0199\3\2\2\2\u019f\65\3\2\2\2\"<BIRbs\177\u0089\u0096\u00a2\u00ae\u00bb"+
		"\u00c4\u00cb\u00d5\u00ef\u010f\u0114\u011a\u011f\u012e\u013a\u0142\u014d"+
		"\u0152\u0165\u0176\u0178\u0183\u0188\u0191\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}