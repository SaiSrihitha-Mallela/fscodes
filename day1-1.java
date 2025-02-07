// Mr.Bob and Mr.Cob are working on a Military Mission. 
// They are supposed to encode the message and send the message to the under-cover team.

// Where Cob has written a script. Where the Script says double all the ascii values other than mentioned in the bracket
// (97,101,105,111,117,65,69,73,79,85) and place a '#' in between. 

// Help Bob in writing the Code. 


// Sample Test Case-1
// input = attack the enemy
// output = at#tt#tac#ck#k t#th#he en#nem#my#y



import java.util.*;

public class ascii {

    public static String Ascii(String str)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(97);
        arr.add(101);
        arr.add(105);
        arr.add(111);
        arr.add(117);
        arr.add(65);
        arr.add(69);
        arr.add(73);
        arr.add(79);
        arr.add(85);

        StringBuilder str1 = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) str.charAt(i);
            
            if(arr.contains(ascii))
            {
                str1.append(ch);
            }
            else{
                if(ch == ' ')
                {
                    str1.append(" ");
                    continue;
                }
                str1.append(ch).append("#").append(ch);
                // arr.add(ascii);
            }
        }

        return str1.toString();

    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = Ascii(str);
        System.out.println(result);
    }
    
    
}
