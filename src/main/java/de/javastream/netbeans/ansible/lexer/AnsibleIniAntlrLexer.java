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
		SECTION_VARS_HEADER=1, SECTION_GROUP_HEADER=2, SECTION_HEADER=3, WARS=4, 
		SL_COMMENT=5, LSQUARE=6, RSQUARE=7, IDENT=8, EQUAL=9, SLASH=10, DOT=11, 
		MINUS=12, COLON=13, HEX=14, STRING=15, FOLDER_NAME=16, FILE_NAME=17, PATH=18, 
		WS=19, EOL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SECTION_VARS_HEADER", "SECTION_GROUP_HEADER", "SECTION_HEADER", "WARS", 
		"SL_COMMENT", "'['", "']'", "IDENT", "'='", "'/'", "'.'", "'-'", "':'", 
		"HEX", "STRING", "FOLDER_NAME", "FILE_NAME", "PATH", "WS", "EOL"
	};
	public static final String[] ruleNames = {
		"SECTION_VARS_HEADER", "SECTION_GROUP_HEADER", "SECTION_HEADER", "WARS", 
		"SL_COMMENT", "LSQUARE", "RSQUARE", "IDENT", "EQUAL", "SLASH", "DOT", 
		"MINUS", "COLON", "HEX", "STRING", "FOLDER_NAME", "FILE_NAME", "PATH", 
		"WS", "EOL"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\26\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2/\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\5\3@\n\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\3\4\3\4\5\4Q\n\4\3\4"+
		"\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7"+
		"\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tq\n\t\f\t\16"+
		"\tt\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\6"+
		"\17\u0083\n\17\r\17\16\17\u0084\3\20\3\20\5\20\u0089\n\20\3\20\3\20\7"+
		"\20\u008d\n\20\f\20\16\20\u0090\13\20\3\21\3\21\3\21\3\21\6\21\u0096\n"+
		"\21\r\21\16\21\u0097\5\21\u009a\n\21\3\22\5\22\u009d\n\22\3\22\6\22\u00a0"+
		"\n\22\r\22\16\22\u00a1\3\23\5\23\u00a5\n\23\3\23\3\23\3\23\3\23\7\23\u00ab"+
		"\n\23\f\23\16\23\u00ae\13\23\3\23\5\23\u00b1\n\23\3\23\5\23\u00b4\n\23"+
		"\3\24\6\24\u00b7\n\24\r\24\16\24\u00b8\3\25\5\25\u00bc\n\25\3\25\3\25"+
		"\2\26\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f"+
		"\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26"+
		"\1\3\2\f\4\2\f\f\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\62;CHch\6\2\62;C\\"+
		"c|\u0080\u0080\6\2/\60\62;C\\c|\b\2/\60\62;C\\aac|\u0080\u0080\4\2\13"+
		"\13\"\"\3\2\17\17\3\2\f\f\u00d8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\3+\3\2\2\2\5<\3\2\2\2\7M\3\2\2\2\t\\\3\2\2\2\13a\3\2\2\2\rj\3\2\2\2\17"+
		"l\3\2\2\2\21n\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2"+
		"\33}\3\2\2\2\35\u0082\3\2\2\2\37\u0088\3\2\2\2!\u0099\3\2\2\2#\u009c\3"+
		"\2\2\2%\u00a4\3\2\2\2\'\u00b6\3\2\2\2)\u00bb\3\2\2\2+.\5\r\7\2,/\5\37"+
		"\20\2-/\5\21\t\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60\61\5\33\16\2\61\62"+
		"\5\t\5\2\62\67\5\17\b\2\63\66\5\'\24\2\64\66\5)\25\2\65\63\3\2\2\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2"+
		"\2:;\5)\25\2;\4\3\2\2\2<?\5\r\7\2=@\5\37\20\2>@\5\21\t\2?=\3\2\2\2?>\3"+
		"\2\2\2@A\3\2\2\2AB\5\33\16\2BC\5\21\t\2CH\5\17\b\2DG\5\'\24\2EG\5)\25"+
		"\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2"+
		"\2KL\5)\25\2L\6\3\2\2\2MP\5\r\7\2NQ\5\37\20\2OQ\5\21\t\2PN\3\2\2\2PO\3"+
		"\2\2\2QR\3\2\2\2RW\5\17\b\2SV\5\'\24\2TV\5)\25\2US\3\2\2\2UT\3\2\2\2V"+
		"Y\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5)\25\2[\b\3\2\2\2"+
		"\\]\7x\2\2]^\7c\2\2^_\7t\2\2_`\7u\2\2`\n\3\2\2\2ae\7%\2\2bd\n\2\2\2cb"+
		"\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\5)\25\2i"+
		"\f\3\2\2\2jk\7]\2\2k\16\3\2\2\2lm\7_\2\2m\20\3\2\2\2nr\t\3\2\2oq\t\4\2"+
		"\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\22\3\2\2\2tr\3\2\2\2uv\7?"+
		"\2\2v\24\3\2\2\2wx\7\61\2\2x\26\3\2\2\2yz\7\60\2\2z\30\3\2\2\2{|\7/\2"+
		"\2|\32\3\2\2\2}~\7<\2\2~\34\3\2\2\2\177\u0080\7\'\2\2\u0080\u0081\t\5"+
		"\2\2\u0081\u0083\t\5\2\2\u0082\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\36\3\2\2\2\u0086\u0089\t\6\2\2\u0087"+
		"\u0089\5\35\17\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008e\3"+
		"\2\2\2\u008a\u008d\t\7\2\2\u008b\u008d\5\35\17\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f \3\2\2\2\u0090\u008e\3\2\2\2\u0091\u009a\7\60\2\2\u0092\u0093"+
		"\7\60\2\2\u0093\u009a\7\60\2\2\u0094\u0096\t\b\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a"+
		"\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0095\3\2\2\2\u009a"+
		"\"\3\2\2\2\u009b\u009d\7\60\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u009f\3\2\2\2\u009e\u00a0\t\b\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2$\3\2\2\2\u00a3"+
		"\u00a5\5\25\13\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00ac\5!\21\2\u00a7\u00a8\5\25\13\2\u00a8\u00a9\5!\21\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b1\5\25\13\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00b4\5#\22\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"&\3\2\2\2\u00b5\u00b7\t\t\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9(\3\2\2\2\u00ba\u00bc\t"+
		"\n\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\t\13\2\2\u00be*\3\2\2\2\34\2.\65\67?FHPUWer\u0084\u0088\u008c\u008e"+
		"\u0097\u0099\u009c\u00a1\u00a4\u00ac\u00b0\u00b3\u00b8\u00bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}