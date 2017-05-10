/**
 * FileName: XorCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class XorCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public XorCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    @Override
    public void apply() {
        dest.setValue(src.getValue() ^ src2.getValue());
    }
}
