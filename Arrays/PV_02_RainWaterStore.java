public class PV_02_RainWaterStore{
    public static void rainWater(int arr[]){
        int n = arr.length;
        int leftarr[] = new int[n];
        int rightarr[] = new int [n];
        leftarr[0] = arr[0];
        for(int i = 1; i<n; i++){
            leftarr[i] = Math.max(leftarr[i-1], arr[i]);
        }

        rightarr[n-1] = arr[n - 1];
        for(int i = n - 2; i>=0; i--){
            rightarr[i] = Math.max(rightarr[i+1], arr[i]);
        }

        int ans = 0;
        for(int i = 0; i<n; i++){
            ans += (Math.min(leftarr[i], rightarr[i]) - arr[i]);
        }

        System.out.println(ans);

    }
    public static void main(String args[]){
        int arr[] = {2, 1, 5, 6, 3, 4};
        // int arr1[] = {3, 1, 2, 4, 0, 1, 3, 2};

        rainWater(arr);
    }
}