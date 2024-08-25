public class PV_04_RemoveAFromString {

    static String removeAString(String up, String p) {

        if(up.isEmpty()) return p;

        if(up.charAt(0) == 'a') return removeAString(up.substring(1, up.length()), p);
        else return removeAString(up.substring(1, up.length()), p + up.charAt(0));
        
    }

    public static void main(String args[]) {

        String str = "tanuja";

        System.out.println(removeAString(str, ""));
    }
    
}
