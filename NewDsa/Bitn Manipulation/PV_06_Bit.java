// check is the number is power of 2 or not
public class PV_06_Bit {

    public static void main(String args[]) {

        int n = 256;

        if((n & (n - 1)) == 0) {
            System.out.println("Number is power of 2.");
        } else {
            System.out.println("Number is not power of 2.");
        }
    }
    
}
