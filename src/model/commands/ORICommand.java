package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class OriCommand extends Command {
    Register dest;
    Register src;
    int immediate;
    public OriCommand(Core core, Register dest, Register src, int immediate) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.immediate = immediate;
    }

    public void apply(){
        dest.setValue(src.getValue() | immediate);
    }
}
