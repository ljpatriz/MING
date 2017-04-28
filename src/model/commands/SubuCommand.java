package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SubuCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public SubuCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }
    //TODO do unsigned
    public void apply(){
        dest.setValue(src.getValue() - src2.getValue());
    }
}
