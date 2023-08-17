import java.util.Scanner;

class Question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int answer = 0;

        while(n != 0){
            int lastDigit = n % 10;
            n = n / 10;
            if(answer > Integer.MAX_VALUE / 10 || answer < Integer.MIN_VALUE){
                break;
            }
            answer = (int)(answer * 10) + lastDigit;
        }

        System.out.println(answer);
        sc.close();

    }
}