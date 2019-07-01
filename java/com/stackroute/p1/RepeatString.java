package com.stackroute.p1;

import java.util.Scanner;

public class RepeatString {
    public String printRepeatString(String input,int intNum)
    {



        String subStr=input.substring(input.length()-intNum);

        for(int i=0;i<intNum;i++)
        {
            input=input+subStr;
        }
        return(input);

    }

}
