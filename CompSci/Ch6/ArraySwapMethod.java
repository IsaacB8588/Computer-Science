
/**
 * uses a method to swap postions in an array
 * 
 * @author Isaac Blandin
 * @version December 20
 */
import java.util.Arrays;
public class ArraySwapMethod
{
    public static void main(){
        int[] nums = {2, 4, -3, 6, 12};
        System.out.println(Arrays.toString(nums));
        
        swap(nums, 1, 2);
        System.out.println(Arrays.toString(nums));
    }
    
    public static void swap(int[] array, int pos1, int pos2){
        int hold = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = hold;
    }
}
