/**
 * FileName: MfhiCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class MfhiCommand extends Command {
    Register dst;

    public MfhiCommand(Core core, Register dst) {
        super(core);
        this.dst = dst;
    }

    @Override
    public void apply() {
        dst.setValue(core.getHiValue());
    }
}
