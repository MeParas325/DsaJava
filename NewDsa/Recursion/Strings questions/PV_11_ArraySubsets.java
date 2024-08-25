import java.util.ArrayList;

public class PV_11_ArraySubsets {

    public static void main(String args[]) {

        int arr[] = {1, 2, 3};

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());

        for(int i = 0; i < arr.length; i++) {

            int outerSize = list.size();
            System.out.println(list);

            for(int j = 0; j < outerSize; j++) {
                ArrayList<Integer> innerList = new ArrayList<>(list.get(j));
                System.out.println(innerList);
                innerList.add(arr[i]);
                list.add(innerList);
            }
            
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    
}
