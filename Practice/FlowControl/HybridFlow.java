package FlowControl;
public class HybridFlow {
    {    //7
        System.out.println("1st instance block"); //9
    }
    static{ //1
        System.out.println("1st static block"); //4
    }
    HybridFlow(){//8
        System.out.println("constructor");//11
    }
    public static void main(String[] args){ //2
        HybridFlow t1= new HybridFlow(); //6
        System.out.println("main"); //12
        HybridFlow t2 = new HybridFlow(); //13
        
    }
    static{ //3
        System.out.println("2nd static block"); //5
    }
    {//8
        System.out.println("2nd instance block"); //10
    }
}
//
// "1st static block/
// 2nd static block
//1st instance block
//2nd instance
//constructor
//main
