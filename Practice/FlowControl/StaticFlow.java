package FlowControl;
public class StaticFlow {

    static int i = 10; // 1 //7
    static { // 2
        m1(); // 8
        System.out.println("first static block");// 10
    }

    public static void main(String[] args) { // 3
        m1(); // 13
        System.out.println("main"); // 15
    }

    public static void m1() { // 4
        System.out.println(j); // 9 //14
    }

    static { // 5
        System.out.println("2nd block"); // 11
    }
    static int j = 20; // 6 //12
}
// 1. identification of static members from top to bottom[1-6]
// 2. Execution of static variable assignments and static blocks from top to
// bottom[7-12]
// 3. main method execution [13-15]
// O/p:
// 0
// 1st
// 2ndblock