package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class JrCommand extends Command {
    Register newAddress;

    public JrCommand(Core core, Register newAddress) {
        super(core);
        this.newAddress = newAddress;
    }

    public void apply(){
        core.setPC(newAddress.getValue());
    }
}
