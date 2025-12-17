import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    enum Choice {
        ROCK, PAPER, SCISSORS
    }

    void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter Choice (ROCK, PAPER, SCISSORS): ");
        String userInput = sc.next().toUpperCase();

        Choice userChoice;

        try {
            userChoice = Choice.valueOf(userInput);
        } catch (Exception e) {
            System.out.println(" invalid choice ");
            return;
        }

        Choice computerChoice = Choice.values()[random.nextInt(3)];
        System.out.println(" your chose: " + userChoice);
        System.out.println(" computer chose " + computerChoice);

        if (userChoice == computerChoice)
            System.out.println("Draw!");
        else if ((userChoice == Choice.ROCK && computerChoice == Choice.SCISSORS) ||
                (userChoice == Choice.SCISSORS && computerChoice == Choice.PAPER) ||
                (userChoice == Choice.PAPER && computerChoice == Choice.ROCK))
            System.out.println("you Win!");
        else
            System.out.println("Computer wins!");
    }
}

