package model.commands;

import model.Core;

/**
 * Created by ncameron on 4/27/2017.
 */
public class BgezCommand extends Command {

    public BgezCommand(String arguments, Core core) {
        super(arguments, core);
        //$t0,$t1,target	#  branch to target if  $t0 = $t1
        this.function = s -> {
            s.replaceAll(", "," ");
            String[] split = s.split(" ");
            String src1 = split[0];//TODO is this the proper syntax
            String target = split[1];
            if(core.getRegister(src1).getValue() >= 0)
                core.setCommandLocation(Integer.valueOf(target));
        };
    }
}
