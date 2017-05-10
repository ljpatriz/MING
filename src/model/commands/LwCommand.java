/**
 * FileName: LwCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class LwCommand extends Command {
    Register dst;
    Register src;
    int offset;
    public LwCommand(Core core, Register dst, Register src, int offset) {
        super(core);
        this.dst = dst;
        this.src = src;
        this.offset = offset;
    }
    public void apply(){
        dst.setValue(core.getMemoryVal(offset+src.getValue()));
    }
}
