Given an integer n, return an array ans of length n such that for each i 
(1 ≤ i ≤ n), ans[i-1] is the number of 0's in the 32-bit binary representation of i.

Assume input n>=1 


input = 5
output = 31 30 29 30 29

Explanation (32-bit binary representation):
1 → 00000000000000000000000000000001 → 31 zeros  
2 → 00000000000000000000000000000010 → 30 zeros  
3 → 00000000000000000000000000000011 → 29 zeros  
4 → 00000000000000000000000000000100 → 30 zeros  
5 → 00000000000000000000000000000101 → 29 zeros

