package OOPS;
public class Static {
    static int a;
   public static void fun()
   {
   System.out.println(a); 
   }
   public static class Static1{
    int b=20;
   public static void fun1()
   {
   // System.out.println(b); 
   }
}   
}
// Choose correct option
// 1.runtime error
// 2.b must be declared static.                 CORRECT OPTION because static methods have access to only static variables
// 3.nesting in static class is not possible.
// 4.no error.