public class PV_08_StringSubsets {

    static void generateSubsets(String up, String p) {

        if(up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }

        generateSubsets(up.substring(1), p + up.charAt(0));
        generateSubsets(up.substring(1), p);
    }
 
    public static void main(String args[]) {

        String str = "abc";

        generateSubsets(str, "");
    }
    
}
