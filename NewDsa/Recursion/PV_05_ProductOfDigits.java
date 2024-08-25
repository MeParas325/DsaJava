public class PV_05_ProductOfDigits {

    public static int findProductOfDigits(int n) {

        if(n < 10) return n;

        return n % 10 * findProductOfDigits(n / 10);
    }

    public static void main(String args[]) {

        int n = 3445;

        System.out.println(findProductOfDigits(n));
    }
    
}
