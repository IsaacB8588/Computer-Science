
/**
 * counts the vowels in a given word (a, i, e, o, u, y)
 * 
 * @author Isaac Blandin
 * @version October 17, 2018
 */
import java.util.Scanner;
public class P10
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String word = "";
        int count = 0;
        boolean valid = false;
        
        //ask for word
        while(!valid){
            System.out.print("Enter a word: ");
            if(in.hasNext()){
                word = in.next();
                valid = true;
            }
        }
        //go through each letter of the word
        for(int i = 0; i < word.length(); i++){
            //check if letter is vowel
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y'){
                count++;
            } 
       
        }
        //print the number of vowels
        System.out.println("There are " + count + " vowels in " + word);
    }
}
