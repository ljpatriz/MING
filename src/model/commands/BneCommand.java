package model.commands;

import model.Core;
import model.Register;
/**
 * Created by ncameron on 4/27/2017.
 */
public class BneCommand extends Command {
    Register src1;
    Register src2;
    int targetLoc;
    public BneCommand(String arguments, Core core) {//TODO make the
        super(arguments, core);
        arguments.replaceAll(", "," ");
        String[] split = arguments.split(" ");
        src1 = core.getRegister(split[0]);
        src2 = core.getRegister(split[1]);
        targetLoc = Integer.valueOf(split[2]);
        this.function = s -> {
            if(src1.getValue() != src2.getValue())
                core.setCommandLocation(targetLoc);
        };
    }
}
