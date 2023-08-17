public class PV_08_SwapAlternate {

    public static void swapAlternate(int arr[]){
        for(int i = 0; i<arr.length; i+=2){
            if(i+1 < arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    static public void main(String args[]){

        int even[] = {1, 3, 5, 6, 8, 9};
        int odd[] = {1, 2, 3, 4, 5};

        System.out.println("Array before swapping:");
        printArray(even);

        swapAlternate(even);

        System.out.println("\nArray after swapping:");
        printArray(even);

    }
}
