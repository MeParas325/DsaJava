import java.util.Scanner;
public class PV_03_ArraySorted {
    static public void arraySorted(int arr[], int n){
        if(n == arr.length-1){
            System.out.println("\nArray is Sorted!");
            return;
        }
        else{
            if(arr[n]<arr[n+1]){
                arraySorted(arr, n+1);
            }
            else{
                System.out.println("\nArray is not sorted!");
            }
        }

    }
    static public void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int arr[] = new int[5];

         for(int i = 0; i<arr.length; i++){
             System.out.println("Enter the "+i+" element into the array:");
             arr[i] = sc.nextInt();
         }

         System.out.println("Printing the elements of the array:");
         for(int i = 0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
         }

         arraySorted(arr, 0);
         sc.close();

    }
}
