/**
 * FileName: CloCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class CloCommand extends Command {

    Register dest;
    Register src;

    public CloCommand(Core core, Register dest, Register src) {
        super(core);
        this.dest = dest;
        this.src = src;
    }

    @Override
    public void apply() {
        dest.setValue(Integer.numberOfLeadingZeros(~src.getValue()));
    }
}
