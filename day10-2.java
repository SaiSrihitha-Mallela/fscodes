Given a string s and an abbreviation abbr, determine whether abbr correctly 
represents s by following the abbreviation rules.

A valid abbreviation replaces consecutive characters in s with a number 
representing the count of omitted characters while maintaining the sequence of the 
remaining letters.

For instance, the string "word" can be abbreviated in the following valid ways:
["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]

Any abbreviation that deviates from this pattern is considered invalid.

Note: Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.

Input Format:
-------------
Line-1: A string, S contains only lowercase letters
Line-2: A string, abbr contains lowercase letters and digits

Output Format:
--------------
Line-1: A boolean value.
Sample Input-1:
---------------
internationalization
i12iz4n

Sample Output-1:
---------------
true

Sample Input-2:
---------------
apple
a2e

Sample Output-2:
---------------
false

Time Complexity: O(n) where n=max(len(word),len(abbr))
Auxiliary Space:  O(1).
