import model.Core;
import model.reading.MipsCommandListener;
import model.reading.MipsLexer;
import model.reading.MipsParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by larrypatrizio on 4/26/17.
 */
public class AntlrTest {

    String testDirectory = System.getProperty("user.dir") + "/test/resources/";
    MipsLexer mipsLexer;
    Core core;
    MipsParser mipsParser;

    @Before
    public void setUp() throws Exception {
        core = new Core();

        CharStream stream = CharStreams.fromFileName(testDirectory+"addi.asm");
        mipsLexer = new MipsLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(mipsLexer);
        mipsParser = new MipsParser(tokenStream);
    }

    @Test
    public void testLexer() throws Exception {
        mipsLexer.getAllTokens().forEach(t->{
            System.out.println(t.getText());
        });
    }

    @Test
    public void jgiroehg() throws Exception {
        String larry = "sucks";
        System.out.println(larry.getBytes());
        //System.out.println(Byte.valueOf(larry).intValue());
        for (int i = 0; i < larry.getBytes().length; i++) {
            System.out.println(larry.getBytes()[i]);
        }
        System.out.println();


        String larrysucks = new String(larry.getBytes());
        System.out.println(larrysucks);
        //System.out.println(String.valueOf(Byte.valueOf(larry).intValue()));
    }

    @Test
    public void testParser() throws Exception {
        MipsParser.ProgramContext programContext = mipsParser.program();
        ParseTreeListener listener = new MipsCommandListener(core);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, programContext);
    }

}
