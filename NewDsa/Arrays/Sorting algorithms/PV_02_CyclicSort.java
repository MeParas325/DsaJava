import java.util.Arrays;

public class PV_02_CyclicSort {

    static void cyclicSort1(int []arr) {

        for(int i = 0; i < arr.length; i++) {

            while(i != arr[i] - 1) {

                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp; 
            }
        }

    }

    static void cyclicSort2(int []arr) {

        int j = 0;

        while(j < arr.length) {

            int correctIndex = arr[j] - 1;

            if(arr[j] != arr[correctIndex]) {
                swap(arr, j, correctIndex);
            } else {
                j++;
            }
        }
    }

    static void swap (int arr[], int j, int correctIndex) {

        int temp = arr[j];
        arr[j] = arr[correctIndex];
        arr[correctIndex] = temp;

    }

    public static void main(String args[]) {

        int  arr[] = {3, 2, 5, 1, 4, 7, 6};

        cyclicSort2(arr);

        System.out.println(Arrays.toString(arr));
    }
    
}
