package model.reading;

import model.commands.Command;

import java.util.List;

//// TODO: 4/27/2017
//// TODO: 4/27/2017
//// TODO: 4/27/2017 I think we should do commands differently. They should take a List of
//// TODO: 4/27/2017 Tokens or Symbols or Strings. I will explain why in more detail tomorrow.

public class CommandGeneratorVisitor<T> extends MipsBaseVisitor<T> {



    public CommandGeneratorVisitor() {
        super();

    }

    public List<Command> getCommands() {

        return null;
    }


    @Override public T visitCommand(MipsParser.CommandContext ctx) { return visitChildren(ctx); }

    //// TODO: 4/27/2017 sample code for how to get a register's text
    @Override public T visitAdd(MipsParser.AddContext ctx) {
        ctx.REGISTER(0).getSymbol().getText();
        return visitChildren(ctx);
    }
    
    @Override public T visitAddi(MipsParser.AddiContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitAddiu(MipsParser.AddiuContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitAddu(MipsParser.AdduContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitAnd(MipsParser.AndContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitAndi(MipsParser.AndiContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBeq(MipsParser.BeqContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBgez(MipsParser.BgezContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBgtz(MipsParser.BgtzContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBlez(MipsParser.BlezContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBltz(MipsParser.BltzContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBne(MipsParser.BneContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitBreak_(MipsParser.Break_Context ctx) { return visitChildren(ctx); }
    
    @Override public T visitClo(MipsParser.CloContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitClz(MipsParser.ClzContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitDiv(MipsParser.DivContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitDivu(MipsParser.DivuContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitJ(MipsParser.JContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitJal(MipsParser.JalContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitJalr(MipsParser.JalrContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitJr(MipsParser.JrContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLb(MipsParser.LbContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLbu(MipsParser.LbuContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLh(MipsParser.LhContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLhu(MipsParser.LhuContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitLw(MipsParser.LwContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitMovn(MipsParser.MovnContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitMovz(MipsParser.MovzContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitMul(MipsParser.MulContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitMult(MipsParser.MultContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitNop(MipsParser.NopContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitNor(MipsParser.NorContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitOr(MipsParser.OrContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSb(MipsParser.SbContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSub(MipsParser.SubContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSubu(MipsParser.SubuContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSw(MipsParser.SwContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitSyscall(MipsParser.SyscallContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitXor(MipsParser.XorContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitXori(MipsParser.XoriContext ctx) { return visitChildren(ctx); }
    
    @Override public T visitOri(MipsParser.OriContext ctx) { return visitChildren(ctx); }
}
