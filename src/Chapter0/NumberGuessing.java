package Chapter0;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    void main(){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            attempts++;

            if (guess > number)
                System.out.println("too high!");
            else if (guess < number)
                System.out.println("too low!");
            else
                System.out.println("Correct! you guessed it in "+ attempts + " attempts");

        } while (guess!= number);
    }
}
