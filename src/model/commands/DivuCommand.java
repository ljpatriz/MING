package model.commands;

import model.Core;
import model.Register;
import model.util.Util;

/**
 * Created by ncameron on 4/27/2017.
 */
public class DivuCommand extends Command{
    Register src1;
    Register src2;

    public DivuCommand(Core core, Register src1, Register src2){
        super(core);
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public void apply() {
        if(!Util.checkOverflow(src1.getValue() / src2.getValue())){
            core.setLoValue(src1.getValue() / src2.getValue());
            core.setHiValue(src1.getValue() % src2.getValue());
        }
        else{
            System.out.println("Overflow error");
            //TODO: Larry - overflow error handling
        }
    }
}
