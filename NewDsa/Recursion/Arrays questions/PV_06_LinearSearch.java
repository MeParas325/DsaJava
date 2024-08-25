public class PV_06_LinearSearch {

    static int linearSearch(int arr[], int index, int target) {

        if(index == arr.length) return -1;

        return arr[index] == target ? index : linearSearch(arr, ++index, target);
    }

    public static void main(String args[]) {

        int arr[] = {1, 56, 77, 43, 6};

        System.out.println(linearSearch(arr, 0, 4));
    }
    
}
