import java.util.HashSet;
import java.util.Set;

public class PV_01_NoOfDistinctEle{
    static public int distinctElement(int arr[]){
        Set<Integer> set1 = new HashSet<>();
        for(int element: arr){
            set1.add(element);
        }
        return set1.size();


    }
    public static void main(String args[]){
        int arr[] = {2, 3, 5, 6, 2, 1, 0, 0};
        int val = distinctElement(arr);
        System.out.println("No of distinct elements:"+val);
    }
}