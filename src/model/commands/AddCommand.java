package model.commands;


import model.Core;

public class AddCommand extends Command {
    public AddCommand(String arguments, Core core) {
        super(arguments, core);

        this.function = s -> {
            s.replaceAll(", "," ");
            String[] split = s.split(" ");
            String dest = split[0];
            String src = split[1];
            String src2 = split[2];
            core.getRegister(dest).setValue(core.getRegister(src).getValue() + core.getRegister(src2).getValue());
        };
    }
}
