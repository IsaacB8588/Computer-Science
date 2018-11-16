
/**
 * Write a description of class FirstMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstMatch
{
    public static void main(){
        String word = "independence";
        int position = 0;
        boolean found = false;
        while (!found && position < word.length()){
            position ++;
            if(word.charAt(position - 1) == 'e'){
                found = true;
                position --;
            }
            
        }
        if(found){
            System.out.println("the first match is at position " + position);
        } else {
            System.out.println("not found");
        }
    }
}
