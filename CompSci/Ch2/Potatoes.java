
/**
 *Given a desired amount in pounds of potatoes, it gives the least amount of bags in 2 lb bags and 5lb bags
 * 
 * @author Isaac Blandin
 * @version 9/10/18
 */
import java.util.Scanner;
public class Potatoes
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        //ask for desired amount of potatoes
        System.out.print("Enter desired pounds of potatoes: ");
        int potatoes = in.nextInt();
        int twoLb = 0;
        
        //subtract 2 pound bags until the amount left is divisible by 5
        while(potatoes % 5 != 0){
            potatoes -= 2;
            twoLb ++;
        }
        //find amount of 5 pound bafs
        int fiveLb = potatoes / 5;
        //print values to user
        System.out.println("5 Pound Bags: " + fiveLb + "\n" + "2 Pound Bags: " + twoLb);
    }
}
