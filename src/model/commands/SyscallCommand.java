/**
 * FileName: SysCallCommand.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model.commands;

import model.Core;

public class SyscallCommand extends Command {
    public SyscallCommand(Core core) {
        super(core);
    }
    public void apply(){
        int v0RegisterValue = core.getRegister("$v0").getValue();
        switch(v0RegisterValue){
            case 1:
                System.out.println(core.getRegister("$a0").getValue());

            case 5:
                System.out.println("Enter an integer: ");
                int userInt = Integer.valueOf(System.console().readLine());
                core.getRegister("$v0").setValue(userInt);
            case 10:
                //sets the ProgramCounter to the last command (which is a no op command)
                core.setPC(core.getCommandList().size()-1);
        }}
}
