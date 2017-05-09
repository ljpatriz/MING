package model.commands;

import model.Core;

import java.util.function.Consumer;
import model.Register;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class LiCommand extends Command{
    Register dst;
    int immediate;
    public LiCommand(Core core, Register dst, int immediate) {
        super(core);
        this.dst = dst;
        this.immediate = immediate;
    }
    public void apply(){
        dst.setValue(immediate);
        System.out.println("set " + dst.getRegisterName() + " to: " + dst.getValue());
    }
}