package model.reading;

import model.Core;
import model.Register;
import model.commands.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MipsCommandListener extends MipsBaseListener {

    private Core core;
    private List<Command> commands;
    private int location;

    public MipsCommandListener(Core core) {
        location = 0;
        this.core = core;
        commands = new ArrayList<>();
    }


    public List<Register> getRegisters(Stream<TerminalNode> stream) {
        return stream
                .map(t -> this.core.getRegister(t.getSymbol().getText()))
                .collect(Collectors.toList());
    }

    @Override public void enterProgram(MipsParser.ProgramContext ctx) { }
    
    @Override public void exitProgram(MipsParser.ProgramContext ctx) {
        commands.add(new NopCommand(core));
        core.setCommandList(commands);
    }
    
    @Override public void enterLine(MipsParser.LineContext ctx) { }
    
    @Override public void exitLine(MipsParser.LineContext ctx) {
        location++;
    }
    
    @Override public void enterCommand(MipsParser.CommandContext ctx) { }
    
    @Override public void exitCommand(MipsParser.CommandContext ctx) { }



    
    @Override public void enterAdd(MipsParser.AddContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new AddCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }

    @Override public void enterAddi(MipsParser.AddiContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        int immediate = Integer.valueOf(ctx.INT().getSymbol().getText());

        commands.add(new AddiCommand(core, registers.get(0), registers.get(1), immediate));
    }

    @Override public void enterAddiu(MipsParser.AddiuContext ctx) {

    }

    @Override public void enterAddu(MipsParser.AdduContext ctx) { }

    @Override public void enterAnd(MipsParser.AndContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new AndCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterAndi(MipsParser.AndiContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        int immediate = Integer.valueOf(ctx.INT().getSymbol().getText());

        commands.add(new AndiCommand(core, registers.get(0), registers.get(1), immediate));
    }

    @Override public void enterBeq(MipsParser.BeqContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        String label = ctx.LABEL().getText();

        commands.add(new BeqCommand(core, registers.get(0), registers.get(1), label));
    }

    @Override public void enterBgez(MipsParser.BgezContext ctx) {
        String label = ctx.LABEL().getText();
        Register register = core.getRegister(ctx.REGISTER().getText());

        commands.add(new BgezCommand(core, register, label));

    }

    @Override public void enterBgtz(MipsParser.BgtzContext ctx) {
        String label = ctx.LABEL().getText();
        Register register = core.getRegister(ctx.REGISTER().getText());

        commands.add(new BgtzCommand(core, register, label));
    }

    @Override public void enterBlez(MipsParser.BlezContext ctx) {
        String label = ctx.LABEL().getText();
        Register register = core.getRegister(ctx.REGISTER().getText());

        commands.add(new BlezCommand(core, register, label));
    }
    
    @Override public void enterBltz(MipsParser.BltzContext ctx) {
        String label = ctx.LABEL().getText();
        Register register = core.getRegister(ctx.REGISTER().getText());

        commands.add(new BltzCommand(core, register, label));
    }

    @Override public void enterBne(MipsParser.BneContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        String label = ctx.LABEL().getText();

        commands.add(new BneCommand(core, registers.get(0), registers.get(1), label));
    }

    @Override public void enterBreak_(MipsParser.Break_Context ctx) {
        commands.add(new BreakCommand("blah",core));
    }

    @Override public void enterClo(MipsParser.CloContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new CloCommand(core, registers.get(0), registers.get(1)));
    }
    
    @Override public void enterClz(MipsParser.ClzContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new ClzCommand(core, registers.get(0), registers.get(1)));
    }
    
    @Override public void enterDiv(MipsParser.DivContext ctx) { }
    
    @Override public void enterDivu(MipsParser.DivuContext ctx) { }
    
    @Override public void enterJ(MipsParser.JContext ctx) {
        String label = ctx.LABEL().getText();

        commands.add(new JCommand(core, label));
    }
    
    @Override public void enterJal(MipsParser.JalContext ctx) {
        String label = ctx.LABEL().getText();

        commands.add(new JalCommand(core, label, location));
    }
    
    @Override public void enterJalr(MipsParser.JalrContext ctx) { }
    
    @Override public void enterJr(MipsParser.JrContext ctx) { }
    
    @Override public void enterLb(MipsParser.LbContext ctx) { }

    @Override public void enterLbu(MipsParser.LbuContext ctx) { }

    @Override public void enterLh(MipsParser.LhContext ctx) { }
    
    @Override public void enterLhu(MipsParser.LhuContext ctx) { }

    @Override public void enterLi(MipsParser.LiContext ctx) {
        Register register = core.getRegister(ctx.REGISTER().getText());
        int immediate = Integer.valueOf(ctx.INT().getText());

        commands.add(new LiCommand(core, register, immediate));
    }

    @Override public void enterLw(MipsParser.LwContext ctx) { }

    //// TODO: 4/28/2017 add Move to the parser
    @Override public void enterMove(MipsParser.MoveContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new MoveCommand(core, registers.get(0), registers.get(1)));
    }

    @Override public void enterMovn(MipsParser.MovnContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new MovnCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterMovz(MipsParser.MovzContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new MovzCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterMul(MipsParser.MulContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new MulCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterMult(MipsParser.MultContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new MultCommand(core, registers.get(0), registers.get(1)));
    }
    
    @Override public void enterNop(MipsParser.NopContext ctx) {
        commands.add(new NopCommand(core));
    }
    
    @Override public void enterNor(MipsParser.NorContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new NorCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterOr(MipsParser.OrContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new OrCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterSb(MipsParser.SbContext ctx) { }
    
    @Override public void enterSub(MipsParser.SubContext ctx) { }
    
    @Override public void enterSubu(MipsParser.SubuContext ctx) { }
    
    @Override public void enterSw(MipsParser.SwContext ctx) { }
    
    @Override public void enterSyscall(MipsParser.SyscallContext ctx) { }
    
    @Override public void enterXor(MipsParser.XorContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());

        commands.add(new XorCommand(core, registers.get(0), registers.get(1), registers.get(2)));
    }
    
    @Override public void enterXori(MipsParser.XoriContext ctx) {
        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        int immediate = Integer.valueOf(ctx.INT().getSymbol().getText());

        commands.add(new XoriCommand(core, registers.get(0), registers.get(1), immediate));
    }
    
    @Override public void enterOri(MipsParser.OriContext ctx) {

        List<Register> registers = getRegisters(ctx.REGISTER().stream());
        int immediate = Integer.valueOf(ctx.INT().getSymbol().getText());

        commands.add(new OriCommand(core, registers.get(0), registers.get(1), immediate));
    }

    @Override public void enterLabel(MipsParser.LabelContext ctx) {
        core.addLabel(ctx.LABEL().getText(), location);
    }

    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    
    @Override public void visitTerminal(TerminalNode node) { }
    
    @Override public void visitErrorNode(ErrorNode node) { }
}
