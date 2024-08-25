public class PV_08_Question {

    public static void main(String args[]) {

        int n = 7;

        for(int row = 0; row < n; row++) {

            for(int col = 1; col <= n; col++) {
                
                if(col >= n - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for(int i = 0; i < row; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
