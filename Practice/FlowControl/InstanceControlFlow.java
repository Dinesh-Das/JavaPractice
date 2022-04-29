package FlowControl;
public class InstanceControlFlow {
    int i = 10; //3  //9
    {   //4
        m1();  //10
        System.out.println("first block"); //12
    }
    InstanceControlFlow() { //5
        System.out.println("CONSTRUCTOR"); //15
    }
    public static void main(String[] args) { //1
        InstanceControlFlow i = new InstanceControlFlow(); //2
        System.out.println("main method"); //16
        // InstanceControlFlow i2 = new InstanceControlFlow();
        i.i=0;
    }
    public void m1(){  //6
        System.out.println(j);  //11
    }
    { //7
        System.out.println("second block"); //13
    }
    int j = 20; //8  //14
}
//Rule
// 1. first static ,
// 1. when there is no object creation, main method is alone executed
// 1.  1. identification of instance members from top to bottom[3-8]
//2. execution of instance variable from top to bottom[9-14]
// 3. execution of constructor
// static flow -> one time activity
// instance flow -> for every obj
// ------------------
//IF we're not creating object, then identification of instance also not happen
//instance members will be created, only when we're creating atleast one object
//for every object creation, instance block will be executed
//first static block, in that for every object creation, instance flow will be performed
