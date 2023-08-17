public class PV_07_MInMaxElement {
    public static void main(String args[]){
        int arr[] = {1, 66, 89, 4, -56};

        int max = 0, min = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum is: "+min+", Maximum is: "+max);
    }
 
}
