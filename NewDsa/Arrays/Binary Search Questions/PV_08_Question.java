// search element in a roatated array
public class PV_08_Question {

    static int findPivot(int arr[]) {

        int start = 0, end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if(arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int search(int arr[], int target) {

        int pivotIndex = findPivot(arr);

        // if you did not find a pivot which means array is not roatated
        if(pivotIndex == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // if pivot is found you have 2 sorted asc arrays
        if(arr[pivotIndex] == target) {
            return pivotIndex;
        }

        int searchIndex = binarySearch(arr, target, 0, pivotIndex);

        if(searchIndex == -1) {

            searchIndex = binarySearch(arr, target, pivotIndex + 1, arr.length - 1);
        }

        return searchIndex;
    }

    static int binarySearch(int []arr, int target, int start, int end) {

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static public void main(String args[]) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0));

    }
    
}
