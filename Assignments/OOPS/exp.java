package OOPS;

public class exp {
    public void display() {
        System.out.println("This is a display function");
    }

    public void main(String[] args) {
        System.out.println("this is an main function");
        exp e = new exp();
        e.main(args);
        e.display();
    }
}
// a) Compile time error
// b) No error because its not main method
// c) output =This is an display function
// this is an main function
// d) Run time error                          Correct option
