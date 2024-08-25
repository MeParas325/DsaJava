public class PV_01_SumOfDigitis {

    public static int findSumOfDigits(int n) {

        if(n < 10) return n;

        return n % 10 + findSumOfDigits(n / 10);
    }

    public static void main(String args[]) {

        int n = 3546;

        System.out.println(findSumOfDigits(n));
    }
    
}
