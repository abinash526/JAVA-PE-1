package com.stackroute.p1;

import java.util.*;


public class NumberGuess {
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
        NumberGuess ob=new NumberGuess();
        ob.guess();
    }
}
