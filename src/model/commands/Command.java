package model.commands;

import model.Core;

import java.util.function.Function;

/**
 * Created by ncameron on 4/25/2017.
 */
public abstract class Command {

    protected Core core;
    protected Function function;

    public Command(Core core) {
        this.core = core;
    }

    public void apply() {
        function.apply(null);
    }
}
