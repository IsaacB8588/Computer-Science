
/**
 * combines and sorts two array lists least to greatest
 * 
 * @author Isaac Blandin 
 * @version march 9, 2019
 */
import java.util.ArrayList;
public class P28
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
        System.out.println(mergeSorted(a,b));
    }
    
    public static ArrayList<Integer> mergeSorted (ArrayList<Integer> a, ArrayList<Integer> b){
       ArrayList<Integer> c = new ArrayList<Integer>();
       for(int i = 0; i < b.size(); i++){
           a.add(b.get(i));
       }
       while(a.size() > 0){
           int smallest = 0;
           boolean first = true;
           for(int i = 0; i < a.size(); i++){
               if(first){
                   smallest = i;
                   first = false;
               } else {
                   if(a.get(i) < a.get(smallest)){
                       smallest = i;
                   }
               }
           }
           c.add(a.get(smallest));
           a.remove(smallest);
       }
       
       return c;
    }
}
