import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        
        hashSet.add(10);    
        hashSet.add(10);
        hashSet.add(89);
        hashSet.add(6);
        hashSet.add(12);
        hashSet.add(90);
        hashSet.add(34);
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(22);

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(12));
        System.out.println(hashSet.remove(12));
        System.out.println(hashSet);
        System.out.println();
        System.out.println(hashSet.isEmpty());

        Iterator itr= hashSet.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        hashSet.clear();
        System.out.println(hashSet);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(912);
        hs.add(913);
        hs.add(914);
        hashSet.addAll(hs);
        
        System.out.println(hashSet);

        HashSet<Integer> hsr = new HashSet<>();
        hsr=(HashSet) hs.clone();

        System.out.println(hsr);
    }
}
// HashSet, LinkedHashSet, TreeSet

//  unique elements & no order
// HashSet 

// LinkedHashSet
// insertion order preserved  & unique elements

