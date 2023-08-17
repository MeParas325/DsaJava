import java.util.Arrays;
import java.util.Scanner;

public class PV_03_MedianOfTwoSortedArrays {
    static public void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to enter in the first array:");
        int no1 = sc.nextInt();
        int arr1[] = new int[no1];

        System.out.println("Enter the number of elements you want to enter in the second array:");
        int no2 = sc.nextInt();
        int arr2[] = new int[no2];

        System.out.println("Enter the elements into the first array:");
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Arr1 before sorting:");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        
        System.out.println();

        System.out.println("Enter the elements into the second array:");
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Arr2 before sorting:");
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

        System.out.println();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Arr1 after sorting:");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Arr2 after sorting:");
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        int arr1and2[] = new int[no1+no2];
        
        System.arraycopy(arr1, 0, arr1and2, 0, arr1.length);
        System.arraycopy(arr2, 0, arr1and2, arr1.length, arr2.length);
        System.out.println("arr1andarr2 after sorting:");
        Arrays.sort(arr1and2);
        for(int i = 0; i<arr1and2.length; i++){
            System.out.print(arr1and2[i]+" ");
        }
        System.out.println();

        if(arr1and2.length%2 == 0){
            int median = arr1and2[(arr1and2.length/2)]+arr1and2[(arr1and2.length/2)-1];
            System.out.println("Median element is:"+median);
        }
        else{
            int median = arr1and2[arr1and2.length/2];
            System.out.println("Median element is:"+median);
        }

        

        


    }
}
