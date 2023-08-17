import java.util.LinkedList;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.ArrayList;

public class PV_06_ArrayList {
    static public void main(String args[]){
        ArrayList l1 = new ArrayList();
        l1.add(3);
        l1.add("Paras");
        l1.add("Tannu");
        l1.add(null);
        System.out.println(l1);

        LinkedList l2 = new LinkedList();
        l2.add(23);
        l2.add("Tannu");
        l2.add(null);
        System.out.println(l2);

        System.out.println(l1 instanceof Serializable);
        System.out.println(l2 instanceof Serializable);
        System.out.println(l1 instanceof Cloneable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);
        System.out.println(l2 instanceof RandomAccess);

    }
}
