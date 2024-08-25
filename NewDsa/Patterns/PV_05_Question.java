import java.util.Scanner;

public class PV_05_Question {

    public static void main(String args[]) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 1; row <= 2*n - 1; row++) {

            int totalNoCols = row <= n ? row : 2*n - row;

            for(int col = 1; col <= totalNoCols; col++) {

                System.out.print("*");

            }


            System.out.println();
        }

        sc.close();
    }
    
}
