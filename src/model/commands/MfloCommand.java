/**
 * FileName: MfloCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

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