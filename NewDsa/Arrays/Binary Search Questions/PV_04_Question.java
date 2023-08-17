// search the element in an infinite array => (Amazon interview question)
public class PV_04_Question {

    static int searchElement(int arr[], int target) {

        if(arr[arr.length - 1] < target) return -1;

        int start = 0;
        int end = 1;

        while(target > arr[end]) {

            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int arr[], int target, int start, int end) {
       
        int ans = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) 
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else {
                ans = mid;
                return ans;
            }
        }

        return ans;

    }
    
    public static void main(String args[]) {

        int arr[] = {1, 5, 7, 8, 22, 55, 77, 878};

        int elementIndex = searchElement(arr, 22);

        if(elementIndex == -1) 
            System.out.println("Element is not found");
        else 
            System.out.println("Element found at: " + elementIndex);


    }
}
