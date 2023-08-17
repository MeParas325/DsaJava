import java.util.ArrayList;
import java.util.Scanner;
public class PV_01_ArrayList{
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of names of the student:");
        int n = sc.nextInt();

        System.out.println("Enter the Names you want to enter:");
        sc.nextLine();
        for(int i = 0; i<n; i++){
            String str = sc.nextLine();
            names.add(str);
        }

        System.out.println(names);

        sc.close();


    }
}