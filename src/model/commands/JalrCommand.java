package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class JalrCommand extends Command {
    Register returnAddress;
    Register newAddress;

    public JalrCommand(Core core, Register returnAddress, Register newAddress) {
        super(core);
        this.returnAddress = returnAddress;
        this.newAddress = newAddress;
    }

    @Override
    public void apply() {
        returnAddress.setValue(core.getPC()+4);
        core.setPC(newAddress.getValue());
    }
}
