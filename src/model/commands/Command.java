package model.commands;

import model.Core;

import java.util.function.Consumer;

/**
 * Created by ncameron on 4/25/2017.
 */
public abstract class Command {

    private Core core;

    protected Consumer<String> function;
    private String arguments;

    public Command(String arguments, Core core) {
        this.core = core;
        this.arguments = arguments;
    }

    public void apply() {
        function.accept(arguments);
    }
}
