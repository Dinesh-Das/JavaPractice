package OOPS;

public class exp1 {
    public void display() {
        System.out.println("this is an display function");
    }

    public class exp2 extends exp1 {
        public void draw() {
            System.out.println("this is an draw function");
        }
    }

    public static void main(String[] args) {
        exp1 e = new exp1();
        e.display();
        // e.draw(); 
    }
}
// a) Compilation Error  CORRECT OPTION because incorrect access on draw method
// b) this is an display function
// c) this is an draw function
// d) run time error
