In a mysterious land of numbers, a special number is called a "Mirror Tail" number. 

A number earns this title if, after squaring it, the last few digits of the square are 
identical to the number itself.

Sample Example:
input: 
-----
5
1 5 6 25 76 

output:
-------
YES 
YES 
YES 
YES 
YES

Example:
5  -> 5² = 25 -> ends with 5 
6 - >6² = 36 -> ends with 6
76 -> 76² = 5776 ->  ends with 76
25 -> 25² = 625 -> ends with 25 

If it is a Mirror Tail Print "YES" , else Print "NO" 


import java.util.*;

class Solution
{
    public static void isMirror(int original) {
        int square = original * original;
        int temp = original;
        int digits = 0;

       
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = (int)Math.pow(10, digits);

        if (square % divisor == original) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            int num = arr[i] * arr[i];
            isMirror(arr[i]);
        }
        
        
    }
}
