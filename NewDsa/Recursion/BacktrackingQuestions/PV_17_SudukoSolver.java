package BacktrackingQuestions;

import java.util.Arrays;

public class PV_17_SudukoSolver {

    static void sudokuSolver(int[][] sudoku) {

        int n = sudoku.length;

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                
                for(int number = ++sudoku[row][col]; number <= 9; number++) {
                    if(isSafe(sudoku, row, col, number)) {
                        sudoku[row][col] = number;
                        display(sudoku);
                        break;
                    }
                }

                if(sudoku[row][col] == 0) {
                    display(sudoku);
                    sudoku[row][col - 1] = 0;
                    display(sudoku);
                    col = col - 2;
                }
            }
        }


    }

    static void display(int[][] sudoku) {

        for(int sudokuRow[]: sudoku) {

            System.out.println(Arrays.toString(sudokuRow));

        }

    }

    static boolean isSafe(int[][] sudoku, int row, int col, int number) {

        for(int i = 0; i < col; i++) {
            if(sudoku[row][i] == number) return false;
        }

        for(int i = 0; i < row; i++) {
            if(sudoku[i][col] == number) return false;
        }

        int sqrt = (int) Math.sqrt(sudoku.length);

        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int r = rowStart; r < row + rowStart; r++) {
            for(int c = colStart; c < col + colStart; c++) {
                if(sudoku[r][c] == number) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String args[]) {

        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        display(sudoku);

        sudokuSolver(sudoku);

        display(sudoku);

        
    }
    
}
