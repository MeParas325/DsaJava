import java.util.LinkedHashSet;

public class PV_01_LinkedHashSet{
    public static void main(String arhs[]){
        LinkedHashSet obj = new LinkedHashSet();
        obj.add("Paras");
        obj.add("Tannu");
        obj.add(10);
        obj.add(20);
        obj.add(null);

        System.out.println(obj.add("Tanuja"));
        System.out.println(obj.add("Tannu"));
        System.out.println(obj);

    }
}