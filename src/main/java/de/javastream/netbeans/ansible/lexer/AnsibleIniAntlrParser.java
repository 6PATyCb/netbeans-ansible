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
		WARS=1, SL_COMMENT=2, LSQUARE=3, RSQUARE=4, IDENT=5, EQUAL=6, SLASH=7, 
		DOT=8, COLON=9, HEX=10, STRING=11, WS=12, EOL=13;
	public static final String[] tokenNames = {
		"<INVALID>", "WARS", "SL_COMMENT", "'['", "']'", "IDENT", "'='", "'/'", 
		"'.'", "':'", "HEX", "STRING", "WS", "EOL"
	};
	public static final int
		RULE_ini = 0, RULE_sl_comment = 1, RULE_section = 2, RULE_sectionRow = 3, 
		RULE_varsSection = 4, RULE_groupSection = 5, RULE_sectionHeader = 6, RULE_sectionVarsHeader = 7, 
		RULE_sectionGroupHeader = 8, RULE_variable = 9, RULE_value = 10, RULE_expression = 11, 
		RULE_hostname = 12, RULE_path = 13;
	public static final String[] ruleNames = {
		"ini", "sl_comment", "section", "sectionRow", "varsSection", "groupSection", 
		"sectionHeader", "sectionVarsHeader", "sectionGroupHeader", "variable", 
		"value", "expression", "hostname", "path"
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
	public static class IniContext extends ParserRuleContext {
		public Sl_commentContext sl_comment(int i) {
			return getRuleContext(Sl_commentContext.class,i);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public GroupSectionContext groupSection(int i) {
			return getRuleContext(GroupSectionContext.class,i);
		}
		public List<GroupSectionContext> groupSection() {
			return getRuleContexts(GroupSectionContext.class);
		}
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public List<Sl_commentContext> sl_comment() {
			return getRuleContexts(Sl_commentContext.class);
		}
		public List<VarsSectionContext> varsSection() {
			return getRuleContexts(VarsSectionContext.class);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public VarsSectionContext varsSection(int i) {
			return getRuleContext(VarsSectionContext.class,i);
		}
		public IniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IniContext ini() throws RecognitionException {
		IniContext _localctx = new IniContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ini);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SL_COMMENT) | (1L << LSQUARE) | (1L << EOL))) != 0)) {
				{
				setState(33);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28); sl_comment();
					}
					break;

				case 2:
					{
					setState(29); section();
					}
					break;

				case 3:
					{
					setState(30); varsSection();
					}
					break;

				case 4:
					{
					setState(31); groupSection();
					}
					break;

				case 5:
					{
					setState(32); match(EOL);
					}
					break;
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 2, RULE_sl_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(SL_COMMENT);
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

	public static class SectionContext extends ParserRuleContext {
		public List<SectionRowContext> sectionRow() {
			return getRuleContexts(SectionRowContext.class);
		}
		public SectionRowContext sectionRow(int i) {
			return getRuleContext(SectionRowContext.class,i);
		}
		public SectionHeaderContext sectionHeader() {
			return getRuleContext(SectionHeaderContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40); sectionHeader();
			setState(42); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(41); sectionRow();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(44); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class SectionRowContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode WS() { return getToken(AnsibleIniAntlrParser.WS, 0); }
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SectionRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSectionRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSectionRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSectionRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionRowContext sectionRow() throws RecognitionException {
		SectionRowContext _localctx = new SectionRowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sectionRow);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			switch (_input.LA(1)) {
			case IDENT:
			case STRING:
				{
				{
				setState(46); hostname();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(47); match(WS);
						}
						}
						setState(50); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==WS );
					setState(52); expression();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EOL:
				{
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(58); match(EOL);
						}
						} 
					}
					setState(63);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66); match(EOL);
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

	public static class VarsSectionContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public SectionVarsHeaderContext sectionVarsHeader() {
			return getRuleContext(SectionVarsHeaderContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VarsSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterVarsSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitVarsSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitVarsSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsSectionContext varsSection() throws RecognitionException {
		VarsSectionContext _localctx = new VarsSectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varsSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); sectionVarsHeader();
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(71);
					switch (_input.LA(1)) {
					case IDENT:
						{
						setState(69); expression();
						}
						break;
					case EOL:
						{
						setState(70); match(EOL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
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

	public static class GroupSectionContext extends ParserRuleContext {
		public SectionGroupHeaderContext sectionGroupHeader() {
			return getRuleContext(SectionGroupHeaderContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public HostnameContext hostname(int i) {
			return getRuleContext(HostnameContext.class,i);
		}
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<HostnameContext> hostname() {
			return getRuleContexts(HostnameContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GroupSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterGroupSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitGroupSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitGroupSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupSectionContext groupSection() throws RecognitionException {
		GroupSectionContext _localctx = new GroupSectionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_groupSection);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76); sectionGroupHeader();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(85);
					switch (_input.LA(1)) {
					case IDENT:
					case STRING:
						{
						setState(77); hostname();
						setState(81);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(78); expression();
								}
								} 
							}
							setState(83);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
						}
						}
						break;
					case EOL:
						{
						setState(84); match(EOL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
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
		public TerminalNode WS(int i) {
			return getToken(AnsibleIniAntlrParser.WS, i);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode LSQUARE() { return getToken(AnsibleIniAntlrParser.LSQUARE, 0); }
		public List<TerminalNode> WS() { return getTokens(AnsibleIniAntlrParser.WS); }
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
		enterRule(_localctx, 12, RULE_sectionHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(LSQUARE);
			setState(91); match(IDENT);
			setState(92); match(RSQUARE);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(99); match(EOL);
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

	public static class SectionVarsHeaderContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(AnsibleIniAntlrParser.RSQUARE, 0); }
		public TerminalNode WS(int i) {
			return getToken(AnsibleIniAntlrParser.WS, i);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode LSQUARE() { return getToken(AnsibleIniAntlrParser.LSQUARE, 0); }
		public List<TerminalNode> WS() { return getTokens(AnsibleIniAntlrParser.WS); }
		public TerminalNode COLON() { return getToken(AnsibleIniAntlrParser.COLON, 0); }
		public TerminalNode WARS() { return getToken(AnsibleIniAntlrParser.WARS, 0); }
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public TerminalNode IDENT() { return getToken(AnsibleIniAntlrParser.IDENT, 0); }
		public SectionVarsHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionVarsHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSectionVarsHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSectionVarsHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSectionVarsHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionVarsHeaderContext sectionVarsHeader() throws RecognitionException {
		SectionVarsHeaderContext _localctx = new SectionVarsHeaderContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sectionVarsHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(LSQUARE);
			setState(102); match(IDENT);
			setState(103); match(COLON);
			setState(104); match(WARS);
			setState(105); match(RSQUARE);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(112); match(EOL);
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

	public static class SectionGroupHeaderContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(AnsibleIniAntlrParser.RSQUARE, 0); }
		public TerminalNode WS(int i) {
			return getToken(AnsibleIniAntlrParser.WS, i);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode LSQUARE() { return getToken(AnsibleIniAntlrParser.LSQUARE, 0); }
		public List<TerminalNode> WS() { return getTokens(AnsibleIniAntlrParser.WS); }
		public TerminalNode COLON() { return getToken(AnsibleIniAntlrParser.COLON, 0); }
		public TerminalNode IDENT(int i) {
			return getToken(AnsibleIniAntlrParser.IDENT, i);
		}
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(AnsibleIniAntlrParser.IDENT); }
		public SectionGroupHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionGroupHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterSectionGroupHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitSectionGroupHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitSectionGroupHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionGroupHeaderContext sectionGroupHeader() throws RecognitionException {
		SectionGroupHeaderContext _localctx = new SectionGroupHeaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sectionGroupHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(LSQUARE);
			setState(115); match(IDENT);
			setState(116); match(COLON);
			setState(117); match(IDENT);
			setState(118); match(RSQUARE);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					_la = _input.LA(1);
					if ( !(_la==WS || _la==EOL) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(125); match(EOL);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AnsibleIniAntlrParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(IDENT);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AnsibleIniAntlrParser.STRING, 0); }
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AnsibleIniAntlrParser.IDENT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				{
				setState(130); hostname();
				}
				break;

			case 3:
				{
				setState(131); path();
				}
				break;
			}
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AnsibleIniAntlrParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); variable();
			setState(135); match(EQUAL);
			setState(136); value();
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

	public static class HostnameContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(AnsibleIniAntlrParser.DOT); }
		public TerminalNode STRING(int i) {
			return getToken(AnsibleIniAntlrParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AnsibleIniAntlrParser.STRING); }
		public TerminalNode IDENT() { return getToken(AnsibleIniAntlrParser.IDENT, 0); }
		public TerminalNode DOT(int i) {
			return getToken(AnsibleIniAntlrParser.DOT, i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitHostname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(139); match(DOT);
				setState(140); match(STRING);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(AnsibleIniAntlrParser.DOT); }
		public TerminalNode STRING(int i) {
			return getToken(AnsibleIniAntlrParser.STRING, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(AnsibleIniAntlrParser.SLASH); }
		public TerminalNode IDENT(int i) {
			return getToken(AnsibleIniAntlrParser.IDENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AnsibleIniAntlrParser.STRING); }
		public TerminalNode SLASH(int i) {
			return getToken(AnsibleIniAntlrParser.SLASH, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(AnsibleIniAntlrParser.IDENT); }
		public TerminalNode DOT(int i) {
			return getToken(AnsibleIniAntlrParser.DOT, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnsibleIniAntlrListener ) ((AnsibleIniAntlrListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnsibleIniAntlrVisitor ) return ((AnsibleIniAntlrVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(146); match(SLASH);
				}
			}

			setState(150);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(149); match(DOT);
				}
			}

			setState(152);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SLASH) {
				{
				{
				setState(153); match(SLASH);
				setState(155);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(154); match(DOT);
					}
				}

				setState(157);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\17\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\3\3\3\3\4\3\4\6\4-\n\4\r\4\16\4.\3\5\3\5\6\5\63\n\5"+
		"\r\5\16\5\64\3\5\7\58\n\5\f\5\16\5;\13\5\3\5\7\5>\n\5\f\5\16\5A\13\5\5"+
		"\5C\n\5\3\5\3\5\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\7\3\7\3\7\7\7R\n"+
		"\7\f\7\16\7U\13\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\b\3\b\3\b\3\b\7\ba\n\b"+
		"\f\b\16\bd\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0090"+
		"\n\16\f\16\16\16\u0093\13\16\3\17\5\17\u0096\n\17\3\17\5\17\u0099\n\17"+
		"\3\17\3\17\3\17\5\17\u009e\n\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4"+
		"\13\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\16\17\4\2"+
		"\7\7\r\r\u00b0\2%\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2"+
		"\fN\3\2\2\2\16\\\3\2\2\2\20g\3\2\2\2\22t\3\2\2\2\24\u0081\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u008c\3\2\2\2\34\u0095\3\2\2\2\36$\5\4\3"+
		"\2\37$\5\6\4\2 $\5\n\6\2!$\5\f\7\2\"$\7\17\2\2#\36\3\2\2\2#\37\3\2\2\2"+
		"# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2"+
		"\2\2\'%\3\2\2\2()\7\4\2\2)\5\3\2\2\2*,\5\16\b\2+-\5\b\5\2,+\3\2\2\2-."+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\609\5\32\16\2\61\63\7\16\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66"+
		"8\5\30\r\2\67\62\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:C\3\2\2\2;9\3"+
		"\2\2\2<>\7\17\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@C\3\2\2\2A?"+
		"\3\2\2\2B\60\3\2\2\2B?\3\2\2\2CD\3\2\2\2DE\7\17\2\2E\t\3\2\2\2FK\5\20"+
		"\t\2GJ\5\30\r\2HJ\7\17\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\13\3\2\2\2MK\3\2\2\2NY\5\22\n\2OS\5\32\16\2PR\5\30\r\2QP\3\2\2"+
		"\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2US\3\2\2\2VX\7\17\2\2WO\3\2"+
		"\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[Y\3\2\2\2\\]\7"+
		"\5\2\2]^\7\7\2\2^b\7\6\2\2_a\t\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3"+
		"\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\17\2\2f\17\3\2\2\2gh\7\5\2\2hi\7\7\2\2"+
		"ij\7\13\2\2jk\7\3\2\2ko\7\6\2\2ln\t\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\17\2\2s\21\3\2\2\2tu\7\5\2\2uv\7"+
		"\7\2\2vw\7\13\2\2wx\7\7\2\2x|\7\6\2\2y{\t\2\2\2zy\3\2\2\2{~\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\17\2\2\u0080\23"+
		"\3\2\2\2\u0081\u0082\7\7\2\2\u0082\25\3\2\2\2\u0083\u0087\t\3\2\2\u0084"+
		"\u0087\5\32\16\2\u0085\u0087\5\34\17\2\u0086\u0083\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u008a\7\b\2\2\u008a\u008b\5\26\f\2\u008b\31\3\2\2\2\u008c\u0091\t\3\2"+
		"\2\u008d\u008e\7\n\2\2\u008e\u0090\7\r\2\2\u008f\u008d\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0096\7\t\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\n\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a2\t\3\2\2\u009b\u009d\7\t"+
		"\2\2\u009c\u009e\7\n\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\t\3\2\2\u00a0\u009b\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\27#%.\649?BIKSWYbo|\u0086\u0091\u0095\u0098\u009d\u00a2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}