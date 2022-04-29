import java.util.Scanner;

public class Test {
    public static void main(String []path) {
        Scanner in = new Scanner(System.in);

        try {

            while (in.hasNext()) {  
                int t=in.nextInt();
                if(t==0) break;
                String ss = in.next();
                String FName = in.next();
                String LName = in.next();

                System.out.printf("SSN: %s, FirstName: %s, LastName: %s \n", ss, FName, LName);
            }

        } catch (Exception e) {
            System.err.println("Loading file failed");
            e.printStackTrace();
            System.exit(-1);
        }
        in.close();
    }
}
