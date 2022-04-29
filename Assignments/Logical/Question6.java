// 6. Get two integer arrays as input, identify the common elements in the arrays
// and find the number of common elements.
// input1: {1,2,3,4}
// input2: {3,4,5,6}
// output: 4(3,4,3,4)

package Logical;

public class Question6 {
public static void main(String[] args) {
    int[] input1= new int[] {1,2,3,4,5,6,7,8,9};
    int[] input2= new int[] {3,4,5,6,1,2,12,13,10};
    int[] output= new int[input1.length+input2.length];
    int cnt=0;
    for(int i=0;i<input1.length;i++)
    {
        for(int j=0;j<input2.length;j++)
        {
            if(input1[i]==input2[j])
            {
                output[cnt]=input1[i];
                cnt++;
            }
        }
    }
    System.out.print(cnt+"(");
    for (int i : output) {
        if(i>0)
        {
            System.out.print(i+",");
        }
    }
    System.out.print(")");
    
}    
}
