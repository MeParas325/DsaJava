//Find the first and last occurence of an number in an sorted array using binary search

public class PV_10_FindOccurence {

    public static int findOccu1(int arr[], int key){
        int start = 0, end = arr.length - 1, ans = -1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == key){
                end = mid - 1;
                ans = mid;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int findOccu2(int arr[], int key){
        int start = 0, end = arr.length - 1, ans = -1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == key){
                start = mid + 1;
                ans = mid;
            }else if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String args[]){

        int arr[] = {1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 6, 6, 7, 7};

        System.out.println("First occurence of an element in the array is: "+findOccu1(arr, 9));
        System.out.println("Last occurence of an element in the array is: "+findOccu2(arr, 9));

    }
    
}
