/*
* Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/
package com.stackroute.p1;

import java.util.Scanner;
public class ConditionalChecker {
    public String conditionCheck(int number)
    {
        if( number> 20&& number<30)
        {
            if(number%2!=0)
                return("Tom");
            else
                return("Jerry");
        }
        return "";
    }

}