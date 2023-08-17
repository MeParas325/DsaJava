import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PV_03_ListArrayList{
    public static void main(String args[]){
        List<String> names = new ArrayList<>();
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

        names.add(1, "Kabaab");
        System.out.println(names);

        List<String> newNames = new ArrayList<>();
        newNames.add("Satish");
        newNames.add(0, "Start");
        System.out.println(newNames);

        names.addAll(newNames);
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.remove(String.valueOf("None"));
        System.out.println(names);

        names.set(0, "StartingAt0");
        System.out.println(names);

        sc.close();
    }
}
