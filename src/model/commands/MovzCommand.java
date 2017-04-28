package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class MovzCommand extends Command {
    Register dest;
    Register src;
    Register value;

    public MovzCommand(Core core, Register dest, Register src, Register value) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.value = value;
    }

    public void apply(){
        if(value.getValue() == 0)
            dest.setValue(src.getValue());
    }
}
