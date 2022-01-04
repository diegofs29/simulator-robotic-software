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
		T__66=67, T__67=68, T__68=69, INT_CONST=70, FLOAT_CONST=71, CHAR_CONST=72, 
		STRING_CONST=73, ID=74, LINE_COMMENT=75, MULTILINE_COMMENT=76, WHITESPACE=77;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_assignment = 8, RULE_constant = 9, RULE_var_type = 10, RULE_setup = 11, 
		RULE_loop = 12, RULE_function = 13, RULE_function_args = 14, RULE_iteration_sentence = 15, 
		RULE_conditional_sentence = 16, RULE_code_block = 17, RULE_sentence = 18, 
		RULE_case_sentence = 19, RULE_expression = 20, RULE_incdec_expression = 21, 
		RULE_function_call = 22, RULE_parameter = 23, RULE_static_variable = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "assignment", "constant", 
			"var_type", "setup", "loop", "function", "function_args", "iteration_sentence", 
			"conditional_sentence", "code_block", "sentence", "case_sentence", "expression", 
			"incdec_expression", "function_call", "parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'\"'", "'.'", "';'", "'='", "'const'", 
			"'#define'", "'\n'", "'bool'", "'boolean'", "'byte'", "'char'", "'double'", 
			"'float'", "'int'", "'long'", "'short'", "'size_t'", "'string'", "'unsigned int'", 
			"'unsigned char'", "'unsigned long'", "'void'", "'word'", "'setup'", 
			"'('", "')'", "'loop'", "','", "'while'", "'do'", "'for'", "'if'", "'else'", 
			"'switch'", "'{'", "'}'", "'goto'", "'break'", "'continue'", "'case'", 
			"':'", "'default'", "'*'", "'/'", "'+'", "'-'", "'!='", "'=='", "'>='", 
			"'<='", "'%='", "'&='", "'*='", "'+='", "'-='", "'/='", "'^='", "'|='", 
			"'&&'", "'||'", "'!'", "'true'", "'false'", "'++'", "'--'", "'static'"
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
			null, null, null, null, null, null, null, null, null, null, "INT_CONST", 
			"FLOAT_CONST", "CHAR_CONST", "STRING_CONST", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
			setState(50);
			program();
			setState(51);
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
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				declaration();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					program_code();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(65);
			setup();
			setState(66);
			loop();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0) || _la==ID) {
				{
				{
				setState(67);
				program_code();
				}
				}
				setState(72);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				setup();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__0);
				setState(80);
				match(T__1);
				setState(81);
				h_file();
				setState(82);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__0);
				setState(85);
				match(T__3);
				setState(86);
				h_file();
				setState(87);
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
			setState(91);
			match(ID);
			setState(92);
			match(T__4);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Simple_definitionContext simple_definition() {
			return getRuleContext(Simple_definitionContext.class,0);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				simple_definition();
				setState(96);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				assignment_definition();
				setState(99);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
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
			setState(104);
			var_type();
			setState(105);
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
			setState(107);
			var_type();
			setState(108);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(T__6);
			setState(112);
			expression(0);
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
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__7);
				setState(115);
				var_type();
				setState(116);
				assignment();
				setState(117);
				match(T__5);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__8);
				setState(120);
				match(ID);
				setState(121);
				expression(0);
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==T__9) ) {
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
		enterRule(_localctx, 20, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (T__13 - 11)) | (1L << (T__14 - 11)) | (1L << (T__15 - 11)) | (1L << (T__16 - 11)) | (1L << (T__17 - 11)) | (1L << (T__18 - 11)) | (1L << (T__19 - 11)) | (1L << (T__20 - 11)) | (1L << (T__21 - 11)) | (1L << (T__22 - 11)) | (1L << (T__23 - 11)) | (1L << (T__24 - 11)) | (1L << (T__25 - 11)) | (1L << (ID - 11)))) != 0)) ) {
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
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__24);
			setState(129);
			match(T__26);
			setState(130);
			match(T__27);
			setState(131);
			match(T__28);
			setState(132);
			code_block();
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
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__24);
			setState(135);
			match(T__29);
			setState(136);
			match(T__27);
			setState(137);
			match(T__28);
			setState(138);
			code_block();
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
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			var_type();
			setState(141);
			match(ID);
			setState(142);
			match(T__27);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (T__13 - 11)) | (1L << (T__14 - 11)) | (1L << (T__15 - 11)) | (1L << (T__16 - 11)) | (1L << (T__17 - 11)) | (1L << (T__18 - 11)) | (1L << (T__19 - 11)) | (1L << (T__20 - 11)) | (1L << (T__21 - 11)) | (1L << (T__22 - 11)) | (1L << (T__23 - 11)) | (1L << (T__24 - 11)) | (1L << (T__25 - 11)) | (1L << (ID - 11)))) != 0)) {
				{
				setState(143);
				function_args();
				}
			}

			setState(146);
			match(T__28);
			setState(147);
			code_block();
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
		enterRule(_localctx, 28, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			simple_definition();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(150);
				match(T__30);
				setState(151);
				simple_definition();
				}
				}
				setState(156);
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
		enterRule(_localctx, 30, RULE_iteration_sentence);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__31);
				setState(158);
				match(T__27);
				setState(159);
				expression(0);
				setState(160);
				match(T__28);
				setState(161);
				code_block();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__32);
				setState(164);
				code_block();
				setState(165);
				match(T__31);
				setState(166);
				match(T__27);
				setState(167);
				expression(0);
				setState(168);
				match(T__28);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(T__33);
				setState(171);
				match(T__27);
				setState(172);
				assignment_definition();
				setState(173);
				match(T__5);
				setState(174);
				expression(0);
				setState(175);
				match(T__5);
				setState(176);
				expression(0);
				setState(177);
				match(T__28);
				setState(178);
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
		enterRule(_localctx, 32, RULE_conditional_sentence);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__34);
				setState(183);
				match(T__27);
				setState(184);
				expression(0);
				setState(185);
				match(T__28);
				setState(186);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__34);
				setState(189);
				match(T__27);
				setState(190);
				expression(0);
				setState(191);
				match(T__28);
				setState(192);
				code_block();
				setState(193);
				match(T__35);
				setState(194);
				conditional_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(T__34);
				setState(197);
				match(T__27);
				setState(198);
				expression(0);
				setState(199);
				match(T__28);
				setState(200);
				code_block();
				setState(201);
				match(T__35);
				setState(202);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				match(T__36);
				setState(205);
				match(T__27);
				setState(206);
				expression(0);
				setState(207);
				match(T__28);
				setState(208);
				match(T__37);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__42 || _la==T__44) {
					{
					{
					setState(209);
					case_sentence();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(T__38);
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
		enterRule(_localctx, 34, RULE_code_block);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(T__37);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (T__13 - 11)) | (1L << (T__14 - 11)) | (1L << (T__15 - 11)) | (1L << (T__16 - 11)) | (1L << (T__17 - 11)) | (1L << (T__18 - 11)) | (1L << (T__19 - 11)) | (1L << (T__20 - 11)) | (1L << (T__21 - 11)) | (1L << (T__22 - 11)) | (1L << (T__23 - 11)) | (1L << (T__24 - 11)) | (1L << (T__25 - 11)) | (1L << (T__31 - 11)) | (1L << (T__32 - 11)) | (1L << (T__33 - 11)) | (1L << (T__34 - 11)) | (1L << (T__36 - 11)) | (1L << (T__39 - 11)) | (1L << (T__40 - 11)) | (1L << (T__41 - 11)) | (1L << (T__68 - 11)) | (1L << (ID - 11)))) != 0)) {
					{
					{
					setState(220);
					sentence();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__38);
				}
				break;
			case T__10:
			case T__11:
			case T__12:
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
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__39:
			case T__40:
			case T__41:
			case T__68:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				sentence();
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
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentence);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				simple_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				assignment_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				static_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				assignment();
				setState(234);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				function_call();
				setState(237);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				match(T__39);
				setState(242);
				match(ID);
				setState(243);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(T__40);
				setState(245);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				match(T__41);
				setState(247);
				match(T__5);
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
		enterRule(_localctx, 38, RULE_case_sentence);
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__42);
				setState(251);
				expression(0);
				setState(252);
				match(T__43);
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						sentence();
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(259);
				match(T__40);
				setState(260);
				match(T__5);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__44);
				setState(263);
				match(T__43);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(264);
						sentence();
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(270);
				match(T__40);
				setState(271);
				match(T__5);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(275);
				function_call();
				}
				break;
			case 2:
				{
				setState(276);
				match(T__63);
				setState(277);
				expression(11);
				}
				break;
			case 3:
				{
				setState(278);
				match(T__27);
				setState(279);
				expression(0);
				setState(280);
				match(T__28);
				}
				break;
			case 4:
				{
				setState(282);
				incdec_expression();
				}
				break;
			case 5:
				{
				setState(283);
				assignment();
				}
				break;
			case 6:
				{
				setState(284);
				match(T__64);
				}
				break;
			case 7:
				{
				setState(285);
				match(T__65);
				}
				break;
			case 8:
				{
				setState(286);
				match(ID);
				}
				break;
			case 9:
				{
				setState(287);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(288);
				match(FLOAT_CONST);
				}
				break;
			case 11:
				{
				setState(289);
				match(CHAR_CONST);
				}
				break;
			case 12:
				{
				setState(290);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(294);
						_la = _input.LA(1);
						if ( !(_la==T__45 || _la==T__46) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(297);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(300);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(302);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(303);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(306);
						_la = _input.LA(1);
						if ( !(_la==T__61 || _la==T__62) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Incdec_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec_expression; }
	}

	public final Incdec_expressionContext incdec_expression() throws RecognitionException {
		Incdec_expressionContext _localctx = new Incdec_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_incdec_expression);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__66);
				setState(314);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(ID);
				setState(316);
				match(T__66);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(T__67);
				setState(318);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(ID);
				setState(320);
				match(T__67);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(ID);
			setState(324);
			match(T__27);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__63 - 28)) | (1L << (T__64 - 28)) | (1L << (T__65 - 28)) | (1L << (T__66 - 28)) | (1L << (T__67 - 28)) | (1L << (INT_CONST - 28)) | (1L << (FLOAT_CONST - 28)) | (1L << (CHAR_CONST - 28)) | (1L << (STRING_CONST - 28)) | (1L << (ID - 28)))) != 0)) {
				{
				{
				setState(325);
				parameter();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(T__28);
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
		enterRule(_localctx, 46, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			expression(0);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(334);
				match(T__30);
				setState(335);
				expression(0);
				}
				}
				setState(340);
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
		enterRule(_localctx, 48, RULE_static_variable);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__68);
				setState(342);
				var_type();
				setState(343);
				match(ID);
				setState(344);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__68);
				setState(347);
				var_type();
				setState(348);
				assignment();
				setState(349);
				match(T__5);
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
		case 20:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3O\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\5\17\u0093\n\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u009b\n"+
		"\20\f\20\16\20\u009e\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00d5\n\22\f\22\16\22\u00d8\13\22\3\22\3\22\5\22"+
		"\u00dc\n\22\3\23\3\23\7\23\u00e0\n\23\f\23\16\23\u00e3\13\23\3\23\3\23"+
		"\5\23\u00e7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fb\n\24\3\25\3\25\3\25\3\25"+
		"\7\25\u0101\n\25\f\25\16\25\u0104\13\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u010c\n\25\f\25\16\25\u010f\13\25\3\25\3\25\5\25\u0113\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0126\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0137\n\26\f\26\16\26\u013a\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0144\n\27\3\30\3\30\3\30"+
		"\7\30\u0149\n\30\f\30\16\30\u014c\13\30\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0153\n\31\f\31\16\31\u0156\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0162\n\32\3\32\2\3*\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\t\3\3\f\f\4\2\r\34LL\3\2\60\61\3\2\62\63"+
		"\4\2\4\5\64\67\3\28?\3\2@A\2\u0180\2\64\3\2\2\2\4:\3\2\2\2\6O\3\2\2\2"+
		"\b[\3\2\2\2\n]\3\2\2\2\fh\3\2\2\2\16j\3\2\2\2\20m\3\2\2\2\22p\3\2\2\2"+
		"\24~\3\2\2\2\26\u0080\3\2\2\2\30\u0082\3\2\2\2\32\u0088\3\2\2\2\34\u008e"+
		"\3\2\2\2\36\u0097\3\2\2\2 \u00b6\3\2\2\2\"\u00db\3\2\2\2$\u00e6\3\2\2"+
		"\2&\u00fa\3\2\2\2(\u0112\3\2\2\2*\u0125\3\2\2\2,\u0143\3\2\2\2.\u0145"+
		"\3\2\2\2\60\u014f\3\2\2\2\62\u0161\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3"+
		"\66\3\3\2\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@"+
		"\3\2\2\2<:\3\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"C\3\2\2\2B@\3\2\2\2CD\5\30\r\2DH\5\32\16\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3\2\2\2KP\5\f\7\2LP\5\30\r\2MP\5\32"+
		"\16\2NP\5\34\17\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2Q"+
		"R\7\3\2\2RS\7\4\2\2ST\5\n\6\2TU\7\5\2\2U\\\3\2\2\2VW\7\3\2\2WX\7\6\2\2"+
		"XY\5\n\6\2YZ\7\6\2\2Z\\\3\2\2\2[Q\3\2\2\2[V\3\2\2\2\\\t\3\2\2\2]^\7L\2"+
		"\2^_\7\7\2\2_`\7L\2\2`\13\3\2\2\2ab\5\16\b\2bc\7\b\2\2ci\3\2\2\2de\5\20"+
		"\t\2ef\7\b\2\2fi\3\2\2\2gi\5\24\13\2ha\3\2\2\2hd\3\2\2\2hg\3\2\2\2i\r"+
		"\3\2\2\2jk\5\26\f\2kl\7L\2\2l\17\3\2\2\2mn\5\26\f\2no\5\22\n\2o\21\3\2"+
		"\2\2pq\7L\2\2qr\7\t\2\2rs\5*\26\2s\23\3\2\2\2tu\7\n\2\2uv\5\26\f\2vw\5"+
		"\22\n\2wx\7\b\2\2x\177\3\2\2\2yz\7\13\2\2z{\7L\2\2{|\5*\26\2|}\t\2\2\2"+
		"}\177\3\2\2\2~t\3\2\2\2~y\3\2\2\2\177\25\3\2\2\2\u0080\u0081\t\3\2\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7\35\2\2\u0084\u0085\7\36"+
		"\2\2\u0085\u0086\7\37\2\2\u0086\u0087\5$\23\2\u0087\31\3\2\2\2\u0088\u0089"+
		"\7\33\2\2\u0089\u008a\7 \2\2\u008a\u008b\7\36\2\2\u008b\u008c\7\37\2\2"+
		"\u008c\u008d\5$\23\2\u008d\33\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090"+
		"\7L\2\2\u0090\u0092\7\36\2\2\u0091\u0093\5\36\20\2\u0092\u0091\3\2\2\2"+
		"\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\37\2\2\u0095\u0096"+
		"\5$\23\2\u0096\35\3\2\2\2\u0097\u009c\5\16\b\2\u0098\u0099\7!\2\2\u0099"+
		"\u009b\5\16\b\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3"+
		"\2\2\2\u009c\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\"\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2\5*\26\2\u00a2\u00a3\7"+
		"\37\2\2\u00a3\u00a4\5$\23\2\u00a4\u00b7\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6"+
		"\u00a7\5$\23\2\u00a7\u00a8\7\"\2\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\5"+
		"*\26\2\u00aa\u00ab\7\37\2\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\7$\2\2\u00ad"+
		"\u00ae\7\36\2\2\u00ae\u00af\5\20\t\2\u00af\u00b0\7\b\2\2\u00b0\u00b1\5"+
		"*\26\2\u00b1\u00b2\7\b\2\2\u00b2\u00b3\5*\26\2\u00b3\u00b4\7\37\2\2\u00b4"+
		"\u00b5\5$\23\2\u00b5\u00b7\3\2\2\2\u00b6\u009f\3\2\2\2\u00b6\u00a5\3\2"+
		"\2\2\u00b6\u00ac\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7%\2\2\u00b9\u00ba"+
		"\7\36\2\2\u00ba\u00bb\5*\26\2\u00bb\u00bc\7\37\2\2\u00bc\u00bd\5$\23\2"+
		"\u00bd\u00dc\3\2\2\2\u00be\u00bf\7%\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c1"+
		"\5*\26\2\u00c1\u00c2\7\37\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7&\2\2\u00c4"+
		"\u00c5\5\"\22\2\u00c5\u00dc\3\2\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\7\36"+
		"\2\2\u00c8\u00c9\5*\26\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\5$\23\2\u00cb"+
		"\u00cc\7&\2\2\u00cc\u00cd\5$\23\2\u00cd\u00dc\3\2\2\2\u00ce\u00cf\7\'"+
		"\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\7\37\2\2\u00d2"+
		"\u00d6\7(\2\2\u00d3\u00d5\5(\25\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\7)\2\2\u00da\u00dc\3\2\2\2\u00db\u00b8\3\2"+
		"\2\2\u00db\u00be\3\2\2\2\u00db\u00c6\3\2\2\2\u00db\u00ce\3\2\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00e1\7(\2\2\u00de\u00e0\5&\24\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\7)\2\2\u00e5\u00e7\5&\24\2\u00e6"+
		"\u00dd\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7%\3\2\2\2\u00e8\u00fb\5\16\b\2"+
		"\u00e9\u00fb\5\20\t\2\u00ea\u00fb\5\62\32\2\u00eb\u00ec\5\22\n\2\u00ec"+
		"\u00ed\7\b\2\2\u00ed\u00fb\3\2\2\2\u00ee\u00ef\5.\30\2\u00ef\u00f0\7\b"+
		"\2\2\u00f0\u00fb\3\2\2\2\u00f1\u00fb\5 \21\2\u00f2\u00fb\5\"\22\2\u00f3"+
		"\u00f4\7*\2\2\u00f4\u00f5\7L\2\2\u00f5\u00fb\7\b\2\2\u00f6\u00f7\7+\2"+
		"\2\u00f7\u00fb\7\b\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fb\7\b\2\2\u00fa\u00e8"+
		"\3\2\2\2\u00fa\u00e9\3\2\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00eb\3\2\2\2\u00fa"+
		"\u00ee\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2"+
		"\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\'\3\2\2\2\u00fc\u00fd"+
		"\7-\2\2\u00fd\u00fe\5*\26\2\u00fe\u0102\7.\2\2\u00ff\u0101\5&\24\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7+\2\2\u0106"+
		"\u0107\7\b\2\2\u0107\u0113\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010d\7.\2"+
		"\2\u010a\u010c\5&\24\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7+\2\2\u0111\u0113\7\b\2\2\u0112\u00fc\3\2\2\2\u0112\u0108\3\2"+
		"\2\2\u0113)\3\2\2\2\u0114\u0115\b\26\1\2\u0115\u0126\5.\30\2\u0116\u0117"+
		"\7B\2\2\u0117\u0126\5*\26\r\u0118\u0119\7\36\2\2\u0119\u011a\5*\26\2\u011a"+
		"\u011b\7\37\2\2\u011b\u0126\3\2\2\2\u011c\u0126\5,\27\2\u011d\u0126\5"+
		"\22\n\2\u011e\u0126\7C\2\2\u011f\u0126\7D\2\2\u0120\u0126\7L\2\2\u0121"+
		"\u0126\7H\2\2\u0122\u0126\7I\2\2\u0123\u0126\7J\2\2\u0124\u0126\7K\2\2"+
		"\u0125\u0114\3\2\2\2\u0125\u0116\3\2\2\2\u0125\u0118\3\2\2\2\u0125\u011c"+
		"\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125"+
		"\u0120\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0124\3\2\2\2\u0126\u0138\3\2\2\2\u0127\u0128\f\22\2\2\u0128"+
		"\u0129\t\4\2\2\u0129\u0137\5*\26\23\u012a\u012b\f\21\2\2\u012b\u012c\t"+
		"\5\2\2\u012c\u0137\5*\26\22\u012d\u012e\f\20\2\2\u012e\u012f\t\6\2\2\u012f"+
		"\u0137\5*\26\21\u0130\u0131\f\17\2\2\u0131\u0132\t\7\2\2\u0132\u0137\5"+
		"*\26\20\u0133\u0134\f\16\2\2\u0134\u0135\t\b\2\2\u0135\u0137\5*\26\17"+
		"\u0136\u0127\3\2\2\2\u0136\u012a\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u0130"+
		"\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139+\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7E\2\2\u013c"+
		"\u0144\7L\2\2\u013d\u013e\7L\2\2\u013e\u0144\7E\2\2\u013f\u0140\7F\2\2"+
		"\u0140\u0144\7L\2\2\u0141\u0142\7L\2\2\u0142\u0144\7F\2\2\u0143\u013b"+
		"\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u013f\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"-\3\2\2\2\u0145\u0146\7L\2\2\u0146\u014a\7\36\2\2\u0147\u0149\5\60\31"+
		"\2\u0148\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\37\2\2"+
		"\u014e/\3\2\2\2\u014f\u0154\5*\26\2\u0150\u0151\7!\2\2\u0151\u0153\5*"+
		"\26\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\61\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7G\2\2"+
		"\u0158\u0159\5\26\f\2\u0159\u015a\7L\2\2\u015a\u015b\7\b\2\2\u015b\u0162"+
		"\3\2\2\2\u015c\u015d\7G\2\2\u015d\u015e\5\26\f\2\u015e\u015f\5\22\n\2"+
		"\u015f\u0160\7\b\2\2\u0160\u0162\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u015c"+
		"\3\2\2\2\u0162\63\3\2\2\2\33:@HO[h~\u0092\u009c\u00b6\u00d6\u00db\u00e1"+
		"\u00e6\u00fa\u0102\u010d\u0112\u0125\u0136\u0138\u0143\u014a\u0154\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}