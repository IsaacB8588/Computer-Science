
/**
 * Write a description of class P32New here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P32New
{
    public static void main(){
        Scanner in = new Scanner (System.in);
        System.out.print("enter number: ");
        int num = in.nextInt();
        int singleSum = 0;
        int doubleSum = 0;
        int sum = 0;
        int checkDigit = num % 10;
        for(int i = 0; i < 8; i++){
            if(i % 2 == 0){
                singleSum += num % 10;
            } else {
                doubleSum += num % 10 * 2 / 10;
                doubleSum += num % 10 * 2 % 10;
            }
            num /= 10;
        }
        sum = doubleSum + singleSum;
        if(sum % 10 == 0){
            System.out.println("Number is valid");
        } else {
            System.out.println("Number is invalid");
            System.out.println("Corrrect Check Number: " + ((10 - sum % 10 + checkDigit) % 10));
        }
    }
}
