public class PV_06_SkipApple {

    static String skipApple(String str) {

        if(str.isEmpty()) return "";

        if(str.startsWith("apple")) return skipApple(str.substring(5, str.length()));
        else return str.charAt(0) + skipApple(str.substring(1, str.length()));
    }

    public static void main(String[] args) {
        
        String str = "apppleappleappadsflig";

        System.out.println(skipApple(str));
    }
    
}
