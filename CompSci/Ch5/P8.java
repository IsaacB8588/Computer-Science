
/**
 * Scrambles the characters besides the first and last of a word
 * 
 * @author Isaac Blandin 
 * @version November 14 2018
 */
import java.util.Scanner;
public class P8
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        boolean stopRequested = false;
        while (!stopRequested){
            System.out.println("Enter Word to Be Scrambled, Enter Number to Exit: ");
            if(in.hasNextInt()){
                stopRequested = true;
            } else {
                String word = in.next();
                System.out.println(scramble(word));
            }
        }
    }
    
    public static String scramble (String word) {
        int length = word.length();
        
        int pos1 = (int)((Math.random() * (length - 2)) + 1);
        int pos2 = pos1;
        while(pos2 == pos1){
            pos2 = (int)((Math.random() * (length - 2)) + 1);
        }
        
        String ret = "";

        for(int i = 0; i < length; i ++){
            if(i == pos1){
                ret += word.charAt(pos2);
            } else if (i == pos2){
                ret += word.charAt(pos1);
            } else {
                ret += word.charAt(i);
            }
        }
        return ret;
    }
}
