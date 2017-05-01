package model;

import model.util.Util;
import model.commands.Command;
import java.util.*;

/**
 * The core is an abstract representation of a MIPS processor,
 * In addition, it simulates the registers, memory, and control flow
 */
public class Core {
    /**
     * Stores the indicies of the registers in the Register list
     */
    private Map<String, Integer> registerIndices = new HashMap<>();

    /**
     * The list of registers
     */
    private List<Register> registers = new ArrayList<>();

    /**
     * The simulated stack, as a list
     */
    private ArrayList<Integer> stack = new ArrayList<>();

    /**
     * List of integers, functioning as memory
     */
    private ArrayList<Integer> memory = new ArrayList<>();

    /**
     * List of commands that stores the current MIPS command
     */
    private List<Command> commandList = new ArrayList<>();

    /**
     * Index of the command for current use
     */
    private Register programCounter;

    /**
     * low register
     */
    private Register lo;

    /**
     * high register
     */
    private Register hi;

    /**
     * map of the label to the command location for that label
     */
    private Map<String, Integer> labelMap= new HashMap<>();

    /**
     * default constructor for the core, initializes the registers
     */
    public Core(){
        populateRegisters();
    }


    /**
     * populates the reigsters and initializes the register indices function
     */
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

    /**
     * This function returns the list of commands in the program
     * @return
     */
    public List<Command> getCommandList() {
        return commandList;
    }

    /**
     * Gets the register object by the register name
     * @param registerName
     * @return
     */
    public Register getRegister(String registerName){
        return registers.get(registerIndices.get(registerName));
    }

    /**
     * gets the register by the index
     * @param index
     * @return
     */
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

    /**
     * returns the value stored at the location
     * @param loc
     * @return
     */
    public int getMemoryVal(int loc){
        return memory.get(loc/4);
    }

    /**
     * Sets a value of memory at a location
     * @param loc
     * @param val
     * @return
     */
    public int setMemoryVal(int loc, int val){
        Util.ensureSize(memory, 1 + loc/4);
        return memory.set(loc/4, val);
    }

    /**
     * Sets the program counter to the value at a label,
     * i.e. program jumps to that location
     * @param location
     */
    public void jumpToLabel(String location){
        this.programCounter.setValue(labelMap.get(location));
    }

    /**
     * Adds a label to a location
     * @param label
     * @param location
     */
    public void addLabel(String label, int location){
        labelMap.put(label, location);
    }

    /**
     * Sets the program counter to the given address
     * @param address
     */
    public void setPC(int address){
        if (address % 4 != 0) {
            //// TODO: 4/30/2017 error of some sort
        }
        this.programCounter.setValue(address/4);
    }

    /**
     * Runs the the commands in the command stack
     */
    public void runCommands(){
        for(programCounter.getValue();
            programCounter.getValue()<commandList.size();
            programCounter.setValue(programCounter.getValue()+1)){
            commandList.get(programCounter.getValue()).apply();
        }
    }

    /**
     * returns the program counter
     * @return
     */
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

    /**
     * Sets the list of commands to the given list
     * @param commandList
     */
    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }
}
