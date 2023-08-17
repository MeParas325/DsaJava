public class PV_09_BinarySearch {

    public static void binarySearch(int arr[], int key){
        int s = 0, e = arr.length - 1;

        while(s<=e){
            int mid = s + (e - s) / 2;
    
            if(arr[mid] == key){
                System.out.println("Element found at "+ mid +" index");
                return;
            }else if(arr[mid] < key){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
    
        if(s>e){
            System.out.println("Element is not found");
        }

    }
    public static void main(String args[]){

        int arr[] = {1, 2, 4, 5, 7, 8};

        binarySearch(arr, 80);

    }
}
