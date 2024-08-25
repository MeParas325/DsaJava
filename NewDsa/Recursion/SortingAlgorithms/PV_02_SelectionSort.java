package SortingAlgorithms;

public class PV_02_SelectionSort {

    static void display(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void selectionSort(int arr[], int row, int col, int maxElementIndex) {

        if(row <= 0) return;

        if(col < row) {
            if(arr[col] < arr[col + 1] && arr[maxElementIndex] < arr[col + 1]) maxElementIndex = col + 1;
            selectionSort(arr, row, ++col, maxElementIndex);
        } else {
            int temp = arr[row];
            arr[row] = arr[maxElementIndex];
            arr[maxElementIndex] = temp; 
            selectionSort(arr, --row, 0, 0);
        }
    }

    public static void main(String args[]) {
        
        int arr[] = {63, 657, 33, 6, 8, -11, 0, -1};

        System.out.println("Array before sorting:");
        display(arr);

        System.out.println("Array after sorting:");
        selectionSort(arr, arr.length - 1, 0, 0);
        display(arr);
    }
    
}
