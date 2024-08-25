package BacktrackingQuestions;
import java.util.Arrays;

public class PV_12_MouseMazePathMatrix {

    static void mouseMazeObst(boolean maze[][], int pathMatrix[][], String path, int row, int col, int cellCount) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {

            pathMatrix[row][col] = cellCount + 1;

            for(int arr[]: pathMatrix) System.out.println(Arrays.toString(arr));
            System.out.println(path);
            System.out.println();

            pathMatrix[row][col] = 0;
            return;
        }
  
        if(!maze[row][col]) return;
        pathMatrix[row][col] = ++cellCount;
        maze[row][col] = false;

        if(row > 0) mouseMazeObst(maze, pathMatrix, path + "U", row - 1, col, cellCount);
        if(row < maze.length - 1) mouseMazeObst(maze, pathMatrix, path + "D", row + 1, col, cellCount);
        if(col < maze[0].length - 1) mouseMazeObst(maze, pathMatrix, path + "R", row, col + 1, cellCount);
        if(col > 0) mouseMazeObst(maze, pathMatrix, path + "L", row, col - 1, cellCount);

        maze[row][col] = true;
        pathMatrix[row][col] = 0;
    }

    public static void main(String args[]) {

        boolean arr[][] = {
            {true, true, true},
            {true, true, true},
            {true, true, true}

        };

        int pathMatrix[][] = new int[arr.length][arr[0].length];
        mouseMazeObst(arr, pathMatrix, "", 0, 0, 0);
    }
    
}
