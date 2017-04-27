package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
public class OriCommand extends Command {
    public OriCommand(String arguments, Core core) {
        super(arguments, core);
        this.function = s -> {
            s.replaceAll(", "," ");
            String[] split = s.split(" ");
            String dest = split[0];
            String src = split[1];
            String immediate = split[2];
            int val = Integer.valueOf(immediate);
            core.getRegister(dest).setValue((core.getRegister(src).getValue()|val));
        };
    }
}
