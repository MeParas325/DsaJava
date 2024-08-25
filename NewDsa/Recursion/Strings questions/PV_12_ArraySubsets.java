import java.util.ArrayList;

public class PV_12_ArraySubsets {

    public static void main(String args[]) {

        int arr[] = {1, 2, 2};

        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<Integer>());
        int start = 0, end = 0;

        for(int i = 0; i < arr.length; i++) {
            start = 0;

            if(i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outerList.size();

            for(int j = start; j < end; j++) {
                ArrayList<Integer> innerList = new ArrayList<>(outerList.get(j));
                innerList.add(arr[i]);
                outerList.add(innerList);
            }
        }

        for(int i = 0; i < outerList.size(); i++) {
            System.out.print(outerList.get(i) + "  ");
        }
    }
    
}
