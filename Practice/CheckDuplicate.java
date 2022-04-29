import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CheckDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        Map<Character,Integer> characterMap = new LinkedHashMap<Character,Integer>();
        System.out.println(characterMap);
        for(char c: charArray)
        {
            if(characterMap.containsKey(c))
            {
                characterMap.put(c,characterMap.get(c)+1);
            }else{
                characterMap.put(c, 1);
            }
        }
        System.out.println(characterMap);
        for(Entry<Character,Integer> e: characterMap.entrySet())
        {
            if(e.getValue() >1)
            {
                System.out.println(e.getKey()+" = "+e.getValue());
            }            
        }
        sc.close();
    }
}
