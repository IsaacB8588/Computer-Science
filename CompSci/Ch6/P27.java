
/**
 * merges two array lists
 * 
 * @author Isaac Blandin 
 * @version March 9, 2019
 */
import java.util.ArrayList;
public class P27
{
    public static void main(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(merge(a,b));
    }
    
    public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
       ArrayList<Integer> c = new ArrayList<Integer>();
       boolean onA = true;
       int aPos = 0;
       int bPos = 0;
       for(int i = 0; i < a.size() + b.size(); i++){
           if(onA){
               if(aPos < a.size()){
                   c.add(a.get(aPos));
                   aPos++;
               } else{
                   c.add(b.get(bPos));
                   bPos++;
               }
               onA = false;
           } else {
               if(bPos < b.size()){
                   c.add(b.get(bPos));
                   bPos++;
               } else{
                   c.add(a.get(aPos));
                   aPos++;
               }
               onA = true;
           }
       }
       return c;
    }
}
