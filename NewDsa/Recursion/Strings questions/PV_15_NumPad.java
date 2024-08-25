public class PV_15_NumPad{

    static void generateNumStr(String up, String p) {

        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            generateNumStr(up.substring(1), p + ch);
        }
    }

    public static void main(String args[]) {

        String str = "12";

        generateNumStr(str, "");
    }
}