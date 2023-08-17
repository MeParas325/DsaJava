import java.util.Scanner;

public class Question3 {
    static public void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check that it is power of 0 or not: ");
        int n = sc.nextInt();

        int m = 1;

        while(m<n && m!=n){
            m = m<<1;
        }
        if(m == n){
            System.out.println("Yes "+n+" is the power of 2");
        }else{
            System.out.println(n+" is not the power of 2.");
        }

    }
}
