/*PROBLEM STATEMENT
* Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/
package com.stackroute.p1;

import java.util.Scanner;

public class VowelConsonantIdentifier {
    public String vowelConsonant(String input)
    {


        int size=input.length();
        int i=0;
        String output="";
        while(i<size)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                //In following condition vowel is checked
                if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')
                {
                    output=output + (input.charAt(i)+"Vowel\n");
                }

                else
                {
                    output=output+ (input.charAt(i)+"Consonant\n");
                }
            }
            //Condition to check for not a letter
            else
            {
                break;
                //output=output+ ("Not a letter\n");


            }
            i++;

        }
        if(i==size)
            return output;
        else
            return "Other Character Found";
    }

}
