import java.util.ArrayDeque;

public class PV_08_ArrayDeque{
    public static void main(String args[]){
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        System.out.println(adq);

        adq.offer(4);
        adq.offer(-1);
        adq.offer(0);
        adq.offer(-5);
        adq.offer(45);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);


    }
}