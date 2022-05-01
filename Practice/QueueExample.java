import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();

        queue.add(12);
        queue.offer(13);
        queue.offer(43);
        queue.offer(53);
        queue.offer(63);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(queue.contains(53));
        // queue.remove();
        queue.clear();
        System.out.println(queue);
    

    }
}
