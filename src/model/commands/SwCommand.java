/**
 * FileName: SwCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class SwCommand extends Command {
    Register dst;
    Register src;
    int offset;
    
    public SwCommand(Core core, Register dst, Register src, int offset) {
        super(core);
        this.dst = dst;
        this.src = src;
        this.offset = offset;
    }

    @Override
    public void apply() {
        src.setValue(core.getMemoryVal(offset));
        core.setMemoryVal(dst.getValue()+offset, src.getValue());
    }
}
