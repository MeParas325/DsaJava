public class PV_01_Question{

    static void printPattern(int n) {

        for(int row = 1; row <= 2 * n - 1; row++) {

            int totalCols = row < n ? row : 2 * n - row;

            for(int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        int n = 7;

        printPattern(n);
    }
}