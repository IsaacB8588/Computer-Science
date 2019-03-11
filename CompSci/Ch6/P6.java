
/**
 * method that creates the alternating sum of an Array
 * 
 * @author Isaac Blandin 
 * @version December 20, 2018
 */
import java.util.Arrays;
public class P6
{
    public static void main(){
        int[] nums = {1, 4, 9, 16, 9, 7, 4, 9 ,11};
        System.out.println(Arrays.toString(nums));
        System.out.println("alternating sum: " + alternatingSum(nums));
        
    }
    
    public static int alternatingSum(int[] numbers){
        int sum = 0;
        boolean add = true;
        //go through each elemend
        for(int num: numbers){
            //alternate adding and subtracting
            if(add){
                sum += num;
            } else {
                sum -= num;
            }
            add = !add;
        }
        
        return sum;
    }
}
