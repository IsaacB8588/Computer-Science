
/**
 * Gives the state of matter of water at a given temperature
 * 
 * @author Isaac Blandin 
 * @version September 15, 2018
 */
import java.util.Scanner;
public class P9
{
   public static void main(){
       Scanner in = new Scanner(System.in);
       double temp = 0;
       
       //ask for Celsius or Farenheit
       System.out.print("Enter temperature unit. C or F: ");
       String unit = in.next();
       //ask for temperature
       System.out.print("Enter water temperature: ");
       temp = in.nextDouble();
       
       //converts to celsius if farenheit
       if(unit.equals("F")){
           temp = (temp - 32)/1.8;
       }
       
       //decides what state of matter the water would be and prints the value.
       if (temp < 0){
           System.out.println("the water is solid");
       } else if (temp < 100){
           System.out.println("the water is liquid");
       } else {
           System.out.println("the water is gaseous");
       }
       
   }
}
