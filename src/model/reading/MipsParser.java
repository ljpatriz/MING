// Generated from Mips.g4 by ANTLR 4.7

package model.reading;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MipsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, REGISTER=2, INT=3, ADD=4, ADDI=5, ADDIU=6, ADDU=7, AND=8, ANDI=9, 
		BEQ=10, BGEZ=11, BGTZ=12, BLEZ=13, BLTZ=14, BNE=15, BREAK=16, CLO=17, 
		CLZ=18, DIV=19, DIVU=20, J=21, JAL=22, JALR=23, JR=24, LB=25, LBU=26, 
		LH=27, LHU=28, LI=29, LW=30, MOVE=31, MOVN=32, MOVZ=33, MUL=34, MULT=35, 
		NOP=36, NOR=37, OR=38, SB=39, SUB=40, SUBU=41, SW=42, SYSCALL=43, XOR=44, 
		XORI=45, ORI=46, LABEL=47, WS=48, LPAREN=49, RPAREN=50;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_command = 2, RULE_add = 3, RULE_addi = 4, 
		RULE_addiu = 5, RULE_addu = 6, RULE_and = 7, RULE_andi = 8, RULE_beq = 9, 
		RULE_bgez = 10, RULE_bgtz = 11, RULE_blez = 12, RULE_bltz = 13, RULE_bne = 14, 
		RULE_break_ = 15, RULE_clo = 16, RULE_clz = 17, RULE_div = 18, RULE_divu = 19, 
		RULE_j = 20, RULE_jal = 21, RULE_jalr = 22, RULE_jr = 23, RULE_lb = 24, 
		RULE_lbu = 25, RULE_lh = 26, RULE_lhu = 27, RULE_li = 28, RULE_lw = 29, 
		RULE_move = 30, RULE_movn = 31, RULE_movz = 32, RULE_mul = 33, RULE_mult = 34, 
		RULE_nop = 35, RULE_nor = 36, RULE_or = 37, RULE_sb = 38, RULE_sub = 39, 
		RULE_subu = 40, RULE_sw = 41, RULE_syscall = 42, RULE_xor = 43, RULE_xori = 44, 
		RULE_ori = 45, RULE_label = 46;
	public static final String[] ruleNames = {
		"program", "line", "command", "add", "addi", "addiu", "addu", "and", "andi", 
		"beq", "bgez", "bgtz", "blez", "bltz", "bne", "break_", "clo", "clz", 
		"div", "divu", "j", "jal", "jalr", "jr", "lb", "lbu", "lh", "lhu", "li", 
		"lw", "move", "movn", "movz", "mul", "mult", "nop", "nor", "or", "sb", 
		"sub", "subu", "sw", "syscall", "xor", "xori", "ori", "label"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", null, null, "'add'", "'addi'", "'addiu'", "'addu'", "'and'", 
		"'andi'", "'beq'", "'bgez'", "'bgtz'", "'blez'", "'bltz'", "'bne'", "'break'", 
		"'clo'", "'clz'", "'div'", "'divu'", "'j'", "'jal'", "'jalr'", "'jr'", 
		"'lb'", "'lbu'", "'lh'", "'lhu'", "'li'", "'lw'", "'move'", "'movn'", 
		"'movz'", "'mul'", "'mult'", "'nop'", "'nor'", "'or'", "'sb'", "'sub'", 
		"'subu'", "'sw'", "'syscall'", "'xor'", "'xori'", "'ori'", null, null, 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "REGISTER", "INT", "ADD", "ADDI", "ADDIU", "ADDU", "AND", 
		"ANDI", "BEQ", "BGEZ", "BGTZ", "BLEZ", "BLTZ", "BNE", "BREAK", "CLO", 
		"CLZ", "DIV", "DIVU", "J", "JAL", "JALR", "JR", "LB", "LBU", "LH", "LHU", 
		"LI", "LW", "MOVE", "MOVN", "MOVZ", "MUL", "MULT", "NOP", "NOR", "OR", 
		"SB", "SUB", "SUBU", "SW", "SYSCALL", "XOR", "XORI", "ORI", "LABEL", "WS", 
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

	@Override
	public String getGrammarFileName() { return "Mips.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MipsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				command();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADDI) | (1L << ADDIU) | (1L << ADDU) | (1L << AND) | (1L << ANDI) | (1L << BEQ) | (1L << BGEZ) | (1L << BGTZ) | (1L << BLEZ) | (1L << BLTZ) | (1L << BNE) | (1L << BREAK) | (1L << CLO) | (1L << CLZ) | (1L << DIV) | (1L << DIVU) | (1L << J) | (1L << JAL) | (1L << JALR) | (1L << JR) | (1L << LB) | (1L << LBU) | (1L << LH) | (1L << LHU) | (1L << LW) | (1L << MOVE) | (1L << MOVN) | (1L << MOVZ) | (1L << MUL) | (1L << MULT) | (1L << NOP) | (1L << NOR) | (1L << OR) | (1L << SB) | (1L << SUB) | (1L << SUBU) | (1L << SW) | (1L << SYSCALL) | (1L << XOR) | (1L << XORI) | (1L << ORI) | (1L << LABEL))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			command();
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

	public static class CommandContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public AddiContext addi() {
			return getRuleContext(AddiContext.class,0);
		}
		public AddiuContext addiu() {
			return getRuleContext(AddiuContext.class,0);
		}
		public AdduContext addu() {
			return getRuleContext(AdduContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndiContext andi() {
			return getRuleContext(AndiContext.class,0);
		}
		public BeqContext beq() {
			return getRuleContext(BeqContext.class,0);
		}
		public BgezContext bgez() {
			return getRuleContext(BgezContext.class,0);
		}
		public BgtzContext bgtz() {
			return getRuleContext(BgtzContext.class,0);
		}
		public BlezContext blez() {
			return getRuleContext(BlezContext.class,0);
		}
		public BltzContext bltz() {
			return getRuleContext(BltzContext.class,0);
		}
		public BneContext bne() {
			return getRuleContext(BneContext.class,0);
		}
		public Break_Context break_() {
			return getRuleContext(Break_Context.class,0);
		}
		public CloContext clo() {
			return getRuleContext(CloContext.class,0);
		}
		public ClzContext clz() {
			return getRuleContext(ClzContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public DivuContext divu() {
			return getRuleContext(DivuContext.class,0);
		}
		public JContext j() {
			return getRuleContext(JContext.class,0);
		}
		public JalContext jal() {
			return getRuleContext(JalContext.class,0);
		}
		public JalrContext jalr() {
			return getRuleContext(JalrContext.class,0);
		}
		public JrContext jr() {
			return getRuleContext(JrContext.class,0);
		}
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public LbuContext lbu() {
			return getRuleContext(LbuContext.class,0);
		}
		public LhContext lh() {
			return getRuleContext(LhContext.class,0);
		}
		public LhuContext lhu() {
			return getRuleContext(LhuContext.class,0);
		}
		public LwContext lw() {
			return getRuleContext(LwContext.class,0);
		}
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public MovnContext movn() {
			return getRuleContext(MovnContext.class,0);
		}
		public MovzContext movz() {
			return getRuleContext(MovzContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public NopContext nop() {
			return getRuleContext(NopContext.class,0);
		}
		public NorContext nor() {
			return getRuleContext(NorContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public SbContext sb() {
			return getRuleContext(SbContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public SubuContext subu() {
			return getRuleContext(SubuContext.class,0);
		}
		public SwContext sw() {
			return getRuleContext(SwContext.class,0);
		}
		public SyscallContext syscall() {
			return getRuleContext(SyscallContext.class,0);
		}
		public XorContext xor() {
			return getRuleContext(XorContext.class,0);
		}
		public XoriContext xori() {
			return getRuleContext(XoriContext.class,0);
		}
		public OriContext ori() {
			return getRuleContext(OriContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				{
				setState(101);
				add();
				}
				break;
			case ADDI:
				{
				setState(102);
				addi();
				}
				break;
			case ADDIU:
				{
				setState(103);
				addiu();
				}
				break;
			case ADDU:
				{
				setState(104);
				addu();
				}
				break;
			case AND:
				{
				setState(105);
				and();
				}
				break;
			case ANDI:
				{
				setState(106);
				andi();
				}
				break;
			case BEQ:
				{
				setState(107);
				beq();
				}
				break;
			case BGEZ:
				{
				setState(108);
				bgez();
				}
				break;
			case BGTZ:
				{
				setState(109);
				bgtz();
				}
				break;
			case BLEZ:
				{
				setState(110);
				blez();
				}
				break;
			case BLTZ:
				{
				setState(111);
				bltz();
				}
				break;
			case BNE:
				{
				setState(112);
				bne();
				}
				break;
			case BREAK:
				{
				setState(113);
				break_();
				}
				break;
			case CLO:
				{
				setState(114);
				clo();
				}
				break;
			case CLZ:
				{
				setState(115);
				clz();
				}
				break;
			case DIV:
				{
				setState(116);
				div();
				}
				break;
			case DIVU:
				{
				setState(117);
				divu();
				}
				break;
			case J:
				{
				setState(118);
				j();
				}
				break;
			case JAL:
				{
				setState(119);
				jal();
				}
				break;
			case JALR:
				{
				setState(120);
				jalr();
				}
				break;
			case JR:
				{
				setState(121);
				jr();
				}
				break;
			case LB:
				{
				setState(122);
				lb();
				}
				break;
			case LBU:
				{
				setState(123);
				lbu();
				}
				break;
			case LH:
				{
				setState(124);
				lh();
				}
				break;
			case LHU:
				{
				setState(125);
				lhu();
				}
				break;
			case LW:
				{
				setState(126);
				lw();
				}
				break;
			case MOVE:
				{
				setState(127);
				move();
				}
				break;
			case MOVN:
				{
				setState(128);
				movn();
				}
				break;
			case MOVZ:
				{
				setState(129);
				movz();
				}
				break;
			case MUL:
				{
				setState(130);
				mul();
				}
				break;
			case MULT:
				{
				setState(131);
				mult();
				}
				break;
			case NOP:
				{
				setState(132);
				nop();
				}
				break;
			case NOR:
				{
				setState(133);
				nor();
				}
				break;
			case OR:
				{
				setState(134);
				or();
				}
				break;
			case SB:
				{
				setState(135);
				sb();
				}
				break;
			case SUB:
				{
				setState(136);
				sub();
				}
				break;
			case SUBU:
				{
				setState(137);
				subu();
				}
				break;
			case SW:
				{
				setState(138);
				sw();
				}
				break;
			case SYSCALL:
				{
				setState(139);
				syscall();
				}
				break;
			case XOR:
				{
				setState(140);
				xor();
				}
				break;
			case XORI:
				{
				setState(141);
				xori();
				}
				break;
			case ORI:
				{
				setState(142);
				ori();
				}
				break;
			case LABEL:
				{
				setState(143);
				label();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MipsParser.ADD, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ADD);
			setState(147);
			match(REGISTER);
			setState(148);
			match(REGISTER);
			setState(149);
			match(REGISTER);
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

	public static class AddiContext extends ParserRuleContext {
		public TerminalNode ADDI() { return getToken(MipsParser.ADDI, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public AddiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAddi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAddi(this);
		}
	}

	public final AddiContext addi() throws RecognitionException {
		AddiContext _localctx = new AddiContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ADDI);
			setState(152);
			match(REGISTER);
			setState(153);
			match(REGISTER);
			setState(154);
			match(INT);
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

	public static class AddiuContext extends ParserRuleContext {
		public TerminalNode ADDIU() { return getToken(MipsParser.ADDIU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public AddiuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addiu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAddiu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAddiu(this);
		}
	}

	public final AddiuContext addiu() throws RecognitionException {
		AddiuContext _localctx = new AddiuContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addiu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ADDIU);
			setState(157);
			match(REGISTER);
			setState(158);
			match(REGISTER);
			setState(159);
			match(INT);
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

	public static class AdduContext extends ParserRuleContext {
		public TerminalNode ADDU() { return getToken(MipsParser.ADDU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public AdduContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAddu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAddu(this);
		}
	}

	public final AdduContext addu() throws RecognitionException {
		AdduContext _localctx = new AdduContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ADDU);
			setState(162);
			match(REGISTER);
			setState(163);
			match(REGISTER);
			setState(164);
			match(REGISTER);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MipsParser.AND, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(AND);
			setState(167);
			match(REGISTER);
			setState(168);
			match(REGISTER);
			setState(169);
			match(REGISTER);
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

	public static class AndiContext extends ParserRuleContext {
		public TerminalNode ANDI() { return getToken(MipsParser.ANDI, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public AndiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterAndi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitAndi(this);
		}
	}

	public final AndiContext andi() throws RecognitionException {
		AndiContext _localctx = new AndiContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_andi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ANDI);
			setState(172);
			match(REGISTER);
			setState(173);
			match(REGISTER);
			setState(174);
			match(INT);
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

	public static class BeqContext extends ParserRuleContext {
		public TerminalNode BEQ() { return getToken(MipsParser.BEQ, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBeq(this);
		}
	}

	public final BeqContext beq() throws RecognitionException {
		BeqContext _localctx = new BeqContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_beq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(BEQ);
			setState(177);
			match(REGISTER);
			setState(178);
			match(REGISTER);
			setState(179);
			match(LABEL);
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

	public static class BgezContext extends ParserRuleContext {
		public TerminalNode BGEZ() { return getToken(MipsParser.BGEZ, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BgezContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bgez; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBgez(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBgez(this);
		}
	}

	public final BgezContext bgez() throws RecognitionException {
		BgezContext _localctx = new BgezContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bgez);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(BGEZ);
			setState(182);
			match(REGISTER);
			setState(183);
			match(LABEL);
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

	public static class BgtzContext extends ParserRuleContext {
		public TerminalNode BGTZ() { return getToken(MipsParser.BGTZ, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BgtzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bgtz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBgtz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBgtz(this);
		}
	}

	public final BgtzContext bgtz() throws RecognitionException {
		BgtzContext _localctx = new BgtzContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bgtz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(BGTZ);
			setState(186);
			match(REGISTER);
			setState(187);
			match(LABEL);
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

	public static class BlezContext extends ParserRuleContext {
		public TerminalNode BLEZ() { return getToken(MipsParser.BLEZ, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BlezContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blez; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBlez(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBlez(this);
		}
	}

	public final BlezContext blez() throws RecognitionException {
		BlezContext _localctx = new BlezContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_blez);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(BLEZ);
			setState(190);
			match(REGISTER);
			setState(191);
			match(LABEL);
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

	public static class BltzContext extends ParserRuleContext {
		public TerminalNode BLTZ() { return getToken(MipsParser.BLTZ, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BltzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bltz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBltz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBltz(this);
		}
	}

	public final BltzContext bltz() throws RecognitionException {
		BltzContext _localctx = new BltzContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bltz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(BLTZ);
			setState(194);
			match(REGISTER);
			setState(195);
			match(LABEL);
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

	public static class BneContext extends ParserRuleContext {
		public TerminalNode BNE() { return getToken(MipsParser.BNE, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public BneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBne(this);
		}
	}

	public final BneContext bne() throws RecognitionException {
		BneContext _localctx = new BneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(BNE);
			setState(198);
			match(REGISTER);
			setState(199);
			match(REGISTER);
			setState(200);
			match(LABEL);
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

	public static class Break_Context extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MipsParser.BREAK, 0); }
		public Break_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterBreak_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitBreak_(this);
		}
	}

	public final Break_Context break_() throws RecognitionException {
		Break_Context _localctx = new Break_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_break_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(BREAK);
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

	public static class CloContext extends ParserRuleContext {
		public TerminalNode CLO() { return getToken(MipsParser.CLO, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public CloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterClo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitClo(this);
		}
	}

	public final CloContext clo() throws RecognitionException {
		CloContext _localctx = new CloContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_clo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(CLO);
			setState(205);
			match(REGISTER);
			setState(206);
			match(REGISTER);
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

	public static class ClzContext extends ParserRuleContext {
		public TerminalNode CLZ() { return getToken(MipsParser.CLZ, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public ClzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterClz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitClz(this);
		}
	}

	public final ClzContext clz() throws RecognitionException {
		ClzContext _localctx = new ClzContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(CLZ);
			setState(209);
			match(REGISTER);
			setState(210);
			match(REGISTER);
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

	public static class DivContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(MipsParser.DIV, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(DIV);
			setState(213);
			match(REGISTER);
			setState(214);
			match(REGISTER);
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

	public static class DivuContext extends ParserRuleContext {
		public TerminalNode DIVU() { return getToken(MipsParser.DIVU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public DivuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterDivu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitDivu(this);
		}
	}

	public final DivuContext divu() throws RecognitionException {
		DivuContext _localctx = new DivuContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_divu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(DIVU);
			setState(217);
			match(REGISTER);
			setState(218);
			match(REGISTER);
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

	public static class JContext extends ParserRuleContext {
		public TerminalNode J() { return getToken(MipsParser.J, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public JContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_j; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterJ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitJ(this);
		}
	}

	public final JContext j() throws RecognitionException {
		JContext _localctx = new JContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_j);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(J);
			setState(221);
			match(LABEL);
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

	public static class JalContext extends ParserRuleContext {
		public TerminalNode JAL() { return getToken(MipsParser.JAL, 0); }
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public JalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterJal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitJal(this);
		}
	}

	public final JalContext jal() throws RecognitionException {
		JalContext _localctx = new JalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(JAL);
			setState(224);
			match(LABEL);
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

	public static class JalrContext extends ParserRuleContext {
		public TerminalNode JALR() { return getToken(MipsParser.JALR, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public JalrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jalr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterJalr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitJalr(this);
		}
	}

	public final JalrContext jalr() throws RecognitionException {
		JalrContext _localctx = new JalrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jalr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(JALR);
			setState(227);
			match(REGISTER);
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

	public static class JrContext extends ParserRuleContext {
		public TerminalNode JR() { return getToken(MipsParser.JR, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public JrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterJr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitJr(this);
		}
	}

	public final JrContext jr() throws RecognitionException {
		JrContext _localctx = new JrContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(JR);
			setState(230);
			match(REGISTER);
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

	public static class LbContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(MipsParser.LB, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public LbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLb(this);
		}
	}

	public final LbContext lb() throws RecognitionException {
		LbContext _localctx = new LbContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LB);
			setState(233);
			match(REGISTER);
			setState(234);
			match(INT);
			setState(235);
			match(LPAREN);
			setState(236);
			match(REGISTER);
			setState(237);
			match(RPAREN);
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

	public static class LbuContext extends ParserRuleContext {
		public TerminalNode LBU() { return getToken(MipsParser.LBU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public LbuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLbu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLbu(this);
		}
	}

	public final LbuContext lbu() throws RecognitionException {
		LbuContext _localctx = new LbuContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lbu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LBU);
			setState(240);
			match(REGISTER);
			setState(241);
			match(INT);
			setState(242);
			match(LPAREN);
			setState(243);
			match(REGISTER);
			setState(244);
			match(RPAREN);
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

	public static class LhContext extends ParserRuleContext {
		public TerminalNode LH() { return getToken(MipsParser.LH, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public LhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLh(this);
		}
	}

	public final LhContext lh() throws RecognitionException {
		LhContext _localctx = new LhContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(LH);
			setState(247);
			match(REGISTER);
			setState(248);
			match(INT);
			setState(249);
			match(LPAREN);
			setState(250);
			match(REGISTER);
			setState(251);
			match(RPAREN);
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

	public static class LhuContext extends ParserRuleContext {
		public TerminalNode LHU() { return getToken(MipsParser.LHU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public LhuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLhu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLhu(this);
		}
	}

	public final LhuContext lhu() throws RecognitionException {
		LhuContext _localctx = new LhuContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lhu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LHU);
			setState(254);
			match(REGISTER);
			setState(255);
			match(INT);
			setState(256);
			match(LPAREN);
			setState(257);
			match(REGISTER);
			setState(258);
			match(RPAREN);
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

	public static class LiContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(MipsParser.LI, 0); }
		public TerminalNode REGISTER() { return getToken(MipsParser.REGISTER, 0); }
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public LiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_li; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLi(this);
		}
	}

	public final LiContext li() throws RecognitionException {
		LiContext _localctx = new LiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_li);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(LI);
			setState(261);
			match(REGISTER);
			setState(262);
			match(INT);
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

	public static class LwContext extends ParserRuleContext {
		public TerminalNode LW() { return getToken(MipsParser.LW, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public LwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLw(this);
		}
	}

	public final LwContext lw() throws RecognitionException {
		LwContext _localctx = new LwContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LW);
			setState(265);
			match(REGISTER);
			setState(266);
			match(INT);
			setState(267);
			match(LPAREN);
			setState(268);
			match(REGISTER);
			setState(269);
			match(RPAREN);
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(MipsParser.MOVE, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(MOVE);
			setState(272);
			match(REGISTER);
			setState(273);
			match(REGISTER);
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

	public static class MovnContext extends ParserRuleContext {
		public TerminalNode MOVN() { return getToken(MipsParser.MOVN, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public MovnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterMovn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitMovn(this);
		}
	}

	public final MovnContext movn() throws RecognitionException {
		MovnContext _localctx = new MovnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_movn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(MOVN);
			setState(276);
			match(REGISTER);
			setState(277);
			match(REGISTER);
			setState(278);
			match(REGISTER);
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

	public static class MovzContext extends ParserRuleContext {
		public TerminalNode MOVZ() { return getToken(MipsParser.MOVZ, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public MovzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterMovz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitMovz(this);
		}
	}

	public final MovzContext movz() throws RecognitionException {
		MovzContext _localctx = new MovzContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_movz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(MOVZ);
			setState(281);
			match(REGISTER);
			setState(282);
			match(REGISTER);
			setState(283);
			match(REGISTER);
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

	public static class MulContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(MipsParser.MUL, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(MUL);
			setState(286);
			match(REGISTER);
			setState(287);
			match(REGISTER);
			setState(288);
			match(REGISTER);
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(MipsParser.MULT, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(MULT);
			setState(291);
			match(REGISTER);
			setState(292);
			match(REGISTER);
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

	public static class NopContext extends ParserRuleContext {
		public TerminalNode NOP() { return getToken(MipsParser.NOP, 0); }
		public NopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterNop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitNop(this);
		}
	}

	public final NopContext nop() throws RecognitionException {
		NopContext _localctx = new NopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(NOP);
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

	public static class NorContext extends ParserRuleContext {
		public TerminalNode NOR() { return getToken(MipsParser.NOR, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public NorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterNor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitNor(this);
		}
	}

	public final NorContext nor() throws RecognitionException {
		NorContext _localctx = new NorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(NOR);
			setState(297);
			match(REGISTER);
			setState(298);
			match(REGISTER);
			setState(299);
			match(REGISTER);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MipsParser.OR, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(OR);
			setState(302);
			match(REGISTER);
			setState(303);
			match(REGISTER);
			setState(304);
			match(REGISTER);
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

	public static class SbContext extends ParserRuleContext {
		public TerminalNode SB() { return getToken(MipsParser.SB, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public SbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterSb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitSb(this);
		}
	}

	public final SbContext sb() throws RecognitionException {
		SbContext _localctx = new SbContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(SB);
			setState(307);
			match(REGISTER);
			setState(308);
			match(INT);
			setState(309);
			match(LPAREN);
			setState(310);
			match(REGISTER);
			setState(311);
			match(RPAREN);
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

	public static class SubContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(MipsParser.SUB, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(SUB);
			setState(314);
			match(REGISTER);
			setState(315);
			match(REGISTER);
			setState(316);
			match(REGISTER);
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

	public static class SubuContext extends ParserRuleContext {
		public TerminalNode SUBU() { return getToken(MipsParser.SUBU, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public SubuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterSubu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitSubu(this);
		}
	}

	public final SubuContext subu() throws RecognitionException {
		SubuContext _localctx = new SubuContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_subu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SUBU);
			setState(319);
			match(REGISTER);
			setState(320);
			match(REGISTER);
			setState(321);
			match(REGISTER);
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

	public static class SwContext extends ParserRuleContext {
		public TerminalNode SW() { return getToken(MipsParser.SW, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public TerminalNode LPAREN() { return getToken(MipsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MipsParser.RPAREN, 0); }
		public SwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterSw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitSw(this);
		}
	}

	public final SwContext sw() throws RecognitionException {
		SwContext _localctx = new SwContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(SW);
			setState(324);
			match(REGISTER);
			setState(325);
			match(INT);
			setState(326);
			match(LPAREN);
			setState(327);
			match(REGISTER);
			setState(328);
			match(RPAREN);
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

	public static class SyscallContext extends ParserRuleContext {
		public TerminalNode SYSCALL() { return getToken(MipsParser.SYSCALL, 0); }
		public SyscallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syscall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterSyscall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitSyscall(this);
		}
	}

	public final SyscallContext syscall() throws RecognitionException {
		SyscallContext _localctx = new SyscallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_syscall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(SYSCALL);
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

	public static class XorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(MipsParser.XOR, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public XorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitXor(this);
		}
	}

	public final XorContext xor() throws RecognitionException {
		XorContext _localctx = new XorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(XOR);
			setState(333);
			match(REGISTER);
			setState(334);
			match(REGISTER);
			setState(335);
			match(REGISTER);
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

	public static class XoriContext extends ParserRuleContext {
		public TerminalNode XORI() { return getToken(MipsParser.XORI, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public XoriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterXori(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitXori(this);
		}
	}

	public final XoriContext xori() throws RecognitionException {
		XoriContext _localctx = new XoriContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_xori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(XORI);
			setState(338);
			match(REGISTER);
			setState(339);
			match(REGISTER);
			setState(340);
			match(INT);
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

	public static class OriContext extends ParserRuleContext {
		public TerminalNode ORI() { return getToken(MipsParser.ORI, 0); }
		public List<TerminalNode> REGISTER() { return getTokens(MipsParser.REGISTER); }
		public TerminalNode REGISTER(int i) {
			return getToken(MipsParser.REGISTER, i);
		}
		public TerminalNode INT() { return getToken(MipsParser.INT, 0); }
		public OriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ori; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterOri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitOri(this);
		}
	}

	public final OriContext ori() throws RecognitionException {
		OriContext _localctx = new OriContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ori);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ORI);
			setState(343);
			match(REGISTER);
			setState(344);
			match(REGISTER);
			setState(345);
			match(INT);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(MipsParser.LABEL, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MipsListener ) ((MipsListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(LABEL);
			setState(348);
			match(T__0);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0161\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16\2c\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$"+
		"\3$\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\2\2\61\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\2"+
		"\2\u015c\2a\3\2\2\2\4e\3\2\2\2\6\u0092\3\2\2\2\b\u0094\3\2\2\2\n\u0099"+
		"\3\2\2\2\f\u009e\3\2\2\2\16\u00a3\3\2\2\2\20\u00a8\3\2\2\2\22\u00ad\3"+
		"\2\2\2\24\u00b2\3\2\2\2\26\u00b7\3\2\2\2\30\u00bb\3\2\2\2\32\u00bf\3\2"+
		"\2\2\34\u00c3\3\2\2\2\36\u00c7\3\2\2\2 \u00cc\3\2\2\2\"\u00ce\3\2\2\2"+
		"$\u00d2\3\2\2\2&\u00d6\3\2\2\2(\u00da\3\2\2\2*\u00de\3\2\2\2,\u00e1\3"+
		"\2\2\2.\u00e4\3\2\2\2\60\u00e7\3\2\2\2\62\u00ea\3\2\2\2\64\u00f1\3\2\2"+
		"\2\66\u00f8\3\2\2\28\u00ff\3\2\2\2:\u0106\3\2\2\2<\u010a\3\2\2\2>\u0111"+
		"\3\2\2\2@\u0115\3\2\2\2B\u011a\3\2\2\2D\u011f\3\2\2\2F\u0124\3\2\2\2H"+
		"\u0128\3\2\2\2J\u012a\3\2\2\2L\u012f\3\2\2\2N\u0134\3\2\2\2P\u013b\3\2"+
		"\2\2R\u0140\3\2\2\2T\u0145\3\2\2\2V\u014c\3\2\2\2X\u014e\3\2\2\2Z\u0153"+
		"\3\2\2\2\\\u0158\3\2\2\2^\u015d\3\2\2\2`b\5\6\4\2a`\3\2\2\2bc\3\2\2\2"+
		"ca\3\2\2\2cd\3\2\2\2d\3\3\2\2\2ef\5\6\4\2f\5\3\2\2\2g\u0093\5\b\5\2h\u0093"+
		"\5\n\6\2i\u0093\5\f\7\2j\u0093\5\16\b\2k\u0093\5\20\t\2l\u0093\5\22\n"+
		"\2m\u0093\5\24\13\2n\u0093\5\26\f\2o\u0093\5\30\r\2p\u0093\5\32\16\2q"+
		"\u0093\5\34\17\2r\u0093\5\36\20\2s\u0093\5 \21\2t\u0093\5\"\22\2u\u0093"+
		"\5$\23\2v\u0093\5&\24\2w\u0093\5(\25\2x\u0093\5*\26\2y\u0093\5,\27\2z"+
		"\u0093\5.\30\2{\u0093\5\60\31\2|\u0093\5\62\32\2}\u0093\5\64\33\2~\u0093"+
		"\5\66\34\2\177\u0093\58\35\2\u0080\u0093\5<\37\2\u0081\u0093\5> \2\u0082"+
		"\u0093\5@!\2\u0083\u0093\5B\"\2\u0084\u0093\5D#\2\u0085\u0093\5F$\2\u0086"+
		"\u0093\5H%\2\u0087\u0093\5J&\2\u0088\u0093\5L\'\2\u0089\u0093\5N(\2\u008a"+
		"\u0093\5P)\2\u008b\u0093\5R*\2\u008c\u0093\5T+\2\u008d\u0093\5V,\2\u008e"+
		"\u0093\5X-\2\u008f\u0093\5Z.\2\u0090\u0093\5\\/\2\u0091\u0093\5^\60\2"+
		"\u0092g\3\2\2\2\u0092h\3\2\2\2\u0092i\3\2\2\2\u0092j\3\2\2\2\u0092k\3"+
		"\2\2\2\u0092l\3\2\2\2\u0092m\3\2\2\2\u0092n\3\2\2\2\u0092o\3\2\2\2\u0092"+
		"p\3\2\2\2\u0092q\3\2\2\2\u0092r\3\2\2\2\u0092s\3\2\2\2\u0092t\3\2\2\2"+
		"\u0092u\3\2\2\2\u0092v\3\2\2\2\u0092w\3\2\2\2\u0092x\3\2\2\2\u0092y\3"+
		"\2\2\2\u0092z\3\2\2\2\u0092{\3\2\2\2\u0092|\3\2\2\2\u0092}\3\2\2\2\u0092"+
		"~\3\2\2\2\u0092\177\3\2\2\2\u0092\u0080\3\2\2\2\u0092\u0081\3\2\2\2\u0092"+
		"\u0082\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0085\3\2"+
		"\2\2\u0092\u0086\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u0088\3\2\2\2\u0092"+
		"\u0089\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3\2"+
		"\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\7\3\2\2\2\u0094\u0095\7\6\2\2"+
		"\u0095\u0096\7\4\2\2\u0096\u0097\7\4\2\2\u0097\u0098\7\4\2\2\u0098\t\3"+
		"\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\7\4\2\2\u009b\u009c\7\4\2\2\u009c"+
		"\u009d\7\5\2\2\u009d\13\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7\4\2"+
		"\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\7\5\2\2\u00a2\r\3\2\2\2\u00a3\u00a4"+
		"\7\t\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\7\4\2\2\u00a7"+
		"\17\3\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\7\4\2"+
		"\2\u00ab\u00ac\7\4\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af"+
		"\7\4\2\2\u00af\u00b0\7\4\2\2\u00b0\u00b1\7\5\2\2\u00b1\23\3\2\2\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\7\61"+
		"\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba"+
		"\7\61\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\7\4\2\2\u00bd"+
		"\u00be\7\61\2\2\u00be\31\3\2\2\2\u00bf\u00c0\7\17\2\2\u00c0\u00c1\7\4"+
		"\2\2\u00c1\u00c2\7\61\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\7\20\2\2\u00c4"+
		"\u00c5\7\4\2\2\u00c5\u00c6\7\61\2\2\u00c6\35\3\2\2\2\u00c7\u00c8\7\21"+
		"\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\7\61\2\2\u00cb"+
		"\37\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf"+
		"\u00d0\7\4\2\2\u00d0\u00d1\7\4\2\2\u00d1#\3\2\2\2\u00d2\u00d3\7\24\2\2"+
		"\u00d3\u00d4\7\4\2\2\u00d4\u00d5\7\4\2\2\u00d5%\3\2\2\2\u00d6\u00d7\7"+
		"\25\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\7\4\2\2\u00d9\'\3\2\2\2\u00da"+
		"\u00db\7\26\2\2\u00db\u00dc\7\4\2\2\u00dc\u00dd\7\4\2\2\u00dd)\3\2\2\2"+
		"\u00de\u00df\7\27\2\2\u00df\u00e0\7\61\2\2\u00e0+\3\2\2\2\u00e1\u00e2"+
		"\7\30\2\2\u00e2\u00e3\7\61\2\2\u00e3-\3\2\2\2\u00e4\u00e5\7\31\2\2\u00e5"+
		"\u00e6\7\4\2\2\u00e6/\3\2\2\2\u00e7\u00e8\7\32\2\2\u00e8\u00e9\7\4\2\2"+
		"\u00e9\61\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\7\4\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ee\7\63\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\7\64\2\2"+
		"\u00f0\63\3\2\2\2\u00f1\u00f2\7\34\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4"+
		"\7\5\2\2\u00f4\u00f5\7\63\2\2\u00f5\u00f6\7\4\2\2\u00f6\u00f7\7\64\2\2"+
		"\u00f7\65\3\2\2\2\u00f8\u00f9\7\35\2\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb"+
		"\7\5\2\2\u00fb\u00fc\7\63\2\2\u00fc\u00fd\7\4\2\2\u00fd\u00fe\7\64\2\2"+
		"\u00fe\67\3\2\2\2\u00ff\u0100\7\36\2\2\u0100\u0101\7\4\2\2\u0101\u0102"+
		"\7\5\2\2\u0102\u0103\7\63\2\2\u0103\u0104\7\4\2\2\u0104\u0105\7\64\2\2"+
		"\u01059\3\2\2\2\u0106\u0107\7\37\2\2\u0107\u0108\7\4\2\2\u0108\u0109\7"+
		"\5\2\2\u0109;\3\2\2\2\u010a\u010b\7 \2\2\u010b\u010c\7\4\2\2\u010c\u010d"+
		"\7\5\2\2\u010d\u010e\7\63\2\2\u010e\u010f\7\4\2\2\u010f\u0110\7\64\2\2"+
		"\u0110=\3\2\2\2\u0111\u0112\7!\2\2\u0112\u0113\7\4\2\2\u0113\u0114\7\4"+
		"\2\2\u0114?\3\2\2\2\u0115\u0116\7\"\2\2\u0116\u0117\7\4\2\2\u0117\u0118"+
		"\7\4\2\2\u0118\u0119\7\4\2\2\u0119A\3\2\2\2\u011a\u011b\7#\2\2\u011b\u011c"+
		"\7\4\2\2\u011c\u011d\7\4\2\2\u011d\u011e\7\4\2\2\u011eC\3\2\2\2\u011f"+
		"\u0120\7$\2\2\u0120\u0121\7\4\2\2\u0121\u0122\7\4\2\2\u0122\u0123\7\4"+
		"\2\2\u0123E\3\2\2\2\u0124\u0125\7%\2\2\u0125\u0126\7\4\2\2\u0126\u0127"+
		"\7\4\2\2\u0127G\3\2\2\2\u0128\u0129\7&\2\2\u0129I\3\2\2\2\u012a\u012b"+
		"\7\'\2\2\u012b\u012c\7\4\2\2\u012c\u012d\7\4\2\2\u012d\u012e\7\4\2\2\u012e"+
		"K\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131\7\4\2\2\u0131\u0132\7\4\2\2\u0132"+
		"\u0133\7\4\2\2\u0133M\3\2\2\2\u0134\u0135\7)\2\2\u0135\u0136\7\4\2\2\u0136"+
		"\u0137\7\5\2\2\u0137\u0138\7\63\2\2\u0138\u0139\7\4\2\2\u0139\u013a\7"+
		"\64\2\2\u013aO\3\2\2\2\u013b\u013c\7*\2\2\u013c\u013d\7\4\2\2\u013d\u013e"+
		"\7\4\2\2\u013e\u013f\7\4\2\2\u013fQ\3\2\2\2\u0140\u0141\7+\2\2\u0141\u0142"+
		"\7\4\2\2\u0142\u0143\7\4\2\2\u0143\u0144\7\4\2\2\u0144S\3\2\2\2\u0145"+
		"\u0146\7,\2\2\u0146\u0147\7\4\2\2\u0147\u0148\7\5\2\2\u0148\u0149\7\63"+
		"\2\2\u0149\u014a\7\4\2\2\u014a\u014b\7\64\2\2\u014bU\3\2\2\2\u014c\u014d"+
		"\7-\2\2\u014dW\3\2\2\2\u014e\u014f\7.\2\2\u014f\u0150\7\4\2\2\u0150\u0151"+
		"\7\4\2\2\u0151\u0152\7\4\2\2\u0152Y\3\2\2\2\u0153\u0154\7/\2\2\u0154\u0155"+
		"\7\4\2\2\u0155\u0156\7\4\2\2\u0156\u0157\7\5\2\2\u0157[\3\2\2\2\u0158"+
		"\u0159\7\60\2\2\u0159\u015a\7\4\2\2\u015a\u015b\7\4\2\2\u015b\u015c\7"+
		"\5\2\2\u015c]\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\3\2\2\u015f_"+
		"\3\2\2\2\4c\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}