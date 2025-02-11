Cob is working an Group of numbers.
His teacher gave him to print the Maximum product of the 'k' consiqutive numbers. 

The first line of input contains the group size followed by group numbers followed by k


sample input 1 :
----------------
5
1 5 3 2 10
3
sample output 1 :
-----------------
60

sample input 2 :
----------------
7
8 7 1 8 2 9 1
2
sample output 2:
----------------
56

import java.util.*;

class Solution
{
    public static int maxNum(int[] arr, int n , int k)
    {
        if(n<k)
        {
            return -1;
        }
        
        int max_value = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++)
        {
            int product = 1;
            for(int j=0;j<k;j++)
            {
                product *= arr[i+j];
                
            }
            max_value = Math.max(max_value, product);
        }
        
        return max_value;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        System.out.print(maxNum(arr, n , k));
    }
}
