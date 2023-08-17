public class PV_03_BinarySearch {
    static public void binarySearch(int arr[], int low, int high, int key){
        while(low<=high){
            if(arr[low] == key){
                 System.out.println("Key is found at:"+low+" and the key is:"+arr[low]);
                 return;
            }
            else if(arr[high] == key){
                System.out.println("Key is found at:"+high+" and the key is:"+arr[high]);
                return;
            }
            else{
                int mid = (low+high)/2;

                if(arr[mid]==key){
                    System.out.println("Key is found at:"+mid+" and the key is:"+arr[mid]);
                    return;
                }
                else if(key<arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        System.out.println("Sorry your key is not available in this array.");
    }
    public static void main(String args[]){
        int arr[] = {2, 2, 3, 5, 6, 7, 8, 10, 11, 12};
        binarySearch(arr, 0, arr.length-1, 12);
    }
}
