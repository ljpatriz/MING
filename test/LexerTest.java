import model.Core;
import model.commands.LoadImmediateCommand;
import model.commands.MoveCommand;
import model.reading.mipsgrammarLexer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by larrypatrizio on 4/26/17.
 */
public class LexerTest {

    mipsgrammarLexer mipsgrammarLexer;
    @Before
    public void setUp() throws Exception {

        CharStream stream = CharStreams.fromFileName("/Users/larrypatrizio/Desktop/lexer_test.asm");
        mipsgrammarLexer = new mipsgrammarLexer(stream);
    }

    @Test
    public void testLexer() throws Exception {
        mipsgrammarLexer.getAllTokens().forEach(t->{
            System.out.println(t.getText());
        });
    }



}
