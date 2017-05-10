package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class DivCommand extends Command {
    Register src1;
    Register src2;

    public DivCommand(Core core, Register src1, Register src2){
        super(core);
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public void apply() {
        core.setLoValue(src1.getValue() / src2.getValue());
        core.setHiValue(src1.getValue() % src2.getValue());
    }
}
