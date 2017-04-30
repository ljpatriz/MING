import model.Core;
import model.commands.*;
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
        MoveCommand moveCommand = new MoveCommand(testCore, testCore.getRegister("$v0"), testCore.getRegister("$v1"));
        moveCommand.apply();
        Assert.assertEquals(testCore.getRegister(2).getValue(),testCore.getRegister(3).getValue());
    }

    @Test
    public void testLICommand() throws Exception {
        LiCommand liCommand = new LiCommand(testCore, testCore.getRegister("$v0"),5);
        liCommand.apply();
        Assert.assertEquals(testCore.getRegister(2).getValue(),5);
    }

    @Test
    public void testAddCommand() throws Exception {
        testCore.getRegister("$v1").setValue(1);
        testCore.getRegister("$a0").setValue(2);
        AddCommand addCommand = new AddCommand(testCore, testCore.getRegister("$v0"),testCore.getRegister("$v1"),testCore.getRegister("$a0"));
        addCommand.apply();
        Assert.assertEquals(testCore.getRegister("$v0").getValue(),3);
    }

    @Test
    public void testAddiCommand() throws Exception {
        //TODO: Larry - 4/30: AddiCommand not implemented
    }

    @Test
    public void testAddiuCommand() throws Exception {
        //TODO: Larry - 4/30: AddiuCommand not implemented
    }

    @Test
    public void testAdduCommand() throws Exception {
        //TODO: Larry - 4/30: AdduCommand not implemented
    }




}
