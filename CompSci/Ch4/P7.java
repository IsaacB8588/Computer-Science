
/**
 * Randomly Switches Two Letters within a word.  
 * 
 * @author Isaac Blandin
 * @version October 29, 2018
 */
import java.util.Scanner;
public class P7
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        int i = 1;
        int j = 1;
        
        
        System.out.print("Enter a word: ");
        String word = in.next();
        int length = word.length();
        
        //randomly picks two positions
        do{
            i = (int)(Math.random() * length);
        } while (i == length - 1);
        do{
            j = (int)(Math.random() * length);
        } while (i >= j);
        
        //rearrange the word
        if(i != 0){
            System.out.print(word.substring(0,i));
        }
        System.out.print(word.charAt(j));
        if(j != i + 1){
            System.out.print(word.substring(i + 1, j));
        }
        System.out.print(word.charAt(i));
        if(j != length - 1){
            System.out.print(word.substring(j + 1));
        }
        System.out.println();

        
        
    }
}
