public class PV_05_FindArraySorted{

    static boolean arraySorted(int arr[], int index) {

        if(index == arr.length - 1) return true;

        if(arr[index] > arr[index + 1]) return false;

        return arraySorted(arr, ++index);
    }

    public static void main(String args[]) {

        int arr[] = {6, 8};

        System.out.println(arraySorted(arr, 0));
    }
}