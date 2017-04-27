import model.Core;
import model.commands.LoadImmediateCommand;
import model.commands.MoveCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by larrypatrizio on 4/26/17.
 */
public class CommandTest {
    Core testCore;
    @Before
    public void setUp() throws Exception {
        testCore = new Core();
    }

    @Test
    public void testMoveCommand() throws Exception {
        testCore.getRegister(3).setValue(5);
        MoveCommand moveCommand = new MoveCommand("$v0 $v1",testCore);
        moveCommand.apply();
        Assert.assertEquals(testCore.getRegister(2).getValue(),testCore.getRegister(3).getValue());
    }

    @Test
    public void testLoadImmediateCommand() throws Exception {
        LoadImmediateCommand loadImmediateCommand = new LoadImmediateCommand("$v0 5",testCore);
        loadImmediateCommand.apply();
        Assert.assertEquals(testCore.getRegister(2).getValue(),5);
    }



}
