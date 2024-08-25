// find the number of digits in base b
public class PV_05_Bit {

    public static void main(String args[]) {

        int n = 10, base = 10;

        int ans = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println("No if bits are: " + ans);

    }
    
}
