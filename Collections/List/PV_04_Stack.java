import java.util.Stack;

public class PV_04_Stack {
    static public void main(String args[]){
        Stack<String> animal = new Stack<>();

        animal.push("Dog");
        animal.push("Frg");
        animal.push("Cat");
        animal.push("Lion");

        System.out.println(animal);

        System.out.println(animal.peek());

        animal.pop();
        System.out.println(animal);
    }
}
