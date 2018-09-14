
/**
 * Write a description of class P31 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P31
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Employee Name: ");
        String name = in.next();
        System.out.print("Hourly Wage: ");
        double wage = in.nextDouble();
        System.out.print("Hours Worked: ");
        double hours = in.nextDouble();
        
        if (hours > 40){
            double overtimeHours = hours - 40;
            double pay = wage * 40 + overtimeHours*wage*1.5;
            System.out.printf(name + "'s pay is $%.2f", pay);
        } else {
            double pay = hours * wage;
            System.out.printf(name + "'s pay is $%.2f", pay);
        }
        System.out.println();
    }
}
