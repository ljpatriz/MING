/**
 * FileName: JCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;

public class JCommand extends Command {
    String target;

    public JCommand(Core core, String target) {
        super(core);
        this.target = target;
    }

    public void apply(){
        core.jumpToLabel(target);
    }
}
