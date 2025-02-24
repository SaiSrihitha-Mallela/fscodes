Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), 
ans[i] is the number of 1's in the binary representation of i.

 

Example 1:
input =2
output =0 1 1
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

input =5
output =0 1 1 2 1 2

Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101


import java.util.*;

class Solution
{
    
    public static int count(int binary)
    {
        int sum = 0;
        while(binary>0)
        {
            sum += Math.abs(binary%10);
            binary = binary/10;
        }
        
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<=n;i++)
        {
            int binary = Integer.parseInt(Integer.toBinaryString(i));
            list.add(count(binary));
            
        }
        System.out.print(list);
    }
}
