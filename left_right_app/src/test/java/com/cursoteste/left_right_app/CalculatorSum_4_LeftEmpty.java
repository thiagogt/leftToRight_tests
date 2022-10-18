
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
public class CalculatorSum_4_LeftEmpty 
{
    
    @Test
    public void sum_WHEN_givenLeftEmpty_WITH_valuesInsideLimit_MUST_returnLeft()
    {
        // {} {1,2,3}; {} {0,9}
        int[] left = {};

        int right[] = {1,2,3};

        ArrayList<Integer> result = sum(left, right);

        assertTrue(result.size() == 3);
        assertEquals(1,result.get(0));
        assertEquals(2,result.get(1));
        assertEquals(3,result.get(2));
    }

    @Test
    public void sum_WHEN_givenLeftEmpty_WITH_valuesAtLimit_MUST_returnLeft()
    {
        int[] left = {};

        int right[] = {0,9};

        ArrayList<Integer> result = sum(left, right);

        assertTrue(result.size() == 2);
        assertEquals(0,result.get(0));
        assertEquals(9,result.get(1));
        
    }

}
