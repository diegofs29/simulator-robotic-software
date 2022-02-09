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
		BIT_SHIFT_L=1, BIT_SHIFT_R=2, BINARY_CONST=3, OCTAL_CONST=4, HEX_CONST=5, 
		INT_CONST=6, FLOAT_CONST=7, CHAR_CONST=8, UNTERMINATED_CHAR=9, STRING_CONST=10, 
		UNTERMINATED_STRING=11, ID=12, LINE_COMMENT=13, MULTILINE_COMMENT=14, 
		WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BIT_SHIFT_L", "BIT_SHIFT_R", "BINARY_CONST", "OCTAL_CONST", "HEX_CONST", 
			"INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", "STRING_CONST", 
			"UNTERMINATED_STRING", "ID", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\6\5\61\n\5\r\5\16\5\62"+
		"\3\6\3\6\3\6\6\68\n\6\r\6\16\69\3\7\5\7=\n\7\3\7\6\7@\n\7\r\7\16\7A\3"+
		"\b\5\bE\n\b\3\b\6\bH\n\b\r\b\16\bI\3\b\3\b\6\bN\n\b\r\b\16\bO\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\7\f]\n\f\f\f\16\f`\13\f\3\r\3"+
		"\r\7\rd\n\r\f\r\16\rg\13\r\3\16\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p"+
		"\13\16\3\16\5\16s\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17{\n\17\f\17\16"+
		"\17~\13\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u0086\n\20\r\20\16\20\u0087"+
		"\3\20\3\20\4n|\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21\3\2\f\3\2\62\63\3\2\629\5\2\62;CHch\3\2\62;\5"+
		"\2\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17"+
		"\"\"\2\u0097\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2"+
		"\2\2\5$\3\2\2\2\7\'\3\2\2\2\t.\3\2\2\2\13\64\3\2\2\2\r<\3\2\2\2\17D\3"+
		"\2\2\2\21Q\3\2\2\2\23T\3\2\2\2\25W\3\2\2\2\27Z\3\2\2\2\31a\3\2\2\2\33"+
		"h\3\2\2\2\35v\3\2\2\2\37\u0085\3\2\2\2!\"\7>\2\2\"#\7>\2\2#\4\3\2\2\2"+
		"$%\7@\2\2%&\7@\2\2&\6\3\2\2\2\'(\7\62\2\2(*\7d\2\2)+\t\2\2\2*)\3\2\2\2"+
		"+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\b\3\2\2\2.\60\7\62\2\2/\61\t\3\2\2\60"+
		"/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\n\3\2\2\2\64\65"+
		"\7\62\2\2\65\67\7z\2\2\668\t\4\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\2"+
		"9:\3\2\2\2:\f\3\2\2\2;=\7/\2\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\t\5\2\2"+
		"?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\16\3\2\2\2CE\7/\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FH\t\5\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2JK\3\2\2\2KM\7\60\2\2LN\t\5\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2P\20\3\2\2\2QR\5\23\n\2RS\7)\2\2S\22\3\2\2\2TU\7)\2\2UV\n\6\2\2V\24"+
		"\3\2\2\2WX\5\27\f\2XY\7$\2\2Y\26\3\2\2\2Z^\7$\2\2[]\n\7\2\2\\[\3\2\2\2"+
		"]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`^\3\2\2\2ae\t\b\2\2bd\t\t"+
		"\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\32\3\2\2\2ge\3\2\2\2hi\7"+
		"\61\2\2ij\7\61\2\2jn\3\2\2\2km\13\2\2\2lk\3\2\2\2mp\3\2\2\2no\3\2\2\2"+
		"nl\3\2\2\2or\3\2\2\2pn\3\2\2\2qs\t\n\2\2rq\3\2\2\2st\3\2\2\2tu\b\16\2"+
		"\2u\34\3\2\2\2vw\7\61\2\2wx\7,\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3"+
		"\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7,\2\2\u0080"+
		"\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\17\2\2\u0083\36\3\2"+
		"\2\2\u0084\u0086\t\13\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\20"+
		"\2\2\u008a \3\2\2\2\21\2,\629<ADIO^enr|\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}