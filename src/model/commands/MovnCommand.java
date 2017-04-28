package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class MovnCommand extends Command {

    Register dest;
    Register src;
    Register valueNotZero;

    public MovnCommand(Core core, Register dest, Register src, Register valueNotZero) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.valueNotZero = valueNotZero;
    }

    public void apply(){
        if(valueNotZero.getValue() != 0)
            dest.setValue(src.getValue());
    }
}
