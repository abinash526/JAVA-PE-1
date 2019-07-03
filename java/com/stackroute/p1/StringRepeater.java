/*
Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
repeat n number of times in the output String.*/

package com.stackroute.p1;

import java.util.Scanner;

public class StringRepeater {
    public String printRepeatString(String input,int intNum)
    {
        //The location of the substring is found
        String subStr=input.substring(input.length()-intNum);
        for(int i=0;i<intNum;i++)
        {
            input=input+subStr;
        }
        return(input);

    }

}
