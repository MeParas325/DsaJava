// find the roatation of any sorted array
public class PV_09_Question {

    static int findPivotElement(int arr[]) {

        int pivotElementIndex = -1;
        int start = 0, end = arr.length - 1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if(arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return pivotElementIndex;
    }

    static int findRoatation(int arr[]) {

        int pivotIndex = findPivotElement(arr);

        if(pivotIndex == -1) {
            return 0;
        }

        return pivotIndex + 1;
    }

    static public void main(String args[]) {

        int arr[] = {7, 9, 11, 12, 15, 3, 4, 5, 6};

        System.out.println(findRoatation(arr));

    }
    
}
