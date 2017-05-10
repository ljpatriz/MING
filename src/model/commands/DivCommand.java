/**
 * FileName: DivCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;

public class DivCommand extends Command {
    Register src1;
    Register src2;

    public DivCommand(Core core, Register src1, Register src2){
        super(core);
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public void apply() {
        core.setLoValue(src1.getValue() / src2.getValue());
        core.setHiValue(src1.getValue() % src2.getValue());
    }
}
