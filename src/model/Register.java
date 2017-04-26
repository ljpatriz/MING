package model;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class Register {
    private String registerName;
    private int value;
    private boolean modifiable;


    public Register(String registerName, int value, boolean modifiable){
        this.registerName = registerName;
        this.value = value;
        this.modifiable = modifiable;
    }

    //// TODO: 4/25/2017 find a better way to do this
    public void setModifiable(boolean value) {
        this.modifiable = value;
    }


    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
