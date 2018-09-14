
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Test extends MathCheat
{
   public void main(){
       Scanner in = new Scanner(System.in);
       System.out.print("Diamter: ");
       double diameter = in.nextDouble();
       double circumfrence = getCircumfrence(diameter);
       System.out.println(circumfrence);
    }
}
