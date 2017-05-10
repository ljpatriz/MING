/**
 * FileName: NopCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;

public class NopCommand extends Command {
    public NopCommand(Core core) {
        super(core);
    }

    @Override
    public void apply() {}
}
