// find i th bit of any number
import java.util.Scanner;
public class PV_01_Bit{
    public static void main(String args[]) {

        int number = 32;
        System.out.println("Enter the ith bit:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("i th bit is: " + ((number & (1 << n)) >> n));

        sc.close();

    }
}