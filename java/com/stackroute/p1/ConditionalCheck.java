package com.stackroute.p1;

import java.util.Scanner;
public class ConditionalCheck {
    public String conditionCheck(int input)
    {
        if( input> 20&& input<30)
        {
            if(input%2!=0)
                return("Tom");
            else
                return("Jerry");
        }
        return "";
    }

}