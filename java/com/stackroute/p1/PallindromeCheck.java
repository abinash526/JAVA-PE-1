package com.stackroute.p1;/*Problem Statement
* 1. Write a program which accepts a number as input and check whether the given number is
palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
Input : 2468642
Output : 2468642 is palindrome and the sum of even numbers is greater than 25
Input: 12345
Output: 12345 is not palindrome
Input: 12345654321
Output : 12345654321 is palindrome and sum of even numbers is less than 25*/
import java.util.Scanner;
public class PallindromeCheck {
    public String pallindromeCheck(int input)
    {


        String num1=Integer.toString(input);
        StringBuffer num2=new StringBuffer();
        num2.append(num1);
        num2=num2.reverse();
        int revNum=Integer.parseInt(num2.toString());
        int orNum=Integer.parseInt(num1.toString());
        if(revNum==orNum)
        {

            int sum=0;
            while(revNum!=0)
            {
                if((revNum%10)%2==0)
                {
                    sum=sum+revNum%10;
                }
                revNum=revNum/10;
            }
            if(sum>25)
                return ("pallindrome and even sum is greater than 25");
            else
                return ("pallindrome and even sum is lesser than 25");
        }
        else
        {
            return ("not a pallindrome");
        }
    }

}
