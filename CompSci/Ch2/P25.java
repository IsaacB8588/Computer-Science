
/**
 * Gives the change in dollars, quarters, dimes, nickels, and pennies to give back for change 
 * when doing a transaction with a given amount due and money given by customer
 * 
 * @author Isaac Blandin
 * @version September 5, 2018
 */
import java.util.Scanner;
public class P25
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Amount Due(in pennies): ");
        int amountDue = in.nextInt();
        System.out.print("Amount Recieved(in pennies): ");
        int amountGiven = in.nextInt();
        
        //calculate how much change needs to be given back
        int changeDue = amountGiven - amountDue;
        //calculate dollars to be given back
        int dollars = changeDue / 100;
        changeDue = changeDue % 100;
        //calculate quarters to be given back
        int quarters = changeDue / 25;
        changeDue = changeDue % 25;
        //calculate dimes to be given back
        int dimes = changeDue / 10;
        changeDue = changeDue % 10;
        //calculate nickels to be given back
        int nickels = changeDue / 5;
        changeDue = changeDue % 5;
        //claculate pennies to be given back
        int pennies = changeDue / 1;
        
        //give coins to be given back
        System.out.println("change to be given back: \n" + "Dollars: " + dollars + "\n" + "Quarters: " + quarters + "\n"
        + "Dimes: " + dimes + "\n" + "Nickels: " + nickels + "\n" + "Pennies: " + pennies + "\n");
        
    }
}
