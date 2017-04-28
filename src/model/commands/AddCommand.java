package model.commands;

import model.Register;
import model.Core;

public class AddCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public AddCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        dest.setValue(src.getValue() + src2.getValue());
    }
}
