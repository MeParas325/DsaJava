// selection sort algorithm
import java.util.Arrays;

public class PV_13_Question{

    static public void main(String args[]) {

        int arr[] = {5, 2, 67, 7, 22, 1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));


    }

    static void selectionSort(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            int lastElementIndex = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, lastElementIndex);
            swap(arr, max, lastElementIndex);
        }
    }

    static int getMaxIndex(int arr[], int start, int end) {

        int max = start;

        for(int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }

    static void swap(int arr[], int max, int lastElementIndex) {
        int temp = arr[max];
        arr[max] = arr[lastElementIndex];
        arr[lastElementIndex] = temp;
    }
}