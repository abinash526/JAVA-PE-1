package com.stackroute.p1;

import java.util.Scanner;

public class CharCheck {
    public  String charCheck(char input){

        if(input>='A'&&input<='Z')//Checking for capital
        {
            return ("It is capital");
        }
        else if(input>='a'&&input<='z')//Checking for small letter
        {
            return ("It is small");
        }
        else if(input>='0'&&input<='9')//Checking for digits
        {
            return ("It is a number");
        }
        else
            return ("It is a Special Character");//Checking for special character

    }

}
