
/**
 * Write a description of class YesNo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class YesNo
{
   public static void main()
   {
       Scanner in = new Scanner(System.in);
       Boolean ans = in.nextBoolean();
       
       if(ans){
           System.out.println("yay");
       }  else {
           System.out.println("nay");
       }
   }
}
