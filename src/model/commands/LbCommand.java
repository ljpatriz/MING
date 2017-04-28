package model.commands;

import model.Core;
import model.Register;
/**
 * Created by ncameron on 4/27/2017.
 */
public class LbCommand extends Command {
    public LbCommand(Core core, Register dst, int memLocation) {
        super(core);
    }
}
