
/**
 * Prints a multiplication table up to 10x10 = 100
 * 
 * @author Isaac Blandin 
 * @version October 25, 2018
 */
public class P19
{
    public static void main(){
        int fact1 = 1;
        int fact2 = 1;
        int product = 1;
        int count = 0;
        boolean reached = false;
        
        System.out.println();
        while (!reached){
            System.out.print(product + " ");
            if(product == 100){
                reached = true;
            }
            count ++;
            if(count == 10){
                System.out.println();
                fact1++;
                fact2 = 0;
                count = 0;
            }
            fact2 ++;
            product = fact1 * fact2;
            
            }
        }
    }

