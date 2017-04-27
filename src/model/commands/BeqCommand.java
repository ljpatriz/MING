package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
public class BeqCommand extends Command {
    public BeqCommand(String arguments, Core core) {
        super(arguments, core);
        //$t0,$t1,target	#  branch to target if  $t0 = $t1
        this.function = s -> {
            s.replaceAll(", "," ");
            String[] split = s.split(" ");
            String src1 = split[0];
            String src2 = split[1];
            String target = split[2];
            if(core.getRegister(src1).getValue() == core.getRegister(src2).getValue())
                core.setCommandLocation(Integer.valueOf(target));
        };
    }
}
