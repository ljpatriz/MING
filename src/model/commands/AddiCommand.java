/**
 * FileName: AddiCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class AddiCommand extends Command {
    Register dest;
    Register src;
    int immediate;
    public AddiCommand(Core core, Register dest, Register src, int immediate) {
        super(core);
        this.dest = dest;
        this.src = src;
        this.immediate = immediate;
    }

    public void apply(){
        dest.setValue(src.getValue() + immediate);
        System.out.println(dest.getValue());
    }
}
