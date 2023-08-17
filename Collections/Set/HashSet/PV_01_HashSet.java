import java.util.HashSet;

public class PV_01_HashSet{
    public static void main(String args[]){
        HashSet h = new HashSet();
        h.add(10);
        h.add("Paras");
        h.add("Tannu");
        h.add(44);
        h.add(null);
        System.out.println(h);
        System.out.println(h.add("Tannu"));
        System.out.println(h.add("tannu"));
        System.out.println(h);
    }
}