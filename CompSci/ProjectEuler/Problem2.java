
/**
 * finds the sum of even-valued fiboncci numbers below 4 million
 * 
 * @author Isaac Blandin
 * @version October 4, 2018
 */
public class Problem2
{
    public static void main(){
        int term1 = 1;
        int term2 = 2;
        int currentTerm = 0;
        int sum = 2;
        
        while (currentTerm < 4000000){
            
            //add the term if it is even
            if(currentTerm % 2 == 0){
                    sum += currentTerm;
            }
           
            //create the next terms
            currentTerm = term1 + term2;
            term1 = term2;
            term2 = currentTerm;
            

        }
        System.out.println("Sum is " + sum);
        
   
    }
}
