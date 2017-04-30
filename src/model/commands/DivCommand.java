package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class DivCommand extends Command {
    //// TODO: 4/28/2017 jake i'm disappointed
    //// TODO: 4/28/2017 i told you to look at the github or the MARS help dialog
    //// TODO: 4/28/2017 leaving this as it is for now so you can feel ashamed
    //// TODO: 4/28/2017 this is not how div works in mips
    //// TODO: 4/28/2017 it doesn't take 3 registers, and it interacts with the HI and LO registers

    /*
                                                         ___,------,
             _,--.---.                         __,--'         /
           ,' _,'_`._ \                    _,-'           ___,|
          ;--'       `^-.                ,'        __,---'   ||
        ,'               \             ,'      _,-'          ||
       /                  \         _,'     ,-'              ||
      :                    .      ,'     _,'                 |:
      |                    :     `.    ,'                    |:
      |           _,-      |       `-,'                      ::
     ,'____ ,  ,-'  `.   , |,         `.                     : \
     ,'    `-,'       ) / \/ \          \                     : :
     |      _\   o _,-'    '-.           `.                    \ \
      `o_,-'  `-,-' ____   ,` )-.______,'  `.                   : :
       \-\    _,---'    `-. -'.\  `.  /     `.                  \  \
        / `--'             `.   \   \:        \                  \,.\
       (              ____,  \  |    \\        \                 :\ \\
        )         _,-'    `   | |    | \        \                 \\_\\
       /      _,-'            | |   ,'-`._      _\                 \,'
       `-----' |`-.           ;/   (__ ,' `-. _;-'`\           _,--'
     ,'        |   `._     _,' \-._/  Y    ,-'      \      _,-'
    /        _ |      `---'    :,-|   |    `     _,-'\_,--'   \
   :          `|       \`-._   /  |   '     `.,-' `._`         \
   |           _\_    _,\/ _,-'|                     `-._       \
   :   ,-         `.-'_,--'    \                         `       \
   | ,'           ,--'      _,--\           _,                    :
    )         .    \___,---'   ) `-.____,--'                      |
   _\    .     `    ||        :            \                      ;
 ,'  \    `.    )--' ;        |             `-.                  /
|     \     ;--^._,-'         |                `-._            _/_\
\    ,'`---'                  |                    `--._____,-'_'  \
 \_,'                         `._                          _,-'     `
                            ,-'  `---.___           __,---'
                          ,'             `---------'
                        ,'
     */
    // Preserving this for your shame
//    Register dest;
//    Register src;
//    Register src2;
//    public DivCommand(Core core, Register dest, Register src, Register src2) {
//        super(core);
//        this.dest = dest;
//        this.src = src;
//        this.src2 = src2;
//    }
//
//    public void apply(){
//        dest.setValue(src.getValue() / src2.getValue());
//    }

    Register src1;
    Register src2;

    public DivCommand(Core core, Register src1, Register src2){
        super(core);
        this.src1 = src1;
        this.src2 = src2;
    }

    @Override
    public void apply() {
        core.setLoValue(src1.getValue() / src2.getValue());
        core.setHiValue(src1.getValue() % src2.getValue());
    }
}
