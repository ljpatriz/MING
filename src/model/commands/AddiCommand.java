package model.commands;


import model.Core;

public class AddiCommand extends Command {
    public AddiCommand(String arguments, Core core) {
        super(arguments, core);

        this.function = s -> {
            s.replaceAll(", "," ");
            String[] split = s.split(" ");
            String dest = split[0];
            String src = split[1];
            String immediate = split[2];
            core.getRegister(dest).setValue(core.getRegister(src).getValue() + Integer.valueOf(immediate));
        };
    }
}
