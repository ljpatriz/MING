package model.reading;// Generated from mipsgrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mipsgrammarParser}.
 */
public interface mipsgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mipsgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mipsgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(mipsgrammarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(mipsgrammarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(mipsgrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(mipsgrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(mipsgrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(mipsgrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#addi}.
	 * @param ctx the parse tree
	 */
	void enterAddi(mipsgrammarParser.AddiContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#addi}.
	 * @param ctx the parse tree
	 */
	void exitAddi(mipsgrammarParser.AddiContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#addiu}.
	 * @param ctx the parse tree
	 */
	void enterAddiu(mipsgrammarParser.AddiuContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#addiu}.
	 * @param ctx the parse tree
	 */
	void exitAddiu(mipsgrammarParser.AddiuContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#addu}.
	 * @param ctx the parse tree
	 */
	void enterAddu(mipsgrammarParser.AdduContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#addu}.
	 * @param ctx the parse tree
	 */
	void exitAddu(mipsgrammarParser.AdduContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(mipsgrammarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(mipsgrammarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#andi}.
	 * @param ctx the parse tree
	 */
	void enterAndi(mipsgrammarParser.AndiContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#andi}.
	 * @param ctx the parse tree
	 */
	void exitAndi(mipsgrammarParser.AndiContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#beq}.
	 * @param ctx the parse tree
	 */
	void enterBeq(mipsgrammarParser.BeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#beq}.
	 * @param ctx the parse tree
	 */
	void exitBeq(mipsgrammarParser.BeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#bgez}.
	 * @param ctx the parse tree
	 */
	void enterBgez(mipsgrammarParser.BgezContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#bgez}.
	 * @param ctx the parse tree
	 */
	void exitBgez(mipsgrammarParser.BgezContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#bgtz}.
	 * @param ctx the parse tree
	 */
	void enterBgtz(mipsgrammarParser.BgtzContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#bgtz}.
	 * @param ctx the parse tree
	 */
	void exitBgtz(mipsgrammarParser.BgtzContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#blez}.
	 * @param ctx the parse tree
	 */
	void enterBlez(mipsgrammarParser.BlezContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#blez}.
	 * @param ctx the parse tree
	 */
	void exitBlez(mipsgrammarParser.BlezContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#bltz}.
	 * @param ctx the parse tree
	 */
	void enterBltz(mipsgrammarParser.BltzContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#bltz}.
	 * @param ctx the parse tree
	 */
	void exitBltz(mipsgrammarParser.BltzContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#bne}.
	 * @param ctx the parse tree
	 */
	void enterBne(mipsgrammarParser.BneContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#bne}.
	 * @param ctx the parse tree
	 */
	void exitBne(mipsgrammarParser.BneContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(mipsgrammarParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(mipsgrammarParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#clo}.
	 * @param ctx the parse tree
	 */
	void enterClo(mipsgrammarParser.CloContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#clo}.
	 * @param ctx the parse tree
	 */
	void exitClo(mipsgrammarParser.CloContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#clz}.
	 * @param ctx the parse tree
	 */
	void enterClz(mipsgrammarParser.ClzContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#clz}.
	 * @param ctx the parse tree
	 */
	void exitClz(mipsgrammarParser.ClzContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(mipsgrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(mipsgrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#divu}.
	 * @param ctx the parse tree
	 */
	void enterDivu(mipsgrammarParser.DivuContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#divu}.
	 * @param ctx the parse tree
	 */
	void exitDivu(mipsgrammarParser.DivuContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#j}.
	 * @param ctx the parse tree
	 */
	void enterJ(mipsgrammarParser.JContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#j}.
	 * @param ctx the parse tree
	 */
	void exitJ(mipsgrammarParser.JContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#jal}.
	 * @param ctx the parse tree
	 */
	void enterJal(mipsgrammarParser.JalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#jal}.
	 * @param ctx the parse tree
	 */
	void exitJal(mipsgrammarParser.JalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#jalr}.
	 * @param ctx the parse tree
	 */
	void enterJalr(mipsgrammarParser.JalrContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#jalr}.
	 * @param ctx the parse tree
	 */
	void exitJalr(mipsgrammarParser.JalrContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#jr}.
	 * @param ctx the parse tree
	 */
	void enterJr(mipsgrammarParser.JrContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#jr}.
	 * @param ctx the parse tree
	 */
	void exitJr(mipsgrammarParser.JrContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#lb}.
	 * @param ctx the parse tree
	 */
	void enterLb(mipsgrammarParser.LbContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#lb}.
	 * @param ctx the parse tree
	 */
	void exitLb(mipsgrammarParser.LbContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#lbu}.
	 * @param ctx the parse tree
	 */
	void enterLbu(mipsgrammarParser.LbuContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#lbu}.
	 * @param ctx the parse tree
	 */
	void exitLbu(mipsgrammarParser.LbuContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#lh}.
	 * @param ctx the parse tree
	 */
	void enterLh(mipsgrammarParser.LhContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#lh}.
	 * @param ctx the parse tree
	 */
	void exitLh(mipsgrammarParser.LhContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#lhu}.
	 * @param ctx the parse tree
	 */
	void enterLhu(mipsgrammarParser.LhuContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#lhu}.
	 * @param ctx the parse tree
	 */
	void exitLhu(mipsgrammarParser.LhuContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#lw}.
	 * @param ctx the parse tree
	 */
	void enterLw(mipsgrammarParser.LwContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#lw}.
	 * @param ctx the parse tree
	 */
	void exitLw(mipsgrammarParser.LwContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#movn}.
	 * @param ctx the parse tree
	 */
	void enterMovn(mipsgrammarParser.MovnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#movn}.
	 * @param ctx the parse tree
	 */
	void exitMovn(mipsgrammarParser.MovnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#movz}.
	 * @param ctx the parse tree
	 */
	void enterMovz(mipsgrammarParser.MovzContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#movz}.
	 * @param ctx the parse tree
	 */
	void exitMovz(mipsgrammarParser.MovzContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(mipsgrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(mipsgrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(mipsgrammarParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(mipsgrammarParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#nop}.
	 * @param ctx the parse tree
	 */
	void enterNop(mipsgrammarParser.NopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#nop}.
	 * @param ctx the parse tree
	 */
	void exitNop(mipsgrammarParser.NopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#nor}.
	 * @param ctx the parse tree
	 */
	void enterNor(mipsgrammarParser.NorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#nor}.
	 * @param ctx the parse tree
	 */
	void exitNor(mipsgrammarParser.NorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(mipsgrammarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(mipsgrammarParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#sb}.
	 * @param ctx the parse tree
	 */
	void enterSb(mipsgrammarParser.SbContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#sb}.
	 * @param ctx the parse tree
	 */
	void exitSb(mipsgrammarParser.SbContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(mipsgrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(mipsgrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#subu}.
	 * @param ctx the parse tree
	 */
	void enterSubu(mipsgrammarParser.SubuContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#subu}.
	 * @param ctx the parse tree
	 */
	void exitSubu(mipsgrammarParser.SubuContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#sw}.
	 * @param ctx the parse tree
	 */
	void enterSw(mipsgrammarParser.SwContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#sw}.
	 * @param ctx the parse tree
	 */
	void exitSw(mipsgrammarParser.SwContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#syscall}.
	 * @param ctx the parse tree
	 */
	void enterSyscall(mipsgrammarParser.SyscallContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#syscall}.
	 * @param ctx the parse tree
	 */
	void exitSyscall(mipsgrammarParser.SyscallContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#xor}.
	 * @param ctx the parse tree
	 */
	void enterXor(mipsgrammarParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#xor}.
	 * @param ctx the parse tree
	 */
	void exitXor(mipsgrammarParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#xori}.
	 * @param ctx the parse tree
	 */
	void enterXori(mipsgrammarParser.XoriContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#xori}.
	 * @param ctx the parse tree
	 */
	void exitXori(mipsgrammarParser.XoriContext ctx);
	/**
	 * Enter a parse tree produced by {@link mipsgrammarParser#ori}.
	 * @param ctx the parse tree
	 */
	void enterOri(mipsgrammarParser.OriContext ctx);
	/**
	 * Exit a parse tree produced by {@link mipsgrammarParser#ori}.
	 * @param ctx the parse tree
	 */
	void exitOri(mipsgrammarParser.OriContext ctx);
}