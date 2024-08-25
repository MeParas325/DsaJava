public class PV_02_LengthOfString{

    static int calculateLength(String str) {

        if(str.equals("")) return 0;

        return 1 + calculateLength(str.substring(1));
        
    }

    public static void main(String args[]) {

        String str = "Tanuja";

        System.out.println(calculateLength(str));

        
    }
}