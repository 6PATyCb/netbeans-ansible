// Generated from C:\Users\6PATyCb\Documents\NetBeansProjects\github\netbeans-ansible\src\main\java\de\javastream\netbeans\ansible\lexer\AnsibleIniAntlr.g4 by ANTLR 4.1
package de.javastream.netbeans.ansible.lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnsibleIniAntlrLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOST_AND_PORT=1, GROUP=2, RANGE_HOST_NAME=3, NAME=4, NUMBER=5, HOST_NAME=6, 
		IPV4=7, STRING=8, EOL=9, WS=10, SL_COMMENT=11, OPERATOR=12, LSQUARE=13, 
		RSQUARE=14, IDENT=15, CHARS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"HOST_AND_PORT", "GROUP", "RANGE_HOST_NAME", "NAME", "NUMBER", "HOST_NAME", 
		"IPV4", "STRING", "EOL", "WS", "SL_COMMENT", "OPERATOR", "'['", "']'", 
		"IDENT", "CHARS"
	};
	public static final String[] ruleNames = {
		"HOST_AND_PORT", "GROUP", "RANGE_HOST_NAME", "NAME", "NUMBER", "HOST_NAME", 
		"IPV4", "STRING", "EOL", "WS", "SL_COMMENT", "OPERATOR", "LSQUARE", "RSQUARE", 
		"IDENT", "LETTER", "DIGIT", "NO_ZERO_DIGIT", "CHARS"
	};


	public AnsibleIniAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnsibleIniAntlr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\22\u00ba\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\6\4?\n\4\r\4\16\4@\3\4\3"+
		"\4\6\4E\n\4\r\4\16\4F\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\5\3\5\3\5\3"+
		"\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\3\7\3\7\3"+
		"\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\5\bk\n\b\3\b\5\bn\n\b\3\b\3\b\3\b\5"+
		"\bs\n\b\3\b\5\bv\n\b\3\b\3\b\3\b\5\b{\n\b\3\b\5\b~\n\b\3\b\3\b\3\b\5\b"+
		"\u0083\n\b\3\b\5\b\u0086\n\b\3\b\3\b\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f"+
		"\13\t\3\t\3\t\3\n\3\n\3\13\6\13\u0096\n\13\r\13\16\13\u0097\3\f\3\f\7"+
		"\f\u009c\n\f\f\f\16\f\u009f\13\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\7\20\u00ab\n\20\f\20\16\20\u00ae\13\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\6\24\u00b7\n\24\r\24\16\24\u00b8\2\25\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\2\1#\2\1%\2\1\'\22\1\3\2\n\4\2/\60aa\4\2//aa\4\2\f"+
		"\f$$\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62;C\\aac|\r\2$$\'(,,/;"+
		">>@@B\\^^aac}\177\177\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\78\3\2\2\2\tP\3\2\2\2\13Y\3"+
		"\2\2\2\r`\3\2\2\2\17j\3\2\2\2\21\u0089\3\2\2\2\23\u0092\3\2\2\2\25\u0095"+
		"\3\2\2\2\27\u0099\3\2\2\2\31\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3"+
		"\2\2\2\37\u00a8\3\2\2\2!\u00af\3\2\2\2#\u00b1\3\2\2\2%\u00b3\3\2\2\2\'"+
		"\u00b6\3\2\2\2)*\5\r\7\2*+\7<\2\2+,\5\13\6\2,\4\3\2\2\2-.\5\33\16\2.\61"+
		"\5\t\5\2/\60\7<\2\2\60\62\5\t\5\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2"+
		"\2\2\63\64\5\35\17\2\64\6\3\2\2\2\659\5!\21\2\669\5#\22\2\679\t\2\2\2"+
		"8\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3"+
		"\2\2\2<>\5\33\16\2=?\5#\22\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"B\3\2\2\2BD\7<\2\2CE\5#\22\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G"+
		"H\3\2\2\2HL\5\35\17\2IM\5!\21\2JM\5#\22\2KM\t\2\2\2LI\3\2\2\2LJ\3\2\2"+
		"\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\b\3\2\2\2PV\5!\21\2QU\5!\21"+
		"\2RU\5#\22\2SU\t\3\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2W\n\3\2\2\2XV\3\2\2\2Y]\5%\23\2Z\\\5#\22\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^\f\3\2\2\2_]\3\2\2\2`f\5!\21\2ae\5!\21\2be"+
		"\5#\22\2ce\t\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2f"+
		"g\3\2\2\2g\16\3\2\2\2hf\3\2\2\2ik\4\63\64\2ji\3\2\2\2jk\3\2\2\2km\3\2"+
		"\2\2ln\4\62;\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\4\62;\2pr\7\60\2\2qs\4"+
		"\63\64\2rq\3\2\2\2rs\3\2\2\2su\3\2\2\2tv\4\62;\2ut\3\2\2\2uv\3\2\2\2v"+
		"w\3\2\2\2wx\4\62;\2xz\7\60\2\2y{\4\63\64\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2"+
		"\2|~\4\62;\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\4\62;\2\u0080"+
		"\u0082\7\60\2\2\u0081\u0083\4\63\64\2\u0082\u0081\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\4\62;\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\4\62;\2\u0088\20\3\2\2"+
		"\2\u0089\u008d\7$\2\2\u008a\u008c\n\4\2\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091\22\3\2\2\2\u0092\u0093\t\5\2\2"+
		"\u0093\24\3\2\2\2\u0094\u0096\t\6\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009d\7%\2\2\u009a\u009c\n\5\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\5\23\n\2\u00a1\30\3\2\2\2\u00a2\u00a3\7?\2"+
		"\2\u00a3\32\3\2\2\2\u00a4\u00a5\7]\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7"+
		"_\2\2\u00a7\36\3\2\2\2\u00a8\u00ac\t\7\2\2\u00a9\u00ab\t\b\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		" \3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0\"\3\2\2\2\u00b1"+
		"\u00b2\4\62;\2\u00b2$\3\2\2\2\u00b3\u00b4\4\63;\2\u00b4&\3\2\2\2\u00b5"+
		"\u00b7\t\t\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9(\3\2\2\2\34\2\618:@FLNTV]dfjmruz}\u0082"+
		"\u0085\u008d\u0097\u009d\u00ac\u00b8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}