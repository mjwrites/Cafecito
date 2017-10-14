// Generated from mandarin.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mandarinLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ARROW=89, COLONCOLON=90, 
		ADD_ASSIGN=91, SUB_ASSIGN=92, MUL_ASSIGN=93, DIV_ASSIGN=94, AND_ASSIGN=95, 
		OR_ASSIGN=96, XOR_ASSIGN=97, MOD_ASSIGN=98, LSHIFT_ASSIGN=99, RSHIFT_ASSIGN=100, 
		URSHIFT_ASSIGN=101, Identifier=102, AT=103, ELLIPSIS=104, WS=105, COMMENT=106, 
		LINE_COMMENT=107;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", 
		"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
		"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
		"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
		"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
		"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
		"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
		"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
		"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
		"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
		"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", 
		"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "JavaLetter", "JavaLetterOrDigit", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u62BD\u8C61'", "'\u65AD\u8A00'", "'\u5E03\u5C14'", "'\u6253\u7834'", 
		"'\u5B57\u8282'", "'\u6848\u4F8B'", "'\u8D76\u4E0A'", "'\u7126\u70AD'", 
		"'\u7C7B'", "'\u5E38\u91CF'", "'\u7EE7\u7EED'", "'\u9ED8\u8BA4'", "'\u505A'", 
		"'\u53CC'", "'\u5426\u5219'", "'\u679A\u4E3E'", "'\u6269\u5C55'", "'\u6700\u7EC8'", 
		"'\u6700\u540E'", "'\u6D6E'", "'\u5BF9\u4E8E'", "'si'", "'\u8F6C\u5230'", 
		"'\u5B9E\u73B0'", "'\u8FDB\u53E3'", "'\u7684\u4F8B\u5B50'", "'\u6574\u6570'", 
		"'\u63A5\u53E3'", "'\u957F'", "'\u672C\u5730'", "'\u65B0'", "'\u5305'", 
		"'\u79C1\u4EBA'", "'\u4FDD\u62A4'", "'\u516C\u5171'", "'\u8FD4\u56DE'", 
		"'\u77ED'", "'\u9759\u6001'", "'\u4E25\u683C\u6D6E\u70B9'", "'\u8D85\u7EA7'", 
		"'\u5F00\u5173'", "'\u540C\u6B65'", "'\u6B64'", "'\u6254'", "'\u629B\u51FA'", 
		"'\u77AC\u65F6'", "'\u5C1D\u8BD5'", "'\u65E0\u6548'", "'\u6325\u53D1\u6027'", 
		"'\u540C\u65F6'", null, null, null, null, null, "'\u7A7A'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
		"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
		"'->'", "'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
		"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
		"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
		"SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
		"TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
		"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
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


	public mandarinLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mandarin.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 146:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 147:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u0382\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u01ca\n\64"+
		"\3\65\3\65\5\65\u01ce\n\65\3\66\3\66\5\66\u01d2\n\66\3\67\3\67\5\67\u01d6"+
		"\n\67\38\38\58\u01da\n8\39\39\3:\3:\3:\5:\u01e1\n:\3:\3:\3:\5:\u01e6\n"+
		":\5:\u01e8\n:\3;\3;\5;\u01ec\n;\3;\5;\u01ef\n;\3<\3<\5<\u01f3\n<\3=\3"+
		"=\3>\6>\u01f8\n>\r>\16>\u01f9\3?\3?\5?\u01fe\n?\3@\6@\u0201\n@\r@\16@"+
		"\u0202\3A\3A\3A\3A\3B\3B\5B\u020b\nB\3B\5B\u020e\nB\3C\3C\3D\6D\u0213"+
		"\nD\rD\16D\u0214\3E\3E\5E\u0219\nE\3F\3F\5F\u021d\nF\3F\3F\3G\3G\5G\u0223"+
		"\nG\3G\5G\u0226\nG\3H\3H\3I\6I\u022b\nI\rI\16I\u022c\3J\3J\5J\u0231\n"+
		"J\3K\3K\3K\3K\3L\3L\5L\u0239\nL\3L\5L\u023c\nL\3M\3M\3N\6N\u0241\nN\r"+
		"N\16N\u0242\3O\3O\5O\u0247\nO\3P\3P\5P\u024b\nP\3Q\3Q\3Q\5Q\u0250\nQ\3"+
		"Q\5Q\u0253\nQ\3Q\5Q\u0256\nQ\3Q\3Q\3Q\5Q\u025b\nQ\3Q\5Q\u025e\nQ\3Q\3"+
		"Q\3Q\5Q\u0263\nQ\3Q\3Q\3Q\5Q\u0268\nQ\3R\3R\3R\3S\3S\3T\5T\u0270\nT\3"+
		"T\3T\3U\3U\3V\3V\3W\3W\3W\5W\u027b\nW\3X\3X\5X\u027f\nX\3X\3X\3X\5X\u0284"+
		"\nX\3X\3X\5X\u0288\nX\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u0298"+
		"\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u02a2\n\\\3]\3]\3^\3^\5^\u02a8"+
		"\n^\3^\3^\3_\6_\u02ad\n_\r_\16_\u02ae\3`\3`\5`\u02b3\n`\3a\3a\3a\3a\5"+
		"a\u02b9\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u02c6\nb\3c\3c\3d\3d\3"+
		"d\3d\3d\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3"+
		"n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3w\3w\3w\3x\3"+
		"x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3\177\3\177\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\7\u0093\u0348\n\u0093\f\u0093\16\u0093\u034b"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0353"+
		"\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u035b"+
		"\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\6\u0098"+
		"\u0364\n\u0098\r\u0098\16\u0098\u0365\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\7\u0099\u036e\n\u0099\f\u0099\16\u0099\u0371\13\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u037c\n\u009a\f\u009a\16\u009a\u037f\13\u009a\3\u009a\3\u009a"+
		"\3\u036f\2\u009b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\66\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\67\u00b78\u00b9\2\u00bb9\u00bd"+
		"\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9:\u00cb;\u00cd<\u00cf"+
		"=\u00d1>\u00d3?\u00d5@\u00d7A\u00d9B\u00dbC\u00ddD\u00dfE\u00e1F\u00e3"+
		"G\u00e5H\u00e7I\u00e9J\u00ebK\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7"+
		"Q\u00f9R\u00fbS\u00fdT\u00ffU\u0101V\u0103W\u0105X\u0107Y\u0109Z\u010b"+
		"[\u010d\\\u010f]\u0111^\u0113_\u0115`\u0117a\u0119b\u011bc\u011dd\u011f"+
		"e\u0121f\u0123g\u0125h\u0127\2\u0129\2\u012bi\u012dj\u012fk\u0131l\u0133"+
		"m\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63"+
		"\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$"+
		"$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\2\u0390\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2\u009f\3"+
		"\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00bb\3\2\2\2\2\u00c9\3\2\2\2"+
		"\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3"+
		"\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2"+
		"\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5"+
		"\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2"+
		"\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7"+
		"\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109"+
		"\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2"+
		"\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119\3\2\2\2\2\u011b"+
		"\3\2\2\2\2\u011d\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2"+
		"\2\2\u0125\3\2\2\2\2\u012b\3\2\2\2\2\u012d\3\2\2\2\2\u012f\3\2\2\2\2\u0131"+
		"\3\2\2\2\2\u0133\3\2\2\2\3\u0135\3\2\2\2\5\u0138\3\2\2\2\7\u013b\3\2\2"+
		"\2\t\u013e\3\2\2\2\13\u0141\3\2\2\2\r\u0144\3\2\2\2\17\u0147\3\2\2\2\21"+
		"\u014a\3\2\2\2\23\u014d\3\2\2\2\25\u014f\3\2\2\2\27\u0152\3\2\2\2\31\u0155"+
		"\3\2\2\2\33\u0158\3\2\2\2\35\u015a\3\2\2\2\37\u015c\3\2\2\2!\u015f\3\2"+
		"\2\2#\u0162\3\2\2\2%\u0165\3\2\2\2\'\u0168\3\2\2\2)\u016b\3\2\2\2+\u016d"+
		"\3\2\2\2-\u0170\3\2\2\2/\u0173\3\2\2\2\61\u0176\3\2\2\2\63\u0179\3\2\2"+
		"\2\65\u017c\3\2\2\2\67\u0180\3\2\2\29\u0183\3\2\2\2;\u0186\3\2\2\2=\u0188"+
		"\3\2\2\2?\u018b\3\2\2\2A\u018d\3\2\2\2C\u018f\3\2\2\2E\u0192\3\2\2\2G"+
		"\u0195\3\2\2\2I\u0198\3\2\2\2K\u019b\3\2\2\2M\u019d\3\2\2\2O\u01a0\3\2"+
		"\2\2Q\u01a5\3\2\2\2S\u01a8\3\2\2\2U\u01ab\3\2\2\2W\u01ae\3\2\2\2Y\u01b0"+
		"\3\2\2\2[\u01b2\3\2\2\2]\u01b5\3\2\2\2_\u01b8\3\2\2\2a\u01bb\3\2\2\2c"+
		"\u01be\3\2\2\2e\u01c2\3\2\2\2g\u01c9\3\2\2\2i\u01cb\3\2\2\2k\u01cf\3\2"+
		"\2\2m\u01d3\3\2\2\2o\u01d7\3\2\2\2q\u01db\3\2\2\2s\u01e7\3\2\2\2u\u01e9"+
		"\3\2\2\2w\u01f2\3\2\2\2y\u01f4\3\2\2\2{\u01f7\3\2\2\2}\u01fd\3\2\2\2\177"+
		"\u0200\3\2\2\2\u0081\u0204\3\2\2\2\u0083\u0208\3\2\2\2\u0085\u020f\3\2"+
		"\2\2\u0087\u0212\3\2\2\2\u0089\u0218\3\2\2\2\u008b\u021a\3\2\2\2\u008d"+
		"\u0220\3\2\2\2\u008f\u0227\3\2\2\2\u0091\u022a\3\2\2\2\u0093\u0230\3\2"+
		"\2\2\u0095\u0232\3\2\2\2\u0097\u0236\3\2\2\2\u0099\u023d\3\2\2\2\u009b"+
		"\u0240\3\2\2\2\u009d\u0246\3\2\2\2\u009f\u024a\3\2\2\2\u00a1\u0267\3\2"+
		"\2\2\u00a3\u0269\3\2\2\2\u00a5\u026c\3\2\2\2\u00a7\u026f\3\2\2\2\u00a9"+
		"\u0273\3\2\2\2\u00ab\u0275\3\2\2\2\u00ad\u0277\3\2\2\2\u00af\u0287\3\2"+
		"\2\2\u00b1\u0289\3\2\2\2\u00b3\u028c\3\2\2\2\u00b5\u0297\3\2\2\2\u00b7"+
		"\u02a1\3\2\2\2\u00b9\u02a3\3\2\2\2\u00bb\u02a5\3\2\2\2\u00bd\u02ac\3\2"+
		"\2\2\u00bf\u02b2\3\2\2\2\u00c1\u02b8\3\2\2\2\u00c3\u02c5\3\2\2\2\u00c5"+
		"\u02c7\3\2\2\2\u00c7\u02c9\3\2\2\2\u00c9\u02d0\3\2\2\2\u00cb\u02d2\3\2"+
		"\2\2\u00cd\u02d4\3\2\2\2\u00cf\u02d6\3\2\2\2\u00d1\u02d8\3\2\2\2\u00d3"+
		"\u02da\3\2\2\2\u00d5\u02dc\3\2\2\2\u00d7\u02de\3\2\2\2\u00d9\u02e0\3\2"+
		"\2\2\u00db\u02e2\3\2\2\2\u00dd\u02e4\3\2\2\2\u00df\u02e6\3\2\2\2\u00e1"+
		"\u02e8\3\2\2\2\u00e3\u02ea\3\2\2\2\u00e5\u02ec\3\2\2\2\u00e7\u02ee\3\2"+
		"\2\2\u00e9\u02f0\3\2\2\2\u00eb\u02f2\3\2\2\2\u00ed\u02f5\3\2\2\2\u00ef"+
		"\u02f8\3\2\2\2\u00f1\u02fb\3\2\2\2\u00f3\u02fe\3\2\2\2\u00f5\u0301\3\2"+
		"\2\2\u00f7\u0304\3\2\2\2\u00f9\u0307\3\2\2\2\u00fb\u030a\3\2\2\2\u00fd"+
		"\u030c\3\2\2\2\u00ff\u030e\3\2\2\2\u0101\u0310\3\2\2\2\u0103\u0312\3\2"+
		"\2\2\u0105\u0314\3\2\2\2\u0107\u0316\3\2\2\2\u0109\u0318\3\2\2\2\u010b"+
		"\u031a\3\2\2\2\u010d\u031d\3\2\2\2\u010f\u0320\3\2\2\2\u0111\u0323\3\2"+
		"\2\2\u0113\u0326\3\2\2\2\u0115\u0329\3\2\2\2\u0117\u032c\3\2\2\2\u0119"+
		"\u032f\3\2\2\2\u011b\u0332\3\2\2\2\u011d\u0335\3\2\2\2\u011f\u0338\3\2"+
		"\2\2\u0121\u033c\3\2\2\2\u0123\u0340\3\2\2\2\u0125\u0345\3\2\2\2\u0127"+
		"\u0352\3\2\2\2\u0129\u035a\3\2\2\2\u012b\u035c\3\2\2\2\u012d\u035e\3\2"+
		"\2\2\u012f\u0363\3\2\2\2\u0131\u0369\3\2\2\2\u0133\u0377\3\2\2\2\u0135"+
		"\u0136\7\u62bf\2\2\u0136\u0137\7\u8c63\2\2\u0137\4\3\2\2\2\u0138\u0139"+
		"\7\u65af\2\2\u0139\u013a\7\u8a02\2\2\u013a\6\3\2\2\2\u013b\u013c\7\u5e05"+
		"\2\2\u013c\u013d\7\u5c16\2\2\u013d\b\3\2\2\2\u013e\u013f\7\u6255\2\2\u013f"+
		"\u0140\7\u7836\2\2\u0140\n\3\2\2\2\u0141\u0142\7\u5b59\2\2\u0142\u0143"+
		"\7\u8284\2\2\u0143\f\3\2\2\2\u0144\u0145\7\u684a\2\2\u0145\u0146\7\u4f8d"+
		"\2\2\u0146\16\3\2\2\2\u0147\u0148\7\u8d78\2\2\u0148\u0149\7\u4e0c\2\2"+
		"\u0149\20\3\2\2\2\u014a\u014b\7\u7128\2\2\u014b\u014c\7\u70af\2\2\u014c"+
		"\22\3\2\2\2\u014d\u014e\7\u7c7d\2\2\u014e\24\3\2\2\2\u014f\u0150\7\u5e3a"+
		"\2\2\u0150\u0151\7\u91d1\2\2\u0151\26\3\2\2\2\u0152\u0153\7\u7ee9\2\2"+
		"\u0153\u0154\7\u7eef\2\2\u0154\30\3\2\2\2\u0155\u0156\7\u9eda\2\2\u0156"+
		"\u0157\7\u8ba6\2\2\u0157\32\3\2\2\2\u0158\u0159\7\u505c\2\2\u0159\34\3"+
		"\2\2\2\u015a\u015b\7\u53ce\2\2\u015b\36\3\2\2\2\u015c\u015d\7\u5428\2"+
		"\2\u015d\u015e\7\u521b\2\2\u015e \3\2\2\2\u015f\u0160\7\u679c\2\2\u0160"+
		"\u0161\7\u4e40\2\2\u0161\"\3\2\2\2\u0162\u0163\7\u626b\2\2\u0163\u0164"+
		"\7\u5c57\2\2\u0164$\3\2\2\2\u0165\u0166\7\u6702\2\2\u0166\u0167\7\u7eca"+
		"\2\2\u0167&\3\2\2\2\u0168\u0169\7\u6702\2\2\u0169\u016a\7\u5410\2\2\u016a"+
		"(\3\2\2\2\u016b\u016c\7\u6d70\2\2\u016c*\3\2\2\2\u016d\u016e\7\u5bfb\2"+
		"\2\u016e\u016f\7\u4e90\2\2\u016f,\3\2\2\2\u0170\u0171\7u\2\2\u0171\u0172"+
		"\7k\2\2\u0172.\3\2\2\2\u0173\u0174\7\u8f6e\2\2\u0174\u0175\7\u5232\2\2"+
		"\u0175\60\3\2\2\2\u0176\u0177\7\u5ba0\2\2\u0177\u0178\7\u73b2\2\2\u0178"+
		"\62\3\2\2\2\u0179\u017a\7\u8fdd\2\2\u017a\u017b\7\u53e5\2\2\u017b\64\3"+
		"\2\2\2\u017c\u017d\7\u7686\2\2\u017d\u017e\7\u4f8d\2\2\u017e\u017f\7\u5b52"+
		"\2\2\u017f\66\3\2\2\2\u0180\u0181\7\u6576\2\2\u0181\u0182\7\u6572\2\2"+
		"\u01828\3\2\2\2\u0183\u0184\7\u63a7\2\2\u0184\u0185\7\u53e5\2\2\u0185"+
		":\3\2\2\2\u0186\u0187\7\u9581\2\2\u0187<\3\2\2\2\u0188\u0189\7\u672e\2"+
		"\2\u0189\u018a\7\u5732\2\2\u018a>\3\2\2\2\u018b\u018c\7\u65b2\2\2\u018c"+
		"@\3\2\2\2\u018d\u018e\7\u5307\2\2\u018eB\3\2\2\2\u018f\u0190\7\u79c3\2"+
		"\2\u0190\u0191\7\u4ebc\2\2\u0191D\3\2\2\2\u0192\u0193\7\u4fdf\2\2\u0193"+
		"\u0194\7\u62a6\2\2\u0194F\3\2\2\2\u0195\u0196\7\u516e\2\2\u0196\u0197"+
		"\7\u5173\2\2\u0197H\3\2\2\2\u0198\u0199\7\u8fd6\2\2\u0199\u019a\7\u56e0"+
		"\2\2\u019aJ\3\2\2\2\u019b\u019c\7\u77ef\2\2\u019cL\3\2\2\2\u019d\u019e"+
		"\7\u975b\2\2\u019e\u019f\7\u6003\2\2\u019fN\3\2\2\2\u01a0\u01a1\7\u4e27"+
		"\2\2\u01a1\u01a2\7\u683e\2\2\u01a2\u01a3\7\u6d70\2\2\u01a3\u01a4\7\u70bb"+
		"\2\2\u01a4P\3\2\2\2\u01a5\u01a6\7\u8d87\2\2\u01a6\u01a7\7\u7ea9\2\2\u01a7"+
		"R\3\2\2\2\u01a8\u01a9\7\u5f02\2\2\u01a9\u01aa\7\u5175\2\2\u01aaT\3\2\2"+
		"\2\u01ab\u01ac\7\u540e\2\2\u01ac\u01ad\7\u6b67\2\2\u01adV\3\2\2\2\u01ae"+
		"\u01af\7\u6b66\2\2\u01afX\3\2\2\2\u01b0\u01b1\7\u6256\2\2\u01b1Z\3\2\2"+
		"\2\u01b2\u01b3\7\u629d\2\2\u01b3\u01b4\7\u51fc\2\2\u01b4\\\3\2\2\2\u01b5"+
		"\u01b6\7\u77ae\2\2\u01b6\u01b7\7\u65f8\2\2\u01b7^\3\2\2\2\u01b8\u01b9"+
		"\7\u5c1f\2\2\u01b9\u01ba\7\u8bd7\2\2\u01ba`\3\2\2\2\u01bb\u01bc\7\u65e2"+
		"\2\2\u01bc\u01bd\7\u654a\2\2\u01bdb\3\2\2\2\u01be\u01bf\7\u6327\2\2\u01bf"+
		"\u01c0\7\u53d3\2\2\u01c0\u01c1\7\u6029\2\2\u01c1d\3\2\2\2\u01c2\u01c3"+
		"\7\u540e\2\2\u01c3\u01c4\7\u65f8\2\2\u01c4f\3\2\2\2\u01c5\u01ca\5i\65"+
		"\2\u01c6\u01ca\5k\66\2\u01c7\u01ca\5m\67\2\u01c8\u01ca\5o8\2\u01c9\u01c5"+
		"\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca"+
		"h\3\2\2\2\u01cb\u01cd\5s:\2\u01cc\u01ce\5q9\2\u01cd\u01cc\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01cej\3\2\2\2\u01cf\u01d1\5\u0081A\2\u01d0\u01d2\5q9\2"+
		"\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2l\3\2\2\2\u01d3\u01d5\5"+
		"\u008bF\2\u01d4\u01d6\5q9\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"n\3\2\2\2\u01d7\u01d9\5\u0095K\2\u01d8\u01da\5q9\2\u01d9\u01d8\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01dap\3\2\2\2\u01db\u01dc\t\2\2\2\u01dcr\3\2\2\2"+
		"\u01dd\u01e8\7\62\2\2\u01de\u01e5\5y=\2\u01df\u01e1\5u;\2\u01e0\u01df"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e6\3\2\2\2\u01e2\u01e3\5\177@\2"+
		"\u01e3\u01e4\5u;\2\u01e4\u01e6\3\2\2\2\u01e5\u01e0\3\2\2\2\u01e5\u01e2"+
		"\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e7\u01de\3\2\2\2\u01e8"+
		"t\3\2\2\2\u01e9\u01ee\5w<\2\u01ea\u01ec\5{>\2\u01eb\u01ea\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\5w<\2\u01ee\u01eb\3\2\2"+
		"\2\u01ee\u01ef\3\2\2\2\u01efv\3\2\2\2\u01f0\u01f3\7\62\2\2\u01f1\u01f3"+
		"\5y=\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3x\3\2\2\2\u01f4\u01f5"+
		"\t\3\2\2\u01f5z\3\2\2\2\u01f6\u01f8\5}?\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa|\3\2\2\2\u01fb"+
		"\u01fe\5w<\2\u01fc\u01fe\7a\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2\2"+
		"\2\u01fe~\3\2\2\2\u01ff\u0201\7a\2\2\u0200\u01ff\3\2\2\2\u0201\u0202\3"+
		"\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0080\3\2\2\2\u0204"+
		"\u0205\7\62\2\2\u0205\u0206\t\4\2\2\u0206\u0207\5\u0083B\2\u0207\u0082"+
		"\3\2\2\2\u0208\u020d\5\u0085C\2\u0209\u020b\5\u0087D\2\u020a\u0209\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\5\u0085C\2\u020d"+
		"\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0084\3\2\2\2\u020f\u0210\t\5"+
		"\2\2\u0210\u0086\3\2\2\2\u0211\u0213\5\u0089E\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0088\3\2"+
		"\2\2\u0216\u0219\5\u0085C\2\u0217\u0219\7a\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u008a\3\2\2\2\u021a\u021c\7\62\2\2\u021b\u021d\5"+
		"\177@\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\5\u008dG\2\u021f\u008c\3\2\2\2\u0220\u0225\5\u008fH\2\u0221\u0223"+
		"\5\u0091I\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2"+
		"\2\u0224\u0226\5\u008fH\2\u0225\u0222\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u008e\3\2\2\2\u0227\u0228\t\6\2\2\u0228\u0090\3\2\2\2\u0229\u022b\5\u0093"+
		"J\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u0092\3\2\2\2\u022e\u0231\5\u008fH\2\u022f\u0231"+
		"\7a\2\2\u0230\u022e\3\2\2\2\u0230\u022f\3\2\2\2\u0231\u0094\3\2\2\2\u0232"+
		"\u0233\7\62\2\2\u0233\u0234\t\7\2\2\u0234\u0235\5\u0097L\2\u0235\u0096"+
		"\3\2\2\2\u0236\u023b\5\u0099M\2\u0237\u0239\5\u009bN\2\u0238\u0237\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\5\u0099M\2\u023b"+
		"\u0238\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0098\3\2\2\2\u023d\u023e\t\b"+
		"\2\2\u023e\u009a\3\2\2\2\u023f\u0241\5\u009dO\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0242\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u009c\3\2"+
		"\2\2\u0244\u0247\5\u0099M\2\u0245\u0247\7a\2\2\u0246\u0244\3\2\2\2\u0246"+
		"\u0245\3\2\2\2\u0247\u009e\3\2\2\2\u0248\u024b\5\u00a1Q\2\u0249\u024b"+
		"\5\u00adW\2\u024a\u0248\3\2\2\2\u024a\u0249\3\2\2\2\u024b\u00a0\3\2\2"+
		"\2\u024c\u024d\5u;\2\u024d\u024f\7\60\2\2\u024e\u0250\5u;\2\u024f\u024e"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0253\5\u00a3R"+
		"\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256"+
		"\5\u00abV\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0268\3\2\2"+
		"\2\u0257\u0258\7\60\2\2\u0258\u025a\5u;\2\u0259\u025b\5\u00a3R\2\u025a"+
		"\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025d\3\2\2\2\u025c\u025e\5\u00ab"+
		"V\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0268\3\2\2\2\u025f"+
		"\u0260\5u;\2\u0260\u0262\5\u00a3R\2\u0261\u0263\5\u00abV\2\u0262\u0261"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0268\3\2\2\2\u0264\u0265\5u;\2\u0265"+
		"\u0266\5\u00abV\2\u0266\u0268\3\2\2\2\u0267\u024c\3\2\2\2\u0267\u0257"+
		"\3\2\2\2\u0267\u025f\3\2\2\2\u0267\u0264\3\2\2\2\u0268\u00a2\3\2\2\2\u0269"+
		"\u026a\5\u00a5S\2\u026a\u026b\5\u00a7T\2\u026b\u00a4\3\2\2\2\u026c\u026d"+
		"\t\t\2\2\u026d\u00a6\3\2\2\2\u026e\u0270\5\u00a9U\2\u026f\u026e\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\5u;\2\u0272\u00a8"+
		"\3\2\2\2\u0273\u0274\t\n\2\2\u0274\u00aa\3\2\2\2\u0275\u0276\t\13\2\2"+
		"\u0276\u00ac\3\2\2\2\u0277\u0278\5\u00afX\2\u0278\u027a\5\u00b1Y\2\u0279"+
		"\u027b\5\u00abV\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u00ae"+
		"\3\2\2\2\u027c\u027e\5\u0081A\2\u027d\u027f\7\60\2\2\u027e\u027d\3\2\2"+
		"\2\u027e\u027f\3\2\2\2\u027f\u0288\3\2\2\2\u0280\u0281\7\62\2\2\u0281"+
		"\u0283\t\4\2\2\u0282\u0284\5\u0083B\2\u0283\u0282\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\7\60\2\2\u0286\u0288\5\u0083"+
		"B\2\u0287\u027c\3\2\2\2\u0287\u0280\3\2\2\2\u0288\u00b0\3\2\2\2\u0289"+
		"\u028a\5\u00b3Z\2\u028a\u028b\5\u00a7T\2\u028b\u00b2\3\2\2\2\u028c\u028d"+
		"\t\f\2\2\u028d\u00b4\3\2\2\2\u028e\u028f\7v\2\2\u028f\u0290\7t\2\2\u0290"+
		"\u0291\7w\2\2\u0291\u0298\7g\2\2\u0292\u0293\7h\2\2\u0293\u0294\7c\2\2"+
		"\u0294\u0295\7n\2\2\u0295\u0296\7u\2\2\u0296\u0298\7g\2\2\u0297\u028e"+
		"\3\2\2\2\u0297\u0292\3\2\2\2\u0298\u00b6\3\2\2\2\u0299\u029a\7)\2\2\u029a"+
		"\u029b\5\u00b9]\2\u029b\u029c\7)\2\2\u029c\u02a2\3\2\2\2\u029d\u029e\7"+
		")\2\2\u029e\u029f\5\u00c1a\2\u029f\u02a0\7)\2\2\u02a0\u02a2\3\2\2\2\u02a1"+
		"\u0299\3\2\2\2\u02a1\u029d\3\2\2\2\u02a2\u00b8\3\2\2\2\u02a3\u02a4\n\r"+
		"\2\2\u02a4\u00ba\3\2\2\2\u02a5\u02a7\7$\2\2\u02a6\u02a8\5\u00bd_\2\u02a7"+
		"\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7$"+
		"\2\2\u02aa\u00bc\3\2\2\2\u02ab\u02ad\5\u00bf`\2\u02ac\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u00be\3\2"+
		"\2\2\u02b0\u02b3\n\16\2\2\u02b1\u02b3\5\u00c1a\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b1\3\2\2\2\u02b3\u00c0\3\2\2\2\u02b4\u02b5\7^\2\2\u02b5\u02b9\t\17"+
		"\2\2\u02b6\u02b9\5\u00c3b\2\u02b7\u02b9\5\u00c7d\2\u02b8\u02b4\3\2\2\2"+
		"\u02b8\u02b6\3\2\2\2\u02b8\u02b7\3\2\2\2\u02b9\u00c2\3\2\2\2\u02ba\u02bb"+
		"\7^\2\2\u02bb\u02c6\5\u008fH\2\u02bc\u02bd\7^\2\2\u02bd\u02be\5\u008f"+
		"H\2\u02be\u02bf\5\u008fH\2\u02bf\u02c6\3\2\2\2\u02c0\u02c1\7^\2\2\u02c1"+
		"\u02c2\5\u00c5c\2\u02c2\u02c3\5\u008fH\2\u02c3\u02c4\5\u008fH\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02ba\3\2\2\2\u02c5\u02bc\3\2\2\2\u02c5\u02c0\3\2"+
		"\2\2\u02c6\u00c4\3\2\2\2\u02c7\u02c8\t\20\2\2\u02c8\u00c6\3\2\2\2\u02c9"+
		"\u02ca\7^\2\2\u02ca\u02cb\7w\2\2\u02cb\u02cc\5\u0085C\2\u02cc\u02cd\5"+
		"\u0085C\2\u02cd\u02ce\5\u0085C\2\u02ce\u02cf\5\u0085C\2\u02cf\u00c8\3"+
		"\2\2\2\u02d0\u02d1\7\u7a7c\2\2\u02d1\u00ca\3\2\2\2\u02d2\u02d3\7*\2\2"+
		"\u02d3\u00cc\3\2\2\2\u02d4\u02d5\7+\2\2\u02d5\u00ce\3\2\2\2\u02d6\u02d7"+
		"\7}\2\2\u02d7\u00d0\3\2\2\2\u02d8\u02d9\7\177\2\2\u02d9\u00d2\3\2\2\2"+
		"\u02da\u02db\7]\2\2\u02db\u00d4\3\2\2\2\u02dc\u02dd\7_\2\2\u02dd\u00d6"+
		"\3\2\2\2\u02de\u02df\7=\2\2\u02df\u00d8\3\2\2\2\u02e0\u02e1\7.\2\2\u02e1"+
		"\u00da\3\2\2\2\u02e2\u02e3\7\60\2\2\u02e3\u00dc\3\2\2\2\u02e4\u02e5\7"+
		"?\2\2\u02e5\u00de\3\2\2\2\u02e6\u02e7\7@\2\2\u02e7\u00e0\3\2\2\2\u02e8"+
		"\u02e9\7>\2\2\u02e9\u00e2\3\2\2\2\u02ea\u02eb\7#\2\2\u02eb\u00e4\3\2\2"+
		"\2\u02ec\u02ed\7\u0080\2\2\u02ed\u00e6\3\2\2\2\u02ee\u02ef\7A\2\2\u02ef"+
		"\u00e8\3\2\2\2\u02f0\u02f1\7<\2\2\u02f1\u00ea\3\2\2\2\u02f2\u02f3\7?\2"+
		"\2\u02f3\u02f4\7?\2\2\u02f4\u00ec\3\2\2\2\u02f5\u02f6\7>\2\2\u02f6\u02f7"+
		"\7?\2\2\u02f7\u00ee\3\2\2\2\u02f8\u02f9\7@\2\2\u02f9\u02fa\7?\2\2\u02fa"+
		"\u00f0\3\2\2\2\u02fb\u02fc\7#\2\2\u02fc\u02fd\7?\2\2\u02fd\u00f2\3\2\2"+
		"\2\u02fe\u02ff\7(\2\2\u02ff\u0300\7(\2\2\u0300\u00f4\3\2\2\2\u0301\u0302"+
		"\7~\2\2\u0302\u0303\7~\2\2\u0303\u00f6\3\2\2\2\u0304\u0305\7-\2\2\u0305"+
		"\u0306\7-\2\2\u0306\u00f8\3\2\2\2\u0307\u0308\7/\2\2\u0308\u0309\7/\2"+
		"\2\u0309\u00fa\3\2\2\2\u030a\u030b\7-\2\2\u030b\u00fc\3\2\2\2\u030c\u030d"+
		"\7/\2\2\u030d\u00fe\3\2\2\2\u030e\u030f\7,\2\2\u030f\u0100\3\2\2\2\u0310"+
		"\u0311\7\61\2\2\u0311\u0102\3\2\2\2\u0312\u0313\7(\2\2\u0313\u0104\3\2"+
		"\2\2\u0314\u0315\7~\2\2\u0315\u0106\3\2\2\2\u0316\u0317\7`\2\2\u0317\u0108"+
		"\3\2\2\2\u0318\u0319\7\'\2\2\u0319\u010a\3\2\2\2\u031a\u031b\7/\2\2\u031b"+
		"\u031c\7@\2\2\u031c\u010c\3\2\2\2\u031d\u031e\7<\2\2\u031e\u031f\7<\2"+
		"\2\u031f\u010e\3\2\2\2\u0320\u0321\7-\2\2\u0321\u0322\7?\2\2\u0322\u0110"+
		"\3\2\2\2\u0323\u0324\7/\2\2\u0324\u0325\7?\2\2\u0325\u0112\3\2\2\2\u0326"+
		"\u0327\7,\2\2\u0327\u0328\7?\2\2\u0328\u0114\3\2\2\2\u0329\u032a\7\61"+
		"\2\2\u032a\u032b\7?\2\2\u032b\u0116\3\2\2\2\u032c\u032d\7(\2\2\u032d\u032e"+
		"\7?\2\2\u032e\u0118\3\2\2\2\u032f\u0330\7~\2\2\u0330\u0331\7?\2\2\u0331"+
		"\u011a\3\2\2\2\u0332\u0333\7`\2\2\u0333\u0334\7?\2\2\u0334\u011c\3\2\2"+
		"\2\u0335\u0336\7\'\2\2\u0336\u0337\7?\2\2\u0337\u011e\3\2\2\2\u0338\u0339"+
		"\7>\2\2\u0339\u033a\7>\2\2\u033a\u033b\7?\2\2\u033b\u0120\3\2\2\2\u033c"+
		"\u033d\7@\2\2\u033d\u033e\7@\2\2\u033e\u033f\7?\2\2\u033f\u0122\3\2\2"+
		"\2\u0340\u0341\7@\2\2\u0341\u0342\7@\2\2\u0342\u0343\7@\2\2\u0343\u0344"+
		"\7?\2\2\u0344\u0124\3\2\2\2\u0345\u0349\5\u0127\u0094\2\u0346\u0348\5"+
		"\u0129\u0095\2\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2"+
		"\2\2\u0349\u034a\3\2\2\2\u034a\u0126\3\2\2\2\u034b\u0349\3\2\2\2\u034c"+
		"\u0353\t\21\2\2\u034d\u034e\n\22\2\2\u034e\u0353\6\u0094\2\2\u034f\u0350"+
		"\t\23\2\2\u0350\u0351\t\24\2\2\u0351\u0353\6\u0094\3\2\u0352\u034c\3\2"+
		"\2\2\u0352\u034d\3\2\2\2\u0352\u034f\3\2\2\2\u0353\u0128\3\2\2\2\u0354"+
		"\u035b\t\25\2\2\u0355\u0356\n\22\2\2\u0356\u035b\6\u0095\4\2\u0357\u0358"+
		"\t\23\2\2\u0358\u0359\t\24\2\2\u0359\u035b\6\u0095\5\2\u035a\u0354\3\2"+
		"\2\2\u035a\u0355\3\2\2\2\u035a\u0357\3\2\2\2\u035b\u012a\3\2\2\2\u035c"+
		"\u035d\7B\2\2\u035d\u012c\3\2\2\2\u035e\u035f\7\60\2\2\u035f\u0360\7\60"+
		"\2\2\u0360\u0361\7\60\2\2\u0361\u012e\3\2\2\2\u0362\u0364\t\26\2\2\u0363"+
		"\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2"+
		"\2\2\u0366\u0367\3\2\2\2\u0367\u0368\b\u0098\2\2\u0368\u0130\3\2\2\2\u0369"+
		"\u036a\7\61\2\2\u036a\u036b\7,\2\2\u036b\u036f\3\2\2\2\u036c\u036e\13"+
		"\2\2\2\u036d\u036c\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u0370\3\2\2\2\u036f"+
		"\u036d\3\2\2\2\u0370\u0372\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0373\7,"+
		"\2\2\u0373\u0374\7\61\2\2\u0374\u0375\3\2\2\2\u0375\u0376\b\u0099\2\2"+
		"\u0376\u0132\3\2\2\2\u0377\u0378\7\61\2\2\u0378\u0379\7\61\2\2\u0379\u037d"+
		"\3\2\2\2\u037a\u037c\n\27\2\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2"+
		"\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u0380\3\2\2\2\u037f\u037d"+
		"\3\2\2\2\u0380\u0381\b\u009a\2\2\u0381\u0134\3\2\2\28\2\u01c9\u01cd\u01d1"+
		"\u01d5\u01d9\u01e0\u01e5\u01e7\u01eb\u01ee\u01f2\u01f9\u01fd\u0202\u020a"+
		"\u020d\u0214\u0218\u021c\u0222\u0225\u022c\u0230\u0238\u023b\u0242\u0246"+
		"\u024a\u024f\u0252\u0255\u025a\u025d\u0262\u0267\u026f\u027a\u027e\u0283"+
		"\u0287\u0297\u02a1\u02a7\u02ae\u02b2\u02b8\u02c5\u0349\u0352\u035a\u0365"+
		"\u036f\u037d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}