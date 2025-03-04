Mr. Param is working with Strings.
He is given a String S. He has to find the palindromes in S, 
A palindrome can be a substring of S (Strictly substrings only, not subsequences).

Your task is to find the count the number of palindromes can be formed from S.

NOTE: Count each occurence of palindromes if duplicate substrings found. 

Input Format:
-------------
A string S

Output Format:
--------------
Print an integer, number of palindromes.

Sample Input-1:
---------------
divider

Sample Output-1:
----------------
9

Explanation:
-------------
Palindromes are d, i, v, i, d, e, r, ivi, divid

Sample Input-2:
---------------
abcdef

Sample Output-2:
----------------
6

Explanation:
-------------
Palindromes are a, b, c, d, e, f.

import java.util.*;

class Solution 
{
    public static int countPalindromes(String s)
    {
        int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) 
        {
            count += expandAroundCenter(s, i, i);     
            count += expandAroundCenter(s, i, i + 1); 
        }

        return count;
    }
    private static int expandAroundCenter(String s, int left, int right) 
    {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) 
        {
            count++;  
            left--;   
            right++; 
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countPalindromes(s));
        sc.close();
    }

}
