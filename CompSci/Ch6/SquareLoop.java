
/**
 * Write a description of class SquareLoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class SquareLoop
{
    public static void main(){
        int[] numbers = new int[6];
        int sum = 0;
        for(int i = 0; i < 6; i ++){
            numbers[i] = (i + 1) * (i + 1);
        }
        for(int num:numbers){
            sum += num;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);
        System.out.println();
    }
}
