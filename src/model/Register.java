/**
 * FileName: Register.java
 * Project: CS 461 Final Project
 * Date: Wednesday, May 10, 2017
 * Authors: Jake Adamson, Nick Cameron, Larry Patrizio
 */
package model;

public class Register {
    private String registerName;
    private int value;
    private boolean modifiable;
    public Register(String registerName, int value, boolean modifiable){
        this.registerName = registerName;
        this.value = value;
        this.modifiable = modifiable;
    }
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }
    public String getRegisterName(){
        return this.registerName;
    }

    public void setValue(int value){
        if(modifiable)
            this.value = value;
    }
    public int getValue(){
        return this.value;
    }
    public Register clone(){
        return new Register(registerName, value, modifiable);
    }
}
