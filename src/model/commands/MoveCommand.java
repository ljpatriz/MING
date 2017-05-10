/**
 * FileName: MoveCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

import java.util.function.Consumer;

public class MoveCommand extends Command{
    Register dest;
    Register src;
    public MoveCommand(Core core, Register dest, Register src) {
        super(core);
        this.dest = dest;
        this.src = src;
    }

    public void apply(){
        dest.setValue(src.getValue());
    }
}
