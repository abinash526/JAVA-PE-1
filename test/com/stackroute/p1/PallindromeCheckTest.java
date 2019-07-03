package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeCheckTest {

    PallindromeChecker ob;
    @Before
    public void setUp() throws Exception {
        ob=new PallindromeChecker();
    }

    @After
    public void tearDown() throws Exception {
    ob=null;
    }

    @Test
    public void returnForPallindromeEvenSumLessThan25() {
        String result=ob.pallindromeCheck(121);
        assertEquals("pallindrome and even sum is lesser than 25",result);
    }
    @Test
    public void returnForPallindromeEvenSumGreaterThan25() {
        String result=ob.pallindromeCheck(8888888);
        assertEquals("pallindrome and even sum is greater than 25",result);
    }
    @Test
    public void returnForNotPallindrome() {
        String result=ob.pallindromeCheck(123);
        assertEquals("not a pallindrome",result);
    }
}