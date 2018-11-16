
/**
 * Prints each character of an entry separately
 * 
 * @author Isaac Blandin
 * @version October 16, 2018
 */
import java.util.Scanner;
public class P8
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or term (no spaces): ");
        String entry = in.next();
        
        //goes through each character and prints
        for(int i = 0; i < entry.length(); i ++){
            System.out.println(entry.charAt(i));
        }
    }
}
