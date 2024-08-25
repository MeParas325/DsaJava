public class PV_03_RemoveAFromString {

    static String removeA(String str) {

        if(str.isEmpty()) return "";

        if(str.charAt(0) == 'a') return removeA(str.substring(1, str.length()));
        else return str.charAt(0) + removeA(str.substring(1, str.length()));
    }

    public static void main(String args[]) {

        String str = "Paras";

        System.out.println(removeA(str));
    }
    
}
