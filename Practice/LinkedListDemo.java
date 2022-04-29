import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(21);
        linkedList.add(711);
        linkedList.add(632);
        linkedList.add(411);
        linkedList.add(531);
        linkedList.add(121);
        linkedList.add(413);
        linkedList.add(-101);
        linkedList.add(100);

        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.remove(5));
        System.out.println(linkedList);
        System.out.println(linkedList.contains(413));
        System.out.println(linkedList.remove(Integer.valueOf(121)));
        System.out.println(linkedList);
    
        Queue<Integer> queueLinkedList = new LinkedList<>();
        queueLinkedList.offer(710);
        queueLinkedList.offer(398);
        queueLinkedList.offer(610);
        queueLinkedList.offer(910);
        queueLinkedList.offer(510);
        queueLinkedList.offer(-4210);
        queueLinkedList.offer(111);
        queueLinkedList.offer(110);
        queueLinkedList.offer(210);
        queueLinkedList.offer(310);

        System.out.println(queueLinkedList);
        System.out.println(queueLinkedList.poll());
        System.out.println(queueLinkedList);
        System.out.println(queueLinkedList.peek());
        System.out.println(queueLinkedList.size());

    }
}
