/**
 * FileName: JalrCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

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
