
/**
 * Creates a binary number equivalent of a user given number;
 * 
 * @author Isaac Blandin
 * @version October 12, 2018
 */
import java.util.Scanner;
public class P14
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean valid = false;
        String number = "";
        //ask for value and repeat if invalid entry is given
        while(!valid){
            System.out.print("Enter a number: ");
            if(in.hasNextInt()){
                valid = true;
                num = in.nextInt();
            }
        }
        //convert to binry
        while(num > 0){
            if (num % 2 == 1){
                number = "1" + number;
            } else {
                number = "0" + number;
            }
            num /= 2;
        }
        //print value
        System.out.println(number);
    }
}
