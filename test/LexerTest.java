import model.reading.MipsLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by larrypatrizio on 4/26/17.
 */
public class LexerTest {

    MipsLexer mipsgrammarLexer;
    @Before
    public void setUp() throws Exception {

        CharStream stream = CharStreams.fromFileName("/Users/larrypatrizio/Desktop/lexer_test.asm");
        mipsgrammarLexer = new MipsLexer(stream);
    }

    @Test
    public void testLexer() throws Exception {
        mipsgrammarLexer.getAllTokens().forEach(t->{
            System.out.println(t.getText());
        });
    }



}
