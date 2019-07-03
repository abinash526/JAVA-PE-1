package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonantIdentifier ob;

    @Before
    public void setUp() throws Exception {
        ob=new VowelConsonantIdentifier();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void returnVowelOrConsonant() {
        String result=ob.vowelConsonant("Hello");
        assertEquals("HConsonant\neVowel\nlConsonant\nlConsonant\noVowel\n",result);
    }
    @Test
    public void forOtherCharacterFound() {
        String result=ob.vowelConsonant("Hell5");
        assertEquals("Other Character Found",result);
    }
}