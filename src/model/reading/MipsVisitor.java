// Generated from Mips.g4 by ANTLR 4.7

package model.reading;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MipsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MipsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MipsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MipsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(MipsParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(MipsParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(MipsParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#addi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddi(MipsParser.AddiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#addiu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddiu(MipsParser.AddiuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#addu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddu(MipsParser.AdduContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(MipsParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#andi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndi(MipsParser.AndiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#beq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeq(MipsParser.BeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#bgez}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBgez(MipsParser.BgezContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#bgtz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBgtz(MipsParser.BgtzContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#blez}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlez(MipsParser.BlezContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#bltz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBltz(MipsParser.BltzContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#bne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBne(MipsParser.BneContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#break_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_(MipsParser.Break_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#clo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClo(MipsParser.CloContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#clz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClz(MipsParser.ClzContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(MipsParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#divu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivu(MipsParser.DivuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#j}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ(MipsParser.JContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#jal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJal(MipsParser.JalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#jalr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJalr(MipsParser.JalrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#jr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJr(MipsParser.JrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#lb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLb(MipsParser.LbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#lbu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLbu(MipsParser.LbuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#lh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLh(MipsParser.LhContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#lhu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhu(MipsParser.LhuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#lw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLw(MipsParser.LwContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#movn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovn(MipsParser.MovnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#movz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovz(MipsParser.MovzContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(MipsParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(MipsParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#nop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNop(MipsParser.NopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#nor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNor(MipsParser.NorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(MipsParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#sb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSb(MipsParser.SbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(MipsParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#subu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubu(MipsParser.SubuContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#sw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSw(MipsParser.SwContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#syscall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyscall(MipsParser.SyscallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(MipsParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#xori}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXori(MipsParser.XoriContext ctx);
	/**
	 * Visit a parse tree produced by {@link MipsParser#ori}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOri(MipsParser.OriContext ctx);
}