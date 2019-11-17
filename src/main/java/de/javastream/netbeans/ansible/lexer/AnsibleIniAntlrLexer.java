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
		WARS=1, SL_COMMENT=2, LSQUARE=3, RSQUARE=4, IDENT=5, EQUAL=6, SLASH=7, 
		DOT=8, COLON=9, HEX=10, STRING=11, WS=12, EOL=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WARS", "SL_COMMENT", "'['", "']'", "IDENT", "'='", "'/'", "'.'", "':'", 
		"HEX", "STRING", "WS", "EOL"
	};
	public static final String[] ruleNames = {
		"WARS", "SL_COMMENT", "LSQUARE", "RSQUARE", "IDENT", "EQUAL", "SLASH", 
		"DOT", "COLON", "HEX", "STRING", "WS", "EOL"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\17Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3%\n\3\f\3"+
		"\16\3(\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6\62\n\6\f\6\16\6\65\13"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\6\13B\n\13\r\13\16\13"+
		"C\3\f\3\f\5\fH\n\f\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\r\6\rR\n\r\r\r\16"+
		"\rS\3\16\5\16W\n\16\3\16\3\16\2\17\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\3\2\13\4\2\f\f"+
		"\17\17\4\2C\\c|\6\2\62;C\\aac|\5\2\62;CHch\6\2\62;C\\c|\u0080\u0080\6"+
		"\2/\60\62;C\\c|\4\2\13\13\"\"\3\2\17\17\3\2\f\fa\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\"\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\66\3"+
		"\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25A\3\2\2\2\27G\3\2\2\2\31"+
		"Q\3\2\2\2\33V\3\2\2\2\35\36\7x\2\2\36\37\7c\2\2\37 \7t\2\2 !\7u\2\2!\4"+
		"\3\2\2\2\"&\7%\2\2#%\n\2\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\')\3\2\2\2(&\3\2\2\2)*\5\33\16\2*\6\3\2\2\2+,\7]\2\2,\b\3\2\2\2-.\7_"+
		"\2\2.\n\3\2\2\2/\63\t\3\2\2\60\62\t\4\2\2\61\60\3\2\2\2\62\65\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\f\3\2\2\2\65\63\3\2\2\2\66\67\7?\2\2\67"+
		"\16\3\2\2\289\7\61\2\29\20\3\2\2\2:;\7\60\2\2;\22\3\2\2\2<=\7<\2\2=\24"+
		"\3\2\2\2>?\7\'\2\2?@\t\5\2\2@B\t\5\2\2A>\3\2\2\2BC\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2D\26\3\2\2\2EH\t\6\2\2FH\5\25\13\2GE\3\2\2\2GF\3\2\2\2HM\3\2"+
		"\2\2IL\t\7\2\2JL\5\25\13\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\30\3\2\2\2OM\3\2\2\2PR\t\b\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2S"+
		"T\3\2\2\2T\32\3\2\2\2UW\t\t\2\2VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\t\n\2"+
		"\2Y\34\3\2\2\2\13\2&\63CGKMSV";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}