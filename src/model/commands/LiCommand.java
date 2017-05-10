/**
 * FileName: LiCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;

import java.util.function.Consumer;
import model.Register;

public class LiCommand extends Command{
    Register dst;
    int immediate;
    public LiCommand(Core core, Register dst, int immediate) {
        super(core);
        this.dst = dst;
        this.immediate = immediate;
    }
    public void apply(){
        dst.setValue(immediate);
    }
}