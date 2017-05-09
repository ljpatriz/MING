package model;

import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.beans.property.ReadOnlyBooleanWrapper;

import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * MementoManager manages state information, and allows for rewinding and
 * fastforwarding between states.
 * @param <S> the state type
 */
public class MementoManager<S> {

    /** The stack of prior states. */
    private Stack<S> prevStates;
    /** The stack of future states. */
    private Stack<S> futureStates;
    // the current state is stored in the application itself and thus the program
    // should save its state before undergoing changes that should be undoable

    /** Whether we can rewind to a previous state. */
    private ReadOnlyBooleanWrapper canRewind;
    /** Whether we can fastforward to a future state. */
    private ReadOnlyBooleanWrapper canFastforward;

    /** The state supplier function which gives the state of the program. */
    private Supplier<S> stateSupplier;
    /** The state consumer function which applies stored states to the program. */
    private Consumer<S> stateConsumer;

    /**
     * Creates a memento manager with the given functions.
     * @param stateSupplier a function to supply mementos
     * @param stateConsumer a function to load stored mementos
     */
    public MementoManager(Supplier<S> stateSupplier, Consumer<S> stateConsumer) {
        this.canRewind = new ReadOnlyBooleanWrapper(false);
        this.canFastforward = new ReadOnlyBooleanWrapper(false);

        this.stateSupplier = stateSupplier;
        this.stateConsumer = stateConsumer;

        this.clear();
    }

    /**
     * Gets the current state of the program.
     * @return return the current state
     */
    public S getCurrentState() {
        return this.stateSupplier.get();
    }

    /** Saves the current state of the program to the previous states and clears the
     * future states. */
    public void saveState() {
        this.prevStates.push(this.getCurrentState());
        this.futureStates.clear();
        this.canFastforward.set(false);
        this.canRewind.set(true);
    }

    /** Unapplies the latest state and reverts to the one just before. The unapplied
     * state is moved to the future states. */
    public void rewind() {
        if (!this.canRewind.get()) {
            throw new IllegalStateException("Cannot rewind, no previous state found");
        }

        this.futureStates.push(this.getCurrentState());
        this.restore(this.prevStates.pop());

        this.canFastforward.set(true);
        if (this.prevStates.empty()) {
            this.canRewind.set(false);
        }
    }

    /** Applies the nearest future state. The current state is moved to the previous
     * states.  */
    public void fastforward() {
        if (!this.canFastforward.get()) {
            throw new IllegalStateException("Cannot fastforward, no future state found");
        }

        this.prevStates.push(this.getCurrentState());
        this.restore(this.futureStates.pop());

        this.canRewind.set(true);
        if (this.futureStates.empty()) {
            this.canFastforward.set(false);
        }
    }

    /** Restores to the given state. */
    private void restore(S state) {
        this.stateConsumer.accept(state);
    }

    /** Resets the MementoManager */
    public void clear() {
        this.prevStates = new Stack<>();
        this.futureStates = new Stack<>();

        this.canRewind.set(false);
        this.canFastforward.set(false);
    }

    /**
     * Returns a read only boolean of whether the program can rewind.
     * @return the property
     */
    public ReadOnlyBooleanProperty rewindProperty(){
        return this.canRewind.getReadOnlyProperty();
    }

    /** Returns a read only booleaen of whether the program can fastforward.
     *  @return the property
     */
    public ReadOnlyBooleanProperty fastforwardProperty(){
        return this.canFastforward.getReadOnlyProperty();
    }



}
