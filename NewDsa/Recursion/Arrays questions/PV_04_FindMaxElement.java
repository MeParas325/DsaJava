public class PV_04_FindMaxElement {
    
    static int findMaxElement(int arr[], int minElement, int index) {

        if(index == arr.length - 1) return arr[arr.length - 1] ;

        return Math.max(arr[index], findMaxElement(arr, minElement, ++index));

    }

    public static void main(String args[]) {

        int arr[] = {45, 67, 23, 8, 24, 767};

        System.out.println(findMaxElement(arr, arr[0], 0));
    }
}
