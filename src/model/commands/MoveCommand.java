package model.commands;

import model.Core;
import model.Register;

import java.util.function.Consumer;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class MoveCommand extends Command{
    Register dest;
    Register src;
    public MoveCommand(Core core, Register dest, Register src) {
        super(core);
        this.dest = dest;
        this.src = src;
    }

    public void apply(){
        dest.setValue(src.getValue());
    }
}
