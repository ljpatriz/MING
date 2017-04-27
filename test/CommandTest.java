import model.Core;
import model.commands.MoveCommand;
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
    public void testMoveCommand1() throws Exception {

        testCore.getRegister(3).setValue(5);
        System.out.println(testCore.getRegister(3).getRegisterName() + "->" + testCore.getRegister(3).getValue());
        MoveCommand moveCommand = new MoveCommand("$v0 $v1",testCore);
        moveCommand.apply();
        System.out.println(testCore.getRegister(2).getRegisterName()+ "->" +testCore.getRegister(2).getValue());
    }

}
