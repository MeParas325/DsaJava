// search element in a mountain array
public class PV_06_Question {

    static int peakElement(int[] mountainArr) {

        int start = 0, end = mountainArr.length - 1;

        while(start != end) {
            
            int mid = start + (end - start) / 2;

            if(mountainArr[mid] < mountainArr[mid + 1])
                start = mid + 1;
            else {
                end = mid;
            }

        }

        return start;

    }

     static int orderAgnosticBS(int target, int[] mountainArr, int start, int end) {
        int elementIndex = -1;

        if(mountainArr[start] < mountainArr[end]) {

             while(start <= end) {
                int mid = start + (end - start) / 2;

                    if(target < mountainArr[mid]) 
                        end = mid - 1;
                    else if(target > mountainArr[mid])
                        start = mid + 1;
                    else {
                        elementIndex = mid;
                        break;
                    }
            }

        }

        else if(mountainArr[start] >= mountainArr[end]) {

            while(start <= end) {
                int mid = start + (end - start) / 2;

                    if(target > mountainArr[mid]) 
                        end = mid - 1;
                    else if(target < mountainArr[mid])
                        start = mid + 1;
                    else {
                        elementIndex = mid;
                        break;
                    }
            }           
        }    
        return elementIndex;
    }




    static int findInMountainArray(int target, int[] mountainArr) {

        int peakElementIndex = peakElement(mountainArr);
        
        if(mountainArr[peakElementIndex] == target) 
            return peakElementIndex;

        int min = orderAgnosticBS(target, mountainArr, 0, peakElementIndex);

        if(min != -1) return min;

        int max = orderAgnosticBS(target, mountainArr, peakElementIndex + 1, mountainArr.length - 1);
        System.out.println(max);

        return max;
        
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 2};
        System.out.println(findInMountainArray(2, arr));


    }
    
}
