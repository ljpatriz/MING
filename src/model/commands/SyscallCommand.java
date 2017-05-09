package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SyscallCommand extends Command {
    public SyscallCommand(Core core) {
        super(core);
    }
    public void apply(){
        int v0RegisterValue = core.getRegister("$v0").getValue();
        switch(v0RegisterValue){
            case 1:
                //TODO: Larry - eventually connect this to the UI
                System.out.println(core.getRegister("$a0").getValue());

            case 5:
                //TODO: Larry - eventually connect this to the UI
                System.out.println("Enter an integer: ");
                int userInt = Integer.valueOf(System.console().readLine());
                core.getRegister("$v0").setValue(userInt);
            case 10:
                //sets the ProgramCounter to the last command (which is a no op command)
                core.setPC(core.getCommandList().size()-1);
        }}
}
