
/**
 * method that determines whether a string is a palindrome or not
 * 
 * @author Isaac Blandin 
 * @version December 4, 2018
 */
public class P16
{
    public static void main(){
        
    }
    
    public static boolean isPalindrome(String str){
        int len = str.length();
        
        if(str.substring(0,1).equals( str.substring(len - 1, len))){
            if(len == 3 || len == 2){
                return true;
            }
            String newStr = str.substring(1, len - 1);
            if(isPalindrome(newStr)){
                return true;
            }
        }
        
        return false;
    }
}
