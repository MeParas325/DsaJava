public class PV_16_DiceThrow {

    static void totalPosCom(String p, int target) {

        if(target == 0) {
            System.out.println(p);
            return;
        }

        for(int i = 1; i <=6 && i <= target; i++) {
            totalPosCom(p + i, target - 1 );
        }
    }

    public static void main(String args[]) {

        totalPosCom("", 2);
     }
    
}
