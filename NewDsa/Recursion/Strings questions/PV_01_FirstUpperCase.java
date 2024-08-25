public class PV_01_FirstUpperCase{

    static void findUpperCase(String name, int index) {

        if(index == name.length()) System.out.println("No uppercase character");

        if(name.charAt(index) >= 'A' && name.charAt(index) <= 'Z') {
            System.out.println("Uppercase character is: " + name.charAt(index));
            return;
        } 
        else findUpperCase(name, ++index);
    }

    static public void main(String args[]) {

        String name = "paRas";

        findUpperCase(name, 0);
    }
}