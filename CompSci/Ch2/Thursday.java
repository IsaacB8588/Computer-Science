
/**
 * Write a description of class Thursday here.
 * 
 * @author Isaac Blandin
 * @version August 30, 2018
 */
import java.util.Scanner;
public class Thursday
{
   public static void main()
   {
       Scanner in = new Scanner(System.in);
       
       //get miles driven
       System.out.print("Miles Driven: ");
       int miles = in.nextInt();
       
       //calculate cost
       double cost = 50 + 0.10*miles;
       
       System.out.printf("Cost: $%.2f", cost);
       System.out.println();
   }
}
