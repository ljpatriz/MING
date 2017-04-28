package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SwCommand extends Command {
    Register src;
    int memLoc;
    
    public SwCommand(Core core, Register src, int memLoc) {
       super(core);
    }

    @Override
    public void apply() {
        src.setValue(core.getMemoryVal(memLoc));
    }
}
