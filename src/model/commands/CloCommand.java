package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class CloCommand extends Command {

    Register dest;
    Register src;

    public CloCommand(Core core, Register dest, Register src) {
        super(core);
        this.dest = dest;
        this.src = src;
    }

    @Override
    public void apply() {
        dest.setValue(Integer.numberOfLeadingZeros(~src.getValue()));
    }
}
