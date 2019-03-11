
/**
 * Write a description of class TwoDimNums here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class TwoDimNums
{
    public static void main(){
        int[][] numbers = new int[3][4];
        int count = 1;
        for(int row = 0; row < numbers.length; row ++){
            for(int col = 0; col < numbers[0].length; col++){
                numbers[row][col] = count;
                count++;
            }
        }
        
        for(int row = 0; row < numbers.length; row ++){
            System.out.println(Arrays.toString(numbers[row]));
        }
    }
}
