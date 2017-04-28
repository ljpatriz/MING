package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SubCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public SubCommand(Core core, Register dest, Register src, Register src2) {
            super(core);
            this.dest = dest;
            this.src = src;
            this.src2 = src2;
        }

    public void apply(){
        dest.setValue(src.getValue() - src2.getValue());
    }
}
