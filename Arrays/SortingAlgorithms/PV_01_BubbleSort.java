public class PV_01_BubbleSort{
    static public void bubbleSort(int arr[]){
        boolean swapped = false;
        for(int i = 0; i<arr.length-1; i++){ 
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j+1]<arr[j]){
                    swapped = true;
                    swap(arr, j, j+1);
                }
            }
            if(!swapped){
               break;
            }
            swapped = false;
        }


    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static public void main(String args[]){
        int arr1[] = {2, 1, 0, -3, 45, 7, 8};
        bubbleSort(arr1);

        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }
}