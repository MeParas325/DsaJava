import java.util.Arrays;

public class PV_06_InitializeArray{
    public static void main(String args[]){

        int arr[] = new int[4];
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        Arrays.fill(arr, -4);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        Arrays.fill(arr, 4);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}