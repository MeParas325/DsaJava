import java.util.Scanner;

public class PV_03_Question {

    public static void main(String args[]) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {

            for(int col = 1; col <= n - row + 1; col++) {

                System.out.print('*');

            }

            System.out.println();
        }

        sc.close();
    }
    
}
