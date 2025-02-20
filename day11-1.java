write a java program to find the greatest of 4 numbers using ternary operator 

input = 3 4 5 6
output = 6

import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
    
        int max = (n1 > n2) ? ((n1 > n3) ? ((n1 > n4) ? n1 : n4) : ((n3 > n4) ? n3 : n4)): ((n2 > n3) ? ((n2 > n4) ? n2 : n4) : ((n3 > n4) ? n3 : n4));
        
        System.out.print(max);
        
    }
    
    
}
