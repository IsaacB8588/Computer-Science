
/**
 * Finds the greatest prime factor in a number
 * 
 * @author Isaac Blandin
 * @version October 8, 2018
 */
public class Problem3
{
    public static void main(){
        long currentCount = 600851475143L;
        int div = 3;
        
        //create first prime factor
        while (currentCount % div != 0){
            div++;
        }
        
        //reduce down to nect prime factor 
        while (currentCount % div == 0 && currentCount/div != 1){
            currentCount /= div;
            while(currentCount % div != 0){
                div ++;
            }
        }
        System.out.println("the largest prime number is " + currentCount);
    }
}
