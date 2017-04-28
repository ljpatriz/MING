package model.reading;

import model.Core;
import model.Register;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.stream.Collectors;


public class MipsCommandListener extends MipsBaseListener {

    private Core core;

    public MipsCommandListener(Core core) {
        this.core = core;
    }

    @Override public void enterProgram(MipsParser.ProgramContext ctx) { }
    
    @Override public void exitProgram(MipsParser.ProgramContext ctx) { }
    
    @Override public void enterLine(MipsParser.LineContext ctx) { }
    
    @Override public void exitLine(MipsParser.LineContext ctx) { }
    
    @Override public void enterCommand(MipsParser.CommandContext ctx) { }
    
    @Override public void exitCommand(MipsParser.CommandContext ctx) { }
    
    @Override public void enterAdd(MipsParser.AddContext ctx) {
        List<Register> registers = ctx.REGISTER().stream()
                .map(t -> this.core.getRegister(t.getSymbol().getText()))
                .collect(Collectors.toList());
        registers.get(0).setValue(registers.get(1).getValue() + registers.get(2).getValue());
        System.out.println(registers.get(0).getValue());
    }
    
    @Override public void exitAdd(MipsParser.AddContext ctx) { }
    
    @Override public void enterAddi(MipsParser.AddiContext ctx) {
        List<Register> registers = ctx.REGISTER().stream()
                .map(t -> this.core.getRegister(t.getSymbol().getText()))
                .collect(Collectors.toList());
        int immediate = Integer.valueOf(ctx.INT().getSymbol().getText());


        registers.get(0).setValue(registers.get(1).getValue() + immediate);
        System.out.println(registers.get(0).getValue());

    }
    
    @Override public void exitAddi(MipsParser.AddiContext ctx) { }
    
    @Override public void enterAddiu(MipsParser.AddiuContext ctx) { }
    
    @Override public void exitAddiu(MipsParser.AddiuContext ctx) { }
    
    @Override public void enterAddu(MipsParser.AdduContext ctx) { }
    
    @Override public void exitAddu(MipsParser.AdduContext ctx) { }
    
    @Override public void enterAnd(MipsParser.AndContext ctx) { }
    
    @Override public void exitAnd(MipsParser.AndContext ctx) { }
    
    @Override public void enterAndi(MipsParser.AndiContext ctx) { }
    
    @Override public void exitAndi(MipsParser.AndiContext ctx) { }
    
    @Override public void enterBeq(MipsParser.BeqContext ctx) { }
    
    @Override public void exitBeq(MipsParser.BeqContext ctx) { }
    
    @Override public void enterBgez(MipsParser.BgezContext ctx) { }
    
    @Override public void exitBgez(MipsParser.BgezContext ctx) { }
    
    @Override public void enterBgtz(MipsParser.BgtzContext ctx) { }
    
    @Override public void exitBgtz(MipsParser.BgtzContext ctx) { }
    
    @Override public void enterBlez(MipsParser.BlezContext ctx) { }
    
    @Override public void exitBlez(MipsParser.BlezContext ctx) { }
    
    @Override public void enterBltz(MipsParser.BltzContext ctx) { }
    
    @Override public void exitBltz(MipsParser.BltzContext ctx) { }
    
    @Override public void enterBne(MipsParser.BneContext ctx) { }
    
    @Override public void exitBne(MipsParser.BneContext ctx) { }
    
    @Override public void enterBreak_(MipsParser.Break_Context ctx) { }
    
    @Override public void exitBreak_(MipsParser.Break_Context ctx) { }
    
    @Override public void enterClo(MipsParser.CloContext ctx) { }
    
    @Override public void exitClo(MipsParser.CloContext ctx) { }
    
    @Override public void enterClz(MipsParser.ClzContext ctx) { }
    
    @Override public void exitClz(MipsParser.ClzContext ctx) { }
    
    @Override public void enterDiv(MipsParser.DivContext ctx) { }
    
    @Override public void exitDiv(MipsParser.DivContext ctx) { }
    
    @Override public void enterDivu(MipsParser.DivuContext ctx) { }
    
    @Override public void exitDivu(MipsParser.DivuContext ctx) { }
    
    @Override public void enterJ(MipsParser.JContext ctx) { }
    
    @Override public void exitJ(MipsParser.JContext ctx) { }
    
    @Override public void enterJal(MipsParser.JalContext ctx) { }
    
    @Override public void exitJal(MipsParser.JalContext ctx) { }
    
    @Override public void enterJalr(MipsParser.JalrContext ctx) { }
    
    @Override public void exitJalr(MipsParser.JalrContext ctx) { }
    
    @Override public void enterJr(MipsParser.JrContext ctx) { }
    
    @Override public void exitJr(MipsParser.JrContext ctx) { }
    
    @Override public void enterLb(MipsParser.LbContext ctx) { }
    
    @Override public void exitLb(MipsParser.LbContext ctx) { }
    
    @Override public void enterLbu(MipsParser.LbuContext ctx) { }
    
    @Override public void exitLbu(MipsParser.LbuContext ctx) { }
    
    @Override public void enterLh(MipsParser.LhContext ctx) { }
    
    @Override public void exitLh(MipsParser.LhContext ctx) { }
    
    @Override public void enterLhu(MipsParser.LhuContext ctx) { }
    
    @Override public void exitLhu(MipsParser.LhuContext ctx) { }
    
    @Override public void enterLw(MipsParser.LwContext ctx) { }
    
    @Override public void exitLw(MipsParser.LwContext ctx) { }
    
    @Override public void enterMovn(MipsParser.MovnContext ctx) { }
    
    @Override public void exitMovn(MipsParser.MovnContext ctx) { }
    
    @Override public void enterMovz(MipsParser.MovzContext ctx) { }
    
    @Override public void exitMovz(MipsParser.MovzContext ctx) { }
    
    @Override public void enterMul(MipsParser.MulContext ctx) { }
    
    @Override public void exitMul(MipsParser.MulContext ctx) { }
    
    @Override public void enterMult(MipsParser.MultContext ctx) { }
    
    @Override public void exitMult(MipsParser.MultContext ctx) { }
    
    @Override public void enterNop(MipsParser.NopContext ctx) { }
    
    @Override public void exitNop(MipsParser.NopContext ctx) { }
    
    @Override public void enterNor(MipsParser.NorContext ctx) { }
    
    @Override public void exitNor(MipsParser.NorContext ctx) { }
    
    @Override public void enterOr(MipsParser.OrContext ctx) { }
    
    @Override public void exitOr(MipsParser.OrContext ctx) { }
    
    @Override public void enterSb(MipsParser.SbContext ctx) { }
    
    @Override public void exitSb(MipsParser.SbContext ctx) { }
    
    @Override public void enterSub(MipsParser.SubContext ctx) { }
    
    @Override public void exitSub(MipsParser.SubContext ctx) { }
    
    @Override public void enterSubu(MipsParser.SubuContext ctx) { }
    
    @Override public void exitSubu(MipsParser.SubuContext ctx) { }
    
    @Override public void enterSw(MipsParser.SwContext ctx) { }
    
    @Override public void exitSw(MipsParser.SwContext ctx) { }
    
    @Override public void enterSyscall(MipsParser.SyscallContext ctx) { }
    
    @Override public void exitSyscall(MipsParser.SyscallContext ctx) { }
    
    @Override public void enterXor(MipsParser.XorContext ctx) { }
    
    @Override public void exitXor(MipsParser.XorContext ctx) { }
    
    @Override public void enterXori(MipsParser.XoriContext ctx) { }
    
    @Override public void exitXori(MipsParser.XoriContext ctx) { }
    
    @Override public void enterOri(MipsParser.OriContext ctx) { }
    
    @Override public void exitOri(MipsParser.OriContext ctx) { }

    
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override public void visitTerminal(TerminalNode node) { }
    
    @Override public void visitErrorNode(ErrorNode node) { }
}
