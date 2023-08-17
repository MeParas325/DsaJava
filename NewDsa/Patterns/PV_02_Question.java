public class PV_02_Question {

    static void printPattern(int n) {

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n; col++) {

                if(col >= n - row + 1) {
                    System.out.print("*");
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
