import java.util.ArrayList;

public class PV_08_SearchMultipleOccurences {

    static ArrayList<Integer> getMultipleOccurences(int arr[], int index, int target) {

        ArrayList<Integer> newList = new ArrayList<>();
        if(index == arr.length) return newList;

        if(arr[index] == target) newList.add(index);

        newList.addAll(getMultipleOccurences(arr, ++index, target));

        return newList;
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 4, 5, 4, 6};

        ArrayList<Integer> arrayList = getMultipleOccurences(arr, 0, 4);

        if(arrayList.isEmpty()) System.out.println("Not able to find target element");
        else for (int i = 0; i < arrayList.size(); i++) System.out.println(arrayList.get(i));
    }
    
}
