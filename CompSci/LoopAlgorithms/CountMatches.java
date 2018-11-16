
/**
 * Finds how many times a given 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CountMatches
{
    public static void main(){
        String word = "independence";
        int count = 0;
        for(int i = 0; i < word.length(); i ++){
            if(word.charAt(i) == 'e'){
                count ++;
            }
        }
        System.out.println("there are " + count + " e's in " + word);
    }
}
