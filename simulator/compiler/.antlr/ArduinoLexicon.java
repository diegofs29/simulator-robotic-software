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
		BIT_SHIFT_L=1, BIT_SHIFT_R=2, LOW=3, HIGH=4, BINARY_CONST=5, OCTAL_CONST=6, 
		HEX_CONST=7, INT_CONST=8, FLOAT_CONST=9, CHAR_CONST=10, UNTERMINATED_CHAR=11, 
		STRING_CONST=12, UNTERMINATED_STRING=13, ID=14, LINE_COMMENT=15, MULTILINE_COMMENT=16, 
		WHITESPACE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "BINARY_CONST", "OCTAL_CONST", 
			"HEX_CONST", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", 
			"STRING_CONST", "UNTERMINATED_STRING", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
			"WHITESPACE"
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
			null, "BIT_SHIFT_L", "BIT_SHIFT_R", "LOW", "HIGH", "BINARY_CONST", "OCTAL_CONST", 
			"HEX_CONST", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", 
			"STRING_CONST", "UNTERMINATED_STRING", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\6\68\n\6\r\6\16\69\3\7\3\7\6\7>\n\7\r\7\16\7?\3\b\3\b\3\b\6\b"+
		"E\n\b\r\b\16\bF\3\t\5\tJ\n\t\3\t\6\tM\n\t\r\t\16\tN\3\n\5\nR\n\n\3\n\6"+
		"\nU\n\n\r\n\16\nV\3\n\3\n\6\n[\n\n\r\n\16\n\\\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\17\3\17\7\17q"+
		"\n\17\f\17\16\17t\13\17\3\20\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13"+
		"\20\3\20\5\20\u0080\n\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u0088\n\21"+
		"\f\21\16\21\u008b\13\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u0093\n\22"+
		"\r\22\16\22\u0094\3\22\3\22\4{\u0089\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\f\3\2\62\63"+
		"\3\2\629\5\2\62;CHch\3\2\62;\5\2\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62"+
		";C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"\2\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5(\3\2\2\2"+
		"\7+\3\2\2\2\t/\3\2\2\2\13\64\3\2\2\2\r;\3\2\2\2\17A\3\2\2\2\21I\3\2\2"+
		"\2\23Q\3\2\2\2\25^\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2\33g\3\2\2\2\35n\3\2"+
		"\2\2\37u\3\2\2\2!\u0083\3\2\2\2#\u0092\3\2\2\2%&\7>\2\2&\'\7>\2\2\'\4"+
		"\3\2\2\2()\7@\2\2)*\7@\2\2*\6\3\2\2\2+,\7N\2\2,-\7Q\2\2-.\7Y\2\2.\b\3"+
		"\2\2\2/\60\7J\2\2\60\61\7K\2\2\61\62\7I\2\2\62\63\7J\2\2\63\n\3\2\2\2"+
		"\64\65\7\62\2\2\65\67\7d\2\2\668\t\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3"+
		"\2\2\29:\3\2\2\2:\f\3\2\2\2;=\7\62\2\2<>\t\3\2\2=<\3\2\2\2>?\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@\16\3\2\2\2AB\7\62\2\2BD\7z\2\2CE\t\4\2\2DC\3\2\2"+
		"\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\20\3\2\2\2HJ\7/\2\2IH\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KM\t\5\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\22\3"+
		"\2\2\2PR\7/\2\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7\60\2\2Y[\t\5\2\2ZY\3\2\2\2[\\"+
		"\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\24\3\2\2\2^_\5\27\f\2_`\7)\2\2`\26\3\2"+
		"\2\2ab\7)\2\2bc\n\6\2\2c\30\3\2\2\2de\5\33\16\2ef\7$\2\2f\32\3\2\2\2g"+
		"k\7$\2\2hj\n\7\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\34\3\2\2\2"+
		"mk\3\2\2\2nr\t\b\2\2oq\t\t\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2"+
		"s\36\3\2\2\2tr\3\2\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\13\2\2\2yx\3"+
		"\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~\u0080\t\n"+
		"\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\20\2\2\u0082 \3\2"+
		"\2\2\u0083\u0084\7\61\2\2\u0084\u0085\7,\2\2\u0085\u0089\3\2\2\2\u0086"+
		"\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008d\7,\2\2\u008d\u008e\7\61\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\21"+
		"\2\2\u0090\"\3\2\2\2\u0091\u0093\t\13\2\2\u0092\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\22\2\2\u0097$\3\2\2\2\21\29?FINQV\\kr{\177\u0089\u0094\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}