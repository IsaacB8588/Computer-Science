
/**
 * Average Out of an Array
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class ArrayOperators
{
   public static void main(){
       Scanner in = new Scanner(System.in);
       int[] distance = new int[250];
       int count = 0;
       System.out.print("Enter first distance: ");
       while(in.hasNextInt()){
           distance[count] = in.nextInt();
           count ++;
           System.out.print("Enter Next Distance: ");
       }
       System.out.println(Arrays.toString(distance));
       
       //removing a spot in an array
       int remove = 2;
       for(int i = remove; i < distance.length - 2; i++){
           distance[i] = distance[i+1];
       }
       System.out.println(Arrays.toString(distance));
      
       //inserting a spot in an array
       int insert = 56;
       int pos = 2;
       for(int i = distance.length - 1; i > pos; i --){
           distance[i] = distance[i -1];
       }
       distance[pos] = insert;
       System.out.println(Arrays.toString(distance));
       
       //swapping an element
       int hold = distance[0];
       distance[0] = distance[4];
       distance[4] = hold;
       System.out.println(Arrays.toString(distance));
       
       //copy a new array;
       int[] newDistance = new int[distance.length];
       for(int i = 0; i < distance.length; i++){
           newDistance[i] = distance[i];
       }
       System.out.println(Arrays.toString(newDistance));
   }
}
