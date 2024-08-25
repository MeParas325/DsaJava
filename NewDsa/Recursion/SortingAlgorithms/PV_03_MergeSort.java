package SortingAlgorithms;

import java.util.Arrays;

public class PV_03_MergeSort{

    static int[] mergeSort(int arr[]) {

        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    static int[] merge(int[] left, int[] right) {
        int[] newArr = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {

            if(left[i] > right[j]) newArr[k] = right[j++];
            else newArr[k] = left[i++];
            k++;
        }

        while(i < left.length) newArr[k++] = left[i++];

        while(j < right.length) newArr[k++] = right[j++];

        return newArr;
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 89, 2, 5};

        System.out.println("Array before sorting is: " + Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println("Array after sorting is: "+ Arrays.toString(arr));

    }
}