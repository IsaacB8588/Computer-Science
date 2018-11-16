
/**
 * Gives a coupon depending on amount spent at a grocery store
 * 
 * @author Isaac Blandin 
 * @version September 15, 2018
 */
import java.util.Scanner;
public class P34
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        double cost = 0;
        double coupon = 0;
        //ask for cost of groceries
        System.out.print("Enter cost of your groceries: ");
        cost = in.nextDouble();
        
        //determine coupon value depending on amount spent
        if (cost < 10){
            //no coupon
        } 
        //give 8 percent back if spent less than or equal to 60
        else if (cost <= 60){
            coupon = cost * 0.08;
        }
        //give 10 percent if between 60 and 150
        else if (cost <= 150){
            coupon = cost * 0.1;
        }
        //give 12 percent if between 150 and 210
        else if (cost <= 210){
            coupon = cost * 0.12;
        }
        //give 14 percent if over 210
        else {
            coupon = cost * 0.14;
        }
        //print coupon value
        System.out.printf("You win a discount coupon of $%.2f \n", coupon);
    }
}
