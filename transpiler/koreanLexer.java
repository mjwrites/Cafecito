// Generated from korean.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class koreanLexer extends Lexer {
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
		null, "'\uC571\uC2A4\uD2B8\uB799\uD2B8'", "'\uC8FC\uC7A5'", "'\uBD80\uC6B8'", 
		"'\uC2A4\uD1B1'", "'\uBC14\uC774\uD2B8'", "'\uCF00\uC774\uC2A4'", "'\uCE90\uCE58'", 
		"'\uCE90\uB9AD\uD130'", "'\uD074\uB798\uC2A4'", "'\uCF58\uC2A4\uD2B8'", 
		"'\uACC4\uC18D'", "'\uB514\uD3F4\uD2B8'", "'\uD558\uB2E4'", "'\uB354\uBE14'", 
		"'\uC544\uB2C8\uBA74'", "'\uC774\uB118'", "'\uC775\uC2A4\uD150\uB4DC'", 
		"'\uD30C\uC774\uB110'", "'\uD30C\uC774\uB110\uB9AC'", "'\uD50C\uB85C\uD2B8'", 
		"'\uD3EC'", "'si'", "'\uACE0\uD22C'", "'\uC784\uD50C\uB808\uBA58\uCE20'", 
		"'\uC784\uD3EC\uD2B8'", "'\uC778\uC2A4\uD134\uC2A4'", "'\uC778\uD2B8'", 
		"'\uC778\uD130\uD398\uC774\uC2A4'", "'\uB871'", "'\uB124\uC774\uD2F0\uBE0C'", 
		"'\uB274'", "'\uD328\uD0A4\uC9C0'", "'\uD504\uB77C\uC774\uBE57'", "'\uBCF4\uD638\uB41C'", 
		"'\uD37C\uBE14\uB9AD'", "'\uB9AC\uD134'", "'\uC1FC\uD2B8'", "'\uC2A4\uD0DC\uD2F1'", 
		"'\uC2A4\uD2B8\uB9ADfp'", "'\uC288\uD37C'", "'\uC2A4\uC704\uCE58'", "'\uC2F1\uD06C\uB85C\uB098\uC774\uC988'", 
		"'\uC774'", "'\uC4F0\uB85C\uC6B0'", "'\uC4F0\uB85C\uC6B0\uC988'", "'\uD2B8\uB79C\uC9C0\uC5B8\uD2B8'", 
		"'\uD2B8\uB77C\uC774'", "'\uBCF4\uC774\uB4DC'", "'\uBCFC\uB7EC\uD2F8'", 
		"'\uC640\uC77C'", null, null, null, null, null, "'\uB110'", "'('", "')'", 
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


	public koreanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "korean.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u03b6\b\1\4\2\t"+
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
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u01fe\n\64"+
		"\3\65\3\65\5\65\u0202\n\65\3\66\3\66\5\66\u0206\n\66\3\67\3\67\5\67\u020a"+
		"\n\67\38\38\58\u020e\n8\39\39\3:\3:\3:\5:\u0215\n:\3:\3:\3:\5:\u021a\n"+
		":\5:\u021c\n:\3;\3;\5;\u0220\n;\3;\5;\u0223\n;\3<\3<\5<\u0227\n<\3=\3"+
		"=\3>\6>\u022c\n>\r>\16>\u022d\3?\3?\5?\u0232\n?\3@\6@\u0235\n@\r@\16@"+
		"\u0236\3A\3A\3A\3A\3B\3B\5B\u023f\nB\3B\5B\u0242\nB\3C\3C\3D\6D\u0247"+
		"\nD\rD\16D\u0248\3E\3E\5E\u024d\nE\3F\3F\5F\u0251\nF\3F\3F\3G\3G\5G\u0257"+
		"\nG\3G\5G\u025a\nG\3H\3H\3I\6I\u025f\nI\rI\16I\u0260\3J\3J\5J\u0265\n"+
		"J\3K\3K\3K\3K\3L\3L\5L\u026d\nL\3L\5L\u0270\nL\3M\3M\3N\6N\u0275\nN\r"+
		"N\16N\u0276\3O\3O\5O\u027b\nO\3P\3P\5P\u027f\nP\3Q\3Q\3Q\5Q\u0284\nQ\3"+
		"Q\5Q\u0287\nQ\3Q\5Q\u028a\nQ\3Q\3Q\3Q\5Q\u028f\nQ\3Q\5Q\u0292\nQ\3Q\3"+
		"Q\3Q\5Q\u0297\nQ\3Q\3Q\3Q\5Q\u029c\nQ\3R\3R\3R\3S\3S\3T\5T\u02a4\nT\3"+
		"T\3T\3U\3U\3V\3V\3W\3W\3W\5W\u02af\nW\3X\3X\5X\u02b3\nX\3X\3X\3X\5X\u02b8"+
		"\nX\3X\3X\5X\u02bc\nX\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\5[\u02cc"+
		"\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u02d6\n\\\3]\3]\3^\3^\5^\u02dc"+
		"\n^\3^\3^\3_\6_\u02e1\n_\r_\16_\u02e2\3`\3`\5`\u02e7\n`\3a\3a\3a\3a\5"+
		"a\u02ed\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u02fa\nb\3c\3c\3d\3d\3"+
		"d\3d\3d\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3"+
		"n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3v\3w\3w\3w\3x\3"+
		"x\3x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3|\3|\3|\3}\3}\3}\3~\3~\3\177\3\177\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087"+
		"\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\3\u0093\3\u0093\7\u0093\u037c\n\u0093\f\u0093\16\u0093\u037f"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0387"+
		"\n\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u038f"+
		"\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\6\u0098"+
		"\u0398\n\u0098\r\u0098\16\u0098\u0399\3\u0098\3\u0098\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\7\u0099\u03a2\n\u0099\f\u0099\16\u0099\u03a5\13\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\7\u009a\u03b0\n\u009a\f\u009a\16\u009a\u03b3\13\u009a\3\u009a\3\u009a"+
		"\3\u03a3\2\u009b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
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
		"\2\f\f\17\17\2\u03c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
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
		"\3\2\2\2\2\u0133\3\2\2\2\3\u0135\3\2\2\2\5\u013b\3\2\2\2\7\u013e\3\2\2"+
		"\2\t\u0141\3\2\2\2\13\u0144\3\2\2\2\r\u0148\3\2\2\2\17\u014c\3\2\2\2\21"+
		"\u014f\3\2\2\2\23\u0153\3\2\2\2\25\u0157\3\2\2\2\27\u015b\3\2\2\2\31\u015e"+
		"\3\2\2\2\33\u0162\3\2\2\2\35\u0165\3\2\2\2\37\u0168\3\2\2\2!\u016c\3\2"+
		"\2\2#\u016f\3\2\2\2%\u0174\3\2\2\2\'\u0178\3\2\2\2)\u017d\3\2\2\2+\u0181"+
		"\3\2\2\2-\u0183\3\2\2\2/\u0186\3\2\2\2\61\u0189\3\2\2\2\63\u018f\3\2\2"+
		"\2\65\u0193\3\2\2\2\67\u0198\3\2\2\29\u019b\3\2\2\2;\u01a1\3\2\2\2=\u01a3"+
		"\3\2\2\2?\u01a8\3\2\2\2A\u01aa\3\2\2\2C\u01ae\3\2\2\2E\u01b3\3\2\2\2G"+
		"\u01b7\3\2\2\2I\u01bb\3\2\2\2K\u01be\3\2\2\2M\u01c1\3\2\2\2O\u01c5\3\2"+
		"\2\2Q\u01cb\3\2\2\2S\u01ce\3\2\2\2U\u01d2\3\2\2\2W\u01d9\3\2\2\2Y\u01db"+
		"\3\2\2\2[\u01df\3\2\2\2]\u01e4\3\2\2\2_\u01ea\3\2\2\2a\u01ee\3\2\2\2c"+
		"\u01f2\3\2\2\2e\u01f6\3\2\2\2g\u01fd\3\2\2\2i\u01ff\3\2\2\2k\u0203\3\2"+
		"\2\2m\u0207\3\2\2\2o\u020b\3\2\2\2q\u020f\3\2\2\2s\u021b\3\2\2\2u\u021d"+
		"\3\2\2\2w\u0226\3\2\2\2y\u0228\3\2\2\2{\u022b\3\2\2\2}\u0231\3\2\2\2\177"+
		"\u0234\3\2\2\2\u0081\u0238\3\2\2\2\u0083\u023c\3\2\2\2\u0085\u0243\3\2"+
		"\2\2\u0087\u0246\3\2\2\2\u0089\u024c\3\2\2\2\u008b\u024e\3\2\2\2\u008d"+
		"\u0254\3\2\2\2\u008f\u025b\3\2\2\2\u0091\u025e\3\2\2\2\u0093\u0264\3\2"+
		"\2\2\u0095\u0266\3\2\2\2\u0097\u026a\3\2\2\2\u0099\u0271\3\2\2\2\u009b"+
		"\u0274\3\2\2\2\u009d\u027a\3\2\2\2\u009f\u027e\3\2\2\2\u00a1\u029b\3\2"+
		"\2\2\u00a3\u029d\3\2\2\2\u00a5\u02a0\3\2\2\2\u00a7\u02a3\3\2\2\2\u00a9"+
		"\u02a7\3\2\2\2\u00ab\u02a9\3\2\2\2\u00ad\u02ab\3\2\2\2\u00af\u02bb\3\2"+
		"\2\2\u00b1\u02bd\3\2\2\2\u00b3\u02c0\3\2\2\2\u00b5\u02cb\3\2\2\2\u00b7"+
		"\u02d5\3\2\2\2\u00b9\u02d7\3\2\2\2\u00bb\u02d9\3\2\2\2\u00bd\u02e0\3\2"+
		"\2\2\u00bf\u02e6\3\2\2\2\u00c1\u02ec\3\2\2\2\u00c3\u02f9\3\2\2\2\u00c5"+
		"\u02fb\3\2\2\2\u00c7\u02fd\3\2\2\2\u00c9\u0304\3\2\2\2\u00cb\u0306\3\2"+
		"\2\2\u00cd\u0308\3\2\2\2\u00cf\u030a\3\2\2\2\u00d1\u030c\3\2\2\2\u00d3"+
		"\u030e\3\2\2\2\u00d5\u0310\3\2\2\2\u00d7\u0312\3\2\2\2\u00d9\u0314\3\2"+
		"\2\2\u00db\u0316\3\2\2\2\u00dd\u0318\3\2\2\2\u00df\u031a\3\2\2\2\u00e1"+
		"\u031c\3\2\2\2\u00e3\u031e\3\2\2\2\u00e5\u0320\3\2\2\2\u00e7\u0322\3\2"+
		"\2\2\u00e9\u0324\3\2\2\2\u00eb\u0326\3\2\2\2\u00ed\u0329\3\2\2\2\u00ef"+
		"\u032c\3\2\2\2\u00f1\u032f\3\2\2\2\u00f3\u0332\3\2\2\2\u00f5\u0335\3\2"+
		"\2\2\u00f7\u0338\3\2\2\2\u00f9\u033b\3\2\2\2\u00fb\u033e\3\2\2\2\u00fd"+
		"\u0340\3\2\2\2\u00ff\u0342\3\2\2\2\u0101\u0344\3\2\2\2\u0103\u0346\3\2"+
		"\2\2\u0105\u0348\3\2\2\2\u0107\u034a\3\2\2\2\u0109\u034c\3\2\2\2\u010b"+
		"\u034e\3\2\2\2\u010d\u0351\3\2\2\2\u010f\u0354\3\2\2\2\u0111\u0357\3\2"+
		"\2\2\u0113\u035a\3\2\2\2\u0115\u035d\3\2\2\2\u0117\u0360\3\2\2\2\u0119"+
		"\u0363\3\2\2\2\u011b\u0366\3\2\2\2\u011d\u0369\3\2\2\2\u011f\u036c\3\2"+
		"\2\2\u0121\u0370\3\2\2\2\u0123\u0374\3\2\2\2\u0125\u0379\3\2\2\2\u0127"+
		"\u0386\3\2\2\2\u0129\u038e\3\2\2\2\u012b\u0390\3\2\2\2\u012d\u0392\3\2"+
		"\2\2\u012f\u0397\3\2\2\2\u0131\u039d\3\2\2\2\u0133\u03ab\3\2\2\2\u0135"+
		"\u0136\7\uc573\2\2\u0136\u0137\7\uc2a6\2\2\u0137\u0138\7\ud2ba\2\2\u0138"+
		"\u0139\7\ub79b\2\2\u0139\u013a\7\ud2ba\2\2\u013a\4\3\2\2\2\u013b\u013c"+
		"\7\uc8fe\2\2\u013c\u013d\7\uc7a7\2\2\u013d\6\3\2\2\2\u013e\u013f\7\ubd82"+
		"\2\2\u013f\u0140\7\uc6ba\2\2\u0140\b\3\2\2\2\u0141\u0142\7\uc2a6\2\2\u0142"+
		"\u0143\7\ud1b3\2\2\u0143\n\3\2\2\2\u0144\u0145\7\ubc16\2\2\u0145\u0146"+
		"\7\uc776\2\2\u0146\u0147\7\ud2ba\2\2\u0147\f\3\2\2\2\u0148\u0149\7\ucf02"+
		"\2\2\u0149\u014a\7\uc776\2\2\u014a\u014b\7\uc2a6\2\2\u014b\16\3\2\2\2"+
		"\u014c\u014d\7\uce92\2\2\u014d\u014e\7\uce5a\2\2\u014e\20\3\2\2\2\u014f"+
		"\u0150\7\uce92\2\2\u0150\u0151\7\ub9af\2\2\u0151\u0152\7\ud132\2\2\u0152"+
		"\22\3\2\2\2\u0153\u0154\7\ud076\2\2\u0154\u0155\7\ub79a\2\2\u0155\u0156"+
		"\7\uc2a6\2\2\u0156\24\3\2\2\2\u0157\u0158\7\ucf5a\2\2\u0158\u0159\7\uc2a6"+
		"\2\2\u0159\u015a\7\ud2ba\2\2\u015a\26\3\2\2\2\u015b\u015c\7\uacc6\2\2"+
		"\u015c\u015d\7\uc18f\2\2\u015d\30\3\2\2\2\u015e\u015f\7\ub516\2\2\u015f"+
		"\u0160\7\ud3f6\2\2\u0160\u0161\7\ud2ba\2\2\u0161\32\3\2\2\2\u0162\u0163"+
		"\7\ud55a\2\2\u0163\u0164\7\ub2e6\2\2\u0164\34\3\2\2\2\u0165\u0166\7\ub356"+
		"\2\2\u0166\u0167\7\ube16\2\2\u0167\36\3\2\2\2\u0168\u0169\7\uc546\2\2"+
		"\u0169\u016a\7\ub2ca\2\2\u016a\u016b\7\uba76\2\2\u016b \3\2\2\2\u016c"+
		"\u016d\7\uc776\2\2\u016d\u016e\7\ub11a\2\2\u016e\"\3\2\2\2\u016f\u0170"+
		"\7\uc777\2\2\u0170\u0171\7\uc2a6\2\2\u0171\u0172\7\ud152\2\2\u0172\u0173"+
		"\7\ub4de\2\2\u0173$\3\2\2\2\u0174\u0175\7\ud30e\2\2\u0175\u0176\7\uc776"+
		"\2\2\u0176\u0177\7\ub112\2\2\u0177&\3\2\2\2\u0178\u0179\7\ud30e\2\2\u0179"+
		"\u017a\7\uc776\2\2\u017a\u017b\7\ub112\2\2\u017b\u017c\7\ub9ae\2\2\u017c"+
		"(\3\2\2\2\u017d\u017e\7\ud50e\2\2\u017e\u017f\7\ub85e\2\2\u017f\u0180"+
		"\7\ud2ba\2\2\u0180*\3\2\2\2\u0181\u0182\7\ud3ee\2\2\u0182,\3\2\2\2\u0183"+
		"\u0184\7u\2\2\u0184\u0185\7k\2\2\u0185.\3\2\2\2\u0186\u0187\7\uace2\2"+
		"\2\u0187\u0188\7\ud22e\2\2\u0188\60\3\2\2\2\u0189\u018a\7\uc786\2\2\u018a"+
		"\u018b\7\ud50e\2\2\u018b\u018c\7\ub80a\2\2\u018c\u018d\7\uba5a\2\2\u018d"+
		"\u018e\7\uce22\2\2\u018e\62\3\2\2\2\u018f\u0190\7\uc786\2\2\u0190\u0191"+
		"\7\ud3ee\2\2\u0191\u0192\7\ud2ba\2\2\u0192\64\3\2\2\2\u0193\u0194\7\uc77a"+
		"\2\2\u0194\u0195\7\uc2a6\2\2\u0195\u0196\7\ud136\2\2\u0196\u0197\7\uc2a6"+
		"\2\2\u0197\66\3\2\2\2\u0198\u0199\7\uc77a\2\2\u0199\u019a\7\ud2ba\2\2"+
		"\u019a8\3\2\2\2\u019b\u019c\7\uc77a\2\2\u019c\u019d\7\ud132\2\2\u019d"+
		"\u019e\7\ud39a\2\2\u019e\u019f\7\uc776\2\2\u019f\u01a0\7\uc2a6\2\2\u01a0"+
		":\3\2\2\2\u01a1\u01a2\7\ub873\2\2\u01a2<\3\2\2\2\u01a3\u01a4\7\ub126\2"+
		"\2\u01a4\u01a5\7\uc776\2\2\u01a5\u01a6\7\ud2f2\2\2\u01a6\u01a7\7\ube0e"+
		"\2\2\u01a7>\3\2\2\2\u01a8\u01a9\7\ub276\2\2\u01a9@\3\2\2\2\u01aa\u01ab"+
		"\7\ud32a\2\2\u01ab\u01ac\7\ud0a6\2\2\u01ac\u01ad\7\uc9c2\2\2\u01adB\3"+
		"\2\2\2\u01ae\u01af\7\ud506\2\2\u01af\u01b0\7\ub77e\2\2\u01b0\u01b1\7\uc776"+
		"\2\2\u01b1\u01b2\7\ube59\2\2\u01b2D\3\2\2\2\u01b3\u01b4\7\ubcf6\2\2\u01b4"+
		"\u01b5\7\ud63a\2\2\u01b5\u01b6\7\ub41e\2\2\u01b6F\3\2\2\2\u01b7\u01b8"+
		"\7\ud37e\2\2\u01b8\u01b9\7\ube16\2\2\u01b9\u01ba\7\ub9af\2\2\u01baH\3"+
		"\2\2\2\u01bb\u01bc\7\ub9ae\2\2\u01bc\u01bd\7\ud136\2\2\u01bdJ\3\2\2\2"+
		"\u01be\u01bf\7\uc1fe\2\2\u01bf\u01c0\7\ud2ba\2\2\u01c0L\3\2\2\2\u01c1"+
		"\u01c2\7\uc2a6\2\2\u01c2\u01c3\7\ud0de\2\2\u01c3\u01c4\7\ud2f3\2\2\u01c4"+
		"N\3\2\2\2\u01c5\u01c6\7\uc2a6\2\2\u01c6\u01c7\7\ud2ba\2\2\u01c7\u01c8"+
		"\7\ub9af\2\2\u01c8\u01c9\7h\2\2\u01c9\u01ca\7r\2\2\u01caP\3\2\2\2\u01cb"+
		"\u01cc\7\uc28a\2\2\u01cc\u01cd\7\ud37e\2\2\u01cdR\3\2\2\2\u01ce\u01cf"+
		"\7\uc2a6\2\2\u01cf\u01d0\7\uc706\2\2\u01d0\u01d1\7\uce5a\2\2\u01d1T\3"+
		"\2\2\2\u01d2\u01d3\7\uc2f3\2\2\u01d3\u01d4\7\ud06e\2\2\u01d4\u01d5\7\ub85e"+
		"\2\2\u01d5\u01d6\7\ub09a\2\2\u01d6\u01d7\7\uc776\2\2\u01d7\u01d8\7\uc98a"+
		"\2\2\u01d8V\3\2\2\2\u01d9\u01da\7\uc776\2\2\u01daX\3\2\2\2\u01db\u01dc"+
		"\7\uc4f2\2\2\u01dc\u01dd\7\ub85e\2\2\u01dd\u01de\7\uc6b2\2\2\u01deZ\3"+
		"\2\2\2\u01df\u01e0\7\uc4f2\2\2\u01e0\u01e1\7\ub85e\2\2\u01e1\u01e2\7\uc6b2"+
		"\2\2\u01e2\u01e3\7\uc98a\2\2\u01e3\\\3\2\2\2\u01e4\u01e5\7\ud2ba\2\2\u01e5"+
		"\u01e6\7\ub79e\2\2\u01e6\u01e7\7\uc9c2\2\2\u01e7\u01e8\7\uc5ba\2\2\u01e8"+
		"\u01e9\7\ud2ba\2\2\u01e9^\3\2\2\2\u01ea\u01eb\7\ud2ba\2\2\u01eb\u01ec"+
		"\7\ub77e\2\2\u01ec\u01ed\7\uc776\2\2\u01ed`\3\2\2\2\u01ee\u01ef\7\ubcf6"+
		"\2\2\u01ef\u01f0\7\uc776\2\2\u01f0\u01f1\7\ub4de\2\2\u01f1b\3\2\2\2\u01f2"+
		"\u01f3\7\ubcfe\2\2\u01f3\u01f4\7\ub7ee\2\2\u01f4\u01f5\7\ud2fa\2\2\u01f5"+
		"d\3\2\2\2\u01f6\u01f7\7\uc642\2\2\u01f7\u01f8\7\uc77e\2\2\u01f8f\3\2\2"+
		"\2\u01f9\u01fe\5i\65\2\u01fa\u01fe\5k\66\2\u01fb\u01fe\5m\67\2\u01fc\u01fe"+
		"\5o8\2\u01fd\u01f9\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fc\3\2\2\2\u01feh\3\2\2\2\u01ff\u0201\5s:\2\u0200\u0202\5q9\2\u0201"+
		"\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202j\3\2\2\2\u0203\u0205\5\u0081"+
		"A\2\u0204\u0206\5q9\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206l\3"+
		"\2\2\2\u0207\u0209\5\u008bF\2\u0208\u020a\5q9\2\u0209\u0208\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020an\3\2\2\2\u020b\u020d\5\u0095K\2\u020c\u020e\5q9\2"+
		"\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020ep\3\2\2\2\u020f\u0210\t"+
		"\2\2\2\u0210r\3\2\2\2\u0211\u021c\7\62\2\2\u0212\u0219\5y=\2\u0213\u0215"+
		"\5u;\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u021a\3\2\2\2\u0216"+
		"\u0217\5\177@\2\u0217\u0218\5u;\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2"+
		"\2\2\u0219\u0216\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u0211\3\2\2\2\u021b"+
		"\u0212\3\2\2\2\u021ct\3\2\2\2\u021d\u0222\5w<\2\u021e\u0220\5{>\2\u021f"+
		"\u021e\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223\5w"+
		"<\2\u0222\u021f\3\2\2\2\u0222\u0223\3\2\2\2\u0223v\3\2\2\2\u0224\u0227"+
		"\7\62\2\2\u0225\u0227\5y=\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227"+
		"x\3\2\2\2\u0228\u0229\t\3\2\2\u0229z\3\2\2\2\u022a\u022c\5}?\2\u022b\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"|\3\2\2\2\u022f\u0232\5w<\2\u0230\u0232\7a\2\2\u0231\u022f\3\2\2\2\u0231"+
		"\u0230\3\2\2\2\u0232~\3\2\2\2\u0233\u0235\7a\2\2\u0234\u0233\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0080\3\2"+
		"\2\2\u0238\u0239\7\62\2\2\u0239\u023a\t\4\2\2\u023a\u023b\5\u0083B\2\u023b"+
		"\u0082\3\2\2\2\u023c\u0241\5\u0085C\2\u023d\u023f\5\u0087D\2\u023e\u023d"+
		"\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\5\u0085C"+
		"\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0084\3\2\2\2\u0243\u0244"+
		"\t\5\2\2\u0244\u0086\3\2\2\2\u0245\u0247\5\u0089E\2\u0246\u0245\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0088"+
		"\3\2\2\2\u024a\u024d\5\u0085C\2\u024b\u024d\7a\2\2\u024c\u024a\3\2\2\2"+
		"\u024c\u024b\3\2\2\2\u024d\u008a\3\2\2\2\u024e\u0250\7\62\2\2\u024f\u0251"+
		"\5\177@\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2"+
		"\u0252\u0253\5\u008dG\2\u0253\u008c\3\2\2\2\u0254\u0259\5\u008fH\2\u0255"+
		"\u0257\5\u0091I\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u025a\5\u008fH\2\u0259\u0256\3\2\2\2\u0259\u025a\3\2\2"+
		"\2\u025a\u008e\3\2\2\2\u025b\u025c\t\6\2\2\u025c\u0090\3\2\2\2\u025d\u025f"+
		"\5\u0093J\2\u025e\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u025e\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0092\3\2\2\2\u0262\u0265\5\u008fH\2\u0263"+
		"\u0265\7a\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265\u0094\3\2"+
		"\2\2\u0266\u0267\7\62\2\2\u0267\u0268\t\7\2\2\u0268\u0269\5\u0097L\2\u0269"+
		"\u0096\3\2\2\2\u026a\u026f\5\u0099M\2\u026b\u026d\5\u009bN\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\5\u0099M"+
		"\2\u026f\u026c\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0098\3\2\2\2\u0271\u0272"+
		"\t\b\2\2\u0272\u009a\3\2\2\2\u0273\u0275\5\u009dO\2\u0274\u0273\3\2\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u009c"+
		"\3\2\2\2\u0278\u027b\5\u0099M\2\u0279\u027b\7a\2\2\u027a\u0278\3\2\2\2"+
		"\u027a\u0279\3\2\2\2\u027b\u009e\3\2\2\2\u027c\u027f\5\u00a1Q\2\u027d"+
		"\u027f\5\u00adW\2\u027e\u027c\3\2\2\2\u027e\u027d\3\2\2\2\u027f\u00a0"+
		"\3\2\2\2\u0280\u0281\5u;\2\u0281\u0283\7\60\2\2\u0282\u0284\5u;\2\u0283"+
		"\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0286\3\2\2\2\u0285\u0287\5\u00a3"+
		"R\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288"+
		"\u028a\5\u00abV\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u029c"+
		"\3\2\2\2\u028b\u028c\7\60\2\2\u028c\u028e\5u;\2\u028d\u028f\5\u00a3R\2"+
		"\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u0292"+
		"\5\u00abV\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u029c\3\2\2"+
		"\2\u0293\u0294\5u;\2\u0294\u0296\5\u00a3R\2\u0295\u0297\5\u00abV\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029c\3\2\2\2\u0298\u0299\5u"+
		";\2\u0299\u029a\5\u00abV\2\u029a\u029c\3\2\2\2\u029b\u0280\3\2\2\2\u029b"+
		"\u028b\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0298\3\2\2\2\u029c\u00a2\3\2"+
		"\2\2\u029d\u029e\5\u00a5S\2\u029e\u029f\5\u00a7T\2\u029f\u00a4\3\2\2\2"+
		"\u02a0\u02a1\t\t\2\2\u02a1\u00a6\3\2\2\2\u02a2\u02a4\5\u00a9U\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\5u"+
		";\2\u02a6\u00a8\3\2\2\2\u02a7\u02a8\t\n\2\2\u02a8\u00aa\3\2\2\2\u02a9"+
		"\u02aa\t\13\2\2\u02aa\u00ac\3\2\2\2\u02ab\u02ac\5\u00afX\2\u02ac\u02ae"+
		"\5\u00b1Y\2\u02ad\u02af\5\u00abV\2\u02ae\u02ad\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u00ae\3\2\2\2\u02b0\u02b2\5\u0081A\2\u02b1\u02b3\7\60\2\2\u02b2"+
		"\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02bc\3\2\2\2\u02b4\u02b5\7\62"+
		"\2\2\u02b5\u02b7\t\4\2\2\u02b6\u02b8\5\u0083B\2\u02b7\u02b6\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\7\60\2\2\u02ba\u02bc\5"+
		"\u0083B\2\u02bb\u02b0\3\2\2\2\u02bb\u02b4\3\2\2\2\u02bc\u00b0\3\2\2\2"+
		"\u02bd\u02be\5\u00b3Z\2\u02be\u02bf\5\u00a7T\2\u02bf\u00b2\3\2\2\2\u02c0"+
		"\u02c1\t\f\2\2\u02c1\u00b4\3\2\2\2\u02c2\u02c3\7v\2\2\u02c3\u02c4\7t\2"+
		"\2\u02c4\u02c5\7w\2\2\u02c5\u02cc\7g\2\2\u02c6\u02c7\7h\2\2\u02c7\u02c8"+
		"\7c\2\2\u02c8\u02c9\7n\2\2\u02c9\u02ca\7u\2\2\u02ca\u02cc\7g\2\2\u02cb"+
		"\u02c2\3\2\2\2\u02cb\u02c6\3\2\2\2\u02cc\u00b6\3\2\2\2\u02cd\u02ce\7)"+
		"\2\2\u02ce\u02cf\5\u00b9]\2\u02cf\u02d0\7)\2\2\u02d0\u02d6\3\2\2\2\u02d1"+
		"\u02d2\7)\2\2\u02d2\u02d3\5\u00c1a\2\u02d3\u02d4\7)\2\2\u02d4\u02d6\3"+
		"\2\2\2\u02d5\u02cd\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6\u00b8\3\2\2\2\u02d7"+
		"\u02d8\n\r\2\2\u02d8\u00ba\3\2\2\2\u02d9\u02db\7$\2\2\u02da\u02dc\5\u00bd"+
		"_\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\7$\2\2\u02de\u00bc\3\2\2\2\u02df\u02e1\5\u00bf`\2\u02e0\u02df\3"+
		"\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u00be\3\2\2\2\u02e4\u02e7\n\16\2\2\u02e5\u02e7\5\u00c1a\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u00c0\3\2\2\2\u02e8\u02e9\7^\2\2\u02e9"+
		"\u02ed\t\17\2\2\u02ea\u02ed\5\u00c3b\2\u02eb\u02ed\5\u00c7d\2\u02ec\u02e8"+
		"\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02eb\3\2\2\2\u02ed\u00c2\3\2\2\2\u02ee"+
		"\u02ef\7^\2\2\u02ef\u02fa\5\u008fH\2\u02f0\u02f1\7^\2\2\u02f1\u02f2\5"+
		"\u008fH\2\u02f2\u02f3\5\u008fH\2\u02f3\u02fa\3\2\2\2\u02f4\u02f5\7^\2"+
		"\2\u02f5\u02f6\5\u00c5c\2\u02f6\u02f7\5\u008fH\2\u02f7\u02f8\5\u008fH"+
		"\2\u02f8\u02fa\3\2\2\2\u02f9\u02ee\3\2\2\2\u02f9\u02f0\3\2\2\2\u02f9\u02f4"+
		"\3\2\2\2\u02fa\u00c4\3\2\2\2\u02fb\u02fc\t\20\2\2\u02fc\u00c6\3\2\2\2"+
		"\u02fd\u02fe\7^\2\2\u02fe\u02ff\7w\2\2\u02ff\u0300\5\u0085C\2\u0300\u0301"+
		"\5\u0085C\2\u0301\u0302\5\u0085C\2\u0302\u0303\5\u0085C\2\u0303\u00c8"+
		"\3\2\2\2\u0304\u0305\7\ub112\2\2\u0305\u00ca\3\2\2\2\u0306\u0307\7*\2"+
		"\2\u0307\u00cc\3\2\2\2\u0308\u0309\7+\2\2\u0309\u00ce\3\2\2\2\u030a\u030b"+
		"\7}\2\2\u030b\u00d0\3\2\2\2\u030c\u030d\7\177\2\2\u030d\u00d2\3\2\2\2"+
		"\u030e\u030f\7]\2\2\u030f\u00d4\3\2\2\2\u0310\u0311\7_\2\2\u0311\u00d6"+
		"\3\2\2\2\u0312\u0313\7=\2\2\u0313\u00d8\3\2\2\2\u0314\u0315\7.\2\2\u0315"+
		"\u00da\3\2\2\2\u0316\u0317\7\60\2\2\u0317\u00dc\3\2\2\2\u0318\u0319\7"+
		"?\2\2\u0319\u00de\3\2\2\2\u031a\u031b\7@\2\2\u031b\u00e0\3\2\2\2\u031c"+
		"\u031d\7>\2\2\u031d\u00e2\3\2\2\2\u031e\u031f\7#\2\2\u031f\u00e4\3\2\2"+
		"\2\u0320\u0321\7\u0080\2\2\u0321\u00e6\3\2\2\2\u0322\u0323\7A\2\2\u0323"+
		"\u00e8\3\2\2\2\u0324\u0325\7<\2\2\u0325\u00ea\3\2\2\2\u0326\u0327\7?\2"+
		"\2\u0327\u0328\7?\2\2\u0328\u00ec\3\2\2\2\u0329\u032a\7>\2\2\u032a\u032b"+
		"\7?\2\2\u032b\u00ee\3\2\2\2\u032c\u032d\7@\2\2\u032d\u032e\7?\2\2\u032e"+
		"\u00f0\3\2\2\2\u032f\u0330\7#\2\2\u0330\u0331\7?\2\2\u0331\u00f2\3\2\2"+
		"\2\u0332\u0333\7(\2\2\u0333\u0334\7(\2\2\u0334\u00f4\3\2\2\2\u0335\u0336"+
		"\7~\2\2\u0336\u0337\7~\2\2\u0337\u00f6\3\2\2\2\u0338\u0339\7-\2\2\u0339"+
		"\u033a\7-\2\2\u033a\u00f8\3\2\2\2\u033b\u033c\7/\2\2\u033c\u033d\7/\2"+
		"\2\u033d\u00fa\3\2\2\2\u033e\u033f\7-\2\2\u033f\u00fc\3\2\2\2\u0340\u0341"+
		"\7/\2\2\u0341\u00fe\3\2\2\2\u0342\u0343\7,\2\2\u0343\u0100\3\2\2\2\u0344"+
		"\u0345\7\61\2\2\u0345\u0102\3\2\2\2\u0346\u0347\7(\2\2\u0347\u0104\3\2"+
		"\2\2\u0348\u0349\7~\2\2\u0349\u0106\3\2\2\2\u034a\u034b\7`\2\2\u034b\u0108"+
		"\3\2\2\2\u034c\u034d\7\'\2\2\u034d\u010a\3\2\2\2\u034e\u034f\7/\2\2\u034f"+
		"\u0350\7@\2\2\u0350\u010c\3\2\2\2\u0351\u0352\7<\2\2\u0352\u0353\7<\2"+
		"\2\u0353\u010e\3\2\2\2\u0354\u0355\7-\2\2\u0355\u0356\7?\2\2\u0356\u0110"+
		"\3\2\2\2\u0357\u0358\7/\2\2\u0358\u0359\7?\2\2\u0359\u0112\3\2\2\2\u035a"+
		"\u035b\7,\2\2\u035b\u035c\7?\2\2\u035c\u0114\3\2\2\2\u035d\u035e\7\61"+
		"\2\2\u035e\u035f\7?\2\2\u035f\u0116\3\2\2\2\u0360\u0361\7(\2\2\u0361\u0362"+
		"\7?\2\2\u0362\u0118\3\2\2\2\u0363\u0364\7~\2\2\u0364\u0365\7?\2\2\u0365"+
		"\u011a\3\2\2\2\u0366\u0367\7`\2\2\u0367\u0368\7?\2\2\u0368\u011c\3\2\2"+
		"\2\u0369\u036a\7\'\2\2\u036a\u036b\7?\2\2\u036b\u011e\3\2\2\2\u036c\u036d"+
		"\7>\2\2\u036d\u036e\7>\2\2\u036e\u036f\7?\2\2\u036f\u0120\3\2\2\2\u0370"+
		"\u0371\7@\2\2\u0371\u0372\7@\2\2\u0372\u0373\7?\2\2\u0373\u0122\3\2\2"+
		"\2\u0374\u0375\7@\2\2\u0375\u0376\7@\2\2\u0376\u0377\7@\2\2\u0377\u0378"+
		"\7?\2\2\u0378\u0124\3\2\2\2\u0379\u037d\5\u0127\u0094\2\u037a\u037c\5"+
		"\u0129\u0095\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2"+
		"\2\2\u037d\u037e\3\2\2\2\u037e\u0126\3\2\2\2\u037f\u037d\3\2\2\2\u0380"+
		"\u0387\t\21\2\2\u0381\u0382\n\22\2\2\u0382\u0387\6\u0094\2\2\u0383\u0384"+
		"\t\23\2\2\u0384\u0385\t\24\2\2\u0385\u0387\6\u0094\3\2\u0386\u0380\3\2"+
		"\2\2\u0386\u0381\3\2\2\2\u0386\u0383\3\2\2\2\u0387\u0128\3\2\2\2\u0388"+
		"\u038f\t\25\2\2\u0389\u038a\n\22\2\2\u038a\u038f\6\u0095\4\2\u038b\u038c"+
		"\t\23\2\2\u038c\u038d\t\24\2\2\u038d\u038f\6\u0095\5\2\u038e\u0388\3\2"+
		"\2\2\u038e\u0389\3\2\2\2\u038e\u038b\3\2\2\2\u038f\u012a\3\2\2\2\u0390"+
		"\u0391\7B\2\2\u0391\u012c\3\2\2\2\u0392\u0393\7\60\2\2\u0393\u0394\7\60"+
		"\2\2\u0394\u0395\7\60\2\2\u0395\u012e\3\2\2\2\u0396\u0398\t\26\2\2\u0397"+
		"\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2"+
		"\2\2\u039a\u039b\3\2\2\2\u039b\u039c\b\u0098\2\2\u039c\u0130\3\2\2\2\u039d"+
		"\u039e\7\61\2\2\u039e\u039f\7,\2\2\u039f\u03a3\3\2\2\2\u03a0\u03a2\13"+
		"\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a7\7,"+
		"\2\2\u03a7\u03a8\7\61\2\2\u03a8\u03a9\3\2\2\2\u03a9\u03aa\b\u0099\2\2"+
		"\u03aa\u0132\3\2\2\2\u03ab\u03ac\7\61\2\2\u03ac\u03ad\7\61\2\2\u03ad\u03b1"+
		"\3\2\2\2\u03ae\u03b0\n\27\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2"+
		"\u03b1\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b1"+
		"\3\2\2\2\u03b4\u03b5\b\u009a\2\2\u03b5\u0134\3\2\2\28\2\u01fd\u0201\u0205"+
		"\u0209\u020d\u0214\u0219\u021b\u021f\u0222\u0226\u022d\u0231\u0236\u023e"+
		"\u0241\u0248\u024c\u0250\u0256\u0259\u0260\u0264\u026c\u026f\u0276\u027a"+
		"\u027e\u0283\u0286\u0289\u028e\u0291\u0296\u029b\u02a3\u02ae\u02b2\u02b7"+
		"\u02bb\u02cb\u02d5\u02db\u02e2\u02e6\u02ec\u02f9\u037d\u0386\u038e\u0399"+
		"\u03a3\u03b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}