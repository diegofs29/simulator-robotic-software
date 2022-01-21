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
		BIT_SHIFT_R=74, INT_CONST=75, FLOAT_CONST=76, CHAR_CONST=77, UNTERMINATED_CHAR=78, 
		STRING_CONST=79, UNTERMINATED_STRING=80, ID=81, LINE_COMMENT=82, MULTILINE_COMMENT=83, 
		WHITESPACE=84;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_program_code = 2, RULE_declaration = 3, 
		RULE_h_file = 4, RULE_definition = 5, RULE_simple_definition = 6, RULE_assignment_definition = 7, 
		RULE_assignment = 8, RULE_array_definition = 9, RULE_array_index = 10, 
		RULE_constant = 11, RULE_var_type = 12, RULE_function = 13, RULE_function_args = 14, 
		RULE_iteration_sentence = 15, RULE_conditional_sentence = 16, RULE_code_block = 17, 
		RULE_sentence = 18, RULE_case_sentence = 19, RULE_expression = 20, RULE_incdec_expression = 21, 
		RULE_function_call = 22, RULE_parameter = 23, RULE_static_variable = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "program_code", "declaration", "h_file", "definition", 
			"simple_definition", "assignment_definition", "assignment", "array_definition", 
			"array_index", "constant", "var_type", "function", "function_args", "iteration_sentence", 
			"conditional_sentence", "code_block", "sentence", "case_sentence", "expression", 
			"incdec_expression", "function_call", "parameter", "static_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include'", "'<'", "'>'", "'.'", "';'", "'='", "'['", "']'", 
			"'{'", "','", "'}'", "'const'", "'#define'", "'bool'", "'boolean'", "'byte'", 
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
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", 
			"UNTERMINATED_CHAR", "STRING_CONST", "UNTERMINATED_STRING", "ID", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(53);
				((ProgramContext)_localctx).declaration = declaration();
				((ProgramContext)_localctx).declarations.add(((ProgramContext)_localctx).declaration);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				{
				setState(59);
				((ProgramContext)_localctx).program_code = program_code();
				((ProgramContext)_localctx).code.add(((ProgramContext)_localctx).program_code);
				}
				}
				setState(64);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((Program_codeContext)_localctx).var_def = definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__0);
				setState(72);
				match(T__1);
				setState(73);
				h_file();
				setState(74);
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
			setState(78);
			match(ID);
			setState(79);
			match(T__3);
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
				setState(82);
				((DefinitionContext)_localctx).s_def = simple_definition();
				setState(83);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((DefinitionContext)_localctx).a_def = array_definition();
				setState(86);
				match(T__4);
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
		public AssignmentContext assign;
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
			setState(97);
			((Assignment_definitionContext)_localctx).v_type = var_type();
			setState(98);
			((Assignment_definitionContext)_localctx).assign = assignment();
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ID);
				setState(101);
				match(T__5);
				setState(102);
				((AssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(ID);
				setState(104);
				match(T__6);
				setState(105);
				match(INT_CONST);
				setState(106);
				match(T__7);
				setState(107);
				match(T__5);
				setState(108);
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
		public Var_typeContext v_type;
		public Array_indexContext a_index;
		public ExpressionContext expression;
		public List<ExpressionContext> elements = new ArrayList<ExpressionContext>();
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Array_indexContext array_index() {
			return getRuleContext(Array_indexContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(112);
				match(ID);
				setState(113);
				((Array_definitionContext)_localctx).a_index = array_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((Array_definitionContext)_localctx).v_type = var_type();
				setState(116);
				match(ID);
				setState(117);
				((Array_definitionContext)_localctx).a_index = array_index();
				setState(118);
				match(T__5);
				setState(119);
				match(T__8);
				setState(120);
				((Array_definitionContext)_localctx).expression = expression(0);
				((Array_definitionContext)_localctx).elements.add(((Array_definitionContext)_localctx).expression);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(121);
					match(T__9);
					setState(122);
					((Array_definitionContext)_localctx).expression = expression(0);
					((Array_definitionContext)_localctx).elements.add(((Array_definitionContext)_localctx).expression);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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
			setState(138);
			match(T__6);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_CONST) {
				{
				setState(139);
				match(INT_CONST);
				}
			}

			setState(142);
			match(T__7);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(143);
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

	public static class ConstantContext extends ParserRuleContext {
		public Token const_type;
		public Var_typeContext v_type;
		public AssignmentContext assign;
		public ExpressionContext expr;
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
		enterRule(_localctx, 22, RULE_constant);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((ConstantContext)_localctx).const_type = match(T__11);
				setState(147);
				((ConstantContext)_localctx).v_type = var_type();
				setState(148);
				((ConstantContext)_localctx).assign = assignment();
				setState(149);
				match(T__4);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((ConstantContext)_localctx).const_type = match(T__12);
				setState(152);
				match(ID);
				setState(153);
				((ConstantContext)_localctx).expr = expression(0);
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
		enterRule(_localctx, 24, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			((FunctionContext)_localctx).v_type = var_type();
			setState(159);
			match(ID);
			setState(160);
			match(T__29);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || _la==ID) {
				{
				setState(161);
				((FunctionContext)_localctx).f_args = function_args();
				}
			}

			setState(164);
			match(T__30);
			setState(165);
			match(T__8);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
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
		enterRule(_localctx, 28, RULE_function_args);
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
		enterRule(_localctx, 30, RULE_iteration_sentence);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((Iteration_sentenceContext)_localctx).it_type = match(T__31);
				setState(183);
				match(T__29);
				setState(184);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(185);
				match(T__30);
				setState(186);
				((Iteration_sentenceContext)_localctx).code = code_block();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((Iteration_sentenceContext)_localctx).it_type = match(T__32);
				setState(189);
				((Iteration_sentenceContext)_localctx).code = code_block();
				setState(190);
				match(T__31);
				setState(191);
				match(T__29);
				setState(192);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(193);
				match(T__30);
				setState(194);
				match(T__4);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((Iteration_sentenceContext)_localctx).it_type = match(T__33);
				setState(197);
				match(T__29);
				setState(198);
				((Iteration_sentenceContext)_localctx).assign_def = assignment_definition();
				setState(199);
				match(T__4);
				setState(200);
				((Iteration_sentenceContext)_localctx).condition = expression(0);
				setState(201);
				match(T__4);
				setState(202);
				((Iteration_sentenceContext)_localctx).expr = expression(0);
				setState(203);
				match(T__30);
				setState(204);
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
		enterRule(_localctx, 32, RULE_conditional_sentence);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(209);
				match(T__29);
				setState(210);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(211);
				match(T__30);
				setState(212);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__34);
				setState(215);
				match(T__29);
				setState(216);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(217);
				match(T__30);
				setState(218);
				((Conditional_sentenceContext)_localctx).if_code = code_block();
				setState(219);
				match(T__35);
				setState(220);
				((Conditional_sentenceContext)_localctx).else_code = code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				((Conditional_sentenceContext)_localctx).cond_type = match(T__36);
				setState(223);
				match(T__29);
				setState(224);
				((Conditional_sentenceContext)_localctx).expr = expression(0);
				setState(225);
				match(T__30);
				setState(226);
				match(T__8);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__40 || _la==T__42) {
					{
					{
					setState(227);
					((Conditional_sentenceContext)_localctx).case_sentence = case_sentence();
					((Conditional_sentenceContext)_localctx).sentences.add(((Conditional_sentenceContext)_localctx).case_sentence);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(233);
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
		enterRule(_localctx, 34, RULE_code_block);
		int _la;
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__8);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__43) | (1L << T__44))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)) | (1L << (INT_CONST - 68)) | (1L << (FLOAT_CONST - 68)) | (1L << (CHAR_CONST - 68)) | (1L << (STRING_CONST - 68)) | (1L << (ID - 68)))) != 0)) {
					{
					{
					setState(238);
					((Code_blockContext)_localctx).sentence = sentence();
					((Code_blockContext)_localctx).sentences.add(((Code_blockContext)_localctx).sentence);
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__10);
				}
				break;
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
			case INT_CONST:
			case FLOAT_CONST:
			case CHAR_CONST:
			case STRING_CONST:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
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
		enterRule(_localctx, 36, RULE_sentence);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((SentenceContext)_localctx).a_def = assignment_definition();
				setState(249);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((SentenceContext)_localctx).s_def = simple_definition();
				setState(252);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				((SentenceContext)_localctx).arr_def = array_definition();
				setState(255);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				((SentenceContext)_localctx).s_var = static_variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				((SentenceContext)_localctx).it_sent = iteration_sentence();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				((SentenceContext)_localctx).cond_sent = conditional_sentence();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				((SentenceContext)_localctx).expr = expression(0);
				setState(261);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(263);
				((SentenceContext)_localctx).s_type = match(T__37);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
					{
					setState(264);
					((SentenceContext)_localctx).expr = expression(0);
					}
				}

				setState(267);
				match(T__4);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				((SentenceContext)_localctx).s_type = match(T__38);
				setState(269);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				((SentenceContext)_localctx).s_type = match(T__39);
				setState(271);
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
		enterRule(_localctx, 38, RULE_case_sentence);
		try {
			int _alt;
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				((Case_sentenceContext)_localctx).sent_type = match(T__40);
				setState(275);
				((Case_sentenceContext)_localctx).expr = expression(0);
				setState(276);
				match(T__41);
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(277);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(282);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(283);
				match(T__38);
				setState(284);
				match(T__4);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((Case_sentenceContext)_localctx).sent_type = match(T__42);
				setState(287);
				match(T__41);
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						((Case_sentenceContext)_localctx).sentence = sentence();
						((Case_sentenceContext)_localctx).sentences.add(((Case_sentenceContext)_localctx).sentence);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(294);
				match(T__38);
				setState(295);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(299);
				match(T__29);
				setState(300);
				((ExpressionContext)_localctx).r_expr = expression(0);
				setState(301);
				match(T__30);
				}
				break;
			case 2:
				{
				setState(303);
				((ExpressionContext)_localctx).f_call = function_call();
				}
				break;
			case 3:
				{
				setState(304);
				((ExpressionContext)_localctx).i_d_expr = incdec_expression();
				}
				break;
			case 4:
				{
				setState(305);
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
				setState(306);
				((ExpressionContext)_localctx).expr = expression(20);
				}
				break;
			case 5:
				{
				setState(307);
				((ExpressionContext)_localctx).assign = assignment();
				}
				break;
			case 6:
				{
				setState(308);
				match(T__67);
				}
				break;
			case 7:
				{
				setState(309);
				match(T__68);
				}
				break;
			case 8:
				{
				setState(310);
				match(INT_CONST);
				}
				break;
			case 9:
				{
				setState(311);
				match(FLOAT_CONST);
				}
				break;
			case 10:
				{
				setState(312);
				match(CHAR_CONST);
				}
				break;
			case 11:
				{
				setState(313);
				match(STRING_CONST);
				}
				break;
			case 12:
				{
				setState(314);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(318);
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
						setState(319);
						((ExpressionContext)_localctx).right = expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(321);
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
						setState(322);
						((ExpressionContext)_localctx).right = expression(19);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(324);
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
						setState(325);
						((ExpressionContext)_localctx).right = expression(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(326);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(327);
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
						setState(328);
						((ExpressionContext)_localctx).right = expression(17);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(330);
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
						setState(331);
						((ExpressionContext)_localctx).right = expression(16);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(333);
						((ExpressionContext)_localctx).operator = match(T__54);
						setState(334);
						((ExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(336);
						((ExpressionContext)_localctx).operator = match(T__55);
						setState(337);
						((ExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(339);
						((ExpressionContext)_localctx).operator = match(T__56);
						setState(340);
						((ExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(342);
						((ExpressionContext)_localctx).operator = match(T__57);
						setState(343);
						((ExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(345);
						((ExpressionContext)_localctx).operator = match(T__58);
						setState(346);
						((ExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(348);
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
						setState(349);
						((ExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.array_name = _prevctx;
						_localctx.array_name = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(351);
						match(T__6);
						setState(352);
						((ExpressionContext)_localctx).index = expression(0);
						setState(353);
						match(T__7);
						}
						break;
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 42, RULE_incdec_expression);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				setState(361);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(ID);
				setState(363);
				((Incdec_expressionContext)_localctx).operator = match(T__69);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				((Incdec_expressionContext)_localctx).operator = match(T__70);
				setState(365);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(ID);
				setState(367);
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
		public ParameterContext args;
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
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(T__29);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__43 - 30)) | (1L << (T__44 - 30)) | (1L << (T__67 - 30)) | (1L << (T__68 - 30)) | (1L << (T__69 - 30)) | (1L << (T__70 - 30)) | (1L << (INT_CONST - 30)) | (1L << (FLOAT_CONST - 30)) | (1L << (CHAR_CONST - 30)) | (1L << (STRING_CONST - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				setState(372);
				((Function_callContext)_localctx).args = parameter();
				}
			}

			setState(375);
			match(T__30);
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
		enterRule(_localctx, 46, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((ParameterContext)_localctx).expression = expression(0);
			((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(378);
				match(T__9);
				setState(379);
				((ParameterContext)_localctx).expression = expression(0);
				((ParameterContext)_localctx).parameters.add(((ParameterContext)_localctx).expression);
				}
				}
				setState(384);
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
		public AssignmentContext assign;
		public TerminalNode ID() { return getToken(ArduinoParser.ID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__71);
				setState(386);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(387);
				match(ID);
				setState(388);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(T__71);
				setState(391);
				((Static_variableContext)_localctx).v_type = var_type();
				setState(392);
				((Static_variableContext)_localctx).assign = assignment();
				setState(393);
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
		case 20:
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
		case 11:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3\16"+
		"\3B\13\3\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16\13"+
		"\u0081\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008b\n\13\3"+
		"\f\3\f\5\f\u008f\n\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u009d\n\r\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17"+
		"\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\17\3\17\3\20\3\20"+
		"\3\20\7\20\u00b4\n\20\f\20\16\20\u00b7\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u00e7\n\22\f\22\16\22\u00ea\13\22\3\22\3\22\5\22\u00ee\n\22\3\23"+
		"\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\5\23\u00f9\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u010c\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0113\n"+
		"\24\3\25\3\25\3\25\3\25\7\25\u0119\n\25\f\25\16\25\u011c\13\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\7\25\u0124\n\25\f\25\16\25\u0127\13\25\3\25\3"+
		"\25\5\25\u012b\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u013e\n\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0166\n\26\f\26\16\26\u0169\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0173\n\27\3\30\3\30\3\30"+
		"\5\30\u0178\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u017f\n\31\f\31\16\31\u0182"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u018e\n"+
		"\32\3\32\2\3*\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\n\4\2\20\37SS\3\2./\3\2\60\62\3\2\63\64\3\2KL\4\2\4\5\65\66\3\2\67"+
		"8\3\2>E\2\u01b8\2\64\3\2\2\2\4:\3\2\2\2\6E\3\2\2\2\bN\3\2\2\2\nP\3\2\2"+
		"\2\f^\3\2\2\2\16`\3\2\2\2\20c\3\2\2\2\22o\3\2\2\2\24\u008a\3\2\2\2\26"+
		"\u008c\3\2\2\2\30\u009c\3\2\2\2\32\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00b0"+
		"\3\2\2\2 \u00d0\3\2\2\2\"\u00ed\3\2\2\2$\u00f8\3\2\2\2&\u0112\3\2\2\2"+
		"(\u012a\3\2\2\2*\u013d\3\2\2\2,\u0172\3\2\2\2.\u0174\3\2\2\2\60\u017b"+
		"\3\2\2\2\62\u018d\3\2\2\2\64\65\5\4\3\2\65\66\7\2\2\3\66\3\3\2\2\2\67"+
		"9\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2"+
		"\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2B@\3\2"+
		"\2\2CF\5\f\7\2DF\5\34\17\2EC\3\2\2\2ED\3\2\2\2F\7\3\2\2\2GH\7\3\2\2HO"+
		"\7Q\2\2IJ\7\3\2\2JK\7\4\2\2KL\5\n\6\2LM\7\5\2\2MO\3\2\2\2NG\3\2\2\2NI"+
		"\3\2\2\2O\t\3\2\2\2PQ\7S\2\2QR\7\6\2\2RS\7S\2\2S\13\3\2\2\2TU\5\16\b\2"+
		"UV\7\7\2\2V_\3\2\2\2WX\5\24\13\2XY\7\7\2\2Y_\3\2\2\2Z[\5\20\t\2[\\\7\7"+
		"\2\2\\_\3\2\2\2]_\5\30\r\2^T\3\2\2\2^W\3\2\2\2^Z\3\2\2\2^]\3\2\2\2_\r"+
		"\3\2\2\2`a\5\32\16\2ab\7S\2\2b\17\3\2\2\2cd\5\32\16\2de\5\22\n\2e\21\3"+
		"\2\2\2fg\7S\2\2gh\7\b\2\2hp\5*\26\2ij\7S\2\2jk\7\t\2\2kl\7M\2\2lm\7\n"+
		"\2\2mn\7\b\2\2np\5*\26\2of\3\2\2\2oi\3\2\2\2p\23\3\2\2\2qr\5\32\16\2r"+
		"s\7S\2\2st\5\26\f\2t\u008b\3\2\2\2uv\5\32\16\2vw\7S\2\2wx\5\26\f\2xy\7"+
		"\b\2\2yz\7\13\2\2z\177\5*\26\2{|\7\f\2\2|~\5*\26\2}{\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0083\7\r\2\2\u0083\u008b\3\2\2\2\u0084\u0085\5\32\16\2\u0085"+
		"\u0086\7S\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\b\2\2\u0088\u0089\5*"+
		"\26\2\u0089\u008b\3\2\2\2\u008aq\3\2\2\2\u008au\3\2\2\2\u008a\u0084\3"+
		"\2\2\2\u008b\25\3\2\2\2\u008c\u008e\7\t\2\2\u008d\u008f\7M\2\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\7\n\2\2\u0091"+
		"\u0093\5\26\f\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2"+
		"\2\u0094\u0095\7\16\2\2\u0095\u0096\5\32\16\2\u0096\u0097\5\22\n\2\u0097"+
		"\u0098\7\7\2\2\u0098\u009d\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\7"+
		"S\2\2\u009b\u009d\5*\26\2\u009c\u0094\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\31\3\2\2\2\u009e\u009f\t\2\2\2\u009f\33\3\2\2\2\u00a0\u00a1\5\32\16\2"+
		"\u00a1\u00a2\7S\2\2\u00a2\u00a4\7 \2\2\u00a3\u00a5\5\36\20\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7!\2\2\u00a7"+
		"\u00ab\7\13\2\2\u00a8\u00aa\5&\24\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\35\3\2\2\2\u00b0\u00b5\5\16\b"+
		"\2\u00b1\u00b2\7\f\2\2\u00b2\u00b4\5\16\b\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\37\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7 \2\2\u00ba\u00bb"+
		"\5*\26\2\u00bb\u00bc\7!\2\2\u00bc\u00bd\5$\23\2\u00bd\u00d1\3\2\2\2\u00be"+
		"\u00bf\7#\2\2\u00bf\u00c0\5$\23\2\u00c0\u00c1\7\"\2\2\u00c1\u00c2\7 \2"+
		"\2\u00c2\u00c3\5*\26\2\u00c3\u00c4\7!\2\2\u00c4\u00c5\7\7\2\2\u00c5\u00d1"+
		"\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\5\20\t\2\u00c9"+
		"\u00ca\7\7\2\2\u00ca\u00cb\5*\26\2\u00cb\u00cc\7\7\2\2\u00cc\u00cd\5*"+
		"\26\2\u00cd\u00ce\7!\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d1\3\2\2\2\u00d0"+
		"\u00b8\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d1!\3\2\2\2"+
		"\u00d2\u00d3\7%\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6"+
		"\7!\2\2\u00d6\u00d7\5$\23\2\u00d7\u00ee\3\2\2\2\u00d8\u00d9\7%\2\2\u00d9"+
		"\u00da\7 \2\2\u00da\u00db\5*\26\2\u00db\u00dc\7!\2\2\u00dc\u00dd\5$\23"+
		"\2\u00dd\u00de\7&\2\2\u00de\u00df\5$\23\2\u00df\u00ee\3\2\2\2\u00e0\u00e1"+
		"\7\'\2\2\u00e1\u00e2\7 \2\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\7!\2\2\u00e4"+
		"\u00e8\7\13\2\2\u00e5\u00e7\5(\25\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00d2\3\2"+
		"\2\2\u00ed\u00d8\3\2\2\2\u00ed\u00e0\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f3"+
		"\7\13\2\2\u00f0\u00f2\5&\24\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2"+
		"\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f9\7\r\2\2\u00f7\u00f9\5&\24\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\7\7\2\2"+
		"\u00fc\u0113\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\7\7\2\2\u00ff\u0113"+
		"\3\2\2\2\u0100\u0101\5\24\13\2\u0101\u0102\7\7\2\2\u0102\u0113\3\2\2\2"+
		"\u0103\u0113\5\62\32\2\u0104\u0113\5 \21\2\u0105\u0113\5\"\22\2\u0106"+
		"\u0107\5*\26\2\u0107\u0108\7\7\2\2\u0108\u0113\3\2\2\2\u0109\u010b\7("+
		"\2\2\u010a\u010c\5*\26\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u0113\7\7\2\2\u010e\u010f\7)\2\2\u010f\u0113\7\7"+
		"\2\2\u0110\u0111\7*\2\2\u0111\u0113\7\7\2\2\u0112\u00fa\3\2\2\2\u0112"+
		"\u00fd\3\2\2\2\u0112\u0100\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0104\3\2"+
		"\2\2\u0112\u0105\3\2\2\2\u0112\u0106\3\2\2\2\u0112\u0109\3\2\2\2\u0112"+
		"\u010e\3\2\2\2\u0112\u0110\3\2\2\2\u0113\'\3\2\2\2\u0114\u0115\7+\2\2"+
		"\u0115\u0116\5*\26\2\u0116\u011a\7,\2\2\u0117\u0119\5&\24\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7)\2\2\u011e\u011f\7\7"+
		"\2\2\u011f\u012b\3\2\2\2\u0120\u0121\7-\2\2\u0121\u0125\7,\2\2\u0122\u0124"+
		"\5&\24\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7)"+
		"\2\2\u0129\u012b\7\7\2\2\u012a\u0114\3\2\2\2\u012a\u0120\3\2\2\2\u012b"+
		")\3\2\2\2\u012c\u012d\b\26\1\2\u012d\u012e\7 \2\2\u012e\u012f\5*\26\2"+
		"\u012f\u0130\7!\2\2\u0130\u013e\3\2\2\2\u0131\u013e\5.\30\2\u0132\u013e"+
		"\5,\27\2\u0133\u0134\t\3\2\2\u0134\u013e\5*\26\26\u0135\u013e\5\22\n\2"+
		"\u0136\u013e\7F\2\2\u0137\u013e\7G\2\2\u0138\u013e\7M\2\2\u0139\u013e"+
		"\7N\2\2\u013a\u013e\7O\2\2\u013b\u013e\7Q\2\2\u013c\u013e\7S\2\2\u013d"+
		"\u012c\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0132\3\2\2\2\u013d\u0133\3\2"+
		"\2\2\u013d\u0135\3\2\2\2\u013d\u0136\3\2\2\2\u013d\u0137\3\2\2\2\u013d"+
		"\u0138\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013a\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013c\3\2\2\2\u013e\u0167\3\2\2\2\u013f\u0140\f\25\2\2\u0140"+
		"\u0141\t\4\2\2\u0141\u0166\5*\26\26\u0142\u0143\f\24\2\2\u0143\u0144\t"+
		"\5\2\2\u0144\u0166\5*\26\25\u0145\u0146\f\23\2\2\u0146\u0147\t\6\2\2\u0147"+
		"\u0166\5*\26\24\u0148\u0149\f\22\2\2\u0149\u014a\t\7\2\2\u014a\u0166\5"+
		"*\26\23\u014b\u014c\f\21\2\2\u014c\u014d\t\b\2\2\u014d\u0166\5*\26\22"+
		"\u014e\u014f\f\20\2\2\u014f\u0150\79\2\2\u0150\u0166\5*\26\21\u0151\u0152"+
		"\f\17\2\2\u0152\u0153\7:\2\2\u0153\u0166\5*\26\20\u0154\u0155\f\16\2\2"+
		"\u0155\u0156\7;\2\2\u0156\u0166\5*\26\17\u0157\u0158\f\r\2\2\u0158\u0159"+
		"\7<\2\2\u0159\u0166\5*\26\16\u015a\u015b\f\f\2\2\u015b\u015c\7=\2\2\u015c"+
		"\u0166\5*\26\r\u015d\u015e\f\13\2\2\u015e\u015f\t\t\2\2\u015f\u0166\5"+
		"*\26\f\u0160\u0161\f\27\2\2\u0161\u0162\7\t\2\2\u0162\u0163\5*\26\2\u0163"+
		"\u0164\7\n\2\2\u0164\u0166\3\2\2\2\u0165\u013f\3\2\2\2\u0165\u0142\3\2"+
		"\2\2\u0165\u0145\3\2\2\2\u0165\u0148\3\2\2\2\u0165\u014b\3\2\2\2\u0165"+
		"\u014e\3\2\2\2\u0165\u0151\3\2\2\2\u0165\u0154\3\2\2\2\u0165\u0157\3\2"+
		"\2\2\u0165\u015a\3\2\2\2\u0165\u015d\3\2\2\2\u0165\u0160\3\2\2\2\u0166"+
		"\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168+\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u016a\u016b\7H\2\2\u016b\u0173\7S\2\2\u016c\u016d"+
		"\7S\2\2\u016d\u0173\7H\2\2\u016e\u016f\7I\2\2\u016f\u0173\7S\2\2\u0170"+
		"\u0171\7S\2\2\u0171\u0173\7I\2\2\u0172\u016a\3\2\2\2\u0172\u016c\3\2\2"+
		"\2\u0172\u016e\3\2\2\2\u0172\u0170\3\2\2\2\u0173-\3\2\2\2\u0174\u0175"+
		"\7S\2\2\u0175\u0177\7 \2\2\u0176\u0178\5\60\31\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\7!\2\2\u017a/\3\2\2\2\u017b"+
		"\u0180\5*\26\2\u017c\u017d\7\f\2\2\u017d\u017f\5*\26\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\61\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7J\2\2\u0184\u0185\5\32\16"+
		"\2\u0185\u0186\7S\2\2\u0186\u0187\7\7\2\2\u0187\u018e\3\2\2\2\u0188\u0189"+
		"\7J\2\2\u0189\u018a\5\32\16\2\u018a\u018b\5\22\n\2\u018b\u018c\7\7\2\2"+
		"\u018c\u018e\3\2\2\2\u018d\u0183\3\2\2\2\u018d\u0188\3\2\2\2\u018e\63"+
		"\3\2\2\2!:@EN^o\177\u008a\u008e\u0092\u009c\u00a4\u00ab\u00b5\u00d0\u00e8"+
		"\u00ed\u00f3\u00f8\u010b\u0112\u011a\u0125\u012a\u013d\u0165\u0167\u0172"+
		"\u0177\u0180\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}