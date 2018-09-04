
/**
 * Gives a total price with shipping and tax for a bookstore order based on total book price and number of books
 * 
 * @author Isaac
 * @version September 3, 2018
 */
import java.util.Scanner;
public class P22
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        //ask for total book price
        System.out.print("Total Book Price: $");
        double bookPrice = in.nextDouble();
        
        //ask for number of books in order
        System.out.print("Number of Books: ");
        int bookAmount = in.nextInt();
        
        // compute shipping cost
        double shipCost = 2*bookAmount;
        
        //compute tax of book price
        double tax = 0.075*bookPrice;
        
        //compute total cost
        double totalCost = bookPrice + shipCost + tax;
        
        //print total cost
        System.out.printf("Total Order Cost: $%.2f", totalCost);
        System.out.println();
        System.out.println();
        
        
    }
}
