package OOPS;
public class A {
    public static String line="This is my Program";
     static
     {
     System.out.println("Welcome to Java"); 
    //  System.exit(0); 
     }
     public void display()
     {
     System.out.println("begin:");
     }
    public static void main(String[] args) {
    System.out.println("Program starts here");
    A object=new A();
    object.display();
    System.out.println(A.line);
    }
    }
    // What is the output of the following program
    // 1. 
    // Welcome to Java
    // Program starts here
    // begin:
    // This is my Program
    
    // 2. 
    // Program starts here
    // Welcome to Java
    // begin:
    // This is my Program
    
    // 3. program will not execute
    
    // 4. None of these     CORRECT OPTION because static block will execute while loading class and in
    //                       static block system.exit is present so it will terminate
