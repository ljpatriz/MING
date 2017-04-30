package model;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class Register {
    //// TODO: 4/29/2017 storing the name is data duplication and useless
    private String registerName;
    //// TODO: 4/29/2017 why is register an object in the first place? Should it be?
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


}
