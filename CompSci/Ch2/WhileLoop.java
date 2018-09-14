
/**
 * Write a description of class While Loop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.BigInteger;
public class WhileLoop
{
   public static void main(){
       BigInteger num = new BigInteger("1");
       BigInteger base = new BigInteger("0");
       BigInteger two = new BigInteger("2");
       
       while(num != base){
           System.out.println(num);
           num = num.multiply(BigInteger.valueOf(2));
       }
   }
}
