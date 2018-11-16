
/**
 * Prints the powers of 2 from 2^0 to 2^20
 * 
 * @author Isaac Blandin 
 * @version October 17, 2018
 */
public class P13
{
    public static void main(){
        for(int i = 0; i <= 20; i++){
            System.out.println((int)Math.pow(2, i));
        }
    }
}
