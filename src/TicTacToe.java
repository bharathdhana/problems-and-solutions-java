static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
};

void main() {
    Scanner sc = new Scanner(System.in);
    char player = 'X';
    boolean gameOver = false;

    while (!gameOver) {
        printBoard();
        IO.println("Player " + player + " enter row and column (0-2): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        if (board[row][col] == ' ') {
            board[row][col] = player;
            gameOver = checkWin(player);

            if (gameOver) {
                printBoard();
                IO.println(" Player " + player + " wins!");
            } else if (isDraw()) {
                printBoard();
                IO.println(" It's a draw!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        } else {
            IO.println(" Cell already occupied. Try again.");
        }
    }
}

static void printBoard() {
    IO.println("-------------");
    for (int i = 0; i < 3; i++) {
        IO.print("| ");
        for (int j = 0; j < 3; j++) {
            IO.print(board[i][j] + " | ");
        }
        IO.println();
        IO.println("-------------");
    }
}

static boolean checkWin(char player) {
    for (int i = 0; i < 3; i++) {
        if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player))
            return true;
    }

    return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player);
}

static boolean isDraw() {
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (board[i][j] == ' ')
                return false;
    return true;
}
