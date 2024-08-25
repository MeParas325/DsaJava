package BacktrackingQuestions;

public class PV_15_NKnight {

    static int nKnights(boolean board[][], int row, int col, int knights) {

        if(knights == 0) {
            display(board);
            return 1;
        }

        int count = 0;

        if(row == board.length - 1 && col == board[0].length) return count;

        if(col == board.length) {
            count += nKnights(board, row + 1, 0, knights);
            return count;
        }

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            count += nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        count += nKnights(board, row, col + 1, knights);

        return count;
    } 

    static boolean isSafe(boolean board[][], int row, int col) {

        if(isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) return false;

        if(isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) return false;

        if(isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) return false;

        if(isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) return false;

        return true;
    }

    static boolean isValid(boolean board[][], int row, int col) {

        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length) return true;

        return false;
    }

    static void display(boolean board[][]) {

        for (boolean[] b : board) {
            for(int i = 0; i < b.length; i++) {
                if(b[i] == true) System.out.print("N ");
                else System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int n = 3;

        boolean board[][] = new boolean[n][n];

        display(board);

        System.out.println(nKnights(board, 0, 0, n));
    }
    
}
