/**
 * FileName: NorCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class NorCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public NorCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        dest.setValue(~(src.getValue() | src2.getValue()));
    }
}
