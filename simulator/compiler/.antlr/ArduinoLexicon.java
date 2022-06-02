// Generated from e:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\ArduinoLexicon.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArduinoLexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BIT_SHIFT_L=1, BIT_SHIFT_R=2, LOW=3, HIGH=4, ANALOG_PIN=5, INPUT=6, INPUT_PULLUP=7, 
		OUTPUT=8, BINARY_CONST=9, OCTAL_CONST=10, HEX_CONST=11, INT_CONST=12, 
		FLOAT_CONST=13, CHAR_CONST=14, UNTERMINATED_CHAR=15, STRING_CONST=16, 
		UNTERMINATED_STRING=17, ID=18, LINE_COMMENT=19, MULTILINE_COMMENT=20, 
		WHITESPACE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "ANALOG_PIN", "INPUT", "INPUT_PULLUP", 
			"OUTPUT", "BINARY_CONST", "OCTAL_CONST", "HEX_CONST", "INT_CONST", "FLOAT_CONST", 
			"CHAR_CONST", "UNTERMINATED_CHAR", "STRING_CONST", "UNTERMINATED_STRING", 
			"ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'LOW'", "'HIGH'", null, "'INPUT'", "'INPUT_PULLUP'", 
			"'OUTPUT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "ANALOG_PIN", "INPUT", 
			"INPUT_PULLUP", "OUTPUT", "BINARY_CONST", "OCTAL_CONST", "HEX_CONST", 
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


	public ArduinoLexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArduinoLexicon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\6\n]\n\n\r\n\16\n^\3\13\3\13\6\13c\n\13\r\13"+
		"\16\13d\3\f\3\f\3\f\6\fj\n\f\r\f\16\fk\3\r\5\ro\n\r\3\r\6\rr\n\r\r\r\16"+
		"\rs\3\16\5\16w\n\16\3\16\6\16z\n\16\r\16\16\16{\3\16\3\16\6\16\u0080\n"+
		"\16\r\16\16\16\u0081\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\7\22\u008f\n\22\f\22\16\22\u0092\13\22\3\23\3\23\7\23\u0096\n\23"+
		"\f\23\16\23\u0099\13\23\3\24\3\24\3\24\3\24\7\24\u009f\n\24\f\24\16\24"+
		"\u00a2\13\24\3\24\5\24\u00a5\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00ad"+
		"\n\25\f\25\16\25\u00b0\13\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u00b8"+
		"\n\26\r\26\16\26\u00b9\3\26\3\26\4\u00a0\u00ae\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27\3\2\r\3\2\62\67\3\2\62\63\3\2\629\5\2\62;CHch\3\2\62;\5\2"+
		"\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17"+
		"\"\"\2\u00c9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2"+
		"\2\5\60\3\2\2\2\7\63\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\r?\3\2\2\2\17E\3"+
		"\2\2\2\21R\3\2\2\2\23Y\3\2\2\2\25`\3\2\2\2\27f\3\2\2\2\31n\3\2\2\2\33"+
		"v\3\2\2\2\35\u0083\3\2\2\2\37\u0086\3\2\2\2!\u0089\3\2\2\2#\u008c\3\2"+
		"\2\2%\u0093\3\2\2\2\'\u009a\3\2\2\2)\u00a8\3\2\2\2+\u00b7\3\2\2\2-.\7"+
		">\2\2./\7>\2\2/\4\3\2\2\2\60\61\7@\2\2\61\62\7@\2\2\62\6\3\2\2\2\63\64"+
		"\7N\2\2\64\65\7Q\2\2\65\66\7Y\2\2\66\b\3\2\2\2\678\7J\2\289\7K\2\29:\7"+
		"I\2\2:;\7J\2\2;\n\3\2\2\2<=\7C\2\2=>\t\2\2\2>\f\3\2\2\2?@\7K\2\2@A\7P"+
		"\2\2AB\7R\2\2BC\7W\2\2CD\7V\2\2D\16\3\2\2\2EF\7K\2\2FG\7P\2\2GH\7R\2\2"+
		"HI\7W\2\2IJ\7V\2\2JK\7a\2\2KL\7R\2\2LM\7W\2\2MN\7N\2\2NO\7N\2\2OP\7W\2"+
		"\2PQ\7R\2\2Q\20\3\2\2\2RS\7Q\2\2ST\7W\2\2TU\7V\2\2UV\7R\2\2VW\7W\2\2W"+
		"X\7V\2\2X\22\3\2\2\2YZ\7\62\2\2Z\\\7d\2\2[]\t\3\2\2\\[\3\2\2\2]^\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_\24\3\2\2\2`b\7\62\2\2ac\t\4\2\2ba\3\2\2\2cd\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\26\3\2\2\2fg\7\62\2\2gi\7z\2\2hj\t\5\2\2i"+
		"h\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\30\3\2\2\2mo\7/\2\2nm\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pr\t\6\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"t\32\3\2\2\2uw\7/\2\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\t\6\2\2yx\3\2\2"+
		"\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\7\60\2\2~\u0080\t\6\2"+
		"\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\34\3\2\2\2\u0083\u0084\5\37\20\2\u0084\u0085\7)\2\2\u0085\36"+
		"\3\2\2\2\u0086\u0087\7)\2\2\u0087\u0088\n\7\2\2\u0088 \3\2\2\2\u0089\u008a"+
		"\5#\22\2\u008a\u008b\7$\2\2\u008b\"\3\2\2\2\u008c\u0090\7$\2\2\u008d\u008f"+
		"\n\b\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091$\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0097\t\t\2\2"+
		"\u0094\u0096\t\n\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098&\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\61\2\2\u009b\u009c\7\61\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\13"+
		"\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\t\13"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\24\2\2\u00a7"+
		"(\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ae\3\2\2\2"+
		"\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7,\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\25"+
		"\2\2\u00b5*\3\2\2\2\u00b6\u00b8\t\f\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bc\b\26\2\2\u00bc,\3\2\2\2\21\2^dknsv{\u0081\u0090\u0097\u00a0\u00a4"+
		"\u00ae\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}