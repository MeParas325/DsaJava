// find duplicate and missing element in the array

import java.util.Arrays;

public class PV_05_Question {

    static int[] findErrorNums(int[] nums) {

        int arr[] = new int[2];

        int i = 0;

        // while(i < nums.length) {
        //     int currentIndex = nums[i] - 1;
        //     if(nums[i] != arr[currentIndex]) {
        //         swap(nums, i, currentIndex);
        //     } else {
        //         i++;
        //     }
        // }

        while(i < arr.length) {
            int currentIndex = arr[i] - 1;
            if(arr[i] != arr[currentIndex]) {
                swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }

        System.out.println("Hello");

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                arr[0] = nums[index];
                arr[1] = index + 1;
                break;
            }
        }

        return arr;
        
    }

    static void swap(int arr[], int i, int currentIndex) {
        int temp = arr[i];
        arr[i] = arr[currentIndex];
        arr[currentIndex] = temp;
    }

    public static void main(String args[]) {

        int arr[] = {3, 2, 2};

        System.out.println(Arrays.toString(findErrorNums(arr)));

    }
    
}
