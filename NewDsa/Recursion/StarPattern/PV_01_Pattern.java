package StarPattern;

public class PV_01_Pattern {

    static void printPattern(int row, int col) {

        if(row <= 0) return;

        if(col < row) {
            printPattern(row, ++col);
            System.out.print("* ");
        } else {
            printPattern(--row, 0);
            System.out.println();
        }
    }
    
    public static void main(String args[]) {

        int n = 6;

        printPattern(n, 0);
    }
}
