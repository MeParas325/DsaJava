package SortingAlgorithms;

import java.util.Arrays;

public class PV_04_MergeSortInPlace {

    static void mergeSort(int arr[], int start, int end) {

        if(start == end) return;
        
        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);

    }

    static void merge(int arr[], int start, int mid, int end) {

        int newArr[] = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end) {

            if(arr[i] < arr[j]) newArr[k] = arr[i++];
            else newArr[k] = arr[j++];
            k++;

        }

        while(i <= mid) newArr[k++] = arr[i++];
        while(j <= end) newArr[k++] = arr[j++];

        k = 0;

        while(k < newArr.length) arr[start + k] = newArr[k++];

    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 89, 2, 5, 0, -1};

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    
}
