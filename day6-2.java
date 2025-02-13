You are given a list of N integers List[], list contains both +ve and -ve integers.
Your task is to findout, the Highest Product possible,
Where the product is the product of all the elements of contiguous sublist sList[],
and sub list should conatin atleast 1 integer.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[].

Output Format:
--------------
Print an integer output, the highest product.

Sample Input-1:
---------------
4
2 3 -2 4

Sample Output-1:
----------------
6

Explanation:
------------
Product of contiguous sub list [2,3].


Sample Input-2:
---------------
3
-2 0 -3

Sample Output-2:
----------------
0

Explanation:
------------
Product of sub list [0], where [-2,-3] is not a contiguous sublist

import java.util.*;

class Solution
{
    public static int maxProduct(int[] num)
    {
        int n = num.length;
        int maxProduct = Integer.MIN_VALUE;
        
        int product = 1;
        for(int i=0;i<n;i++)
        {
            product *= num[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) product = 1; 
        }
        
        product = 1;
        for (int i = n - 1; i >= 0; i--) 
        {
            product *= num[i];
            maxProduct = Math.max(maxProduct, product);
            if (product == 0) product = 1; // Reset on zero
        }
        
        return maxProduct;
        
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        
        System.out.print(maxProduct(arr));
    }
}
