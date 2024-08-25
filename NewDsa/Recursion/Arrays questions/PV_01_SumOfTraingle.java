public class PV_01_SumOfTraingle{

    static int sumOfTraingle(int arr[]) {

        if(arr.length == 1) return arr[0];

        int newArr[] = new int[arr.length - 1];

        int j = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            newArr[j++] = arr[i] + arr[i + 1];
        }

        return sumOfTraingle(newArr);
    }

    static public void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(sumOfTraingle(arr));

    }
}