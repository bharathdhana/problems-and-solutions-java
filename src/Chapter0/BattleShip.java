package Chapter0;

import java.util.Arrays;
import java.util.Scanner;

public class BattleShip {

    static final int SIZE = 5;
    static char[][] board = new char[SIZE][SIZE];
    static int ships = 3;

    void main() {
        createBoard();
        placeShips();

        Scanner sc =new Scanner(System.in);

        while (ships>0) {
            printBoard(false);

            System.out.println(" Enter row (0-4): ");
            int row = sc.nextInt();

            System.out.println(" Enter col (0-4): ");
            int col = sc.nextInt();

            if (row<0 || row>=SIZE || col<0 || col >=SIZE) {
                System.out.println(" invalid position ");
                continue;
            }

            if (board[row][col] == 'S') {
                System.out.println(" HIT! ");
                board[row][col] = 'X';
                ships--;
            }
            else if(board[row][col] == '~') {
                System.out.println(" MISS! ");
                board[row][col] = 'o';
            } else
                System.out.println("Already tried");

        }
        System.out.println("All ships sunk!");
        printBoard(true);

    }

    static void createBoard(){
        for (int i=0; i<SIZE; i++ )
            Arrays.fill(board[i] , '~');
    }

    static void placeShips() {
        board[1][1] = 'S';
        board[2][1] = 'S';
        board[3][3] = 'S';
    }

    static void printBoard(boolean reveal) {
        System.out.println("\n Board: ");
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                if (board[i][j] == 'S' && !reveal)
                    System.out.print("~ ");
                else
                    System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
