public class PV_03_SelectionSort{
    static public void selectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    min = j;
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    static public void main(String args[]){
        int ar[] = {-4, 1, 9, 2, 3, 6};
        selectionSort(ar);
        System.out.println("Array after sorting is:");
        for(int i = 0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }

    }
}