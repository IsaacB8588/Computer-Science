
/**
 * returns a given string reapeated a given number of times
 * 
 * @author Isaac Blandin
 * @version November 6, 2018
 */
import java.util.Scanner;
public class P5
{
    public static void main (){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String str = in.next();
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        
        System.out.println(repeat(str, num));
    }
    
    //method to return a repetition of a given string
    public static String repeat (String str, int n){
        String rep = "";
        //add the string to a new string for the given number
        for(int i = 0; i < n; i ++){
            rep += str;
        }
        //return repeated string
        return rep;
    }
}
