public class PV_01_PrintNumbers{

    static void printNumbers(int n) {

        if(n == 0) return;

        printNumbers(n - 1);
        System.out.println(n);
    }
    public static void main(String args[]) {

        int n = 5;

        printNumbers(n);
        
    }
}