// Generated from /home/me/nscript/src/main/resources/nobjectscript.g4 by ANTLR 4.7
package netention.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class nobjectscriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "LETTER_DIGIT", 
		"DECIMAL", "BINARY", "OCTAL", "HEX", "CHARACTER_CODE_CONSTANT", "FLOAT", 
		"GRAPHIC_TOKEN", "GRAPHIC", "SINGLE_QUOTED_CHARACTER", "DOUBLE_QUOTED_CHARACTER", 
		"BACK_QUOTED_CHARACTER", "NON_QUOTE_CHAR", "META_ESCAPE", "CONTROL_ESCAPE", 
		"OCTAL_ESCAPE", "HEX_ESCAPE", "QUOTED", "CONTINUATION_ESCAPE", "ALPHANUMERIC", 
		"ALPHA", "SMALL_LETTER", "CAPITAL_LETTER", "DIGIT", "HEX_DIGIT", "WC", 
		"WS", "COMMENT", "MULTILINE_COMMENT"
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


	public nobjectscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "nobjectscript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u01b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u00fa\n)\3)\7)\u00fd\n)\f)"+
		"\16)\u0100\13)\3*\6*\u0103\n*\r*\16*\u0104\3+\3+\3+\3+\6+\u010b\n+\r+"+
		"\16+\u010c\3,\3,\3,\3,\6,\u0113\n,\r,\16,\u0114\3-\3-\3-\3-\6-\u011b\n"+
		"-\r-\16-\u011c\3.\3.\3.\3.\3/\3/\3/\6/\u0126\n/\r/\16/\u0127\3/\3/\3/"+
		"\5/\u012d\n/\3\60\3\60\6\60\u0131\n\60\r\60\16\60\u0132\3\61\5\61\u0136"+
		"\n\61\3\62\3\62\3\62\3\62\5\62\u013c\n\62\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0143\n\63\3\64\3\64\3\64\3\64\5\64\u0149\n\64\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\5\65\u0152\n\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\68\u015c"+
		"\n8\r8\168\u015d\38\38\39\39\39\39\69\u0166\n9\r9\169\u0167\39\39\3:\3"+
		":\3:\7:\u016f\n:\f:\16:\u0172\13:\3:\3:\3;\3;\3;\3<\3<\5<\u017b\n<\3="+
		"\3=\3=\5=\u0180\n=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\6C\u018d\nC\rC\16"+
		"C\u018e\3C\3C\3D\3D\3D\3D\7D\u0197\nD\fD\16D\u019a\13D\3D\5D\u019d\nD"+
		"\3D\3D\3E\3E\3E\3E\3E\7E\u01a6\nE\fE\16E\u01a9\13E\3E\3E\3E\5E\u01ae\n"+
		"E\3E\3E\4\u0170\u01a7\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c"+
		"\2e\2g\2i\2k\2m\2o\2q\2s\62u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\63\u0085"+
		"\64\u0087\65\u0089\66\3\2\22\3\2\62\63\3\2\629\3\2\62;\4\2GGgg\4\2--/"+
		"/\n\2%&((,-/\61<<>B``\u0080\u0080\4\2$$bb\4\2$$))\6\2$$))^^bb\b\2cdhh"+
		"ppttvvxx\4\2aac|\3\2C\\\5\2\62;CHch\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4"+
		"\3\f\f\17\17\2\u01c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2s\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2"+
		"\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t"+
		"\u0091\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u0099"+
		"\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u00a0\3\2\2\2\31\u00a2\3"+
		"\2\2\2\33\u00a5\3\2\2\2\35\u00a8\3\2\2\2\37\u00ac\3\2\2\2!\u00af\3\2\2"+
		"\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00ba\3\2\2\2)\u00be\3\2\2\2+\u00c1"+
		"\3\2\2\2-\u00c5\3\2\2\2/\u00c9\3\2\2\2\61\u00cb\3\2\2\2\63\u00ce\3\2\2"+
		"\2\65\u00d0\3\2\2\2\67\u00d3\3\2\2\29\u00d5\3\2\2\2;\u00d8\3\2\2\2=\u00db"+
		"\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E\u00e6\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00ed\3\2\2\2K\u00f0\3\2\2\2M\u00f3\3\2\2\2O\u00f5\3\2"+
		"\2\2Q\u00f9\3\2\2\2S\u0102\3\2\2\2U\u0106\3\2\2\2W\u010e\3\2\2\2Y\u0116"+
		"\3\2\2\2[\u011e\3\2\2\2]\u0122\3\2\2\2_\u0130\3\2\2\2a\u0135\3\2\2\2c"+
		"\u013b\3\2\2\2e\u0142\3\2\2\2g\u0148\3\2\2\2i\u0151\3\2\2\2k\u0153\3\2"+
		"\2\2m\u0156\3\2\2\2o\u0159\3\2\2\2q\u0161\3\2\2\2s\u016b\3\2\2\2u\u0175"+
		"\3\2\2\2w\u017a\3\2\2\2y\u017f\3\2\2\2{\u0181\3\2\2\2}\u0183\3\2\2\2\177"+
		"\u0185\3\2\2\2\u0081\u0187\3\2\2\2\u0083\u0189\3\2\2\2\u0085\u018c\3\2"+
		"\2\2\u0087\u0192\3\2\2\2\u0089\u01a0\3\2\2\2\u008b\u008c\7}\2\2\u008c"+
		"\4\3\2\2\2\u008d\u008e\7\177\2\2\u008e\6\3\2\2\2\u008f\u0090\7<\2\2\u0090"+
		"\b\3\2\2\2\u0091\u0092\7\60\2\2\u0092\n\3\2\2\2\u0093\u0094\7#\2\2\u0094"+
		"\f\3\2\2\2\u0095\u0096\7*\2\2\u0096\16\3\2\2\2\u0097\u0098\7+\2\2\u0098"+
		"\20\3\2\2\2\u0099\u009a\7/\2\2\u009a\22\3\2\2\2\u009b\u009c\7.\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7^\2\2\u009e\u009f\7-\2\2\u009f\26\3\2\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7^\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		"\32\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\7?\2\2\u00a7\34\3\2\2\2\u00a8"+
		"\u00a9\7^\2\2\u00a9\u00aa\7?\2\2\u00aa\u00ab\7?\2\2\u00ab\36\3\2\2\2\u00ac"+
		"\u00ad\7B\2\2\u00ad\u00ae\7>\2\2\u00ae \3\2\2\2\u00af\u00b0\7B\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b1\u00b2\7>\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7B\2\2\u00b4"+
		"\u00b5\7@\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b8\7@\2\2\u00b8"+
		"\u00b9\7?\2\2\u00b9&\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"\u00bd\7\60\2\2\u00bd(\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"*\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\7?\2\2\u00c4"+
		",\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6\u00c7\7^\2\2\u00c7\u00c8\7?\2\2\u00c8"+
		".\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\60\3\2\2\2\u00cb\u00cc\7>\2\2\u00cc"+
		"\u00cd\7?\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\64\3\2\2\2\u00d0"+
		"\u00d1\7@\2\2\u00d1\u00d2\7?\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4"+
		"8\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\7^\2\2\u00d7:\3\2\2\2\u00d8"+
		"\u00d9\7^\2\2\u00d9\u00da\7\61\2\2\u00da<\3\2\2\2\u00db\u00dc\7,\2\2\u00dc"+
		">\3\2\2\2\u00dd\u00de\7\61\2\2\u00de@\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0"+
		"\u00e1\7\61\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7o\2\2\u00e7\u00e8\7q\2\2\u00e8"+
		"\u00e9\7f\2\2\u00e9F\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec\7>\2\2\u00ec"+
		"H\3\2\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7@\2\2\u00efJ\3\2\2\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\u00f2\7,\2\2\u00f2L\3\2\2\2\u00f3\u00f4\7`\2\2\u00f4N\3"+
		"\2\2\2\u00f5\u00f6\7^\2\2\u00f6P\3\2\2\2\u00f7\u00fa\5}?\2\u00f8\u00fa"+
		"\5{>\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb"+
		"\u00fd\5w<\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00fe\u00ff\3\2\2\2\u00ffR\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103"+
		"\5\177@\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105T\3\2\2\2\u0106\u0107\7\62\2\2\u0107\u0108\7"+
		"d\2\2\u0108\u010a\3\2\2\2\u0109\u010b\t\2\2\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dV\3\2\2\2"+
		"\u010e\u010f\7\62\2\2\u010f\u0110\7q\2\2\u0110\u0112\3\2\2\2\u0111\u0113"+
		"\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115X\3\2\2\2\u0116\u0117\7\62\2\2\u0117\u0118\7z\2\2"+
		"\u0118\u011a\3\2\2\2\u0119\u011b\5\u0081A\2\u011a\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dZ\3\2\2\2"+
		"\u011e\u011f\7\62\2\2\u011f\u0120\7)\2\2\u0120\u0121\5c\62\2\u0121\\\3"+
		"\2\2\2\u0122\u0123\5S*\2\u0123\u0125\7\60\2\2\u0124\u0126\t\4\2\2\u0125"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012c\3\2\2\2\u0129\u012a\t\5\2\2\u012a\u012b\t\6\2\2\u012b"+
		"\u012d\5S*\2\u012c\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012d^\3\2\2\2\u012e"+
		"\u0131\5a\61\2\u012f\u0131\7^\2\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"`\3\2\2\2\u0134\u0136\t\7\2\2\u0135\u0134\3\2\2\2\u0136b\3\2\2\2\u0137"+
		"\u013c\5i\65\2\u0138\u0139\7)\2\2\u0139\u013c\7)\2\2\u013a\u013c\t\b\2"+
		"\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u013a\3\2\2\2\u013cd"+
		"\3\2\2\2\u013d\u0143\5i\65\2\u013e\u0143\7)\2\2\u013f\u0140\7$\2\2\u0140"+
		"\u0143\7$\2\2\u0141\u0143\7b\2\2\u0142\u013d\3\2\2\2\u0142\u013e\3\2\2"+
		"\2\u0142\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143f\3\2\2\2\u0144\u0149"+
		"\5i\65\2\u0145\u0149\t\t\2\2\u0146\u0147\7b\2\2\u0147\u0149\7b\2\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0149h\3\2\2\2"+
		"\u014a\u0152\5a\61\2\u014b\u0152\5w<\2\u014c\u0152\7\"\2\2\u014d\u0152"+
		"\5k\66\2\u014e\u0152\5m\67\2\u014f\u0152\5o8\2\u0150\u0152\5q9\2\u0151"+
		"\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2"+
		"\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"j\3\2\2\2\u0153\u0154\7^\2\2\u0154\u0155\t\n\2\2\u0155l\3\2\2\2\u0156"+
		"\u0157\7^\2\2\u0157\u0158\t\13\2\2\u0158n\3\2\2\2\u0159\u015b\7^\2\2\u015a"+
		"\u015c\t\3\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7^\2\2\u0160"+
		"p\3\2\2\2\u0161\u0162\7^\2\2\u0162\u0163\7z\2\2\u0163\u0165\3\2\2\2\u0164"+
		"\u0166\5\u0081A\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7^\2\2\u016a"+
		"r\3\2\2\2\u016b\u0170\7)\2\2\u016c\u016f\5u;\2\u016d\u016f\5c\62\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7)\2\2\u0174t\3\2\2\2\u0175\u0176\7^\2\2\u0176\u0177\7\f\2\2\u0177"+
		"v\3\2\2\2\u0178\u017b\5y=\2\u0179\u017b\5\177@\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017bx\3\2\2\2\u017c\u0180\7a\2\2\u017d\u0180\5{>\2\u017e"+
		"\u0180\5}?\2\u017f\u017c\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2"+
		"\2\u0180z\3\2\2\2\u0181\u0182\t\f\2\2\u0182|\3\2\2\2\u0183\u0184\t\r\2"+
		"\2\u0184~\3\2\2\2\u0185\u0186\t\4\2\2\u0186\u0080\3\2\2\2\u0187\u0188"+
		"\t\16\2\2\u0188\u0082\3\2\2\2\u0189\u018a\t\17\2\2\u018a\u0084\3\2\2\2"+
		"\u018b\u018d\5\u0083B\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\bC"+
		"\2\2\u0191\u0086\3\2\2\2\u0192\u0193\7\61\2\2\u0193\u0194\7\61\2\2\u0194"+
		"\u0198\3\2\2\2\u0195\u0197\n\20\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3"+
		"\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019b\u019d\t\21\2\2\u019c\u019b\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019e\u019f\bD\3\2\u019f\u0088\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1"+
		"\u01a2\7,\2\2\u01a2\u01a7\3\2\2\2\u01a3\u01a6\5\u0089E\2\u01a4\u01a6\13"+
		"\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ad\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ab\7,\2\2\u01ab\u01ae\7\61\2\2\u01ac\u01ae\7\2\2\3\u01ad"+
		"\u01aa\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\bE"+
		"\3\2\u01b0\u008a\3\2\2\2\36\2\u00f9\u00fe\u0104\u010c\u0114\u011c\u0127"+
		"\u012c\u0130\u0132\u0135\u013b\u0142\u0148\u0151\u015d\u0167\u016e\u0170"+
		"\u017a\u017f\u018e\u0198\u019c\u01a5\u01a7\u01ad\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}