
/**
 * prints a number as Roman Numerals
 * 
 * @author Isaac Blandin
 * @version December 4, 2018
 */
import java.util.Scanner;
public class P21
{
    public static void main(){
        Scanner in = new Scanner(System.in);
  
        System.out.print("Enter Number less that 3999: ");
        int num = in.nextInt();
        
        printRoman(num);
          
    }
            
        
    public static void printRoman(int n){
        System.out.print(romanDigit((n / 1000), "M", "null", "null"));
        System.out.print(romanDigit((n / 100) % 10, "C", "D", "M"));
        System.out.print(romanDigit((n / 10) % 10, "X", "L", "C"));
        System.out.println(romanDigit(n % 10, "I", "V", "X"));
    }
    
    public static String romanDigit(int n, String one, String five, String ten){
        String ret = "";
        if(n == 9){
            ret += one + ten;
        } else if (n == 4){
            ret += one + five;
        } else {
            while(n > 0){
                if(n >= 5){
                    ret += five;
                    n -= 5;
                }
                if(n > 0){
                    ret += one;
                    n -= 1;
                }
            }
        }
        return ret;
        
    }
}
