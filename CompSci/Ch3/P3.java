
/**
 * Gives the number of digits in an integer
 * 
 * @author Isaac Blandin
 * @version September 18, 2018
 */
import java.util.Scanner;
public class P3
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int length = 1;
        //ask for an integer
        System.out.print("Enter an integer: ");
        //make sure entry is an integer
        if(in.hasNextInt()){
            num = in.nextInt();
        
            //make integer positive for getting length
            num = Math.abs(num);
        
            //figure out length of integer
            
            if (num >= 1000000000){
                length = 10;
            } else if (num >= 100000000){
                length = 9;
            } else if (num >= 10000000){
                length = 8;
            } else if (num >= 1000000){
                length = 7;
            } else if (num >= 100000){
                length = 6;
            } else if (num >= 10000){
                length = 5;
            } else if (num >= 1000){
                length = 4;
            } else if (num >= 100){
                length = 3;
            } else if (num >= 10){
                length = 2;
            }
            System.out.println("the length is " + length);
        }
        else {
            System.out.println("Not an Integer!");
        }
    }
}
