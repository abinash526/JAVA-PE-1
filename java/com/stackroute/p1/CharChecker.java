/*
* Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/
package com.stackroute.p1;

import java.util.Scanner;

public class CharChecker {
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
