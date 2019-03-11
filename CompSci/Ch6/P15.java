
/**
 * Randomly fills an array with integers from 1 to 10 without repeating
 * 
 * @author Isaac Blandin
 * @version December 14, 2018
 */
import java.util.Arrays;
public class P15
{
    public static void main(){
        int[] nums = new int[10];
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i < nums.length; i ++){
            int val = -1;
            int rand = 0;
            //skip already used ints
            while(val == -1){
                rand = (int)(Math.random() * 10);
                val = source[rand];
            }
            //assign to main array
            nums[i] = source[rand];
            //remove used number
            source[rand] = -1;

        }
        System.out.println(Arrays.toString(nums));
    }
}
