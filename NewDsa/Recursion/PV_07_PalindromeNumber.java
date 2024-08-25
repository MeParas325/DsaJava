public class PV_07_PalindromeNumber {

    static int palindromeNumber(int n) {

        if(n < 10) return n;

        int digits = (int) Math.log10(n);

        return (n % 10 * (int) Math.pow(10, digits)) + palindromeNumber(n / 10);
    }

    public static void main(String args[]) {

        int n = 2;

        if(n == palindromeNumber(n)) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not Palindrome");
        }
     }
    
}
