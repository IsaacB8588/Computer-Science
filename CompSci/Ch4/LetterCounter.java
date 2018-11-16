
/**
 * Write a description of class LetterCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class LetterCounter
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Word: ");
        String word = in.next();
        
        System.out.print("Enter Letter: ");
        String letter = in.next();
        char let = letter.charAt(0);
        
        int count = 0;
        
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == let){
                count++;
            }
        }
        
        System.out.println("There are " + count + " " + let + "'s in the word " + word);
    }
}
