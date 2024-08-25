package SortingAlgorithms;

import java.util.Arrays;

public class PV_05_QuickSort {


    static int partition(int arr[], int low, int high) {

        int i = low - 1;
        int pivotElement = arr[high];

        for(int j = low; j < high; j++) {
            if(arr[j] < pivotElement) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        System.out.println(Arrays.toString(arr));

        return i;

    }
    static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pivIdx = partition(arr, low, high);

            quickSort(arr, low, pivIdx - 1);
            quickSort(arr, pivIdx + 1, high);
        }
    }

    public static void main(String args[]) {

        int arr[] = {2, 5, 1, 7, 0};

        System.out.println(Arrays.toString(args));
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
    
}
