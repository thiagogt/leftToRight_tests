package com.cursoteste.left_right_app;

/**
 * NumberAllowed
 */
public class NumberAllowed {

    private final int value;

    public NumberAllowed(int value){
        
        if(value < 0 || value > 9)
            throw new IllegalArgumentException(value +" is not a valid number for this domain!");
        
        this.value = value;
    }

    public int sum(NumberAllowed numberAllowed){

        return (this.value + numberAllowed.getValue());

    }

    public int getValue(){
        return this.value;
    }
}