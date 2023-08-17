import java.util.Scanner;
public class PV_02_OccuranceChar{
    static int first = -1;
    static int last = -1;
    public static void occuranceChar(String name, char s, int m){
        if(m == name.length()){
            if(first == -1 || last == -1){
                System.out.println("Only one character available in the whole string!");
            }
            System.out.println(first + " " + last);
            return;
        }
        
        if(name.charAt(m) == s){
            if(first == -1){
                first = m;
            }
            else{
                last = m;
            }
        }
        occuranceChar(name, s, m+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string or name:");
        String str = sc.nextLine();

        System.out.println("Enter the character of any string:");
        occuranceChar(str, 'p', 0);
        sc.close();
    }
}