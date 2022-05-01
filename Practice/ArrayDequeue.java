import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDequeue = new ArrayDeque<>();
        
        arrayDequeue.offer(12);
        arrayDequeue.offer(14);
        System.out.println(arrayDequeue);
        arrayDequeue.offerFirst(323);
        arrayDequeue.offerLast(999);
        System.out.println(arrayDequeue);
        arrayDequeue.offer(666);
        arrayDequeue.offer(222);

        System.out.println(arrayDequeue);
        
        System.out.println(arrayDequeue.peek());
        System.out.println(arrayDequeue.peekFirst());
        System.out.println(arrayDequeue.peekLast());


        System.out.println(arrayDequeue.poll());
        System.out.println(arrayDequeue.pollFirst());
        System.out.println(arrayDequeue.pollLast());

        System.out.println(arrayDequeue.pop());

    }
}
