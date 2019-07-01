package com.stackroute.p1;

import java.util.Scanner;

public class VowelConsonant {
    public String vowelConsonant(String input)
    {


        int size=input.length();
        int i=0;
        String output="";
        while(i<size)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'||input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U')
                {
                    output=output + (input.charAt(i)+"Vowel\n");
                }
                else
                {
                    output=output+ (input.charAt(i)+"Consonant\n");
                }
            }
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
