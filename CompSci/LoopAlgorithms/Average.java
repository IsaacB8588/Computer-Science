
/**
 * creates an average of given values
 * 
 * @author Isaac Blandin 
 * @version October 16, 2018
 */
import java.util.Scanner;
public class Average
{
    public static void main(){
        Scanner in = new Scanner(System.in);
    
        double sum = 0;
        int count = 0;
    
        System.out.print("Enter an Integer, Enter done when done: ");
        //add values until a non-number value is entered
        while(in.hasNextInt()){
            sum += in.nextInt();
            System.out.print("Next Integer: ");
            count ++;
        }
        //print the average
        System.out.println("the average is " + sum/count);
    }
}
