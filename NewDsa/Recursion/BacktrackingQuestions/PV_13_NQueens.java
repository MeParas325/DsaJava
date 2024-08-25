package BacktrackingQuestions;
public class PV_13_NQueens {

    static int countWays(boolean board[][], int row) {

        if(row == board.length) {
            display(board);
            return 1;
        }

        int count = 0;

        for(int col = 0; col < board[0].length; col++) {

            if(isSafe(board, row, col)) {
                board[row][col] = true;
                display(board);
                count += countWays(board, row + 1);
                board[row][col] = false;
                display(board);
            }
        }

        return count;
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

        int n = 4;

        boolean board[][] = new boolean[n][n];

        display(board);

        int ways = countWays(board, 0);

        System.out.println(ways);
    }
    
}
