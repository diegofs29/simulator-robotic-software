// Generated from e:\Asignaturas\Cuarto\TFG\SimuladorSoftwareRobots\simulator\compiler\ArduinoLexicon.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BIT_SHIFT_L=1, BIT_SHIFT_R=2, LOW=3, HIGH=4, ANALOG_PIN=5, BINARY_CONST=6, 
		OCTAL_CONST=7, HEX_CONST=8, INT_CONST=9, FLOAT_CONST=10, CHAR_CONST=11, 
		UNTERMINATED_CHAR=12, STRING_CONST=13, UNTERMINATED_STRING=14, ID=15, 
		LINE_COMMENT=16, MULTILINE_COMMENT=17, WHITESPACE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "ANALOG_PIN", "BINARY_CONST", 
			"OCTAL_CONST", "HEX_CONST", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", 
			"UNTERMINATED_CHAR", "STRING_CONST", "UNTERMINATED_STRING", "ID", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'LOW'", "'HIGH'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "ANALOG_PIN", "BINARY_CONST", 
			"OCTAL_CONST", "HEX_CONST", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\6\7=\n\7\r\7\16\7>\3\b\3\b\6\bC\n\b\r\b"+
		"\16\bD\3\t\3\t\3\t\6\tJ\n\t\r\t\16\tK\3\n\5\nO\n\n\3\n\6\nR\n\n\r\n\16"+
		"\nS\3\13\5\13W\n\13\3\13\6\13Z\n\13\r\13\16\13[\3\13\3\13\6\13`\n\13\r"+
		"\13\16\13a\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7\17o\n\17"+
		"\f\17\16\17r\13\17\3\20\3\20\7\20v\n\20\f\20\16\20y\13\20\3\21\3\21\3"+
		"\21\3\21\7\21\177\n\21\f\21\16\21\u0082\13\21\3\21\5\21\u0085\n\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\6\23\u0098\n\23\r\23\16\23\u0099\3\23\3\23\4"+
		"\u0080\u008e\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\r\3\2\62\67\3\2\62\63\3\2\629\5"+
		"\2\62;CHch\3\2\62;\5\2\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62;C\\aac|\3"+
		"\3\f\f\5\2\13\f\17\17\"\"\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5*\3\2\2"+
		"\2\7-\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r9\3\2\2\2\17@\3\2\2\2\21F\3"+
		"\2\2\2\23N\3\2\2\2\25V\3\2\2\2\27c\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35"+
		"l\3\2\2\2\37s\3\2\2\2!z\3\2\2\2#\u0088\3\2\2\2%\u0097\3\2\2\2\'(\7>\2"+
		"\2()\7>\2\2)\4\3\2\2\2*+\7@\2\2+,\7@\2\2,\6\3\2\2\2-.\7N\2\2./\7Q\2\2"+
		"/\60\7Y\2\2\60\b\3\2\2\2\61\62\7J\2\2\62\63\7K\2\2\63\64\7I\2\2\64\65"+
		"\7J\2\2\65\n\3\2\2\2\66\67\7C\2\2\678\t\2\2\28\f\3\2\2\29:\7\62\2\2:<"+
		"\7d\2\2;=\t\3\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\16\3\2\2\2"+
		"@B\7\62\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\20\3\2"+
		"\2\2FG\7\62\2\2GI\7z\2\2HJ\t\5\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\22\3\2\2\2MO\7/\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\t\6\2\2QP\3"+
		"\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\24\3\2\2\2UW\7/\2\2VU\3\2\2\2VW"+
		"\3\2\2\2WY\3\2\2\2XZ\t\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\]\3\2\2\2]_\7\60\2\2^`\t\6\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2b\26\3\2\2\2cd\5\31\r\2de\7)\2\2e\30\3\2\2\2fg\7)\2\2gh\n\7\2\2h\32"+
		"\3\2\2\2ij\5\35\17\2jk\7$\2\2k\34\3\2\2\2lp\7$\2\2mo\n\b\2\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\36\3\2\2\2rp\3\2\2\2sw\t\t\2\2tv\t\n\2"+
		"\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x \3\2\2\2yw\3\2\2\2z{\7\61"+
		"\2\2{|\7\61\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0085\t\13\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0087\b\21\2\2\u0087\"\3\2\2\2\u0088\u0089\7\61\2\2\u0089\u008a"+
		"\7,\2\2\u008a\u008e\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093\7\61\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\b\22\2\2\u0095$\3\2\2\2\u0096\u0098\t\f\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\23\2\2\u009c&\3\2\2\2\21\2"+
		">DKNSV[apw\u0080\u0084\u008e\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}