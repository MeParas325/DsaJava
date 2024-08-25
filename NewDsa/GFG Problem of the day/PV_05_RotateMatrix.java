// Amazon - Solution 1 - 25 June 2024
public class PV_05_RotateMatrix {

    static int[][] rotateMatrix(int k, int mat[][]) {

        int n = mat.length;
        int m = mat[0].length;

        int acutalRotation = k % m;
        
        int[][] newMatrix = new int[n][m];

        for(int col = 0; col < m; col++) {
            int rotationColumn = col - acutalRotation;
            if(rotationColumn < 0) {
                rotationColumn = m + rotationColumn;
            }
            for(int row = 0; row < n; row++) {
                newMatrix[row][rotationColumn] = mat[row][col];
            }
        }

        return newMatrix;
    }

    public static void main(String args[]) {

        int k = 1;
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int newMatrix[][] = rotateMatrix(k, matrix);

        for(int row = 0; row < newMatrix.length; row++) {
            for(int col = 0; col < newMatrix[0].length; col++) {
                System.out.print(newMatrix[row][col] + " ");
            }
            System.out.println();
        }


    }
    
}
