// 4. Given two strings, If the two strings are of same length concatenate them, if 
// they are not of same length, reduce the longer string to size of smaller one, and 
// concatenate them
// input1:"hello"
// input2:"hi" 
// output:"lohi"
package Logical;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input1=sc.nextLine();
        String input2=sc.nextLine();
        String output="";
        if(input1.length() == input2.length())
        {
            output=input1.concat(input2);
            System.out.println(output);
        }else
        {
            if(input1.length()> input2.length())
            {
               output=input1.substring(input1.length()-input2.length());
               output=output.concat(input2);
            }else
            {
                output=input2.substring(input2.length()-input1.length());
                output=output.concat(input1);
            }
        }
        System.out.println(output);
        sc.close();
    }
}
