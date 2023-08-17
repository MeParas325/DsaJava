// find the disappeared elements in a sorted array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PV_02_Question {

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disAppearedElements = new ArrayList<>();

        int j = 0;

        while(j < nums.length) {
            int correctIndex = nums[j] - 1;
            if(nums[j] < nums.length + 1 && nums[j] != nums[correctIndex]) {
                swap(nums, j, correctIndex);
            } else {
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

        // search missing in sorted array
        for(int index = 0; index < nums.length; index++) {
            if(index != nums[index] - 1) {
                disAppearedElements.add(index + 1);
            }
        }

        return disAppearedElements;
        
    }

    static void swap(int nums[], int j, int correct) {

        int temp = nums[j];
        nums[j] = nums[correct];
        nums[correct] = temp;
    }

    public static void main(String args[]) {

        int arr[] = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));


    }
    
}
