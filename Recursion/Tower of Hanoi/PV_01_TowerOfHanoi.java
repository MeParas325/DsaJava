import java.util.Scanner;
public class PV_01_TowerOfHanoi{
    static int count;
    public static void towerHanoi(int a, String src, String help, String dest){
        if(a>=1){
            towerHanoi(a-1, src, dest, help);
            count++;
            System.out.println("Disk moved form "+ src+" to "+ dest);
            towerHanoi(a-1, help, src, dest);
        }

    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number of disks in your tower of Hanoi:");
         int n = sc.nextInt();
         towerHanoi(n, "s", "h", "d");
         
         System.out.println("No of steps taken by the "+n+" disks is:"+count);
         sc.close();

    }
}