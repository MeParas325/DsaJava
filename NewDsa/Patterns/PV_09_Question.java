public class PV_09_Question {

    public static void main(String args[]) {

        int n = 7;

        for(int row = 0; row < n; row++) {

            for(int col = 1; col <= n; col++) {
                
                if(col <= row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            for(int i = 0; i < n - row - 1; i++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
    
}
