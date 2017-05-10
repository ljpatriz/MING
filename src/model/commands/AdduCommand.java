/**
 * FileName: AdduCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;
import model.util.Util;

public class AdduCommand extends Command {
    Register dest;
    Register src;
    Register src2;
    public AdduCommand(Core core, Register dest, Register src, Register src2) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        if(!Util.checkOverflow(src.getValue()+ src2.getValue())){
            dest.setValue(src.getValue() + src2.getValue());
        }
        else{
            System.out.println("Overflow error");
        }
    }
}
