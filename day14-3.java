Tubby a Third Class Student has given a Assignment on Time Chapter by his class teacher.
Tubby is supposed to change the time given in AM/PM Format to 24 Hours Format. 
Help Tubby Solve the Problem 
  
The Maths teacher gave him the time in the following Format - HH:MM:SS:AM/PM
   
Assume all HH,MM,SS are in the valid range only 
  
Note: Midnight is 12:00:00AM on a 12-hour clock,  and 00:00:00 on a 24-hour clock. 
Noon is 12:00:00PM on a 12-hour clock,  and 12:00:00 on a 24-hour clock. 
       
Assume all input times are valid
    

Example:
input = 06:10:20PM
output = 18:10:20


  
import java.util.*;

class TimeConversion
{
    public static String conversion(String time)
    {
        StringBuilder hours = new StringBuilder();
        StringBuilder minutes = new StringBuilder();
        StringBuilder seconds = new StringBuilder();
        StringBuilder period = new StringBuilder();
        int colonCount = 0;

        for(int i=0;i<time.length();i++)
        {
            char ch = time.charAt(i);

            if(ch == ':')
            {
                colonCount++;
                continue;
            }

            if(colonCount == 0)
            {
                hours.append(ch);
            }
            else if(colonCount == 1)
            {
                minutes.append(ch);
            }
            else if(colonCount == 2)
            {
                if(Character.isDigit(ch))
                {
                    seconds.append(ch);
                }
                else
                {
                    period.append(ch);
                }
            }
        }

        int hrs = Integer.parseInt(hours.toString());
        String mins = minutes.toString();
        String secs = seconds.toString();
        String prd = period.toString();

        if(prd.equals("AM"))
        {
            if(hrs == 12)
            {
                hrs = 0;
            }
        }
        else{
            if(hrs != 12)
            {
                hrs += 12;
            }
        }

        String formate = (hrs < 10) ? "0" + hrs :  String.valueOf(hrs);
        
        return formate + ":" + mins + ":" + secs;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        System.out.print(conversion(time));
    }
}
    
