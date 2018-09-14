
/**
 * Takes a term from a user and prints a string that is the first and last 3 characters of that term
 * 
 * @author Isaac Blandin
 * @version 9/12/18
 */
import java.util.Scanner;
public class Assessment
{
   public static void main()
   {
       Scanner in = new Scanner(System.in);
       
       //ask for a string of at least 3 characters
       System.out.print("enter term with at least 3 characters: ");
       String term = in.next();
       
       //get first three characters
       String firstThree = term.substring(0,3);
       //find length of term
       int termLength = term.length();
       //get last three characters
       String lastThree = term.substring(termLength - 3);
       //print term
       System.out.println(firstThree + lastThree);
   }
}
