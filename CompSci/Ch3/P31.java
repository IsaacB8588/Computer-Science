
/**
 * Gives a payroll for a person given their hours worked and their wage.  includes overtime pay.
 * 
 * @author Isaac Blandin 
 * @version September 11, 2018
 */
import java.util.Scanner;
public class P31
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        //ask for name
        System.out.print("Employee Name: ");
        String name = in.next();
        //ask for wage
        System.out.print("Hourly Wage: ");
        double wage = in.nextDouble();
        //ask for hours worked
        System.out.print("Hours Worked: ");
        double hours = in.nextDouble();
        
        //figure out if employee worked overtime
        if (hours > 40){
            //calculate pay with overtime
            double overtimeHours = hours - 40;
            double pay = wage * 40 + overtimeHours*wage*1.5;
            System.out.printf(name + "'s pay is $%.2f", pay);
        } else {
            //calculate pay
            double pay = hours * wage;
            System.out.printf(name + "'s pay is $%.2f", pay);
        }
        System.out.println();
    }
}
