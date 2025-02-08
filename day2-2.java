// Rahul and Rohith are playing a switch game.
// Rahul has given a string PresentState that contains only '+' and '-' . Both take turns to switch two consecutive "++" into "--" . The game ends when a person can no longer make a move, and therefore the other person will be the winner.
// Return all possible states of the string presentState after one valid move. You may return the answer in any order.If there is no valid move, return an empty list [] .

// Input Format:
// -------------
// Line-1: A string represents present state.

// Output Format:
// --------------
// Array of strings of possible states.

// Constraints:

    
//     1 <= string.length <= 500   
//     string[i] is either '+' or '-'

// Sample Input-1:
// ---------------
// --++- 

// Sample Output-1:
// ----------------
// [-----]

// Explanation:
// -------------
// ++ will be converted as --. Then game ends.

// Sample Input-2:
// ---------------
// --+++-++
// Sample Output-2:
// ----------------
// [----+-++, --+---++, --+++---]

import java.util.*;

class day2 {

    public static List<String> game(String str)
    {
        List<String> result = new ArrayList<>();

        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] == '+' & arr[i+1] == '+')
            {
                arr[i] = '-';
                arr[i+1] = '-';

                result.add(new String(arr));

                arr[i] = '+';
                arr[i+1] = '+';
            }
        }

        return result;

    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(game(str));
    }
}


