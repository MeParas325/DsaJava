// find peak element in the mountain array => (Google, Amazon, TCS, Accenture, Adobe, Apple, Infosys, )

public class PV_05_Question {

    static int peakIndexMountainArray(int arr[]) {

        int start = 0, end = arr.length - 1;

        while(start != end) {
            
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) 
                end = mid;
            else if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String args[]) {

        int arr[] = {0, 10, 5, 2};

        System.out.println(peakIndexMountainArray(arr));
    }
    
}
