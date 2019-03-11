
/**
 * Method which creates the reverse of an array
 * 
 * @author Isaac Blandin
 * @version December 20
 */
import java.util.Arrays;
public class P7
{
    public static void main(){
        int[] nums = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        System.out.println(Arrays.toString(nums));
        reverse(nums);
        System.out.println(Arrays.toString(nums));
        
    }
    
    public static void reverse(int[] array){
        int runs = array.length/2;
        for(int i = 0; i < runs; i ++){
            int hold = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = hold;
        }
    }
}
