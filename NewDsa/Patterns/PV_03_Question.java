public class PV_03_Question {

    static void printPattern(int n) {

        for(int row = 1; row <= 2 * n - 1; row++) {
            int totalCols = row > n ? 2 * n - row : row;

            for(int col = 1; col <= totalCols; col++) {

                if(col >= n - row + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public static void main(String args[]) {

        int n = 5;

        printPattern(n);
    }
    
}
