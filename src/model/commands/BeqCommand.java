/**
 * FileName: BeqCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class BeqCommand extends Command {
    Register src;
    Register src2;
    String target;
    public BeqCommand(Core core,  Register src, Register src2, String target) {
        super(core);
        this.src = src;
        this.src2 = src2;
        this.target = target;
    }

    public void apply(){
        if(src.getValue() == src2.getValue())
            core.jumpToLabel(target);
    }
}
