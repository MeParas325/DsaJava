// find duplicate in an array => (Amazon)
import java.util.Arrays;

public class PV_03_Question {

    static int cyclicSort(int arr[]) {

        int j = 0;

        while(j < arr.length) {
            
            if(arr[j] != j + 1) {
                int currentIndex = arr[j] - 1;
                if(arr[j] != arr[currentIndex]) {
                    swap(arr, j, currentIndex);
                } else {
                    return arr[j];
                }

            } else {
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

        return -1;
    }

    static void swap(int arr[], int j, int correctIndex) {
        int temp = arr[j];
        arr[j] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
    public static void main(String args[]) {

        int arr[] = {1, 3, 4, 2, 2};

        System.out.println(cyclicSort(arr));

    }
    
}
