
/**
 * Write a description of class Password here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Password
{
   public static void main(){
        Scanner in = new Scanner(System.in);
        String password = "hello";
    
        boolean accessGranted = false;
        while(!accessGranted){
            System.out.print("Password: ");
            String entry = in.next();
            if(entry.equals(password))
            {
                System.out.println("access granted");
                accessGranted = true;
            } else {
                System.out.println("incorrect password");
            }
        }
    }
    
}
