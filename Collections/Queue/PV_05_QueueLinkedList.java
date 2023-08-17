import java.util.LinkedList;
import java.util.Queue;
public class PV_05_QueueLinkedList {
    static public void main(String args[]){
        Queue<Integer> queue = new LinkedList<>();
        System.out.println(queue);

        queue.offer(20);
        queue.offer(21);
        queue.offer(22);
        queue.offer(23);

        System.out.println(queue);
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        System.out.println(queue);

    }
}
