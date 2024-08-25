public class PV_03_FindMinElement{

    static int findMinElement(int arr[], int minElement, int index) {

        if(index == arr.length - 1) return arr[arr.length - 1] ;

        return Math.min(arr[index], findMinElement(arr, minElement, ++index));

    }

    public static void main(String args[]) {

        int arr[] = {45, 67, 23, 8, 24, 7};

        System.out.println(findMinElement(arr, arr[0], 0));
    }
} 