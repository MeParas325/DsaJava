package BacktrackingQuestions;
public class PV_10_MouseMazeObsPathDaig {

    static void mouseMazeObst(boolean maze[][], String path, int row, int col) {

        if(row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        if(row < maze.length - 1 && maze[row + 1][col]) mouseMazeObst(maze, path + "D", row + 1, col);
        if(row < maze.length - 1 && col < maze[0].length - 1 && maze[row + 1][col + 1]) mouseMazeObst(maze, path + "V", row + 1, col + 1);
        if(col < maze[0].length - 1 && maze[row][col + 1]) mouseMazeObst(maze, path + "R", row, col + 1);
    }

    public static void main(String args[]) {

        boolean arr[][] = {
            {true, true, false},
            {true, false, true},
            {true, true, true}

        };

        mouseMazeObst(arr, "", 0, 0);


    }
    
}
