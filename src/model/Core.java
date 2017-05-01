package model;

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
    private ArrayList<Integer> memory = new ArrayList<>();

    private List<Command> commandList = new ArrayList<>();
    private Register programCounter;
    private Register lo;
    private Register hi;
    private Map<String, Integer> labelMap= new HashMap<>();

    public Core(){
        populateRegisters();
    }


    public void populateRegisters() {
        programCounter = new Register("$pc", 0, true);
        lo = new Register("$lo", 0, true);
        hi = new Register("$hi", 0, true);



        List<String> registerNames = Arrays.asList("$zero", "$at", "$v0", "$v1", "$a0", "$a1",
                "$a2", "$a3", "$t0", "$t1", "$t2", "$t3", "$t4", "$t5", "$t6", "$t7", "$s0", "$s1",
                "$s2", "$s3", "$s4", "$s5", "$s6", "$s7", "$t8", "$t9", "$k0", "$k1", "$gp", "$sp",
                "$fp", "$ra");

        registerNames.forEach( s -> registers.add(new Register(s, 0, true)));

        registers.get(0).setModifiable(false);

        int registerIndex = 0;
        for (String name : registerNames) {
            registerIndices.put(name, registerIndex);
            registerIndices.put(String.format("$%d", registerIndex), registerIndex);
            registerIndex++;
        }


    }

    public List<Command> getCommandList() {
        return commandList;
    }

    public Register getRegister(String registerName){
        return registers.get(registerIndices.get(registerName));
    }

    public Register getRegister(int index) {
        return registers.get(index);
    }

    //// TODO: 4/30/2017 stack doesn't work right now
    public int getStackElement() {
        int spIndex = registerIndices.get("$sp");
        int sp = registers.get(spIndex).getValue();
        Util.ensureSize(stack, 1 + sp/4);
        return stack.get(sp);
    }

    public int getMemoryVal(int loc){
        return memory.get(loc/4);
    }

    public int setMemoryVal(int loc, int val){
        Util.ensureSize(memory, 1 + loc/4);
        return memory.set(loc/4, val);
    }

    public void jumpToLabel(String location){
        this.programCounter.setValue(labelMap.get(location));
    }

    public void addLabel(String label, int location){
        labelMap.put(label, location);
    }

    public void setPC(int address){
        if (address % 4 != 0) {
            //// TODO: 4/30/2017 error of some sort
        }
        this.programCounter.setValue(address/4);
    }

    public void runCommands(){
        for(programCounter.getValue();
            programCounter.getValue()<commandList.size();
            programCounter.setValue(programCounter.getValue()+1)){
            commandList.get(programCounter.getValue()).apply();
        }
    }

    public int getPC() {
        return 4*programCounter.getValue();
    }

    public int getLoValue() {
        return lo.getValue();
    }

    public int getHiValue() {
        return hi.getValue();
    }

    public void setLoValue(int value) {
        lo.setValue(value);
    }

    public void setHiValue(int value) {
        hi.setValue(value);
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }



}
