package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class MulCommand extends Command {
    //// TODO: 4/28/2017 figure out how to represent HI and LO registers
    Register dest;
    Register src;
    Register src2;
    public MulCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        long srcVal = src.getValue();
        long src2Val = src2.getValue();
        long result = srcVal * src2Val;

        int hiBits = (int) (result >> 32);
        int loBits = (int) (result);

        core.setHiValue(hiBits);
        core.setLoValue(loBits);
        dest.setValue(loBits);
    }
}
