package model.commands;

import model.Core;

import java.util.function.Consumer;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class MoveCommand extends Command{

    MoveCommand(String arguments, Core core) {
        super(arguments, core);

        Consumer<String> function = s -> {
            String[] split = s.split(" ");
            String dest = split[0];
            String source = split[1];

            core.getRegister(dest).set(core.getRegister(source).value());
        };

    }


}
