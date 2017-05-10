/**
 * FileName: JrCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

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
