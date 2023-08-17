public class PV_07_Question {

    static int findPeakElement(int[] nums) {

        int start = 0, end = nums.length - 1;

        while(start != end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;


    }

    static int orderAgnosticBS(int target, int[] nums, int start, int end) {

        int elementIndex = -1;

            while(start <= end) {
                
                int mid = start + (end - start) / 2;

                if(target < nums[mid]) {
                    end = mid - 1;
                } else if(target > nums[mid]) {
                    start = mid + 1;
                } else {
                    elementIndex = mid;
                    return elementIndex;
                }

            }

        return elementIndex;


    }


    static int search(int[] nums, int target) {

        int peakElementIndex = findPeakElement(nums);
        System.out.println(peakElementIndex);

        if(nums[peakElementIndex] == target) {
            return peakElementIndex;
        }

        int leftSideIndex = orderAgnosticBS(target, nums, 0, peakElementIndex);

        if(leftSideIndex != -1)
            return leftSideIndex;
        
        int rightSideIndex = orderAgnosticBS(target, nums, peakElementIndex + 1, nums.length - 1);

        return rightSideIndex;

    }

    public static void main(String args[]) {

        int arr[] = {5, 1, 3};

        System.out.println(search(arr, 5));


    }
    
}
