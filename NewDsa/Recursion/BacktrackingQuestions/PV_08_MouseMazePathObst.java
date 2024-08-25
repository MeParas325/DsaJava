package BacktrackingQuestions;
public class PV_08_MouseMazePathObst {

    static int mouseMazeObst(boolean maze[][], int row, int col) {

        if(row == maze.length - 1 || col == maze[0].length - 1) {
            return 1;
        }

        int count = 0;

        if(maze[row + 1][col] == true) count += mouseMazeObst(maze, row + 1, col);
        if(maze[row + 1][col + 1] == true) count += mouseMazeObst(maze, row + 1, col + 1);
        if(maze[row][col + 1] == true) count += mouseMazeObst(maze, row, col + 1);

        return count;
    }

    public static void main(String args[]) {

        boolean arr[][] = {
            {true, true, false},
            {true, true, true},
            {true, true, true}

        };

        System.out.println(mouseMazeObst(arr, 0, 0));
    }
    
}
