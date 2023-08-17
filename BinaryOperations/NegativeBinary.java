import java.util.Scanner;

public class NegativeBinary {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        long power = 0, answer = 0;

        if(n == 0){
            System.out.println("Binary is: 0000000000");
        }else if(n < 0){
            n = ~n;
            n = n + 1;

            while(n != 0){
                int bit = n & 1;
                n = n >> 1;

                answer = (int)(bit * Math.pow(10, power)) + answer;
                power++;
            }  
        }else{
            while(n != 0){
                int bit = n & 1;
                n = n >> 1;
                
                answer = (int)(bit * Math.pow(10, power)) + answer;
                power++;
            }
        }
        System.out.println("Binary is: "+answer);

        sc.close();
    }
}
