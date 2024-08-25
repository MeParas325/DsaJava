package SortingAlgorithms;

public class PV_01_BubbleSort {

    static void display(int arr[]) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void bubbleSort(int arr[], int row, int col) {

        if(row == 0) return;

        if(col < row) {
            if(arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            bubbleSort(arr, row, ++col);
        } else {
            bubbleSort(arr, --row, 0);
        }
    }
    
    public static void main(String args[]) {

        int arr[] = {45, 23, 67, 744};

        System.out.println("Array before sorting:");
        display(arr);

        System.out.println("Array after sorting:");
        bubbleSort(arr, arr.length - 1, 0);
        display(arr);
        

    }
}
