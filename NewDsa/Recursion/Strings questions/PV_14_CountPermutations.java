public class PV_14_CountPermutations {

    static int countPerm(String up, String p) {

        if(up.isEmpty()) return 1;

        int count = 0;

        for(int i = 0; i <= p.length(); i++) {

            String startStr = p.substring(0, i);
            char ch = up.charAt(0);
            String endStr = p.substring(i, p.length());

            count += countPerm(up.substring(1), startStr + ch + endStr);
        }

        return count;


    }

    public static void main(String args[]) {

        String str = "paras";

        System.out.println(countPerm(str, ""));
    }
    
}
