package BacktrackingQuestions;
import java.util.ArrayList;

public class PV_05_MouseMazePath {

    static ArrayList<String> mazePath(String path, int row, int col) {

        ArrayList<String> list = new ArrayList<>();

        if(row == 1 && col == 1) {
            list.add(path);
            return list;
        }

        if(row > 1) list.addAll(mazePath(path + "D", row - 1, col));
        if(row != 1 && col != 1) list.addAll(mazePath(path + "V", row - 1, col - 1));
        if(col > 1) list.addAll(mazePath(path + "R", row, col - 1));

        return list;
    }

    public static void main(String args[]) {

        ArrayList<String> pathList = mazePath("", 3, 3);

        System.out.println(pathList);
    }
    
}
