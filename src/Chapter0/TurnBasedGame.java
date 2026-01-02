package Chapter0;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Player {
    String name;
    int health;

    Player(String name, int health) {
        this.name= name;
        this.health =health;
    }

    boolean isAlive() {
        return health>0;
    }
}

public class TurnBasedGame {
    void main() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("player 1", 50));
        players.add(new Player("player 2", 50));

        Random random = new Random();
        int turn = 0;

        while (true) {
            Player current = players.get(turn % players.size());
            Player opponent = players.get((turn + 1) % players.size());

            if (!current.isAlive()) {
                turn++;
                continue;
            }


            int damage = random.nextInt(10) + 1;
            opponent.health -= damage;

            System.out.println(current.name + " attacks " + opponent.name + " for " + damage + " damage");

            if (!opponent.isAlive()) {
                System.out.println("\n" + current.name + " wins!");
                break;
            }
            turn++;

        }
    }
}
