// find the element in 2D array which is row and column wise sorted
import java.util.Arrays;

public class PV_11_Question {

    static int[] binarySearch(int arr[][], int target) {

        int start = 0, end = arr.length - 1;

        while(start < arr.length && end >= 0) {

            if(arr[start][end] > target) {
                end--;
            } else if(arr[start][end] < target){
                start++;
            } else {
                return new int[]{start, end};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String args[]) {

        int arr[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 49},
                       {33, 34, 38, 50}};

        System.out.println(Arrays.toString(binarySearch(arr, 50)));
        System.out.println(arr.length);

    }
    
}
