
/**
 * Gives a sum of a set of entries
 * 
 * @author Isaac Blandin 
 * @version October 16, 2018
 */
import java.util.Scanner;
public class Sum
{
    public static void main(){
        Scanner in = new Scanner(System.in);
    
        int sum = 0;
    
        System.out.print("Enter an Integer, Enter done when done: ");
        while(in.hasNextInt()){
            sum += in.nextInt();
            System.out.print("Next Integer: ");
        }
        System.out.println("the sum is " + sum);
    }
}
