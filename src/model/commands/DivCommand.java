package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class DivCommand extends Command {
    //// TODO: 4/28/2017 jake i'm disappointed
    //// TODO: 4/28/2017 i told you to look at the github or the MARS help dialog
    //// TODO: 4/28/2017 leaving this as it is for now so you can feel ashamed
    //// TODO: 4/28/2017 this is not how div works in mips
    //// TODO: 4/28/2017 it doesn't take 3 registers, and it interacts with the HI and LO registers
    //// TODO: 4/28/2017 which we have yet to create

    Register dest;
    Register src;
    Register src2;
    public DivCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        dest.setValue(src.getValue() / src2.getValue());
    }
}
