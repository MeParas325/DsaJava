import java.util.HashSet;
import java.util.Set;

public class PV_02_NoOfUnion {
    static public void unionOfArray(int arr1[], int arr2[]){
        Set<Integer> set1 = new HashSet<>();
        for(int element: arr1){
            set1.add(element);
        }
        for(int element: arr2){
            set1.add(element);
        }
        for(int element: set1){
            System.out.print(element+" ");
        }

    }
    static public void main(String args[]){
        int arr1[] = {1, 2, 3, 5, 6, 8, 8};
        int arr2[] = {2, 5, 7, 0, 5, 2};
        unionOfArray(arr1, arr2);
    }
}
