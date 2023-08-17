public class PV_01_FIndUniqueElement{

    static public int uniqueElement(int arr[]){
        int ans = 0;

        for(int i = 0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }

        return ans;
    }

    public static void main(String args[]){
        
        int arr[] = {1, 2, 2, 4, 4, 6, 6};
        System.out.println(uniqueElement(arr));

    }
}