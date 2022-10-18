
package com.cursoteste.left_right_app;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
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
public class CalculatorSum_6_NULLEntries 
{
    @Test
    public void sum_WHEN_givenLeftNull_WITH_valuesInsideLimit_MUST_returnNull()
    {
        // {} {1,2,3}; {} {0,9}
        int[] left = null;

        int right[] = {1,2,3};

        ArrayList<Integer> result = sum(left, right);

        assertNull(result);
        
    }

    @Test
    public void sum_WHEN_givenLeftNull_WITH_valuesAtLimit_MUST_returnNull()
    {
        int[] left = null;

        int right[] = {0,9};

        ArrayList<Integer> result = sum(left, right);

        assertNull(result);
        
        
    }

    @Test
    public void sum_WHEN_givenRightNull_WITH_valuesInsideLimit_MUST_returnNull()
    {
        // {} {1,2,3}; {} {0,9}
        int[] right = null;

        int left[] = {1,2,3};

        ArrayList<Integer> result = sum(left, right);

        assertNull(result);
        
    }

    @Test
    public void sum_WHEN_givenRightNull_WITH_valuesAtLimit_MUST_returnNull()
    {
        int[] right = null;

        int left[] = {0,9};

        ArrayList<Integer> result = sum(left, right);

        assertNull(result);
        
        
    }

}
