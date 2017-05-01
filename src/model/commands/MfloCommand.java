package model.commands;

import model.Core;
import model.Register;

/**
 * Created by larrypatrizio on 4/30/17.
 */
public class MfloCommand extends Command {
    Register dst;

    public MfloCommand(Core core, Register dst) {
        super(core);
        this.dst = dst;
    }

    @Override
    public void apply() {
        dst.setValue(core.getHiValue());
    }
}