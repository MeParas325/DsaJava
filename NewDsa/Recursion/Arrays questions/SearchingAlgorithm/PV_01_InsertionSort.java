package SearchingAlgorithm;

import java.util.Arrays;

public class PV_01_InsertionSort {

    static void insert(int arr[],int i)
  {
      
      if(i == arr.length) return;
      
      helper1(arr, i);
      insert(arr, ++i);
       
  }
  
  static void helper1(int arr[], int i) {
      
      if(i == 0) return;

      System.out.println("Array before swapping: " + Arrays.toString(arr));
      
      if(arr[i] < arr[i - 1]) {
          int temp = arr[i];
          arr[i] = arr[ i - 1];
          arr[i - 1] = temp;
      }

      System.out.println("Array after swapping: " + Arrays.toString(arr));
      
      helper1(arr, --i);
  }
  //Function to sort the array using insertion sort algorithm.
  public static void insertionSort(int arr[], int n)
  {
      insert(arr, 1);
  }

    public static void main(String args[]) {

        int arr[] = { 4, 1, 3, 9, 7};
        insertionSort(arr, arr.length);
        
    }
    
}
