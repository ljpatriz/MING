package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
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
