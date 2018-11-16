
/**
 * finds the maximum number from a set of entries
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Maximum
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        int num = 0;
        int max = 0;
        
        System.out.print("Enter a positive integer, enter done when done: ");
        while(in.hasNextInt()){
            num = in.nextInt();
            if(num > max){
                max = num;
            }
            System.out.print("Enter Next Value: ");
        }
        System.out.println("the maximum is " + max);
    }
}
