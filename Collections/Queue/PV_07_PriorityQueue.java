import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PV_07_PriorityQueue {
    static public void main(String args[]){
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        System.out.println(queue);

        queue.offer(20);
        queue.offer(50);
        queue.offer(8);
        queue.offer(2);

        System.out.println(queue);
        queue.poll();

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());


        System.out.println(queue);

    }
}


