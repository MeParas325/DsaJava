public class PV_04_SortingInfiniteArray {
    static public int infiniteSort(int arr[], int key){
        int low = 0;
        int high = 1;
        while(arr[high]<key){
            low = high;
            high = 2 * low;
            if(high>=arr.length){
                return -1;
            }
        }

        return binarySearch(arr, low, high, key);
    }

    static public int binarySearch(int arr[], int low, int high, int key){
        while(low<=high){
            if(arr[low] == key){
                System.out.println("Key is found at location:"+low);
                return low;
            }
            else if(arr[high] == key){
                System.out.println("Key is found at location:"+high);
                return high;
            }

            int mid = (low + high)/2;

            if(arr[mid] == key){
                System.out.println("Key is found at location:"+high);
                return mid;
            }
            else if(arr[mid]<key){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
    static public void main(String args[]){
        int arr[] = {1, 2, 4};
        int val = infiniteSort(arr, 9);

        if(val == -1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found at location:"+val);
        }
    }
}
