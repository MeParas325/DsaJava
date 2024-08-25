// Summed Matrix - 24 June 2024
public class PV_04_SummedMatrix{
    public static void main(String args[]) {
        int n = 4, q = 7;

        if(q < 2 || q > 2*n) System.out.println(0);
        else if(q <= n + 1) System.out.println(q - 1);
        else System.out.println(2*n - q + 1);

    }
}