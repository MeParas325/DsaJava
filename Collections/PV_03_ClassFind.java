import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Iterator;

public class PV_03_ClassFind {
    static public void main(String ars[]){
        Vector v = new Vector<>();
        Enumeration e = v.elements();
        Iterator itr = v.iterator();
        ListIterator ltr = v.listIterator();

        System.out.println(e.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
