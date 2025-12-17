import com.sun.security.jgss.GSSUtil;

public class GameOfLife {

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1}, {0, 1}, {1, -1},
                {1, 0}, {1, 1}
        };

        int[][] copy = new int[m][n];

        // original board
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                copy[i][j] = board[i][j];

        // rules
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                for (int[] d : directions) {
                    int r = i + d[0];
                    int c = j + d[1];

                    if (r >= 0 && r < m && c >= 0 && c < n && copy[r][c] == 1)
                        liveNeighbors++;
                }

                if (copy[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3))
                    board[i][j] = 0;

                if (copy[i][j] == 0 && liveNeighbors == 3)
                    board[i][j] = 1;

            }
        }
    }
    public static void printBoard(int[][] board) {
        for (int[] row : board)
            for (int cell : row)
                System.out.print(cell + " ");
        System.out.println();
    }

    void main() {
     int[][] board = {
             {0,1,0},
             {0,0,1},
             {1,1,1},
             {0,0,0}
     };

        System.out.println("before");
        printBoard(board);

        gameOfLife(board);

        System.out.println("after");
        printBoard(board);
    }
}
