public class PV_05_SearchingElementRotatedArray {
    static public int binarySearch(int arr[], int n, int key){
        int l = 0;
        int h = n;
        while(l<=h){
            int  mid = (l+h)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[l] == key){
                return l;
            }
            else if(arr[h] == key){
                return h;
            }
            if(arr[l]<arr[mid]){
                if(key>=arr[l] && key<arr[mid]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(key>arr[mid] && key<=arr[h]){
                    l = mid + 1;
                }
                else{
                    h = mid - 1;
                }
            }
        }

        return -1;

    }
    static public void main(String args[]){
        int arr[] = {123, 154, 355, 655, 766, 1, 3, 5, 78, 111};
        int val = binarySearch(arr, arr.length-1, 6554);
        
        if(val == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element found at:"+val);
        }

    }
}
