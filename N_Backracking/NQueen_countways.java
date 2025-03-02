package N_Backracking;

public class NQueen_countways {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void NQueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            count ++;
            return;
        }
        // initialize
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; 
                NQueen(board, row + 1); 
                board[row][j] = '.'; 
            }
        }
    }

    public static void printBoard(char board[][]) {
        
        System.out.println("----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 12; 
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        NQueen(board, 0);
        System.out.println("Count Ways : " + count);
    }
}

