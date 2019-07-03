package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalCheckerTest {
    ConditionalChecker ob;

    @Before
    public void setUp() throws Exception {
        ob=new ConditionalChecker();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void checkForRange20And30() {
        String result=ob.conditionCheck(24);
        assertEquals("Jerry",result);
    }
    @Test
    public void check2ForRange20And30() {
        String result=ob.conditionCheck(25);
        assertEquals("Tom",result);
    }
    @Test
    public void checkForOuterRange() {
        String result=ob.conditionCheck(36);
        assertEquals("",result);
    }
}