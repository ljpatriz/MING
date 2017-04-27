package model.commands;

import model.Core;

import java.util.function.Consumer;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class LoadImmediateCommand extends Command{

    public LoadImmediateCommand(String arguments, Core core) {
        super(arguments, core);

        this.function = s -> {
            s.replaceAll(", *"," ");
            String[] split = s.split(" ");
            String dest = split[0];
            int value = Integer.parseInt(split[1]);
            core.getRegister(dest).setValue(value);
        };

    }


}