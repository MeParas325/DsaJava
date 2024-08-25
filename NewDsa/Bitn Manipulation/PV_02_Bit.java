// set ith bit
import java.util.Scanner;
public class PV_02_Bit {

    public static void main(String args[]) {
        int number = 32;
        System.out.println("Enter the ith bit:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("After setting i th bit number is: " + (number | (1 << n)));

        sc.close();
    }
    
}
