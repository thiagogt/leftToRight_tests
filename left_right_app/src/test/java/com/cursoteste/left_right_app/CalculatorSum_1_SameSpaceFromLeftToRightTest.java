
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
public class CalculatorSum_1_SameSpaceFromLeftToRightTest 
{
    @Test
    public void sum_WHEN_givenSameSpaceFromLeftToRight_WITH_valuesInsideLimit_MUST_returnListWithSameSize()
    {
        int[] left_1 = {1,2,3};

        int right_1[] = {1,2,3};

        ArrayList<Integer> result = sum(left_1, right_1);

        assertTrue(result.size() == 3);
        assertEquals(2,result.get(0));
        assertEquals(4,result.get(1));
        assertEquals(6,result.get(2));
    }
    @Test
    public void sum_WHEN_givenSameSpaceFromLeftToRight_WITH_valuesLeftOnLimit_MUST_returnListWithSameSize()
    {
    
        int[] left_2 = {0,9};

        int right_2[] = {1,2};

        ArrayList<Integer> result = sum(left_2, right_2);

        assertTrue(result.size() == 2);
        assertEquals(1,result.get(0));
        assertEquals(11,result.get(1));
    }
    @Test
    public void sum_WHEN_givenSameSpaceFromLeftToRight_WITH_valuesRightOnLimit_MUST_returnListWithSameSize()
    {
        int[] left_3 = {1,2};

        int right_3[] = {0,9};

        ArrayList<Integer> result = sum(left_3, right_3);

        assertTrue(result.size() == 2);
        assertEquals(1,result.get(0));
        assertEquals(11,result.get(1));
    }
    @Test
    public void sum_WHEN_givenSameSpaceFromLeftToRight_WITH_valuesBothOnLimit_MUST_returnListWithSameSize()
    {    
        int[] left_4 = {0,0,9} ;

        int right_4[] = {9,9,0};

        ArrayList<Integer> result = sum(left_4, right_4);

        assertTrue(result.size() == 3);
        assertEquals(9,result.get(0));
        assertEquals(9,result.get(1));
        assertEquals(9,result.get(2));

    }
}
