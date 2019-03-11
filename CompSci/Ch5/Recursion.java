
/**
 * Write a description of class Recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recursion
{
    public static void main(){
        int number = 16;
        Example(number);
    }
    
    public static int addFour(int num){
        if(num < 20){
            num = 1 + addFour(num + 4);
        }
        return num;
    }
    
    public static void Example(int num) {
        
        System.out.println(num);
        if(num > -9){
            Example(num - 5);
        }
        
    }
}
