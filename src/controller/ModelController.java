/**
 * FileName: ModelController.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */

package controller;

import model.Core;
import model.MementoManager;
import model.Register;
import model.commands.Command;
import model.reading.MipsCommandListener;
import model.reading.MipsLexer;
import model.reading.MipsParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

/**
 * This class is responsible for being a controller between the MainController and the
 * Model. This code is critical for it protects access to the parser, lexer, core, and
 * commands.
 */
public class ModelController {
    private MipsLexer mipsLexer;
    private MipsParser mipsParser;

    private Core core;
    private MementoManager<Core> mementoManager;

    /**
     * Simple constructor, creates the core.
     */
    public ModelController(){
        core = new Core();
    }

    /**
     * Receives a string (not preferred source) representing the .asm file received from
     * the UI.
     * @param input - String (from the .asm file)
     */
    public void assemble(String input) {
        this.assemble(CharStreams.fromString(input));
    }

    /**
     * Receives a CharStream (the preferred source) representing the .asm file receieved
     * from the UI.
     * @param stream - CharStream (from the .asm file)
     */
    public void assemble(CharStream stream) {
        mipsLexer = new MipsLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(mipsLexer);
        mipsParser = new MipsParser(tokenStream);
        MipsParser.ProgramContext programContext = mipsParser.program();
        ParseTreeListener listener = new MipsCommandListener(core);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, programContext);
        core.resetRegisters();
        this.mementoManager = new MementoManager<>(core::clone, core::load);
    }

    public void forward() {
        if(this.canForward()) {
            mementoManager.saveState();
            core.executeCommand();
        }
    }

    public void backward(){
        if(this.canBackward()) {
            mementoManager.rewind();
            core.decrementPC();
        }
    }

    public boolean canForward(){
        return core.canExecute();
    }

    public boolean canBackward(){
        return mementoManager.rewindProperty().getValue();
    }

    public int getPC(){
        return this.core.getPC();
    }

    /**
     * Returns the values associated with the registers from the core.
     * @return - List<Integer>
     */
    public List<Integer> getRegisterValues() {
        return core.getRegisterValues();
    }

}
