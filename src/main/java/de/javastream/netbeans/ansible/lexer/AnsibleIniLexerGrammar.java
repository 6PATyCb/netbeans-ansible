// Generated from C:\Users\6PATyCb\Documents\NetBeansProjects\github\netbeans-ansible\src\main\java\de\javastream\netbeans\ansible\lexer\AnsibleIniLexerGrammar.g4 by ANTLR 4.1
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
public class AnsibleIniLexerGrammar extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOST_AND_PORT=1, GROUP=2, RANGE_HOST_NAME=3, NAME=4, NUMBER=5, HOST_NAME=6, 
		IPV4=7, STRING=8, WS=9, SL_COMMENT=10, OPERATOR=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"HOST_AND_PORT", "GROUP", "RANGE_HOST_NAME", "NAME", "NUMBER", "HOST_NAME", 
		"IPV4", "STRING", "WS", "SL_COMMENT", "OPERATOR"
	};
	public static final String[] ruleNames = {
		"HOST_AND_PORT", "GROUP", "RANGE_HOST_NAME", "NAME", "NUMBER", "HOST_NAME", 
		"IPV4", "STRING", "WS", "SL_COMMENT", "OPERATOR", "LSQUARE", "RSQUARE", 
		"LETTER", "DIGIT", "NO_ZERO_DIGIT"
	};


	public AnsibleIniLexerGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnsibleIniLexerGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\r\u00a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\3\3\3\3\4\3\4\3\4\6\4\63\n\4\r\4\16"+
		"\4\64\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\6\4?\n\4\r\4\16\4@\3\4\3\4\3"+
		"\4\3\4\6\4G\n\4\r\4\16\4H\3\5\3\5\3\5\3\5\7\5O\n\5\f\5\16\5R\13\5\3\6"+
		"\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3"+
		"\b\5\be\n\b\3\b\5\bh\n\b\3\b\3\b\3\b\5\bm\n\b\3\b\5\bp\n\b\3\b\3\b\3\b"+
		"\5\bu\n\b\3\b\5\bx\n\b\3\b\3\b\3\b\5\b}\n\b\3\b\5\b\u0080\n\b\3\b\3\b"+
		"\3\t\3\t\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\t\3\t\3\n\6\n\u008e\n\n\r"+
		"\n\16\n\u008f\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\4\u0087\u0095"+
		"\22\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\2\1\33\2\1\35\2\1\37\2\1!\2\1\3\2\7\4\2/\60aa\4\2//aa\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\4\2C\\c|\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3#\3\2\2\2\5\'\3\2\2\2\7\62"+
		"\3\2\2\2\tJ\3\2\2\2\13S\3\2\2\2\rZ\3\2\2\2\17d\3\2\2\2\21\u0083\3\2\2"+
		"\2\23\u008d\3\2\2\2\25\u0091\3\2\2\2\27\u009a\3\2\2\2\31\u009c\3\2\2\2"+
		"\33\u009e\3\2\2\2\35\u00a0\3\2\2\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#$\5"+
		"\r\7\2$%\7<\2\2%&\5\13\6\2&\4\3\2\2\2\'(\5\31\r\2(+\5\t\5\2)*\7<\2\2*"+
		",\5\t\5\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\5\33\16\2.\6\3\2\2\2/\63\5\35"+
		"\17\2\60\63\5\37\20\2\61\63\t\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\668\5\31"+
		"\r\2\679\5\37\20\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2"+
		"<>\7<\2\2=?\5\37\20\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2"+
		"\2BF\5\33\16\2CG\5\35\17\2DG\5\37\20\2EG\t\2\2\2FC\3\2\2\2FD\3\2\2\2F"+
		"E\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\b\3\2\2\2JP\5\35\17\2KO\5\35"+
		"\17\2LO\5\37\20\2MO\t\3\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2OR\3\2\2\2PN"+
		"\3\2\2\2PQ\3\2\2\2Q\n\3\2\2\2RP\3\2\2\2SW\5!\21\2TV\5\37\20\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\f\3\2\2\2YW\3\2\2\2Z`\5\35\17\2[_\5"+
		"\35\17\2\\_\5\37\20\2]_\t\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2a\16\3\2\2\2b`\3\2\2\2ce\4\63\64\2dc\3\2\2\2de\3"+
		"\2\2\2eg\3\2\2\2fh\4\62;\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\4\62;\2jl\7"+
		"\60\2\2km\4\63\64\2lk\3\2\2\2lm\3\2\2\2mo\3\2\2\2np\4\62;\2on\3\2\2\2"+
		"op\3\2\2\2pq\3\2\2\2qr\4\62;\2rt\7\60\2\2su\4\63\64\2ts\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vx\4\62;\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\4\62;\2z|\7\60"+
		"\2\2{}\4\63\64\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\4\62;\2\177~"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\4\62;\2\u0082"+
		"\20\3\2\2\2\u0083\u0087\7$\2\2\u0084\u0086\n\4\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008e\t\5\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\24\3\2\2\2\u0091\u0095\7%\2\2\u0092\u0094"+
		"\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\7\f\2\2\u0099\26\3\2\2\2\u009a\u009b\7?\2\2\u009b\30\3\2\2\2\u009c\u009d"+
		"\7]\2\2\u009d\32\3\2\2\2\u009e\u009f\7_\2\2\u009f\34\3\2\2\2\u00a0\u00a1"+
		"\t\6\2\2\u00a1\36\3\2\2\2\u00a2\u00a3\4\62;\2\u00a3 \3\2\2\2\u00a4\u00a5"+
		"\4\63;\2\u00a5\"\3\2\2\2\32\2+\62\64:@FHNPW^`dglotw|\177\u0087\u008f\u0095";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}