// Mr. Bob is a Military Encoders. 
//  Mr. Bob writes a word as shown below and then merges them. 
//  Help Bob to write the code. 
  
//  Mr. Bob will be given a word 'w' and a number 'n' 
  
// Sample Test Case - 1
// input = 
// ABCDE
//  2
// output = ACEBD
    
    
// This is How Bob writes the letters of the word 
// A C E
//  B D
    
// Now concatenate the two rows and ignore spaces in every row. We get ACEBD
    
    
// Sample Test Case - 2
// input = system
// 3
// output = seytms
    
//  s   e
//   y t m
//    s

// Now concatenate the 3 rows we get seytms


import java.io.StreamCorruptedException;
import java.util.*;

class day2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        int n = sc.nextInt();

        if(n==1)
        {
            System.out.println(str);
            return ;
        }

        StringBuilder rows[] = new StringBuilder[n];
        for(int i=0;i<rows.length;i++)
        {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        int index = 0;

        for(int i=0;i<str.length();i++)
        {
            rows[row].append(str.charAt(i));
            if(row==0) index = 1;
            if(row == n-1) index = -1;

            row += index;
        }

        StringBuilder str1 = new StringBuilder();
        for(int i=0;i<rows.length;i++)
        {
            str1.append(rows[i]);
        }

        System.out.println(str1.toString());
    }

}
