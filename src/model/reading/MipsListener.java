package model.reading;// Generated from Mips.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MipsParser}.
 */
public interface MipsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MipsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MipsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MipsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MipsParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MipsParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MipsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MipsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MipsParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MipsParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#addi}.
	 * @param ctx the parse tree
	 */
	void enterAddi(MipsParser.AddiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#addi}.
	 * @param ctx the parse tree
	 */
	void exitAddi(MipsParser.AddiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#addiu}.
	 * @param ctx the parse tree
	 */
	void enterAddiu(MipsParser.AddiuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#addiu}.
	 * @param ctx the parse tree
	 */
	void exitAddiu(MipsParser.AddiuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#addu}.
	 * @param ctx the parse tree
	 */
	void enterAddu(MipsParser.AdduContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#addu}.
	 * @param ctx the parse tree
	 */
	void exitAddu(MipsParser.AdduContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MipsParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MipsParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#andi}.
	 * @param ctx the parse tree
	 */
	void enterAndi(MipsParser.AndiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#andi}.
	 * @param ctx the parse tree
	 */
	void exitAndi(MipsParser.AndiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#beq}.
	 * @param ctx the parse tree
	 */
	void enterBeq(MipsParser.BeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#beq}.
	 * @param ctx the parse tree
	 */
	void exitBeq(MipsParser.BeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#bgez}.
	 * @param ctx the parse tree
	 */
	void enterBgez(MipsParser.BgezContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#bgez}.
	 * @param ctx the parse tree
	 */
	void exitBgez(MipsParser.BgezContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#bgtz}.
	 * @param ctx the parse tree
	 */
	void enterBgtz(MipsParser.BgtzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#bgtz}.
	 * @param ctx the parse tree
	 */
	void exitBgtz(MipsParser.BgtzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#blez}.
	 * @param ctx the parse tree
	 */
	void enterBlez(MipsParser.BlezContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#blez}.
	 * @param ctx the parse tree
	 */
	void exitBlez(MipsParser.BlezContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#bltz}.
	 * @param ctx the parse tree
	 */
	void enterBltz(MipsParser.BltzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#bltz}.
	 * @param ctx the parse tree
	 */
	void exitBltz(MipsParser.BltzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#bne}.
	 * @param ctx the parse tree
	 */
	void enterBne(MipsParser.BneContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#bne}.
	 * @param ctx the parse tree
	 */
	void exitBne(MipsParser.BneContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(MipsParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(MipsParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#clo}.
	 * @param ctx the parse tree
	 */
	void enterClo(MipsParser.CloContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#clo}.
	 * @param ctx the parse tree
	 */
	void exitClo(MipsParser.CloContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#clz}.
	 * @param ctx the parse tree
	 */
	void enterClz(MipsParser.ClzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#clz}.
	 * @param ctx the parse tree
	 */
	void exitClz(MipsParser.ClzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MipsParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MipsParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#divu}.
	 * @param ctx the parse tree
	 */
	void enterDivu(MipsParser.DivuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#divu}.
	 * @param ctx the parse tree
	 */
	void exitDivu(MipsParser.DivuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#j}.
	 * @param ctx the parse tree
	 */
	void enterJ(MipsParser.JContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#j}.
	 * @param ctx the parse tree
	 */
	void exitJ(MipsParser.JContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#jal}.
	 * @param ctx the parse tree
	 */
	void enterJal(MipsParser.JalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#jal}.
	 * @param ctx the parse tree
	 */
	void exitJal(MipsParser.JalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#jalr}.
	 * @param ctx the parse tree
	 */
	void enterJalr(MipsParser.JalrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#jalr}.
	 * @param ctx the parse tree
	 */
	void exitJalr(MipsParser.JalrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#jr}.
	 * @param ctx the parse tree
	 */
	void enterJr(MipsParser.JrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#jr}.
	 * @param ctx the parse tree
	 */
	void exitJr(MipsParser.JrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#lb}.
	 * @param ctx the parse tree
	 */
	void enterLb(MipsParser.LbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#lb}.
	 * @param ctx the parse tree
	 */
	void exitLb(MipsParser.LbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#lbu}.
	 * @param ctx the parse tree
	 */
	void enterLbu(MipsParser.LbuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#lbu}.
	 * @param ctx the parse tree
	 */
	void exitLbu(MipsParser.LbuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#lh}.
	 * @param ctx the parse tree
	 */
	void enterLh(MipsParser.LhContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#lh}.
	 * @param ctx the parse tree
	 */
	void exitLh(MipsParser.LhContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#lhu}.
	 * @param ctx the parse tree
	 */
	void enterLhu(MipsParser.LhuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#lhu}.
	 * @param ctx the parse tree
	 */
	void exitLhu(MipsParser.LhuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#lw}.
	 * @param ctx the parse tree
	 */
	void enterLw(MipsParser.LwContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#lw}.
	 * @param ctx the parse tree
	 */
	void exitLw(MipsParser.LwContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#movn}.
	 * @param ctx the parse tree
	 */
	void enterMovn(MipsParser.MovnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#movn}.
	 * @param ctx the parse tree
	 */
	void exitMovn(MipsParser.MovnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#movz}.
	 * @param ctx the parse tree
	 */
	void enterMovz(MipsParser.MovzContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#movz}.
	 * @param ctx the parse tree
	 */
	void exitMovz(MipsParser.MovzContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(MipsParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(MipsParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(MipsParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(MipsParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#nop}.
	 * @param ctx the parse tree
	 */
	void enterNop(MipsParser.NopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#nop}.
	 * @param ctx the parse tree
	 */
	void exitNop(MipsParser.NopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#nor}.
	 * @param ctx the parse tree
	 */
	void enterNor(MipsParser.NorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#nor}.
	 * @param ctx the parse tree
	 */
	void exitNor(MipsParser.NorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(MipsParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(MipsParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#sb}.
	 * @param ctx the parse tree
	 */
	void enterSb(MipsParser.SbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#sb}.
	 * @param ctx the parse tree
	 */
	void exitSb(MipsParser.SbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(MipsParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(MipsParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#subu}.
	 * @param ctx the parse tree
	 */
	void enterSubu(MipsParser.SubuContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#subu}.
	 * @param ctx the parse tree
	 */
	void exitSubu(MipsParser.SubuContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#sw}.
	 * @param ctx the parse tree
	 */
	void enterSw(MipsParser.SwContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#sw}.
	 * @param ctx the parse tree
	 */
	void exitSw(MipsParser.SwContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#syscall}.
	 * @param ctx the parse tree
	 */
	void enterSyscall(MipsParser.SyscallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#syscall}.
	 * @param ctx the parse tree
	 */
	void exitSyscall(MipsParser.SyscallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(MipsParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(MipsParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#xori}.
	 * @param ctx the parse tree
	 */
	void enterXori(MipsParser.XoriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#xori}.
	 * @param ctx the parse tree
	 */
	void exitXori(MipsParser.XoriContext ctx);
	/**
	 * Enter a parse tree produced by {@link MipsParser#ori}.
	 * @param ctx the parse tree
	 */
	void enterOri(MipsParser.OriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MipsParser#ori}.
	 * @param ctx the parse tree
	 */
	void exitOri(MipsParser.OriContext ctx);
}