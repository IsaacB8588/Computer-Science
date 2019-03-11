
/**
 * Searches for a value in an Array
 * 
 * @author Isaac Blandin
 * @version December 18, 2018
 */
import java.util.Arrays;
public class ArraySearch
{
    public static void main(){
        int[] num = new int[20];
        //fill with random numbers up from 0 to 49
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 10);
        }
        int keyTerm = 7;
        int pos = -1;
        boolean found = false;
        int i = 0;
        while(i < num.length && !found){
            if(!found && num[i] == keyTerm){
                pos = i;
                found = true;
            }
            i++;
        }
        System.out.println(Arrays.toString(num));
        System.out.println("Position of " + keyTerm + " : " + pos);
    }
}
