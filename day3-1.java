You are given an array consisting of N integers, and an integer, K. 
Your task is to determine the minimum element in subarrays of size K.

Sample Input1:
--------------
5
10 12 14 11 15
3

Sample Output1:
---------------
10 11 11

Sample Input2:
--------------
5
5 2 1 1 1
4

Sample Output2:
---------------
1 1

import java.util.*;

class Solution
{
    
    public static ArrayList<Integer> slidingwindow(int[] arr, int N , int K)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        
        
        for(int i=0;i<=N-K;i++)
        {
            int min_value = Integer.MAX_VALUE;
            
            for(int j=0;j<K;j++)
            {
                min_value = Math.min(min_value, arr[i+j]);
            }
            list.add(min_value);
        }
        
        return list;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        System.out.print(slidingwindow(arr, N, k));
        
        
        
    }
}
