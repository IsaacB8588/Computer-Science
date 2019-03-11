
/**
 * Recursive Method which determines the number of digits in an integer
 * 
 * @author isaac Blandin
 * @version December 4, 2018
 */
public class P18
{
   public static void main(){
    
   }
   
   public static int digits(int n){
       int ret = 0;
       if(n > 10){
           ret ++;
           ret += digits(n / 10);
       } else {
           ret ++;
       }
       return ret;
   }
}
