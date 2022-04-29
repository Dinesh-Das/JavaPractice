package FlowControl;
public class StaticControlFlowExample {
    static int i = 10; //1  //6
   
    public static void main(String[] args){ //2
        m1();//11
        System.out.println("main"); //13
        System.out.println(z);//14
    }
    static{  //3
        m1(); //7
        System.out.println("first static block"); //9
    }
    public static void m1(){ //4
        System.out.println(" m1 m3ethod"); //8 //12
        System.out.println(z);  //8 //12
    }
    static int z = 20; //5 //10
   
}
// O/p:
// m1 metod
// 0
// first static block
// m1 metod
// 20
// main
// 20
//identification of static members from top to bottom [1-6]
//execution of static variable assignments and static blocks from top to bottom[7-12]
//main method execution [13-15]