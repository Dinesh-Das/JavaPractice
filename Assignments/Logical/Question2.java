// 2. Find the max length-word in each string and return the max-length word. if 
// two words are of same length return the first occurring word of max-length?.
// input: "hello how are you Jenny"
// output: hello(length-5)
package Logical;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String line=sc.nextLine();
        String[] stringArray = line.split(" ");
        
        int max=0;
        int word=0;
        for(int i=0;i< stringArray.length;i++)
        {
            if(stringArray[i].length() > max)
            {
                max=stringArray[i].length();
                word=i;
            }
        }
        System.out.println(stringArray[word] +"(length-" +max+")");
        sc.close();

    }
    
}
