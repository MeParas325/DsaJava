public class PV_07_SkipApple {

    static String skipApple(String up, String p) {

        if(up.isEmpty()) return p;

        if(up.startsWith("apple")) return skipApple(up.substring(5, up.length()), p);
        else return skipApple(up.substring(1, up.length()), p + up.charAt(0));
    }

    public static void main(String args[]) {

        String str = "apppleappadsflig";

        System.out.println(skipApple(str, ""));
    }
    
}
