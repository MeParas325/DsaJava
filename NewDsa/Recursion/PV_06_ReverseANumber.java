public class PV_06_ReverseANumber {

    static int reverseNumber(int n) {

        if(n < 10) return n;

        int digits = (int)Math.log10(n);
        return (n % 10 * (int)Math.pow(10, digits)) + reverseNumber(n / 10);

    }

    public static void main(String args[]) {

        int n = 1542345;
        System.out.println(reverseNumber(n));
    }
    
}
