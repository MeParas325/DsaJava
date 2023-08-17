public class Prob1_TwoSum{
    static public int[] twoSum(int[] nums, int target){
        int arr[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    for(int k = 0; k<2; k++){
                        arr[k] = i;
                    }
                }
            }

        }
        return arr;

    }
    static public void main(String args[]){
        int arr[] = {1, 3, 5, 7, 2};
        int arr2[] = twoSum(arr, 9);
        System.out.println(arr2);
 
    }
}