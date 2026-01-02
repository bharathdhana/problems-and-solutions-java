package Chapter0;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadders {

    static final int WIN_POSITION = 100;
    void main(){
        Map<Integer, Integer> snakesAndLadders = new HashMap<>();

        // Ladders
        snakesAndLadders.put(2,38);
        snakesAndLadders.put(7,14);
        snakesAndLadders.put(8,31);
        snakesAndLadders.put(28,84);

        // Snakes
        snakesAndLadders.put(99,7);
        snakesAndLadders.put(95,75);
        snakesAndLadders.put(92,88);
        snakesAndLadders.put(74,53);

        int playerPosition= 0;
        Random dice =new Random();

        while (playerPosition<WIN_POSITION) {
            int diceRoll = dice.nextInt(6) + 1;
            System.out.println("dice rolled: " + diceRoll);

            if (playerPosition + diceRoll <= WIN_POSITION)
                playerPosition += diceRoll;

            if (snakesAndLadders.containsKey(playerPosition)) {
                int newPos = snakesAndLadders.get(playerPosition);

                if (newPos > playerPosition)
                    System.out.println("ladder! climb up to " + newPos);
                else
                    System.out.println("Snake! SLide down to " + newPos);

                playerPosition = newPos;
            }
            System.out.println("current position " + playerPosition);
        }
        System.out.println(" player wins! ");
        }

    }

