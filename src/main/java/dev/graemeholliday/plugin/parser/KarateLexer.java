package dev.graemeholliday.plugin.parser;

// Generated from C:/Users/gholl/IdeaProjects/plugin/src/main/antlr4\KarateLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KarateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FEATURE_COMMENT=1, FEATURE_TAGS=2, FEATURE=3, BACKGROUND=4, SCENARIO=5, 
		SCENARIO_OUTLINE=6, EXAMPLES=7, STAR=8, GIVEN=9, WHEN=10, THEN=11, AND=12, 
		BUT=13, COMMENT=14, TAGS=15, TABLE_ROW=16, DOC_STRING=17, CHAR=18, NEWLINE=19;
	public static final int
		MAIN=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "MAIN"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FEATURE_COMMENT", "FEATURE_TAGS", "FEATURE", "WSLF", "BOL", "WS", "BACKGROUND", 
			"SCENARIO", "SCENARIO_OUTLINE", "EXAMPLES", "STAR", "GIVEN", "WHEN", 
			"THEN", "AND", "BUT", "COMMENT", "TAGS", "TABLE_ROW", "DOC_STRING", "CHAR", 
			"NEWLINE"
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
			null, "FEATURE_COMMENT", "FEATURE_TAGS", "FEATURE", "BACKGROUND", "SCENARIO", 
			"SCENARIO_OUTLINE", "EXAMPLES", "STAR", "GIVEN", "WHEN", "THEN", "AND", 
			"BUT", "COMMENT", "TAGS", "TABLE_ROW", "DOC_STRING", "CHAR", "NEWLINE"
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


	public KarateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KarateLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0134\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\2\3\2"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\4\7"+
		"\4Q\n\4\f\4\16\4T\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4`\n"+
		"\4\f\4\16\4c\13\4\3\4\3\4\3\5\3\5\3\6\6\6j\n\6\r\6\16\6k\3\6\7\6o\n\6"+
		"\f\6\16\6r\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00ae\n\n\f\n\16\n\u00b1\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\3\f\3\f\3"+
		"\f\6\f\u00c7\n\f\r\f\16\f\u00c8\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00d3"+
		"\n\r\r\r\16\r\u00d4\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00de\n\16"+
		"\r\16\16\16\u00df\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00e9\n\17\r"+
		"\17\16\17\u00ea\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00f3\n\20\r\20\16"+
		"\20\u00f4\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00fd\n\21\r\21\16\21\u00fe"+
		"\3\22\3\22\3\22\7\22\u0104\n\22\f\22\16\22\u0107\13\22\3\22\3\22\3\23"+
		"\3\23\3\23\6\23\u010e\n\23\r\23\16\23\u010f\3\24\3\24\3\24\6\24\u0115"+
		"\n\24\r\24\16\24\u0116\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u011f\n\25\f"+
		"\25\16\25\u0122\13\25\3\25\3\25\3\25\3\25\3\25\7\25\u0129\n\25\f\25\16"+
		"\25\u012c\13\25\3\26\3\26\3\27\6\27\u0131\n\27\r\27\16\27\u0132\3\u0120"+
		"\2\30\4\3\6\4\b\5\n\2\f\2\16\2\20\6\22\7\24\b\26\t\30\n\32\13\34\f\36"+
		"\r \16\"\17$\20&\21(\22*\23,\24.\25\4\2\3\5\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\4\2\13\13\"\"\2\u0147\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\3\20"+
		"\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2"+
		"\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3"+
		"\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\4\63\3\2\2\2\6D\3\2"+
		"\2\2\bR\3\2\2\2\nf\3\2\2\2\fi\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22\u0088"+
		"\3\2\2\2\24\u0099\3\2\2\2\26\u00b2\3\2\2\2\30\u00c3\3\2\2\2\32\u00ca\3"+
		"\2\2\2\34\u00d6\3\2\2\2\36\u00e1\3\2\2\2 \u00ec\3\2\2\2\"\u00f6\3\2\2"+
		"\2$\u0100\3\2\2\2&\u010a\3\2\2\2(\u0111\3\2\2\2*\u0118\3\2\2\2,\u012d"+
		"\3\2\2\2.\u0130\3\2\2\2\60\62\5\n\5\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66:\7%\2\2\679\5,\26"+
		"\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5."+
		"\27\2>?\3\2\2\2?@\b\2\2\2@\5\3\2\2\2AC\5\n\5\2BA\3\2\2\2CF\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GI\7B\2\2HJ\5,\26\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5.\27\2N\7\3\2\2\2OQ\5\n\5\2PO"+
		"\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7H\2\2VW"+
		"\7g\2\2WX\7c\2\2XY\7v\2\2YZ\7w\2\2Z[\7t\2\2[\\\7g\2\2\\]\7<\2\2]a\3\2"+
		"\2\2^`\5\16\7\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3"+
		"\2\2\2de\b\4\3\2e\t\3\2\2\2fg\t\2\2\2g\13\3\2\2\2hj\t\3\2\2ih\3\2\2\2"+
		"jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2mo\t\4\2\2nm\3\2\2\2or\3\2\2\2"+
		"pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rp\3\2\2\2st\t\4\2\2t\17\3\2\2\2uv\5.\27"+
		"\2vw\7D\2\2wx\7c\2\2xy\7e\2\2yz\7m\2\2z{\7i\2\2{|\7t\2\2|}\7q\2\2}~\7"+
		"w\2\2~\177\7p\2\2\177\u0080\7f\2\2\u0080\u0081\7<\2\2\u0081\u0085\3\2"+
		"\2\2\u0082\u0084\5\16\7\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u0085\3\2\2"+
		"\2\u0088\u0089\5.\27\2\u0089\u008a\7U\2\2\u008a\u008b\7e\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7p\2\2\u008d\u008e\7c\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7q\2\2\u0091\u0092\7<\2\2\u0092\u0096\3\2\2"+
		"\2\u0093\u0095\5\16\7\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009a\5.\27\2\u009a\u009b\7U\2\2\u009b\u009c\7e\2\2\u009c\u009d"+
		"\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7t\2\2\u00a0"+
		"\u00a1\7k\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7\"\2\2\u00a3\u00a4\7Q\2"+
		"\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7<\2\2\u00ab"+
		"\u00af\3\2\2\2\u00ac\u00ae\5\16\7\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3"+
		"\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\25\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b3\5.\27\2\u00b3\u00b4\7G\2\2\u00b4\u00b5\7z\2"+
		"\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7<\2\2\u00bc"+
		"\u00c0\3\2\2\2\u00bd\u00bf\5\16\7\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\5.\27\2\u00c4\u00c6\7,\2\2\u00c5\u00c7\5\16"+
		"\7\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\31\3\2\2\2\u00ca\u00cb\5.\27\2\u00cb\u00cc\7I\2\2"+
		"\u00cc\u00cd\7k\2\2\u00cd\u00ce\7x\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00d3\5\16\7\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\33\3\2\2"+
		"\2\u00d6\u00d7\5.\27\2\u00d7\u00d8\7Y\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7p\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5\16\7\2\u00dd"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\35\3\2\2\2\u00e1\u00e2\5.\27\2\u00e2\u00e3\7V\2\2\u00e3\u00e4"+
		"\7j\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e9\5\16\7\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\5.\27\2\u00ed"+
		"\u00ee\7C\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f2\3\2\2"+
		"\2\u00f1\u00f3\5\16\7\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5!\3\2\2\2\u00f6\u00f7\5.\27\2"+
		"\u00f7\u00f8\7D\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fc"+
		"\3\2\2\2\u00fb\u00fd\5\16\7\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2"+
		"\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u0101\5"+
		".\27\2\u0101\u0105\7%\2\2\u0102\u0104\5,\26\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\b\22\2\2\u0109%\3\2\2\2\u010a\u010b"+
		"\5.\27\2\u010b\u010d\7B\2\2\u010c\u010e\5,\26\2\u010d\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\'\3\2\2\2"+
		"\u0111\u0112\5.\27\2\u0112\u0114\7~\2\2\u0113\u0115\5,\26\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		")\3\2\2\2\u0118\u0119\5.\27\2\u0119\u011a\7$\2\2\u011a\u011b\7$\2\2\u011b"+
		"\u011c\7$\2\2\u011c\u0120\3\2\2\2\u011d\u011f\13\2\2\2\u011e\u011d\3\2"+
		"\2\2\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124\u0125\7$\2"+
		"\2\u0125\u0126\7$\2\2\u0126\u012a\3\2\2\2\u0127\u0129\5,\26\2\u0128\u0127"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"+\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\n\3\2\2\u012e-\3\2\2\2\u012f"+
		"\u0131\5\f\6\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133/\3\2\2\2\34\2\3\63:DKRakp\u0085\u0096\u00af"+
		"\u00c0\u00c8\u00d4\u00df\u00ea\u00f4\u00fe\u0105\u010f\u0116\u0120\u012a"+
		"\u0132\4\2\3\2\7\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}