public class PV_06_Question {

    static int smallestPositiveMissingNumber(int arr[]) {

        int i = 0;

        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return index + 1;
            }
        }

        return - 1;
    }

    static void swap(int arr[], int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 0};

        System.out.println(smallestPositiveMissingNumber(arr));
    }
    
}
