
/**
 * Write a description of class Initials here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Initials
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is your first name? ");
        String firstName = in.next();
        System.out.print("What is your last name? ");
        String lastName = in.next();
       
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Your initials are " + firstInitial + " & " + lastInitial);
    }
}
