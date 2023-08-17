import java.util.Vector;

public class PV_07_Vector {
    public static void main(String args[]){
        Vector v = new Vector();
        System.out.println("Initial capacity of vector is:"+v.capacity());

        for(int i = 0; i<v.capacity(); i++){
            v.addElement(i);
        }
        System.out.println("After entering elements in vector the capacity is:"+v.capacity());
        System.out.println(v);
        v.addElement("Paras");
        System.out.println("Last capacity is:"+v.capacity());

    }
}
