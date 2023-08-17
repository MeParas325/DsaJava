public class PV_01_MaxSubArraySum{
    public static void main(String args[]){
        int currentSum = 0;
        int maxSum = 0;
        int arr[] = {2, 1, -5, 10, 1, -7};
        for(int i = 0; i<arr.length; i++){
                currentSum = currentSum + arr[i];
                if(currentSum>maxSum){
                    maxSum = currentSum;
                }
                else if(currentSum < 0){
                    currentSum = 0;
                }
        }
        System.out.println(maxSum);
    }
}