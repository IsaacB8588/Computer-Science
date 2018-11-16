
/**
 * Takes a given conversion from dollar to yen and then converts dollars to yen
 * 
 * @author Isaac Blandin 
 * @version September 17, 2018
 */
import java.util.Scanner;
public class P27
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        double convert = 0;
        double dollar = 1;
        boolean valid = false;
        
        //ask for the conversion factor from dollar to yen 
        while (!valid){
            System.out.print("Enter yen per dollar: ");
            if(in.hasNextDouble()){
                convert = in.nextDouble();
                valid = true;
            }
        }
        
        //ask for dollar value.  0 is sentinel value
        while (dollar != 0){
            valid = false;
            while(!valid){
                System.out.print("Enter Dollar Value, 0 to exit: ");
                if(in.hasNextDouble()){
                    dollar = in.nextDouble();
                    valid = true;
                }
            }
            //print value
            if(dollar != 0){
                System.out.println("yen: " + (dollar * convert));
            }
        }
    }
}
