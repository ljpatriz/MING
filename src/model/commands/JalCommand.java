/**
 * FileName: JalCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;

public class JalCommand extends Command {
    private String label;
    private int currentLocation;

    public JalCommand(Core core, String label, int currentLocation) {
        super(core);
        this.label = label;
        this.currentLocation = currentLocation;
    }

    @Override
    public void apply() {
        core.getRegister("$ra").setValue(currentLocation+1);
        core.jumpToLabel(label);
    }
}
