package model;

import java.util.function.Consumer;

/**
 * Created by ncameron on 4/25/2017.
 */
public abstract class Command {

    private Consumer<String> function;
    private String arguments;

    Command(String arguments) {
        this.arguments = arguments;
    }

    public void apply() {
        function.accept(arguments);
    }
}
