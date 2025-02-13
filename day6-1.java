A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

Sample Input-1:
---------------
xyzzaz

Sample Output-1:
----------------
1

Explanation: 
------------
There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Sample Input-2:
---------------
aababcabc

Sample Output-2:
----------------
4

Explanation: 
------------
There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".

  import java.util.*;

class Solution
{
    public static int unique(String str, int k)
    {
        int n = str.length();
        if(n<k)
        {
            return 0;
        }
        
        int count = 0;
        
        for(int i=0;i<=n-k;i++)
        {
            Set<Character> set = new HashSet<>();
            boolean isGood = true;
            for(int j=0;j<k;j++)
            {
                if(set.contains(str.charAt(i + j)))
                {
                    isGood = false;
                    break;
                }
                set.add(str.charAt(i+j));
                
            }
            
            if(isGood)
            {
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = 3;
        
        System.out.print(unique(str, k));
    }
}
