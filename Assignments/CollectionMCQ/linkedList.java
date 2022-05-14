package CollectionMCQ;

import java.util.*; 
public class linkedList 
{ 
public static void main(String[] args) 
{ 
List<String> list1 = new LinkedList<>(); 
list1.add("Linked"); 
list1.add("List"); 
list1.add("Linked"); 
list1.add("Map"); 
list1.add("Collection"); 
List<String> list2 = new LinkedList<>();
list2.add("Linked"); 
list1.removeAll(list2); 
for (String temp : list1) 
System.out.printf(temp + " "); 
System.out.println(); 
}
} 