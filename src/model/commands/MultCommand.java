package model.commands;

import model.Core;
import model.Register;

/**
 * Created by ncameron on 4/27/2017.
 */
public class MultCommand extends Command {
    //// TODO: 4/28/2017 figure out how to represent HI and LO registers
    Register src;
    Register src2;
    //TODO differentiate between Mul nd Mult
    //// TODO: 4/28/2017 it's in the mips help manual and in the github page
    //// TODO: 4/28/2017 more disappointment
    /*
                                 __
                       _ ,___,-'",-=-.
           __,-- _ _,-'_)_  (""`'-._\ `.
        _,'  __ |,' ,-' __)  ,-     /. |
      ,'_,--'   |     -'  _)/         `\
    ,','      ,'       ,-'_,`           :
    ,'     ,-'       ,(,-(              :
         ,'       ,-' ,    _            ;
        /        ,-._/`---'            /
       /        (____)(----. )       ,'
      /         (      `.__,     /\ /,
     :           ;-.___         /__\/|
     |         ,'      `--.      -,\ |
     :        /            \    .__/
      \      (__            \    |_
       \       ,`-, *       /   _|,\
        \    ,'   `-.     ,'_,-'    \
       (_\,-'    ,'\")--,'-'       __\
        \       /  // ,'|      ,--'  `-.
         `-.    `-/ \'  |   _,'         `.
            `-._ /      `--'/             \
               ,'           |              \
              /             |               \
           ,-'              |               /
          /                 |             -'
     */

    public MultCommand(Core core, Register src, Register src2) {
        super(core);
        this.src = src;
        this.src2 = src2;
    }

    public void apply(){
        //// TODO: 4/28/2017 do things with HI and LO
    }}
