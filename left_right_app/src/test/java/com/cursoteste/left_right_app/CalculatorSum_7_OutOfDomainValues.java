
package com.cursoteste.left_right_app;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static com.cursoteste.left_right_app.Calculator.sum;

import org.junit.jupiter.api.Test;

/**
 * * 
 * -----------------
 * -- Subdomains: --
 * -----------------
 * 
 * -- INPUTS --
 * - OutOfDomain: [MIN_INT, ...... , -1 ] ----------- [10, ......., MAX_INT]
 * - LimitOfDomain : 0 to 9
 *
 * - same space from left to right  -- {1,2,3} {1,2,3}; {0,9} {1,2}; {1,2} {0,9}; {0,0,9} {9,9,0}
 * - left bigger than right         -- {1,2,3,4} {1,2,3}; {0,2,3,9} {1,2,3}; {1,2,3,4} {9,2,0}; {0,9,0,0} {9,9,9} 
 * - right bigger than left         -- {1,2,3,4} {1,2,3,4,5}; {0,2,3,9} {1,2,3,4,5}; {1,2,3,4} {0,2,3,4,9}; {0,2,3,9} {0,2,3,4,9}
 * - left array empty               -- {} {1,2,3}; {} {0,9}
 * - right array empty              -- {1,2,3} {};  {0,9} {}
 * - left array null                -- null {1,2,3}; null {0,9}
 * - right array null               -- {1,2,3} null; {0,9} null
 * 
 * -- OUTPUTS --
 * -- positive numbers -- [0,18]
 * -- zero 
 * -- null
 * -- IllegalArgumentException.
 */
public class CalculatorSum_7_OutOfDomainValues 
{

    @Test
    public void sum_WHEN_givenOutOfDomainValuesOnRight_WITH_valuesBelow_Zero_MUST_throwIllegalArgumentException()
    {
        int[] left_1 = {1,2,3};

        int right_1[] = {1,2,-1};

        ArrayList<Integer> result = sum(left_1, right_1);

        try{
            result = sum(left_1, right_1);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }

        int[] left_2 = {1,2,3};

        int right_2[] = {1,2, Integer.MIN_VALUE};

        try{
            result = sum(left_2, right_2);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }
        
    }

    @Test
    public void sum_WHEN_givenOutOfDomainValuesOnRight_WITH_valuesGreaterThan_9_MUST_throwIllegalArgumentException()
    {
        int[] left_1 = {1,2,3};

        int right_1[] = {1,2,10};

        ArrayList<Integer> result = sum(left_1, right_1);

        try{
            result = sum(left_1, right_1);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }

        int[] left_2 = {1,2,3};

        int right_2[] = {1,2, Integer.MAX_VALUE};

        try{
            result = sum(left_2, right_2);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void sum_WHEN_givenOutOfDomainValuesOnLeft_WITH_valuesBelow_Zero_MUST_throwIllegalArgumentException()
    {
        int[] right_1 = {1,2,3};

        int left_1[] = {1,2,-1};

        ArrayList<Integer> result = sum(left_1, right_1);

        try{
            result = sum(left_1, right_1);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }

        int[] right_2 = {1,2,3};

        int left_2[] = {1,2, Integer.MIN_VALUE};

        try{
            result = sum(left_2, right_2);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

    @Test
    public void sum_WHEN_givenOutOfDomainValuesOnLeft_WITH_valuesGreaterThan_9_MUST_throwIllegalArgumentException()
    {
        int[] right_1 = {1,2,3};

        int left_1[] = {1,2,10};

        ArrayList<Integer> result = sum(left_1, right_1);

        try{
            result = sum(left_1, right_1);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }

        int[] right_2 = {1,2,3};

        int left_2[] = {1,2, Integer.MAX_VALUE};

        try{
            result = sum(left_2, right_2);
            assertFalse(true);
        }
        catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

}
