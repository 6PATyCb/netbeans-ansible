// Generated from C:\Users\6PATyCb\Documents\NetBeansProjects\github\netbeans-ansible\src\main\java\de\javastream\netbeans\ansible\lexer\AnsibleIniAntlr.g4 by ANTLR 4.1
package de.javastream.netbeans.ansible.lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AnsibleIniAntlrParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HOST_AND_PORT=1, GROUP=2, RANGE_HOST_NAME=3, NAME=4, NUMBER=5, HOST_NAME=6, 
		IPV4=7, STRING=8, EOL=9, WS=10, SL_COMMENT=11, OPERATOR=12, LSQUARE=13, 
		RSQUARE=14, IDENT=15, CHARS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "HOST_AND_PORT", "GROUP", "RANGE_HOST_NAME", "NAME", "NUMBER", 
		"HOST_NAME", "IPV4", "STRING", "EOL", "WS", "SL_COMMENT", "OPERATOR", 
		"'['", "']'", "IDENT", "CHARS"
	};
	public static final int
		RULE_sl_comment = 0, RULE_sectionHeader = 1, RULE_string = 2;
	public static final String[] ruleNames = {
		"sl_comment", "sectionHeader", "string"
	};

	@Override
	public String getGrammarFileName() { return "AnsibleIniAntlr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AnsibleIniAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Sl_commentContext extends ParserRuleContext {
		public TerminalNode SL_COMMENT() { return getToken(AnsibleIniAntlrParser.SL_COMMENT, 0); }
		public Sl_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sl_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSl_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSl_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSl_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sl_commentContext sl_comment() throws RecognitionException {
		Sl_commentContext _localctx = new Sl_commentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sl_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(SL_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionHeaderContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(AnsibleIniAntlrParser.RSQUARE, 0); }
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode LSQUARE() { return getToken(AnsibleIniAntlrParser.LSQUARE, 0); }
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public TerminalNode IDENT() { return getToken(AnsibleIniAntlrParser.IDENT, 0); }
		public SectionHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSectionHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSectionHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSectionHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionHeaderContext sectionHeader() throws RecognitionException {
		SectionHeaderContext _localctx = new SectionHeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sectionHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(LSQUARE);
			setState(9); match(IDENT);
			setState(10); match(RSQUARE);
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11); match(EOL);
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(AnsibleIniAntlrParser.CHARS, 0); }
		public TerminalNode STRING() { return getToken(AnsibleIniAntlrParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==CHARS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\22\25\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\3\6\3\17\n\3\r\3\16\3\20\3\4\3\4\3"+
		"\4\2\5\2\4\6\2\3\4\2\n\n\22\22\22\2\b\3\2\2\2\4\n\3\2\2\2\6\22\3\2\2\2"+
		"\b\t\7\r\2\2\t\3\3\2\2\2\n\13\7\17\2\2\13\f\7\21\2\2\f\16\7\20\2\2\r\17"+
		"\7\13\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\5"+
		"\3\2\2\2\22\23\t\2\2\2\23\7\3\2\2\2\3\20";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}