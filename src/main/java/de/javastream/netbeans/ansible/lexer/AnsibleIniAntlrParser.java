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
		SECTION_VARS_HEADER=1, SECTION_GROUP_HEADER=2, SECTION_HEADER=3, WARS=4, 
		SL_COMMENT=5, LSQUARE=6, RSQUARE=7, IDENT=8, EQUAL=9, SLASH=10, DOT=11, 
		MINUS=12, COLON=13, HEX=14, STRING=15, FOLDER_NAME=16, FILE_NAME=17, PATH=18, 
		WS=19, EOL=20;
	public static final String[] tokenNames = {
		"<INVALID>", "SECTION_VARS_HEADER", "SECTION_GROUP_HEADER", "SECTION_HEADER", 
		"WARS", "SL_COMMENT", "'['", "']'", "IDENT", "'='", "'/'", "'.'", "'-'", 
		"':'", "HEX", "STRING", "FOLDER_NAME", "FILE_NAME", "PATH", "WS", "EOL"
	};
	public static final int
		RULE_ini = 0, RULE_sl_comment = 1, RULE_section = 2, RULE_sectionRow = 3, 
		RULE_varsSection = 4, RULE_groupSection = 5, RULE_sectionHeader = 6, RULE_sectionVarsHeader = 7, 
		RULE_sectionGroupHeader = 8, RULE_expression = 9, RULE_variable = 10, 
		RULE_value = 11, RULE_path = 12, RULE_hostname = 13;
	public static final String[] ruleNames = {
		"ini", "sl_comment", "section", "sectionRow", "varsSection", "groupSection", 
		"sectionHeader", "sectionVarsHeader", "sectionGroupHeader", "expression", 
		"variable", "value", "path", "hostname"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECTION_VARS_HEADER) | (1L << SECTION_GROUP_HEADER) | (1L << SECTION_HEADER) | (1L << SL_COMMENT) | (1L << EOL))) != 0)) {
				{
				setState(33);
				switch (_input.LA(1)) {
				case SL_COMMENT:
					{
					setState(28); sl_comment();
					}
					break;
				case SECTION_HEADER:
					{
					setState(29); section();
					}
					break;
				case SECTION_VARS_HEADER:
					{
					setState(30); varsSection();
					}
					break;
				case SECTION_GROUP_HEADER:
					{
					setState(31); groupSection();
					}
					break;
				case EOL:
					{
					setState(32); match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		public Sl_commentContext sl_comment(int i) {
			return getRuleContext(Sl_commentContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(AnsibleIniAntlrParser.EOL); }
		public TerminalNode WS() { return getToken(AnsibleIniAntlrParser.WS, 0); }
		public TerminalNode EOL(int i) {
			return getToken(AnsibleIniAntlrParser.EOL, i);
		}
		public List<Sl_commentContext> sl_comment() {
			return getRuleContexts(Sl_commentContext.class);
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
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				{
				setState(47);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(46); hostname();
					}
					break;
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENT || _la==WS) {
					{
					{
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WS) {
						{
						{
						setState(49); match(WS);
						}
						}
						setState(54);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(55); expression();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;

			case 2:
				{
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(61); match(EOL);
						}
						} 
					}
					setState(66);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				break;

			case 3:
				{
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SL_COMMENT) {
					{
					{
					setState(67); sl_comment();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(75); match(EOL);
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
			setState(77); sectionVarsHeader();
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(80);
					switch (_input.LA(1)) {
					case IDENT:
						{
						setState(78); expression();
						}
						break;
					case EOL:
						{
						setState(79); match(EOL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(85); sectionGroupHeader();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(94);
					switch (_input.LA(1)) {
					case IDENT:
					case STRING:
						{
						setState(86); hostname();
						setState(90);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						while ( _alt!=2 && _alt!=-1 ) {
							if ( _alt==1 ) {
								{
								{
								setState(87); expression();
								}
								} 
							}
							setState(92);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						}
						}
						break;
					case EOL:
						{
						setState(93); match(EOL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode SECTION_HEADER() { return getToken(AnsibleIniAntlrParser.SECTION_HEADER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(SECTION_HEADER);
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
		public TerminalNode SECTION_VARS_HEADER() { return getToken(AnsibleIniAntlrParser.SECTION_VARS_HEADER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(SECTION_VARS_HEADER);
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
		public TerminalNode SECTION_GROUP_HEADER() { return getToken(AnsibleIniAntlrParser.SECTION_GROUP_HEADER, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(SECTION_GROUP_HEADER);
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
		public TerminalNode WS(int i) {
			return getToken(AnsibleIniAntlrParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(AnsibleIniAntlrParser.WS); }
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
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); variable();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(106); match(WS);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); match(EQUAL);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(113); match(WS);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); value();
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
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(IDENT);
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
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(123); path();
				}
				break;

			case 2:
				{
				setState(124); hostname();
				}
				break;

			case 3:
				{
				setState(125);
				_la = _input.LA(1);
				if ( !(_la==IDENT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class PathContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(AnsibleIniAntlrParser.PATH, 0); }
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
		enterRule(_localctx, 24, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(PATH);
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
		enterRule(_localctx, 26, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(131); match(DOT);
				setState(132); match(STRING);
				}
				}
				setState(137);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\26\u008d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\3\3\3\3\4\3\4\6\4-\n\4\r\4\16\4.\3\5\5\5\62\n\5\3\5"+
		"\7\5\65\n\5\f\5\16\58\13\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\7\5G\n\5\f\5\16\5J\13\5\5\5L\n\5\3\5\3\5\3\6\3\6\3\6"+
		"\7\6S\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\7\7a"+
		"\n\7\f\7\16\7d\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13n\n\13\f\13"+
		"\16\13q\13\13\3\13\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\5\r\u0081\n\r\3\16\3\16\3\17\3\17\3\17\7\17\u0088\n\17\f"+
		"\17\16\17\u008b\13\17\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\3\4\2\n\n\21\21\u0095\2%\3\2\2\2\4(\3\2\2\2\6*\3\2\2\2\bK\3\2\2\2\nO"+
		"\3\2\2\2\fW\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26"+
		"{\3\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2\2\34\u0084\3\2\2\2\36$\5\4\3"+
		"\2\37$\5\6\4\2 $\5\n\6\2!$\5\f\7\2\"$\7\26\2\2#\36\3\2\2\2#\37\3\2\2\2"+
		"# \3\2\2\2#!\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2"+
		"\2\2\'%\3\2\2\2()\7\7\2\2)\5\3\2\2\2*,\5\16\b\2+-\5\b\5\2,+\3\2\2\2-."+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60\62\5\34\17\2\61\60\3\2\2\2"+
		"\61\62\3\2\2\2\62<\3\2\2\2\63\65\7\25\2\2\64\63\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29;\5\24\13\2:\66\3\2"+
		"\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=L\3\2\2\2><\3\2\2\2?A\7\26\2\2@?\3"+
		"\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CL\3\2\2\2DB\3\2\2\2EG\5\4\3\2FE\3"+
		"\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2K\61\3\2\2\2K"+
		"B\3\2\2\2KH\3\2\2\2LM\3\2\2\2MN\7\26\2\2N\t\3\2\2\2OT\5\20\t\2PS\5\24"+
		"\13\2QS\7\26\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\13"+
		"\3\2\2\2VT\3\2\2\2Wb\5\22\n\2X\\\5\34\17\2Y[\5\24\13\2ZY\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a\7\26\2\2`X\3\2\2\2`"+
		"_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2db\3\2\2\2ef\7\5\2\2"+
		"f\17\3\2\2\2gh\7\3\2\2h\21\3\2\2\2ij\7\4\2\2j\23\3\2\2\2ko\5\26\f\2ln"+
		"\7\25\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rv\7\13\2\2su\7\25\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2"+
		"\2xv\3\2\2\2yz\5\30\r\2z\25\3\2\2\2{|\7\n\2\2|\27\3\2\2\2}\u0081\5\32"+
		"\16\2~\u0081\5\34\17\2\177\u0081\t\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\177\3\2\2\2\u0081\31\3\2\2\2\u0082\u0083\7\24\2\2\u0083\33\3\2"+
		"\2\2\u0084\u0089\t\2\2\2\u0085\u0086\7\r\2\2\u0086\u0088\7\21\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\35\3\2\2\2\u008b\u0089\3\2\2\2\24#%.\61\66<BHKRT\\`bov\u0080"+
		"\u0089";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}