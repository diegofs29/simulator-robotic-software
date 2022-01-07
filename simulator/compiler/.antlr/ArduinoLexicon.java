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
		INT_CONST=1, FLOAT_CONST=2, CHAR_CONST=3, UNTERMINATED_CHAR=4, STRING_CONST=5, 
		UNTERMINATED_STRING=6, ID=7, LINE_COMMENT=8, MULTILINE_COMMENT=9, WHITESPACE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
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
			null, "INT_CONST", "FLOAT_CONST", "CHAR_CONST", "UNTERMINATED_CHAR", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fg\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\5\2\31\n\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\5\3!\n\3\3\3\6\3$\n"+
		"\3\r\3\16\3%\3\3\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b"+
		"\3\t\3\t\3\t\3\t\7\tI\n\t\f\t\16\tL\13\t\3\t\5\tO\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13b\n\13\r"+
		"\13\16\13c\3\13\3\13\4JX\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\3\2\t\3\2\62;\5\2\f\f))^^\5\2\f\f$$^^\5\2C\\aac|\6\2\62;C\\aac|"+
		"\3\3\f\f\5\2\13\f\17\17\"\"\2p\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\3\30\3\2\2\2\5 \3\2\2\2\7-\3\2\2\2\t\60\3\2\2\2\13\63"+
		"\3\2\2\2\r\66\3\2\2\2\17=\3\2\2\2\21D\3\2\2\2\23R\3\2\2\2\25a\3\2\2\2"+
		"\27\31\7/\2\2\30\27\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\34\t\2\2\2"+
		"\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\4\3\2\2\2"+
		"\37!\7/\2\2 \37\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"$\t\2\2\2#\"\3\2\2\2$%\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2\')\7\60\2\2(*\t\2\2\2)(\3\2\2\2"+
		"*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\6\3\2\2\2-.\5\t\5\2./\7)\2\2/\b\3\2\2"+
		"\2\60\61\7)\2\2\61\62\n\3\2\2\62\n\3\2\2\2\63\64\5\r\7\2\64\65\7$\2\2"+
		"\65\f\3\2\2\2\66:\7$\2\2\679\n\4\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:"+
		";\3\2\2\2;\16\3\2\2\2<:\3\2\2\2=A\t\5\2\2>@\t\6\2\2?>\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\20\3\2\2\2CA\3\2\2\2DE\7\61\2\2EF\7\61\2\2FJ\3"+
		"\2\2\2GI\13\2\2\2HG\3\2\2\2IL\3\2\2\2JK\3\2\2\2JH\3\2\2\2KN\3\2\2\2LJ"+
		"\3\2\2\2MO\t\7\2\2NM\3\2\2\2OP\3\2\2\2PQ\b\t\2\2Q\22\3\2\2\2RS\7\61\2"+
		"\2ST\7,\2\2TX\3\2\2\2UW\13\2\2\2VU\3\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2"+
		"\2Y[\3\2\2\2ZX\3\2\2\2[\\\7,\2\2\\]\7\61\2\2]^\3\2\2\2^_\b\n\2\2_\24\3"+
		"\2\2\2`b\t\b\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b"+
		"\13\2\2f\26\3\2\2\2\16\2\30\35 %+:AJNXc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}