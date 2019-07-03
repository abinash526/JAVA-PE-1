package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCheckerTest {

    CharChecker ob;
    @Before
    public void setUp() throws Exception {
        ob=new CharChecker();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void returnForSpecialCharacter() {
        //Arrange

        //act
        String result=ob.charCheck(';');
        //assert
        assertEquals("It is a Special Character",result);

    }
    @Test
    public void returnForCapitalLetter() {
        //Arrange

        //act
        String result=ob.charCheck('A');
        //assert
        assertEquals("It is capital",result);

    }
    @Test
    public void returnForDigits() {
        //Arrange

        //act
        String result=ob.charCheck('6');
        //assert
        assertEquals("It is a number",result);

    }
}