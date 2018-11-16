
/**
 * method that computes the balance of a bank account given a initial value, interest rate (as decimal), and time in years
 * 
 * @author Isaac Blandin 
 * @version November 14, 2018
 */
public class P22
{
    public static void main(){
        System.out.println("Balance: " + balance(10, 0.03, 5));
    }
    public static double balance(double initial, double interestRate, double years){
        return initial * Math.pow(1 + interestRate, years);
    }
}
