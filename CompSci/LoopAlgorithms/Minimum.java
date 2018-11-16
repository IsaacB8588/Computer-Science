
/**
 * Finds the minimum from a set of entries
 * 
 * @author Isaac Blandin
 * @version October 16, 2018
 */
import java.util.Scanner;
public class Minimum
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int min = 0;
        boolean first = true;
        
        System.out.print("Enter an integer, enter done when done: ");
        while(in.hasNextInt()){
            num = in.nextInt();
            if(first){
                min = num;
                first = false;
            }
            else {
                if (num < min){
                    min = num;
                }
            }
            System.out.print("Enter Next Value: ");
        }
        System.out.println("the minimum is " + min);
    }
}
