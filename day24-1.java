The Colossal Factorial Challenge

  A software engineer, during a technical interview, is presented with the following scenario:

"You are tasked with writing a Java program to calculate the factorial of a given non-negative integer. 
However, the input integer can be exceptionally large, potentially exceeding the limits of standard integer data types. 
Your solution must ensure accurate calculation without any loss of precision, regardless of the input's magnitude.

Task:

Write a Java program that takes a non-negative integer as input from the user.
Implement a method to calculate the factorial of the input integer.
Utilize the BigInteger class from the java.math package to handle large factorials.
Print the calculated factorial to the console.
Constraints:

The input integer will be a non-negative value.
The program must handle factorials of arbitrarily large numbers without integer overflow.
The output must be the exact factorial value, represented as a string of digits.
Example:

Input: 25

Output: 15511210043330985984000000"


import java.util.*;
import java.math.BigInteger;

class Solution
{
    public static BigInteger factorial(int n)
    {
        BigInteger fact = BigInteger.ONE;
        for(int i=2;i<=n;i++)
        {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }
}
