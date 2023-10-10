// Generated from dew.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class dewLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, SUB=11, MUL=12, DIV=13, NAME=14, STRING=15, NUMBER=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ADD", "SUB", "MUL", "DIV", "NAME", "STRING", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'int'", "'str'", "'float'", "'bool'", "'('", "')'", 
			"','", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ADD", "SUB", 
			"MUL", "DIV", "NAME", "STRING", "NUMBER", "WS"
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


	public dewLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dew.g4"; }

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
		"\u0004\u0000\u0011o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rK\b\r\n\r\f\rN\t\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000eR\b\u000e\n\u000e\f\u000eU\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0003\u000fZ\b\u000f\u0001\u000f\u0004"+
		"\u000f]\b\u000f\u000b\u000f\f\u000f^\u0001\u000f\u0001\u000f\u0004\u000f"+
		"c\b\u000f\u000b\u000f\f\u000fd\u0003\u000fg\b\u000f\u0001\u0010\u0004"+
		"\u0010j\b\u0010\u000b\u0010\f\u0010k\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0004\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0001\u0000\"\"\u0003\u0000\t\n\f\r  u\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005\'"+
		"\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000\u0000\t/\u0001\u0000"+
		"\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000"+
		"\u000f<\u0001\u0000\u0000\u0000\u0011>\u0001\u0000\u0000\u0000\u0013@"+
		"\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000\u0000\u0017D\u0001\u0000"+
		"\u0000\u0000\u0019F\u0001\u0000\u0000\u0000\u001bH\u0001\u0000\u0000\u0000"+
		"\u001dO\u0001\u0000\u0000\u0000\u001fY\u0001\u0000\u0000\u0000!i\u0001"+
		"\u0000\u0000\u0000#$\u0005;\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005=\u0000\u0000&\u0004\u0001\u0000\u0000\u0000\'(\u0005i\u0000\u0000"+
		"()\u0005n\u0000\u0000)*\u0005t\u0000\u0000*\u0006\u0001\u0000\u0000\u0000"+
		"+,\u0005s\u0000\u0000,-\u0005t\u0000\u0000-.\u0005r\u0000\u0000.\b\u0001"+
		"\u0000\u0000\u0000/0\u0005f\u0000\u000001\u0005l\u0000\u000012\u0005o"+
		"\u0000\u000023\u0005a\u0000\u000034\u0005t\u0000\u00004\n\u0001\u0000"+
		"\u0000\u000056\u0005b\u0000\u000067\u0005o\u0000\u000078\u0005o\u0000"+
		"\u000089\u0005l\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005(\u0000"+
		"\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005)\u0000\u0000=\u0010\u0001"+
		"\u0000\u0000\u0000>?\u0005,\u0000\u0000?\u0012\u0001\u0000\u0000\u0000"+
		"@A\u0005+\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BC\u0005-\u0000\u0000"+
		"C\u0016\u0001\u0000\u0000\u0000DE\u0005*\u0000\u0000E\u0018\u0001\u0000"+
		"\u0000\u0000FG\u0005/\u0000\u0000G\u001a\u0001\u0000\u0000\u0000HL\u0007"+
		"\u0000\u0000\u0000IK\u0007\u0001\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u001c\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OS\u0005"+
		"\"\u0000\u0000PR\b\u0002\u0000\u0000QP\u0001\u0000\u0000\u0000RU\u0001"+
		"\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005\"\u0000\u0000"+
		"W\u001e\u0001\u0000\u0000\u0000XZ\u0005-\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[]\u000209"+
		"\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_f\u0001\u0000\u0000\u0000`b\u0005"+
		".\u0000\u0000ac\u000209\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g \u0001\u0000\u0000\u0000hj\u0007\u0003\u0000\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0010\u0000\u0000n\"\u0001"+
		"\u0000\u0000\u0000\b\u0000LSY^dfk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}