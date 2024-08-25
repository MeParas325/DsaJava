import java.util.Scanner;

public class PV_07_Question {

    public static void main(String args[]) {

        System.out.print("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 0; row < n; row++) {

            for(int col = 1; col <= n; col++) {

                if(col <= row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }

            System.out.println();
        }

        sc.close();

        
    }
    
}
