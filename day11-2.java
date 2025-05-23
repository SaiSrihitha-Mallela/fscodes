You are working in a toy factory where marbles of three different colors—Red, White, 
and Blue—are being packed into boxes. However, the marbles have been randomly mixed up 
in a production batch.

Your job is to sort the marbles in-place so that all marbles of the same color are 
grouped together in the following order:

Red marbles (0)
White marbles (1)
Blue marbles (2)

Task:
------
Write a function to rearrange the marbles in-place in a given array so that they 
follow the correct color order.

Constraints & Requirements:
----------------------------
->You cannot use any built-in sorting functions.
->You must modify the array directly (in-place), without using extra storage.
->Aim for an efficient solution, ideally with O(n) time complexity.

Input Format:
-------------
Line 1: An integer n, representing the size of the array.
Line 2: n space-separated integers representing the array nums, where each 
element is either 0 (red), 1 (white), or 2 (blue).

Output Format:
--------------
Line-1: Print the sorted array as n space-separated integers.

Sample Input-1:
---------------
6
2 0 2 1 1 0

Sample Output-1:
----------------
0 0 1 1 2 2

Sample Input-2:
---------------
3
2 0 1

Sample Output-2:
----------------
0 1 2
