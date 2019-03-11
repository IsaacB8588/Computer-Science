
/**
 * Finds the maximum value of an array.
 * 
 * @author Isaac Blandin
 * @version December 18, 2018
 */
import java.util.Arrays;
public class ArrayMax
{
    public static void main(){
        int[] num = new int[10];
        //fill with random numbers up from 0 to 49
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 50);
        }
        boolean first = true;
        int max = 0;
        for (int numbers:num){
            if(first){
                max = numbers;
                first = false;
            } else {
                if(numbers > max){
                    max = numbers;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println(Arrays.toString(num));
    }
}
