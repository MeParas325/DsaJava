// find duplicate element in an array
import java.util.ArrayList;
import java.util.List;

public class PV_04_Question {

    static List<Integer> findDuplicates(int arr[]) {
        List<Integer> duplicateElements = new ArrayList<>();
        int i = 0;
        while(i < arr.length) {
            int currentIndex = arr[i] - 1;
            if(arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                duplicateElements.add(arr[index]);
            }
        }

        return duplicateElements;
    }

    static void swap(int arr[], int i, int currentIndex) {
        int temp = arr[i];
        arr[i] = arr[currentIndex];
        arr[currentIndex] = temp;
    }

    static public void main(String args[]) {

        int arr[] = {4,3,2,7,8,2,3,1};
        // int arr[] = {3, 2, 2};

        System.out.println(findDuplicates(arr));


    }
    
}
