// Solution 1 - 27 June 2024
public class PV_07_ToeplitzMatrix {
    static boolean isToepliz(int mat[][]) {
        
        for(int row = 0; row < mat.length - 1; row++)
            for(int col = 0; col < mat[0].length - 1; col++)
                if(mat[row][col] != mat[row + 1][col + 1]) return false;
        
        return true;
    }
    public static void main(String args[]) {
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6}};


        System.out.println(isToepliz(arr));
    }
}
