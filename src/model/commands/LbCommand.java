/**
 * FileName: LbCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;
import model.Register;
public class LbCommand extends Command {
    public LbCommand(Core core, Register dst, int memLocation) {
        super(core);
    }
}
