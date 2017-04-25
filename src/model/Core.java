package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by larrypatrizio on 4/25/17.
 */
public class Core {
    private Map<String, Integer> registerIndices = new HashMap<>();
    private List<Register> registers = new ArrayList<>();
    private List<Integer> stack = new ArrayList<>();
    private List<Integer> memory = new ArrayList<>();


    public void populateRegisterIndices(){
        registerIndices.put("$zero", ZERO_REGISTER);
        registerIndices.put("$0", ZERO_REGISTER);

    }

    public Register getRegister(String registerName){
        registers.get(registerIndices.get(registerName));
    }

}
