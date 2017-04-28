package model;

import javafx.scene.layout.Region;
import model.util.Util;
import model.commands.Command;
import java.util.*;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class Core {
    private Map<String, Integer> registerIndices = new HashMap<>();
    private List<Register> registers = new ArrayList<>();
    private ArrayList<Integer> stack = new ArrayList<>();
    private List<Integer> memory = new ArrayList<>();

    private List<Command> commandList = new ArrayList<>();
    private int commandLocation;
    private Map<String, Integer> labelMap= new HashMap<>();
    public Core(){
        populateRegisters();
    }


    public void populateRegisters() {
        List<String> registerNames = Arrays.asList("$zero", "$at", "$v0", "$v1", "$a0", "$a1",
                "$a2", "$a3", "$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$s0", "$s1",
                "$s2", "$s3", "$s4", "$s5", "$s6", "$s7", "$t8", "$t9", "$k0", "$k1", "$gp", "$sp",
                "$fp", "$ra");

        registerNames.forEach( s -> {
            registers.add(new Register(s, 0, true));
        });

        registers.get(0).setModifiable(false);
        registers.get(1).setModifiable(false);

        int registerIndex = 0;
        for (String name : registerNames) {
            registerIndices.put(name, registerIndex);
            registerIndices.put(String.format("$%d", registerIndex), registerIndex);
            registerIndex++;
        }

    }

    public Register getRegister(String registerName){
        return registers.get(registerIndices.get(registerName));
    }

    public Register getRegister(int index) {
        return registers.get(index);
    }

    public int getStackElement() {
        //// TODO: 4/25/2017 should we implement a max stack size?
        //// TODO: 4/25/2017 if we want to be faithful to MIPS we should
        int spIndex = registerIndices.get("$sp");
        int sp = registers.get(spIndex).getValue();
        Util.ensureSize(stack, 1 + sp/4);
        return stack.get(sp);
    }

    public int getMemoryVal(int loc){
        return memory.get(loc);
    }

    public int setMemoryVal(int loc, int val){
        return memory.set(loc, val);
    }

    public void setCommandLocation(String location){
        this.commandLocation = labelMap.get(location);
    }

    public void setCommandLocation(int location){
        this.commandLocation = location;
    }
}
