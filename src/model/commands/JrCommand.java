package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
public class JrCommand extends Command {
    int addr;

    public JrCommand(Core core, int addr) {
        super(core);
        this.addr = addr;
    }

    public void apply(){
        core.setPC(addr);
    }
}
