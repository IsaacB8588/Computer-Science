
/**
 * appends two array lists into one
 * 
 * @author Isaac Blandin 
 * @version March 9, 2019
 */
import java.util.ArrayList;
public class P26
{
   public static void main(){
       //testing method
       ArrayList<Integer> a = new ArrayList<Integer>();
       ArrayList<Integer> b = new ArrayList<Integer>();
       a.add(1);
       a.add(2);
       b.add(3);
       b.add(4);
       System.out.println(append(a, b));
   }
   
   public static ArrayList<Integer> append (ArrayList<Integer> a, ArrayList<Integer> b){
       for(int i = 0; i < b.size(); i++){
           a.add(b.get(i));
       }
       return a;
   }
}
