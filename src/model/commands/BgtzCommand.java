package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class BgtzCommand extends Command {
    Register src;
    String target;
    public BgtzCommand(Core core, Register src, String target) {
        super(core);
        this.src = src;
        this.target = target;
    }

    public void apply(){
        if(src.getValue() > 0)
            core.setCommandLocation(target);
    }
}
