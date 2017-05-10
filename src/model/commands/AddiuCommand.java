/**
 * FileName: AddiuCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;
import model.util.Util;

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
        }
    }
}
