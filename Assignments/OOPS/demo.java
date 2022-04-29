package OOPS;
class demo {
    public int x;
    private int y;
    void cal(int a, int b) {
    x = a + 1;
    y = b;
    } 
    } 
    class demonstration {
    public static void main(String args[])
    {
    demo obj = new demo(); 
    obj.cal(2, 3);
    // System.out.println(obj.x + " " + obj.y); 
    }
    }
    // a) 3 3
    // b) 2 3
    // c) Runtime Error
    // d) Compilation Error  CORRECT because Y is private field which is not accessible 
