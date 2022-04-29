package OOPS;
interface Animal{
    int a=10; //line 1
    public void eat();
    void travel();//line 2
    }
    class mammal implements Animal
    {
    public static void main(String[] args)
    {
    System.out.println("mammals ");}
    public void eat()
    {
    System.out.println("eating");
    }
   public void travel() //line 3 (added a public for solving error)
    {
    System.out.println("travelling");
    }
    }
    
    // 1.no error will be displayed
    // 2.error will be displayed in line 2 and 3
    // 3.error will be displayed in line 3 only          CORRECT OPTION because implementing class should always use public keyword
    // 4.error will be displayed in line 1 only