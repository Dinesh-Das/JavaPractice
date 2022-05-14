package CollectionMCQ;

import java.util.*;
public class Main {
 public static void main(String a[]){
 Vector<String> vct = new Vector<String>();
 vct.add("First");
 vct.add("Second");
 Enumeration<String> enm = vct.elements();
 while(enm.hasMoreElements()){
 System.out.println(enm.nextElement());
 }
 List<String> list = new ArrayList<String>();
 list.add("one");
 list.add("two");
 vct.addAll(list);
 System.out.println("After Copy: "+vct);
 Vector<String> copy = (Vector<String>) vct.clone();
 System.out.println("Cloned vector:"+copy);
 }
}