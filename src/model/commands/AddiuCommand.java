package model.commands;

import model.Core;
import model.Register;
import model.util.Util;

/**
 * Created by ncameron on 4/27/2017.
 */
public class AddiuCommand extends Command {
    Register dest;
    Register src;
    int immediate;
    public AddiuCommand(Core core, Register dest, Register src, int immediate) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.immediate = immediate;
    }

    public void apply(){
        if(!Util.checkOverflow(src.getValue()+immediate)){
            dest.setValue(src.getValue() + immediate);
        }
        else{
            System.out.println("Overflow error");
            //TODO: Larry - overflow error handling
        }
    }
}
