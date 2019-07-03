/*  -----PROBLEM STATEMENT-----
A program to reverse any string without using String Buffer.
* */
package com.stackroute.p1;

import java.util.Scanner;

public class StrReverser {
    public String reverse(String str){



        String[] strArr=str.split("");
        String rev=new String();
        //Loop is appending from the last index of input String to the starting index of
        for(int i=strArr.length-1;i>=0;i--)
        {
            rev=rev+strArr[i];
        }
        return rev;
    }

}
