package CollectionMCQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MyListDisjoint{
 public static void main(String a[]){
 
 List<String> sl = new ArrayList<String>();
 sl.add("java");
 sl.add("c++");
 sl.add("unix");
 List<String> tl = new ArrayList<String>();
 tl.add("job");
 tl.add("oracle");
 boolean isCommon = Collections.disjoint(sl,tl);
 System.out.println("Does not found any common elements? "+isCommon); //true 
 tl.add("java");
 isCommon = Collections.disjoint(sl,tl);
 System.out.println("Does not found any common elements? "+isCommon); //false
 }
}
