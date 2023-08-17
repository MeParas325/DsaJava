import java.util.ArrayList;
import java.util.Arrays;

public class PV_03_FindAllDuplicates {

    public static void findAllDuplicates(int arr[]){

        Arrays.sort(arr);

        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                newArr.add(arr[i]);
            }
        }

        for(int i = 0; i<newArr.size(); i++){
            System.out.print(newArr.get(i)+" ");
        }
    }

    static public void main(String args[]){

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 4, 3, 1, 6};

        findAllDuplicates(arr);


    }
}
