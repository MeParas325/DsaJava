package BacktrackingQuestions;
import java.util.ArrayList;

public class PV_06_MouseMazePath {

    static void mazePath(String path, int row, int col, ArrayList<String> pathList) {

        if(row == 1 && col == 1) {
            pathList.add(path);
            return;
        }

        if(row > 1) mazePath(path + "D", row - 1, col, pathList);
        if(row != 1 && col != 1) mazePath(path + "V", row - 1, col - 1, pathList);
        if(col > 1) mazePath(path + "R", row, col - 1, pathList);

    }

    public static void main(String args[]) {

        ArrayList<String> pathList = new ArrayList<>();

        mazePath("", 3, 3, pathList);

        System.out.println(pathList);


    }
    
}
