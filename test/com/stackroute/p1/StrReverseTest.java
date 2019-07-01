package com.stackroute.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrReverseTest {

    StrReverse ob;
    @org.junit.Before
    public void setUp() throws Exception {
        ob=new StrReverse();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        ob=null;
    }


    @Test
    public void returnReverseString() {
        //Arrange

            //act
        String result=ob.reverse("hello");
        //assert
        assertEquals("olleh",result);

    }
    @Test
    public void returnNameReverseString() {
        //Arrange

        //act
        String result=ob.reverse("abinash");
        //assert
        assertEquals("hsaniba",result);

    }
}