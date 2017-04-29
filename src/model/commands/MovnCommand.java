package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class MovnCommand extends Command {

    Register dest;
    Register src;
    Register src2;

    public MovnCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        if(src2.getValue() != 0)
            dest.setValue(src.getValue());
    }
}
