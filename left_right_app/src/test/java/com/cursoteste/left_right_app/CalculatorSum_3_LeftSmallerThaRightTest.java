
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
public class CalculatorSum_3_LeftSmallerThaRightTest 
{
    @Test
    public void sum_WHEN_givenLeftSmallerThaRight_WITH_valuesInsideLimit_MUST_returnListWithSameSizeAsRight_AND_AllItensSummed()
    {
        // {1,2,3,4} {1,2,3,4,5}; {0,2,3,9} {1,2,3,4,5}; {1,2,3,4} {0,2,3,4,9}; {0,2,3,9} {0,2,3,4,9}
        int[] left_1 = {1,2,3,4};

        int right_1[] =  {1,2,3,4,5};

        ArrayList<Integer> result = sum(left_1, right_1);

        assertTrue(result.size() == 5);
        assertEquals(2,result.get(0));
        assertEquals(4,result.get(1));
        assertEquals(6,result.get(2));
        assertEquals(8,result.get(3));
        assertEquals(5,result.get(4));
    }
    @Test
    public void sum_WHEN_givenLeftSmallerThaRight_WITH_valuesLeftOnLimit_MUST_returnListWithSameSizeAsRight_AND_AllItensSummed()
    {
    
        int[] left_2 =  {0,2,3,9} ;

        int right_2[] = {1,2,3,4,5};

        ArrayList<Integer> result = sum(left_2, right_2);

        assertTrue(result.size() == 5);
        assertEquals(1,result.get(0));
        assertEquals(4,result.get(1));
        assertEquals(6,result.get(2));
        assertEquals(13,result.get(3));
        assertEquals(5,result.get(4));
    }
    @Test
    public void sum_WHEN_givenLeftSmallerThaRight_WITH_valuesRightOnLimit_MUST_returnListWithSameSizeAsRight_AND_AllItensSummed()
    {
        int[] left_3 =  {1,2,3,4} ;

        int right_3[] = {0,2,3,4,9};

        ArrayList<Integer> result = sum(left_3, right_3);

        assertTrue(result.size() == 5);
        assertEquals(1,result.get(0));
        assertEquals(4,result.get(1));
        assertEquals(6,result.get(2));
        assertEquals(8,result.get(3));
        assertEquals(9,result.get(4));
    }
    @Test
    public void sum_WHEN_givenLeftSmallerThaRight_WITH_valuesBothOnLimit_MUST_returnListWithSameSizeAsRight_AND_AllItensSummed()
    {    
        int[] left_4 = {0,2,3,9};

        int right_4[] =  {0,2,3,4,9};

        ArrayList<Integer> result = sum(left_4, right_4);

        assertTrue(result.size() == 5);
        assertEquals(0,result.get(0));
        assertEquals(4,result.get(1));
        assertEquals(6,result.get(2));
        assertEquals(13,result.get(3));
        assertEquals(9,result.get(4));

    }

}
