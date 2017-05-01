package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class LwCommand extends Command {
    Register dst;
    Register src;
    int offset;
    public LwCommand(Core core, Register dst, Register src, int offset) {
        super(core);
        this.dst = dst;
        this.src = src;
        this.offset = offset;
    }
    public void apply(){
        dst.setValue(core.getMemoryVal(offset+src.getValue()));
    }
}
