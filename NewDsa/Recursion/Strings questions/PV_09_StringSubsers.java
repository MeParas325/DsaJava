import java.util.ArrayList;

public class PV_09_StringSubsers {

    static void generateSubsets(String up, String p, ArrayList<String> list) {

        if(up.isEmpty()) {
            list.add(p);
            return;
        }

        generateSubsets(up.substring(1), p + up.charAt(0), list);
        generateSubsets(up.substring(1), p, list);

    }

    public static void main(String[] args) {
        
        String str = "abc";
        ArrayList<String> subSets = new ArrayList<String>();

        generateSubsets(str, "", subSets);

        for(int i = 0; i < subSets.size(); i++) {
            System.out.print(subSets.get(i) + " ");
        }
    }
    
}
