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
 * Created by larrypatrizio on 4/25/17.
 */
public class ModelController {
    MipsLexer mipsLexer;
    Core core;
    MipsParser mipsParser;

    private MementoManager<Core> mementoManager;
    ListIterator<Command> iterator;

    public ModelController(){
        core = new Core();
    }
    public void assemble(String input) {
        this.assemble(CharStreams.fromString(input));
    }

    public void assemble(CharStream stream) {
        mipsLexer = new MipsLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(mipsLexer);
        mipsParser = new MipsParser(tokenStream);
        MipsParser.ProgramContext programContext = mipsParser.program();
        ParseTreeListener listener = new MipsCommandListener(core);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, programContext);
        this.mementoManager = new MementoManager<>(core::clone, core::load);
        iterator = core.getCommandList().listIterator();
    }

//    public void run(CharStream stream){
////        System.out.println(core.getCommandList());
//        core.runCommands();
//    }

    public void forward() {
        Command command = iterator.next();
        mementoManager.saveState();
        command.apply();
    }

    public void backward(){
        mementoManager.rewind();
        iterator.previous();
    }

    public boolean canForward(){
        return iterator.hasNext();
    }

    public boolean canBackward(){
        System.out.println(mementoManager.rewindProperty().getValue());
        return mementoManager.rewindProperty().getValue();
    }

    public List<Integer> getRegisterValues() {
        return core.getRegisterValues();
    }


}
