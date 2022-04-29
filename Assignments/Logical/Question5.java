// 5. A number is given as input. Find the odd digits in the number, add them, and 
// find if the sum is odd or not. If even return 1, if odd return 2
// input:52315
// logic:5+3+1+5=14(even)
// output:1
// input:1112
// logic:1+1+1=3(odd)
// output:2
package Logical;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:" );
        int no=sc.nextInt();
        int sum=0,rem;
        while(no>0)
        {
            rem=no%10;
            if(rem %2 ==1)
            {
                sum+=rem;
            }
            no/=10;
        }
        if(sum%2==0)
        {
            System.out.println("1");
        }else{
            System.out.println("2");
        }
        sc.close();
    }
}
