package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class LwCommand extends Command {
    Register dst;
    int memLocation;
    public LwCommand(Core core, Register dst, int memLocation) {
        super(core);
        this.dst = dst;
        this.memLocation = memLocation;
    }
    public void apply(){
        dst.setValue(core.getMemoryVal(memLocation));
    }
}
