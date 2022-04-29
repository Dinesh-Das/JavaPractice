// 1. Write a program to find the EB bill with the given inputs,
// input1="abc2012345"
// input2="abc2012660"
// input 3=4
// In the given input1 "abc20" refers to customer id and 12345 refers to the last month 
// EB reading, similarly from input2 “abc20” refers to customer id and 12660 refers to 
// this month EB reading.
// Find the difference between two reading 12660 and 12345 and multiply it by input3.
// Sample Output
// Output=(12660-12345)*4
// Output=1260

package Logical;

public class Question1 {
   public static void main(String[] args) {
       String input1="abc2012345";
       String input2="abc2012660";
       int res = (Integer.parseInt(input2.substring(4)) - Integer.parseInt(input1.substring(4))) * 4;
       System.out.println(res);
    } 
}
