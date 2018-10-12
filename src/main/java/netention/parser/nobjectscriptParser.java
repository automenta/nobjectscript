// Generated from /home/me/nscript/src/main/resources/nobjectscript.g4 by ANTLR 4.7
package netention.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nobjectscriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, LETTER_DIGIT=40, DECIMAL=41, BINARY=42, OCTAL=43, HEX=44, CHARACTER_CODE_CONSTANT=45, 
		FLOAT=46, GRAPHIC_TOKEN=47, QUOTED=48, WC=49, WS=50, COMMENT=51, MULTILINE_COMMENT=52;
	public static final int
		RULE_nobject = 0, RULE_anonynobject = 1, RULE_metastatement = 2, RULE_statement = 3, 
		RULE_subject = 4, RULE_predicate = 5, RULE_punc = 6, RULE_term_only = 7, 
		RULE_term = 8, RULE_operator = 9, RULE_atom = 10, RULE_neg_integer = 11, 
		RULE_integer = 12;
	public static final String[] ruleNames = {
		"nobject", "anonynobject", "metastatement", "statement", "subject", "predicate", 
		"punc", "term_only", "term", "operator", "atom", "neg_integer", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':'", "'.'", "'!'", "'('", "')'", "'-'", "','", "'\\+'", 
		"'='", "'\\='", "'=='", "'\\=='", "'@<'", "'@=<'", "'@>'", "'@>='", "'=..'", 
		"'is'", "'=:='", "'=\\='", "'<'", "'<='", "'>'", "'>='", "'+'", "'/\\'", 
		"'\\/'", "'*'", "'/'", "'//'", "'rem'", "'mod'", "'<<'", "'>>'", "'**'", 
		"'^'", "'\\'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LETTER_DIGIT", "DECIMAL", "BINARY", "OCTAL", 
		"HEX", "CHARACTER_CODE_CONSTANT", "FLOAT", "GRAPHIC_TOKEN", "QUOTED", 
		"WC", "WS", "COMMENT", "MULTILINE_COMMENT"
	};
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

	@Override
	public String getGrammarFileName() { return "nobjectscript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public nobjectscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NobjectContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(nobjectscriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MetastatementContext> metastatement() {
			return getRuleContexts(MetastatementContext.class);
		}
		public MetastatementContext metastatement(int i) {
			return getRuleContext(MetastatementContext.class,i);
		}
		public NobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterNobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitNobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitNobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NobjectContext nobject() throws RecognitionException {
		NobjectContext _localctx = new NobjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << LETTER_DIGIT) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT) | (1L << FLOAT) | (1L << QUOTED))) != 0)) {
				{
				setState(28);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					statement();
					}
					break;
				case 2:
					{
					setState(27);
					metastatement();
					}
					break;
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(EOF);
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

	public static class AnonynobjectContext extends ParserRuleContext {
		public List<TerminalNode> WC() { return getTokens(nobjectscriptParser.WC); }
		public TerminalNode WC(int i) {
			return getToken(nobjectscriptParser.WC, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<MetastatementContext> metastatement() {
			return getRuleContexts(MetastatementContext.class);
		}
		public MetastatementContext metastatement(int i) {
			return getRuleContext(MetastatementContext.class,i);
		}
		public AnonynobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonynobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterAnonynobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitAnonynobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitAnonynobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonynobjectContext anonynobject() throws RecognitionException {
		AnonynobjectContext _localctx = new AnonynobjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anonynobject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(36);
				match(WC);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(42);
					statement();
					}
					break;
				case 2:
					{
					setState(43);
					metastatement();
					}
					break;
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << LETTER_DIGIT) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT) | (1L << FLOAT) | (1L << QUOTED))) != 0) );
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(48);
				match(WC);
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			match(T__1);
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

	public static class MetastatementContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public List<TerminalNode> WC() { return getTokens(nobjectscriptParser.WC); }
		public TerminalNode WC(int i) {
			return getToken(nobjectscriptParser.WC, i);
		}
		public MetastatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metastatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterMetastatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitMetastatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitMetastatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetastatementContext metastatement() throws RecognitionException {
		MetastatementContext _localctx = new MetastatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metastatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			predicate();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(57);
				match(WC);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			punc();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(WC);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PuncContext punc() {
			return getRuleContext(PuncContext.class,0);
		}
		public List<TerminalNode> WC() { return getTokens(nobjectscriptParser.WC); }
		public TerminalNode WC(int i) {
			return getToken(nobjectscriptParser.WC, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			subject();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(71);
				match(WC);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__2);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(78);
				match(WC);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			predicate();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(85);
				match(WC);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			punc();
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(WC);
					}
					} 
				}
				setState(97);
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

	public static class SubjectContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			term(0);
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

	public static class PredicateContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AnonynobjectContext anonynobject() {
			return getRuleContext(AnonynobjectContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case LETTER_DIGIT:
			case DECIMAL:
			case BINARY:
			case OCTAL:
			case HEX:
			case CHARACTER_CODE_CONSTANT:
			case FLOAT:
			case QUOTED:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				term(0);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				anonynobject();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PuncContext extends ParserRuleContext {
		public PuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_punc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterPunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitPunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitPunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PuncContext punc() throws RecognitionException {
		PuncContext _localctx = new PuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_punc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Term_onlyContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(nobjectscriptParser.EOF, 0); }
		public Term_onlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterTerm_only(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitTerm_only(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitTerm_only(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_onlyContext term_only() throws RecognitionException {
		Term_onlyContext _localctx = new Term_onlyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term_only);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			term(0);
			setState(107);
			match(EOF);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Neg_floatContext extends TermContext {
		public TerminalNode FLOAT() { return getToken(nobjectscriptParser.FLOAT, 0); }
		public Neg_floatContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterNeg_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitNeg_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitNeg_float(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atom_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterAtom_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitAtom_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitAtom_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Binary_operatorContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public List<TerminalNode> WC() { return getTokens(nobjectscriptParser.WC); }
		public TerminalNode WC(int i) {
			return getToken(nobjectscriptParser.WC, i);
		}
		public Binary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_operatorContext extends TermContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<TerminalNode> WC() { return getTokens(nobjectscriptParser.WC); }
		public TerminalNode WC(int i) {
			return getToken(nobjectscriptParser.WC, i);
		}
		public Unary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Braced_termContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Braced_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterBraced_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitBraced_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitBraced_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Neg_integer_termContext extends TermContext {
		public Neg_integerContext neg_integer() {
			return getRuleContext(Neg_integerContext.class,0);
		}
		public Neg_integer_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterNeg_integer_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitNeg_integer_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitNeg_integer_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends TermContext {
		public TerminalNode FLOAT() { return getToken(nobjectscriptParser.FLOAT, 0); }
		public FloatContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Integer_termContext extends TermContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Integer_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterInteger_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitInteger_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitInteger_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new Braced_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(110);
				match(T__5);
				setState(111);
				term(0);
				setState(112);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new Neg_integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				neg_integer();
				}
				break;
			case 3:
				{
				_localctx = new Neg_floatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(T__7);
				setState(116);
				match(FLOAT);
				}
				break;
			case 4:
				{
				_localctx = new Integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				integer();
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new Unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				operator();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WC) {
					{
					{
					setState(120);
					match(WC);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				term(2);
				}
				break;
			case 7:
				{
				_localctx = new Atom_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_operatorContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(131);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WC) {
						{
						{
						setState(132);
						match(WC);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(138);
					operator();
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WC) {
						{
						{
						setState(139);
						match(WC);
						}
						}
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(145);
					term(3);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameContext extends AtomContext {
		public TerminalNode LETTER_DIGIT() { return getToken(nobjectscriptParser.LETTER_DIGIT, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Quoted_stringContext extends AtomContext {
		public TerminalNode QUOTED() { return getToken(nobjectscriptParser.QUOTED, 0); }
		public Quoted_stringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitQuoted_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitQuoted_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atom);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_DIGIT:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(LETTER_DIGIT);
				}
				break;
			case QUOTED:
				_localctx = new Quoted_stringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(QUOTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Neg_integerContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Neg_integerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neg_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterNeg_integer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitNeg_integer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitNeg_integer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Neg_integerContext neg_integer() throws RecognitionException {
		Neg_integerContext _localctx = new Neg_integerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_neg_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__7);
			setState(159);
			integer();
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(nobjectscriptParser.DECIMAL, 0); }
		public TerminalNode CHARACTER_CODE_CONSTANT() { return getToken(nobjectscriptParser.CHARACTER_CODE_CONSTANT, 0); }
		public TerminalNode BINARY() { return getToken(nobjectscriptParser.BINARY, 0); }
		public TerminalNode OCTAL() { return getToken(nobjectscriptParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(nobjectscriptParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5"+
		"\7\5R\n\5\f\5\16\5U\13\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\7\5"+
		"`\n\5\f\5\16\5c\13\5\3\6\3\6\3\7\3\7\5\7i\n\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13"+
		"\n\3\n\3\n\3\n\5\n\u0084\n\n\3\n\3\n\7\n\u0088\n\n\f\n\16\n\u008b\13\n"+
		"\3\n\3\n\7\n\u008f\n\n\f\n\16\n\u0092\13\n\3\n\3\n\7\n\u0096\n\n\f\n\16"+
		"\n\u0099\13\n\3\13\3\13\3\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\2\3\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\6\7\4\2\5\5\13"+
		")\3\2+/\2\u00b0\2 \3\2\2\2\4%\3\2\2\2\6:\3\2\2\2\bH\3\2\2\2\nd\3\2\2\2"+
		"\fh\3\2\2\2\16j\3\2\2\2\20l\3\2\2\2\22\u0083\3\2\2\2\24\u009a\3\2\2\2"+
		"\26\u009e\3\2\2\2\30\u00a0\3\2\2\2\32\u00a3\3\2\2\2\34\37\5\b\5\2\35\37"+
		"\5\6\4\2\36\34\3\2\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2"+
		"\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%)\7\3\2\2&(\7\63\2\2\'&\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*.\3\2\2\2+)\3\2\2\2,/\5\b\5\2-/"+
		"\5\6\4\2.,\3\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\65\3\2\2\2\62\64\7\63\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\4\2\29\5\3\2\2\2:>\5\f\7\2;"+
		"=\7\63\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2"+
		"AE\5\16\b\2BD\7\63\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\7\3\2"+
		"\2\2GE\3\2\2\2HL\5\n\6\2IK\7\63\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3"+
		"\2\2\2MO\3\2\2\2NL\3\2\2\2OS\7\5\2\2PR\7\63\2\2QP\3\2\2\2RU\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VZ\5\f\7\2WY\7\63\2\2XW\3\2\2\2"+
		"Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]a\5\16\b\2^`\7\63"+
		"\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\5"+
		"\22\n\2e\13\3\2\2\2fi\5\22\n\2gi\5\4\3\2hf\3\2\2\2hg\3\2\2\2i\r\3\2\2"+
		"\2jk\t\2\2\2k\17\3\2\2\2lm\5\22\n\2mn\7\2\2\3n\21\3\2\2\2op\b\n\1\2pq"+
		"\7\b\2\2qr\5\22\n\2rs\7\t\2\2s\u0084\3\2\2\2t\u0084\5\30\r\2uv\7\n\2\2"+
		"v\u0084\7\60\2\2w\u0084\5\32\16\2x\u0084\7\60\2\2y}\5\24\13\2z|\7\63\2"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\5\22\n\4\u0081\u0084\3\2\2\2\u0082\u0084\5\26\f\2\u0083"+
		"o\3\2\2\2\u0083t\3\2\2\2\u0083u\3\2\2\2\u0083w\3\2\2\2\u0083x\3\2\2\2"+
		"\u0083y\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0097\3\2\2\2\u0085\u0089\f"+
		"\5\2\2\u0086\u0088\7\63\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u0090\5\24\13\2\u008d\u008f\7\63\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5\22\n\5\u0094\u0096\3\2\2\2\u0095"+
		"\u0085\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\t\3\2\2\u009b\25"+
		"\3\2\2\2\u009c\u009f\7*\2\2\u009d\u009f\7\62\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\5\32\16"+
		"\2\u00a2\31\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4\33\3\2\2\2\25\36 ).\60\65"+
		">ELSZah}\u0083\u0089\u0090\u0097\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}