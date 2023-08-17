// search the element in a sorted 2D array
import java.util.Arrays;

public class PV_12_Question {

    static public void main(String args[]) {

        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] binarySearch(int arr[][], int row, int cStart, int cEnd, int target) {

        while(cStart <= cEnd) {

            int mid = cStart + (cEnd - cStart) / 2;

            if(arr[row][mid] == target) {
                return new int[]{row, mid};
            } else if(arr[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                cStart = mid + 1;
            }
        }

        return new int[]{-1, -1};

    }

    static int[] search(int arr[][], int target) {

        int rows = arr.length;
        int col = arr[0].length;

        if(rows == 1) {
            return binarySearch(arr, rows, 0, col - 1, target);
        }

        int rStart = 0, rEnd = rows - 1;
        int colMid = (col - 1) / 2;

        while(rStart < rEnd - 1) {
            int mid = rStart + (rEnd - rStart) / 2;
            
            if(arr[mid][colMid] == target) {
                return new int[]{mid, colMid};
            } else if(arr[mid][colMid] > target) {
                rEnd = mid;
            } else {
                rStart = mid;
            }
        }

        // now we have two rows
        // check whether element is available in col of two rows
        if(arr[rStart][colMid] == target) {
            return new int[]{rStart, colMid};
        }
        if(arr[rStart + 1][colMid] == target) {
            return new int[]{rStart, colMid};
        }


        // search in first half
        if(arr[rStart][colMid - 1] >= target) {
            return binarySearch(arr, rStart, 0, colMid - 1, target);
        } 
        // search in second half
        if(arr[rStart][colMid + 1] >= target && target <= arr[rStart][col]) {
            return binarySearch(arr, rStart, colMid + 1, col, target);
        }
        // search in third half
        if(arr[rStart + 1][colMid - 1] >= target) {
            return binarySearch(arr, rStart + 1, 0, colMid - 1, target);
        } else {
            return binarySearch(arr, rStart + 1, colMid + 1, col, target);
        }

    }
    
}