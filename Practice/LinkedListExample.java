import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(23);
        linkedList.add(32);
        linkedList.add(89);
        linkedList.add(134);
        linkedList.add(123);
        linkedList.add(233);
        linkedList.add(723);

        System.out.println(linkedList);
        linkedList.add(9999);
        System.out.println(linkedList);
        linkedList.add(0, 123);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        // linkedList.addAll(c);\
    
        LinkedList<Integer> newList = new LinkedList<>();
        newList = (LinkedList) linkedList.clone();
        linkedList.clear();

        System.out.println(linkedList);
        newList.contains(123);
        System.out.println(newList);
        
        System.out.println(newList.size());
        newList.set(0, 1234);
        System.out.println(newList);
        System.out.println(newList.contains(12354));

        System.out.println(newList.isEmpty());
        
        
    }
}
