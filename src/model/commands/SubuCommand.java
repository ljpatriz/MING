package model.commands;

import model.Core;
import model.Register;
import model.util.Util;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SubuCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public SubuCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        if(!Util.checkOverflow(src.getValue() - src2.getValue())){
            dest.setValue(src.getValue() - src2.getValue());
        }
        else{
            System.out.println("Overflow error");
            //TODO: Larry - overflow error handling
        }
    }
}
