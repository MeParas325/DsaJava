import java.util.Arrays;

public class PV_01_Question{

    static int missingNumber(int arr[]) {

        int j = 0;

        while(j < arr.length) {
            int correct = arr[j];
            if(arr[j] < arr.length && arr[j] != arr[correct]) {
                swap(arr, j, correct);
            } else {
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        
        return arr.length;
    }

    static void swap(int arr[], int j, int correctIndex) {

        int temp = arr[j];
        arr[j] = arr[correctIndex];
        arr[correctIndex] = temp;

    }

    public static void main(String args[]) {

        int arr[] = {3, 0, 1};

        System.out.println(missingNumber(arr));
    }
}