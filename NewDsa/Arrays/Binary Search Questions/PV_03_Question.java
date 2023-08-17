// public class PV_03_Question {

//     static int[] findFirstAndLastPosition(int arr[], int target) {

//         int start = -1, end = -1;

//         for(int i = 0; i<= arr.length - 1; i++) {

//             if(arr[i] == target) {
//                 if(start == -1) start = i;
//             }

//             if(arr[arr.length - i - 1] == target) {
//                 if(end == -1) end = arr.length - i - 1;
//             }

            

//         }

//         return start == -1 ? new int[] {-1, -1} :  new int[] {start, end};
//     }

//     static public void main(String args[]) {

//         int arr[] = {5, 7, 7, 7, 8, 8, 10};

//         int newArr[] = findFirstAndLastPosition(arr, 10);

//         for(int i = 0; i < newArr.length; i++) {
//             System.out.println(newArr[i]);
//         }
//     }
    
// }

// find the first and last occurance of any any element in a sorted array with log(n) time complexity => (facebook interview question)

import java.util.Arrays;

public class PV_03_Question {

    static int[] findFirstAndLastPosition(int arr[], int target) {

        int newArr[] = {-1, -1};

        newArr[0] = searchElement(arr, target, true);
        newArr[1] = searchElement(arr, target, false);

        return newArr;
    }

    static int searchElement(int arr[], int target, boolean firstOccurance) {

        int ans = -1, start = 0, end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(firstOccurance) end = mid - 1;
                else start = mid + 1;
            }
        }

        return ans; 
    }

    static public void main(String args[]) {

        int arr[] = {5, 7, 7, 8, 8, 10};

        int newArr[] = findFirstAndLastPosition(arr, 8);

        System.out.println(Arrays.toString(newArr));
    }
    
}
