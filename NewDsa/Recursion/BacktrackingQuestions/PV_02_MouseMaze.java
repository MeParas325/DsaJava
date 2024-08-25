package BacktrackingQuestions;
public class PV_02_MouseMaze {

    static void generatePath(String path, int row, int col) {

        if(row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if(row > 1) generatePath(path + "D", row - 1, col);
        if(col > 1) generatePath(path + "R", row, col - 1);
     }
    
    public static void main(String args[]) {

        generatePath("", 3, 3);
    }
}
