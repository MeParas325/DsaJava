package BacktrackingQuestions;
public class PV_03_MouseMazeDaigonal {

    static int mouseMaze(int row, int col) {
        
        if(row == 1 || col == 1) return 1;

        int count = 0;

        count += mouseMaze(row, col - 1);
        count += mouseMaze(row - 1, col - 1);
        count += mouseMaze(row - 1, col);

        return count;
    }

    public static void main(String args[]) {

        System.out.println(mouseMaze(2, 3));
    }
    
}
