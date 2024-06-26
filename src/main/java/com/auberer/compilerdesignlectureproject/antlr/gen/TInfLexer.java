// Generated from TInf.g4 by ANTLR 4.13.1
package com.auberer.compilerdesignlectureproject.antlr.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TInfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE_INT=1, TYPE_DOUBLE=2, TYPE_STRING=3, TYPE_EMPTY=4, IF=5, ELSE=6, 
		WHILE=7, DO=8, FOR=9, FUNC=10, CNUF=11, RETURN=12, SWITCH=13, CASE=14, 
		DEFAULT=15, CALL=16, PRINT=17, LBRACE=18, RBRACE=19, LPAREN=20, RPAREN=21, 
		COMMA=22, COLON=23, PLUS=24, MINUS=25, MUL=26, DIV=27, EQUAL=28, NOT_EQUAL=29, 
		LOGICAL_AND=30, LOGICAL_OR=31, SEMICOLON=32, ASSIGN=33, IDENTIFIER=34, 
		INT_LIT=35, DOUBLE_LIT=36, STRING_LIT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE_INT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_EMPTY", "IF", "ELSE", 
			"WHILE", "DO", "FOR", "FUNC", "CNUF", "RETURN", "SWITCH", "CASE", "DEFAULT", 
			"CALL", "PRINT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "COLON", 
			"PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", 
			"SEMICOLON", "ASSIGN", "IDENTIFIER", "INT_LIT", "DOUBLE_LIT", "STRING_LIT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'double'", "'string'", "'empty'", "'if'", "'else'", "'while'", 
			"'do'", "'for'", "'func'", "'cnuf'", "'return'", "'switch'", "'case'", 
			"'default'", "'call'", "'print'", "'{'", "'}'", "'('", "')'", "','", 
			"':'", "'+'", "'-'", "'*'", "'/'", "'=='", "'!='", "'&&'", "'||'", "';'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE_INT", "TYPE_DOUBLE", "TYPE_STRING", "TYPE_EMPTY", "IF", "ELSE", 
			"WHILE", "DO", "FOR", "FUNC", "CNUF", "RETURN", "SWITCH", "CASE", "DEFAULT", 
			"CALL", "PRINT", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "COMMA", "COLON", 
			"PLUS", "MINUS", "MUL", "DIV", "EQUAL", "NOT_EQUAL", "LOGICAL_AND", "LOGICAL_OR", 
			"SEMICOLON", "ASSIGN", "IDENTIFIER", "INT_LIT", "DOUBLE_LIT", "STRING_LIT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public TInfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TInf.g4"; }

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
		"\u0004\u0000&\u00fb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0005!\u00d1\b!\n!\f!\u00d4\t!\u0001\"\u0001\"\u0005\"\u00d8\b\"\n\""+
		"\f\"\u00db\t\"\u0001\"\u0003\"\u00de\b\"\u0001#\u0005#\u00e1\b#\n#\f#"+
		"\u00e4\t#\u0001#\u0001#\u0004#\u00e8\b#\u000b#\f#\u00e9\u0001$\u0001$"+
		"\u0005$\u00ee\b$\n$\f$\u00f1\t$\u0001$\u0001$\u0001%\u0004%\u00f6\b%\u000b"+
		"%\f%\u00f7\u0001%\u0001%\u0000\u0000&\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
		"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&\u0001\u0000\u0007\u0002\u0000__a"+
		"z\u0004\u000009AZ__az\u0001\u000019\u0001\u000009\u0001\u0000..\u0004"+
		"\u0000\n\n\r\r\"\"\\\\\u0003\u0000\t\n\r\r  \u0101\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0001"+
		"M\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005X\u0001"+
		"\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\te\u0001\u0000\u0000"+
		"\u0000\u000bh\u0001\u0000\u0000\u0000\rm\u0001\u0000\u0000\u0000\u000f"+
		"s\u0001\u0000\u0000\u0000\u0011v\u0001\u0000\u0000\u0000\u0013z\u0001"+
		"\u0000\u0000\u0000\u0015\u007f\u0001\u0000\u0000\u0000\u0017\u0084\u0001"+
		"\u0000\u0000\u0000\u0019\u008b\u0001\u0000\u0000\u0000\u001b\u0092\u0001"+
		"\u0000\u0000\u0000\u001d\u0097\u0001\u0000\u0000\u0000\u001f\u009f\u0001"+
		"\u0000\u0000\u0000!\u00a4\u0001\u0000\u0000\u0000#\u00aa\u0001\u0000\u0000"+
		"\u0000%\u00ac\u0001\u0000\u0000\u0000\'\u00ae\u0001\u0000\u0000\u0000"+
		")\u00b0\u0001\u0000\u0000\u0000+\u00b2\u0001\u0000\u0000\u0000-\u00b4"+
		"\u0001\u0000\u0000\u0000/\u00b6\u0001\u0000\u0000\u00001\u00b8\u0001\u0000"+
		"\u0000\u00003\u00ba\u0001\u0000\u0000\u00005\u00bc\u0001\u0000\u0000\u0000"+
		"7\u00be\u0001\u0000\u0000\u00009\u00c1\u0001\u0000\u0000\u0000;\u00c4"+
		"\u0001\u0000\u0000\u0000=\u00c7\u0001\u0000\u0000\u0000?\u00ca\u0001\u0000"+
		"\u0000\u0000A\u00cc\u0001\u0000\u0000\u0000C\u00ce\u0001\u0000\u0000\u0000"+
		"E\u00dd\u0001\u0000\u0000\u0000G\u00e2\u0001\u0000\u0000\u0000I\u00eb"+
		"\u0001\u0000\u0000\u0000K\u00f5\u0001\u0000\u0000\u0000MN\u0005i\u0000"+
		"\u0000NO\u0005n\u0000\u0000OP\u0005t\u0000\u0000P\u0002\u0001\u0000\u0000"+
		"\u0000QR\u0005d\u0000\u0000RS\u0005o\u0000\u0000ST\u0005u\u0000\u0000"+
		"TU\u0005b\u0000\u0000UV\u0005l\u0000\u0000VW\u0005e\u0000\u0000W\u0004"+
		"\u0001\u0000\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005"+
		"r\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005g\u0000"+
		"\u0000^\u0006\u0001\u0000\u0000\u0000_`\u0005e\u0000\u0000`a\u0005m\u0000"+
		"\u0000ab\u0005p\u0000\u0000bc\u0005t\u0000\u0000cd\u0005y\u0000\u0000"+
		"d\b\u0001\u0000\u0000\u0000ef\u0005i\u0000\u0000fg\u0005f\u0000\u0000"+
		"g\n\u0001\u0000\u0000\u0000hi\u0005e\u0000\u0000ij\u0005l\u0000\u0000"+
		"jk\u0005s\u0000\u0000kl\u0005e\u0000\u0000l\f\u0001\u0000\u0000\u0000"+
		"mn\u0005w\u0000\u0000no\u0005h\u0000\u0000op\u0005i\u0000\u0000pq\u0005"+
		"l\u0000\u0000qr\u0005e\u0000\u0000r\u000e\u0001\u0000\u0000\u0000st\u0005"+
		"d\u0000\u0000tu\u0005o\u0000\u0000u\u0010\u0001\u0000\u0000\u0000vw\u0005"+
		"f\u0000\u0000wx\u0005o\u0000\u0000xy\u0005r\u0000\u0000y\u0012\u0001\u0000"+
		"\u0000\u0000z{\u0005f\u0000\u0000{|\u0005u\u0000\u0000|}\u0005n\u0000"+
		"\u0000}~\u0005c\u0000\u0000~\u0014\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005c\u0000\u0000\u0080\u0081\u0005n\u0000\u0000\u0081\u0082\u0005u"+
		"\u0000\u0000\u0082\u0083\u0005f\u0000\u0000\u0083\u0016\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005r\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086"+
		"\u0087\u0005t\u0000\u0000\u0087\u0088\u0005u\u0000\u0000\u0088\u0089\u0005"+
		"r\u0000\u0000\u0089\u008a\u0005n\u0000\u0000\u008a\u0018\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005s\u0000\u0000\u008c\u008d\u0005w\u0000\u0000\u008d"+
		"\u008e\u0005i\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005"+
		"c\u0000\u0000\u0090\u0091\u0005h\u0000\u0000\u0091\u001a\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0005c\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094"+
		"\u0095\u0005s\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u001c\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005d\u0000\u0000\u0098\u0099\u0005e\u0000"+
		"\u0000\u0099\u009a\u0005f\u0000\u0000\u009a\u009b\u0005a\u0000\u0000\u009b"+
		"\u009c\u0005u\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005"+
		"t\u0000\u0000\u009e\u001e\u0001\u0000\u0000\u0000\u009f\u00a0\u0005c\u0000"+
		"\u0000\u00a0\u00a1\u0005a\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2"+
		"\u00a3\u0005l\u0000\u0000\u00a3 \u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"p\u0000\u0000\u00a5\u00a6\u0005r\u0000\u0000\u00a6\u00a7\u0005i\u0000"+
		"\u0000\u00a7\u00a8\u0005n\u0000\u0000\u00a8\u00a9\u0005t\u0000\u0000\u00a9"+
		"\"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005{\u0000\u0000\u00ab$\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005}\u0000\u0000\u00ad&\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005(\u0000\u0000\u00af(\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005)\u0000\u0000\u00b1*\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		",\u0000\u0000\u00b3,\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005:\u0000"+
		"\u0000\u00b5.\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005+\u0000\u0000\u00b7"+
		"0\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b92\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005*\u0000\u0000\u00bb4\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005/\u0000\u0000\u00bd6\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005=\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c08\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3\u0005=\u0000"+
		"\u0000\u00c3:\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005&\u0000\u0000\u00c5"+
		"\u00c6\u0005&\u0000\u0000\u00c6<\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"|\u0000\u0000\u00c8\u00c9\u0005|\u0000\u0000\u00c9>\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005;\u0000\u0000\u00cb@\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005=\u0000\u0000\u00cdB\u0001\u0000\u0000\u0000\u00ce\u00d2\u0007"+
		"\u0000\u0000\u0000\u00cf\u00d1\u0007\u0001\u0000\u0000\u00d0\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3D\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d9\u0007\u0002"+
		"\u0000\u0000\u00d6\u00d8\u0007\u0003\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u00050\u0000"+
		"\u0000\u00dd\u00d5\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000"+
		"\u0000\u00deF\u0001\u0000\u0000\u0000\u00df\u00e1\u0007\u0003\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0007\u0004\u0000\u0000\u00e6\u00e8\u0007\u0003\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000"+
		"\u00eaH\u0001\u0000\u0000\u0000\u00eb\u00ef\u0005\"\u0000\u0000\u00ec"+
		"\u00ee\b\u0005\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\"\u0000\u0000\u00f3J\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0007\u0006\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0006%\u0000\u0000\u00faL\u0001\u0000\u0000"+
		"\u0000\b\u0000\u00d2\u00d9\u00dd\u00e2\u00e9\u00ef\u00f7\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}