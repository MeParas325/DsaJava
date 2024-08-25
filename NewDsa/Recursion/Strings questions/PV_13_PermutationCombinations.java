public class PV_13_PermutationCombinations {

    static void permComb(String up, String p) {

        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        for(int i = 0; i <= p.length(); i++) {

            String startStr = p.substring(0, i);
            char ch = up.charAt(0);
            String endStr = p.substring(i, p.length());

            permComb(up.substring(1), startStr + ch + endStr);
        }


    }

    public static void main(String args[]) {

        String str = "paras";

        permComb(str, "");
    }
    
}
