package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
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
