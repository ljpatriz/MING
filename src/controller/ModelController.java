package controller;

import model.Core;
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
    List<Command> commands;

    public void assemble(String input) {
        this.assemble(CharStreams.fromString(input));
    }

    public void assemble(CharStream stream) {
        core = new Core();
        mipsLexer = new MipsLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(mipsLexer);
        mipsParser = new MipsParser(tokenStream);
        MipsParser.ProgramContext programContext = mipsParser.program();
        ParseTreeListener listener = new MipsCommandListener(core);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, programContext);
        commands = core.getCommandList();
    }

//    public void run(CharStream stream){
////        System.out.println(core.getCommandList());
//        core.runCommands();
//    }

    public void forward() {

    }

    public Iterator<Command> getCommandIterator() {
        return commands.iterator();
    }

    public List<Integer> getRegisterValues() {
        return core.getRegisterValues();
    }


}
