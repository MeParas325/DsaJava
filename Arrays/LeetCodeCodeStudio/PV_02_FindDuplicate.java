public class PV_02_FindDuplicate {

    public static void findDuplicate(int arr[]){
        int ans = 0;

        for(int i = 0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }

        for(int i = 1; i<arr.length; i++){
            ans = ans ^ i;
        }

        System.out.println("Answer is: "+ans);
    }


    public static void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6, 5};
        findDuplicate(arr);
    }
}
