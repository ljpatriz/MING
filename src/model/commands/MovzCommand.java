/**
 * FileName: MovzCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class MovzCommand extends Command {
    Register dest;
    Register src;
    Register src2;

    public MovzCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        if(src2.getValue() == 0)
            dest.setValue(src.getValue());
    }
}
