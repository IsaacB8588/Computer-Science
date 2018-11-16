
/**
 * finds the minimum value of a value in a given set of inputs.  
 * 
 * @author Isaac Blandin 
 * @version October 12, 2018
 */
import java.util.Scanner;
public class P6
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        boolean first = true;
        boolean isInt = false;
        int minimum = 0;
        //prompt the user
        System.out.println("Enter a non-number value to get result and quit");
        System.out.print("Enter a Value: ");
        //continues the code if a number is entered
        while (in.hasNextInt()){
            int entry = in.nextInt();
            //sets number to first entry at beginning
            if(first){;
                first = false;
                minimum = entry;
            } else { // sets new minimum if number is less than the previous minimum
                if (entry < minimum){
                    minimum = entry;
                }
            }
            System.out.print("Enter a Value: ");
        }
        //prints the value
        System.out.println("The minimum is " + minimum);
    }
    
}
