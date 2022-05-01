import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pasta");
        food.add("Maggie");
        food.add("Biryani");
        food.add("Hakka Noodles");
        // food.add(123);
        System.out.println(food);
        System.out.println(food.size());

        ArrayList<String> foodClone = new ArrayList<>();
        foodClone=(ArrayList) food.clone();
        foodClone.add("Dosa");
        foodClone.add("Uttapa");
        foodClone.add("Idli");

        // System.out.println();
        //  System.out.println(foodClone);
        // System.out.println(foodClone.size());
        // System.out.println(foodClone.get(6));
        // System.out.println(foodClone.remove(2));
        // foodClone.add(2, "Bread Pakoda");
        // System.out.println(foodClone);
        // food.addAll(foodClone);
        // System.out.println(food);
        // foodClone.clear();
        // System.out.println(foodClone);
        // System.out.println(food.contains("Pasta"));
        // System.out.println(food.indexOf("Dosa"));
        
        foodClone.set(0, "element");
        // Iterator it = foodClone.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }

        // for(String val: foodClone)
        // {
        //     System.out.println(val);
        // }
        
        for(int i=0;i<foodClone.size();i++)
        {
            System.out.println(foodClone.get(i));
        }
        
        // ListIterator lit = foodClone.listIterator();
        // while(lit.hasPrevious())
        // {
        //     System.out.println(lit.previous());
        // }
        // while(lit.hasNext())
        // {
        //     System.out.println(lit.hasNext());
        // }

    }

    
}
/**
 *                          COLLECTION
 *  
*          LIST                SET             QUEUE                MAP
 *  
 *     ARRAYL LINKEDL       HashSet             PriorityQueue       
 *     STACK/VECTOR         LinkedHash Set      ArrayDequeue 
 *                          TREE SET
 */
     // food.size();
        // food.get(index);
        // food.remove(index);
        // food.add(e);
        // food.add(index, element);
        // food.clear();
        // food.addAll(c);
        // food.addAll(index, c);
        // food.clone();
        // food.contains(o);
