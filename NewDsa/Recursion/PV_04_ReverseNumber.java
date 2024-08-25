public class PV_04_ReverseNumber{

    static void reversePrint(int n) {

        if(n <= 0) return;

        System.out.println(n);
        reversePrint(n - 1);

    }

    public static void main(String args[]) {
        int n = 7;

        reversePrint(n);
    }
}