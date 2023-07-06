package com.example.java.utilities;

public class MathHelper {
    public static final String ADD="add";
    public static final String SUB="substraction";
    private int total;
    public MathHelper(){
        System.out.println("Constructor called");
        total=50;
    }
    public MathHelper(int total){
        this();                      //call the no arguments constructor
        this.total+=total;      //arguments no arg cons. + from main = equal new value
    }

    public void setTotal(int _total) {
        this.total = _total;
    }

    public int getTotal() {
        return total;
    }
    public int doMath(String prompt, String operation){
        String input=InputHelfer.getInput(prompt);
        int value=Integer.parseInt(input);
        switch (operation){
            case ADD:
                total+=value; break;
            case SUB:
                total-=value; break;
        }
        return value;
    }

    public int addNumber(String prompt) throws NumberFormatException {
        String input = InputHelfer.getInput(prompt);
        int value = Integer.parseInt(input);
        total += value;
        return value;
    }
}
