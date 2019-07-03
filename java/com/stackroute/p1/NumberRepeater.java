/*       ---PROBLEM STATEMENT---
* A program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
6 6 . . . nth iteration.*/
package com.stackroute.p1;


public class NumberRepeater {
    public String repeatNumbers(int input)
    {
        String outp=new String();//outp is used to return in String format to the test cases

        for(int i=1;i<=input;i++)
        {
            for(int j=1;j<=i;j++)
            {
                outp=outp+(i+" ");
            }
        }
        return outp;
    }


    }

