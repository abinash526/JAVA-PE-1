package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
StringRepeater ob;
    @Before
    public void setUp() throws Exception {
        ob=new StringRepeater();
    }

    @After
    public void tearDown() throws Exception {
    ob=null;
    }

    @Test
    public void printRepeatString() {
        String result=ob.printRepeatString("Hello",2);
        assertEquals("Hellololo",result);
    }
    @Test
    public void printRepeatString2() {
        String result=ob.printRepeatString("Stackroute",5);
        assertEquals("Stackrouterouterouterouterouteroute",result);
    }
}