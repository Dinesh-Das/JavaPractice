// 3. Given a string, reverse the string and parse it with '-'.
// input:computer
// output:r-e-t-u-p-m-o-c
package Logical;

public class Question3 {
    public static void main(String[] args) {
        String input="computer";
        String output="";
        for(int i=input.length()-1;i>0;i--)
        {
            output=output+ input.charAt(i)+"-";
        }
        output+=input.charAt(0);
        System.out.println(output);
    }
}
