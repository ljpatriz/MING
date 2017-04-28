package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class BeqCommand extends Command {
    Register src;
    Register src2;
    String target;
    public BeqCommand(Core core,  Register src, Register src2, String target) {
        super(core);
        this.src = src;
        this.src2 = src2;
        this.target = target;
    }

    public void apply(){
        if(src.getValue() == src2.getValue())
            core.setCommandLocation(target);
    }
}
