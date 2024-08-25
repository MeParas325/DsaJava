import java.util.ArrayList;

public class PV_10_StringSubsets {

    static ArrayList<String> generateSubsets(String up, String p) {

        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()) {
            list.add(p);
            return list;
        }

        list.addAll(generateSubsets(up.substring(1), p + up.charAt(0)));
        list.addAll(generateSubsets(up.substring(1), p));

        return list;

    }

    public static void main(String[] args) {

        String str = "abc";

        ArrayList<String> subsets = generateSubsets(str, "");

        for(int i = 0; i < subsets.size(); i++) System.out.print(subsets.get(i) + " ");
    }
    
}
