package ExceptionHandling;

class Base extends Exception {}
class Derived extends Base {}
public class Main {
 public static void main(String args[]) {
 // some other stuff
 try {
 // Some monitored code
 throw new Derived();
 }
 catch(Base b) { 
 System.out.println("Caught base class exception"); 
 }
//  catch(Derived d) { 
//  System.out.println("Caught derived class exception"); 
//  }
 }
} 
// compile time error because exception is already caught by base 