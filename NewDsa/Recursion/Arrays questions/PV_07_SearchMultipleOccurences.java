import java.util.ArrayList;

public class PV_07_SearchMultipleOccurences {

    static ArrayList<Integer> getMultipleOccurences(int arr[], int index, ArrayList<Integer> arrayList, int target) {

        if(index == arr.length) return arrayList;

        if(arr[index] == target) arrayList.add(index);

        return getMultipleOccurences(arr, ++index, arrayList, target);
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 4, 5, 4, 6};

        ArrayList<Integer> arrayList = getMultipleOccurences(arr, 0, new ArrayList<Integer>(), 4);

        if(arrayList.isEmpty()) System.out.println("Not able to find target element");
        else for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i));
    }
    
}
