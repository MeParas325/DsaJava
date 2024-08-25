package BacktrackingQuestions;
public class PV_11_MouseMazeAllPath {

    static void mouseMazeObst(boolean maze[][], String path, int row, int col) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if(!maze[row][col]) return;

        maze[row][col] = false;

        if(row > 0) mouseMazeObst(maze, path + "U", row - 1, col);
        if(row < maze.length - 1) mouseMazeObst(maze, path + "D", row + 1, col);
        if(col < maze[0].length - 1) mouseMazeObst(maze, path + "R", row, col + 1);
        if(col > 0) mouseMazeObst(maze, path + "L", row, col - 1);

        maze[row][col] = true;

    }


    public static void main(String args[]) {

        boolean arr[][] = {
            {true, true, true},
            {true, true, true},
            {true, true, true}

        };

        mouseMazeObst(arr, "", 0, 0);
    }
    
}
