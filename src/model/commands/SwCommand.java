package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
public class SwCommand extends Command {
    public SwCommand(String arguments, Core core) {
        super(arguments, core);
        this.function = s -> {
            s.replaceAll(", "," ");
            //	sw register_source, RAM_destination
            String[] split = s.split(" ");
            String register_source = split[0];
            String RAM_destination = split[1];
            core.setMemoryVal(Integer.valueOf(RAM_destination), core.getRegister(register_source).getValue());
        };
    }
}
