public class PV_02_SumOfTraingle{

    static int sumOfTraingle(int arr[]) {

        if(arr.length == 1) return arr[0];

        int newArr[] = new int[arr.length - 1];

        helper(arr, newArr, 0, 0);

        return sumOfTraingle(newArr);
    }

    static void helper(int arr[], int newArr[], int i, int j){

        if(i == arr.length - 1) return;

        newArr[j] = arr[i] + arr[i + 1];

        helper(arr, newArr, ++i, ++j);

    }

    static public void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(sumOfTraingle(arr));
    }
}