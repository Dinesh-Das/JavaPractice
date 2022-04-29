package OOPS;

class For1 {
    public static void main(String args[]) {
     int a=fun();
     System.out.println("a");
    }
    static int fun() {
    //  static int x= 0;
    int x=0; //for solving error
     return ++x;
    }
    }
    // Determine the error
    // 1.no error 
    // 2.x cannot be incremented
    // 3.x cannot be static    CORRECT 
    // 4.fun() cannot return a value
    