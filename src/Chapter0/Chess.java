package Chapter0;

public class Chess {

    // Queen
    static boolean queen(int r1, int c1, int r2, int c2) {
        return r1 == r2 || c1 == c2 || Math.abs(r1-r2) == Math.abs(c1-c2);
    }

    // Rook
    static boolean rook(int r1, int c1, int r2, int c2) {
        return r1 == r2 ||  c1 == c2;
    }

    // Bishop
    static boolean bishop(int r1, int c1, int r2, int c2) {
        return Math.abs(r1-r2) == Math.abs(c1-c2);
    }

    //  Knight
    static boolean knight (int r1, int c1, int r2, int c2) {
        int dr = Math.abs(r1-r2);
        int dc = Math.abs(c1-c2);
        return (dr == 2 && dc == 1 ) || (dr == 1 && dc == 2);
    }

    // King
    static boolean king(int r1, int c1, int r2, int c2) {
        return Math.abs(r1-r2) <=1 &&
                Math.abs(c1-c2) <=1;
    }

    // Pawn
    static boolean pawn (int r1, int c1, int r2, int c2, boolean isWhite) {
        if (isWhite)
            return r2 == r1 - 1 && Math.abs(c1-c2) == 1;
        else
            return r2 == r1 + 1 && Math.abs(c1-c2) == 1;

    }

    void main() {
        int r1 = 3, r2 = 5;
        int c1 = 3, c2 = 4;

        System.out.println("queen attack: " + queen(r1,c1,r2,c2));
        System.out.println("rook attack: " + rook(r1,c1,r2,c2));
        System.out.println("bishop attack: " + bishop(r1,c1,r2,c2));
        System.out.println("knight attack: " + knight(r1,c1,r2,c2));
        System.out.println("king attack: " + king(r1,c1,r2,c2));
        System.out.println("white pawn attack: " + pawn(r1,c1,r2,c2, true));
        System.out.println("black pawn attack: " + pawn(r1,c1,r2,c2, false));

        }

}

