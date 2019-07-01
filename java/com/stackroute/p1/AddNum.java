package com.stackroute.p1;

import java.util.Scanner;
public class AddNum {
    public String addNum(String input)
    {

        String[] listOfNum1=input.split(" ");
        int sum=0,k=0;
        for(int i=0;i<listOfNum1.length;i++)
        {
            if(Character.isLetter(listOfNum1[i].charAt(0)))//Checking for any instance of Letter
            {
                k=1;
                return ("Character found");
                //break;
            }
            else if(listOfNum1[i].charAt(0)>='0'&& listOfNum1[i].charAt(0)<='9'){//Checking for any instance of Number
                sum=sum+Integer.parseInt(listOfNum1[i]);

            }
            else{//Checking for
                k=1;
                return ("Special Character found");
                //break;
            }
        }
        if(k==0)
            return ("Sum is "+sum);
        else
            return null;
    }

}
