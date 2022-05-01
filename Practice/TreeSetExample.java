import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(32);
        ts.add(5);
        ts.add(0);
        ts.add(42);
        
        System.out.println(ts);

        TreeSet<Integer> newTs=(TreeSet) ts.descendingSet();

        System.out.println(newTs);

    }
}
