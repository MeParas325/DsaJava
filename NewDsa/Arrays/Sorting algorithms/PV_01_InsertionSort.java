import java.util.Arrays;

public class PV_01_InsertionSort{

    static void insertionSort(int [] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = i + 1; j > 0; j--) {

                if(arr[j] < arr[j - 1]) {
                    swap(arr, j);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int arr[], int j) {

        int temp = arr[j]; 
        arr[j] = arr[j - 1];
        arr[j - 1] = temp; 

    }

    static public void main(String args[]) {

        int arr[] = {5, 3, 4, 1, 2};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}