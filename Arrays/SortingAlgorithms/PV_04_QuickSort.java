public class PV_04_QuickSort{
    public static void quickSort(int a[], int l, int h){
        if(l<h){
            int pivot = partition(a, l, h);
            quickSort(a, l, pivot-1);
            quickSort(a, pivot+1, h);
        }
    }
    public static int partition(int a[], int l, int h){
        int i = l;
        int j = h;
        int pivot = a[l];
        while(i<j){
            while(a[i]<=pivot && i<=h-1)i++;
            while(a[j]>pivot && j>=l)j--;
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
            int temp = a[j];
            a[j] = pivot;
            a[l] = temp;
        return j;
    }
    static public void main(String args[]){
        int arr[] = {2, 3, 0, 1, 9, 4, 6, 2, 5, 9, 7, 1, 3};
        // int arr2[] = {2, 3, 0, 1, 9, 4};
        System.out.println("Before sorting elemets are:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        quickSort(arr, 0, arr.length-1);
        System.out.println("\n");

        System.out.println("After sorting elements are:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}