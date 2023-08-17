import java.util.Scanner;
public class PV_01_ReverseString{
    public static void reverse(int n, String name){
        if(n<0){
            return;
        }
        System.out.println(name.charAt(n));
        reverse(n-1, name);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string or name:");
        String name = sc.nextLine();
        System.out.println("The length of the string is:"+name.length());

        reverse(name.length()-1, name);
    }
}