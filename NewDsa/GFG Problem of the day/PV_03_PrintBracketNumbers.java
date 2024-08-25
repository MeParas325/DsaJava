// Flipkart - Solution 1 - 23 June 2024
import java.util.ArrayList;
import java.util.Stack;

public class PV_03_PrintBracketNumbers{

    public static void main(String args[]) {

        String str = "(aa(bdc))p(dee)";
        int a = 0;
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(char ch: str.toCharArray()) {
            if(ch == '(') {
                a++;
                arrayList.add(a);
                stack.push(a);
                
            } else if(ch == ')') arrayList.add(stack.pop());
        }
        
        System.out.println(arrayList);
    }
}