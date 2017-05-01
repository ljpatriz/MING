package model.commands;

import model.Core;

import java.util.function.Function;

/**
 * This is an abstract class for a basic command that interacts with a core.
 * It is setup to have a default function that can be applied using the apply method
 * The apply method can also be overridden and implemented in another way
 * This is designed for use in a command pattern
 */
public abstract class Command {

    /**
     * The Core field, stores the core that this function is related to
     * This is not always necessary for every function
     */
    protected Core core;

    /**
     * This function is for use in a lambda expression
     * Not necessary in every command implementation
     */
    protected Function function;

    /**
     * Default initializaiton method
     * Takes in the Core parameter, which is the virtual core
     * @param core
     */
    public Command(Core core) {
        this.core = core;
    }

    /**
     * This runs the command that the class represents
     */
    public void apply() {
        function.apply(null);
    }
}
