package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SbCommand extends Command {
    public SbCommand(Core core, Register src, int memLoc) {
        super(core);
    }
}
