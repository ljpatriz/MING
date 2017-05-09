package model.commands;

import model.Core;

import java.util.function.Consumer;

/**
 * Created by Jacob on 26/04/17.
 */
public class ORICommand extends Command{
    ORICommand(String arguments, Core core) {
        super(arguments, core);
        Consumer<String> function = s -> {
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
