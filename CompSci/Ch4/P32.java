
/**
 * Does a check to see whether a credit card number is valid (uses 8 instead of 16 digits to simplify)
 * 
 * @author Isaac Blandin
 * @version October 29, 2018
 */
import java.util.Scanner;
public class P32
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        System.out.print("enter number: ");
        int num = in.nextInt();
        int singleSum = 0;
        int doubleSum = 0;
        int sum = 0;
        int checkDigit = num % 10;
        //go through each digit
        for(int i = 0; i < 8; i++){
            //add if divisible by 2
            if(i % 2 == 0){
                singleSum += num % 10;
            } else { // add each digit of the double
                doubleSum += num % 10 * 2 / 10;
                doubleSum += num % 10 * 2 % 10;
            }
            //remove the used digit
            num /= 10;
        }
        //check if the digit is valid
        sum = doubleSum + singleSum;
        if(sum % 10 == 0){
            System.out.println("Number is valid");
        } else {
            System.out.println("Number is invalid");
            System.out.println("Corrrect Check Number: " + ((10 - sum % 10 + checkDigit) % 10));
        }
        
    }
}
