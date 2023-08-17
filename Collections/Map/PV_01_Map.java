import java.util.HashMap;
import java.util.Map;

public class PV_01_Map{
    public static void main(String args[]){
        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        System.out.println(map);

        map.putIfAbsent("Six", 6);
        System.out.println(map);
        map.putIfAbsent("Two", 43);
        System.out.println(map);

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsValue(3));
        System.out.println(map.containsKey("One"));
        System.out.println(map.isEmpty());
    }
}