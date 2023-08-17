class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int newArr[] = new int[nums1.length+nums2.length];
        int i = 0, j = 0, k = 0;
        
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                newArr[k++] = nums1[i++];
            }
            else{
                newArr[k++] = nums2[j++];
            }
            
         }
        
        while(i<nums1.length){
            newArr[k++] = nums1[i++];
        }
        while(j<nums2.length){
            newArr[k++] = nums2[j++];
        }
        
        if(newArr.length%2==0){
            int mid = newArr.length/2;
            double median = (newArr[mid]+newArr[mid-1])/2.0;
            return median;   
        }
        else{
            int mid = newArr.length/2;
            double median = newArr[mid];
            return median;
        }
        
    }
}
public class PV_02_MedianTwoSortedArray {
    static public void main(String args[]){
        Solution obj = new Solution();
        int arr1[] = {1, 2};
        int arr2[] = {3, 4};

        double median = obj.findMedianSortedArrays(arr1, arr2);
        System.out.println(median);

    }
}
