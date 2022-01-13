// Generated from e:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\ArduinoGrammar.g4 by ANTLR 4.8

    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoGrammarParser extends Parser {
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
		T__66=67, ID=68, INT_CONST=69, FLOAT_CONST=70, CHAR_CONST=71, STRING_CONST=72, 
		LINE_COMMENT=73, MULTILINE_COMMENT=74, WHITESPACE=75;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_h_file = 2, RULE_definition = 3, 
		RULE_simple_definition = 4, RULE_assignment_definition = 5, RULE_assignment = 6, 
		RULE_constant = 7, RULE_var_type = 8, RULE_setup = 9, RULE_loop = 10, 
		RULE_function = 11, RULE_function_args = 12, RULE_sentence = 13, RULE_iteration_sentence = 14, 
		RULE_conditional_sentence = 15, RULE_case_sentence = 16, RULE_expression = 17, 
		RULE_incdec_expression = 18, RULE_function_call = 19, RULE_parameter = 20, 
		RULE_static_variable = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "h_file", "definition", "simple_definition", 
			"assignment_definition", "assignment", "constant", "var_type", "setup", 
			"loop", "function", "function_args", "sentence", "iteration_sentence", 
			"conditional_sentence", "case_sentence", "expression", "incdec_expression", 
			"function_call", "parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include('", "')'", "'.'", "';'", "'='", "'const'", "'#define'", 
			"'bool'", "'boolean'", "'byte'", "'char'", "'double'", "'float'", "'int'", 
			"'long'", "'short'", "'size_t'", "'string'", "'unsigned int'", "'unsigned char'", 
			"'unsigned long'", "'void'", "'word'", "'setup'", "'('", "'['", "']'", 
			"'loop'", "'goto'", "'break'", "'continue'", "'while'", "'do'", "'for'", 
			"'if'", "'else'", "'switch'", "'case'", "':'", "'default'", "'*'", "'/'", 
			"'+'", "'-'", "'!='", "'=='", "'>'", "'>='", "'<='", "'<'", "'%='", "'&='", 
			"'*='", "'+='", "'-='", "'/='", "'^='", "'|='", "'&&'", "'||'", "'!'", 
			"'true'", "'false'", "'++'", "'--'", "','", "'static'"
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
			null, null, null, null, null, null, null, null, "ID", "INT_CONST", "FLOAT_CONST", 
			"CHAR_CONST", "STRING_CONST", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "ArduinoGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArduinoGrammarParser(TokenStream input) {
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(44);
				declaration();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					definition();
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(56);
			setup();
			setState(57);
			loop();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(58);
				function();
				}
				}
				setState(63);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			h_file();
			setState(66);
			match(T__1);
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
		public List<TerminalNode> ID() { return getTokens(ArduinoGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ArduinoGrammarParser.ID, i);
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
			setState(68);
			match(ID);
			setState(69);
			match(T__2);
			setState(70);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				simple_definition();
				setState(73);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				assignment_definition();
				setState(76);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
			setState(81);
			var_type();
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
			setState(84);
			var_type();
			setState(85);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
			setState(87);
			match(ID);
			setState(88);
			match(T__4);
			setState(89);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__5);
				setState(92);
				var_type();
				setState(93);
				assignment();
				setState(94);
				match(T__3);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__6);
				setState(97);
				match(ID);
				setState(98);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
			setState(101);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (ID - 8)))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__21);
			setState(104);
			match(T__23);
			setState(105);
			match(T__24);
			setState(106);
			match(T__1);
			setState(107);
			match(T__25);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(108);
				sentence();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(T__26);
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
		enterRule(_localctx, 20, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__21);
			setState(117);
			match(T__27);
			setState(118);
			match(T__24);
			setState(119);
			match(T__1);
			setState(120);
			match(T__25);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(121);
				sentence();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__26);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
			setState(129);
			var_type();
			setState(130);
			match(ID);
			setState(131);
			match(T__24);
			setState(132);
			function_args();
			setState(133);
			match(T__1);
			setState(134);
			match(T__25);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
				{
				{
				setState(135);
				sentence();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(T__26);
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
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentence);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				simple_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				assignment_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				static_variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				assignment();
				setState(149);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				iteration_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				conditional_sentence();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(154);
				match(T__28);
				setState(155);
				match(ID);
				setState(156);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				match(T__29);
				setState(158);
				match(T__3);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(T__30);
				setState(160);
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

	public static class Iteration_sentenceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
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
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__31);
				setState(164);
				match(T__24);
				setState(165);
				expression(0);
				setState(166);
				match(T__1);
				setState(167);
				match(T__25);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(168);
					sentence();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__26);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__32);
				setState(177);
				match(T__25);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(178);
					sentence();
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__26);
				setState(185);
				match(T__31);
				setState(186);
				match(T__24);
				setState(187);
				expression(0);
				setState(188);
				match(T__1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(T__33);
				setState(191);
				match(T__24);
				setState(192);
				assignment_definition();
				setState(193);
				match(T__3);
				setState(194);
				expression(0);
				setState(195);
				match(T__3);
				setState(196);
				expression(0);
				setState(197);
				match(T__1);
				setState(198);
				match(T__25);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(199);
					sentence();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__26);
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
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__34);
				setState(210);
				match(T__24);
				setState(211);
				expression(0);
				setState(212);
				match(T__1);
				setState(213);
				match(T__25);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(214);
					sentence();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__34);
				setState(223);
				match(T__24);
				setState(224);
				expression(0);
				setState(225);
				match(T__1);
				setState(226);
				match(T__25);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(227);
					sentence();
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
				match(T__26);
				setState(234);
				match(T__35);
				setState(235);
				match(T__25);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__8 - 8)) | (1L << (T__9 - 8)) | (1L << (T__10 - 8)) | (1L << (T__11 - 8)) | (1L << (T__12 - 8)) | (1L << (T__13 - 8)) | (1L << (T__14 - 8)) | (1L << (T__15 - 8)) | (1L << (T__16 - 8)) | (1L << (T__17 - 8)) | (1L << (T__18 - 8)) | (1L << (T__19 - 8)) | (1L << (T__20 - 8)) | (1L << (T__21 - 8)) | (1L << (T__22 - 8)) | (1L << (T__28 - 8)) | (1L << (T__29 - 8)) | (1L << (T__30 - 8)) | (1L << (T__31 - 8)) | (1L << (T__32 - 8)) | (1L << (T__33 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__66 - 8)) | (1L << (ID - 8)))) != 0)) {
					{
					{
					setState(236);
					sentence();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(T__26);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(T__36);
				setState(245);
				match(T__24);
				setState(246);
				expression(0);
				setState(247);
				match(T__1);
				setState(248);
				match(T__25);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__37 || _la==T__39) {
					{
					{
					setState(249);
					case_sentence();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__26);
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
		enterRule(_localctx, 32, RULE_case_sentence);
		try {
			int _alt;
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__37);
				setState(260);
				expression(0);
				setState(261);
				match(T__38);
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						sentence();
						}
						} 
					}
					setState(267);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(268);
				match(T__29);
				setState(269);
				match(T__3);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				match(T__39);
				setState(272);
				match(T__38);
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(273);
						sentence();
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(279);
				match(T__29);
				setState(280);
				match(T__3);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
		public TerminalNode INT_CONST() { return getToken(ArduinoGrammarParser.INT_CONST, 0); }
		public TerminalNode FLOAT_CONST() { return getToken(ArduinoGrammarParser.FLOAT_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(ArduinoGrammarParser.CHAR_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(ArduinoGrammarParser.STRING_CONST, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(284);
				match(ID);
				setState(285);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(286);
				expression(13);
				}
				break;
			case 2:
				{
				setState(287);
				match(T__60);
				setState(288);
				expression(11);
				}
				break;
			case 3:
				{
				setState(289);
				match(T__24);
				setState(290);
				expression(0);
				setState(291);
				match(T__1);
				}
				break;
			case 4:
				{
				setState(293);
				incdec_expression();
				}
				break;
			case 5:
				{
				setState(294);
				assignment();
				}
				break;
			case 6:
				{
				setState(295);
				match(T__61);
				}
				break;
			case 7:
				{
				setState(296);
				match(T__62);
				}
				break;
			case 8:
				{
				setState(297);
				match(ID);
				}
				break;
			case 9:
				{
				setState(298);
				match(INT_CONST);
				}
				break;
			case 10:
				{
				setState(299);
				match(FLOAT_CONST);
				}
				break;
			case 11:
				{
				setState(300);
				match(CHAR_CONST);
				}
				break;
			case 12:
				{
				setState(301);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(305);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(306);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(308);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(309);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(311);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(312);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(314);
						_la = _input.LA(1);
						if ( !(_la==T__58 || _la==T__59) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						expression(13);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
		public Incdec_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec_expression; }
	}

	public final Incdec_expressionContext incdec_expression() throws RecognitionException {
		Incdec_expressionContext _localctx = new Incdec_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_incdec_expression);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(T__63);
				setState(322);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(ID);
				setState(324);
				match(T__63);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(T__64);
				setState(326);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(ID);
				setState(328);
				match(T__64);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ID);
			setState(332);
			match(T__24);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (T__24 - 25)) | (1L << (T__60 - 25)) | (1L << (T__61 - 25)) | (1L << (T__62 - 25)) | (1L << (T__63 - 25)) | (1L << (T__64 - 25)) | (1L << (ID - 25)) | (1L << (INT_CONST - 25)) | (1L << (FLOAT_CONST - 25)) | (1L << (CHAR_CONST - 25)) | (1L << (STRING_CONST - 25)))) != 0)) {
				{
				{
				setState(333);
				parameter();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__1);
			setState(340);
			match(T__3);
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
		enterRule(_localctx, 40, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			expression(0);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__65) {
				{
				{
				setState(343);
				match(T__65);
				setState(344);
				expression(0);
				}
				}
				setState(349);
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
		public TerminalNode ID() { return getToken(ArduinoGrammarParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_static_variable);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__66);
				setState(351);
				var_type();
				setState(352);
				match(ID);
				setState(353);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__66);
				setState(356);
				var_type();
				setState(357);
				assignment();
				setState(358);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
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
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3M\u016d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5R\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tf\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13p\n\13\f"+
		"\13\16\13s\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f}\n\f\f\f\16\f\u0080"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e"+
		"\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00ac\n\20\f\20\16\20\u00af\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00b6\n\20\f\20\16\20\u00b9\13\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00cb\n\20"+
		"\f\20\16\20\u00ce\13\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00da\n\21\f\21\16\21\u00dd\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00e7\n\21\f\21\16\21\u00ea\13\21\3\21\3\21"+
		"\3\21\3\21\7\21\u00f0\n\21\f\21\16\21\u00f3\13\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00fd\n\21\f\21\16\21\u0100\13\21\3\21\3\21"+
		"\5\21\u0104\n\21\3\22\3\22\3\22\3\22\7\22\u010a\n\22\f\22\16\22\u010d"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0115\n\22\f\22\16\22\u0118"+
		"\13\22\3\22\3\22\5\22\u011c\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0131"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u013f\n\23\f\23\16\23\u0142\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u014c\n\24\3\25\3\25\3\25\7\25\u0151\n\25\f\25\16\25\u0154"+
		"\13\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u015c\n\26\f\26\16\26\u015f"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u016b\n"+
		"\27\3\27\2\3$\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\b\4"+
		"\2\n\31FF\3\2\65<\3\2+,\3\2-.\3\2/\64\3\2=>\2\u018b\2\61\3\2\2\2\4B\3"+
		"\2\2\2\6F\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fV\3\2\2\2\16Y\3\2\2\2\20e\3\2"+
		"\2\2\22g\3\2\2\2\24i\3\2\2\2\26v\3\2\2\2\30\u0083\3\2\2\2\32\u0091\3\2"+
		"\2\2\34\u00a3\3\2\2\2\36\u00d1\3\2\2\2 \u0103\3\2\2\2\"\u011b\3\2\2\2"+
		"$\u0130\3\2\2\2&\u014b\3\2\2\2(\u014d\3\2\2\2*\u0158\3\2\2\2,\u016a\3"+
		"\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\67\3\2\2\2\63\61\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\24\13\2;?\5\26\f\2<>\5"+
		"\30\r\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2B"+
		"C\7\3\2\2CD\5\6\4\2DE\7\4\2\2E\5\3\2\2\2FG\7F\2\2GH\7\5\2\2HI\7F\2\2I"+
		"\7\3\2\2\2JK\5\n\6\2KL\7\6\2\2LR\3\2\2\2MN\5\f\7\2NO\7\6\2\2OR\3\2\2\2"+
		"PR\5\20\t\2QJ\3\2\2\2QM\3\2\2\2QP\3\2\2\2R\t\3\2\2\2ST\5\22\n\2TU\7F\2"+
		"\2U\13\3\2\2\2VW\5\22\n\2WX\5\16\b\2X\r\3\2\2\2YZ\7F\2\2Z[\7\7\2\2[\\"+
		"\5$\23\2\\\17\3\2\2\2]^\7\b\2\2^_\5\22\n\2_`\5\16\b\2`a\7\6\2\2af\3\2"+
		"\2\2bc\7\t\2\2cd\7F\2\2df\5$\23\2e]\3\2\2\2eb\3\2\2\2f\21\3\2\2\2gh\t"+
		"\2\2\2h\23\3\2\2\2ij\7\30\2\2jk\7\32\2\2kl\7\33\2\2lm\7\4\2\2mq\7\34\2"+
		"\2np\5\34\17\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2"+
		"\2\2tu\7\35\2\2u\25\3\2\2\2vw\7\30\2\2wx\7\36\2\2xy\7\33\2\2yz\7\4\2\2"+
		"z~\7\34\2\2{}\5\34\17\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\35\2\2\u0082\27\3\2"+
		"\2\2\u0083\u0084\5\22\n\2\u0084\u0085\7F\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u0087\5\32\16\2\u0087\u0088\7\4\2\2\u0088\u008c\7\34\2\2\u0089\u008b"+
		"\5\34\17\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\35\2\2\u0090\31\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093"+
		"\u00a4\5\n\6\2\u0094\u00a4\5\f\7\2\u0095\u00a4\5,\27\2\u0096\u0097\5\16"+
		"\b\2\u0097\u0098\7\6\2\2\u0098\u00a4\3\2\2\2\u0099\u00a4\5(\25\2\u009a"+
		"\u00a4\5\36\20\2\u009b\u00a4\5 \21\2\u009c\u009d\7\37\2\2\u009d\u009e"+
		"\7F\2\2\u009e\u00a4\7\6\2\2\u009f\u00a0\7 \2\2\u00a0\u00a4\7\6\2\2\u00a1"+
		"\u00a2\7!\2\2\u00a2\u00a4\7\6\2\2\u00a3\u0093\3\2\2\2\u00a3\u0094\3\2"+
		"\2\2\u00a3\u0095\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3"+
		"\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009f\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7"+
		"\7\33\2\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\4\2\2\u00a9\u00ad\7\34\2\2"+
		"\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\7\35\2\2\u00b1\u00d2\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b7\7\34"+
		"\2\2\u00b4\u00b6\5\34\17\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bb\7\35\2\2\u00bb\u00bc\7\"\2\2\u00bc\u00bd\7\33\2\2\u00bd"+
		"\u00be\5$\23\2\u00be\u00bf\7\4\2\2\u00bf\u00d2\3\2\2\2\u00c0\u00c1\7$"+
		"\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\5\f\7\2\u00c3\u00c4\7\6\2\2\u00c4"+
		"\u00c5\5$\23\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\7\4"+
		"\2\2\u00c8\u00cc\7\34\2\2\u00c9\u00cb\5\34\17\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00a5\3\2\2\2\u00d1\u00b2\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d2\37\3\2\2"+
		"\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d7"+
		"\7\4\2\2\u00d7\u00db\7\34\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d8\3\2\2"+
		"\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\35\2\2\u00df\u0104\3\2\2\2"+
		"\u00e0\u00e1\7%\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4"+
		"\7\4\2\2\u00e4\u00e8\7\34\2\2\u00e5\u00e7\5\34\17\2\u00e6\u00e5\3\2\2"+
		"\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\7&\2\2\u00ed"+
		"\u00f1\7\34\2\2\u00ee\u00f0\5\34\17\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f5\7\35\2\2\u00f5\u0104\3\2\2\2\u00f6\u00f7\7"+
		"\'\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5$\23\2\u00f9\u00fa\7\4\2\2\u00fa"+
		"\u00fe\7\34\2\2\u00fb\u00fd\5\"\22\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0102\7\35\2\2\u0102\u0104\3\2\2\2\u0103\u00d3\3"+
		"\2\2\2\u0103\u00e0\3\2\2\2\u0103\u00f6\3\2\2\2\u0104!\3\2\2\2\u0105\u0106"+
		"\7(\2\2\u0106\u0107\5$\23\2\u0107\u010b\7)\2\2\u0108\u010a\5\34\17\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7 \2\2\u010f"+
		"\u0110\7\6\2\2\u0110\u011c\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0116\7)\2"+
		"\2\u0113\u0115\5\34\17\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0119\u011a\7 \2\2\u011a\u011c\7\6\2\2\u011b\u0105\3\2\2\2\u011b"+
		"\u0111\3\2\2\2\u011c#\3\2\2\2\u011d\u011e\b\23\1\2\u011e\u011f\7F\2\2"+
		"\u011f\u0120\t\3\2\2\u0120\u0131\5$\23\17\u0121\u0122\7?\2\2\u0122\u0131"+
		"\5$\23\r\u0123\u0124\7\33\2\2\u0124\u0125\5$\23\2\u0125\u0126\7\4\2\2"+
		"\u0126\u0131\3\2\2\2\u0127\u0131\5&\24\2\u0128\u0131\5\16\b\2\u0129\u0131"+
		"\7@\2\2\u012a\u0131\7A\2\2\u012b\u0131\7F\2\2\u012c\u0131\7G\2\2\u012d"+
		"\u0131\7H\2\2\u012e\u0131\7I\2\2\u012f\u0131\7J\2\2\u0130\u011d\3\2\2"+
		"\2\u0130\u0121\3\2\2\2\u0130\u0123\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0128"+
		"\3\2\2\2\u0130\u0129\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0140\3\2\2\2\u0132\u0133\f\22\2\2\u0133\u0134\t\4\2\2\u0134"+
		"\u013f\5$\23\23\u0135\u0136\f\21\2\2\u0136\u0137\t\5\2\2\u0137\u013f\5"+
		"$\23\22\u0138\u0139\f\20\2\2\u0139\u013a\t\6\2\2\u013a\u013f\5$\23\21"+
		"\u013b\u013c\f\16\2\2\u013c\u013d\t\7\2\2\u013d\u013f\5$\23\17\u013e\u0132"+
		"\3\2\2\2\u013e\u0135\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013b\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141%\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0144\7B\2\2\u0144\u014c\7F\2\2\u0145\u0146"+
		"\7F\2\2\u0146\u014c\7B\2\2\u0147\u0148\7C\2\2\u0148\u014c\7F\2\2\u0149"+
		"\u014a\7F\2\2\u014a\u014c\7C\2\2\u014b\u0143\3\2\2\2\u014b\u0145\3\2\2"+
		"\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c\'\3\2\2\2\u014d\u014e"+
		"\7F\2\2\u014e\u0152\7\33\2\2\u014f\u0151\5*\26\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\4\2\2\u0156\u0157\7\6\2\2\u0157"+
		")\3\2\2\2\u0158\u015d\5$\23\2\u0159\u015a\7D\2\2\u015a\u015c\5$\23\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e+\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7E\2\2\u0161\u0162"+
		"\5\22\n\2\u0162\u0163\7F\2\2\u0163\u0164\7\6\2\2\u0164\u016b\3\2\2\2\u0165"+
		"\u0166\7E\2\2\u0166\u0167\5\22\n\2\u0167\u0168\5\16\b\2\u0168\u0169\7"+
		"\6\2\2\u0169\u016b\3\2\2\2\u016a\u0160\3\2\2\2\u016a\u0165\3\2\2\2\u016b"+
		"-\3\2\2\2\36\61\67?Qeq~\u008c\u00a3\u00ad\u00b7\u00cc\u00d1\u00db\u00e8"+
		"\u00f1\u00fe\u0103\u010b\u0116\u011b\u0130\u013e\u0140\u014b\u0152\u015d"+
		"\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}