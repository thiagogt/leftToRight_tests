package com.cursoteste.left_right_app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    
    public static ArrayList<Integer> sum(int[] leftArray, int[] rightArray){

        if(leftArray == null || rightArray == null)
            return null;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        for(; i < leftArray.length; i++){
            NumberAllowed leftAllowed = new NumberAllowed(leftArray[i]);
            
            NumberAllowed rightAllowed = new NumberAllowed(0);
            if(rightArray.length > i)
                rightAllowed = new NumberAllowed(rightArray[i]);

            result.add((Integer)leftAllowed.sum(rightAllowed));
        }

        if(rightArray.length > i){
            for(; i < rightArray.length; i++){
                NumberAllowed right = new NumberAllowed(rightArray[i]);
                result.add(right.getValue());
            }
        }

        return result;

    }


}