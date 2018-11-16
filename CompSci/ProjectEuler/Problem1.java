
/**
 * Finds the sum of all of the factors of 3 and 5 under 1000
 * 
 * @author Isaac Blandin 
 * @version October 4, 2018
 */
public class Problem1
{
    public static void main(){
        int sum = 0;
        int count = 1;
        //run until number reaches 1000
        while (count < 1000){
            
            //add number to sum if it is a product of 5 or 3
            if(count % 5 == 0 || count % 3 == 0){
                sum += count;
            }
            
             // increase count by one
             count++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
