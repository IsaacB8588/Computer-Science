
/**
 * Takes a 9 character code from the user and defines whether than opens the 
 * left or right sliding doors in a minivan
 * 
 * @author Isaac Blandin & Cameron Lee
 * @version September 26, 2018
 */
import java.util.Scanner;
public class P38
{
    public static void main(){
    
        Scanner in = new Scanner(System.in);
        
        //declare variables
        String input;
        boolean parked = false;
        boolean locked = false;
        boolean childLock = false;
        
        boolean rightOpen = false;
        boolean leftOpen = false;
        
        //input should be in order of  dash board switch left then right, child lock, master lock, left inside handle, 
        //right inside handle, left outside handle, right outside handle, gear
        System.out.print("enter code: ");
        input = in.next();
        //check for a length of 9
        if(input.length() == 9){
            //check if gear is in park
            if (input.substring(8).equals("P")){
                parked = true;
                //check if master lock is on
                if (input.substring(3,4).equals("1")){
                    locked = true;
                    System.out.println("Both doors closed");
                } else {
                    //check if dash buttons or outside handles are pulled
                    if(input.substring(0,1).equals("1") || input.substring(6,7).equals("1")){
                        leftOpen = true;
                    }
                    if(input.substring(1,2).equals("1") || input.substring(7,8).equals("1")){
                        rightOpen = true;
                    }
                    //check if child lock is off
                    if(input.substring(2,3).equals("0")){
                        //check if inside handles are pulled
                        if(input.substring(4,5).equals("1")){
                            leftOpen = true;
                        }
                        if(input.substring(5,6).equals("1")){
                            rightOpen = true;
                        }
                    }
                    
                    if(rightOpen){
                        System.out.println("right door open");
                    }
                    if(leftOpen){
                        System.out.println("left door open");
                    }
                    if(!leftOpen && !rightOpen){
                        System.out.println("Both doors closed");
                    }
                }
            } else {
                System.out.println("Both doors closed");
            }
            
        } else {
            System.out.println("not a valid input");
        }
    }
}
