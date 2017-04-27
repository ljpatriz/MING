package model.reading;
// Generated from mipsgrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mipsgrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REGISTER=1, INT=2, ADD=3, ADDI=4, ADDIU=5, ADDU=6, AND=7, ANDI=8, BEQ=9, 
		BGEZ=10, BGTZ=11, BLEZ=12, BLTZ=13, BNE=14, BREAK=15, CLO=16, CLZ=17, 
		DIV=18, DIVU=19, J=20, JAL=21, JALR=22, JR=23, LB=24, LBU=25, LH=26, LHU=27, 
		LW=28, MOVN=29, MOVZ=30, MUL=31, MULT=32, NOP=33, NOR=34, OR=35, SB=36, 
		SUB=37, SUBU=38, SW=39, SYSCALL=40, XOR=41, XORI=42, ORI=43, SEP=44, SPACE=45, 
		COMMA=46, LABEL=47, WS=48, LPAREN=49, RPAREN=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"REGISTER", "INT", "ADD", "ADDI", "ADDIU", "ADDU", "AND", "ANDI", "BEQ", 
		"BGEZ", "BGTZ", "BLEZ", "BLTZ", "BNE", "BREAK", "CLO", "CLZ", "DIV", "DIVU", 
		"J", "JAL", "JALR", "JR", "LB", "LBU", "LH", "LHU", "LW", "MOVN", "MOVZ", 
		"MUL", "MULT", "NOP", "NOR", "OR", "SB", "SUB", "SUBU", "SW", "SYSCALL", 
		"XOR", "XORI", "ORI", "SEP", "SPACE", "COMMA", "LABEL", "WS", "LPAREN", 
		"RPAREN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'add'", "'addi'", "'addiu'", "'addu'", "'and'", "'andi'", 
		"'beq'", "'bgez'", "'bgtz'", "'blez'", "'bltz'", "'bne'", "'break'", "'clo'", 
		"'clz'", "'div'", "'divu'", "'j'", "'jal'", "'jalr'", "'jr'", "'lb'", 
		"'lbu'", "'lh'", "'lhu'", "'lw'", "'movn'", "'movz'", "'mul'", "'mult'", 
		"'nop'", "'nor'", "'or'", "'sb'", "'sub'", "'subu'", "'sw'", "'syscall'", 
		"'xor'", "'xori'", "'ori'", null, "' '", "','", null, null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "REGISTER", "INT", "ADD", "ADDI", "ADDIU", "ADDU", "AND", "ANDI", 
		"BEQ", "BGEZ", "BGTZ", "BLEZ", "BLTZ", "BNE", "BREAK", "CLO", "CLZ", "DIV", 
		"DIVU", "J", "JAL", "JALR", "JR", "LB", "LBU", "LH", "LHU", "LW", "MOVN", 
		"MOVZ", "MUL", "MULT", "NOP", "NOR", "OR", "SB", "SUB", "SUBU", "SW", 
		"SYSCALL", "XOR", "XORI", "ORI", "SEP", "SPACE", "COMMA", "LABEL", "WS", 
		"LPAREN", "RPAREN"
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


	public mipsgrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mipsgrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01ef\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0120\n\2\3\3\3\3\7\3\u0124\n\3\f"+
		"\3\16\3\u0127\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\6\60\u01e1\n\60\r\60\16\60\u01e2\3\61\6\61\u01e6\n\61\r\61"+
		"\16\61\u01e7\3\61\3\61\3\62\3\62\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\6\3\2\63;\3\2\62;\3\2\60\60\6\2"+
		"\13\f\17\17\"\"..\2\u0230\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u011f\3\2\2\2\5"+
		"\u0121\3\2\2\2\7\u0128\3\2\2\2\t\u012c\3\2\2\2\13\u0131\3\2\2\2\r\u0137"+
		"\3\2\2\2\17\u013c\3\2\2\2\21\u0140\3\2\2\2\23\u0145\3\2\2\2\25\u0149\3"+
		"\2\2\2\27\u014e\3\2\2\2\31\u0153\3\2\2\2\33\u0158\3\2\2\2\35\u015d\3\2"+
		"\2\2\37\u0161\3\2\2\2!\u0167\3\2\2\2#\u016b\3\2\2\2%\u016f\3\2\2\2\'\u0173"+
		"\3\2\2\2)\u0178\3\2\2\2+\u017a\3\2\2\2-\u017e\3\2\2\2/\u0183\3\2\2\2\61"+
		"\u0186\3\2\2\2\63\u0189\3\2\2\2\65\u018d\3\2\2\2\67\u0190\3\2\2\29\u0194"+
		"\3\2\2\2;\u0197\3\2\2\2=\u019c\3\2\2\2?\u01a1\3\2\2\2A\u01a5\3\2\2\2C"+
		"\u01aa\3\2\2\2E\u01ae\3\2\2\2G\u01b2\3\2\2\2I\u01b5\3\2\2\2K\u01b8\3\2"+
		"\2\2M\u01bc\3\2\2\2O\u01c1\3\2\2\2Q\u01c4\3\2\2\2S\u01cc\3\2\2\2U\u01d0"+
		"\3\2\2\2W\u01d5\3\2\2\2Y\u01d9\3\2\2\2[\u01db\3\2\2\2]\u01dd\3\2\2\2_"+
		"\u01e0\3\2\2\2a\u01e5\3\2\2\2c\u01eb\3\2\2\2e\u01ed\3\2\2\2gh\7&\2\2h"+
		"i\7|\2\2ij\7g\2\2jk\7t\2\2k\u0120\7q\2\2lm\7&\2\2mn\7c\2\2n\u0120\7v\2"+
		"\2op\7&\2\2pq\7x\2\2q\u0120\7\62\2\2rs\7&\2\2st\7x\2\2t\u0120\7\63\2\2"+
		"uv\7&\2\2vw\7c\2\2w\u0120\7\62\2\2xy\7&\2\2yz\7c\2\2z\u0120\7\63\2\2{"+
		"|\7&\2\2|}\7c\2\2}\u0120\7\64\2\2~\177\7&\2\2\177\u0080\7c\2\2\u0080\u0120"+
		"\7\65\2\2\u0081\u0082\7&\2\2\u0082\u0083\7v\2\2\u0083\u0120\7\62\2\2\u0084"+
		"\u0085\7&\2\2\u0085\u0086\7v\2\2\u0086\u0120\7\63\2\2\u0087\u0088\7&\2"+
		"\2\u0088\u0089\7v\2\2\u0089\u0120\7\64\2\2\u008a\u008b\7&\2\2\u008b\u008c"+
		"\7v\2\2\u008c\u0120\7\65\2\2\u008d\u008e\7&\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0120\7\66\2\2\u0090\u0091\7&\2\2\u0091\u0092\7v\2\2\u0092\u0120\7\67"+
		"\2\2\u0093\u0094\7&\2\2\u0094\u0095\7v\2\2\u0095\u0120\78\2\2\u0096\u0097"+
		"\7&\2\2\u0097\u0098\7v\2\2\u0098\u0120\79\2\2\u0099\u009a\7&\2\2\u009a"+
		"\u009b\7u\2\2\u009b\u0120\7\62\2\2\u009c\u009d\7&\2\2\u009d\u009e\7u\2"+
		"\2\u009e\u0120\7\63\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1\7u\2\2\u00a1\u0120"+
		"\7\64\2\2\u00a2\u00a3\7&\2\2\u00a3\u00a4\7u\2\2\u00a4\u0120\7\65\2\2\u00a5"+
		"\u00a6\7&\2\2\u00a6\u00a7\7u\2\2\u00a7\u0120\7\66\2\2\u00a8\u00a9\7&\2"+
		"\2\u00a9\u00aa\7u\2\2\u00aa\u0120\7\67\2\2\u00ab\u00ac\7&\2\2\u00ac\u00ad"+
		"\7u\2\2\u00ad\u0120\78\2\2\u00ae\u00af\7&\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\u0120\79\2\2\u00b1\u00b2\7&\2\2\u00b2\u00b3\7v\2\2\u00b3\u0120\7:\2\2"+
		"\u00b4\u00b5\7&\2\2\u00b5\u00b6\7v\2\2\u00b6\u0120\7;\2\2\u00b7\u00b8"+
		"\7&\2\2\u00b8\u00b9\7m\2\2\u00b9\u0120\7\62\2\2\u00ba\u00bb\7&\2\2\u00bb"+
		"\u00bc\7m\2\2\u00bc\u0120\7\63\2\2\u00bd\u00be\7&\2\2\u00be\u00bf\7i\2"+
		"\2\u00bf\u0120\7r\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c2\7u\2\2\u00c2\u0120"+
		"\7r\2\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\7h\2\2\u00c5\u0120\7r\2\2\u00c6"+
		"\u00c7\7&\2\2\u00c7\u00c8\7t\2\2\u00c8\u0120\7c\2\2\u00c9\u00ca\7&\2\2"+
		"\u00ca\u0120\7\62\2\2\u00cb\u00cc\7&\2\2\u00cc\u0120\7\63\2\2\u00cd\u00ce"+
		"\7&\2\2\u00ce\u0120\7\64\2\2\u00cf\u00d0\7&\2\2\u00d0\u0120\7\65\2\2\u00d1"+
		"\u00d2\7&\2\2\u00d2\u0120\7\66\2\2\u00d3\u00d4\7&\2\2\u00d4\u0120\7\67"+
		"\2\2\u00d5\u00d6\7&\2\2\u00d6\u0120\78\2\2\u00d7\u00d8\7&\2\2\u00d8\u0120"+
		"\79\2\2\u00d9\u00da\7&\2\2\u00da\u0120\7:\2\2\u00db\u00dc\7&\2\2\u00dc"+
		"\u0120\7;\2\2\u00dd\u00de\7&\2\2\u00de\u00df\7\63\2\2\u00df\u0120\7\62"+
		"\2\2\u00e0\u00e1\7&\2\2\u00e1\u00e2\7\63\2\2\u00e2\u0120\7\63\2\2\u00e3"+
		"\u00e4\7&\2\2\u00e4\u00e5\7\63\2\2\u00e5\u0120\7\64\2\2\u00e6\u00e7\7"+
		"&\2\2\u00e7\u00e8\7\63\2\2\u00e8\u0120\7\65\2\2\u00e9\u00ea\7&\2\2\u00ea"+
		"\u00eb\7\63\2\2\u00eb\u0120\7\66\2\2\u00ec\u00ed\7&\2\2\u00ed\u00ee\7"+
		"\63\2\2\u00ee\u0120\7\67\2\2\u00ef\u00f0\7&\2\2\u00f0\u00f1\7\63\2\2\u00f1"+
		"\u0120\78\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\7\63\2\2\u00f4\u0120\79\2"+
		"\2\u00f5\u00f6\7&\2\2\u00f6\u00f7\7\63\2\2\u00f7\u0120\7:\2\2\u00f8\u00f9"+
		"\7&\2\2\u00f9\u00fa\7\63\2\2\u00fa\u0120\7;\2\2\u00fb\u00fc\7&\2\2\u00fc"+
		"\u00fd\7\64\2\2\u00fd\u0120\7\62\2\2\u00fe\u00ff\7&\2\2\u00ff\u0100\7"+
		"\64\2\2\u0100\u0120\7\63\2\2\u0101\u0102\7&\2\2\u0102\u0103\7\64\2\2\u0103"+
		"\u0120\7\64\2\2\u0104\u0105\7&\2\2\u0105\u0106\7\64\2\2\u0106\u0120\7"+
		"\65\2\2\u0107\u0108\7&\2\2\u0108\u0109\7\64\2\2\u0109\u0120\7\66\2\2\u010a"+
		"\u010b\7&\2\2\u010b\u010c\7\64\2\2\u010c\u0120\7\67\2\2\u010d\u010e\7"+
		"&\2\2\u010e\u010f\7\64\2\2\u010f\u0120\78\2\2\u0110\u0111\7&\2\2\u0111"+
		"\u0112\7\64\2\2\u0112\u0120\79\2\2\u0113\u0114\7&\2\2\u0114\u0115\7\64"+
		"\2\2\u0115\u0120\7:\2\2\u0116\u0117\7&\2\2\u0117\u0118\7\64\2\2\u0118"+
		"\u0120\7;\2\2\u0119\u011a\7&\2\2\u011a\u011b\7\65\2\2\u011b\u0120\7\62"+
		"\2\2\u011c\u011d\7&\2\2\u011d\u011e\7\65\2\2\u011e\u0120\7\63\2\2\u011f"+
		"g\3\2\2\2\u011fl\3\2\2\2\u011fo\3\2\2\2\u011fr\3\2\2\2\u011fu\3\2\2\2"+
		"\u011fx\3\2\2\2\u011f{\3\2\2\2\u011f~\3\2\2\2\u011f\u0081\3\2\2\2\u011f"+
		"\u0084\3\2\2\2\u011f\u0087\3\2\2\2\u011f\u008a\3\2\2\2\u011f\u008d\3\2"+
		"\2\2\u011f\u0090\3\2\2\2\u011f\u0093\3\2\2\2\u011f\u0096\3\2\2\2\u011f"+
		"\u0099\3\2\2\2\u011f\u009c\3\2\2\2\u011f\u009f\3\2\2\2\u011f\u00a2\3\2"+
		"\2\2\u011f\u00a5\3\2\2\2\u011f\u00a8\3\2\2\2\u011f\u00ab\3\2\2\2\u011f"+
		"\u00ae\3\2\2\2\u011f\u00b1\3\2\2\2\u011f\u00b4\3\2\2\2\u011f\u00b7\3\2"+
		"\2\2\u011f\u00ba\3\2\2\2\u011f\u00bd\3\2\2\2\u011f\u00c0\3\2\2\2\u011f"+
		"\u00c3\3\2\2\2\u011f\u00c6\3\2\2\2\u011f\u00c9\3\2\2\2\u011f\u00cb\3\2"+
		"\2\2\u011f\u00cd\3\2\2\2\u011f\u00cf\3\2\2\2\u011f\u00d1\3\2\2\2\u011f"+
		"\u00d3\3\2\2\2\u011f\u00d5\3\2\2\2\u011f\u00d7\3\2\2\2\u011f\u00d9\3\2"+
		"\2\2\u011f\u00db\3\2\2\2\u011f\u00dd\3\2\2\2\u011f\u00e0\3\2\2\2\u011f"+
		"\u00e3\3\2\2\2\u011f\u00e6\3\2\2\2\u011f\u00e9\3\2\2\2\u011f\u00ec\3\2"+
		"\2\2\u011f\u00ef\3\2\2\2\u011f\u00f2\3\2\2\2\u011f\u00f5\3\2\2\2\u011f"+
		"\u00f8\3\2\2\2\u011f\u00fb\3\2\2\2\u011f\u00fe\3\2\2\2\u011f\u0101\3\2"+
		"\2\2\u011f\u0104\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u010a\3\2\2\2\u011f"+
		"\u010d\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0113\3\2\2\2\u011f\u0116\3\2"+
		"\2\2\u011f\u0119\3\2\2\2\u011f\u011c\3\2\2\2\u0120\4\3\2\2\2\u0121\u0125"+
		"\t\2\2\2\u0122\u0124\t\3\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\6\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u0129\7c\2\2\u0129\u012a\7f\2\2\u012a\u012b\7f\2\2\u012b\b\3\2"+
		"\2\2\u012c\u012d\7c\2\2\u012d\u012e\7f\2\2\u012e\u012f\7f\2\2\u012f\u0130"+
		"\7k\2\2\u0130\n\3\2\2\2\u0131\u0132\7c\2\2\u0132\u0133\7f\2\2\u0133\u0134"+
		"\7f\2\2\u0134\u0135\7k\2\2\u0135\u0136\7w\2\2\u0136\f\3\2\2\2\u0137\u0138"+
		"\7c\2\2\u0138\u0139\7f\2\2\u0139\u013a\7f\2\2\u013a\u013b\7w\2\2\u013b"+
		"\16\3\2\2\2\u013c\u013d\7c\2\2\u013d\u013e\7p\2\2\u013e\u013f\7f\2\2\u013f"+
		"\20\3\2\2\2\u0140\u0141\7c\2\2\u0141\u0142\7p\2\2\u0142\u0143\7f\2\2\u0143"+
		"\u0144\7k\2\2\u0144\22\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147\7g\2\2\u0147"+
		"\u0148\7s\2\2\u0148\24\3\2\2\2\u0149\u014a\7d\2\2\u014a\u014b\7i\2\2\u014b"+
		"\u014c\7g\2\2\u014c\u014d\7|\2\2\u014d\26\3\2\2\2\u014e\u014f\7d\2\2\u014f"+
		"\u0150\7i\2\2\u0150\u0151\7v\2\2\u0151\u0152\7|\2\2\u0152\30\3\2\2\2\u0153"+
		"\u0154\7d\2\2\u0154\u0155\7n\2\2\u0155\u0156\7g\2\2\u0156\u0157\7|\2\2"+
		"\u0157\32\3\2\2\2\u0158\u0159\7d\2\2\u0159\u015a\7n\2\2\u015a\u015b\7"+
		"v\2\2\u015b\u015c\7|\2\2\u015c\34\3\2\2\2\u015d\u015e\7d\2\2\u015e\u015f"+
		"\7p\2\2\u015f\u0160\7g\2\2\u0160\36\3\2\2\2\u0161\u0162\7d\2\2\u0162\u0163"+
		"\7t\2\2\u0163\u0164\7g\2\2\u0164\u0165\7c\2\2\u0165\u0166\7m\2\2\u0166"+
		" \3\2\2\2\u0167\u0168\7e\2\2\u0168\u0169\7n\2\2\u0169\u016a\7q\2\2\u016a"+
		"\"\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7n\2\2\u016d\u016e\7|\2\2\u016e"+
		"$\3\2\2\2\u016f\u0170\7f\2\2\u0170\u0171\7k\2\2\u0171\u0172\7x\2\2\u0172"+
		"&\3\2\2\2\u0173\u0174\7f\2\2\u0174\u0175\7k\2\2\u0175\u0176\7x\2\2\u0176"+
		"\u0177\7w\2\2\u0177(\3\2\2\2\u0178\u0179\7l\2\2\u0179*\3\2\2\2\u017a\u017b"+
		"\7l\2\2\u017b\u017c\7c\2\2\u017c\u017d\7n\2\2\u017d,\3\2\2\2\u017e\u017f"+
		"\7l\2\2\u017f\u0180\7c\2\2\u0180\u0181\7n\2\2\u0181\u0182\7t\2\2\u0182"+
		".\3\2\2\2\u0183\u0184\7l\2\2\u0184\u0185\7t\2\2\u0185\60\3\2\2\2\u0186"+
		"\u0187\7n\2\2\u0187\u0188\7d\2\2\u0188\62\3\2\2\2\u0189\u018a\7n\2\2\u018a"+
		"\u018b\7d\2\2\u018b\u018c\7w\2\2\u018c\64\3\2\2\2\u018d\u018e\7n\2\2\u018e"+
		"\u018f\7j\2\2\u018f\66\3\2\2\2\u0190\u0191\7n\2\2\u0191\u0192\7j\2\2\u0192"+
		"\u0193\7w\2\2\u01938\3\2\2\2\u0194\u0195\7n\2\2\u0195\u0196\7y\2\2\u0196"+
		":\3\2\2\2\u0197\u0198\7o\2\2\u0198\u0199\7q\2\2\u0199\u019a\7x\2\2\u019a"+
		"\u019b\7p\2\2\u019b<\3\2\2\2\u019c\u019d\7o\2\2\u019d\u019e\7q\2\2\u019e"+
		"\u019f\7x\2\2\u019f\u01a0\7|\2\2\u01a0>\3\2\2\2\u01a1\u01a2\7o\2\2\u01a2"+
		"\u01a3\7w\2\2\u01a3\u01a4\7n\2\2\u01a4@\3\2\2\2\u01a5\u01a6\7o\2\2\u01a6"+
		"\u01a7\7w\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9\7v\2\2\u01a9B\3\2\2\2\u01aa"+
		"\u01ab\7p\2\2\u01ab\u01ac\7q\2\2\u01ac\u01ad\7r\2\2\u01adD\3\2\2\2\u01ae"+
		"\u01af\7p\2\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7t\2\2\u01b1F\3\2\2\2\u01b2"+
		"\u01b3\7q\2\2\u01b3\u01b4\7t\2\2\u01b4H\3\2\2\2\u01b5\u01b6\7u\2\2\u01b6"+
		"\u01b7\7d\2\2\u01b7J\3\2\2\2\u01b8\u01b9\7u\2\2\u01b9\u01ba\7w\2\2\u01ba"+
		"\u01bb\7d\2\2\u01bbL\3\2\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7w\2\2\u01be"+
		"\u01bf\7d\2\2\u01bf\u01c0\7w\2\2\u01c0N\3\2\2\2\u01c1\u01c2\7u\2\2\u01c2"+
		"\u01c3\7y\2\2\u01c3P\3\2\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7{\2\2\u01c6"+
		"\u01c7\7u\2\2\u01c7\u01c8\7e\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7n\2\2"+
		"\u01ca\u01cb\7n\2\2\u01cbR\3\2\2\2\u01cc\u01cd\7z\2\2\u01cd\u01ce\7q\2"+
		"\2\u01ce\u01cf\7t\2\2\u01cfT\3\2\2\2\u01d0\u01d1\7z\2\2\u01d1\u01d2\7"+
		"q\2\2\u01d2\u01d3\7t\2\2\u01d3\u01d4\7k\2\2\u01d4V\3\2\2\2\u01d5\u01d6"+
		"\7q\2\2\u01d6\u01d7\7t\2\2\u01d7\u01d8\7k\2\2\u01d8X\3\2\2\2\u01d9\u01da"+
		"\5a\61\2\u01daZ\3\2\2\2\u01db\u01dc\7\"\2\2\u01dc\\\3\2\2\2\u01dd\u01de"+
		"\7.\2\2\u01de^\3\2\2\2\u01df\u01e1\t\4\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3`\3\2\2\2\u01e4"+
		"\u01e6\t\5\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\b\61\2\2\u01ea"+
		"b\3\2\2\2\u01eb\u01ec\7*\2\2\u01ecd\3\2\2\2\u01ed\u01ee\7+\2\2\u01eef"+
		"\3\2\2\2\7\2\u011f\u0125\u01e2\u01e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}