/**
 * FileName: XoriCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class XoriCommand extends Command {
    Register dest;
    Register src;
    int immediate;
    public XoriCommand(Core core, Register dest, Register src, int immediate) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.immediate = immediate;
    }

    @Override
    public void apply() {
        dest.setValue(src.getValue() ^ immediate);
    }
}
