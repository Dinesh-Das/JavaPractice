import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(12);
        linkedHashSet.add(50);
        linkedHashSet.add(123);
        linkedHashSet.add(32);
        linkedHashSet.add(12);
        linkedHashSet.add(19);
        linkedHashSet.add(17);
        
        System.out.println(linkedHashSet);

        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(99);
        linkedSet.add(98);
        linkedSet.add(97);
        linkedSet.add(96);

        System.out.println(linkedSet);

        linkedHashSet.addAll(linkedSet);
        
        System.out.println(linkedHashSet);

       System.out.println(linkedHashSet.remove(123));
       System.out.println(linkedHashSet);
        
       System.out.println(linkedHashSet.contains(99));
       System.out.println(linkedHashSet.containsAll(linkedSet));
        
       linkedSet.clear();
       System.out.println(linkedSet);

      


    }
}
