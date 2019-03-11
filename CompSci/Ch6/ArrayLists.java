
/**
 * Write a description of class ArrayLists here.
 * 
 * @author Isaac Blandin 
 * @version January 15, 2019
 */
import java.util.ArrayList;

public class ArrayLists
{
    public static void main(){
        //Constructor
        ArrayList<String> roster = new ArrayList<String>();
        //add data
        roster.add("Tanner");
        roster.add("Clayten");
        roster.add("Cam");
        roster.add("Isaac");
        roster.add("Kerr");
        roster.add("Emilie");
        //remove data
        roster.remove(2);
        //edit data
        roster.set(0, "Naeve");
        roster.set(1, "Moore");
        //add into middle of data
        roster.add(3, "Hinkle");
        
        System.out.println(roster.get(0));
        System.out.println(roster.size());
    }
}
