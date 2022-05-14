package Capgi;
import java.util.Scanner;
public class FTC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1)
        {
           System.out.println(Utility.fahrenheitToCelcius(sc.nextDouble()));
        }else if(choice == 2) {
            int n=sc.nextInt();
            int ar[]=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println(Utility.getLevel(ar));

        }else{
            System.out.println("INVALID OPTION");
        }
        
    }
}
class Utility{
    
        public static int fahrenheitToCelcius(double f){
            double cel= ((f -32)* 5.0/9);
            return (int)Math.round(cel);
        }
        public static String getLevel(int[] ar)
        {
            String val="";
            int sum=0;
            for(int i=0;i<ar.length;i++)
            {
                sum+=ar[i];
            }
            if(sum>=100)
            {
                val="HIGH";
            }else if(sum>=70)
            {
                val="MEDIUM";
            }else if(sum < 70)
            {
                val="LOW";
            }
            return val;
        }
}