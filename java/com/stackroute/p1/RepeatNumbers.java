package com.stackroute.p1;

import java.util.Scanner;

public class RepeatNumbers {
    public String repeatNumbers(int input)
    {
        String outp=new String();
        for(int i=1;i<=input;i++)
        {
            for(int j=1;j<=i;j++)
            {
                outp=outp+(i+" ");
            }
        }
        return outp;
    }

    public static void main(String[] args) {
        RepeatNumbers ob= new RepeatNumbers();

        System.out.println(ob.repeatNumbers(2));
    }

    }

