import java.util.HashSet;
import java.util.Set;

public class PV_03_InteractionArrays {
    static int count;
    static public void interactionArrays(int arr1[], int arr2[]){
        Set<Integer> set1 = new HashSet<>();
        for(int element: arr1){
            set1.add(element);
        }
        for(int element: arr2){
            if(set1.contains(element)){
                count++;
                set1.remove(element);
            }
        }

        System.out.println("No of Intersect elements in both arrays:"+count);
    }
    static public void main(String args[]){
        int arr1[] = {1, 3, 5, 7, 8, 9};
        int arr2[] = {1, 2, 4, 6, 2};
        interactionArrays(arr1, arr2);
    }
}
