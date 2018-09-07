
/**
 * takes a number between 1,000 and 999,999 and gives the number without a comma.
 * ex: 10,000 -> 10000
 * 
 * @author Isaac Blandin
 * @version September 5, 2018
 */
import java.util.Scanner;
public class P13
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        //ask for number
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String number = in.next();
        
        //use the string length to figure out how many figures are before the comma
        int length = number.length();
        int commaPos = length - 4;
        
        //make substrings of all the characters besides the comma 
        String beforeComma = number.substring(0, commaPos);
        String afterComma = number.substring(length - 3);
        
        //print number without comma
        System.out.println(beforeComma + afterComma);
    }
}
