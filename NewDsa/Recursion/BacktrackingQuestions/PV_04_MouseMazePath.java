package BacktrackingQuestions;
public class PV_04_MouseMazePath {

    static void path(String path, int row, int col) {

        if(row == 1 && col == 1) {
            System.out.println(path);
            return;
        }

        if(row > 1) path(path + "D", row - 1, col);
        if(row != 1 && col != 1) path(path + "V", row - 1, col - 1);
        if(col > 1) path(path + "R", row, col - 1);
    }

    public static void main(String[] args) {

        path("", 3, 3);
        
    }
    
}
