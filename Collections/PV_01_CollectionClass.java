import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PV_01_CollectionClass{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(0);
        list.add(0);
        System.out.println(list);

        System.out.println("Minimum element present in the list is:"+Collections.min(list));
        System.out.println("Maximum element present in the list is:"+Collections.max(list));
        System.out.println("Frequency of "+list.get(2)+" is:"+Collections.frequency(list, 1));
        System.out.println("Frequency of "+list.get(5)+" is:"+Collections.frequency(list, 0));
        System.out.println("Frequency of 3 is:"+Collections.frequency(list, 3));

        Collections.sort(list);
        System.out.println(list);
    }
}