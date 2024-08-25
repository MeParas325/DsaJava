public class PV_08_CountZeroes {

    static int findZeroes(int n) {
        int count = 0;

        if(n < 10) return 0;

        if(n % 10 == 0) count++;

        return count + findZeroes(n / 10);
    }

    public static void main(String args[]) {

        int n = 3050;

        System.out.println(findZeroes(n));

    }
    
}
