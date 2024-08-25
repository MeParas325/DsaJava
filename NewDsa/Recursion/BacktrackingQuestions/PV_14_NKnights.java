package BacktrackingQuestions;

public class PV_14_NKnights {

    static void nKnights(boolean board[][], int row, int col, int knights) {

        if(knights == 0) {
            display(board);
            return;
        }

        if(row == board.length - 1 && col == board[0].length) return;

        if(col == board.length) {
            nKnights(board, row + 1, 0, knights);
            return;
        } 

        if(isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        nKnights(board, row, col + 1, knights);
    }

    static boolean isSafe(boolean board[][], int row, int col) {

        if(isValid(board, row - 2, col + 1)) if(board[row - 2][col + 1]) return false;

        if(isValid(board, row - 2, col - 1)) if(board[row - 2][col - 1]) return false;

        if(isValid(board, row - 1, col - 2)) if(board[row - 1][col - 2]) return false;

        if(isValid(board, row - 1, col + 2)) if(board[row - 1][col + 2]) return false;

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

    public static void main(String[] args) {

        int n = 3;

        boolean board[][] = new boolean[n][n];

        display(board);

        nKnights(board, 0, 0, n);
        

    }
    
}
