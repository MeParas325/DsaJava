public class PV_05_MergeSort{
    public static void mergeSort(int arr[], int arr2[], int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr, arr2, l, mid);
            mergeSort(arr, arr2, mid+1, h);
            merge(arr, arr2, l, mid, h);
        }
    }

    public static void merge(int arr[], int arr2[], int l, int mid, int h){
        int i = l;
        int k = l;
        int j = mid + 1;
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                arr2[k] = arr[i];
                k++;
                i++;
                
            }
            else{
                arr2[k] = arr[j];
                k++;
                j++;
            }
        }
        while(j<=h){
            arr2[k] = arr[j];
            k++;
            j++;
        }
        while(i<=mid){
            arr2[k] = arr[i];
            k++;
            i++;
        }
}
    public static void main(String args[]){
        int arr[] = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        int arr2[] = new int[9];
        mergeSort(arr, arr2, 0, arr.length - 1);

        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    } 

}