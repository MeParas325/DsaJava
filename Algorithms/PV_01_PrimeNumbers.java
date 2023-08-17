import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class PV_01_PrimeNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number uh wasnt to find the factorial:");
        int count=0;
        int n = sc.nextInt();
        Boolean isPrime[] = isPrimeSeive(n);
        // for(int i = 0; i<=n; i++){
        //     System.out.println(i+ " "+ isPrime[i]);
        // }
        for(int i = 0; i<=n; i++){
            // System.out.println(i+ " "+ isPrime[i]);
            if(isPrime[i] == true){
                count++;
            }
        }

        System.out.format("No of Prime Number Between 1 to %d:%d", n, count);
    }

    static public Boolean[] isPrimeSeive(int n){
        Boolean isPrime[] = new Boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i<=Math.sqrt(n); i++){
            for(int j = i*2; j<=n; j+=i){
                isPrime[j] = false;
            }
        }

        return isPrime;
    }


}