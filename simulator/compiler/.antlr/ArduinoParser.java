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
		T__66=67, T__67=68, ID=69, INT_CONST=70, FLOAT_CONST=71, CHAR_CONST=72, 
		STRING_CONST=73, LINE_COMMENT=74, MULTILINE_COMMENT=75, WHITESPACE=76;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_h_file = 2, RULE_definition = 3, 
		RULE_simple_definition = 4, RULE_assignment_definition = 5, RULE_assignment = 6, 
		RULE_constant = 7, RULE_var_type = 8, RULE_setup = 9, RULE_loop = 10, 
		RULE_function = 11, RULE_function_args = 12, RULE_iteration_sentence = 13, 
		RULE_conditional_sentence = 14, RULE_code_block = 15, RULE_sentence = 16, 
		RULE_case_sentence = 17, RULE_expression = 18, RULE_incdec_expression = 19, 
		RULE_function_call = 20, RULE_parameter = 21, RULE_static_variable = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "h_file", "definition", "simple_definition", 
			"assignment_definition", "assignment", "constant", "var_type", "setup", 
			"loop", "function", "function_args", "iteration_sentence", "conditional_sentence", 
			"code_block", "sentence", "case_sentence", "expression", "incdec_expression", 
			"function_call", "parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'\"'", "'.'", "';'", "'='", "'const'", 
			"'#define'", "'bool'", "'boolean'", "'byte'", "'char'", "'double'", "'float'", 
			"'int'", "'long'", "'short'", "'size_t'", "'string'", "'unsigned int'", 
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
			null, null, null, null, null, null, null, null, null, "ID", "INT_CONST", 
			"FLOAT_CONST", "CHAR_CONST", "STRING_CONST", "LINE_COMMENT", "MULTILINE_COMMENT", 
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
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(46);
				declaration();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					definition();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			setup();
			setState(59);
			loop();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (T__11 - 10)) | (1L << (T__12 - 10)) | (1L << (T__13 - 10)) | (1L << (T__14 - 10)) | (1L << (T__15 - 10)) | (1L << (T__16 - 10)) | (1L << (T__17 - 10)) | (1L << (T__18 - 10)) | (1L << (T__19 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__22 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				{
				setState(60);
				function();
				}
				}
				setState(65);
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
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__0);
				setState(67);
				match(T__1);
				setState(68);
				h_file();
				setState(69);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(T__3);
				setState(73);
				h_file();
				setState(74);
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
		enterRule(_localctx, 4, RULE_h_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(T__4);
			setState(80);
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
		enterRule(_localctx, 6, RULE_definition);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				simple_definition();
				setState(83);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				assignment_definition();
				setState(86);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
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
		enterRule(_localctx, 8, RULE_simple_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			var_type();
			setState(92);
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
		enterRule(_localctx, 10, RULE_assignment_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			var_type();
			setState(95);
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
			setState(98);
			match(T__6);
			setState(99);
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
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__7);
				setState(102);
				var_type();
				setState(103);
				assignment();
				setState(104);
				match(T__5);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(T__8);
				setState(107);
				match(ID);
				setState(108);
				expression(0);
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
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (T__11 - 10)) | (1L << (T__12 - 10)) | (1L << (T__13 - 10)) | (1L << (T__14 - 10)) | (1L << (T__15 - 10)) | (1L << (T__16 - 10)) | (1L << (T__17 - 10)) | (1L << (T__18 - 10)) | (1L << (T__19 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__22 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (ID - 10)))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_setup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__23);
			setState(114);
			match(T__25);
			setState(115);
			match(T__26);
			setState(116);
			match(T__27);
			setState(117);
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
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__23);
			setState(120);
			match(T__28);
			setState(121);
			match(T__26);
			setState(122);
			match(T__27);
			setState(123);
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
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			var_type();
			setState(126);
			match(ID);
			setState(127);
			match(T__26);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (T__11 - 10)) | (1L << (T__12 - 10)) | (1L << (T__13 - 10)) | (1L << (T__14 - 10)) | (1L << (T__15 - 10)) | (1L << (T__16 - 10)) | (1L << (T__17 - 10)) | (1L << (T__18 - 10)) | (1L << (T__19 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__22 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (ID - 10)))) != 0)) {
				{
				setState(128);
				function_args();
				}
			}

			setState(131);
			match(T__27);
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
		enterRule(_localctx, 24, RULE_function_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			simple_definition();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(135);
				match(T__29);
				setState(136);
				simple_definition();
				}
				}
				setState(141);
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
		enterRule(_localctx, 26, RULE_iteration_sentence);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__30);
				setState(143);
				match(T__26);
				setState(144);
				expression(0);
				setState(145);
				match(T__27);
				setState(146);
				code_block();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__31);
				setState(149);
				code_block();
				setState(150);
				match(T__30);
				setState(151);
				match(T__26);
				setState(152);
				expression(0);
				setState(153);
				match(T__27);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__32);
				setState(156);
				match(T__26);
				setState(157);
				assignment_definition();
				setState(158);
				match(T__5);
				setState(159);
				expression(0);
				setState(160);
				match(T__5);
				setState(161);
				expression(0);
				setState(162);
				match(T__27);
				setState(163);
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
		enterRule(_localctx, 28, RULE_conditional_sentence);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__33);
				setState(168);
				match(T__26);
				setState(169);
				expression(0);
				setState(170);
				match(T__27);
				setState(171);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__33);
				setState(174);
				match(T__26);
				setState(175);
				expression(0);
				setState(176);
				match(T__27);
				setState(177);
				code_block();
				setState(178);
				match(T__34);
				setState(179);
				conditional_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(T__33);
				setState(182);
				match(T__26);
				setState(183);
				expression(0);
				setState(184);
				match(T__27);
				setState(185);
				code_block();
				setState(186);
				match(T__34);
				setState(187);
				code_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(T__35);
				setState(190);
				match(T__26);
				setState(191);
				expression(0);
				setState(192);
				match(T__27);
				setState(193);
				match(T__36);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__41 || _la==T__43) {
					{
					{
					setState(194);
					case_sentence();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__37);
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
		enterRule(_localctx, 30, RULE_code_block);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__36);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (T__11 - 10)) | (1L << (T__12 - 10)) | (1L << (T__13 - 10)) | (1L << (T__14 - 10)) | (1L << (T__15 - 10)) | (1L << (T__16 - 10)) | (1L << (T__17 - 10)) | (1L << (T__18 - 10)) | (1L << (T__19 - 10)) | (1L << (T__20 - 10)) | (1L << (T__21 - 10)) | (1L << (T__22 - 10)) | (1L << (T__23 - 10)) | (1L << (T__24 - 10)) | (1L << (T__30 - 10)) | (1L << (T__31 - 10)) | (1L << (T__32 - 10)) | (1L << (T__33 - 10)) | (1L << (T__35 - 10)) | (1L << (T__38 - 10)) | (1L << (T__39 - 10)) | (1L << (T__40 - 10)) | (1L << (T__67 - 10)) | (1L << (ID - 10)))) != 0)) {
					{
					{
					setState(205);
					sentence();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__37);
				}
				break;
			case T__9:
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
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__35:
			case T__38:
			case T__39:
			case T__40:
			case T__67:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
		enterRule(_localctx, 32, RULE_sentence);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				simple_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				assignment_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				static_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				assignment();
				setState(219);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				function_call();
				setState(222);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				match(T__38);
				setState(227);
				match(ID);
				setState(228);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(229);
				match(T__39);
				setState(230);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(231);
				match(T__40);
				setState(232);
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
		enterRule(_localctx, 34, RULE_case_sentence);
		try {
			int _alt;
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__41);
				setState(236);
				expression(0);
				setState(237);
				match(T__42);
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(238);
						sentence();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(244);
				match(T__39);
				setState(245);
				match(T__5);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__43);
				setState(248);
				match(T__42);
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						sentence();
						}
						} 
					}
					setState(254);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(255);
				match(T__39);
				setState(256);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(260);
				function_call();
				}
				break;
			case 2:
				{
				setState(261);
				match(T__62);
				setState(262);
				expression(11);
				}
				break;
			case 3:
				{
				setState(263);
				match(T__26);
				setState(264);
				expression(0);
				setState(265);
				match(T__27);
				}
				break;
			case 4:
				{
				setState(267);
				incdec_expression();
				}
				break;
			case 5:
				{
				setState(268);
				assignment();
				}
				break;
			case 6:
				{
				setState(269);
				match(T__63);
				}
				break;
			case 7:
				{
				setState(270);
				match(T__64);
				}
				break;
			case 8:
				{
				setState(271);
				match(ID);
				}
				break;
			case 9:
				{
				setState(272);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(273);
				match(FLOAT_CONST);
				}
				break;
			case 11:
				{
				setState(274);
				match(CHAR_CONST);
				}
				break;
			case 12:
				{
				setState(275);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(279);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__45) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(282);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(285);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(288);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(291);
						_la = _input.LA(1);
						if ( !(_la==T__60 || _la==T__61) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 38, RULE_incdec_expression);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__65);
				setState(299);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(ID);
				setState(301);
				match(T__65);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__66);
				setState(303);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(ID);
				setState(305);
				match(T__66);
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
		enterRule(_localctx, 40, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(ID);
			setState(309);
			match(T__26);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (T__26 - 27)) | (1L << (T__62 - 27)) | (1L << (T__63 - 27)) | (1L << (T__64 - 27)) | (1L << (T__65 - 27)) | (1L << (T__66 - 27)) | (1L << (ID - 27)) | (1L << (INT_CONST - 27)) | (1L << (FLOAT_CONST - 27)) | (1L << (CHAR_CONST - 27)) | (1L << (STRING_CONST - 27)))) != 0)) {
				{
				{
				setState(310);
				parameter();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__27);
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
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			expression(0);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(319);
				match(T__29);
				setState(320);
				expression(0);
				}
				}
				setState(325);
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
		enterRule(_localctx, 44, RULE_static_variable);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__67);
				setState(327);
				var_type();
				setState(328);
				match(ID);
				setState(329);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__67);
				setState(332);
				var_type();
				setState(333);
				assignment();
				setState(334);
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
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3N\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0084\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u008c\n\16\f\16\16\16\u008f"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a8\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00c6\n\20\f\20\16\20\u00c9\13\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21"+
		"\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\3\21\3\21\5\21\u00d8\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\7\23\u00f2\n\23\f"+
		"\23\16\23\u00f5\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00fd\n\23\f"+
		"\23\16\23\u0100\13\23\3\23\3\23\5\23\u0104\n\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0117"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0128\n\24\f\24\16\24\u012b\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0135\n\25\3\26\3\26\3\26\7\26\u013a\n\26\f"+
		"\26\16\26\u013d\13\26\3\26\3\26\3\27\3\27\3\27\7\27\u0144\n\27\f\27\16"+
		"\27\u0147\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0153\n\30\3\30\2\3&\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\2\b\4\2\f\33GG\3\2/\60\3\2\61\62\4\2\4\5\63\66\3\2\67>\3\2?@\2\u0170"+
		"\2\63\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\b[\3\2\2\2\n]\3\2\2\2\f`\3\2\2\2\16"+
		"c\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24s\3\2\2\2\26y\3\2\2\2\30\177\3\2\2"+
		"\2\32\u0088\3\2\2\2\34\u00a7\3\2\2\2\36\u00cc\3\2\2\2 \u00d7\3\2\2\2\""+
		"\u00eb\3\2\2\2$\u0103\3\2\2\2&\u0116\3\2\2\2(\u0134\3\2\2\2*\u0136\3\2"+
		"\2\2,\u0140\3\2\2\2.\u0152\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3"+
		"\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\b\5"+
		"\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<"+
		"=\5\24\13\2=A\5\26\f\2>@\5\30\r\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\3\3\2\2\2CA\3\2\2\2DE\7\3\2\2EF\7\4\2\2FG\5\6\4\2GH\7\5\2\2HO\3"+
		"\2\2\2IJ\7\3\2\2JK\7\6\2\2KL\5\6\4\2LM\7\6\2\2MO\3\2\2\2ND\3\2\2\2NI\3"+
		"\2\2\2O\5\3\2\2\2PQ\7G\2\2QR\7\7\2\2RS\7G\2\2S\7\3\2\2\2TU\5\n\6\2UV\7"+
		"\b\2\2V\\\3\2\2\2WX\5\f\7\2XY\7\b\2\2Y\\\3\2\2\2Z\\\5\20\t\2[T\3\2\2\2"+
		"[W\3\2\2\2[Z\3\2\2\2\\\t\3\2\2\2]^\5\22\n\2^_\7G\2\2_\13\3\2\2\2`a\5\22"+
		"\n\2ab\5\16\b\2b\r\3\2\2\2cd\7G\2\2de\7\t\2\2ef\5&\24\2f\17\3\2\2\2gh"+
		"\7\n\2\2hi\5\22\n\2ij\5\16\b\2jk\7\b\2\2kp\3\2\2\2lm\7\13\2\2mn\7G\2\2"+
		"np\5&\24\2og\3\2\2\2ol\3\2\2\2p\21\3\2\2\2qr\t\2\2\2r\23\3\2\2\2st\7\32"+
		"\2\2tu\7\34\2\2uv\7\35\2\2vw\7\36\2\2wx\5 \21\2x\25\3\2\2\2yz\7\32\2\2"+
		"z{\7\37\2\2{|\7\35\2\2|}\7\36\2\2}~\5 \21\2~\27\3\2\2\2\177\u0080\5\22"+
		"\n\2\u0080\u0081\7G\2\2\u0081\u0083\7\35\2\2\u0082\u0084\5\32\16\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\36"+
		"\2\2\u0086\u0087\5 \21\2\u0087\31\3\2\2\2\u0088\u008d\5\n\6\2\u0089\u008a"+
		"\7 \2\2\u008a\u008c\5\n\6\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\33\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\7!\2\2\u0091\u0092\7\35\2\2\u0092\u0093\5&\24\2\u0093\u0094"+
		"\7\36\2\2\u0094\u0095\5 \21\2\u0095\u00a8\3\2\2\2\u0096\u0097\7\"\2\2"+
		"\u0097\u0098\5 \21\2\u0098\u0099\7!\2\2\u0099\u009a\7\35\2\2\u009a\u009b"+
		"\5&\24\2\u009b\u009c\7\36\2\2\u009c\u00a8\3\2\2\2\u009d\u009e\7#\2\2\u009e"+
		"\u009f\7\35\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\b\2\2\u00a1\u00a2\5"+
		"&\24\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5&\24\2\u00a4\u00a5\7\36\2\2\u00a5"+
		"\u00a6\5 \21\2\u00a6\u00a8\3\2\2\2\u00a7\u0090\3\2\2\2\u00a7\u0096\3\2"+
		"\2\2\u00a7\u009d\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa\u00ab"+
		"\7\35\2\2\u00ab\u00ac\5&\24\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\5 \21\2"+
		"\u00ae\u00cd\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b2"+
		"\5&\24\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7%\2\2\u00b5"+
		"\u00b6\5\36\20\2\u00b6\u00cd\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\7"+
		"\35\2\2\u00b9\u00ba\5&\24\2\u00ba\u00bb\7\36\2\2\u00bb\u00bc\5 \21\2\u00bc"+
		"\u00bd\7%\2\2\u00bd\u00be\5 \21\2\u00be\u00cd\3\2\2\2\u00bf\u00c0\7&\2"+
		"\2\u00c0\u00c1\7\35\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\7\36\2\2\u00c3"+
		"\u00c7\7\'\2\2\u00c4\u00c6\5$\23\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00a9\3\2"+
		"\2\2\u00cc\u00af\3\2\2\2\u00cc\u00b7\3\2\2\2\u00cc\u00bf\3\2\2\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00d2\7\'\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00cf\3\2\2"+
		"\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\7(\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00ce\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00ec\5\n\6\2"+
		"\u00da\u00ec\5\f\7\2\u00db\u00ec\5.\30\2\u00dc\u00dd\5\16\b\2\u00dd\u00de"+
		"\7\b\2\2\u00de\u00ec\3\2\2\2\u00df\u00e0\5*\26\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\u00ec\3\2\2\2\u00e2\u00ec\5\34\17\2\u00e3\u00ec\5\36\20\2\u00e4\u00e5"+
		"\7)\2\2\u00e5\u00e6\7G\2\2\u00e6\u00ec\7\b\2\2\u00e7\u00e8\7*\2\2\u00e8"+
		"\u00ec\7\b\2\2\u00e9\u00ea\7+\2\2\u00ea\u00ec\7\b\2\2\u00eb\u00d9\3\2"+
		"\2\2\u00eb\u00da\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb"+
		"\u00df\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2"+
		"\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee"+
		"\7,\2\2\u00ee\u00ef\5&\24\2\u00ef\u00f3\7-\2\2\u00f0\u00f2\5\"\22\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7*\2\2\u00f7"+
		"\u00f8\7\b\2\2\u00f8\u0104\3\2\2\2\u00f9\u00fa\7.\2\2\u00fa\u00fe\7-\2"+
		"\2\u00fb\u00fd\5\"\22\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7*\2\2\u0102\u0104\7\b\2\2\u0103\u00ed\3\2\2\2\u0103"+
		"\u00f9\3\2\2\2\u0104%\3\2\2\2\u0105\u0106\b\24\1\2\u0106\u0117\5*\26\2"+
		"\u0107\u0108\7A\2\2\u0108\u0117\5&\24\r\u0109\u010a\7\35\2\2\u010a\u010b"+
		"\5&\24\2\u010b\u010c\7\36\2\2\u010c\u0117\3\2\2\2\u010d\u0117\5(\25\2"+
		"\u010e\u0117\5\16\b\2\u010f\u0117\7B\2\2\u0110\u0117\7C\2\2\u0111\u0117"+
		"\7G\2\2\u0112\u0117\7H\2\2\u0113\u0117\7I\2\2\u0114\u0117\7J\2\2\u0115"+
		"\u0117\7K\2\2\u0116\u0105\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u0109\3\2"+
		"\2\2\u0116\u010d\3\2\2\2\u0116\u010e\3\2\2\2\u0116\u010f\3\2\2\2\u0116"+
		"\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0129\3\2\2\2\u0118"+
		"\u0119\f\22\2\2\u0119\u011a\t\3\2\2\u011a\u0128\5&\24\23\u011b\u011c\f"+
		"\21\2\2\u011c\u011d\t\4\2\2\u011d\u0128\5&\24\22\u011e\u011f\f\20\2\2"+
		"\u011f\u0120\t\5\2\2\u0120\u0128\5&\24\21\u0121\u0122\f\17\2\2\u0122\u0123"+
		"\t\6\2\2\u0123\u0128\5&\24\20\u0124\u0125\f\16\2\2\u0125\u0126\t\7\2\2"+
		"\u0126\u0128\5&\24\17\u0127\u0118\3\2\2\2\u0127\u011b\3\2\2\2\u0127\u011e"+
		"\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0124\3\2\2\2\u0128\u012b\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\'\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u012d\7D\2\2\u012d\u0135\7G\2\2\u012e\u012f\7G\2\2\u012f\u0135"+
		"\7D\2\2\u0130\u0131\7E\2\2\u0131\u0135\7G\2\2\u0132\u0133\7G\2\2\u0133"+
		"\u0135\7E\2\2\u0134\u012c\3\2\2\2\u0134\u012e\3\2\2\2\u0134\u0130\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135)\3\2\2\2\u0136\u0137\7G\2\2\u0137\u013b"+
		"\7\35\2\2\u0138\u013a\5,\27\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013e\u013f\7\36\2\2\u013f+\3\2\2\2\u0140\u0145\5&\24\2\u0141"+
		"\u0142\7 \2\2\u0142\u0144\5&\24\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146-\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0149\7F\2\2\u0149\u014a\5\22\n\2\u014a\u014b\7G\2\2\u014b"+
		"\u014c\7\b\2\2\u014c\u0153\3\2\2\2\u014d\u014e\7F\2\2\u014e\u014f\5\22"+
		"\n\2\u014f\u0150\5\16\b\2\u0150\u0151\7\b\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0148\3\2\2\2\u0152\u014d\3\2\2\2\u0153/\3\2\2\2\32\639AN[o\u0083\u008d"+
		"\u00a7\u00c7\u00cc\u00d2\u00d7\u00eb\u00f3\u00fe\u0103\u0116\u0127\u0129"+
		"\u0134\u013b\u0145\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}