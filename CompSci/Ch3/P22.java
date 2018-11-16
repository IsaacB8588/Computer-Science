
/**
 * Calculates tax depending on marriage status and income
 * 
 * @author Isaac Blandin 
 * @version September 14, 2018
 */
import java.util.Scanner;
public class P22
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        boolean married = true;
        double income = 0;
        double tax = 0;
        //asks for marriage status
        System.out.print("Married? yes or no: ");
        String answer = in.next();
        
        if(answer.equals("no")){
            married = false;
        }
        
        //asks for income
        System.out.print("Income: ");
        income = in.nextDouble();
        
        if(married){
           
            if(income <= 16000){
                //calculate tax
                tax = income * 0.1;
            } 
            else if (income <= 64000){
                //calculate tax
                tax = 1600 + 0.15 * (income - 16000);
            }
            else {
                //calculate tax
                tax = 8800 + 0.25 * (income - 64000);
            }
        } else {
           if(income <= 8000){
                //calculate tax
                tax = income * 0.1;
            } 
            else if (income <= 32000){
                //calculate tax
                tax = 800 + 0.15 * (income - 8000);
            }
            else {
                //calculate tax
                tax = 4400 + 0.25 * (income - 32000);
            }
        }
        //output tax
        System.out.printf("Your tax is: $%.2f \n", tax);
    }
}
