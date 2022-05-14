package CollectionMCQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List; 
public class MyListReplaceAll { 
 public static void main(String a[]){ 
 List<String> list = new ArrayList<String>();
 list.add("java");
 list.add("unix");
 list.add("php");
 list.add("javascript");
 list.add("ruby");
 list.add(".net");
 list.add("java");
 System.out.println(list);
 Collections.replaceAll(list, "java", "ATM");
 System.out.println(list);
 }
}