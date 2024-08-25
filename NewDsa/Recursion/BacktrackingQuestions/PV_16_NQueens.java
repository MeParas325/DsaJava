package BacktrackingQuestions;

public class PV_16_NQueens {

    static void nQueens(boolean board[][], int row, int col, int queens) {

        if(row == board.length) {
            display(board);
            return;
        }

        if(row == board.length - 1  && col == board[0].length) return;

        if(col == board[0].length) {
            return;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            nQueens(board, row + 1, 0, queens - 1);
            board[row][col] = false;
        }

        nQueens(board, row, col + 1, queens);


    }

    static boolean isSafe(boolean board[][], int row, int col) {

        for(int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }

        int maxLeft = Math.min(row, col);

        for(int i = 1; i <= maxLeft; i++) {
            if(board[row - i][col - i]) return false;
        }

        int maxRight = Math.min(row, board[0].length - col - 1);

        for(int i = 1; i <= maxRight; i++) {
            if(board[row - i][col + i]) return false;
        }

        return true;
    }

    static void display(boolean board[][]) {

        for (boolean[] b : board) {
            for(int i = 0; i < b.length; i++) {
                if(b[i] == true) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int n = 5;

        boolean board[][] = new boolean[n][n];

        nQueens(board, 0, 0, n);
    }
    
}
