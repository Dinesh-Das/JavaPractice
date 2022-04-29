package OOPS;
public class com {
    int eid;
    String name;
    int salary;
    private com(int id,int sal)
    {
    System.out.println("id is" +id);
    System.out.println("id is" +sal);
    }
    public static void main(String[] args) {
    // com c=new com();
    com c1=new com(123,67);
    }
    }
    // choose the error in the program
    // 1)we can not make private constructor
    // 2)we cannot make object of com using com c=new com();    CORRECT Because there is no default constructor
    // 3)we cannot make object of com using com c1=new com(123,67);
    // 3) program successfully executes
