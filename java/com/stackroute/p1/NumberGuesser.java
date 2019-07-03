/*
*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number */
package com.stackroute.p1;

import java.util.*;


public class NumberGuesser {
    public void guess()
    {
        Scanner scanner=new Scanner(System.in);
        int target=new Random().nextInt(100 - 1);
        System.out.println("Guess a number");
        int guess=scanner.nextInt();
        while(true)
        {
            if(guess==target){
                System.out.println("found");
            break;
            }
            else if(guess<target)//If the guessed number is less than target
            {
                System.out.println("The guessed number is less than target!! Guess again");
                guess=scanner.nextInt();
            }
            else//If the guessed number is greater than target
            {
                System.out.println("The guessed number is greater than target!! Guess again");
                guess=scanner.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        NumberGuesser ob=new NumberGuesser();
        ob.guess();
    }
}
