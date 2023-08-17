public class ReverseArray {
    static public void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.println("Before reversing array is:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("\nAfter reversing array is:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
}
