Christina has given a task to break his friends code 
he will given all lower case alphabets  and code as the input 
Christina has to figure the text from the code and display the text 

Input - The first line of input consists of lower case alphabets and code 
The first alphabet letter will given 01, second alphabet will be given 02, and so on 
Output - Break the code and display the string 


Sample Test Case - 1 
input =
abcdefghijklmnopqrstuvwxyz
110525

Explantion - 
From the above test case we have 'a' has '01', 'b' has '02', and finally 'z' has '26' 
where each alphabet will be assigned a two digit number 
and for the code 110525 the characters will be 11 as 'k', 05 as 'e' and 25 as 'y' 
so the output is "key" 

Sample Test Case - 2
input =
qpwoeirutyalskdjfhgzmxncbv
131013090521
output = system


Explantion - From the above test case we have 'q' as '01' , 'p' as '02' and finally 'v' as '26'
and for the code 131013090521 we have the following code 
13-s
10-y
13-s
09-t
05-e
21-m

so the output is system

import java.util.*;

class Solution
{
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String code = sc.next();
        
        int n = code.length();
        int x = n/2;
        
        int j = 0;
        int[] arr = new int[x];
        for(int i=0;i<x;i++)
        {
            arr[i] = Integer.parseInt(code.substring(j,j+2));
            j=j+2;
        }
        
        for(int i=0;i<x;i++)
        {
            System.out.print(s.charAt(arr[i]-1));
        }
    }
}
