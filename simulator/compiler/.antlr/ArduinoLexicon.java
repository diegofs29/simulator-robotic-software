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
		BIT_SHIFT_L=1, BIT_SHIFT_R=2, INT_CONST=3, FLOAT_CONST=4, CHAR_CONST=5, 
		UNTERMINATED_CHAR=6, STRING_CONST=7, UNTERMINATED_STRING=8, ID=9, LINE_COMMENT=10, 
		MULTILINE_COMMENT=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BIT_SHIFT_L", "BIT_SHIFT_R", "INT_CONST", "FLOAT_CONST", "CHAR_CONST", 
			"UNTERMINATED_CHAR", "STRING_CONST", "UNTERMINATED_STRING", "ID", "LINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\5\4#\n\4\3\4\6\4&\n\4"+
		"\r\4\16\4\'\3\5\5\5+\n\5\3\5\6\5.\n\5\r\5\16\5/\3\5\3\5\6\5\64\n\5\r\5"+
		"\16\5\65\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\7\tC\n\t\f\t\16\t"+
		"F\13\t\3\n\3\n\7\nJ\n\n\f\n\16\nM\13\n\3\13\3\13\3\13\3\13\7\13S\n\13"+
		"\f\13\16\13V\13\13\3\13\5\13Y\n\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fa\n\f"+
		"\f\f\16\fd\13\f\3\f\3\f\3\f\3\f\3\f\3\r\6\rl\n\r\r\r\16\rm\3\r\3\r\4T"+
		"b\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\t"+
		"\3\2\62;\5\2\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2"+
		"\13\f\17\17\"\"\2z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2\7\"\3\2\2\2\t*"+
		"\3\2\2\2\13\67\3\2\2\2\r:\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23G\3\2\2\2"+
		"\25N\3\2\2\2\27\\\3\2\2\2\31k\3\2\2\2\33\34\7>\2\2\34\35\7>\2\2\35\4\3"+
		"\2\2\2\36\37\7@\2\2\37 \7@\2\2 \6\3\2\2\2!#\7/\2\2\"!\3\2\2\2\"#\3\2\2"+
		"\2#%\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\b\3"+
		"\2\2\2)+\7/\2\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\7\60\2\2\62\64\t\2\2"+
		"\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\n\3\2\2"+
		"\2\678\5\r\7\289\7)\2\29\f\3\2\2\2:;\7)\2\2;<\n\3\2\2<\16\3\2\2\2=>\5"+
		"\21\t\2>?\7$\2\2?\20\3\2\2\2@D\7$\2\2AC\n\4\2\2BA\3\2\2\2CF\3\2\2\2DB"+
		"\3\2\2\2DE\3\2\2\2E\22\3\2\2\2FD\3\2\2\2GK\t\5\2\2HJ\t\6\2\2IH\3\2\2\2"+
		"JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\24\3\2\2\2MK\3\2\2\2NO\7\61\2\2OP\7\61"+
		"\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2WY\t\7\2\2XW\3\2\2\2YZ\3\2\2\2Z[\b\13\2\2[\26\3\2\2\2"+
		"\\]\7\61\2\2]^\7,\2\2^b\3\2\2\2_a\13\2\2\2`_\3\2\2\2ad\3\2\2\2bc\3\2\2"+
		"\2b`\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7,\2\2fg\7\61\2\2gh\3\2\2\2hi\b\f\2"+
		"\2i\30\3\2\2\2jl\t\b\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2op\b\r\2\2p\32\3\2\2\2\16\2\"\'*/\65DKTXbm\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}