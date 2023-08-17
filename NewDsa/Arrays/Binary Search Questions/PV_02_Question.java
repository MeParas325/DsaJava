// find greatest floor (smaller then or equal to) elememt respect to the target element in an sorted array
public class PV_02_Question{

    public static void main(String args[]) {

        int []arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 14;

        int ans = floor(arr, target);

        System.out.println(ans);
    }

    static int floor(int arr[], int target) {

        int start = 0, end = arr.length - 1;

        if(arr[start] > target) return -1;

        while(start <= end) {

            // finding the mid of an array
            int mid = start + (end - start) / 2;

            // returning the ceiling element if mid == target
            if(arr[mid] == target) 
                return arr[mid];

            // searching the left side of array
            else if(arr[mid] > target)
                 end = mid - 1;

            // searching the right side of array
            else
                 start = mid + 1;
        }

        // if(start > end) then returning the end element which will be our floor element
        return arr[end];
    }
}