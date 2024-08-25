package SearchingAlgorithm;

public class PV_01_RoatatedBinarySearch {

    static int roatatedBinarySearch(int arr[], int start, int end, int target) {
        
        int mid = start + (end - start) / 2;
        if (start > end) return -1;
        
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]) {

            if(target >= arr[start] && target < arr[mid]) return roatatedBinarySearch(arr, start, mid - 1, target);
            else return roatatedBinarySearch(arr, mid + 1, end, target);

        } else {
            if(arr[start] <= target) return roatatedBinarySearch(arr, start, mid - 1, target);
            else {
               if(target < arr[mid]) return roatatedBinarySearch(arr, start, mid - 1, target);
                else return roatatedBinarySearch(arr, mid + 1, end, target);
            } 
        }

    }

    public static void main(String args[]) {

        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };

        System.out.println(roatatedBinarySearch(arr, 0, arr.length - 1, 10));

    }

}
