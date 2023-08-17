public class PV_01_Stocks{
    public static void main(String arhs[]){
        int arr[] = {2, 4, 8, 4, 32};
        int maxProfit = 0;
        int minSoFar = arr[0];

        for(int i = 0; i<arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }
}

// 2 4 8 4 32
// maxProfit =0 2 6 6 30
// profit =   2 2 6 2 30
// minSoFar = 2 2 2 2 2