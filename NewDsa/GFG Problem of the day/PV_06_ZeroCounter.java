// Solution 1 - 26 June 2024
public class PV_06_ZeroCounter {
    public static int countZeroes(int[][] matrix) {
        int count = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[0].length; col++) {
                if(matrix[row][col] == 0) {
                    
                    if(col < matrix[0].length - 1 && matrix[row][col + 1] == 1) {
                        count++;
                    } 
                    if(col > 0 && matrix[row][col - 1] == 1) {
                        count++;
                    }
                    if(row > 0 && matrix[row - 1][col] == 1) {
                        count++;
                    }
                    if(row < matrix.length - 1 && matrix[row + 1][col] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 0},
                          {0, 1, 1}, 
                          {0, 0, 0}};

        int zeroCount = countZeroes(matrix);
        System.out.println("Number of zeroes: " + zeroCount); // Output should be 11
    }
}