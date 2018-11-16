
/**
 * Takes a set of numbers and gives a average, mininum, maximum, and the range
 * 
 * @author Isaac Blandin
 * @version October 17, 2018
 */
import java.util.Scanner;
public class P5
{
    public static void main(){
        Scanner in = new Scanner(System.in);
    
        double sum = 0;
        double num = 0;
        double count = 0;
        double max = 0;
        double min = 0;
        boolean first = true;
        
        System.out.print("Enter an value, Enter done when done: ");
        //add values until a non-number value is entered
        while(in.hasNextDouble()){
            num = in.nextDouble();
            sum += num;
            System.out.print("Next value: ");
            count ++;
            
            if(first){
                min = num;
                max = num;
                first = false;
            }
            else {
                if (num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
           }
        }
        //print the average
        System.out.println("the average is " + (sum/count));
        //print the max
        System.out.println("the maximum is " + max);
        //print the min
        System.out.println("the mininim is " + min);
        //print the range
        System.out.println("the range is " + (max - min));
        
    }
}
