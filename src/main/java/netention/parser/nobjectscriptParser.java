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
		T__38=39, T__39=40, LETTER_DIGIT=41, DECIMAL=42, BINARY=43, OCTAL=44, 
		HEX=45, CHARACTER_CODE_CONSTANT=46, FLOAT=47, GRAPHIC_TOKEN=48, QUOTED=49, 
		WC=50, WS=51, COMMENT=52, MULTILINE_COMMENT=53;
	public static final int
		RULE_nobject = 0, RULE_anonynobject = 1, RULE_metastatement = 2, RULE_statement = 3, 
		RULE_subject = 4, RULE_predicate = 5, RULE_punc = 6, RULE_term = 7, RULE_operator = 8, 
		RULE_atom = 9, RULE_integer = 10;
	public static final String[] ruleNames = {
		"nobject", "anonynobject", "metastatement", "statement", "subject", "predicate", 
		"punc", "term", "operator", "atom", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "':'", "'.'", "'!'", "'('", "')'", "'-'", "','", "'\\+'", 
		"'='", "'\\='", "'=='", "'\\=='", "'@<'", "'@=<'", "'@>'", "'@>='", "'=..'", 
		"'is'", "'=:='", "'=\\='", "'<'", "'=<'", "'>'", "'>='", "'+'", "'/\\'", 
		"'\\/'", "'*'", "'/'", "'//'", "'rem'", "'mod'", "'<<'", "'>>'", "'**'", 
		"'^'", "'\\'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "LETTER_DIGIT", "DECIMAL", "BINARY", "OCTAL", 
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << LETTER_DIGIT) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT) | (1L << FLOAT) | (1L << GRAPHIC_TOKEN) | (1L << QUOTED))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					statement();
					}
					break;
				case 2:
					{
					setState(23);
					metastatement();
					}
					break;
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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
			setState(31);
			match(T__0);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(32);
				match(WC);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(38);
					statement();
					}
					break;
				case 2:
					{
					setState(39);
					metastatement();
					}
					break;
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << LETTER_DIGIT) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT) | (1L << FLOAT) | (1L << GRAPHIC_TOKEN) | (1L << QUOTED))) != 0) );
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(44);
				match(WC);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
			setState(52);
			predicate();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(53);
				match(WC);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			punc();
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(WC);
					}
					} 
				}
				setState(65);
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
			setState(66);
			subject();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(67);
				match(WC);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__2);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(74);
				match(WC);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			predicate();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WC) {
				{
				{
				setState(81);
				match(WC);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			punc();
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(WC);
					}
					} 
				}
				setState(93);
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
			setState(94);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				term(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				anonynobject();
				}
				break;
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
			setState(100);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new Braced_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(T__5);
				setState(104);
				term(0);
				setState(105);
				match(T__6);
				}
				break;
			case 2:
				{
				_localctx = new Integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(107);
					match(T__7);
					}
				}

				setState(110);
				integer();
				}
				break;
			case 3:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(111);
					match(T__7);
					}
				}

				setState(114);
				match(FLOAT);
				}
				break;
			case 4:
				{
				_localctx = new Unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				operator();
				setState(116);
				term(2);
				}
				break;
			case 5:
				{
				_localctx = new Atom_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_operatorContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(121);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(122);
					operator();
					setState(123);
					term(3);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
	public static class Empty_bracesContext extends AtomContext {
		public Empty_bracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterEmpty_braces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitEmpty_braces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitEmpty_braces(this);
			else return visitor.visitChildren(this);
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
	public static class GraphicContext extends AtomContext {
		public TerminalNode GRAPHIC_TOKEN() { return getToken(nobjectscriptParser.GRAPHIC_TOKEN, 0); }
		public GraphicContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterGraphic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitGraphic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitGraphic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemicolonContext extends AtomContext {
		public SemicolonContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof nobjectscriptListener ) ((nobjectscriptListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof nobjectscriptVisitor ) return ((nobjectscriptVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Empty_bracesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__0);
				setState(133);
				match(T__1);
				}
				break;
			case LETTER_DIGIT:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LETTER_DIGIT);
				}
				break;
			case GRAPHIC_TOKEN:
				_localctx = new GraphicContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(GRAPHIC_TOKEN);
				}
				break;
			case QUOTED:
				_localctx = new Quoted_stringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(QUOTED);
				}
				break;
			case T__39:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(T__39);
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
		enterRule(_localctx, 20, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\3\3\3\6\3+\n\3\r\3\16\3,\3\3\7\3\60\n\3\f\3\16"+
		"\3\63\13\3\3\3\3\3\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\7\4@\n\4\f"+
		"\4\16\4C\13\4\3\5\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\7\5N\n\5\f\5\16"+
		"\5Q\13\5\3\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13"+
		"\5\3\6\3\6\3\7\3\7\5\7e\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3"+
		"\t\3\t\5\ts\n\t\3\t\3\t\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\7\t\u0080"+
		"\n\t\f\t\16\t\u0083\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d"+
		"\n\13\3\f\3\f\3\f\2\3\20\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\2\6\7\4\2"+
		"\5\5\n)\3\2,\60\2\u009d\2\34\3\2\2\2\4!\3\2\2\2\6\66\3\2\2\2\bD\3\2\2"+
		"\2\n`\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20y\3\2\2\2\22\u0084\3\2\2\2\24\u008c"+
		"\3\2\2\2\26\u008e\3\2\2\2\30\33\5\b\5\2\31\33\5\6\4\2\32\30\3\2\2\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36"+
		"\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!%\7\3\2\2\"$\7\64\2\2#\"\3\2\2\2$\'"+
		"\3\2\2\2%#\3\2\2\2%&\3\2\2\2&*\3\2\2\2\'%\3\2\2\2(+\5\b\5\2)+\5\6\4\2"+
		"*(\3\2\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2.\60\7\64"+
		"\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63"+
		"\61\3\2\2\2\64\65\7\4\2\2\65\5\3\2\2\2\66:\5\f\7\2\679\7\64\2\28\67\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=A\5\16\b\2>@"+
		"\7\64\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\7\3\2\2\2CA\3\2\2\2"+
		"DH\5\n\6\2EG\7\64\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2"+
		"\2JH\3\2\2\2KO\7\5\2\2LN\7\64\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2PR\3\2\2\2QO\3\2\2\2RV\5\f\7\2SU\7\64\2\2TS\3\2\2\2UX\3\2\2\2VT\3"+
		"\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2Y]\5\16\b\2Z\\\7\64\2\2[Z\3\2\2\2"+
		"\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_]\3\2\2\2`a\5\20\t\2a\13\3"+
		"\2\2\2be\5\20\t\2ce\5\4\3\2db\3\2\2\2dc\3\2\2\2e\r\3\2\2\2fg\t\2\2\2g"+
		"\17\3\2\2\2hi\b\t\1\2ij\7\b\2\2jk\5\20\t\2kl\7\t\2\2lz\3\2\2\2mo\7\n\2"+
		"\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pz\5\26\f\2qs\7\n\2\2rq\3\2\2\2rs\3\2"+
		"\2\2st\3\2\2\2tz\7\61\2\2uv\5\22\n\2vw\5\20\t\4wz\3\2\2\2xz\5\24\13\2"+
		"yh\3\2\2\2yn\3\2\2\2yr\3\2\2\2yu\3\2\2\2yx\3\2\2\2z\u0081\3\2\2\2{|\f"+
		"\5\2\2|}\5\22\n\2}~\5\20\t\5~\u0080\3\2\2\2\177{\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\t\3\2\2\u0085\23\3\2\2\2\u0086\u0087\7\3\2\2\u0087"+
		"\u008d\7\4\2\2\u0088\u008d\7+\2\2\u0089\u008d\7\62\2\2\u008a\u008d\7\63"+
		"\2\2\u008b\u008d\7*\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\25\3\2\2"+
		"\2\u008e\u008f\t\4\2\2\u008f\27\3\2\2\2\24\32\34%*,\61:AHOV]dnry\u0081"+
		"\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}