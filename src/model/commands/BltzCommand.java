/**
 * FileName: BltzCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class BltzCommand extends Command {
    Register src;
    String target;

    public BltzCommand(Core core, Register src, String target) {
        super(core);
        this.src = src;
        this.target = target;
    }

    public void apply(){
        if(src.getValue() < 0)
            core.jumpToLabel(target);
    }
}
