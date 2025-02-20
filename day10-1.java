A researcher is working on data analysis and needs to find the best matching values 
from two sorted datasets based on a target sum.  

The researcher is given:  
->Two sorted lists of integers representing numerical data.  
->A target sum to compare against.  

The goal is to identify a pair of numbers (one from each list) whose sum is closest 
to the given target.  

Rules:
------
-> Each selected pair must consist of one element from each list.  
->If multiple pairs have the same closest sum, any one of them can be returned.  
->The input lists are already sorted in ascending order.  
->The output should be printed as a comma-separated pair.

Input Format:
-------------
Line 1: An integer N1, representing the size of the first list.
Line 2: N1 space-separated integers, representing elements of the first sorted list.
Line 3: An integer N2, representing the size of the second list.
Line 4: N2 space-separated integers, representing elements of the second sorted list.
Line 5: An integer X, representing the target sum.

Output Format:
--------------
Line-1: Print a comma-separated pair (a, b), where a is from list_1 and b is from list_2, such that their sum is closest to the target sum.

Sample Input-1:
---------------
4
1 4 5 7
4
10 20 30 40
32

Sample Output-1:
----------------
1,30

Explanation:
------------
The closest pair to 32 is (1,30) → 1 + 30 = 31, which is the closest sum to 32.

Sample Input-2:
---------------
3
2 4 6
4
5 7 11 13
15

Sample Output-2:
----------------
2,13

Explanation:
------------
The closest pair to 15 is (2,13) → 2 + 13 = 15, which is an exact match.
