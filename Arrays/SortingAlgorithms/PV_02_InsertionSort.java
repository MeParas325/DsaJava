public class PV_02_InsertionSort{
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int j;
            int temp = arr[i];
            for(j = i-1; (j>=0 && arr[j]>temp); j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
    static public void main(String args[]){
        int arr[] = {4, 5, 6, 1, 0, -1};
        System.out.println("Before sorting elements are:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        insertionSort(arr);
        System.out.println("After sorting elements are:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}