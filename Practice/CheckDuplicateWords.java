
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class CheckDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        String[] stringArray = str.split(" ");

        Map<String, Integer> stringMap = new HashMap<String, Integer>();

        for (String s : stringArray) {
            if (stringMap.containsKey(s)) {
                stringMap.put(s, stringMap.get(s) + 1);
            } else {
                stringMap.put(s, 1);
            }
        }

        Set<Entry<String, Integer>> set = stringMap.entrySet();

        for (Entry<String, Integer> entry : set) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }

        }
        
        sc.close();
    }
}
