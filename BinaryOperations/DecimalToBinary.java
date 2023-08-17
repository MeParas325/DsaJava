import java.util.Scanner;

public class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0, power = 0;

        while(n != 0){
            
            int bit = n & 1;
            n = n >> 1;
            answer = (int)(bit * Math.pow(10, power) + answer);
            power++;

        }

        System.out.println("Answer is: "+answer);
        sc.close();
    }
}